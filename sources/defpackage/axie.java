package defpackage;

/* renamed from: axie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axie implements axid {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;
    public static final agvx j;
    public static final agvx k;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.firebase.auth"));
        a = agvx.a(agvw, "firebase_auth_eid", "p");
        agvx.a(agvw, "firebase_auth_enable_clearcut", false);
        b = agvx.a(agvw, "firebase_auth_enable_headful_lite_activities", true);
        c = agvx.a(agvw, "firebase_auth_enable_phone_number_instant_validation", true);
        d = agvx.a(agvw, "firebase_auth_enable_sms_session_keep_alive", true);
        e = agvx.a(agvw, "firebase_auth_identity_toolkit_base_url", "https://www.googleapis.com/identitytoolkit/v3/relyingparty");
        f = agvx.a(agvw, "firebase_auth_require_sender_id_match_for_auto_retrieval", false);
        g = agvx.a(agvw, "firebase_auth_sms_verification_code_regex", "(?<!\\d)\\d{6}(?!\\d)");
        h = agvx.a(agvw, "firebase_auth_sms_verification_sender_id_regex", "^\\+175426319\\d{2}$");
        i = agvx.a(agvw, "firebase_auth_sms_verification_sender_ids", "44398,54398,605512,51404,50350404,56161174,ID CODE,G.CN Phone Code,Phone Code,+33644630927,+491771783652,+6285574671017,81555,63001,Google,+14159857961,+14159857962,+14159857964,+14159857965,+14159857967,+16509355854,+16509355856,+16509355857,+16509355859,+16509355861");
        j = agvx.a(agvw, "firebase_auth_sts_base_url", "https://securetoken.googleapis.com/v1");
        k = agvx.a(agvw, "firebase_auth_use_custom_chrome_tabs_in_headful_lite", true);
    }

    public final String a() {
        return (String) a.c();
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

    public final String e() {
        return (String) e.c();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final String g() {
        return (String) g.c();
    }

    public final String h() {
        return (String) h.c();
    }

    public final String i() {
        return (String) i.c();
    }

    public final String j() {
        return (String) j.c();
    }

    public final boolean k() {
        return ((Boolean) k.c()).booleanValue();
    }
}
