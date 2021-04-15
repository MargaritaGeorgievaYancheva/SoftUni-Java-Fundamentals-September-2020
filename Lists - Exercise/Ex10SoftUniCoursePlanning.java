package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> courses = Arrays.stream(sc.nextLine().split(", "))
                .collect(Collectors.toList());
        String command = sc.nextLine();
        while (!command.equals("course start")) {
            String[] partOfCommand = command.split(":");
            String typeOfCommand = partOfCommand[0];
            switch (typeOfCommand) {
                case "Add":
                    String titleToAdd = partOfCommand[1];
                    if (!courses.contains(titleToAdd)) {
                        courses.add(titleToAdd);
                    }
                    break;
                case "Insert":
                    String titleToInsert = partOfCommand[1];
                    int indexToInsert = Integer.parseInt(partOfCommand[2]);
                    if (isValid(indexToInsert, courses)) {
                        if (!courses.contains(titleToInsert)) {
                            courses.add(indexToInsert, titleToInsert);
                        }
                    }
                    break;
                case "Remove":
                    String titleToRemove = partOfCommand[1];
                    if(courses.contains(titleToRemove)){
                        int indexToRemove=courses.indexOf(titleToRemove);
                        if(courses.get(indexToRemove+1).indexOf('-')!=-1){
                            courses.remove(indexToRemove+1);
                            courses.remove(indexToRemove);
                        }else {
                            courses.remove(indexToRemove);
                        }

                    }

                    break;
                case "Swap":
                    String oldLessonsTitle = partOfCommand[1];
                    String newLessonsTitle = partOfCommand[2];
                    if (courses.contains(oldLessonsTitle) && courses.contains(newLessonsTitle)) {
                        int indexOfOld = courses.indexOf(oldLessonsTitle);
                        int indexOfNew = courses.indexOf(newLessonsTitle);
                        courses.set(indexOfOld, newLessonsTitle);
                        courses.set(indexOfNew, oldLessonsTitle);
                    }
                    break;
                case "Exercise":
                    String lessonTitle = partOfCommand[1];
                    if (courses.contains(lessonTitle)) {
                        int index = courses.indexOf(lessonTitle);
                        String result = courses.get(index);
                        if (lessonTitle.length() == result.length()) {
                            courses.add(index+1, lessonTitle + "-Exercise");
                        }
                    } else {
                        courses.add(lessonTitle);
                        courses.add(lessonTitle + "-Exercise");

                    }
                    break;

            }
            command = sc.nextLine();
        }
        printCourses(courses);

    }

    private static void printCourses(List<String> courses) {

        for (int i = 0; i < courses.size(); i++) {
            int index = i;
            System.out.printf("%d.%s%n", (++index), courses.get(i));
        }
    }

    private static boolean isValid(int position, List<String> courses) {
        if (position < 0 || position >= courses.size()) {
            return false;
        } else {
            return true;
        }
    }

}
