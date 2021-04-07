package testScm;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;

public class UT_Scm {

    @Test
    public void testScm() throws IOException {
        String codeJiraQuery = "integration/exporter/gitlab/Repos.sql";
        String query = (IOUtils.toString(
                getClass().getClassLoader().getResourceAsStream(codeJiraQuery)
                , Charset.defaultCharset()));
        Assert.assertTrue(query.length() > 0);
    }
}
