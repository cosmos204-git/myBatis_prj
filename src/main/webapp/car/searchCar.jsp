<%@page import="kr.co.sist.car.CarSearchService"%>
<%@page import="day1224.UrlVO"%>
<%@ page language="java" contentType="application/json; UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
String model=request.getParameter("model");
if(model==null){
	model="아반테";
}//end if
out.print(CarSearchService.getInstance().searchCar(model));
%>
