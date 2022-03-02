package defpackage;

/* renamed from: azbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azbd implements azbc {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "enable_contiguous_at_place_segments", true);
        b = agvx.a(agvw, "enable_signal_aggregation", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
