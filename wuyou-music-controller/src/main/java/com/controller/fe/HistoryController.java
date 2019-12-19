package com.controller.fe;

import com.entity.HistoryEntity;
import com.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HistoryController {
    @Autowired
    private HistoryService historyService;

    @RequestMapping("/playpages")
    public String playRecoreds(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("slid"));
        historyService.playRecoredsTx(id);
        return "fe/playpages/playpages";
    }
    @RequestMapping("/playrecoreds/select")
    @ResponseBody
    public List<HistoryEntity> select(
            @RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum,
            @RequestParam(value = "pageSize",defaultValue = "3",required = false)int pageSize){
        List<HistoryEntity> result = historyService.getAll(pageNum,pageSize);
        return result;

    }

}
