import java.sql.*;

/**
 * Created by 04385145 on 04.05.2018.
 */

/*Создать небольшую базу данных. Таблица «Студенты» с полями id, фамилия, балл ).
        Написать тесты для проверки корректности добавления, обновления и чтения записей.
        Следует учесть, что в базе есть заранее добавленные записи, и после проведения тестов эти
        они не должны быть удалены, изменены или добавлены вновь.*/

public class BD implements IConstants{

    // результат
    public ResultSet rs;

    // показать весь результат
    public void showRs()
    {
        try {
            while (rs.next())
            {
                System.out.println(  rs.getString( 1 ) + " " + rs.getString( 2 ) + " " + rs.getString( 3 ));
            }
            ;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public String selectCount (String rez)
    {
        String Result = "";
        try {
            Connection co2 = con();
            PreparedStatement ps=co2.prepareStatement(SelectCount);
            ps.setString(1,rez);
            rs=ps.executeQuery();
            Result=rs.getString(2);
            showRs();


        } catch (Exception e) {
            e.printStackTrace();
        }
       return Result;
    }

    public String addTable (String sirname, int mark)
    {
        try {
            Connection co2 = con();
            PreparedStatement ps=co2.prepareStatement(AddTable);
            ps.setString(1,sirname);
            ps.setInt(2,mark);
            ps.executeUpdate();
            //  ps.setInt(2,3);
            co2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        selectTable();
        return sirname;

    }


    public String updateTable (String sirname, int mark, String sirname2)
    {
        try {
            Connection co2 = con();
            PreparedStatement ps=co2.prepareStatement(UpdateTable);
            ps.setString(1,sirname);
            ps.setInt(2,mark);
            ps.setString(3,sirname2);
            ps.executeUpdate();
            //  ps.setInt(2,3);
            co2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        selectTable();
        return sirname;

    }

    public void selectTable () {

        try {
            Connection co3 = con();
            Statement st = co3.createStatement();
            rs=st.executeQuery(SelectTable);
            showRs();
            co3.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public void createBDThread ()

    {

        Thread Thr1 = new Thread(
               () ->  createBD(1) );

        Thread Thr2 = new Thread(
                () ->  createBD(2) );

        Thr1.start();
        //Thr2.start();

    }

    // метод соединения с БД
    public Connection con()
    {
        Connection co = null;
        try {
            Class.forName("org.sqlite.JDBC");
            co = DriverManager.getConnection("jdbc:sqlite:tovar.db");
            System.out.println("Connected to BD");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return co;
    }

    // метод создания БД - синхронизированный
    public synchronized void createBD(int i)
    {
        System.out.println("Поток " + i +"  стартовал");
        try {
            Connection co = con();
            //-------------------
            Statement create = co.createStatement();
            create.executeUpdate(CreatTable);
            create.executeUpdate(InsertTable);
            rs = create.executeQuery(SelectTable);
            showRs();
            System.out.println("Поток " + i +"  завершен");
            co.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void bd ()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:tovar.db");

            System.out.println("Connected");

            Statement select = co.createStatement();
            ResultSet rs = select.executeQuery("Select * from tovar");
            while (rs.next())
            {
                 System.out.println( rs.getString( 1 ) + " " + rs.getString( 2 ) + " " + rs.getString( 3 ));
            }




        } catch ( Exception e) {
            e.printStackTrace();
        }

    }

}
