package defpackage;

/* renamed from: ayal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayal implements ayak {
    public static final agvx flpUseGpsWifiFusion;
    public static final agvx flpUsePdrWithGpsPosition;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        flpUseGpsWifiFusion = agvx.a(a, "flp_use_gps_wifi_fusion", true);
        flpUsePdrWithGpsPosition = agvx.a(a, "flp_use_pdr_with_gps_position", true);
    }

    public boolean compiled() {
        return true;
    }

    public boolean flpUseGpsWifiFusion() {
        return ((Boolean) flpUseGpsWifiFusion.c()).booleanValue();
    }

    public boolean flpUsePdrWithGpsPosition() {
        return ((Boolean) flpUsePdrWithGpsPosition.c()).booleanValue();
    }
}
