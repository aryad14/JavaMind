public class QuestionProvider {

    Questions[] q = new Questions[3];
    String[] selection = new String[3];

    public QuestionProvider() {
        q[0] = new Questions(
                1,
                "What is the capital of India?",
                new String[] { "Delhi", "Mumbai", "Kolkata", "Chennai" },
                "Delhi");
        q[1] = new Questions(
                2,
                "What is the capital of France?",
                new String[] { "Paris", "London", "Berlin", "Madrid" },
                "Paris");
        q[2] = new Questions(
                3,
                "What is the capital of Japan?",
                new String[] { "Tokyo", "Beijing", "Seoul", "Bangkok" },
                "Tokyo");
    }

    public void getQuestions() {
        for (Questions question : q) {
            System.out.println(question);
        }
    }

    public void playQuiz() {
        int score=0;
        for (Questions question: q) {
            System.out.println("Question " + question.getId() + ": " + question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Enter your answer: ");
            String userAnswer = System.console().readLine();

            if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
}
