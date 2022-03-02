package defpackage;

/* renamed from: ayfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayfm {
    public static final agvx batchingEnabled;
    public static final agvx flpHalEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        batchingEnabled = agvx.a(a, "wearable_batching_enabled", false);
        flpHalEnabled = agvx.a(a, "wearable_flp_hal", 1);
    }

    public boolean batchingEnabled() {
        return ((Boolean) batchingEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long flpHalEnabled() {
        return ((Long) flpHalEnabled.c()).longValue();
    }
}
