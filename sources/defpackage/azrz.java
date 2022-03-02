package defpackage;

/* renamed from: azrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azrz implements azry {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.ulr"));
        a = agvx.a(agvw, "Ulr__enable_personalized_place_inference_reporting", false);
        b = agvx.a(agvw, "Ulr__enable_place_inference_reporting", false);
        c = agvx.a(agvw, "Ulr__place_inference_reporting_priority", 105);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }
}
