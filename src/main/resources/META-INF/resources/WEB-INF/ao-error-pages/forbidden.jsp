<%--
ao-error-pages - A set of simple default servlet error pages to prevent accidental information disclosure.
Copyright (C) 2021, 2022, 2023  AO Industries, Inc.
    support@aoindustries.com
    7262 Bull Pen Cir
    Mobile, AL 36695

This file is part of ao-error-pages.

ao-error-pages is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

ao-error-pages is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with ao-error-pages.  If not, see <https://www.gnu.org/licenses/>.
--%><%@ page language="java" pageEncoding="UTF-8"
%><%@ page session="false"
%><%@ page isErrorPage="true"
%><%@ include file="taglibs.jspf"
%><%
  if (exception != null) {
    log(null, exception);
  }
  if (!response.isCommitted()) {
    // Set the error status
    response.setStatus(HttpServletResponse.SC_FORBIDDEN);
%><ao:html>
  <head>
    <ao:meta charset="${pageContext.response.characterEncoding}" />
    <title>403 Forbidden</title>
    <wr:renderStyles />
  </head>
  <body>
    <h1>403 Forbidden</h1>
  </body>
</ao:html><% } %>