package com.taobao.diamond.client;

import com.taobao.diamond.client.impl.DiamondEnv;
import com.taobao.diamond.domain.ConfigInfoEx;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by diwayou on 2015/11/25.
 */
public class DiamondEnvTest {

    private DiamondEnv diamondEnv;

    @Before
    public void before() {
        diamondEnv = new DiamondEnv();
    }

    @Test
    public void batchQueryTest() {
        BatchHttpResult result = diamondEnv.batchQuery(Arrays.asList("a", "aa"), null, 10000);

        if (result.isSuccess()) {
            List<ConfigInfoEx> configInfoExList = result.getResult();
            for (ConfigInfoEx configInfoEx : configInfoExList) {
                System.out.println(configInfoEx);
            }
        } else {
            System.out.println(result.getStatusCode());
        }
    }
}
