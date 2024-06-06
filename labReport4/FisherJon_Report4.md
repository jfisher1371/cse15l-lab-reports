# Lab Report 4 - Vim (Week 7)

## Baseline Measurement

### Steps and Commands Executed

1. **Delete any existing forks of the repository on your GitHub account.**
   - Refer to [GitHub documentation](https://help.github.com/articles/deleting-a-repository/) on how to delete forks.

2. **Fork the repository.**
   - Navigate to the [repository](https://github.com/ucsd-cse15l-s24/lab7) and click "Fork" to create a copy in your GitHub account.
   - - Image of step 4
- :![Alternative Text](./images/step2.png)

3. **Start the timer!**

4. **Log into ieng6:**

   ```bash
   ssh j6fisher@ieng6.ucsd.edu<enter>
   pwd<enter>
   ls<enter>
    ```
   For this step I used the VSCode shortcut to log into ieng6
- Image of step 4
- :![Alternative Text](./images/step4.png)
  
---

## 5. **Clone your fork of the repository from your GitHub account using the SSH URL:**
   ```bash
   git clone git@github.com:jfisher1371/lab7.git<enter> (clone repo)
   ls<enter> (check that repo is in dir)
   cd<space>lab7<enter> (enter dir)
   ls<enter> (check dir contents)
   ```
Image of step 5
- :![Alternative Text](./images/step5.png)

---
## 6. **Run the tests to demonstrate that they fail:**
   ```bash
   <rightclick> javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java <enter> (paste compile)
   <rightclick> java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests <enter> (paste run tests)
   ```
Image of step 6
- :![Alternative Text](./images/step6.png)

---
## 7. **Edit the code file to fix the failing test using vim:**
   ```bash
   vim ListExamples.java (open file in vim)
   (curser already at correct location)
   i (insert mode)
   <backspace> (delete 1 on index1) 
   2 (turning 1 into 2)
   <esc> (exit insert mode)
   :wq<enter> (exit vim)

   ```

Image of step 7
- :![Alternative Text](./images/step7.png)
## 8. **Run the tests to demonstrate that they now succeed:**
   ```bash
   <up><up><up>javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java <enter> (recompile)
   <up><up><up> java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests <enter> (re run tests)
   ```

   Image of step 8
- :![Alternative Text](./images/step8.png)

## 9. **Commit and push the resulting change to your GitHub account:**
   ```bash
   git<space>add<space>.<enter> (git add)
   git<space>commit<space>-m<space>"fixing code" (git commit)
   git<space>push<enter> (git push)
   ```
Image of step 9
- :![Alternative Text](./images/step9.png)


