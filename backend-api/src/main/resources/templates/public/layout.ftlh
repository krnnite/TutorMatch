<#macro page title active="">
<!DOCTYPE html>
<html lang="en"> 
    <head>   
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <link href="/css/stylesheet.css" rel="stylesheet">
    </head>
    <body class="d-flex flex-column min-vh-100">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
        
        <nav id="tutormatch-navbar" class="navbar navbar-expand-lg navbar-dark bg-dark" aria-label="Main navigation">
            <div class="container d-flex align-items-center">
                <a class="navbar-brand" href="">TutorMatch</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#tutormatch-nav" aria-controls="tutormatch-nav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div id="tutormatch-nav" class="collapse navbar-collapse">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item active">
                            <a class="nav-link ps-0" href="">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="">Students</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="">Tutors</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="">Courses</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <main class="container">
            <#if message??>
                <p class="alert">${message}</p>
            </#if>
            <#nested>
        </main>
    </body>
</html>
</#macro>