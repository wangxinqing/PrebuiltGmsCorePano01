package com.google.android.gms.ads.internal.flag;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class g {
    public static final a a = a.a("gads:public_beta:traffic_multiplier", "1.0");
    public static final a b = a.a("gads:sdk_crash_report_class_prefix", "com.google.");
    public static final a c = a.a("gads:sdk_crash_report_enabled", false);
    public static final a d = a.a("gads:sdk_crash_report_full_stacktrace", false);

    static {
        new a("gads:dynamite_load:fail:sample_rate", 10000L, 2);
        a.a("gads:report_dynamite_crash_in_background_thread", false);
        new a("gads:trapped_exception_sample_rate", Double.valueOf(0.01d), 3);
    }
}
