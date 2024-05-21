package com.assignment.a4;
import java.util.Stack;

import static com.assignment.a4.PostfixEvaluation.evaluatePostfix;
import static com.assignment.a4.PrefixEvaluation.evaluatePrefix;

public class postfixprefixeval {

    public static void main(String[] args) {
        String expression = "231*+9-";
        System.out.println("Postfix Evaluation: " + evaluatePostfix(expression));

            String expression2 = "-+*23*549";
            System.out.println("Prefix Evaluation: " + evaluatePrefix(expression2));

    }


}
