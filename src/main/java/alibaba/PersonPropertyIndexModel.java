package alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 2019-3-12 14:53
 */
public class PersonPropertyIndexModel extends BaseRowModel {
    @ExcelProperty(value = {"姓名"}, index = 0)
    private String name;

    @ExcelProperty(value = {"性别"}, index = 1)
    private String gender;

    @ExcelProperty(value = {"出生年月"}, index = 2)
    private String birth;

    @ExcelProperty(value = {"专业"}, index = 3)
    private String major;

    @ExcelProperty(value = {"学历"}, index = 4)
    private String degree;

    @ExcelProperty(value = {"学位"}, index = 5)
    private String position;

    @ExcelProperty(value = {"民族"}, index = 6)
    private String nation;

    @ExcelProperty(value = {"婚否"}, index = 7)
    private String marrage;

    @ExcelProperty(value = {"健康状态"}, index = 8)
    private String health;

    @ExcelProperty(value = {"身高"}, index = 9)
    private String height;

    @ExcelProperty(value = {"部门"}, index = 10)
    private String department;

    @ExcelProperty(value = {"职位"}, index = 11)
    private String job;

    @ExcelProperty(value = {"户籍地址"}, index = 12)
    private String addr;

    @ExcelProperty(value = {"联系电话"}, index = 13)
    private String tel;

    @ExcelProperty(value = {"政治面貌"}, index = 14)
    private String politics;

    @ExcelProperty(value = {"邮箱"}, index = 15)
    private String email;

    @ExcelProperty(value = {"证书"}, index = 16)
    private String cets;

    @ExcelProperty(value = {"住房要求"}, index = 17)
    private String liveRequest;

    @ExcelProperty(value = {"入职日期"}, index = 18)
    private String getjobWhen;

    @ExcelProperty(value = {"爱好"}, index = 19)
    private String hobbies;

    @ExcelProperty(value = {"计算机能力"}, index = 20)
    private String computer;

    @ExcelProperty(value = {"目前工资"}, index = 21)
    private String salary;

    @ExcelProperty(value = {"现居地址"}, index = 22)
    private String liveWhere;

    @ExcelProperty(value = {"身份证号"}, index = 23)
    private String idNumber;

    @ExcelProperty(value = {"紧急联系人"}, index = 24)
    private String sosContract;

    @ExcelProperty(value = {"紧急联系人关系"}, index = 25)
    private String sosContractRelative;

    @ExcelProperty(value = {"紧急联系人电话"}, index = 26)
    private String sosContractPhone;

    @ExcelProperty(value = {"是否愿意加班或上夜班"}, index = 27)
    private String nightWork;

    @ExcelProperty(value = {"是否愿意出差或外派"}, index = 28)
    private String outWork;

    @ExcelProperty(value = {"合同签订次数"}, index = 29)
    private String signTime;

    @ExcelProperty(value = {"调动离职"}, index = 30)
    private String changeWork;

    @ExcelProperty(value = {"当前合同起始时间"}, index = 31)
    private String contractStart;

    @ExcelProperty(value = {"当前合同结束时间"}, index = 32)
    private String contractEnd;


    @ExcelProperty(value = {"公司内亲人"}, index = 33)
    private String companyRelative;

    @ExcelProperty(value = {"公司内亲人姓名"}, index = 34)
    private String companyRelativeName;

    @ExcelProperty(value = {"公司内亲人关系"}, index = 35)
    private String companyRelativeNameShip;

    @ExcelProperty(value = {"公司内亲人职位"}, index = 36)
    private String companyRelativePos;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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

    public String getSosContractRelative() {
        return sosContractRelative;
    }

    public void setSosContractRelative(String sosContractRelative) {
        this.sosContractRelative = sosContractRelative;
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
}
