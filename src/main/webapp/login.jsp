<%--
  Created by IntelliJ IDEA.
  User: EON
  Date: 02.04.2019
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="WEB-INF/template/header.jsp"/>

<h1>Hear will be login</h1>
<div class="row">
    <div class="col-4">
    </div>
    <div class="col-4">
        <form method="post" action="${pageContext.request.contextPath}/login">
            <div class="form-group">
                <input type="email" name="email" class="form-control"/><br>
            </div>
            <div class="form-group">
                <input type="password" name="pass" class="form-control"/><br>
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Log In"/>
            </div>
        </form>

    </div>
</div>

<jsp:include page="WEB-INF/template/footer.jsp"/>
