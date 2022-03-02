package defpackage;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: tpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tpn implements Runnable {
    private final tpp a;
    private final byte[] b;
    private final boolean c;
    private final upv d;

    public tpn(tpp tpp, byte[] bArr, boolean z, upv upv) {
        this.a = tpp;
        this.b = bArr;
        this.c = z;
        this.d = upv;
    }

    public final void run() {
        tna tna;
        tpp tpp = this.a;
        byte[] bArr = this.b;
        boolean z = this.c;
        upv upv = this.d;
        if (!tpp.a.k()) {
            ((anih) tky.a.c()).a("Skipping discovery of BleAdvertisement header %s because we are no longer discovering.", (Object) tky.a(bArr));
            return;
        }
        if (!z) {
            tna = tna.a(bArr, false);
        } else {
            tna = tna.a(bArr, true);
        }
        if (tna == null) {
            jjg jjg = tky.a;
            tky.a(bArr);
        } else if (tna.a != tpp.f.h()) {
            jjg jjg2 = tky.a;
            tky.a(bArr);
        } else if (!z && !Arrays.equals(tna.b, tpp.c)) {
            jjg jjg3 = tky.a;
            tky.a(bArr);
            tky.a(tpp.c);
            tky.a(tna.b);
        } else {
            ((anih) tky.a.d()).a("Found BleAdvertisement %s (with EndpointId %s and EndpointInfo %s)", (Object) tky.a(bArr), (Object) tna.c, (Object) tky.a(tna.d));
            tmp tmp = new tmp(upv, tna.c, tna.d, tpp.b);
            tpp.d.put(upv, tmp);
            tql tql = tpp.f;
            String str = tna.c;
            String str2 = tna.e;
            tmq tmq = null;
            if (tql.k != null && !TextUtils.isEmpty(str2)) {
                Iterator it = tql.k.d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    tmq tmq2 = (tmq) it.next();
                    if (!str.equals(tmq2.b) && ampw.a(str2, tmq2.a.getAddress())) {
                        tmq = tmq2;
                        break;
                    }
                }
            }
            if (tmq != null) {
                ((anih) tky.a.c()).a("Found duplicated Bluetooth endpoint which have same MAC address (%s) but different endpointId (%s)/(%s)", (Object) tna.e, (Object) tna.c, (Object) tmq.b);
                tpp.f.c(tpp.a, (tms) tmq);
            }
            tpp.f.b(tpp.a, (tms) tmp);
            tpp.f.a(tpp.a, tna.c, asoe.BLE, 1);
            if (aymi.d()) {
                String str3 = tna.e;
                if (str3 == null) {
                    ((anih) tky.a.d()).a("No Bluetooth Classic MAC address found in %s", (Object) tky.a(bArr));
                    return;
                }
                BluetoothDevice c2 = tpp.f.j.c(str3);
                if (c2 != null) {
                    tmq tmq3 = new tmq(c2, tna.c, tna.d, tpp.b);
                    tpp.e.put(upv, tmq3);
                    tpp.f.b(tpp.a, (tms) tmq3);
                    return;
                }
                ((anih) tky.a.c()).a("A valid Bluetooth device could not be derived from the MAC address (%s) found in %s", (Object) str3, (Object) tky.a(bArr));
            }
        }
    }
}
