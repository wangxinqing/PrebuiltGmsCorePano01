package defpackage;

/* renamed from: azvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azvj implements azvh {
    public static final agvx a;

    static {
        agvw agvw = new agvw("com.google.android.westworld");
        a = agvx.a(agvw, "awp_enabled", false);
        try {
            agvx.a(agvw, "westworld_config_591770101420044721", (bci) aucj.a((aucj) bci.u, new byte[0]), azvi.a);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"westworld_config_591770101420044721\"");
        }
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
