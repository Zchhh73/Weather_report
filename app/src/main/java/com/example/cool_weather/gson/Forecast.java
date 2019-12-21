package com.example.cool_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 针对数组JSON，只需要定义出单日天气的实体类，在声明实体类引用的时候使用集合类型声明。
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
