public class QuestionProvider {

    Questions[] q = new Questions[3];

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
        System.out.println("Getting questions...");
    }
}
