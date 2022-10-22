import java.util.Arrays;

public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        //то есть разница между первым и следующим членом d
        //первый - a0 второй - a0 + d
        int[] newArray = new int[size]; //создаем новый массив размера size
        newArray[0] = a0; //определяем, что первый элемент массива - а0
        for (int i = 1; i < size; i++) { //создаем луп
            newArray[i] = newArray[i - 1] + d; //каждый итый элемент массива равен предыдущему элементу
            //увеличенному на d
        }
        return newArray;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        //[0]= 1    [1]=1    [2]= [0] + [1] = 1+1 = 2    [3]= [2] + [1] + [0]= 2+1+1
        int summa = 1; //summa это 0 или первый элемент
        int[] myArray = new int[size];
        myArray[0] = 1;
        for (int i = 0; i < size; i++) {
            if (i <= 1) {
                myArray[i] = myArray[0]; //0 и 1 элементы равны 1
            }
            if (i >= 2) {
                //допустим, i равно 2 => 1 = 1 + 0 = 2
                summa = summa + myArray[i - 1];
                myArray[i] = summa; //проверяем: [2] = 2
            }
        }
        return myArray;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // [0]=0 [1]=1 [2]=1 [3]=2 [4]=3
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == 0) myArray[i] = 0; //сопоставляем с комментариями выше
            if (i == 1 || i == 2) myArray[i] = 1;
            if (i > 2) myArray[i] = myArray[i - 2] + myArray[i - 1];
        }
        return myArray;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        // Для данного массива вычислить максимальный элемент
        //максимальное значение то, когда data[i] самое большое число
        //если data[i] > максимума, то максимум = data от i
        //i всегда увеличивается
        int maxValue = data[0]; //допустим, что максимальный элемент равен дате от 0
        for (int i = 0; i < data.length; i++) {
            if (maxValue < data[i]) { //если максимум меньше,
                maxValue = data[i]; //то, максимум просто приравнивается к дате от i
            }
        }
        return maxValue;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        int maximum = data[1]; //допустим, что максимум равен дате от 1
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maximum && data[i] % k == 0)  //должны соблюстись условия
                maximum = data[i]; //максимум приравнивается к дате от i
        }
        return maximum;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.
        int[] myArray = new int[arr1.length + arr2.length]; //создаем новым массив
        int count = 0; //создаем счетчик номера элементов нового массива
        for (int i = 0; i < arr1.length; i++) {
            myArray[i] = arr1[i]; //вносим в новым массив числа с arr1
            count++;
        }
        for (int j = 0; j < arr2.length; j++) myArray[count++] = arr2[j]; //вносим в новый массив
        //числа с arr2, только эти числа будут идти после числе с первого массива

        Arrays.sort(myArray);
        return myArray;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        return null;
    }
}