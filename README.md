BusBuddy
--------
This is the BusBuddy project design interfaces, documented by Doxygen.


Using Git
=========
1. Download [Git](http://git-scm.com/downloads)
2. Clone the repository locally: ```git clone git@github.com:iteam-msse/busbuddy.git```
3. Import that into Eclipse or whatnot
4. After you make changes, "add" them to the list of things to be committed: ```git add .```
5. Then "commit" them locally: ```git commit -am "My Commit Messge."```
6. You will need a GitHub account for the next step, and access to the project (Kevin can do that).
7. Commit only commits locally, you must now "push" your changes back to GitHub: ```git push```


If all else fails, grab the [zip](https://github.com/iteam-msse/busbuddy/archive/master.zip), edit, and we can commit your changes for you.


Creating the PDF
================
Install [Doxygen](http://www.stack.nl/~dimitri/doxygen/download.html)
Run ```createDocument.sh```
The PDF can be found at: ```target/doxygen/busbuddy.pdf```

Sorry Windows users... the script only works for Linux/Mac right now.
