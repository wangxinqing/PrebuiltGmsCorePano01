package defpackage;

/* renamed from: azot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azot implements azos {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        a = agvx.a(a2, "LauncherStats__enabled", true);
        b = agvx.a(a2, "LauncherStats__record_interval_secs", 604800);
        c = agvx.a(a2, "skip_upload_non_existing_dump_file", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
