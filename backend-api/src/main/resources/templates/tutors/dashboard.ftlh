<#assign pageTitle="Dashboard - TutorMatch">
    <#include "/tutors/tutors-layout.ftlh">
        <main class="container flex-grow-1 py-5">
            <div class="profile-layout">
                <!--Student Profile Sidebar-->
                <aside class="profile-sidebar">
                    <div class="profile-picture">Profile Picture</div>
                    <div class="profile-information">
                        <h1>John Doe</h1>
                        <div class="profile-item">
                            <span class="profile-label">Instruction Level</span>
                            <span>K-12</span>
                        </div>
                        <div class="profile-item">
                            <span class="profile-label">Biography</span>
                            <span>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Voluptate impedit hic placeat nostrum eius vitae sapiente iste, earum deleniti perferendis totam sunt ducimus? Ab, minus officiis ut laborum delectus modi quia. Laudantium eum laborum quo cupiditate. Tenetur deserunt ea debitis amet aut officia ipsam! Nobis aperiam dolorem harum optio repudiandae iste ducimus sit quidem quisquam culpa, recusandae deleniti sequi soluta?</span>
                        </div>
                        <div class="profile-item">
                            <span class="profile-label">Date Joined</span>
                            <span>09/14/2026</span>
                        </div>
                    </div>
                    <a href="#" class="edit-button">Edit Profile</a>
                </aside>
                
                <!--Current Courses Section-->
                <section>
                    <div class="mb-4">
                        <h1>Current Students</h1>
                    </div>
                    <div class="dashboard-grid">
                        <!-- Card 1 -->
                        <a href="#" class="text-decoration-none">
                            <article class="dashboard-card">
                                <div class="card-image"><img src="../../assets/media/apple.png" alt="Student Image Description"></div>
                                <div class="card-info">
                                    <h2>Intro to Brewing</h2>
                                    <p class="card-name">Jonny Apple</p>
                                </div>
                            </article>
                        </a>
                        <!-- Card 2 -->
                        <a href="#" class="text-decoration-none">
                            <article class="dashboard-card">
                                <div class="card-image"><img src="../../assets/media/apple.png" alt="Student Image Description"></div>
                                <div class="card-info">
                                    <h2>Computer Repair</h2>
                                    <p class="card-name">Adam Shoop</p>
                                </div>
                            </article>
                        </a>
                    </div>
                </section>
            </div>
        </main>
    </body>
</html>