package dongxiaoyong.server;

import dongxiaoyong.service.impl.WeatherServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Create By dongxiaoyong on /2020/9/28
 * description: weather服务器
 *
 * @author dongxiaoyong
 */
public class WeatherServer {
    public static void main(String[] args) {
        /**通过Endpoint.publish方法发布weather服务**/
        Endpoint.publish("http://127.0.0.1:8888/weather", new WeatherServiceImpl());
    }
}
