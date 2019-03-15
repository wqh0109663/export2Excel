package alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * 个人信息登记表
 *
 * @author 吴启欢
 * @version 1.0
 * @date 2019-3-11 15:53
 */
public class MultiLineHeadExcelModel extends BaseRowModel {

    @ExcelProperty(value = {"姓名", "姓名", "姓名"}, index = 0)
    private String name;

    @ExcelProperty(value = {"性别", "性别", "性别"}, index = 1)
    private String gender;

    @ExcelProperty(value = {"出生年月", "出生年月", "出生年月"}, index = 2)
    private String birth;

    @ExcelProperty(value = {"专业", "专业", "专业"}, index = 3)
    private String major;

    @ExcelProperty(value = {"学历", "学历", "学历"}, index = 4)
    private String degree;

    @ExcelProperty(value = {"学位", "学位", "学位"}, index = 5)
    private String position;

    @ExcelProperty(value = {"民族", "民族", "民族"}, index = 6)
    private String nation;

    @ExcelProperty(value = {"婚否", "婚否", "婚否"}, index = 7)
    private String marrage;

    @ExcelProperty(value = {"健康状态", "健康状态", "健康状态"}, index = 8)
    private String health;

    @ExcelProperty(value = {"身高", "身高", "身高"}, index = 9)
    private String height;

    @ExcelProperty(value = {"户籍地址", "户籍地址", "户籍地址"}, index = 10)
    private String addr;

    @ExcelProperty(value = {"联系电话", "联系电话", "联系电话"}, index = 11)
    private String tel;

    @ExcelProperty(value = {"政治面貌", "政治面貌", "政治面貌"}, index = 12)
    private String politics;

    @ExcelProperty(value = {"邮箱", "邮箱", "邮箱"}, index = 13)
    private String email;

    @ExcelProperty(value = {"证书", "证书", "证书"}, index = 14)
    private String cets;

    @ExcelProperty(value = {"住房要求", "住房要求", "住房要求"}, index = 15)
    private String liveRequest;

    @ExcelProperty(value = {"入职日期", "入职日期", "入职日期"}, index = 16)
    private String getjobWhen;

    @ExcelProperty(value = {"爱好", "爱好", "爱好"}, index = 17)
    private String hobbies;

    @ExcelProperty(value = {"计算机能力", "计算机能力", "计算机能力"}, index = 18)
    private String computer;

    @ExcelProperty(value = {"目前工资", "目前工资", "目前工资"}, index = 19)
    private String salary;

    @ExcelProperty(value = {"现居地址", "现居地址", "现居地址"}, index = 20)
    private String liveWhere;

    @ExcelProperty(value = {"身份证号", "身份证号", "身份证号"}, index = 21)
    private String idNumber;

    @ExcelProperty(value = {"紧急联系人", "紧急联系人", "紧急联系人"}, index = 22)
    private String sosContract;

    @ExcelProperty(value = {"紧急联系人关系", "紧急联系人关系", "紧急联系人关系"}, index = 23)
    private String sosContractReletive;

    @ExcelProperty(value = {"紧急联系人电话", "紧急联系人电话", "紧急联系人电话"}, index = 24)
    private String sosContractPhone;

    @ExcelProperty(value = {"是否愿意加班或上夜班", "是否愿意加班或上夜班", "是否愿意加班或上夜班"}, index = 25)
    private String nightWork;

    @ExcelProperty(value = {"是否愿意出差或外派", "是否愿意出差或外派", "是否愿意出差或外派"}, index = 26)
    private String outWork;

    @ExcelProperty(value = {"合同签订次数", "合同签订次数", "合同签订次数"}, index = 27)
    private String signTime;

    @ExcelProperty(value = {"调动离职", "调动离职", "调动离职"}, index = 28)
    private String changeWork;

    @ExcelProperty(value = {"当前合同起始时间", "当前合同起始时间", "当前合同起始时间"}, index = 29)
    private String contractStart;

    @ExcelProperty(value = {"当前合同结束时间", "当前合同结束时间", "当前合同结束时间"}, index = 30)
    private String contractEnd;


    @ExcelProperty(value = {"公司内亲人", "公司内亲人", "公司内亲人"}, index = 31)
    private String companyRelative;

    @ExcelProperty(value = {"公司内亲人姓名", "公司内亲人姓名", "公司内亲人姓名"}, index = 32)
    private String companyRelativeName;

    @ExcelProperty(value = {"公司内亲人关系", "公司内亲人关系", "公司内亲人关系"}, index = 33)
    private String companyRelativeNameShip;

    @ExcelProperty(value = {"公司内亲人职位", "公司内亲人职位", "公司内亲人职位"}, index = 34)
    private String companyRelativePos;


    /**
     * 教育经历相关内容
     */
    @ExcelProperty(value = {"教育经历", "教育经历", "教育起始时间"}, index = 35)
    private String eduStart;

    @ExcelProperty(value = {"教育经历", "教育经历", "教育结束时间"}, index =36)
    private String eduEnd;

    @ExcelProperty(value = {"教育经历", "教育经历", "机构名称"}, index = 37)
    private String eduName;

    @ExcelProperty(value = {"教育经历", "教育经历", "专业或证书"}, index = 38)
    private String eduMajor;

    @ExcelProperty(value = {"教育经历", "教育经历", "教育经历证明人"}, index = 39)
    private String eduProved;

