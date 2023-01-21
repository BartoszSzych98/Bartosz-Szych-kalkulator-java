package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text", PoemBeautifier::addABC);
        poemBeautifier.beautify("text", PoemBeautifier::upperText);
        poemBeautifier.beautify("Text", PoemBeautifier::firstTwo);
        poemBeautifier.beautify("Text", PoemBeautifier::spaceBetween);

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(10);

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.of(1998, 03, 18)))
                .filter(forumUser -> forumUser.getNumberOfposts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        for (Map.Entry entry : theResultMapOfUsers.entrySet()) {
            System.out.println( entry);
        }

    }
}
