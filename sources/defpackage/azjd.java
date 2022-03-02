package defpackage;

/* renamed from: azjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azjd implements azjc {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.smart_profile")).a();
        a = agvx.a(a2, "SmartProfile__allow_client_to_hide_cards_with_local_data", true);
        agvx.a(a2, "SmartProfile__enable_cards_fragment_startup_fix", true);
        b = agvx.a(a2, "SmartProfile__hide_quick_actions_for_voice", true);
        agvx.a(a2, "SmartProfile__is_launch_test_feature_enabled", false);
        agvx.a(a2, "SmartProfile__legacy_bugfix_to_avoid_duplicate_generic_cards", true);
        c = agvx.a(a2, "SmartProfile__merge_card", true);
        d = agvx.a(a2, "SmartProfile__reporting_chain_card", true);
        e = agvx.a(a2, "SmartProfile__use_generic_card_bugfix", true);
        agvx.a(a2, "SmartProfile__v2", true);
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
}
