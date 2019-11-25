package com.stylefeng.guns.rest.modular.vo;

/**
 * Created by hufangzhou on 2019/11/25.
 */
public class ResponseVO<M> {
    //返回状态 0成功 1业务失败 999系统异常
    private int status;
    private String msg;
    private M data;
    private ResponseVO(){}
    public static<M> ResponseVO success(M m){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setStatus(0);
        responseVO.setData(m);
        return responseVO;
    }

    public static<M> ResponseVO success(String msg){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setStatus(0);
        responseVO.setMsg(msg);
        return responseVO;
    }
    public static<M> ResponseVO serviceFail(String msg){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setStatus(1);
        responseVO.setMsg(msg);
        return responseVO;
    }
    public static<M> ResponseVO appFail(String msg){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setStatus(999);
        responseVO.setMsg(msg);
        return responseVO;
    }

    public int getStatus() {
        return status;
    }

    public ResponseVO<M> setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResponseVO<M> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public M getData() {
        return data;
    }

    public ResponseVO<M> setData(M data) {
        this.data = data;
        return this;
    }
}
