package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.Arrays;

/* renamed from: tpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tpt implements Runnable {
    private final tpv a;
    private final usd b;
    private final byte[] c;
    private final byte[] d;

    public tpt(tpv tpv, usd usd, byte[] bArr, byte[] bArr2) {
        this.a = tpv;
        this.b = usd;
        this.c = bArr;
        this.d = bArr2;
    }

    public final void run() {
        tpv tpv = this.a;
        usd usd = this.b;
        byte[] bArr = this.c;
        byte[] bArr2 = this.d;
        if (!tpv.a.k()) {
            ((anih) tky.a.c()).a("Skipping discovery of NfcDevice %s because we are no longer discovering.", (Object) usd);
            return;
        }
        tpj a2 = tpj.a(bArr);
        if (a2 == null) {
            jjg jjg = tky.a;
            tky.a(bArr);
        } else if (a2.b != tpv.f.h()) {
            jjg jjg2 = tky.a;
            tky.a(bArr);
        } else if (!Arrays.equals(a2.d, tpv.c)) {
            jjg jjg3 = tky.a;
            tky.a(bArr);
            tky.a(tpv.c);
            tky.a(a2.d);
        } else {
            ((anih) tky.a.d()).a("Found NfcTag %s (with EndpointId %s and EndpointInfo %s)", (Object) a2, (Object) a2.c, (Object) tky.a(a2.e));
            tmu tmu = new tmu(usd, a2.c, a2.e, tpv.b);
            tpv.d.put(usd, tmu);
            tpv.f.b(tpv.a, (tms) tmu);
            tpv.a.a(a2.c, bArr2);
            tpv.f.a(tpv.a, a2.c, asoe.NFC, 2);
            String str = a2.f;
            if (str == null) {
                ((anih) tky.a.d()).a("No Bluetooth Classic MAC address found in NfcTag %s", (Object) a2);
                return;
            }
            BluetoothDevice c2 = tpv.f.j.c(str);
            if (c2 == null) {
                ((anih) tky.a.c()).a("A valid Bluetooth device could not be derived from the MAC address (%s) found in NfcTag %s", (Object) str, (Object) a2);
                return;
            }
            tmq tmq = new tmq(c2, a2.c, a2.e, tpv.b);
            tpv.e.put(usd, tmq);
            tpv.f.b(tpv.a, (tms) tmq);
        }
    }
}
