package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@Controller
public class YoilTeller {
    @RequestMapping("/getYoil") // http://localhost:9090/getYoil?year=2021&month=10&day=1
    //    public static void main(String[] args) {
    public String main(@ModelAttribute MyDate myDate, Model model) throws IOException {

        char yoil = getYoil(myDate);

        return "yoil";

    }

    @ModelAttribute("yoil")
    private char getYoil(MyDate myDate){
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(myDate.getYear(), myDate.getMonth()-1, myDate.getDay());

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        char yoil = "일월화수목금토".charAt(dayOfWeek-1);

        return yoil;
    }
}