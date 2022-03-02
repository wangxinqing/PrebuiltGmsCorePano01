package defpackage;

/* renamed from: aygn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aygn implements aygm {
    public static final agvx a;

    static {
        agvw a2 = new agvw("com.google.android.gms.lockbox").a("gms:lockbox:service");
        agvx.a(a2, "check_whitelist_via_flag", true);
        a = agvx.a(a2, "sign_in_package_whitelist", "com.android.vending,com.google.android.googlequicksearchbox,com.google.android.gms.apitest,com.google.android.apps.assistant,com.google.android.apps.searchlite,com.google.android.carassistant");
    }

    public final String a() {
        return (String) a.c();
    }
}
