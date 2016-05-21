package colthestest;


import hpu.edu.lileining.dao.clothes.ClothesMapper;
import hpu.edu.lileining.dao.model.Clothes;
import hpu.edu.lileining.dao.model.ClothesVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ClothesTest {

    private final String APPLIACTION_CONTEXT_LOCATION="classpath:spring/applicationContext-dao.xml";

    private ApplicationContext applicationContext;
    private ClothesMapper clothesMapper;

    @Before
    public void setUp(){
        applicationContext= new ClassPathXmlApplicationContext(APPLIACTION_CONTEXT_LOCATION);
        clothesMapper= (ClothesMapper) applicationContext.getBean("clothesMapper");
    }

    @Test
    public void getClothesListTest(){
        List<ClothesVo> clothesList = clothesMapper.getClothesList(0, 10);
        for (ClothesVo vo:clothesList){
            System.out.println(vo.toString());
        }

    }

    @Test
    public void getClothesJianTest(){
        List<Clothes> clothesList = clothesMapper.getClothesJian();
        for (Clothes vo:clothesList){
            System.out.println(vo.toString());
        }
    }

}
