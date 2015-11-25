package com.taobao.diamond.server.controller;

import com.taobao.diamond.server.service.ConfigService;
import com.taobao.diamond.server.service.DiskService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by diwayou on 2015/11/25.
 */
public class BatchConfigServlet extends HttpServlet {

    private ConfigController configController;

    @Override
    public void init() throws ServletException {
        super.init();

        WebApplicationContext webApplicationContext =
                WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        ConfigService configService = (ConfigService) webApplicationContext.getBean("configService");
        DiskService diskService = (DiskService) webApplicationContext.getBean("diskService");
        configController = new ConfigController();
        this.configController.setConfigService(configService);
        this.configController.setDiskService(diskService);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String content = configController.batchQuery(request, response);

        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(content);
        response.getWriter().flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
