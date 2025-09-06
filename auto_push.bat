@echo off
cd /d %~dp0
git add .
git commit -m "Daily update"
git push origin main
pause