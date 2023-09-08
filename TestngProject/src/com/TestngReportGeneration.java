package com;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestngReportGeneration {
    private static ExtentReports extent;
    private static ExtentTest test;

    public void setUp() {
        // Initialize ExtentReports and create an HTML report file
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
}
