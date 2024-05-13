package com.example.rjany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
//        model.addAttribute("student", new Student());
        return "student_greeting";
    }

    @GetMapping("/studentstable")
    public String students_table(Model model) {
     //   model.addAttribute("student", new Student());
        return "students_table";
    }

    @GetMapping("/studentdelete")
    public String student_delete(Model model) {
        //   model.addAttribute("student", new Student());
        return "student_delete";
    }

    @GetMapping("/studentupdate")
    public String student_update(Model model) {
//        model.addAttribute("student", new Student());
        return "student_update";
    }

    @GetMapping("/studentedit")
    public String student_edit(Model model) {
//        model.addAttribute("student", new Student());
        return "student_edit";
    }

    @GetMapping("/fetchstudent")
    public String fetch_student(Model model) {
//        model.addAttribute("student", new Student());
        return "fetch_student";
    }

    @GetMapping("/tutorialpage")
    public String tutorial_page(Model model) {
//        model.addAttribute("student", new Student());
        return "tutorial_page";
    }

    @RequestMapping("/")
    public @ResponseBody String homePage(){
        return "Welcome to home Page";
    }

}