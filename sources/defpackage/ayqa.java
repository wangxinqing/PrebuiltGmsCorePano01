package defpackage;

/* renamed from: ayqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayqa implements aypz {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.update")).b();
        a = agvx.a(b2, "update_installation_allocation_failure_retry_delay", 86400000);
        b = agvx.a(b2, "update_installation_cleanup_failure_retry_delay", 86400000);
        c = agvx.a(b2, "update_installation_enable_virtual_ab_support", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
