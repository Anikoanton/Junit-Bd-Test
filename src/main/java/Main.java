import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 04385145 on 07.03.2018.
 */
public class Main  {


/*
    public static void main(String[] args) {

      */
/*  int[] mm = {1, 1, 4};
        // int[] mm = {1, 3, 4, 5, 5, 4, 2, 1, 6, 5, 5};
        Boolean a = mas3 (mm);*//*


      BD bd = new BD();
     //   bd.createBDThread();

       bd.addTable("Laplandin2", 4);
        System.out.println("------------------------");
        bd.updateTable("Lapа", 8);
        System.out.println("------------------------");
       bd.selectCount("Petrov");

       // bd.bd();
    }
*/




    /*

3 *** Создать небольшую БД (таблица: студенты; поля: id, фамилия, балл). Написать тесты для проверки того, что при работе с базой корректно
добавляются, обновляются и читаются записи. Следует учесть что в базе есть заранее добавленные записи, и после проведения тестов эти записи
не должны быть удалены/изменены/добавлены.
*/

public String mas1 (int[] mas)

            /*
    1. Написать метод, которому в качестве аргумента передается не
    пустой одномерный целочисленный массив, метод должен вернуть новый массив, который получен путем вытаскивания элементов из исходного массива,
    идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, в противном случае в методе необходимо
    выбросить RuntimeException.

    Написать набор тестов для этого метода (варианта 3-4 входных данных)
    вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ] */

{
     new Thread(() -> System.out.println("Priv")).run();

      int[] m_ish = mas;
    int length = m_ish.length;
    int poz = 0;
    for (int i=length-1; i>=0; i--)
    {
        if (m_ish[i]==4) poz = i;

        }

    if (poz==0)
    {
        try {
// инициализация нового исключения и обработки ошибки.
            throw new RuntimeException("В массиве нет 4-ки!");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }



    int[] m_out = Arrays.copyOfRange(m_ish, poz+1, length);
    String s = Arrays.toString(m_out);
    System.out.println("Доп проверка - " + s);
    return s;

}

/*
2. Написать метод, который проверяет что массив состоит только из чисел 1 и 4. Если в массиве нет хоть одной 4 или 1, то метод вернет false;
*/

    public boolean mas3(int[] a)
    {
        boolean b=false;
        boolean b2=true;

       // проверка что только 1 и 4 в массиве
        for (int i1:a )
        {
            if ((i1 != 1) && (i1 !=4))
            {  b2=false;
            break;}
        }

        // проверка что  и 1 и 4 в массиве
        if (b2==true){
            for (int i : a) {

                if (i == 1) {

                    for (int j : a
                            ) {
                        if (j == 4) {
                            b = true;
                            break;
                        }
                    }
                }
            }}







     /*   String str = a.toString();
        List l = Arrays.asList(a.toString().toCharArray());
        boolean b= (l.equals("1")) && (l.equals("4"));*/
        return b;
    }
    public String mas4(String a)
    {return a;}


    public String mas3()
    {return "[ 1 7 ]";}

}
