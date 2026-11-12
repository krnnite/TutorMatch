<#assign pageTitle="Dashboard - TutorMatch">
    <#include "/tutors/tutors-layout.ftlh">
        <main class="container flex-grow-1 py-5">
            <div class="profile-layout">
                <!-- Tutor Profile Sidebar -->
                <aside class="profile-sidebar">
                    <div class="profile-picture">Profile Picture</div>
                    <div class="profile-information">
                        <h1>${(tutor.getName())! 'User Name'}</h1>
                        <div class="profile-item">
                            <span class="profile-label">Education Level</span>
                            <span>${(tutor.getEducationLevel())! 'N/A'}</span>
                        </div>
                        <div class="profile-item">
                            <span class="profile-label">Biography</span>
                            <span>${(tutor.getBiography())! 'No biography provided yet.'}</span>
                        </div>
                        <div class="profile-item">
                            <span class="profile-label">Date Joined</span>
                            <span>${(tutor.getDayJoined())! ''}</span>
                        </div>
                    </div>
                    <a href="/tutors/edit-profile" class="edit-button">Edit Profile</a>
                </aside>
            </div>
        </main>
    </body>
</html>