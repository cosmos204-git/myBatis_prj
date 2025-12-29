<%@page import="day1226.EmpDomain"%>
<%@page import="day1226.EmpDTO"%>
<%@page import="java.util.List"%>
<%@page import="day1226.SelectService2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
    
<h4>subquery의 조회</h4>
<script type="text/javascript">
$(function(){
	$("#btn").click(function(){
		$("#frm").submit();
	}); //click
});//ready
</script>
최근 입사한 신입사원 검색 <br>

<input type="hidden" name="url" value="${ param.url }"/>
<input type="button" value="검색" class="btn btn-info btn-sm" id="btn"/>

<div id="output">

<%
SelectService2 ss2=SelectService2.getInstance();
List<EmpDomain> empList=ss2.subquery();
pageContext.setAttribute("empList", empList);
%>
<table class="table table-hover">
<thead>
<tr>
<th>번호</th>
<th>사원명</th>
<th>연봉</th>
<th>입사일</th>
</tr>
</thead>
<tbody>
<c:if test="${ empty empList }">
<tr>
<td colspan="4" style="text-align:center">
<img src="common/images/na.jpg" style="width:300px; height:260px"/>
</td>
</tr>
</c:if>
<c:forEach var="emp" items="${ empList }" varStatus="i">
<tr>
	<td><c:out value="${ emp.empno }"/></td>
	<td><c:out value="${ emp.ename }"/></td>
	<td><c:out value="${ emp.sal }"/></td>
	<td><fmt:formatDate  value="${ emp.hiredate }" pattern="yyyy-MM-dd EEEE"/></td>
</tr>
</c:forEach>
</tbody>

</table>

</div>
