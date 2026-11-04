# ONLINE NOTICE BOARD – PROJECT REPORT

## 1. Abstract
The Online Notice Board is a Java-based web application designed to share college announcements through a single digital platform. In the existing approach, notices are commonly displayed on physical boards or shared through separate communication groups. Students may miss updates when they do not visit the notice board regularly. This project provides a central website where administrators and faculty members can publish notices and students can view or search them. The system includes role-based access, notice categories, important labels, search and expiry dates.

## 2. Introduction
Communication is an important activity in every educational institution. Colleges publish information about examinations, holidays, events, placements, sports and other activities. A traditional notice board requires students to visit a particular location to read updates. Digital messages may also be spread across multiple groups and platforms. The Online Notice Board brings these updates together in one web application that can be accessed through a browser.

## 3. Existing System / Model
The existing system mainly uses physical notice boards, printed circulars, classroom announcements and messaging groups. Notices are pinned to boards or sent separately by staff members. Students must check different sources to get complete information. Old notices may remain displayed even after they are no longer relevant.

## 4. Where Is the Existing System Used?
Physical and digital notice-sharing methods are used in colleges, schools, departments, offices, libraries and other institutions. In colleges, they are commonly used for examination timetables, event announcements, holiday information, placement updates and department circulars.

## 5. Limitations of the Existing System
- Students may not see a physical notice if they are absent from campus.
- Information can be scattered across different groups and channels.
- Searching for an older announcement is difficult.
- Important notices may not receive enough attention.
- Expired notices can remain on a physical board.
- Updating or removing printed notices requires manual work.

## 6. Proposed System
The proposed Online Notice Board is a centralized web application developed using Java Spring Boot. Admin and faculty users can publish notices through a form. Students can log in to view notices and search by title or content. Notices are organized by category and can be marked as important. Each notice can include a posting date and expiry date. Expired notices are automatically hidden from the public notice list.

## 7. New Features / Ideas Added
1. **Role-based login:** Separate Admin, Faculty and Student demo roles.
2. **Digital notice publishing:** Faculty and Admin can post notices online.
3. **Notice management:** Faculty can edit notices; Admin can edit and delete notices.
4. **Category filter information:** Notices can be classified as Announcement, Exam, Event, Holiday, Placement, Sports or Other.
5. **Search:** Users can search notice titles and content.
6. **Important notice label:** Urgent information can be highlighted.
7. **Expiry date:** Expired notices are hidden automatically.
8. **Responsive interface:** The pages adapt to desktop and mobile screens.
9. **Centralized access:** Notices are available from one website instead of multiple channels.

## 8. Technologies Used
- Programming language: Java 17
- Backend framework: Spring Boot
- User interface: HTML, CSS and Thymeleaf templates
- Database: H2 Database
- Build tool: Maven
- Development environment: Visual Studio Code
- Version control: Git and GitHub
- Hosting option: Render

## 9. System Modules
### 9.1 Login Module
Users enter a username and password. The application assigns a role to the authenticated demo account and displays permitted actions.

### 9.2 Admin Module
The Admin can view notices, post new notices, edit existing notices and delete notices.

### 9.3 Faculty Module
Faculty can publish notices and edit notice information. This helps departments share academic and campus updates.

### 9.4 Student Module
Students can view published notices and search for information. Student accounts do not display notice creation or deletion controls.

### 9.5 Notice Management Module
A notice contains a title, description, category, publisher, posting date, expiry date and important status.

## 10. Working Procedure
1. The user opens the Online Notice Board website.
2. The user signs in using the relevant demo account.
3. Admin or Faculty selects the Post a Notice option.
4. The user enters the title, category, details and expiry date.
5. The application stores the notice in the database.
6. Students open the notice board and read the latest announcements.
7. Users can search for a notice using a keyword.
8. Expired notices are excluded from the displayed list.

## 11. System Requirements
**Hardware:** Computer or laptop, minimum 4 GB RAM recommended, internet connection for hosted access.

**Software:** JDK 17+, Maven, Visual Studio Code or IntelliJ IDEA, modern web browser and Git.

## 12. Advantages
- Reduces dependence on paper notices.
- Makes campus information easier to access.
- Provides a single location for announcements.
- Saves time in publishing and finding information.
- Helps highlight important updates.
- Supports access through desktop and mobile browsers.

## 13. Limitations
- This version uses demonstration accounts with hard-coded credentials.
- The H2 database is in-memory, so data is reset after application restart or redeployment.
- Email, SMS and push notifications are not included.
- The application requires an internet connection when accessed through public hosting.
- Production use requires secure authentication, password hashing, database backups and institutional approval.

## 14. Future Enhancements
- Connect a permanent PostgreSQL database.
- Add secure registration and password encryption.
- Add email or mobile notifications.
- Allow PDF and image attachments.
- Add department-wise notice visibility.
- Add approval workflow before publishing.
- Add an audit log for notice changes.

## 15. Conclusion
The Online Notice Board provides a simple digital solution for college communication. It allows Admin and Faculty users to publish and manage announcements while students can view and search for updates from a centralized website. The project improves the accessibility and organization of campus information. Future improvements can make it suitable for larger institutional use.

## 16. GitHub and Live Website
GitHub Repository: Add your repository URL after pushing the project.

Live Website: Add the Render URL after successful deployment.

## 17. References
1. Oracle Java Documentation – https://docs.oracle.com/en/java/
2. Spring Boot Documentation – https://docs.spring.io/spring-boot/index.html
3. Thymeleaf Documentation – https://www.thymeleaf.org/documentation.html
4. H2 Database – https://www.h2database.com/
5. GitHub Docs – https://docs.github.com/
6. Render Documentation – https://render.com/docs
