import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Количество раз, которое нужно запустить блокнот
        int numberOfRuns = 10;

        // Интервал в миллисекундах между запусками
        long intervalInMillis = 5000; // 5 секунд

        for (int i = 0; i < numberOfRuns; i++) {
            try {
                // Запуск процесса блокнота
                Process process = Runtime.getRuntime().exec("notepad.exe");
                System.out.println("Запущен блокнот #" + (i + 1));

                // Подождать интервал времени
                Thread.sleep(intervalInMillis);

                // Закрыть блокнот
                process.destroy();
                System.out.println("Закрыт блокнот #" + (i + 1));
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
