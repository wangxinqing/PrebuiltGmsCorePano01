package defpackage;

/* renamed from: ayfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayfs implements ayfr {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.lockbox")).a("gms:lockbox:service");
        a = agvx.a(a2, "connectionless_timeout_seconds", 15);
        agvx.a(a2, "use_connectionless", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }
}
