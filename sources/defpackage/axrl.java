package defpackage;

/* renamed from: axrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axrl implements axrk {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing"));
        a = agvx.a(agvw, "block_action_upload_if_data_sharing_disabled", false);
        b = agvx.a(agvw, "drop_usage_reports_for_account_mismatch", false);
        agvx.a(agvw, "enable_additional_type_for_email", true);
        c = agvx.a(agvw, "enable_client_grant_slice_permission", true);
        d = agvx.a(agvw, "enable_custom_action_url_generation", false);
        e = agvx.a(agvw, "enable_failure_response_for_apitask_exceptions", false);
        f = agvx.a(agvw, "enable_on_device_sharing_control_ui", false);
        g = agvx.a(agvw, "enable_safe_app_indexing_package_removal", false);
        h = agvx.a(agvw, "enable_slice_authority_validation", false);
        i = agvx.a(agvw, "redirect_user_actions_from_persistent_to_main", false);
        agvx.a(agvw, "type_access_whitelist_enforce_platform_permissions", true);
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

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) i.c()).booleanValue();
    }
}
