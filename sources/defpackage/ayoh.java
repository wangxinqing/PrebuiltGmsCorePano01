package defpackage;

/* renamed from: ayoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayoh implements ayog {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.octarine")).a("gms:octarine:");
        agvx.a(a2, "Guard__block_tapjacking_enabled", false);
        agvx.a(a2, "Guard__octarine_account_picker_integration_enabled", false);
        agvx.a(a2, "Guard__octarine_auto_title_fixes_enabled", false);
        a = agvx.a(a2, "Guard__octarine_dark_mode_override_enabled", false);
        agvx.a(a2, "Guard__octarine_pull_to_refresh_enabled", false);
        agvx.a(a2, "Guard__toolbar_lift_on_scroll_enabled", false);
        agvx.a(a2, "Guard__udc_js_bridge_use_facs", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
