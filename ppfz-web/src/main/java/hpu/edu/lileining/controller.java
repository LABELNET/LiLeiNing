package hpu.edu.lileining;


import com.alibaba.fastjson.JSON;
import hpu.edu.lileining.dao.clothes.ClothesMapper;
import hpu.edu.lileining.dao.model.Clothes;
import hpu.edu.lileining.dao.model.ClothesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 品牌服装接口控制器
 */
@Controller
@RequestMapping("/api")
public class controller {

    private final String API_INDEX_PAGE="api/index";
    private final int ALL_PAGR_NUM=20;

    @Autowired
    protected ClothesMapper clothesMapper;

    @RequestMapping("/index")
    public String index(){
        return API_INDEX_PAGE;
    }

    /**
     * 分页加载服装数据
     * p : 当前页数
     */
    @RequestMapping("getClothesIfo")
    public @ResponseBody String  getClothesIfo(@RequestParam Integer p){
        if(p<0){
            p=1;
        }
        p=ALL_PAGR_NUM*(p-1);
        List<ClothesVo> clothesList = clothesMapper.getClothesList(p, ALL_PAGR_NUM);
        if(clothesList==null){
            clothesList=new ArrayList<ClothesVo>();
        }
        return toStr(clothesList);
    }

    /**
     * 主页最新3条数据
     * @return
     */
    @RequestMapping("getClothesTop")
    public @ResponseBody String getClothesTop(){
        List<Clothes> clothesJian = clothesMapper.getClothesJian();
       return toStr(clothesJian);
    }


    /**
     * 跨域，回调调用
     * @param o
     * @return
     */
    private String toStr(Object o){
        return "cp("+JSON.toJSONString(o)+")";
    }

}
