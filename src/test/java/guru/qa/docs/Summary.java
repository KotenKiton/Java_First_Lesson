
/*package guru.qa;


import java.sql.SQLOutput;

public class FirstApp { // НАЗВАНИЯ КЛАССОВ ВСЕГДА С БОЛЬШОЙ БУКВЫ
    public static void main(String[] args) {

         Всего есть  8 примитивных типов данных.
         У всех примитивных типов данных есть дефолтное значение.
         в момент обьявления переменной в ней уже хранится значение. В целых числах это 0
         В boolean это false. В числах с плавающей точкой это 0.0
          1 - тип данных - сhar(символьный) ( одинарные кавычки)
        char symbol, anotherSymbol; // все имена пишутся CamelCase.
        symbol = 'w'; // = В Java присвоение. )

         2 - тип данных - boolean( true или false) - по умолчанию FALSE
        boolean flag = false; // 8 (в массивах), 32 (не в массивах используется int) Только - True или False

        3,4,5,6- примитивные типы данных для работы с числами.
         В каждом можно хранить целые числа. Но разница сколько памяти в них хранится.
         8,16,32,64 бита это  сколько они занимают в памяти.
         int number; Обьявил,что переменная number соотетствует типу int. Она не проинициализированна.
        Инициализация переменной – присвоение переменной значения.
        int number = 3; переменная number  c типом int проинициализированна и ей присвоено значение 3

        byte aByte; // -128 ... 127 ( 8 бит) 0 - относиться к положительному диапазону. 2 в 7 степени это 128
        short aShort; // -32768 ... 32767  (16 бит) 2 в 15 степени это 32768
        int aInt; // от -2147483648 до 2147483647 ( 32 бита)
        long aLong; // от -9223372036854775808L до 9223372036854775807L (64 бита)

         Типы данных с плавающей точкой.
         С ними нельзя делать матемтатические опереации если важна ТОЧНОСТЬ.

        float aFloat;
        double aDouble;
         Низходящее преобразование типов - от int(от большего)  в байт( малое) ((ПРИМЕР)) Потеря точности.Опасно делать.
         Восходящее преобразование от байта( малого ) к short ( большому) Его делать безопасно.
         Класс - представление данных но более сложное.Структура связанных друг с другом данных.
         Пример: Рост вес Имя - можно сделать либо 3 переменных.
         Либо одну структуру данных типа "ЧЕЛОВЕК" внутри неё будут 3 переменных.
         Классы - специальная структура данных. ТИП ДАННЫХ как булет,байт и прочие.

        String aString = "Hello,qa.guru"; // единиственный случай создания обьекта без слова new
         String - КЛАСС  и ссылочный тип данных.Сложный тип данных.
         Белый цвет показывает,что он не примитивный.Всё,что в кавычках это строковый литерал.

        String aString0 = new String("Hello, qa.guru!"); // пример созадния обьекта через ключевое слово new
        //$("afar").click(); // Внутри реализцаии метода $ new уже указано. значение по умолчаню у обьекта NULL
        String aString1 = null;// когда обьявляю не примитивный тип данных это ссылка на место в памяти,где будет обьект
         По умолчанию она равна null ( пустота)

        Integer boxed = 1;//Боксикснг - примитивный тип int упаковался в Integer. Анбоксинг наоброт. на собесах есть!
         Массив - дополнительный тип данных,который позволяет хранить в переменной несколько данных одного и тогоже типа.
         Массив - ссыслочный тип данных

        char[] array = new char[]{'a', 'b', 'c'}; // array - ссылка на адрес памяти,где хранится массив.
         инициализация массива.
        char[][] array1 = new char[][]{{'a', 'b', 'c'}}; //двумерный массив

         void  ничего не возвращает (Метод)
         main тоже метод
         void означает, что метод не возвращает никаких данных.
         тест либо проходит либо нет возвращать ничего не надо. и в них метод всегда void.
            int maxValue = getMaxIntNumber();
            System.out.println(summ(3,7));// Я передал в метот АРГУМЕНТ ТРИ И СЕМЬ!
            System.out.println("Max value : " + maxValue);
    }

        static int summ(int first, int second) {
        return first + second;
        }

        static int getMaxIntNumber() {
          return Integer.MAX_VALUE;
    }   ОПЕРАТОРЫ:
        Арифметические:
        + - Сложение
        - - Вычитание
        * - умножение
        / - деление ( целочисленное)
        % - взятие остатка от деления

         Логические:
         & и (&&) - лучше использовать двойную запись ( более безопасный код)
         | или (||) - лучше использовать двойную запись ( более безопасный код)
         ! - Отрицание
         != - НЕ равно
         == - Равно
         instanceoff - проверяет является ли обьект нужным нам типом данных ( булевый)
         > - больше
         < - меньше
         >= - больше или равно
         < - меньше
         <= - меньше или равно
        ДЛЯ СРАВНЕНИЯ ОБЬЕКТОВ ИСПОЛЬЗУТЕСЯ МЕТОД EQAULS
         Switch Case - всегда можно заменить на if esle но if else не всегда можно заменить на switch case
         ПОМНИТЬ ПРО BRAKE
         IF ELSE МОЩНЕЕ!
           Тернарный оператор затрудняет чтение кода. Лучше использовать If else.
            Switch Case - всегда можно заменить на if esle но if else не всегда можно заменить на switch case!
}          Else if - может быть сколько угодно друг за другом.
*/