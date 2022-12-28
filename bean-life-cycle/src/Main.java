import com.beanlifecycle.annotation.StudentDAO;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentDAO dao = new StudentDAO();
        dao.selectAllRows();
        dao.deleterec(20);
    }
}