package defpackage;

/* renamed from: azon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azon implements azom {
    public static final agvx a;

    static {
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        agvx.a(a2, "Dropbox__enable_max_error_count", false);
        a = agvx.a(a2, "DropBox__upload_interval_millis", 3600000);
        agvx.a(a2, "Dropbox__max_error_count_interval", 10);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }
}
