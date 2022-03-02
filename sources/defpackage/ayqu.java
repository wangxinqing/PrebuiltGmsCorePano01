package defpackage;

/* renamed from: ayqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayqu implements ayqt {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "ContactsSyncCoreBugFixesY2019w42__disable_for_non_supported_form_factors", true);
        b = agvx.a(agvw, "ContactsSyncCoreBugFixesY2019w42__log_referrer_enabled", true);
        c = agvx.a(agvw, "ContactsSyncCoreBugFixesY2019w42__owner_not_found_use_fallback_fix", true);
        d = agvx.a(agvw, "ContactsSyncCoreBugFixesY2019w42__refresh_backup_sync_state_on_resume", true);
        e = agvx.a(agvw, "ContactsSyncCoreBugFixesY2019w42__show_toast_for_backup_sync_api_errors", true);
        f = agvx.a(agvw, "ContactsSyncCoreBugFixesY2019w42__use_ota_context_in_ari", true);
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

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }
}
