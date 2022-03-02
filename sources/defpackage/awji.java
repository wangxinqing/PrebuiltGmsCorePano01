package defpackage;

/* renamed from: awji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awji implements awjh {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.auth_account")).a();
        agvx.a(a2, "CarSignInFlow__enable_android_signin_option", true);
        agvx.a(a2, "CarSignInFlow__enable_iPhone_signin_option", true);
        agvx.a(a2, "CarSignInFlow__enable_multi_signin_options", true);
        agvx.a(a2, "CarSignInFlow__magic_wand_url", "https://accounts.google.com/embedded/seconddevice/androidauto");
        agvx.a(a2, "CarSignInFlow__no_fast_pair_instructions_on_single_ble_advertiser", true);
        agvx.a(a2, "CarSignInFlow__only_allow_one_account", true);
        agvx.a(a2, "CarSignInFlow__pass_setup_wizard_state_to_signed_in_activity", true);
        a = agvx.a(a2, "CarSignInFlow__use_auto_auth_delegate", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
