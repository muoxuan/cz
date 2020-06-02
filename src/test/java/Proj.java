import com.moxuan.Proj.ProjApplication;
import com.moxuan.Proj.pojo.City;
import com.moxuan.Proj.service.CityServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjApplication.class)
public class Proj {


    @Test
    public void test(){
        CityServiceImpl cityDao = new CityServiceImpl();

        List<City> all = cityDao.findAllCity();
        for(City c : all){
            System.out.println(c);
        }
    }
}
