    import java.util.Arrays;
    import java.util.Comparator;

public class Task_03 {

        public static void main(String[] args) {
            String[] array = {"Hello World", "Java is fun", "Programming is awesome"};
            Main1 utils = new Main1(array);

            // Вывод содержимого массива в начальном порядке
            System.out.println("Исходный массив: " + utils.arrayToString());

            // Сортировка массива в обратном порядке
            utils.sortReverseOrder();
            System.out.println("Массив в обратном порядке: " + utils.arrayToString());

            // Сортировка массива по количеству слов в строке
            utils.sortByWordCount();
            System.out.println("Массив, отсортированный по количеству слов: " + utils.arrayToString());
        }
    }

