<#assign pageTitle="Create Profile - TutorMatch">
    <#include "/tutors/tutors-layout.ftlh">
        <!-- Main Page Content -->
        <main class="container flex-grow-1 tm-create-account-form py-5">
            <div class="editProfileBox">
                <h1 class="mb-4">Create Account</h1>
                <form action="/tutors/create-profile" method="post">
                    <input type="hidden" name="dateJoined" value="${.now?string('yyyy-MM-dd')}">
                    <div class="inputBoxes">
                        <div class="inputGroup mb-3">
                            <label for="editName" class="form-label">Name</label>
                            <input type="text" id="editName" name="name" class="editName form-control" placeholder="Enter your first and last name" required>
                        </div>
                        <div class="inputGroup mb-3">
                            <label for="editUsername" class="form-label">Username</label>
                            <input type="text" id="editUsername" name="username" class="editLevel form-control" placeholder="Enter your Username" required>
                        </div>
                        <div class="inputGroup mb-3">
                            <label for="editEducationLevel" class="form-label">Education Level</label>
                            <select id="editEducationLevel" name="educationLevel" class="form-select editCourses" required>
                                <option value="" selected disabled>Select your education level</option>
                                <option value="Highschool">Highschool</option>
                                <option value="Vocational/Trade">Vocational/Trade</option>
                                <option value="Undergraduate">Undergraduate</option>
                                <option value="Graduate">Graduate</option>
                                <option value="Post-Graduate">Post-Graduate</option>
                                <option value="Professional">Professional</option>
                            </select>
                        </div>
                        <div class="inputGroup mb-3">
                            <label for="editBiography" class="form-label">Biography</label>
                            <textarea id="editBiography" name="biography" class="editCourses form-control" rows="4" maxlength="1000" placeholder="Tell us a little about yourself (up to 1000 characters)"></textarea>
                            <div class="form-text">Maximum 1000 characters.</div>
                        </div>
                        <div class="inputGroup mb-3">
                            <label for="editPassword" class="form-label">Password</label>
                            <input type="password" id="editPassword" name="password" class="editCourses form-control" placeholder="Enter your Password" required>
                        </div>
                        <div class="inputGroup mb-4">
                            <label for="editConfirmPassword" class="form-label">Confirm Password</label>
                            <input type="password" id="editConfirmPassword" name="confirmPassword" class="editCourses form-control" placeholder="Re-Enter your Password" required>
                        </div>
                    </div>
                    <div class="editButtons d-flex gap-2">
                        <button type="submit" class="confirmButton btn btn-primary">OK</button>
                        <button type="reset" class="cancelButton btn btn-secondary">Clear</button>
                    </div>
                </form>
            </div>
        </main>
    </body>
</html>