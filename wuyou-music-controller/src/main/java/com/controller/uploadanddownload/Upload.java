package com.controller.uploadanddownload;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class Upload {
    public static final String FILE_DIRECTORY = "/static/images/song_sheet";
    public void upload(MultipartFile file){
        String directory = FILE_DIRECTORY;
        String filename = file.getOriginalFilename();
        String path = directory + File.separator + filename;
        File file1 = new File(path);
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
