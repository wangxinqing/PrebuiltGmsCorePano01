package defpackage;

/* renamed from: ent  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ent {
    public static final agvx A = agvx.a(E, "valid_minutemaid_url_pattern", String.format("^https:\\/\\/[\\d\\w\\.\\-]+\\.(google\\.com|%s)\\/[\\d\\w\\/]+[\\/\\?]?", new Object[]{jli.a("gms.auth.sw_domain", "google.com").replace(".", "\\.")}));
    public static final agvx B = agvx.a(E, "token_info_endpoint", "https://www.googleapis.com/oauth2/v2/tokeninfo");
    public static final agvx C = agvx.a(E, "uncertified_notification_url", "https://support.google.com/googleplay/?p=uncertified_registration");
    public static final agvx D = agvx.a(E, "lso_revocation_server_api_path", "/oauth2/v4/");
    private static final agvw E = new agvw(yef.a("com.google.android.gms.auth_account")).a("auth_").b("auth_").a(enr.a);
    private static final agvw F = new agvw(yef.a("com.google.android.gms.auth_account")).b("auth_").a(ens.a);
    public static final agvx a = agvx.a(E, "servlet_path", "https://android.googleapis.com/auth");
    public static final agvx b = agvx.a(E, "reauth_settings_url", "https://android.googleapis.com/auth/reauthsettings");
    public static final agvx c = agvx.a(E, "work_account_managers_whitelist_enabled", false);
    public static final agvx d = agvx.a(E, "verify_pin_url", "https://android.googleapis.com/auth/verifypin");
    public static final agvx e = agvx.a(F, "checkname_servlet_path", "https://android.googleapis.com/setup/checkname");
    public static final agvx f = agvx.a(E, "dm_wipe_confirmation_url", "https://m.google.com/devicemanagement/devicestate");
    public static final agvx g = agvx.a(E, "factory_reset_protection_validation_url", "https://android.googleapis.com/auth/frp/validation");
    public static final agvx h = agvx.a(E, "lookup_account_state_url", "https://android.googleapis.com/auth/lookup/account_state?rt=b");
    public static final agvx i = agvx.a(E, "valid_oauth_url_pattern", String.format("^https:\\/\\/(accounts|gaiastaging)[\\w\\.\\-]*\\.(google\\.com|%s)\\/[\\d\\w\\/]+[\\/\\?]?", new Object[]{jli.a("gms.auth.sw_domain", "google.com").replace(".", "\\.")}));
    public static final agvx j = agvx.a(F, "minutemaid_reauth_glif_url_override", "https://accounts.google.com/embedded/reauth/v2/android?");
    public static final String k = "https://accounts.google.com/embedded/reauth/v2/android?flow=xreauth?";
    public static final agvx l = agvx.a(E, "minutemaid_daydream_url_override", "https://accounts.google.com/embedded/setup/v2/daydream");
    public static final agvx m = agvx.a(E, "minutemaid_reauth_daydream_url_override", "https://accounts.google.com/embedded/reauth/v2/daydream");
    public static final String n = "https://accounts.google.com/embedded/reauth/v2/daydream?flow=xreauth";
    public static final String o = "https://accounts.google.com/embedded/reauth/v2/androidtv?flow=xreauth";
    public static final agvx p = agvx.a(E, "minutemaid_clamshell_url_override", "https://accounts.google.com/embedded/setup/ngc224?");
    public static final agvx q = agvx.a(F, "minutemaid_reauth_sw_url_override", String.format("https://accounts.%s/embedded/reauth/sw", new Object[]{jli.a("gms.auth.sw_domain", "google.com")}));
    public static final agvx r = agvx.a(F, "minutemaid_reauth_url_override", "https://accounts.google.com/embedded/reauth/android");
    public static final String s = "https://accounts.google.com/embedded/reauth/android?flow=xreauth";
    public static final agvx t = agvx.a(F, "minutemaid_sw_url_override", String.format("https://accounts.%s/embedded/setup/sw", new Object[]{jli.a("gms.auth.sw_domain", "google.com")}));
    public static final agvx u = agvx.a(E, "account_settings_sw_url", String.format("https://settings.%s", new Object[]{jli.a("gms.auth.sw_domain", "google.com")}));
    public static final agvx v = agvx.a(E, "minutemaid_tv_url_override", "https://accounts.google.com/embedded/setup/v2/androidtv");
    public static final agvx w = agvx.a(F, "minutemaid_glif_url_override", "https://accounts.google.com/embedded/setup/v2/android?");
    public static final agvx x = agvx.a(F, "minutemaid_url_override", "https://accounts.google.com/embedded/setup/android?");
    public static final agvx y = agvx.a(F, "minutemaid_uncertified_url", "https://www.google.com/android/uncertified/warning?");
    public static final agvx z = agvx.a(F, "setup_servlet_path", "https://android.googleapis.com/setup");

    static {
        agvx.a(E, "minutemaid_auto_url_override", "https://accounts.google.com/embedded/setup/v2/androidauto");
        agvx.a(E, "minutemaid_uncertified_auto_url_override", "https://www.google.com/android/uncertified/warningauto");
        agvx.a(E, "minutemaid_auto_reauth_url_override", "https://accounts.google.com/embedded/reauth/v2/androidauto/androidreauth");
    }

    public static boolean A() {
        return awla.a.a().h();
    }

    public static boolean B() {
        return awla.a.a().g();
    }

    public static boolean C() {
        return awla.a.a().f();
    }

    public static boolean D() {
        return awla.a.a().e();
    }

    public static boolean E() {
        return awlp.a.a().t();
    }

    public static boolean F() {
        return awlp.a.a().v();
    }

    public static boolean G() {
        return awlp.a.a().u();
    }

    public static boolean H() {
        return awlp.a.a().r();
    }

    public static double I() {
        return awlp.a.a().j();
    }

    public static int J() {
        return (int) awlp.a.a().k();
    }

    public static String K() {
        return awlp.a.a().H();
    }

    public static String L() {
        return awlp.a.a().I();
    }

    public static boolean M() {
        return awla.a.a().c();
    }

    public static boolean N() {
        return awla.a.a().d();
    }

    public static boolean O() {
        return awlp.a.a().L();
    }

    public static boolean P() {
        return awlp.a.a().x();
    }

    public static boolean Q() {
        return awlp.a.a().M();
    }

    public static boolean R() {
        return awlp.a.a().G();
    }

    public static String S() {
        return awlp.a.a().Q();
    }

    public static long T() {
        return awlp.a.a().S();
    }

    public static String U() {
        return awlp.a.a().T();
    }

    public static boolean V() {
        return awlp.a.a().z();
    }

    public static boolean W() {
        return awlp.a.a().D();
    }

    public static long X() {
        return awlp.a.a().Y();
    }

    public static String Y() {
        return awlp.a.a().V();
    }

    public static boolean Z() {
        return awlp.a.a().E();
    }

    public static long a() {
        return awjv.a.a().a();
    }

    public static boolean aA() {
        return awlp.a.a().g();
    }

    public static boolean aB() {
        return awlp.a.a().ab();
    }

    public static int aC() {
        return (int) awlp.a.a().l();
    }

    public static String aD() {
        return (String) a.c();
    }

    public static String aE() {
        return (String) h.c();
    }

    public static String aF() {
        return (String) z.c();
    }

    public static String aG() {
        return (String) f.c();
    }

    public static String aH() {
        return (String) A.c();
    }

    public static String aI() {
        return (String) B.c();
    }

    public static boolean aa() {
        return awlp.a.a().h();
    }

    public static String ab() {
        return awlp.a.a().ah();
    }

    public static boolean ac() {
        return awlp.a.a().aj();
    }

    public static long ad() {
        return awlp.a.a().ai();
    }

    public static boolean ae() {
        return awlp.a.a().F();
    }

    public static long af() {
        return awlp.a.a().f();
    }

    public static long ag() {
        return awlp.a.a().af();
    }

    public static long ah() {
        return awlp.a.a().aa();
    }

    public static int ai() {
        return (int) awla.a.a().i();
    }

    public static long aj() {
        return awla.a.a().j();
    }

    public static boolean ak() {
        return awlp.a.a().c();
    }

    public static boolean al() {
        return awlp.a.a().B();
    }

    public static boolean am() {
        return awlp.a.a().a();
    }

    public static boolean an() {
        return awlp.a.a().b();
    }

    public static boolean ao() {
        return awlp.a.a().R();
    }

    public static double ap() {
        return awlp.a.a().O();
    }

    public static boolean aq() {
        return awlp.a.a().w();
    }

    public static long ar() {
        return awlp.a.a().W();
    }

    public static boolean as() {
        return awlp.a.a().ac();
    }

    public static int at() {
        return (int) awlp.a.a().ae();
    }

    public static String au() {
        return awlp.a.a().ad();
    }

    public static boolean av() {
        return awlp.a.a().Z();
    }

    public static boolean aw() {
        return awlp.a.a().N();
    }

    public static long ax() {
        return awlp.a.a().X();
    }

    public static boolean ay() {
        return awlp.a.a().A();
    }

    public static boolean az() {
        return awlp.a.a().i();
    }

    public static long b() {
        return awjv.a.a().b();
    }

    public static String c(boolean z2) {
        return !z2 ? (String) m.c() : n;
    }

    public static double d() {
        return awjy.a.a().a();
    }

    public static boolean e() {
        return awls.a.a().a();
    }

    public static String f() {
        return awmk.a.a().a();
    }

    public static boolean g() {
        return awmq.a.a().a();
    }

    public static String h() {
        return awmq.a.a().c();
    }

    public static boolean i() {
        return awmq.a.a().b();
    }

    public static gqv j() {
        return awnc.a.a().a();
    }

    public static boolean k() {
        return awlp.a.a().K();
    }

    public static boolean l() {
        return awlp.a.a().y();
    }

    public static boolean m() {
        return awlp.a.a().d();
    }

    public static long n() {
        return awlp.a.a().e();
    }

    public static long o() {
        return awlp.a.a().o();
    }

    public static long p() {
        return awlp.a.a().n();
    }

    public static long q() {
        return awlp.a.a().P();
    }

    public static boolean r() {
        return awlp.a.a().C();
    }

    public static boolean s() {
        return awlp.a.a().s();
    }

    public static double t() {
        return awlp.a.a().J();
    }

    public static double u() {
        return awlp.a.a().m();
    }

    public static String v() {
        return awlp.a.a().ag();
    }

    public static long w() {
        return awla.a.a().a();
    }

    @Deprecated
    public static String x() {
        return awla.a.a().b();
    }

    public static long y() {
        return awlp.a.a().p();
    }

    public static long z() {
        return awlp.a.a().q();
    }

    public static boolean c() {
        return awjp.a.a().a();
    }

    public static String a(boolean z2) {
        return !z2 ? awlp.a.a().U() : o;
    }

    public static String b(boolean z2) {
        return !z2 ? (String) j.c() : k;
    }

    public static String d(boolean z2) {
        return !z2 ? (String) r.c() : s;
    }
}
