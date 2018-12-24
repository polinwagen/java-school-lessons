package ru.rzn.sbt.javaschool.basics;

import org.mockito.internal.matchers.Null;
import ru.rzn.sbt.javaschool.basics.utils.Logger;
import ru.rzn.sbt.javaschool.basics.utils.StringSupplier;

import java.util.Objects;

public class BasicsLesson {

    /**
     * Времена года.<br/>
     * <br/>
     * Получив месяц в формате "ЯНВАРЬ", "ФЕВРАЛЬ" и т.д., выведите время года, к которому он принадлежит
     * ("ЗИМА", "ВЕСНА", "ЛЕТО", "ОСЕНЬ"). Если время года определить не удаётся, верните строку "НЕТ ДАННЫХ"<br/>
     * Используйте switch, не создавайте новых переменных.<br/>
     * После прохождения тестов позовите преподавателя.
     */
    public String getSeason(String month) {
        String result = null;
        switch (month) {
            case "ДЕКАБРЬ":
            case "ЯНВАРЬ":
            case "ФЕВРАЛЬ":
                result = "ЗИМА";
                break;
            case "МАРТ":
            case "АПРЕЛЬ":
            case "МАЙ":
                result = "ВЕСНА";
                break;
            case "ИЮНЬ":
            case "ИЮЛЬ":
            case "АВГУСТ":
                result = "ЛЕТО";
                break;
            case "СЕНТЯБРЬ":
            case "ОКТЯБРЬ":
            case "НОЯБРЬ":
                result = "ОСЕНЬ";
                break;
            default:
                result = "НЕТ ДАННЫХ";
        }
        return result;
    }

    /**
     * X негритят.<br/>
     * <br/>
     * Получив количество негритят {@code x}, выведите в лог {@code log} обратный отсчёт:<br/>
     * <ul>
     * <li>10 little indians</li>
     * <li>9 little indians</li>
     * <li>...</li>
     * <li>2 little indians</li>
     * <li>1 little indian</li>
     * </ul>
     */
    public void xLittleIndians(int x, Logger log) {

        while (x > 0) {
            if (x == 1) {
                log.log(x + " little indian"); //https://habr.com/post/130195/   про логирование
                x--;
            } else {
                log.log(x + " little indians");
                x--;
            }
        }
    }

    /**
     * Всё в лог.<br/>
     * <br/>
     * Сервис {@link StringSupplier} предоставляет строки в ответ на вызов метода {@link StringSupplier#next()}.
     * Если у него есть ещё строка, то он отвечает {@code true} на вызов метода {@link StringSupplier#hasNext()},
     * если строки кончились - ответит {@code false}.<br/>
     * Получите от сервиса все строки и отправьте их в лог.
     */
    public void logEverything(StringSupplier supplier, Logger log) {
        String NewStr = null;
        boolean IsNext = supplier.hasNext();

        while (IsNext == true) {
            log.log(supplier.next());
            IsNext = supplier.hasNext();
        }
    }

    /**
     * Устами младенца.<br/>
     * <br/>
     * Малыши "не выговаливают" букву Р. Сделайте для робота малыша метод, который получив слово, заменит в нём все
     * буквы Р на Л.
     */
    public String littleKid(String word) {
        String result = null;
        result = word.replace('Р', 'Л');
        return result;
    }

    /**
     * Первый раз в первый класс.<br/>
     * <br/>
     * Создайте в этом пакете ({@link ru.rzn.sbt.javaschool.basics}) новый класс с именем LethalWeapon.<br/>
     * Класс должен содержать:
     * <ul>
     * <li>публичное строковое поле color</li>
     * <li>приватное поле {@code roundsLeft} типа {@code int} без методов чтения и записи</li>
     * <li>приватное поле {@code power типа} {@code Double} с методами чтения и записи</li>
     * <li>публичный void-метод {@code reload}, принимающий {@code int} - количество зарядов и увеличивающий
     * {@code roundsLeft} на эту величину</li>
     * <li>публичный void-метод pewPew без параметров, уменьшающий значение {@code roundsLeft} на 2</li>
     * <li>публичный конструктор без параметров</li>
     * <li>публичный конструктор, принимающий параметры для всех полей в алфавитном порядке их имён</li>
     * </ul>
     * Создайте объект нового класса, проинициализировав все его поля и верните его из метода {@link #newClass()}.<br/>
     */


