package com.controller.be;

import com.controller.uploadanddownload.Upload;
import com.entity.SongSheetEntity;
import com.service.SongSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

@Controller
@RequestMapping("/be/songsheet")
public class SongSheetComtroller {
    @Autowired
    private SongSheetService songSheetService;
    @RequestMapping("/select")
    @ResponseBody
    public List<SongSheetEntity> select(){
        return songSheetService.getAll();
    }
    @RequestMapping("/delete")
    public String delete(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("ssid"));
        songSheetService.delete(id);
        return "redirect:/songsheet/index";
    }
    @RequestMapping("/insert")
    public String insert(SongSheetEntity songSheetEntity,MultipartFile simgAddress){
        System.out.println("simgAddress = " + simgAddress.getOriginalFilename());
        upload(simgAddress);
        songSheetService.insert(songSheetEntity);
        return "redirect:/songsheet/index";
    }

    public static final String FILE_DIRECTORY = "D:\\workstace\\wuyou-music\\wuyou-music-controller\\src\\main\\resources\\static\\images\\song_sheet";
    public String upload(MultipartFile file){
        System.out.println("file = " + file);
        String filename = file.getOriginalFilename();
        String path = FILE_DIRECTORY + File.separator + filename;
        File file1 = new File(path);
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
    @RequestMapping("/update")
    @ResponseBody
    public String udpate(SongSheetEntity songSheetEntity,MultipartFile simgAddress) throws IOException {
        System.out.println("simg_address = " + simgAddress.getOriginalFilename());
        songSheetService.update(songSheetEntity);
        return "redirect:/songsheet/index";
    }
}
