package reports;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CucumberReport {

    public static void generateReport() {

        File reportOutputDirectory = new File("target");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/reports/cucumber.json");

        Configuration config = new Configuration(reportOutputDirectory, "REST Assured Framework");
        config.addClassifications("OS", System.getProperty("os.name"));
        config.addClassifications("Tester", "QA Automation");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
        reportBuilder.generateReports();
    }
}
