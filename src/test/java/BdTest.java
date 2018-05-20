/**
 * Created by 04385145 on 14.05.2018.
Создать небольшую базу данных. Таблица «Студенты» с полями id, фамилия, балл ).
 Написать тесты для проверки корректности добавления, обновления и чтения записей.
 Следует учесть, что в базе есть заранее добавленные записи, и после проведения тестов эти
 они не должны быть удалены, изменены или добавлены вновь.
 */

import org.junit.*;
import org.junit.Before;
import org.junit.Test;

public class BdTest {


    private BD bd;

    @Before
    public void startTestBD()
    {
        bd = new BD();
    }

    // добавить
    @Test
    public void testAddCount()
    {
        Assert.assertEquals("Familiya1", bd.addTable("Familiya1",3));
    }

    // обновить
    @Test
    public void testUpdateCount()
    {
        Assert.assertEquals("Famileeeeee", bd.updateTable("Famileeeeee",6, "Familiya1"));
    }

    // показать
    @Test
    public void testShowCount()
    {
        Assert.assertEquals("Familiya1", bd.selectCount("Familiya1"));
    }

}
