package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan({"com.service","com.controller"})
@MapperScan("com.dao")
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.url}")
    private String url;

    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setPassword(password);
        druidDataSource.setUsername(username);
        druidDataSource.setUrl(url);
        return druidDataSource;
    }
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        //
        sqlSessionFactoryBean.setPlugins(pageInterceptor());
        //
        PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resourcePatternResolver.getResources("classpath:mappers/**/*.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);

        sqlSessionFactoryBean.setConfiguration(getConfiguration());
        return sqlSessionFactoryBean.getObject();
    }

    private PageInterceptor pageInterceptor(){
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.put("supportMethodsArguments", "true");
        properties.put("reasonable", "true");
        pageInterceptor.setProperties(properties);
        return  pageInterceptor;
    }
    private org.apache.ibatis.session.Configuration getConfiguration(){
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLogImpl(StdOutImpl.class);
        configuration.setMapUnderscoreToCamelCase(true);
        return configuration;
    }
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }

    //mvc

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/views/");
        return viewResolver;
    }
    //拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration interceptorRegistry =   registry.addInterceptor(new FirstInterceptor());
//        interceptorRegistry.addPathPatterns("/**");
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        ResourceHandlerRegistration registration
                = registry.addResourceHandler("/static/**");
        registration.addResourceLocations("classpath:/static/");
    }

}
