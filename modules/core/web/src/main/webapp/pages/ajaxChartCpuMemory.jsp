<%@ include file="include/re_jsp.jsp"%>
<%
response.setContentType("application/json");
response.setCharacterEncoding("UTF-8");
response.getWriter().write(new ChartCpuMemory().getCpuMemoryChartJson(request, response));
%>