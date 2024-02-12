@echo off

REM Replace with your local project directory
set LOCAL_DIR=C:\xampp\htdocs\BSCS3B2\CSE2\HANDS-ON

REM Replace with your desired remote repository URL
set REMOTE_URL=https://github.com/KMAN321/CSE2-HO1.git

REM Initialize Git repository
git init "%LOCAL_DIR%"

REM Add all files to staging area
git add "%LOCAL_DIR%\*"

REM Commit changes with a message
git commit -m "Initial commit"

REM Add remote repository
git remote add origin "%REMOTE_URL%"

REM Push changes to remote repository
git push origin master

echo Done! Your project is now in version control and pushed to the remote repository.

pause
