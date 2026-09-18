
# Requirements – Starter Template

**Project Name:** TutorMatch \
**Team:** Kieren Williamson - Provider, Clayton Bittner - Customer \
**Course:** CSC 340\
**Version:** 1.0\
**Date:** 2026-09-17

---

## 1. Overview
**Vision.** TutorMatch is an online student-tutor matching service. Students can create a profile with TutorMatch detailing their academic level and goals and quickly match with a selection of tutors that can be help them succeed. Tutors are able to set their availability and expertise and manage the students they've been matched with so they can provide a quality service to their clients.

**Glossary** Terms used in the project
- **Student:** A learner who has chosen to use the TutorMatch service to find an instructor for their desired subject(s); also known as a client
- **Tutor:** An academic instructor that has chosen to use the TutorMatch service to find students to instruct; also known as a provider
- **Profile:** A collection of information about a user, including personal details, academic goals, and preferences.

**Primary Users / Roles.**
- **Customer (e.g., Student/Patient/Pet Owner/etc. )** — Find a knowledgeable and available tutor.
- **Provider (e.g., Teacher/Doctor/Pet Sitter/etc. )** — Acquire clients and manage client data.
- **SysAdmin (optional)** — N/A.

**Scope (this semester).**
- User profiles (students and tutors)
- Write/Read reviews (Students) and Read self reviews (Tutors)
- Browse students/tutors
- Select/add tutors to student dashboard
- Add students to tutor dashboard

**Out of scope (deferred).**
- File exchange between providers and users
- Video chat feature between providers and users

> This document is **requirements‑level** and solution‑neutral; design decisions (UI layouts, API endpoints, schemas) are documented separately.

---

## 2. Functional Requirements (User Stories)
Write each story as: **As a `<role>`, I want `<capability>`, so that `<benefit>`.** Each story includes at least one **Given/When/Then** scenario.

### 2.1 Customer Stories
- **US‑1 — Making a Student Profile**  
  _Story:_ As a customer, I want to be able to make a profile so that providers can see my information.  
  _Acceptance:_
  ```gherkin
  Scenario: Making a Student Profile
    Given I am logged in as a Student
    When  I click on "my profile" and select edit
    Then  I can update information tied to my account
  ```

- **US‑2 — Writing Reviews**  
  _Story:_ As a customer, I want to leave reviews on services so tutors can get feedback.  
  _Acceptance:_
  ```gherkin
  Scenario: Student writing reviews on services
    Given Logged in as a Student
    When  Going to a enrolled tutors page there will be a text box for reviews
    Then  The tutor will recieve my feedback I left.
  ```

- **US‑3 — Viewing Potential Tutors**  
  _Story:_ As a customer, I want to browse a list of available tutors  
  _Acceptance:_
  ```gherkin
  Scenario: Browsing avaliable tutors
    Given When logged in as a Student
    When  On the student homepage
    Then  A list of avalible tutors will be shown with a search bar.
  ```

- **US‑4 — Viewing Current Tutors**  
  _Story:_ As a customer, I want … so that …  
  _Acceptance:_
  ```gherkin
  Scenario: Viewing currently enrolled tutors
    Given When logged in as a Student
    When  Going to the "my profile" page
    Then  There will be a list of tutors you are currently connected with.
  ```

### 2.2 Provider Stories
- **US-5 — Making a Tutor Profile**  
  _Story:_ As a provider, I want to make a profile so that students can see my experience and qualifications 
  _Acceptance:_
  ```gherkin
  Scenario: Making a Tutor Profile
    Given I am logged in as a tutor
    When  I click on the 'my profile' button and select 'edit'
    Then  I can update my profile
    And   Users will see the reflected changes
  ```

- **US-6 — Reviews - Provider View**  
  _Story:_ As a provider, I want to be able to view reviews of my services so I can improve my offerings
  _Acceptance:_
  ```gherkin
  Scenario: Viewing reviews as a provider
    Given I am logged in as a tutor
    When  a student writes a review on my profile
    Then  I should be able to view reviews on my dashboard
  ```

- **US-7 — View Current Students**  
  _Story:_ As a provider, I want to be able to view the students I'm tutoring so I can keep track of them and tailor their learning
  _Acceptance:_
  ```gherkin
  Scenario: Viewing Current Students
    Given I am logged in as a tutor
    When  I navigate to my tutor dashboard
    Then  I should be able to view all the students that I have to tutor
  ```

- **US-8 — Create Private Notes**  
  _Story:_ As a provider, I want to be to write private notes for myself about my students so I can remember quick, key details
  _Acceptance:_
  ```gherkin
  Scenario: Writing a Private Note on a Student
    Given I am logged in as a tutor
    When  I click on a student from my dashboard
    Then  I should be able to attach a note to their information that only I can see
  ```

### 2.3 SysAdmin Stories
- **US‑30 — <short title>**  
  _Story:_ As a sysadmin, I want … so that …  
  _Acceptance:_
  ```gherkin
  Scenario: <happy path>
    Given <preconditions>
    When  <action>
    Then  <observable outcome>
  ```

- **US‑31 — <short title>**  
  _Story:_ As a sysadmin, I want … so that …  
  _Acceptance:_
  ```gherkin
  Scenario: <happy path>
    Given <preconditions>
    When  <action>
    Then  <observable outcome>
  ```

---

## 3. Non‑Functional Requirements (make them measurable)
- **Performance:** 95% of server requests such as reaching out to a tutor/student should be processed in 10 seconds.  
- **Availability/Reliability:** The service should be online 95% of the time, with scheduled maintenance made clear.  
- **Security/Privacy:** The service will have the users create logins, and that information should be encrypted and protected.
- **Usability:** New users should be able to navigate with ease, able to find a course within 5 min of creating a account.

---

## 4. Assumptions, Constraints, and Policies
- Modern browser, viewing on a desktop--mobile not supported.

---

## 5. Milestones (course‑aligned)
- **M1 Requirements** — this file + stories opened as issues. 
- **M2 High‑fidelity prototype** — core customer/provider flows fully interactive. 
- **M3 Design** — architecture, schema, API outline. 
- **M4 Backend API** — key endpoints + tests. 
- **M5 Increment** — ≥2 use cases end‑to‑end. 
- **M6 Final** — complete system & documentation. 

---

## 6. Change Management
- Stories are living artifacts; changes are tracked via repository issues and linked pull requests.  
- Major changes should update this SRS.