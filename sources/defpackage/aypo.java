package defpackage;

/* renamed from: aypo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aypo implements aypn {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.update")).b();
        a = agvx.a(b2, "update_install_enable_resume_on_reboot", false);
        b = agvx.a(b2, "update_installation_disable_sim_lock_check", true);
        c = agvx.a(b2, "update_installation_enable_encryption_bypass_for_no_lock_screen_legacy_device", false);
        agvx.a(b2, "update_installation_enable_restart_later_lock_screen_prompt", false);
        agvx.a(b2, "update_installation_enable_restart_now_lock_screen_prompt", false);
        agvx.a(b2, "update_ui_enable_lskf_state_ux", true);
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
}
