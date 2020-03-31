package com.teamtreehouse;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Prompter prompter = new Prompter();
        String story = "Thanks __name__ for helping me out.  You are really a __adjective__ __noun__ and I owe you a __noun__.";
        Template tmpl = new Template(story);
        prompter.run(tmpl);
        List<String> fakeResults = Arrays.asList("friend", "talented", "java programmer", "high five");
    }
}
