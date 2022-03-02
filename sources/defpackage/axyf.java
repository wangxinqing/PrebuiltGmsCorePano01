package defpackage;

/* renamed from: axyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axyf implements axyd {
    public static final agvx chreCcConfig;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        try {
            chreCcConfig = agvx.a(a, "chre_cc_config", (auhw) aucj.a((aucj) auhw.a, new byte[0]), axye.a);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"chre_cc_config\"");
        }
    }

    public auhw chreCcConfig() {
        return (auhw) chreCcConfig.c();
    }

    public boolean compiled() {
        return true;
    }
}
