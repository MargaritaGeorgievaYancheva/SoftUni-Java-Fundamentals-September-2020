package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex09PokemonDontGo {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> removedElements = new ArrayList<>();

        while (!numbers.isEmpty()) {
            int index = Integer.parseInt(read.readLine());
            if (index >= numbers.size()) {

                index= validateIndex(index, numbers);
                removeElements(numbers,removedElements,index);
                numbers.add(numbers.get(0));
            }else if (index < 0){

                index= validateIndex(index, numbers);
                removeElements(numbers,removedElements,index);
                numbers.add(0,numbers.get(numbers.size()-1));
            }
            else {
                removeElements(numbers,removedElements,index);
            }
        }
        System.out.println(removedElements.stream().mapToInt(e -> e).sum());
    }

    private static void removeElements(List<Integer> numbers, List<Integer> removedElements, int index) {

        int removedNum = numbers.get(index);
        removedElements.add(numbers.get(index));
        numbers.remove(index);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)<=removedNum){
                numbers.set(i,numbers.get(i)+removedNum);
            }else if (numbers.get(i)>=removedNum){
                numbers.set(i,numbers.get(i)-removedNum);
            }
        }

    }

    private static int validateIndex(int index, List<Integer> nums) {

        if (index < 0) {
            index=0;
        } else if (index >= nums.size()) {
            index=nums.size()-1;
        }
        return index;
    }
}
