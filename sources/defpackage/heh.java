package defpackage;

/* renamed from: heh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class heh {
    public static final byte[] a;
    public static final agvx b;
    public static final agvx c = agvx.a(j, "dev_requested_features", a);
    public static final agvx d = agvx.a(j, "module_set_list", a);
    public static final agvx e = agvx.a(j, "enable_checkin_logging", false);
    public static final ikz f = ikz.a("gms:chimera:module_packages", "com.google.android.play.games,com.google.android.gms.policy_test_support");
    public static final ikz g = ikz.a("gms:chimera:dev_module_packages", "");
    public static final ikz h = ikz.a("gms:chimera:dev_module_blacklist", "");
    public static final ikz i = ikz.a("gms:chimera:download_free_space_percent", (Long) 400L);
    private static final agvw j;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms")).a("gms:chimera:").b("Chimera__");
        j = b2;
        byte[] bArr = new byte[0];
        a = bArr;
        b = agvx.a(b2, "required_features", bArr);
    }

    public static ikz[] a() {
        return new ikz[]{f, g, i};
    }
}
