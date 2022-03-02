package defpackage;

/* renamed from: azob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azob implements azoa {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.metrics"));
        a = agvx.a(agvw, "Eastworld__eastworld_alarm_frequency", 7200000);
        b = agvx.a(agvw, "Eastworld__enable_eastworld", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
