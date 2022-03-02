package defpackage;

/* renamed from: axjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axjr implements axjq {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.gass")).a();
        a = agvx.a(a2, "Gass__skip_incremental_log_sample_rate", false);
        b = agvx.a(a2, "Gass__skip_incremental_broadcasts", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
