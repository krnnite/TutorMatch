<#assign pageTitle="Login - TutorMatch">
    <#include "/public/index-layout.ftlh">
        <main class="section d-flex justify-content-center align-items-center flex-grow-1 py-5">
            <div class="form-container shadow-sm p-4 bg-white rounded w-100" style="max-width: 420px;">
                <h1 class="text-center mb-4" style="font-weight: 700; font-size: 1.8rem;">Welcome to TutorMatch</h1>
                <form action="/login" method="post">
                    <div class="mb-3">
                        <label for="role" class="form-label">Logging in as...</label>
                        <select id="role" name="role" class="form-select" required>
                            <option value="tutor">Tutor</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="username" class="form-label">Username</label>
                        <input id="username" name="username" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input id="password" name="password" type="password" class="form-control" required>
                    </div>
                    <button type="submit" class="btn btn-primary w-100 py-2">Login</button>
                </form>
                <p class="text-center mb-0" style="margin-top: 1.5rem;">Don't have an account? <a href="/tutors/create-profile">Sign up</a></p>
            </div>
        </main>
    </body>
</html>