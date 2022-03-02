package defpackage;

/* renamed from: azle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azle implements azlc {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "allow_post_setup_pair", false);
        agvx.a(agvw, "use_fake_post_setup_helper_in_debug_build", false);
        agvx.a(agvw, "verify_post_setup_caller", false);
        try {
            agvx.a(agvw, "whitelist_third_party_clients", (auib) aucj.a((aucj) auib.b, new byte[0]), azld.a);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"whitelist_third_party_clients\"");
        }
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
