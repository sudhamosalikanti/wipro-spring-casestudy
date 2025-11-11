package com.wipro.spring.beans;

public class Test {
private String testid;
private String testTitle;
private int testMarks;

// Constructors
public Test() {}

public Test(String testid, String testTitle, int testMarks) {
this.testid = testid;
this.testTitle = testTitle;
this.testMarks = testMarks;
}

// Getters and Setters
public String getTestid() {
return testid;
}

public void setTestid(String testid) {
this.testid = testid;
}

public String getTestTitle() {
return testTitle;
}

public void setTestTitle(String testTitle) {
this.testTitle = testTitle;
}

public int getTestMarks() {
return testMarks;
}

public void setTestMarks(int testMarks) {
this.testMarks = testMarks;
}

@Override
public String toString() {
return "Test{" +
"testid='" + testid + '\'' +
", testTitle='" + testTitle + '\'' +
", testMarks=" + testMarks +
'}';
}
}