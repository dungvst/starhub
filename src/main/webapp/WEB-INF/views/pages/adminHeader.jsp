<%@ page session="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="box box-info">
	    <div class="box-header with-border">
	        <h3 class="box-title">
	             Update Header Section
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
	    <spring:url value="/admin/header" var="updateUrl"/>
	    <form:form class="form-horizontal" method="post" modelAttribute="headerForm" action="${updateUrl}">
	        <div class="box-body">
	            <form:hidden path="id"/>
	            <spring:bind path="mobileLink">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">Mobile Link</label>
	                    <div class="col-sm-10">
	                        <form:input path="mobileLink" type="text" class="form-control " maxlength="200" required="required" />
	                        <form:errors path="mobileLink" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	
	            <spring:bind path="broadbandLink">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">Broadband Link</label>
	                    <div class="col-sm-10">
	                        <form:input path="broadbandLink" type="text" class="form-control " maxlength="200" required="required" />
	                        <form:errors path="broadbandLink" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	            
	             <spring:bind path="tvLink">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">TV Link</label>
	                    <div class="col-sm-10">
	                        <form:input path="tvLink" type="text" class="form-control " maxlength="200" required="required" />
	                        <form:errors path="tvLink" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	            
	             <spring:bind path="homehubLink">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">Homehub Link</label>
	                    <div class="col-sm-10">
	                        <form:input path="homehubLink" type="text" class="form-control " maxlength="200" required="required" />
	                        <form:errors path="homehubLink" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	        </div>
	
	        <div class="box-footer">
                   <button type="submit" class="btn btn-info pull-right">Update</button>
	        </div>
	    </form:form>
	</div>