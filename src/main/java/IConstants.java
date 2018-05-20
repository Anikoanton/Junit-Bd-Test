/**
 * Created by 04385145 on 04.05.2018.
 * /*Создать небольшую базу данных. Таблица «Студенты» с полями id, фамилия, балл ).
 */
public interface IConstants {

    final public String CreatTable = "DROP TABLE IF EXISTS students; " +
            "CREATE TABLE students " +
            "( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "sirname VARCHAR(255), " +
            "ball INTEGER );";

    final public String InsertTable = "insert into students (sirname, ball) values ('Ivanov',4), ('Petrov',5), ('Sidorov',4);";

    final public String AddTable = "insert into students (sirname, ball) values (?,?);";

    final public String UpdateTable = "update students set sirname = ?, ball = ? where sirname = ?;";

    final public String SelectTable = "SELECT * FROM students;";

    final public String SelectCount = "SELECT * FROM students where sirname = ?;";
}
