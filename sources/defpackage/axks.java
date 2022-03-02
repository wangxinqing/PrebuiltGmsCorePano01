package defpackage;

/* renamed from: axks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axks implements axkr {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.gcm"));
        a = agvx.a(agvw, "gcm_enable_doze_queue_clearcut_logging", true);
        b = agvx.a(agvw, "gcm_doze_queue_mode", 1);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
