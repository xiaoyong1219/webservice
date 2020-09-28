package dongxiaoyong.service.impl;

import dongxiaoyong.service.WeatherService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Create By dongxiaoyong on /2020/9/28
 * description: WeatherService接口实现类
 *
 * @author dongxiaoyong
 */
@WebService
public class WeatherServiceImpl implements WeatherService {

    /**
     * 通过cityName获取天气
     *
     * @param cityName 城市名
     * @Author :dongxiaoyong
     * @Date : 2020/9/28 23:50
     * @return: java.lang.String 该城市天气情况
     */
    @Override
    @WebMethod(operationName = "getWeather")
    public @WebResult(name = "result")
    String queryWeather(@WebParam(name = "cityName") String cityName) {
        String myCityName = "北京";
        String weatherStrOne = "多云转晴，10~20°C，适宜户外运动！";
        String weatherStrTwo = "小雨转阴，8~17°C，不宜外出！";
        //为方便演示，所以做了简化
        if (myCityName.equals(cityName)) {
            return weatherStrOne;
        } else {
            return weatherStrTwo;
        }
    }
}
