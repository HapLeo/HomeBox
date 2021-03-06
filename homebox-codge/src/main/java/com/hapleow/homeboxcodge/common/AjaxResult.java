package com.hapleow.homeboxcodge.common;

import lombok.Data;

/**
 * Rest结果集
 *
 * @author wuyulin
 * @date 2020/7/17
 */
@Data
public class AjaxResult {

    private Integer code;

    private String msg;

    private Object data;

    private static final Integer ERROR = 500;
    private static final Integer SUCCESS = 200;

    public AjaxResult() {
    }

    private AjaxResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 操作成功
     *
     * @return
     */
    public static AjaxResult success() {

        return new AjaxResult(SUCCESS, "操作成功", null);
    }

    /**
     * 操作成功：指定数据
     *
     * @param data
     * @return
     */
    public static AjaxResult success(Object data) {

        return new AjaxResult(SUCCESS, "操作成功", data);
    }
}
