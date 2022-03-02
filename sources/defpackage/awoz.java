package defpackage;

/* renamed from: awoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awoz implements awoy {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_managed"));
        a = agvx.a(agvw, "AuthManagedBugfixes__force_remove_account", true);
        b = agvx.a(agvw, "AuthManagedBugfixes__optional_device_data", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
