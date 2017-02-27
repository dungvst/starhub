<%@ page session="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="box box-info">
    <div class="box-header with-border">
        <h3 class="box-title">
             Update Right Tile
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
    <spring:url value="/admin/tiles-right" var="updateUrl"/>
    <form:form class="form-horizontal" method="post" modelAttribute="tilesRightForm" action="${updateUrl}"  enctype="multipart/form-data">
        <div class="box-body">
            <form:hidden path="id"/>
            
            <spring:bind path="imagePath">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">Image</label>
                    <div class="col-sm-10">
                        <input type="file" name="file" />
                    </div>
                </div>
            </spring:bind>
            
            <spring:bind path="title">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">Title</label>
                    <div class="col-sm-10">
                        <form:input path="title" type="text" class="form-control " maxlength="100" required="required" />
                        <form:errors path="title" class="control-label"/>
                    </div>
                </div>
            </spring:bind>

            <spring:bind path="subtitle">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">Subtitle</label>
                    <div class="col-sm-10">
                        <form:input path="subtitle" type="text" class="form-control " maxlength="100" required="required" />
                        <form:errors path="subtitle" class="control-label"/>
                    </div>
                </div>
            </spring:bind>
            
             <spring:bind path="cta">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">CTA Link</label>
                    <div class="col-sm-10">
                        <form:input path="cta" type="text" class="form-control " maxlength="100" required="required" />
                        <form:errors path="cta" class="control-label"/>
                    </div>
                </div>
            </spring:bind>
        </div>

        <div class="box-footer">
                  <button type="submit" class="btn btn-info pull-right">Update</button>
        </div>
    </form:form>
</div>