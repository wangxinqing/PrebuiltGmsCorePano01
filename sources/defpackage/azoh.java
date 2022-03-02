package defpackage;

/* renamed from: azoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azoh implements azog {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.metrics"));
        a = agvx.a(agvw, "Eastworld__eastworld_task_tag_whitelist", "");
        b = agvx.a(agvw, "Eastworld__enable_eastworld_triggering_processor", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
