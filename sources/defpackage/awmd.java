package defpackage;

/* renamed from: awmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awmd implements awmc {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.auth_account")).a();
        a = agvx.a(a2, "checkin_timeout", 10000);
        b = agvx.a(a2, "remove_checkin_loader_for_pre_add_account", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
