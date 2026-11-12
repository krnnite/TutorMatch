<#assign pageTitle="Create Profile - TutorMatch">
    <#include "/tutors/tutors-layout.ftlh">
        <!-- Main Page Content -->
        <main class="container flex-grow-1 tm-create-account-form py-5">
            <div class="editProfileBox">
                <h1 class="mb-4">Create Account</h1>
                <form>
                    <div class="inputBoxes">
                        <div class="inputGroup mb-3">
                            <label for="editName" class="form-label">Name</label>
                            <input type="text" id="editName" class="editName form-control" placeholder="Enter your first and last name">
                        </div>
                        <div class="inputGroup mb-3">
                            <label for="editUsername" class="form-label">Username</label>
                            <input type="text" id="editUsername" class="editLevel form-control" placeholder="Enter your Username">
                        </div>
                        <div class="inputGroup mb-3">
                            <label for="editEducationLevel" class="form-label">Education Level</label>
                            <select id="editEducationLevel" class="form-select editCourses">
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
                            <label for="editPassword" class="form-label">Password</label>
                            <input type="password" id="editPassword" class="editCourses form-control" placeholder="Enter your Password">
                        </div>
                        <div class="inputGroup mb-4">
                            <label for="editConfirmPassword" class="form-label">Confirm Password</label>
                            <input type="password" id="editConfirmPassword" class="editCourses form-control" placeholder="Re-Enter your Password">
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