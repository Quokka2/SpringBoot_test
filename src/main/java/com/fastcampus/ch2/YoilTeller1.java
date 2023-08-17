package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Calendar;

@Controller
public class YoilTeller1 {
    @RequestMapping("/Yoil") // http://localhost:9090/getYoil?year=2021&month=10&day=1
    //    public static void main(String[] args) {
    public ModelAndView main(int year,int month, int day) throws IOException {

        // 이런 경우는 별로 없는데 어쩔 수 없이 예외처리 때문에 model을 못쓸때 이렇게 직접 작성해준다.
        ModelAndView mv = new ModelAndView();
        mv.setViewName("yoilError");

        if (!isValid(year, month, day)) {
            return mv;
        }

        // 2. 처리
        Calendar cal = Calendar.getInstance();
        cal.clear();  // 모든 필드(날짜, 시간 등)을 초기화
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        char yoil = "일월화수목금토".charAt(dayOfWeek-1); // dayofWeek는 일요일:1, 월요일:2, ...

        mv.addObject("year", year);
        mv.addObject("month", month);
        mv.addObject("day", day);
        mv.addObject("yoil", yoil);
        mv.setViewName("yoil");

        return mv;
    }

    private boolean isValid(int year,int month, int day){
        return true;
    }
}