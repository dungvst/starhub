<%@ page session="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="box box-info">
	    <div class="box-header with-border">
	        <h3 class="box-title">
	             Update Banner
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
	    <spring:url value="/admin/banner" var="updateUrl"/>
	    <form:form class="form-horizontal" method="post" modelAttribute="bannerForm" action="${updateUrl}">
	        <div class="box-body">
	            <form:hidden path="id"/>
	            <spring:bind path="title">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">Banner Title</label>
	                    <div class="col-sm-10">
	                        <form:input path="title" type="text" class="form-control " maxlength="200" required="required" />
	                        <form:errors path="title" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	
	            <spring:bind path="description">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">Description</label>
	                    <div class="col-sm-10">
	                        <form:input path="description" type="text" class="form-control " maxlength="500" required="required" />
	                        <form:errors path="description" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	            
	             <spring:bind path="ctaText">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">CTA Text</label>
	                    <div class="col-sm-10">
	                        <form:input path="ctaText" type="text" class="form-control " maxlength="50" required="required" />
	                        <form:errors path="ctaText" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	            
	             <spring:bind path="ctaLink">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">CTA Link</label>
	                    <div class="col-sm-10">
	                        <form:input path="ctaLink" type="text" class="form-control " maxlength="200" required="required" />
	                        <form:errors path="ctaLink" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	        </div>
	
	        <div class="box-footer">
                   <button type="submit" class="btn btn-info pull-right">Update</button>
	        </div>
	    </form:form>
	</div>