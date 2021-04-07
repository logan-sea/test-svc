package testScm;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UT_Scm {
    private String pathToQuery = "../sampleSvc/mars-rover/" +
            "src/test/resources/integration/exporter/gitlab/";

    @Test
    public void testScm() throws IOException {
        String codeJiraQuery = pathToQuery + "gitlab_code_jira_by_url.sql";

        String query = new Scanner(new File(codeJiraQuery)).useDelimiter("\\Z").next();
        Assert.assertTrue(query.length() > 0);
    }
}