    public Object newClass() {
        Object  o = new LethalWeapon("white", 7.77, 15);
        return o;

    }

    /**
     * Добавьте в класс LethalWeapon серийные номера.<br />
     * <br />
     * Создайте приватное статическое целочисленное ({@code long}) поле nextSerial = 0.<br />
     * Создайте приватное финальное целочисленное ({@code long}) поле serial с методом чтения.<br />
     * В конструкторах обеспечьте корректное проставление серийных номеров.<br />
     */
    public void serial() {
    }

    /**
     * Реализуйте метод equals() у класса LethalWeapon. Сравните цвет, мощность и заряд. Серийный номер роли не играет.
     */
    public void equalsContract() {

    }

    /**
     * Получив некоторую строку, получите из нее подстроку со 2-го символа по символ "S",
     * приведите все символы в верхний регистр и верните результат.
     *
     * @param input
     * @return
     */
    public String stringExercise1(String input) {

        int index = input.indexOf('S');
        String sub = input.substring(2, index + 1).toUpperCase();
        return sub;
    }

    /**
     * Получив некоторую строку, найдите длину строки, количество запятых, количество дефисов,
     * индекс первого символа "R", индекс последнего символа "L" и количество пробелолв между словами.
     * Верните результат перемножения всех полученных чисел.
     *
     * @param input
     * @return
     */

    public int stringExercise2(String input) {

        int length = input.length();
        int comma = 0;
        int hyphen = 0;
        int space = 0;
        int result;
        int firstletter = 0;
        int lastletter = 0;

        String str = input;
        char[] strToArray = str.toCharArray(); //разложили на символы
        String[] words = input.split("\\s"); //разложили на слова

        for (int i = 0; i <= length - 1; i++) {

            char letter = strToArray[i];

            switch (letter) {
                case ',':
                    comma++;
                    break;
                case '-':
                    hyphen++;
                    break;

            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            if ((words[i].equals("") == false) && (words[i + 1].equals("") == false))  //сомнительная проверка конечно,но смысл в том ,что мы проверяем что вырезали пробелы именно между строк
                space++;                                                             //проверям ,что соседний элемент не пустой,поскольку пустоты образуются походу ,если пробел был в вначале
                                                                                    // не ну можно было проверять посимвольно ,но почему бы не сделать так)))))
        }

        firstletter = input.indexOf("R");
        lastletter = input.lastIndexOf("L");


        result = length * comma * hyphen * firstletter * lastletter * space;

        return result;
    }

    /**
     * Получив некоторую строку выполните следующее:<br />
     * 1. если в строке 3 слова и есть слово "Hello", верните новую строку, содержащую первое и последнее слова (без лишних пробелов).<br />
     * 2. если в строке 2 слова и есть слово "Hello", инвертируйте порядок символов в ней и верните результат.<br />
     * 3. если в строке 3 слова и есть слово "Goodbye", верните новую строку, содержащую первое и последнее слова (без лишних пробелов),
     * если в конце есть восклицательный знак - уберите его, если нет - добавьте.<br />
     * 4. если в строке 2 слова и есть слово "Goodbye", поменяйте слова местами (между словами в новой строке тоже должен быть пробел, лишних пробелов быть не должно),
     * сделайте все буквы в нижнем регистре и верните результат.
     *
     * @param input
     * @return
     */
    public String stringExercise3(String input) {
        String buffer = input;
        buffer = buffer.trim(); //убрали вначале пробелчики
        String[] words = buffer.split("\\s");


        if (words.length == 3) {
            for (int i = 0; i <= words.length; i++) {
                if (words[i].equals("Hello")) {
                    input = words[0] +' '+ words[2];
                    return input;
                } else {
                    if (words[i].equals("Goodbye")) {
                        if (words[2].contains("!")) {
                            input = words[0] +' '+ words[2].replace("!", "");
                            return input;
                        } else {
                            input = words[0] +' '+ words[2] + '!';
                            return input;

                        }
                    }
                }
            }
        }

        if (words.length == 2) {
            for (int i = 0; i <= words.length; i++) {
                if (words[i].equals("Hello")) {
                    String reversedString = new StringBuffer(buffer).reverse().toString();
                    input = reversedString;
                    return input;
                } else {
                    if (words[i].equals("Goodbye")) {
                        input = (words[1] +' '+ words[0]).toLowerCase();
                        return input;
                    }
                }
            }
        }

            return input;
        }

    }



