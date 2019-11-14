<%-- 
    Document   : Customer-new-save
    Created on : Nov 10, 2019, 2:31:43 AM
    Author     : HP
--%>

<%@page import="Model.CusEmProModel"%>
<%@page import="java.sql.Date"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="Model.CustomerModel"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
    String cusName = "";
    String cusMail = "";
    String cusPhone = "";
    int DayofBirth = 01, MonthofBirth = 01, YearofBirth = 2019;
    Date cusBirthDay;
    int cusGender = 1;
    int idProduct = 1;
    int p = 1;
    int district = 0;
    int priceFrom = 0;
    int priceTo = 0;
    int areaFrom = 0;
    int areaTo = 0;
    if (request.getParameter("id") != null) {
        idProduct = Integer.parseInt(request.getParameter("id"));
    }
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("d") != null) {
        district = Integer.parseInt(request.getParameter("d"));
    }
    if (request.getParameter("pf") != null && !request.getParameter("pf").trim().equals("")) {
        priceFrom = Integer.parseInt(request.getParameter("pf"));
    }
    if (request.getParameter("pt") != null && !request.getParameter("pt").trim().equals("")) {
        priceTo = Integer.parseInt(request.getParameter("pt"));
    }
    if (request.getParameter("af") != null && !request.getParameter("af").trim().equals("")) {
        areaFrom = Integer.parseInt(request.getParameter("af"));
    }
    if (request.getParameter("at") != null && !request.getParameter("at").trim().equals("")) {
        areaTo = Integer.parseInt(request.getParameter("at"));
    }
    if (request.getParameter("cusName") != null) {
        cusName = request.getParameter("cusName");
    }
    if (request.getParameter("cusMail") != null) {
        cusMail = request.getParameter("cusMail");
    }
    if (request.getParameter("cusPhone") != null) {
        cusPhone = request.getParameter("cusPhone");
    }
    if (request.getParameter("cusDayofBirth") != null) {
        DayofBirth = Integer.parseInt(request.getParameter("cusDayofBirth"));
    }
    if (request.getParameter("cusMonthofBirth") != null) {
        MonthofBirth = Integer.parseInt(request.getParameter("cusMonthofBirth"));
    }
    if (request.getParameter("cusYearofBirth") != null) {
        YearofBirth = Integer.parseInt(request.getParameter("cusYearofBirth"));
    }
    cusBirthDay = Date.valueOf(YearofBirth + "-" + MonthofBirth + "-" + DayofBirth);
    if (request.getParameter("cusGender") != null) {
        cusGender = Integer.parseInt(request.getParameter("cusGender"));
    }
    CusEmProModel cepm = new CusEmProModel();
    int idCustomer = 1;
    if (CM.getCustomerByPhone(cusPhone) == null) {
        idCustomer = CM.insert(cusName, cusMail, cusPhone, cusBirthDay, cusGender);

    } else {
        idCustomer =  CM.getCustomerByPhone(cusPhone).getIdCustomer();
    }
    cepm.insertFromClient(idProduct, idCustomer);
    String strRes = "product-detail-detail-client.jsp?page=" + p + "&d=" + district + "&pf=" + priceFrom + "&pt=" + priceTo
            + "&af=" + areaFrom + "&at=" + areaTo + "&id=" + idProduct;
    response.sendRedirect(strRes);
%>