    /**
     * 过往工作经历相关内容
     */
    @ExcelProperty(value = {"过往工作经历", "过往工作经历", "工作起始时间"}, index = 40)
    private String workStart;

    @ExcelProperty(value = {"过往工作经历", "过往工作经历", "工作结束时间"}, index = 41)
    private String workEnd;

    @ExcelProperty(value = {"过往工作经历", "过往工作经历", "单位名称（含方特）"}, index = 42)
    private String workWhere;

    @ExcelProperty(value = {"过往工作经历", "过往工作经历", "部门"}, index = 43)
    private String workDepartment;

    @ExcelProperty(value = {"过往工作经历", "过往工作经历", "职务"}, index = 44)
    private String workPosition;

    @ExcelProperty(value = {"过往工作经历", "过往工作经历", "电话"}, index = 45)
    private String workTel;

    @ExcelProperty(value = {"过往工作经历", "过往工作经历", "离职原因"}, index = 46)
    private String leaveReason;


    /**
     * 在方特工作履历
     */
    @ExcelProperty(value = {"方特工作履历", "方特工作履历", "方特起始时间"}, index = 47)
    private String ftStart;

    @ExcelProperty(value = {"方特工作履历", "方特工作履历", "方特结束时间"}, index = 48)
    private String ftEnd;

    @ExcelProperty(value = {"方特工作履历", "方特工作履历", "就业中心"}, index = 49)
    private String ftWhere;

    @ExcelProperty(value = {"方特工作履历", "方特工作履历", "本公司部门"}, index = 50)
    private String ftDepartment;

    @ExcelProperty(value = {"方特工作履历", "方特工作履历", "本公司职务"}, index = 51)
    private String ftPosition;

    @ExcelProperty(value = {"方特工作履历", "方特工作履历", "证明人"}, index = 52)
    private String ftProved;

    @ExcelProperty(value = {"方特工作履历", "方特工作履历", "调走原因"}, index = 53)
    private String transferReason;
    /**
     * 家庭关系
     */
    @ExcelProperty(value = {"家庭关系", "家庭关系", "家属名字"}, index = 54)
    private String relativeName;

    @ExcelProperty(value = {"家庭关系", "家庭关系", "家属关系"}, index = 55)
    private String relativeShip;

    @ExcelProperty(value = {"家庭关系", "家庭关系", "家属单位"}, index = 56)
    private String relativeWorkDepartment;

    @ExcelProperty(value = {"家庭关系", "家庭关系", "家属电话"}, index = 56)
    private String relativeTel;

    @ExcelProperty(value = {"家庭关系", "家庭关系", "户籍所在地"}, index = 58)
    private String relativeAddr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getMarrage() {
        return marrage;
    }

    public void setMarrage(String marrage) {
        this.marrage = marrage;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCets() {
        return cets;
    }

    public void setCets(String cets) {
        this.cets = cets;
    }

    public String getLiveRequest() {
        return liveRequest;
    }

    public void setLiveRequest(String liveRequest) {
        this.liveRequest = liveRequest;
    }

    public String getGetjobWhen() {
        return getjobWhen;
    }

    public void setGetjobWhen(String getjobWhen) {
        this.getjobWhen = getjobWhen;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLiveWhere() {
        return liveWhere;
    }

    public void setLiveWhere(String liveWhere) {
        this.liveWhere = liveWhere;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getSosContract() {
        return sosContract;
    }

    public void setSosContract(String sosContract) {
        this.sosContract = sosContract;
    }

    public String getSosContractReletive() {
        return sosContractReletive;
    }

    public void setSosContractReletive(String sosContractReletive) {
        this.sosContractReletive = sosContractReletive;
    }

    public String getSosContractPhone() {
        return sosContractPhone;
    }

    public void setSosContractPhone(String sosContractPhone) {
        this.sosContractPhone = sosContractPhone;
    }

    public String getNightWork() {
        return nightWork;
    }

    public void setNightWork(String nightWork) {
        this.nightWork = nightWork;
    }

    public String getOutWork() {
        return outWork;
    }

    public void setOutWork(String outWork) {
        this.outWork = outWork;
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

    public String getChangeWork() {
        return changeWork;
    }

    public void setChangeWork(String changeWork) {
        this.changeWork = changeWork;
    }

    public String getContractStart() {
        return contractStart;
    }

    public void setContractStart(String contractStart) {
        this.contractStart = contractStart;
    }

    public String getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(String contractEnd) {
        this.contractEnd = contractEnd;
    }

    public String getCompanyRelative() {
        return companyRelative;
    }

    public void setCompanyRelative(String companyRelative) {
        this.companyRelative = companyRelative;
    }

    public String getCompanyRelativeName() {
        return companyRelativeName;
    }

    public void setCompanyRelativeName(String companyRelativeName) {
        this.companyRelativeName = companyRelativeName;
    }

    public String getCompanyRelativeNameShip() {
        return companyRelativeNameShip;
    }

    public void setCompanyRelativeNameShip(String companyRelativeNameShip) {
        this.companyRelativeNameShip = companyRelativeNameShip;
    }

    public String getCompanyRelativePos() {
        return companyRelativePos;
    }

    public void setCompanyRelativePos(String companyRelativePos) {
        this.companyRelativePos = companyRelativePos;
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
