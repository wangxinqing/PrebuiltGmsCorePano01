package defpackage;

/* renamed from: azga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azga implements azfz {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.security"));
        a = agvx.a(agvw, "ftm_enabled", true);
        agvx.a(agvw, "test_value", "New amazing default value");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
