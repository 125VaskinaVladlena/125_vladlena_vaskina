import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        // Выбрать из данного списка элементы, кратные k, но не кратные n
        // и сформировать из них новый список.
        // Вернуть новый список в качестве результата
        //arraylist уже дан
        ArrayList<Integer> newArraylist = new ArrayList<>(); //создаем новый список
        for (int i = 0; i < data.size() ; i++){ //i < длины списка data
            if ( data.get(i) % k == 0 && data.get(i) % n !=0) newArraylist.add(data.get(i)); //условие и get
        }
        return newArraylist;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        // сгенерировать и вернуть список размера size,
        // содержащий первые size элементов последовательности, описанной в
        // задаче subtask_2_for задания task_3
        //122333444455555666666
        //size - кол-во элементов в списке
        ArrayList<Integer> newList = new ArrayList<>();
        //int count = 0 создаем счетчик чисел в новом списке
        for(int i = 1; i <= size; i++) { //i начинаем с единицы, потому что 1223334444
            if (newList.size() < size) { //если размер нового списка меньше кол-ва элементов
                for (int count = 1; count <= i; count++) //запускаем новый луп, где count кол-во элементов i
                    if((newList.size() < size)) {
                        newList.add(i); //добавляем в список элемент i
                    }
            }
        }
        return newList;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите пересечение множеств s1 и s2
        HashSet<Integer> newSet = new HashSet<>(s1);
        newSet.retainAll(s2);
        return newSet;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите объединение множеств s1 и s2
        //просто сложить два множества, но так, чтобы одинаковые значания не записывались
        HashSet <Integer> newSet = new HashSet<>();
        newSet.addAll(s1);
        newSet.addAll(s2);
        return newSet;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите дополнение множества s1 до множества s2
        HashSet<Integer> newSet = new HashSet<>();
        newSet.addAll(s1);
        newSet.addAll(s2);
        newSet.removeAll(s1);

        return newSet;
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно
        //если один массив содержит элемент другого, то этот элемент не должен быть внесен
        //если этого элемента нету, то вносим i
        HashSet<Integer> newSet = new HashSet<>();
        for(Integer i : s1)
            if(s2.contains(i)) {
            }
            else
                newSet.add(i);

        for(Integer i : s2)
            if(s1.contains(i)) {
            }
            else
                newSet.add(i);

        return newSet;
    }


    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        //то есть есть какие то слова, которые повторяются n кол-во раз
        //чтобы получить процент нужно кол-во этих слов / 100
        HashMap<String, Double> newMap = new HashMap<>();
        //если элемент в строке всего 1, то 25%
        //если элемент всего один, то начинаем луп заново, но уже с другим элементомай
        int size=data.size();
        double frequency =  (100.0/size);
        newMap.put(data.get(0), frequency);
        for(int i = 1; i < size; i++) {
            if (newMap.containsKey(data.get(i))) { //если есть такой ключ то + %%
                newMap.replace(data.get(i), newMap.get(data.get(i))+frequency);
            }else {
                newMap.put(data.get(i), frequency);
            }
        }
        return  newMap;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        HashMap <String, Double> newMap = new HashMap<>();
        double summa = 0;
        double max = data.get(0); //допустим, что максимум равен первому элменту списка
        double min = data.get(0); //допустим, что минимум равен первому элементу списка
        double mean;//допустим, что среднее значение равно 0
        //mean = сумма элементов списка / на его длину
        //mean = сумма элементов списка / data.size()
        for (int j = 0; j < data.size(); j++)  summa = summa + data.get(j);
        mean = summa / data.size();
        for (int i = 0; i < data.size(); i++){
            if (max < data.get(i)){
                max = data.get(i);
            }
            if (min > data.get(i)){
                min = data.get(i);
            }
        }
        newMap.put("mean", mean );
        newMap.put("max", max);
        newMap.put("min", min);
        return newMap;
    }
}