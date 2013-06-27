package be.appletree.ejb.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

import javax.enterprise.inject.Default;

/**
 * Created by jochen on 6/26/13.
 */
@Default
public class DefaultLog implements Log{

    private static final Logger logger = LoggerFactory.getLogger(DefaultLog.class);

    private Logger wrappedLogger;

    public DefaultLog(){
        logger.debug("DefaultLog constructed with default constructor!");
    }

    public DefaultLog(Logger logger){
        logger.debug("DefaultLog constructed with non-default constructor and logger: {}",logger);
        this.wrappedLogger = logger;
    }

    public String getName() {
        return wrappedLogger.getName();
    }

    public boolean isTraceEnabled() {
        return wrappedLogger.isTraceEnabled();
    }

    public void trace(String s) {
        wrappedLogger.trace(s);
    }

    public void trace(String s, Object o) {
        wrappedLogger.trace(s, o);
    }

    public void trace(String s, Object o, Object o2) {
        wrappedLogger.trace(s, o, o2);
    }

    public void trace(String s, Object... objects) {
        wrappedLogger.trace(s, objects);
    }

    public void trace(String s, Throwable throwable) {
        wrappedLogger.trace(s, throwable);
    }

    public boolean isTraceEnabled(Marker marker) {
        return wrappedLogger.isTraceEnabled(marker);
    }

    public void trace(Marker marker, String s) {
        wrappedLogger.trace(marker, s);
    }

    public void trace(Marker marker, String s, Object o) {
        wrappedLogger.trace(marker, s, o);
    }

    public void trace(Marker marker, String s, Object o, Object o2) {
        wrappedLogger.trace(marker, s, o, o2);
    }

    public void trace(Marker marker, String s, Object... objects) {
        wrappedLogger.trace(marker, s, objects);
    }

    public void trace(Marker marker, String s, Throwable throwable) {
        wrappedLogger.trace(marker, s, throwable);
    }

    public boolean isDebugEnabled() {
        return wrappedLogger.isDebugEnabled();
    }

    public void debug(String s) {
        wrappedLogger.debug(s);
    }

    public void debug(String s, Object o) {
        wrappedLogger.debug(s, o);
    }

    public void debug(String s, Object o, Object o2) {
        wrappedLogger.debug(s, o, o2);
    }

    public void debug(String s, Object... objects) {
        wrappedLogger.debug(s, objects);
    }

    public void debug(String s, Throwable throwable) {
        wrappedLogger.debug(s, throwable);
    }

    public boolean isDebugEnabled(Marker marker) {
        return wrappedLogger.isDebugEnabled(marker);
    }

    public void debug(Marker marker, String s) {
        wrappedLogger.debug(marker, s);
    }

    public void debug(Marker marker, String s, Object o) {
        wrappedLogger.debug(marker, s, o);
    }

    public void debug(Marker marker, String s, Object o, Object o2) {
        wrappedLogger.debug(marker, s, o, o2);
    }

    public void debug(Marker marker, String s, Object... objects) {
        wrappedLogger.debug(marker, s, objects);
    }

    public void debug(Marker marker, String s, Throwable throwable) {
        wrappedLogger.debug(marker, s, throwable);
    }

    public boolean isInfoEnabled() {
        return wrappedLogger.isInfoEnabled();
    }

    public void info(String s) {
        wrappedLogger.info(s);
    }

    public void info(String s, Object o) {
        wrappedLogger.info(s, o);
    }

    public void info(String s, Object o, Object o2) {
        wrappedLogger.info(s, o, o2);
    }

    public void info(String s, Object... objects) {
        wrappedLogger.info(s, objects);
    }

    public void info(String s, Throwable throwable) {
        wrappedLogger.info(s, throwable);
    }

    public boolean isInfoEnabled(Marker marker) {
        return wrappedLogger.isInfoEnabled(marker);
    }

    public void info(Marker marker, String s) {
        wrappedLogger.info(marker, s);
    }

    public void info(Marker marker, String s, Object o) {
        wrappedLogger.info(marker, s, o);
    }

    public void info(Marker marker, String s, Object o, Object o2) {
        wrappedLogger.info(marker, s, o, o2);
    }

    public void info(Marker marker, String s, Object... objects) {
        wrappedLogger.info(marker, s, objects);
    }

    public void info(Marker marker, String s, Throwable throwable) {
        wrappedLogger.info(marker, s, throwable);
    }

    public boolean isWarnEnabled() {
        return wrappedLogger.isWarnEnabled();
    }

    public void warn(String s) {
        wrappedLogger.warn(s);
    }

    public void warn(String s, Object o) {
        wrappedLogger.warn(s, o);
    }

    public void warn(String s, Object... objects) {
        wrappedLogger.warn(s, objects);
    }

    public void warn(String s, Object o, Object o2) {
        wrappedLogger.warn(s, o, o2);
    }

    public void warn(String s, Throwable throwable) {
        wrappedLogger.warn(s, throwable);
    }

    public boolean isWarnEnabled(Marker marker) {
        return wrappedLogger.isWarnEnabled(marker);
    }

    public void warn(Marker marker, String s) {
        wrappedLogger.warn(marker, s);
    }

    public void warn(Marker marker, String s, Object o) {
        wrappedLogger.warn(marker, s, o);
    }

    public void warn(Marker marker, String s, Object o, Object o2) {
        wrappedLogger.warn(marker, s, o, o2);
    }

    public void warn(Marker marker, String s, Object... objects) {
        wrappedLogger.warn(marker, s, objects);
    }

    public void warn(Marker marker, String s, Throwable throwable) {
        wrappedLogger.warn(marker, s, throwable);
    }

    public boolean isErrorEnabled() {
        return wrappedLogger.isErrorEnabled();
    }

    public void error(String s) {
        wrappedLogger.error(s);
    }

    public void error(String s, Object o) {
        wrappedLogger.error(s, o);
    }

    public void error(String s, Object o, Object o2) {
        wrappedLogger.error(s, o, o2);
    }

    public void error(String s, Object... objects) {
        wrappedLogger.error(s, objects);
    }

    public void error(String s, Throwable throwable) {
        wrappedLogger.error(s, throwable);
    }

    public boolean isErrorEnabled(Marker marker) {
        return wrappedLogger.isErrorEnabled(marker);
    }

    public void error(Marker marker, String s) {
        wrappedLogger.error(marker, s);
    }

    public void error(Marker marker, String s, Object o) {
        wrappedLogger.error(marker, s, o);
    }

    public void error(Marker marker, String s, Object o, Object o2) {
        wrappedLogger.error(marker, s, o, o2);
    }

    public void error(Marker marker, String s, Object... objects) {
        wrappedLogger.error(marker, s, objects);
    }

    public void error(Marker marker, String s, Throwable throwable) {
        wrappedLogger.error(marker, s, throwable);
    }
}
