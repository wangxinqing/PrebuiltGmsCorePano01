package defpackage;

/* renamed from: awxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awxk implements awxj {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a();
        a = agvx.a(a2, "BackgroundBroadcastReceiverSupport__rate_limit_dropbox", true);
        b = agvx.a(a2, "BackgroundBroadcastReceiverSupport__rate_limit_dropbox_bank_size", 100);
        c = agvx.a(a2, "BackgroundBroadcastReceiverSupport__rate_limit_dropbox_crashes", false);
        d = agvx.a(a2, "BackgroundBroadcastReceiverSupport__rate_limit_dropbox_refresh_interval_seconds", 1);
        e = agvx.a(a2, "BackgroundBroadcastReceiverSupport__use_main_thread", true);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
