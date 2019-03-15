package alibaba;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 2019-3-8 11:14
 */
public class DownloadServlet extends HttpServlet {

    private final String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=ekp";
    private final String userName = "sa";
    private final String userPwd = "123456";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] employees = req.getParameterValues("employee");
        String[] split = employees[0].split(",");
        StringBuilder sb = new StringBuilder();
        String selectSql = "";
        if (employees.length >= 1 && employees[0] != null && employees[0].trim().length() != 0) {
            for (int i = 0; i < split.length; i++) {
                if (i == split.length - 1) {
                    sb.append("'").append(split[i]).append("'");
                } else {
                    sb.append("'").append(split[i]).append("',");
                }
            }
            selectSql = " and k.fd_id in ( " + sb.toString() + " ) ";
        }
        System.out.println(selectSql);
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        PreparedStatement eduPreparedStatement = null;
        ResultSet eduResultSet = null;
        PreparedStatement workPreparedStatement = null;
        ResultSet workResultSet = null;
        PreparedStatement ftWorkPreparedStatement = null;
        ResultSet ftWorkResultSet = null;
        PreparedStatement homePreparedStatement = null;
        ResultSet homeResultSet = null;

        try {
            String fileName = new String(("Personal-information" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
                    .getBytes(), "UTF-8");
            ServletOutputStream out = resp.getOutputStream();
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
            Sheet sheet1 = new Sheet(1, 0, PersonPropertyIndexModel.class);
            sheet1.setSheetName("员工个人信登记表");
            sheet1.setAutoWidth(Boolean.TRUE);
            List<PersonPropertyIndexModel> data = new ArrayList<PersonPropertyIndexModel>();
            Class.forName(driverName);
            connection = DriverManager.getConnection(dbURL, userName, userPwd);
            String sql = "SELECT (SELECT fd_name FROM sys_org_element WHERE fd_id = k.doc_creator_id) createname,\n" +
                    "(SELECT fd_name FROM sys_org_element WHERE fd_id = main.fd_employee_sub_depart) fd_employee_sub_depart,\n" +
                    "(SELECT fd_name FROM sys_org_element WHERE fd_id = main.fd_employee_submit_position) fd_employee_submit_position,\n" +
                    "main.* FROM \n" +
                    "ekp_employee_main main,km_review_main k WHERE main.fd_id=k.fd_id AND\n" +
                    " k.doc_status='30' " +
                    "AND k.fd_template_id='1680cab6a5af1700c65c27f430594a4a'" + selectSql;
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                PersonPropertyIndexModel item = new PersonPropertyIndexModel();
                item.setName(resultSet.getString(1));
                item.setGender(resultSet.getString(10));
                item.setBirth(resultSet.getString(11));
                item.setMajor(resultSet.getString(13));
                item.setDegree(resultSet.getString(14));
                item.setPosition(resultSet.getString(15));
                item.setNation(resultSet.getString(16));
                item.setMarrage(resultSet.getString(17));
                item.setHealth(resultSet.getString(18));
                item.setHeight(resultSet.getString(19));
                item.setAddr(resultSet.getString(20));
                item.setPolitics(resultSet.getString(22));
                item.setEmail(resultSet.getString(23));
                item.setCets(resultSet.getString(24));
                item.setLiveRequest(resultSet.getString(25));
                item.setGetjobWhen(resultSet.getString(26));
                item.setHobbies(resultSet.getString(27));
                item.setComputer(resultSet.getString(28));
                item.setSalary(resultSet.getString(29));
                item.setLiveWhere(resultSet.getString(30));
                item.setIdNumber(resultSet.getString(31));
                item.setSosContract(resultSet.getString(32));
                item.setSosContractRelative(resultSet.getString(33));
                item.setSosContractPhone(resultSet.getString(34));
                item.setNightWork(resultSet.getString(35));
                item.setOutWork(resultSet.getString(36));
                item.setTel(resultSet.getString(21));
                item.setSignTime(resultSet.getString(37));
                item.setChangeWork(resultSet.getString(38));
                item.setContractStart(resultSet.getString(39));
                item.setContractEnd(resultSet.getString(40));
                item.setCompanyRelative(resultSet.getString(41));
                item.setCompanyRelativeName(resultSet.getString(42));
                item.setCompanyRelativeNameShip(resultSet.getString(43));
                item.setCompanyRelativePos(resultSet.getString(44));
                item.setDepartment(resultSet.getString(2));
                item.setJob(resultSet.getString(3));
                data.add(item);
            }

            String sqlEdu = "SELECT (SELECT fd_name FROM sys_org_element WHERE fd_id = k.doc_creator_id) createname,edu.* FROM ekp_employee_edu edu,km_review_main k WHERE\n" +
                    "edu.fd_parent_id=k.fd_id AND\n" +
                    "k.fd_template_id='1680cab6a5af1700c65c27f430594a4a' AND k.doc_status='30' " + selectSql;
            eduPreparedStatement = connection.prepareStatement(sqlEdu);
            eduResultSet = eduPreparedStatement.executeQuery();
            List<EduPropertyIndexModel> eduPropertyIndexModels = new ArrayList<EduPropertyIndexModel>();
            while (eduResultSet.next()) {
                EduPropertyIndexModel eduItem = new EduPropertyIndexModel();
                eduItem.setName(eduResultSet.getString(1));
                eduItem.setEduStart(eduResultSet.getString(3));
                eduItem.setEduEnd(eduResultSet.getString(4));
                eduItem.setEduName(eduResultSet.getString(5));
                eduItem.setEduMajor(eduResultSet.getString(6));
                eduItem.setEduProved(eduResultSet.getString(7));
                eduPropertyIndexModels.add(eduItem);
            }
            Sheet sheet2 = new Sheet(2, 3, EduPropertyIndexModel.class, "教育经历", null);
            sheet2.setAutoWidth(Boolean.TRUE);

            String sqlWork = "SELECT (SELECT fd_name FROM sys_org_element WHERE fd_id = k.doc_creator_id) createname,work.* FROM dbo.ekp_employee_work work,km_review_main k WHERE\n" +
                    "work.fd_parent_id=k.fd_id AND " +
                    " k.fd_template_id='1680cab6a5af1700c65c27f430594a4a' AND k.doc_status='30' " + selectSql;
            workPreparedStatement = connection.prepareStatement(sqlWork);
            workResultSet = workPreparedStatement.executeQuery();
            List<WorkPropertyIndexModel> workPropertyIndexModels = new ArrayList<WorkPropertyIndexModel>();
            while (workResultSet.next()) {
                WorkPropertyIndexModel workItem = new WorkPropertyIndexModel();
                workItem.setName(workResultSet.getString(1));
                workItem.setWorkStart(workResultSet.getString(3));
                workItem.setWorkEnd(workResultSet.getString(4));
                workItem.setWorkWhere(workResultSet.getString(5));
                workItem.setWorkDepartment(workResultSet.getString(6));
                workItem.setWorkPosition(workResultSet.getString(7));
                workItem.setWorkTel(workResultSet.getString(8));
                workItem.setLeaveReason(workResultSet.getString(9));
                workPropertyIndexModels.add(workItem);
            }
            Sheet sheet3 = new Sheet(3, 4, WorkPropertyIndexModel.class, "工作经历", null);
            sheet3.setAutoWidth(Boolean.TRUE);


            String ftWork = "SELECT (SELECT fd_name FROM sys_org_element WHERE fd_id = k.doc_creator_id) createname,ft.* FROM \n" +
                    "dbo.ekp_employee_work_ft ft,km_review_main k WHERE\n" +
                    "ft.fd_parent_id=k.fd_id AND " +
                    " k.fd_template_id='1680cab6a5af1700c65c27f430594a4a' AND k.doc_status='30' " + selectSql;
            ftWorkPreparedStatement = connection.prepareStatement(ftWork);
            ftWorkResultSet = ftWorkPreparedStatement.executeQuery();
            List<FTPropertyIndexModel> ftWorkPropertyIndexModels = new ArrayList<FTPropertyIndexModel>();
            while (ftWorkResultSet.next()) {
                FTPropertyIndexModel ftWorkItem = new FTPropertyIndexModel();
                ftWorkItem.setName(ftWorkResultSet.getString(1));
                ftWorkItem.setFtStart(ftWorkResultSet.getString(3));
                ftWorkItem.setFtEnd(ftWorkResultSet.getString(4));
                ftWorkItem.setFtWhere(ftWorkResultSet.getString(5));
                ftWorkItem.setFtDepartment(ftWorkResultSet.getString(6));
                ftWorkItem.setFtPosition(ftWorkResultSet.getString(7));
                ftWorkItem.setFtProved(ftWorkResultSet.getString(8));
                ftWorkItem.setTransferReason(ftWorkResultSet.getString(9));
                ftWorkPropertyIndexModels.add(ftWorkItem);
            }
            Sheet sheet4 = new Sheet(4, 5, FTPropertyIndexModel.class, "方特工作履历", null);
            sheet4.setAutoWidth(Boolean.TRUE);

            String homeSql = "SELECT (SELECT fd_name FROM sys_org_element WHERE fd_id = k.doc_creator_id) createname,home.* FROM \n" +
                    "dbo.ekp_employee_home home,km_review_main k WHERE\n" +
                    "home.fd_parent_id=k.fd_id AND " +
                    " k.fd_template_id='1680cab6a5af1700c65c27f430594a4a' AND k.doc_status='30' " + selectSql;
            homePreparedStatement = connection.prepareStatement(homeSql);
            homeResultSet = homePreparedStatement.executeQuery();
            List<HomePropertyIndexModel> homePropertyIndexModelList = new ArrayList<HomePropertyIndexModel>();
            while (homeResultSet.next()) {
                HomePropertyIndexModel homeItem = new HomePropertyIndexModel();
                homeItem.setName(homeResultSet.getString(1));
                homeItem.setRelativeName(homeResultSet.getString(3));
                homeItem.setRelativeShip(homeResultSet.getString(4));
                homeItem.setRelativeWorkDepartment(homeResultSet.getString(5));
                homeItem.setRelativeTel(homeResultSet.getString(6));
                homeItem.setRelativeAddr(homeResultSet.getString(7));
                homePropertyIndexModelList.add(homeItem);
            }
            Sheet sheet5 = new Sheet(5, 6, HomePropertyIndexModel.class, "家庭关系", null);
            sheet5.setAutoWidth(Boolean.TRUE);

            resp.setContentType("multipart/form-data");
            resp.setCharacterEncoding("utf-8");
            resp.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
            writer.write(data, sheet1);
            writer.write(eduPropertyIndexModels, sheet2);
            writer.write(workPropertyIndexModels, sheet3);
            writer.write(ftWorkPropertyIndexModels, sheet4);
            writer.write(homePropertyIndexModelList, sheet5);
            writer.finish();
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
                if (eduPreparedStatement != null) {
                    eduPreparedStatement.close();
                }
                if (eduResultSet != null) {
                    eduResultSet.close();
                }
                if (workPreparedStatement != null) {
                    workPreparedStatement.close();
                }

                if (workResultSet != null) {
                    workResultSet.close();
                }
                if (ftWorkPreparedStatement != null) {
                    ftWorkPreparedStatement.close();
                }

                if (ftWorkResultSet != null) {
                    ftWorkResultSet.close();
                }
                if (homePreparedStatement != null) {
                    homePreparedStatement.close();
                }

                if (homeResultSet != null) {
                    homeResultSet.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }


}


