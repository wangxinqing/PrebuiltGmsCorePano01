package defpackage;

/* renamed from: awlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awlc implements awlb {
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

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_account"));
        agvx.a(agvw, "d2d_account_setup_enabled", true);
        a = agvx.a(agvw, "d2d_cancel_duration", 5000);
        agvx.a(agvw, "d2d_client_backoff_multiplier", 1.0d);
        agvx.a(agvw, "d2d_client_max_retries", 3);
        agvx.a(agvw, "d2d_client_timeout_duration_ms", 2500);
        b = agvx.a(agvw, "d2d_notification_uri_format", "https://support.google.com/mobile/?p=tap_and_go");
        c = agvx.a(agvw, "d2d_source_enabled", false);
        d = agvx.a(agvw, "enable_droidguard", false);
        e = agvx.a(agvw, "enable_emm_reauth_broadcast", true);
        f = agvx.a(agvw, "enable_emm_setup_in_setup_wizard", true);
        g = agvx.a(agvw, "enable_remove_account_after_dm_failure_for_unicorn", true);
        h = agvx.a(agvw, "enable_suppress_google_services_screen_for_unicorn", true);
        agvx.a(agvw, "minutemaid_securitykey_omit_origin", false);
        i = agvx.a(agvw, "uncertified_status", 0);
        j = agvx.a(agvw, "uncertified_status_expiration_time_ms", 0);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final String b() {
        return (String) b.c();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }

    public final long j() {
        return ((Long) j.c()).longValue();
    }
}
