package alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 2019-3-12 16:22
 */
public class WorkPropertyIndexModel extends BaseRowModel {

    /**
     * 过往工作经历相关内容
     */
    @ExcelProperty(value = {"姓名"}, index = 0)
    private String name;

    @ExcelProperty(value = {"工作起始时间"}, index = 1)
    private String workStart;

    @ExcelProperty(value = {"工作结束时间"}, index = 2)
    private String workEnd;

    @ExcelProperty(value = {"单位名称（含方特）"}, index = 3)
    private String workWhere;

    @ExcelProperty(value = {"部门"}, index = 4)
    private String workDepartment;

    @ExcelProperty(value = {"职务"}, index = 5)
    private String workPosition;

    @ExcelProperty(value = {"电话"}, index = 6)
    private String workTel;

    @ExcelProperty(value = {"离职原因"}, index = 7)
    private String leaveReason;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkStart() {
        return workStart;
    }

    public void setWorkStart(String workStart) {
        this.workStart = workStart;
    }

    public String getWorkEnd() {
        return workEnd;
    }

    public void setWorkEnd(String workEnd) {
        this.workEnd = workEnd;
    }

    public String getWorkWhere() {
        return workWhere;
    }

    public void setWorkWhere(String workWhere) {
        this.workWhere = workWhere;
    }

    public String getWorkDepartment() {
        return workDepartment;
    }

    public void setWorkDepartment(String workDepartment) {
        this.workDepartment = workDepartment;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }
}
