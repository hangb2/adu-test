package com.adu.utils;

import java.util.List;

import javax.xml.bind.JAXBException;

import org.codehaus.jackson.io.JsonStringEncoder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adu.bean.JsonBean;
import com.adu.model.MyPerson;

/**
 * @author: yunjie.du
 * @date: 2015/7/17 18:44
 */
public class JsonUtilTest {
    private String json;
    private static final Logger logger = LoggerFactory.getLogger(JsonUtilTest.class);

    @Test
    public void string2Object() throws JAXBException {
        JsonBean res = JsonUtil.toObject(json, JsonBean.class);
        logger.info(res.toString());
    }

    @Test
    public void toObject() {
        String json = "{\"name\":\"adu\",\"age\":20}";
        MyPerson res = JsonUtil.toObject(json, MyPerson.class);
        logger.info("res={}", res);
    }

    @Test
    public void toObject1() {
        String str = "[\"{\\\"messageId\\\":\\\"170313.092528.192.168.56.76.22448.1184916\\\","
                + "\\\"subject\\\":\\\"hotel.qta.order.core.sendsms.subject\\\","
                + "\\\"attrs\\\":{\\\"qmq_expireTime\\\":1489454728023,\\\"ORDER_ID\\\":101109862517,"
                + "\\\"qmq_appCode\\\":\\\"h_qta_orderbooking\\\",\\\"hotel.qta.order.core.sendsms"
                + ".key\\\":\\\"{\\\\\\\"appId\\\\\\\":null,\\\\\\\"orderNo\\\\\\\":101109862517,"
                + "\\\\\\\"command\\\\\\\":\\\\\\\"USER_CONFIRMED\\\\\\\","
                + "\\\\\\\"phone\\\\\\\":\\\\\\\"150y=l_3936\\\\\\\",\\\\\\\"emailAddress\\\\\\\":null,"
                + "\\\\\\\"forbidFilter\\\\\\\":false,\\\\\\\"param\\\\\\\":null,\\\\\\\"resendOrder\\\\\\\":false,"
                + "\\\\\\\"userSms\\\\\\\":true}\\\",\\\"qmq_createTIme\\\":1489368328023,"
                + "\\\"qmq_spanId\\\":\\\"1.11.1.2.1.1.1.25.1.3.1\\\",\\\"VERSION\\\":18,"
                + "\\\"COMMAND\\\":\\\"USER_CONFIRMED\\\","
                + "\\\"qmq_traceId\\\":\\\"qta-order-confirmq_170313.092527.192.168.52.229.2845.777638_1\\\","
                + "\\\"qmq_reliabilityLevel\\\":\\\"High\\\"},\\\"reliabilityLevel\\\":\\\"High\\\","
                + "\\\"createdTime\\\":\\\"2017-03-13 09:25:28\\\",\\\"expiredTime\\\":\\\"2017-03-14 "
                + "09:25:28\\\"}\"]";
        char[] res = JsonStringEncoder.getInstance().quoteAsString(str);
        logger.info("res={}", res);
    }

    @Test
    public void prettyFormat() {
        // json = "{\"name\":\"adu\",\"age\":20}";
        String res = JsonUtil.prettyFormat(json);
        logger.info("res={}", res);
    }

    @Before
    public void init() {
        json = "{\n" + "    \"ResultCode\": 0,\n" + "    \"Students\": [{\n" + "        \"id\": 1,\n"
                + "        \"name\": \"zhangsan\",\n" + "        \"age\": 20\n" + "    },\n" + "    {\n"
                + "        \"id\": 2,\n" + "        \"name\": \"lisi\",\n" + "        \"age\": 18\n" + "    }]\n" + "}";
    }
}
