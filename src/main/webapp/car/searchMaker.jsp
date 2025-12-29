<%@page import="kr.co.sist.car.CarSearchService"%>
<%@page import="day1224.UrlVO"%>
<%@ page language="java" contentType="application/json; UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
String country=request.getParameter("country");
if(country==null){
	country="국산";
}//end if
out.print(CarSearchService.getInstance().searchMaker(country));
%>
