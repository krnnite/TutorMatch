
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
- **US‑1 — <short title>**  
  _Story:_ As a customer, I want … so that …  
  _Acceptance:_
  ```gherkin
  Scenario: <happy path>
    Given <preconditions>
    When  <action>
    Then  <observable outcome>
  ```

- **US‑2 — <short title>**  
  _Story:_ As a customer, I want … so that …  
  _Acceptance:_
  ```gherkin
  Scenario: <happy path>
    Given <preconditions>
    When  <action>
    Then  <observable outcome>
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
- **Performance:** description 
- **Availability/Reliability:** description
- **Security/Privacy:** description
- **Usability:** description

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