package defpackage;

/* renamed from: awov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awov implements awou {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_managed"));
        a = agvx.a(agvw, "AuthManaged2019W31Bugfixes__fix_null_device_data_npe", true);
        b = agvx.a(agvw, "AuthManaged2019W31Bugfixes__remove_dm_broadcast_receiver", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
