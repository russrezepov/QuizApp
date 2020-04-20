package com.russrezepov.quizapp;

public class Questions {

    public String mQuestions[] = {
            "Name the first planet in the Solar System",
            "Name the second planet in the Solar System",
            "Name the third planet in the Solar System",
            "Name the fourth planet in the Solar System",
            "Name the fifth planet in the Solar System",
            "Name the sixth planet in the Solar System",
            "Name the seventh planet in the Solar System",
            "Name the eighth planet in the Solar System",
            "Name the ninth planet in the Solar System"
    };

    private String mChoices[][] = {
            { "Mercury", "Venus", "Mars", "Saturn" },
            { "Jupiter", "Venus", "Earth", "Neptune" },
            { "Earth", "Jupiter", "Pluto", "Venus" },
            { "Jupiter", "Saturn", "Mars", "Earth" },
            { "Jupiter", "Pluto", "Mercury", "Earth" },
            { "Uranus", "Venus", "Mars", "Saturn" },
            { "Saturn", "Pluto", "Uranus", "Earth" },
            { "Venus", "Neptune", "Pluto", "Mars" },
            { "Mercury", "Venus", "Mars", "Pluto" },

    };

    private String mCorrectAnswers[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }
}
