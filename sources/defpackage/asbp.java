package defpackage;

import android.bluetooth.BluetoothDevice;
import com.google.android.gms.beacon.BleSighting;

/* renamed from: asbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbp extends gth {
    final /* synthetic */ asbt a;

    public asbp(asbt asbt) {
        this.a = asbt;
    }

    public final void a(int i) {
        ((anih) ((anih) asil.a.b()).a("asbp", "a", 154, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleScan: BLE scanning failed with error=%d", i);
        this.a.b();
    }

    public final void a(int i, BleSighting bleSighting) {
        BluetoothDevice bluetoothDevice;
        byte[] a2;
        int i2;
        if (bleSighting != null && (bluetoothDevice = bleSighting.a) != null) {
            String address = bluetoothDevice.getAddress();
            gti gti = bleSighting.b;
            if (gti != null) {
                boolean z = true;
                if (this.a.d != aseu.BLE_ADVERTISE_MANUFACTURER_DATA) {
                    if (this.a.d == aseu.BLE_ADVERTISE_SCAN_RECORD) {
                        int i3 = Integer.MIN_VALUE;
                        if (((int) awqa.b()) != Integer.MIN_VALUE) {
                            i3 = bleSighting.d + ((int) awqa.b());
                        }
                        if (i3 >= -128 && i3 <= 128) {
                            i2 = i3;
                        } else {
                            i2 = bleSighting.d;
                        }
                        asbt asbt = this.a;
                        byte[] bArr = gti.e;
                        BluetoothDevice bluetoothDevice2 = bleSighting.a;
                        aseu aseu = aseu.BLE_ADVERTISE_SCAN_RECORD;
                        asbt asbt2 = this.a;
                        if (gti.a(ascn.b) == null) {
                            z = false;
                        }
                        asbt.a(bArr, bluetoothDevice2, i2, aseu, asbt2.a(z));
                        return;
                    }
                    ((anih) ((anih) asil.a.c()).a("asbp", "a", 134, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleScan: unknown bleAdvertiseDataType: %s", (Object) this.a.d);
                } else if (this.a.c.a(address) == null && (a2 = gti.a(224)) != null && a2.length > 2 && a2[1] == 16) {
                    jjg jjg = asil.a;
                    jjp.d(a2);
                    this.a.c.a(address, "");
                    asbb asbb = this.a.a;
                    BluetoothDevice bluetoothDevice3 = bleSighting.a;
                    asbb.a.put(bluetoothDevice3.getAddress(), bluetoothDevice3);
                    int i4 = a2[0] - 1;
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(a2, 2, bArr2, 0, i4);
                    this.a.a(bArr2, bleSighting.a, bleSighting.d, aseu.BLE_ADVERTISE_MANUFACTURER_DATA, this.a.a(false));
                }
            }
        }
    }

    public final void a(String str) {
        asgs asgs = this.a.f;
        aucd o = asft.c.o();
        auay a2 = auay.a(asgt.a(str));
        if (o.c) {
            o.c();
            o.c = false;
        }
        asft asft = (asft) o.b;
        a2.getClass();
        asft.a |= 1;
        asft.b = a2;
        asft asft2 = (asft) o.i();
        aucf aucf = (aucf) asgd.e.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asgd asgd = (asgd) aucf.b;
        asgd.b = 4;
        asgd.a |= 1;
        aucf aucf2 = (aucf) asev.h.o();
        if (aucf2.c) {
            aucf2.c();
            aucf2.c = false;
        }
        asev asev = (asev) aucf2.b;
        asev.f = 2;
        int i = asev.a | 16;
        asev.a = i;
        asft2.getClass();
        asev.c = asft2;
        asev.a = i | 2;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asgd asgd2 = (asgd) aucf.b;
        asev asev2 = (asev) aucf2.i();
        asev2.getClass();
        asgd2.d = asev2;
        asgd2.a |= 4;
        asgs.a(asbt.a((asgd) aucf.i()));
    }
}
