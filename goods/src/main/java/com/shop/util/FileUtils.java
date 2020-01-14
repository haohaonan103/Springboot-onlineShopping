package com.shop.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUtils {
    public static boolean upload(MultipartFile file, String fileName, HttpServletRequest request){
        String realPath = request.getServletContext().getRealPath("/uploads/");
        File file1 = new File(realPath+"/"+fileName);
        if(!file1.getParentFile().exists()){
            //创建 :多级目录
            file1.mkdirs();
        }
        try {
            file.transferTo(file1);
            return true;
        } catch (IOException e) {
            return  false;
        }
    }
    public static String getNewName(MultipartFile file){
        String originalFilename = file.getOriginalFilename();
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
       return  (UUID.randomUUID().toString())+substring;
    }
}
