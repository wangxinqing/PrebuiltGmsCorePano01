package defpackage;

/* renamed from: awnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awnx implements awnw {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth.api.credentials"));
        a = agvx.a(agvw, "GisAssistedSigninUiSettings__maximum_peek_height_percentage", 70);
        b = agvx.a(agvw, "GisAssistedSigninUiSettings__maximum_wait_before_showing_loading_page_ms", 350);
        c = agvx.a(agvw, "GisAssistedSigninUiSettings__minimum_duration_for_showing_loading_page_ms", 1000);
        d = agvx.a(agvw, "GisAssistedSigninUiSettings__skip_password_confirmation_after_account_chooser", true);
        e = agvx.a(agvw, "GisAssistedSigninUiSettings__transition_duration_ms", 150);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }
}
