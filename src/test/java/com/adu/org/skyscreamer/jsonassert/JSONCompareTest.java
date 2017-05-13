package com.adu.org.skyscreamer.jsonassert;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONCompareResult;

import com.adu.BaseTest;

/**
 * @author yunjie.du
 * @date 2017/3/1 18:11
 */
public class JSONCompareTest extends BaseTest {
    private String expected, actual;

    @Test
    public void compareJSON() throws JSONException {
        JSONCompareResult res = JSONCompare.compareJSON(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
        logRes(res);
    }

    @Before
    public void init() {
        expected = "[\"{\\\"messageId\\\":\\\"170313.092528.192.168.56.76.22448.1184916\\\",\\\"subject\\\":\\\"hotel" +
         ".qta.order.core.sendsms.subject\\\",\\\"attrs\\\":{\\\"qmq_expireTime\\\":1489454728023," +
          "\\\"ORDER_ID\\\":101109862517,\\\"qmq_appCode\\\":\\\"h_qta_orderbooking\\\",\\\"hotel.qta.order.core" +
           ".sendsms.key\\\":\\\"{\\\\\\\"appId\\\\\\\":null,\\\\\\\"orderNo\\\\\\\":101109862517," +
            "\\\\\\\"command\\\\\\\":\\\\\\\"USER_CONFIRMED\\\\\\\"," +
             "\\\\\\\"phone\\\\\\\":\\\\\\\"150y=l_3936\\\\\\\",\\\\\\\"emailAddress\\\\\\\":null," +
              "\\\\\\\"forbidFilter\\\\\\\":false,\\\\\\\"param\\\\\\\":null,\\\\\\\"resendOrder\\\\\\\":false," +
               "\\\\\\\"userSms\\\\\\\":true}\\\",\\\"qmq_createTIme\\\":1489368328023," +
                "\\\"qmq_spanId\\\":\\\"1.11.1.2.1.1.1.25.1.3.1\\\",\\\"VERSION\\\":18," +
                 "\\\"COMMAND\\\":\\\"USER_CONFIRMED\\\"," +
                  "\\\"qmq_traceId\\\":\\\"qta-order-confirmq_170313.092527.192.168.52.229.2845.777638_1\\\"," +
                   "\\\"qmq_reliabilityLevel\\\":\\\"High\\\"},\\\"reliabilityLevel\\\":\\\"High\\\"," +
                    "\\\"createdTime\\\":\\\"2017-03-13 09:25:28\\\",\\\"expiredTime\\\":\\\"2017-03-14 09:25:28\\\"}\"]";
        actual = "[\"{\\\"messageId\\\":\\\"170313.092528.192.168.56.76.22448.1184916\\\",\\\"subject\\\":\\\"hotel" +
         ".qta.order.core.sendsms.subject\\\",\\\"attrs\\\":{\\\"qmq_expireTime\\\":1489454728023," +
          "\\\"ORDER_ID\\\":101109862517,\\\"qmq_appCode\\\":\\\"h_qta_orderbooking\\\",\\\"hotel.qta.order.core" +
           ".sendsms.key\\\":\\\"{\\\\\\\"appId\\\\\\\":null,\\\\\\\"orderNo\\\\\\\":101109862517," +
            "\\\\\\\"command\\\\\\\":\\\\\\\"USER_CONFIRMED\\\\\\\"," +
             "\\\\\\\"phone\\\\\\\":\\\\\\\"150y=l_3936\\\\\\\",\\\\\\\"emailAddress\\\\\\\":null," +
              "\\\\\\\"forbidFilter\\\\\\\":false,\\\\\\\"param\\\\\\\":null,\\\\\\\"resendOrder\\\\\\\":false," +
               "\\\\\\\"userSms\\\\\\\":true}\\\",\\\"qmq_createTIme\\\":1489368328023," +
                "\\\"qmq_spanId\\\":\\\"1.11.1.2.1.1.1.25.1.3.1\\\",\\\"VERSION\\\":18," +
                 "\\\"COMMAND\\\":\\\"USER_CONFIRMED\\\"," +
                  "\\\"qmq_traceId\\\":\\\"qta-order-confirmq_170313.092527.192.168.52.229.2845.777638_1\\\"," +
                   "\\\"qmq_reliabilityLevel\\\":\\\"High\\\"},\\\"reliabilityLevel\\\":\\\"High\\\"," +
                    "\\\"createdTime\\\":\\\"2017-03-13 09:25:28\\\",\\\"expiredTime\\\":\\\"2017-03-14 09:25:28\\\"}\"]";
    }
}
