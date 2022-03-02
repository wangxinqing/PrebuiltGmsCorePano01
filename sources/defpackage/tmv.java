package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tmv {
    public final tlh a;
    public final byte[] b;
    public final tnm c;
    public final int d;
    public final boolean e;
    public final long f;
    public final ugh g;
    public final boolean h;
    public final byte[] i;
    public final List j;
    public final aosh k;
    public auta l;

    public tmv(tlh tlh, byte[] bArr, tnm tnm, int i2, boolean z, long j2, byte[] bArr2, ugh ugh, aosh aosh, asaa[] asaaArr, boolean z2) {
        ArrayList arrayList;
        asoe asoe;
        this.a = tlh;
        this.b = bArr;
        this.c = tnm;
        this.d = i2;
        this.e = z;
        this.f = j2;
        this.i = bArr2;
        this.g = ugh;
        this.k = aosh;
        if (asaaArr != null) {
            arrayList = new ArrayList(asaaArr.length);
            for (asaa asaa : asaaArr) {
                asaa asaa2 = asaa.UNKNOWN_MEDIUM;
                asoe asoe2 = asoe.UNKNOWN_MEDIUM;
                asav asav = asav.UNKNOWN_FRAME_TYPE;
                switch (asaa.ordinal()) {
                    case 1:
                        asoe = asoe.MDNS;
                        break;
                    case 2:
                        asoe = asoe.BLUETOOTH;
                        break;
                    case 3:
                        asoe = asoe.WIFI_HOTSPOT;
                        break;
                    case 4:
                        asoe = asoe.BLE;
                        break;
                    case 5:
                        asoe = asoe.WIFI_LAN;
                        break;
                    case 6:
                        asoe = asoe.WIFI_AWARE;
                        break;
                    case 7:
                        asoe = asoe.NFC;
                        break;
                    case 8:
                        asoe = asoe.WIFI_DIRECT;
                        break;
                    case 9:
                        asoe = asoe.WEB_RTC;
                        break;
                    default:
                        asoe = asoe.UNKNOWN_MEDIUM;
                        break;
                }
                arrayList.add(asoe);
            }
        } else {
            arrayList = null;
        }
        this.j = arrayList;
        this.h = z2;
    }
}
