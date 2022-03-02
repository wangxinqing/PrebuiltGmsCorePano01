package defpackage;

/* renamed from: aykk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aykk implements aykj {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.measurement"));
        agvx.a(agvw, "measurement.id.max_bundles_per_iteration", 0);
        a = agvx.a(agvw, "measurement.max_bundles_per_iteration", 1);
    }

    public final boolean a() {
        return true;
    }

    public final long b() {
        return ((Long) a.c()).longValue();
    }
}
