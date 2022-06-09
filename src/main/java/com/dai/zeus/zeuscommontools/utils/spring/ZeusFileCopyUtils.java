package com.dai.zeus.zeuscommontools.utils.spring;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ZeusFileCopyUtils {
    @Test
    public void test1() throws IOException {
        ClassPathResource resource = new ClassPathResource("files/1.txt");
        EncodedResource encodedResource = new EncodedResource(resource, StandardCharsets.UTF_8);

        String targetPath = "D:\\Projects\\JavaProjects\\zeus-commonTools\\src\\main\\resources\\files\\2.txt";
        FileCopyUtils.copy(encodedResource.getInputStream(), new FileOutputStream(targetPath));
    }
}
