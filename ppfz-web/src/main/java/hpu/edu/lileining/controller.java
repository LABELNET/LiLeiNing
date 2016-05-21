package hpu.edu.lileining;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 品牌服装接口控制器
 */
@Controller
@RequestMapping("/api")
public class controller {

    private final String API_INDEX_PAGE="api/index";

    @RequestMapping("/index")
    public String index(){
        return API_INDEX_PAGE;
    }

}
