<#assign pageTitle="Dashboard - TutorMatch">
    <#include "/tutors/tutors-layout.ftlh">
        <main class="container flex-grow-1 py-5">
            <div class="profile-layout">
                <!-- Tutor Profile Sidebar -->
                <aside class="profile-sidebar">
                    <div class="profile-picture">Profile Picture</div>
                    <div class="profile-information">
                        <h1>${(tutor.name)! 'User Name'}</h1>
                        <div class="profile-item">
                            <span class="profile-label">Education Level</span>
                            <span>${(tutor.educationLevel)! 'N/A'}</span>
                        </div>
                        <div class="profile-item">
                            <span class="profile-label">Biography</span>
                            <span>${(tutor.biography)! 'No biography provided yet.'}</span>
                        </div>
                        <div class="profile-item">
                            <span class="profile-label">Date Joined</span>
                            <span>${(tutor.dayJoined)! ''}</span>
                        </div>
                    </div>
                    <a href="/tutors/edit-profile" class="edit-button">Edit Profile</a>
                </aside>
                <section>
                    <div>
                        <h1>Current Students</h1>
                    </div>
                    <div class="dashboard-grid">
                        <h5>No students have registered yet...</h3>
                    </div>
                </section>
            </div>
        </main>
    </body>
</html>