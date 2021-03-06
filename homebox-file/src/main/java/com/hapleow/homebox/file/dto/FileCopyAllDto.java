package com.hapleow.homebox.file.dto;

import com.hapleow.homebox.file.enumeration.GroupStrategy;
import com.hapleow.homebox.file.enumeration.StorageStrategy;
import lombok.Data;

/**
 * @author wuyulin
 * @date 2020/7/14
 */
@Data
public class FileCopyAllDto {

    /**
     * 源目录
     */
    private String fromPath;

    /**
     * 目标目录
     */
    private String toPath;

    /**
     * 分组策略
     */
    private GroupStrategy groupStrategy;

    /**
     * 保存策略
     */
    private StorageStrategy storageStrategy;

}
