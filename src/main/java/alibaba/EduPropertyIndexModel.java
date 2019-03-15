package alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 2019-3-12 15:48
 */
public class EduPropertyIndexModel extends BaseRowModel {


    /**
     * 教育经历相关内容
     */
    @ExcelProperty(value = {"姓名"}, index = 0)
    private String name;

    @ExcelProperty(value = {"教育起始时间"}, index = 0)
    private String eduStart;

    @ExcelProperty(value = {"教育结束时间"}, index =1)
    private String eduEnd;

    @ExcelProperty(value = {"机构名称"}, index = 2)
    private String eduName;

    @ExcelProperty(value = {"专业或证书"}, index = 3)
    private String eduMajor;

    @ExcelProperty(value = {"教育经历证明人"}, index = 4)
    private String eduProved;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEduStart() {
        return eduStart;
    }

    public void setEduStart(String eduStart) {
        this.eduStart = eduStart;
    }

    public String getEduEnd() {
        return eduEnd;
    }

    public void setEduEnd(String eduEnd) {
        this.eduEnd = eduEnd;
    }

    public String getEduName() {
        return eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName;
    }

    public String getEduMajor() {
        return eduMajor;
    }

    public void setEduMajor(String eduMajor) {
        this.eduMajor = eduMajor;
    }

    public String getEduProved() {
        return eduProved;
    }

    public void setEduProved(String eduProved) {
        this.eduProved = eduProved;
    }
}
