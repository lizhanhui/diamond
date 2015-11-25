package com.taobao.diamond.client;

import com.taobao.diamond.domain.ConfigInfoEx;

import java.util.List;

/**
 * Created by diwayou on 2015/11/18.
 */
public class BatchHttpResult {

    private boolean success;

    private int statusCode;

    private List<ConfigInfoEx> result;

    public BatchHttpResult(List<ConfigInfoEx> result) {
        this.result = result;
        this.success = true;
    }

    public BatchHttpResult(int statusCode) {
        this.statusCode = statusCode;
        this.success = false;
    }

    public BatchHttpResult(boolean success, int statusCode, List<ConfigInfoEx> result) {
        this.success = success;
        this.statusCode = statusCode;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public List<ConfigInfoEx> getResult() {
        return result;
    }

    public void setResult(List<ConfigInfoEx> result) {
        this.result = result;
    }
}
