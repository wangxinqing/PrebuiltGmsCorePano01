package defpackage;

/* renamed from: ayoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayoq implements ayop {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.update"));
        a = agvx.a(agvw, "initial_sync_threshold", 4294967296L);
        b = agvx.a(agvw, "use_adaptively_aggressive_sync", false);
        c = agvx.a(agvw, "use_download_progress_decoupling", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
