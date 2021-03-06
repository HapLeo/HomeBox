package com.hapleow.homebox.file.enumeration;

/**
 * 对文件进行分组的类型
 * @author wuyulin
 * @date 2020/7/14
 */
public enum GroupStrategy {

    /**
     * 单文件夹
     */
    SINGLE_DIR,

    /**
     * 年
     */
    DATE_FORMAT_YYYY,

    /**
     * 年-月
     */
    DATE_FORMAT_YYYY_MM,

    /**
     * 年-月-日
     */
    DATE_FORMAT_YYYY_MM_DD;



}
