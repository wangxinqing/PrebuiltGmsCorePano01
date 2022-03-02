package defpackage;

/* renamed from: axkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axkp implements axko {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.gcm"));
        a = agvx.a(agvw, "gcm_check_user_unlocked_throws_exception", true);
        b = agvx.a(agvw, "DirectBoot__dont_unregister_in_direct_boot", true);
        c = agvx.a(agvw, "gcm_allow_direct_boot_mode", true);
        d = agvx.a(agvw, "gcm_direct_boot_feature", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }
}
