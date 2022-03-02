package defpackage;

/* renamed from: ayon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayon implements ayom {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.update"));
        a = agvx.a(agvw, "enable_aggresive_space_allocation_for_all_updates", false);
        b = agvx.a(agvw, "enable_aggressive_allocation_for_security_updates", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
