<%@ page session="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div id="outer-login">
	    <div class="box-header with-border">
	        <h3 class="box-title" style="padding-left: 15%;">
	             Login to Your Account
	        </h3>
	    </div>
	    </br>
	    <c:if test="${not empty msg}">
		    <div class="alert alert-${css} alert-dismissible" role="alert">
		        <button type="button" class="close" data-dismiss="alert"
		                aria-label="Close">
		            <span aria-hidden="true">&times;</span>
		        </button>
		        <strong>${msg}</strong>
		    </div>
		</c:if>
	    <spring:url value="/login" var="loginUrl"/>
	    <form:form class="form-horizontal" method="post" modelAttribute="loginForm" action="${loginUrl}">
	        <div class="box-body">
	            <form:hidden path="id"/>
	            <spring:bind path="userCode">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-3 control-label">User name</label>
	                    <div class="col-sm-9">
	                        <form:input path="userCode" type="text" class="form-control " required="required" />
	                        <form:errors path="userCode" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	
	            <spring:bind path="password">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-3 control-label">Password</label>
	                    <div class="col-sm-9">
	                        <form:input path="password" type="text" class="form-control " required="required" />
	                        <form:errors path="password" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	        </div>
	
	        <div class="box-footer">
                   <button type="submit" class="btn btn-info pull-right">Login</button>
	        </div>
	    </form:form>
</div>