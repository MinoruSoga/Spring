<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
    <meta charset="UTF-8">
</head>
<body>
    <header>
        <jsp:include page="header.jsp" />
    </header>
    <main>
        <div class="jumbotron">
            <div class="container">
                <h1 class="display-3">Summary of Books</h1>
                <p>Search books</p>
                <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more >></a></p>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <div class="summary-image">
                        <img class="mx-3" src="https://fl5cdn.azureedge.net/summary/1969_cover_150.jpg" alt="title">
                    </div>
                    <div class="summary-detail">
                        <div class="summary-title">
                            Title
                        </div>
                        <div class="summary-author">
                            author
                        </div>
                        <div class="d-flex justify-content-between align-items-center">
                            <span class="btn-group-sm">
                                <button type="button" class="btn btn-warning bmd-btn-fab float-left">
                                    <i class="material-icons">grade</i>
                                </button>
                            </span>
                            <button type="button" class="btn btn-raised btn-info float-right">More</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <footer class="container">
        <p> Company 2017-2018</p>
    </footer>
</body>
</html>