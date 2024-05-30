import java.util.Arrays;
import java.util.Comparator;

public class Main2 {

        private String[] array;

    public Main2(String[] array) {
        this.array = array;
    }

    // Вывод содержимого массива в строку через пробел
        public String arrayToString() {
            return String.join(" ", array);
        }

        // Сортировка массива в обратном порядке (без учета регистра) от z до a
        public void sortReverseOrder() {
            Arrays.sort(array, String.CASE_INSENSITIVE_ORDER.reversed());
        }

        // Сортировка массива по количеству слов в строке
        public void sortByWordCount() {
            Arrays.sort(array, Comparator.comparingInt(this::countWords));
        }

        // Метод для подсчета количества слов в строке
        private int countWords(String str) {
            return str.trim().split("\\s+").length;
        }
    }

