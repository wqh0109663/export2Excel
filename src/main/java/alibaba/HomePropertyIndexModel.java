package alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 2019-3-12 17:03
 */
public class HomePropertyIndexModel extends BaseRowModel {
    /**
     * 家庭关系
     */
    @ExcelProperty(value = {"姓名"}, index = 0)
    private String name;
    @ExcelProperty(value = {"家属名字"}, index = 1)
    private String relativeName;

    @ExcelProperty(value = {"家属关系"}, index = 2)
    private String relativeShip;

    @ExcelProperty(value = {"家属单位"}, index = 3)
    private String relativeWorkDepartment;

    @ExcelProperty(value = {"家属电话"}, index = 4)
    private String relativeTel;

    @ExcelProperty(value = {"户籍所在地"}, index = 5)
    private String relativeAddr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelativeName() {
        return relativeName;
    }

    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName;
    }

    public String getRelativeShip() {
        return relativeShip;
    }

    public void setRelativeShip(String relativeShip) {
        this.relativeShip = relativeShip;
    }

    public String getRelativeWorkDepartment() {
        return relativeWorkDepartment;
    }

    public void setRelativeWorkDepartment(String relativeWorkDepartment) {
        this.relativeWorkDepartment = relativeWorkDepartment;
    }

    public String getRelativeTel() {
        return relativeTel;
    }

    public void setRelativeTel(String relativeTel) {
        this.relativeTel = relativeTel;
    }

    public String getRelativeAddr() {
        return relativeAddr;
    }

    public void setRelativeAddr(String relativeAddr) {
        this.relativeAddr = relativeAddr;
    }
}
