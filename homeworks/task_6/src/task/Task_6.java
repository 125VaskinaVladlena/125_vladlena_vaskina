package task;

public class Task_6 {
    public Class<Triangle> subtask_1_ClassProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: Triangle
         *   Смысл: Треугольник, задыннай длинами сторон
         *   Конструкторы:
         *       - с тремя аргументами double, обозначающими стороны
         *   Публичные методы:
         *       - double getA() - получение стороны A
         *       - double getB() - получение стороны B
         *       - double getC() - получение стороны C
         *       - bool isValid() - проверка возможности существования треуголь-
         *                          ника с заданными сторонами
         *       - double square() - вычисление площади треугольника
         *       - double perimeter() - вычисление перимера треугольника
         *   Дополнительно:
         *       - методы вычисления площади и периметра должны возвращать -1
         *         для некорректно заданного треугольника
         * ---------------------------------------------------------------------
         *   Набор private членов класса может быть произвольным.
         *   Все поля класса должны быть private
         *   Не должно быть публичных членов класса сверх списка из условия
         */

        return Triangle.class;
    }

    public Class<BattleUnit> subtask_2_ClassProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: BattleUnit
         *   Смысл: Боец на сетчатом плоском игровом поле
         *   Конструкторы:
         *      - принимающий в качестве аргументов силу, броню, здоровье и две
         *        координаты. Все аргументы целочисленные
         *   Публичные методы:
         *      - int getStrength() - получение силы
         *      - int getArmor() - получение брони
         *      - int getX() - получение координаты X
         *      - int getY() - получение координаты Y
         *      - int getHealth() - получение текущего уровня здоровья
         *      - void attacked(BattleUnit enemy) - атака юнитом enemy данного
         *                                          юнита
         *      - void moveUp() - перемещение вверх на одну клетку
         *      - void moveDown() - перемещение вниз на одну клетку
         *      - void moveLeft() - перемещение влево на одну клетку
         *      - void moveRight() - перемещение вправо на одну клетку
         *      - boolean isAlive() - проверка, жив ли юнит
         *   Дополнительно:
         *      - предполагается, что сила юнита неотрицательна
         *      - юнит жив, если его здоровье больше нуля
         *      - размер урона при атаке вычисляется по формуле:
         *        урон = сила_атакующего - броня_атакуемого
         *      - система координат:
         *        ось X - координата увеличивается слева-направо
         *        ось Y - координата увеличивается сверху-вниз
         *      - атака не может увеличить здоровье атакуемого
         *      - урон не может быть больше силы атакующего
         * ---------------------------------------------------------------------
         *   Набор private членов класса может быть произвольным.
         *   Все поля класса должны быть private
         *   Не должно быть публичных членов класса сверх списка из условия
         */

        return BattleUnit.class;
    }

    public Class<WebAddressParser> subtask_3_ClassProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: WebAddressParser
         *   Смысл: Синтаксический анализатор веб-адресов
         *   Конструкторы:
         *      - принимающий единственный аргумент - строку с некоторым адресом
         *   Публичные методы:
         *      - String getLogin() - возвращает логин
         *      - String getPassword() - возвращает пароль
         *      - String getScheme() - возвращает схему
         *      - boolean isValid() - является ли адрес корректным
         *      - String getHost() - возвращает хост
         *      - String getPort() - возвращает порт
         *      - String getUrl() - возвращает url-путь
         *      - HashMap<String, String> getParameters() - возвращает словарь
         *          параметров с их значениями
         *      - String getFragment() - возвращает якоро
         *   Дополнительно:
         *      - информация о структуре адреса тут
         *          https://ru.wikipedia.org/wiki/URL#Структура_URL
         *      - в случае, если адрес невалиден или некоторый элемент
         *        отсутствует, соответствующие методы возвращают пустой объект
         * ---------------------------------------------------------------------
         *   Набор private членов класса может быть произвольным.
         *   Все поля класса должны быть private
         *   Не должно быть публичных членов класса сверх списка из условия
         */

        return WebAddressParser.class;
    }
}