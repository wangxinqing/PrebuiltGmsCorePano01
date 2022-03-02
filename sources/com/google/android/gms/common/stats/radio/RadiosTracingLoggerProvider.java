package com.google.android.gms.common.stats.radio;

import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RadiosTracingLoggerProvider {
    private static NetworkActivityLogger a;
    private static NetworkLatencyLogger b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Logger {
        int deleteEntries(String str, long j, long j2);

        List getEvents(long j, long j2, int i, int i2);

        List getEvents(long j, long j2, int i, int i2, int i3, int i4);

        boolean isNopLogger();

        void logAsync(Object obj);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface NetworkActivityLogger extends Logger {
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface NetworkLatencyLogger extends Logger {
    }

    private RadiosTracingLoggerProvider() {
    }

    public static NetworkActivityLogger getNetworkActivityLoggerImpl() {
        return a;
    }

    public static NetworkLatencyLogger getNetworkLatencyLoggerImpl() {
        return b;
    }

    public static void setNetworkActivityLoggerImpl(NetworkActivityLogger networkActivityLogger) {
        a = networkActivityLogger;
    }

    public static void setNetworkLatencyLoggerImpl(NetworkLatencyLogger networkLatencyLogger) {
        b = networkLatencyLogger;
    }
}
