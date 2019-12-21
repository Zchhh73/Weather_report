package com.example.cool_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 使用Serialized注解让JSON和Java之间建立关系
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }


}
