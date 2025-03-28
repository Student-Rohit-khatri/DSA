package com.rohit.Graph;

import java.util.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.lang.*;
import java.io.*;

public class wordLadder {

    public static int wordLadderLength(String startWord, String targetWord, String[] wordList){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startWord,1));
        Set<String> st = new HashSet<String>();
        int len = wordList.length;

        for (int i = 0 ; i < len ; i++){
            st.add(wordList[i]);
        }

        st.remove(startWord);
        while (!q.isEmpty()){
            String word = q.peek().first;
            int step = q.peek().second;
            q.remove();

            if (word == targetWord){
                return step;
            }

            for (int i = 0 ;i < word.length() ; i++){

                for (char ch = 'a' ; ch <= 'z' ; ch++){
                  char replacedCharArray[] = word.toCharArray();
                  replacedCharArray[i] = ch;
                  String replacedWord = new String(replacedCharArray);
                  if (st.contains(replacedWord) == true){
                      q.add(new Pair(replacedWord,step+1));
                  }
                }
            }


        }

        return 0;

    }

    public static void main(String[] args) throws IOException{
        String startWord = "der", targetWord = "dfs";
        String[] wordList = {
                "des",
                "der",
                "dfr",
                "dgt",
                "dfs"
        };

        int ans = wordLadderLength(startWord, targetWord, wordList);

        System.out.print(ans);

    }

    static class Pair {
        String first;
        int second;

        Pair(String _first, int _second) {
            this.first = _first;
            this.second = _second;
        }
    }
}
