package com.appdynamics.extensions.extensionstarter;


import com.appdynamics.extensions.metrics.Metric;
import com.appdynamics.extensions.yml.YmlReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExtStarterTest{

    @Test
    public void testToCheckNumber2()  {
        Assert.assertTrue((1+1) == 2);

    }

}