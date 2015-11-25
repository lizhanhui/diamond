package com.taobao.diamond.manager;

/**
 * Created by diwayou on 2015/11/18.
 */
public abstract class SkipInitialCallbackListener implements ManagerListener {

    protected String data;

    public SkipInitialCallbackListener(String data) {
        this.data = data;
    }

    public abstract void receiveConfigInfo0(String data);

    @Override
    public void receiveConfigInfo(String configInfo) {
        receiveConfigInfo0(configInfo);
    }
}
