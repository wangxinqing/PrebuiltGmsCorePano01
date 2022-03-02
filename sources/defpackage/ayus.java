package defpackage;

/* renamed from: ayus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayus implements ayur {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "MenagerieBasePeopleApisLogging__menagerie_base_people_api_status_logging_enabled", false);
        b = agvx.a(agvw, "MenagerieBasePeopleApisLogging__menagerie_base_people_logging_enabled", false);
        c = agvx.a(agvw, "MenagerieBasePeopleApisLogging__menagerie_base_people_logging_sample_rate", 0.01d);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final double c() {
        return ((Double) c.c()).doubleValue();
    }
}
