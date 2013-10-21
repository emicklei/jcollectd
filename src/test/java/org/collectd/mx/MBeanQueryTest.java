package org.collectd.mx;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import junit.framework.TestCase;

public class MBeanQueryTest extends TestCase {

    public void testExcludePattern() throws MalformedObjectNameException, NullPointerException {
        MBeanQuery mq = new MBeanQuery(new ObjectName("test","key","value"));
        mq.setExcludePattern("go*");
        this.assertTrue(mq.isExcluded("goaway"));
    }
    public void testEmptyExcludePattern() throws MalformedObjectNameException, NullPointerException {
        MBeanQuery mq = new MBeanQuery(new ObjectName("test","key","value"));
        this.assertFalse(mq.isExcluded("goaway"));
    }    
}
