package dongxiaoyong.client;

import dongxiaoyong.service.impl.WeatherServiceImpl;
import dongxiaoyong.service.impl.WeatherServiceImplService;

/**
 * Create By dongxiaoyong on /2020/9/29
 * description:
 *
 * @author dongxiaoyong
 */
public class WeatherClient {
    public static void main(String[] args) {
        //1、创建服务
        WeatherServiceImplService service = new WeatherServiceImplService();
        //2、通过服务获取端口
        WeatherServiceImpl weatherServiceImpl = service.getPort(WeatherServiceImpl.class);
        //3、调用weatherServiceImpl中的天气方法
        String weatherStr = weatherServiceImpl.getWeather("北京");
        System.out.println(weatherStr);
    }
}
