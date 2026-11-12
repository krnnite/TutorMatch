<#assign pageTitle="Edit Profile - TutorMatch">
    <#include "/tutors/tutors-layout.ftlh">
        <!-- Main Page Content -->
        <main class="container flex-grow-1 py-5">
            <div class="editProfileBox">
                <h1 class="mb-4">Edit Profile</h1>
                <form>
                    <div class="inputBoxes">
                        <div class="inputGroup mb-3">
                            <label for="editName" class="form-label">Name</label>
                            <input type="text" id="editName" class="editName form-control" placeholder="Enter your first and last name">
                        </div>
                        <div class="inputGroup mb-3">
                            <label for="editEducationLevel" class="form-label">Education Level</label>
                            <select id="editEducationLevel" class="form-select editLevel">
                                <option value="" selected disabled>Select your education level</option>
                                <option value="Highschool">Highschool</option>
                                <option value="Vocational/Trade">Vocational/Trade</option>
                                <option value="Undergraduate">Undergraduate</option>
                                <option value="Graduate">Graduate</option>
                                <option value="Post-Graduate">Post-Graduate</option>
                                <option value="Professional">Professional</option>
                            </select>
                        </div>
                        <div class="inputGroup mb-4">
                            <label for="editBiography" class="form-label">Biography</label>
                            <textarea id="editBiography" class="editCourses form-control" rows="4" maxlength="1000" placeholder="Tell us a little about yourself (up to 1000 characters)"></textarea>
                            <div class="form-text">Maximum 1000 characters.</div>
                        </div>
                    </div>
                    <div class="editButtons d-flex gap-2">
                        <button type="submit" class="confirmButton btn btn-primary">Save Changes</button>
                        <!-- Goes to dashboard -->
                        <button type="button" class="cancelButton btn btn-secondary" onclick="location.href='#'">Cancel</button>
                    </div>
                </form>
            </div>
        </main>
    </body>
</html>