package hpu.edu.lileining.dao.clothes;


import hpu.edu.lileining.dao.model.Clothes;
import hpu.edu.lileining.dao.model.ClothesVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 服装 mapper
 */
public interface ClothesMapper {


    /**
     * 分页查询服装列表
     * @param start
     * @param num
     * @return
     */
    List<ClothesVo> getClothesList(@Param("start") Integer start,@Param("num") Integer num);

    /**
     * 获取最新的三条数据
     * @return
     */
    List<Clothes> getClothesJian();

}
