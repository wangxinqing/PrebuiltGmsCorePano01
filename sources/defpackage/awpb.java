package defpackage;

/* renamed from: awpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awpb implements awpa {
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
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_managed"));
        a = agvx.a(agvw, "auth_enable_emm_setup_in_add_account_flow_for_unicorn", true);
        b = agvx.a(agvw, "auth_enable_emm_setup_in_add_user_flow_for_unicorn", true);
        c = agvx.a(agvw, "auth_enable_emm_setup_in_setup_wizard_for_unicorn", true);
        d = agvx.a(agvw, "auth_enable_set_up_work_profile_settings_entry", true);
        e = agvx.a(agvw, "auth_fetch_managing_app_for_user_url", "https://android.clients.google.com/auth/enterprise/fetch_managing_app_for_user?rt=b");
        f = agvx.a(agvw, "enable_emm_setup_in_add_account_flow", true);
        g = agvx.a(agvw, "enable_emm_setup_in_setup_wizard", true);
        h = agvx.a(agvw, "enable_remove_account_after_dm_failure_for_unicorn", true);
        i = agvx.a(agvw, "skip_education_screens_for_all_accounts", false);
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

    public final String e() {
        return (String) e.c();
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
