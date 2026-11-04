# Online Notice Board (Java)

A college notice board web application built with Java Spring Boot, Thymeleaf, HTML, CSS and H2 database.

## Features
- Separate demo login roles: Admin, Faculty and Student
- Admin/Faculty can post and edit notices
- Admin can delete notices
- Students can view and search notices
- Notice categories, important labels, posted date and expiry date
- Expired notices are hidden from the public board
- Responsive layout for desktop and mobile

## Requirements
- JDK 17 or later
- Maven 3.6+ (or use IntelliJ IDEA with Maven support)
- VS Code with Extension Pack for Java (recommended)

## Run in VS Code
1. Extract this ZIP file.
2. Open the `Online-Notice-Board-Java` folder in VS Code.
3. Install JDK 17+ and the VS Code Extension Pack for Java.
4. Open Terminal > New Terminal.
5. Run: `mvn spring-boot:run`
6. Open `http://localhost:8080`

If Maven is not installed, open the project in IntelliJ IDEA and run `NoticeBoardApplication.java`.

## Demo login accounts
| Role | Username | Password |
|---|---|---|
| Admin | admin | admin123 |
| Faculty | faculty | faculty123 |
| Student | student | student123 |

These are demonstration credentials for an academic prototype. Change them and add proper password hashing/user management before real-world use.

## Push to GitHub using VS Code
1. Create/sign in to your GitHub account.
2. On GitHub, click **New repository**.
3. Repository name: `online-notice-board-java`. Choose Public, then Create repository.
4. In VS Code, open this extracted project folder.
5. Open Source Control (left side) > **Initialize Repository**.
6. Click `+` to stage files, type commit message `Initial Online Notice Board project`, then click **Commit**.
7. Click **Publish Branch** / **Publish to GitHub**, choose your repository.
8. Copy the repository URL from GitHub. It will look like `https://github.com/YOUR-USERNAME/online-notice-board-java`.

Alternative terminal commands:
```bash
git init
git add .
git commit -m "Initial Online Notice Board project"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/online-notice-board-java.git
git push -u origin main
```
Replace `YOUR-USERNAME` with your GitHub username. Do not type the angle brackets.

## Make the website available anywhere (Render)
GitHub repository link and live website link are different. GitHub stores the source code; Render runs the Java application.
1. Push the project to GitHub first.
2. Sign in to https://render.com using GitHub.
3. Select **New** > **Web Service**, connect your `online-notice-board-java` repository.
4. Runtime/environment: Docker (Render detects the included Dockerfile).
5. Choose a service name and create the web service.
6. After deployment succeeds, Render provides a URL like `https://your-service-name.onrender.com`. Open that URL and test the login.
7. Copy that actual URL for the website/live link submission.

Note: This academic demo uses an in-memory H2 database. Notices and demo data are reset when the server restarts/redeploys. For permanent production data, configure PostgreSQL and secure account management. Render free services may sleep when inactive and take time to wake.

## Existing system and proposed improvements
See `REPORT.md` and `Online_Notice_Board_Project_Report.docx`.

## Important
This is a learning prototype, not a production-ready identity/security system. Demo accounts are hard-coded for easy evaluation. Never use real personal data or confidential college announcements on the demo deployment.
