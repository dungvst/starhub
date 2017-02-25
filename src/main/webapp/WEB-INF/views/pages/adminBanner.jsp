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
		<c:if test="${empty msg}">
	    <spring:url value="/dashboard/banner/saveOrUpdate" var="saveOrUpdateUrl"/>
	    <form:form class="form-horizontal" method="post" modelAttribute="banner" enctype="multipart/form-data"
	               action="${saveOrUpdateUrl}">
	
	        <div class="box-body">
	            <form:hidden path="id"/>
	
	            <spring:bind path="title">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">Banner Title</label>
	                    <div class="col-sm-10">
	                        <form:input path="title" type="text" class="form-control "
	                                    id="title" placeholder="Banner Title"/>
	                        <form:errors path="title" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	
	            <spring:bind path="description">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">Description</label>
	                    <div class="col-sm-10">
	                        <form:input path="description" type="text" class="form-control "
	                                    id="description" placeholder="Description"/>
	                        <form:errors path="description" class="control-label"/>
	                    </div>
	                </div>
	            </spring:bind>
	            <%-- <spring:bind path="bannerImagePath">
	                <div class="form-group ${status.error ? 'has-error' : ''}">
	                    <label class="col-sm-2 control-label">Banner image</label>
	                    <div class="col-sm-10">
	                        <input type="file" name="bannerImage"/>
	                        <form:errors path="bannerImagePath" class="control-label"/>
	                        <div>
	                            <c:url value="/dashboard/banner/get-image" var="uploadImageUrl">
	                                <c:param name="imageStoredPath" value="${banner.bannerImagePath}"/>
	                            </c:url>
	                            <img src="${uploadImageUrl}" style="max-height: 100px;"/>
	                        </div>
	                    </div>
	                </div>
	            </spring:bind> --%>
	        </div>
	
	        <div class="box-footer">
	            <c:choose>
	                <c:when test="${isNew}">
	                    <button type="submit" class="btn btn-info pull-right">Add</button>
	                </c:when>
	                <c:otherwise>
	                    <button type="submit" class="btn btn-info pull-right">Update</button>
	                </c:otherwise>
	            </c:choose>
	        </div>
	
	    </form:form>
	</c:if>
	</div>