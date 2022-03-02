package defpackage;

/* renamed from: axbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axbt implements axbs {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms"));
        agvx.a(agvw, "SchedulerDatabase__enable_database_schema_version_15", true);
        a = agvx.a(agvw, "SchedulerDatabase__enable_database_schema_version_17", false);
        b = agvx.a(agvw, "SchedulerDatabase__enable_database_schema_version_18_v2", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
