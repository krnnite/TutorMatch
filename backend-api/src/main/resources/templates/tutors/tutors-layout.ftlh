<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>${pageTitle!"FitMatch"}</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <link href="../../static/css/stylesheet.css" rel="stylesheet">
    </head>
    <body class="d-flex flex-column min-vh-100 bg-light">
        <!-- Header Navigation -->
        <header class="sticky-top">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark tm-navbar">
                <div class="container d-flex align-items-center justify-content-between">
                    <div class="d-flex align-items-center">
                        <a class="navbar-brand d-flex align-items-center" href="#">
                            <img class="me-2" src="../../static/img/flavicon/tutorMatch-32x32.png" alt="logo" width="32" height="32">
                            <span class="fw-bold">TutorMatch</span>
                        </a>
                        <span class="navbar-text d-none d-md-block text-secondary ms-3 tm-navbar-slogan small">Match with Local Experts in Your Desired Field!</span>
                    </div>
                    <div>
                        <!---Navigation bar buttons-->
                        <ul class="nav nav-pills align-items-center mb-0">
                            <li class="nav-item mx-2">
                                <!-- Index Page -->
                                <button type="button" class="btn btn-outline-light btn-sm" onclick="location.href='#'">Home</button>
                            </li>
                            <li class="nav-item">
                                <!-- Dashboard -->
                                <button type="button" class="btn btn-primary btn-sm" onclick="location.href='#'">Provider Profile</button>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>