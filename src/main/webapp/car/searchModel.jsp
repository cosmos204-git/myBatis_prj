<%@page import="kr.co.sist.car.CarSearchService"%>
<%@page import="day1224.UrlVO"%>
<%@ page language="java" contentType="application/json; UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
String maker=request.getParameter("maker");
if(maker==null){
	maker="현대";
}//end if
out.print(CarSearchService.getInstance().searchModel(maker));
%>