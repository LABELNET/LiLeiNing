package hpu.edu.lileining.dao.model;

import java.util.List;

/**
 * 服装拓展类
 * 包括：衣服的尺寸，大小
 */
public class ClothesVo extends Clothes{

    private String cateContent;//分类内容
    private List<Sizes> sizes; //尺寸数量

    public String getCateContent() {
        return cateContent;
    }

    public void setCateContent(String cateContent) {
        this.cateContent = cateContent;
    }

    public List<Sizes> getSizes() {
        return sizes;
    }

    public void setSizes(List<Sizes> sizes) {
        this.sizes = sizes;
    }
}
