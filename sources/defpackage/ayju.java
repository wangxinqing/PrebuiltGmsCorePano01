package defpackage;

/* renamed from: ayju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayju implements ayjt {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.measurement"));
        a = agvx.a(agvw, "measurement.collection.efficient_engagement_reporting_enabled_2", false);
        b = agvx.a(agvw, "measurement.collection.redundant_engagement_removal_enabled", false);
        agvx.a(agvw, "measurement.id.collection.efficient_engagement_reporting_enabled_2", 0);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
