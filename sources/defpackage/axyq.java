package defpackage;

/* renamed from: axyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axyq implements axyp {
    public static final agvx cellFingerprintConfig;
    public static final agvx cellFingerprintHoldback;
    public static final agvx cellFingerprintHoldbackConfig;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        cellFingerprintConfig = agvx.a(a, "cell_fingerprint_config", 1);
        cellFingerprintHoldback = agvx.a(a, "cell_fingerprint_holdback", 0);
        cellFingerprintHoldbackConfig = agvx.a(a, "cell_fingerprint_holdback_config", 0);
    }

    public long cellFingerprintConfig() {
        return ((Long) cellFingerprintConfig.c()).longValue();
    }

    public long cellFingerprintHoldback() {
        return ((Long) cellFingerprintHoldback.c()).longValue();
    }

    public long cellFingerprintHoldbackConfig() {
        return ((Long) cellFingerprintHoldbackConfig.c()).longValue();
    }

    public boolean compiled() {
        return true;
    }
}
