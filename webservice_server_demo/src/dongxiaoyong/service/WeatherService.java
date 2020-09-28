package dongxiaoyong.service;

/**
 * Create By dongxiaoyong on /2020/9/28
 * description: WeatherService接口类
 *
 * @author dongxiaoyong
 */
public interface WeatherService {

    /**
     * 通过cityName获取天气
     *
     * @param cityName 城市名
     * @Author :dongxiaoyong
     * @Date : 2020/9/28 23:50
     * @return: java.lang.String 该城市天气情况
     */

    String queryWeather(String cityName);
}
