import com.beanlifecycle.annotation.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/beanlifecycle/annotation/Spring.xml");
        StudentDAO stuDao = context.getBean("studentDao", StudentDAO.class);
        stuDao.selectAllRows();
        stuDao.deleterec(1);
        stuDao.closConnection();

    }
}