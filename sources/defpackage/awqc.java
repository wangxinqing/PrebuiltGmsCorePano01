package defpackage;

/* renamed from: awqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awqc implements awqb {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.beacon")).a("gms:bluetoothle:scan:");
        agvx.a(a2, "is_in_mock_mode", false);
        a = agvx.a(a2, "rssi_offset", -2147483648L);
        agvx.a(a2, "rssi_smooth_factor", 0.5d);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }
}
