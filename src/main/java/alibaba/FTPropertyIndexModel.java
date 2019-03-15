package alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 2019-3-12 16:50
 */
public class FTPropertyIndexModel extends BaseRowModel {

    /**
     * 在方特工作履历
     */
    @ExcelProperty(value = {"姓名"}, index = 0)
    private String name;

    @ExcelProperty(value = {"方特起始时间"}, index = 1)
    private String ftStart;

    @ExcelProperty(value = {"方特结束时间"}, index = 2)
    private String ftEnd;

    @ExcelProperty(value = {"就业中心"}, index = 3)
    private String ftWhere;

    @ExcelProperty(value = {"本公司部门"}, index = 4)
    private String ftDepartment;

    @ExcelProperty(value = {"本公司职务"}, index = 5)
    private String ftPosition;

    @ExcelProperty(value = {"证明人"}, index = 6)
    private String ftProved;

    @ExcelProperty(value = {"调走原因"}, index = 7)
    private String transferReason;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFtStart() {
        return ftStart;
    }

    public void setFtStart(String ftStart) {
        this.ftStart = ftStart;
    }

    public String getFtEnd() {
        return ftEnd;
    }

    public void setFtEnd(String ftEnd) {
        this.ftEnd = ftEnd;
    }

    public String getFtWhere() {
        return ftWhere;
    }

    public void setFtWhere(String ftWhere) {
        this.ftWhere = ftWhere;
    }

    public String getFtDepartment() {
        return ftDepartment;
    }

    public void setFtDepartment(String ftDepartment) {
        this.ftDepartment = ftDepartment;
    }

    public String getFtPosition() {
        return ftPosition;
    }

    public void setFtPosition(String ftPosition) {
        this.ftPosition = ftPosition;
    }

    public String getFtProved() {
        return ftProved;
    }

    public void setFtProved(String ftProved) {
        this.ftProved = ftProved;
    }

    public String getTransferReason() {
        return transferReason;
    }

    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason;
    }
}
