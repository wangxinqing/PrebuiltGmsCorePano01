package defpackage;

import android.bluetooth.BluetoothDevice;
import java.io.Closeable;

/* renamed from: tnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tnc implements tlx, tpa {
    private final tph a;
    private final tlw b;
    private final String c = ulu.a(10);

    public tnc(tph tph, tlw tlw) {
        this.a = tph;
        this.b = tlw;
    }

    public final tnm a(tlh tlh, String str, arzw arzw) {
        arzp arzp = arzw.e;
        if (arzp == null) {
            arzp = arzp.d;
        }
        int i = arzp.a;
        if ((i & 1) == 0 || (i & 2) == 0) {
            throw new tlu(asnt.PROTOCOL_ERROR, 19, "BluetoothBandwidthUpgradeMedium failed to parse UpgradePathInfo.");
        }
        String str2 = arzp.b;
        String str3 = arzp.c;
        jjg jjg = tky.a;
        BluetoothDevice c2 = this.a.c(str3);
        if (c2 != null) {
            upc a2 = this.a.a(c2, str2, tlh.q(str));
            if (a2 != null) {
                tne a3 = tne.a(a2);
                if (a3 != null) {
                    return a3;
                }
                jjt.a((Closeable) a2);
                throw new tlu(asnt.MEDIUM_ERROR, 6, String.format("BluetoothBandwidthUpgradeMedium failed to create Bluetooth endpoint channel to the Bluetooth device (%s, %s) for endpoint %s", new Object[]{str2, str3, str}));
            }
            throw new tlu(asnt.MEDIUM_ERROR, 19, String.format("BluetoothBandwidthUpgradeMedium failed to connect to the Bluetooth device (%s, %s) for endpoint %s", new Object[]{str2, str3, str}));
        }
        throw new tlu(asnt.MEDIUM_ERROR, 20, String.format("BluetoothBandwidthUpgradeMedium failed to derive a valid Bluetooth device from the MAC address (%s) for endpoint %s", new Object[]{str3, str}));
    }

    public final void a() {
        this.a.b(this.c);
        jjg jjg = tky.a;
    }

    public final void a(upc upc) {
        this.b.a(new tlv(tne.a(upc), upc));
    }

    public final byte[] a(tlh tlh, String str) {
        if (!this.a.a(this.c)) {
            if (this.a.a(this.c, (tpa) this)) {
                jjg jjg = tky.a;
            } else {
                throw new tlu(asnt.MEDIUM_ERROR, 17, String.format("BluetoothBandwidthUpgradeMedium couldn't initiate the BLUETOOTH upgrade for endpoint %s because it failed to start listening for incoming Bluetooth connections.", new Object[]{str}));
            }
        }
        String b2 = this.a.b();
        if (b2 != null) {
            String str2 = this.c;
            aucd o = arzp.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arzp arzp = (arzp) o.b;
            str2.getClass();
            int i = arzp.a | 1;
            arzp.a = i;
            arzp.b = str2;
            b2.getClass();
            arzp.a = i | 2;
            arzp.c = b2;
            arzp arzp2 = (arzp) o.i();
            aucd o2 = arzw.h.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arzw arzw = (arzw) o2.b;
            arzw.b = 2;
            int i2 = arzw.a | 1;
            arzw.a = i2;
            arzp2.getClass();
            arzw.e = arzp2;
            arzw.a = i2 | 8;
            return tpk.a((arzw) o2.i());
        }
        throw new tlu(asnt.MEDIUM_ERROR, 18, String.format("BluetoothBandwidthUpgradeMedium couldn't initiate the BLUETOOTH upgrade for endpoint %s because the Bluetooth MAC address was unable to be obtained.", new Object[]{str}));
    }
}
