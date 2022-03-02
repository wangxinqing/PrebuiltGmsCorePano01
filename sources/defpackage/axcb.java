package defpackage;

/* renamed from: axcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axcb implements axca {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms")).b();
        a = agvx.a(b2, "SchedulerLegacy__enable_ignore_power_restrictions_for_gms_core_tasks", false);
        b = agvx.a(b2, "nts.task_filter", "");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
