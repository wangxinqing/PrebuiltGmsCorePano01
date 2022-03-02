package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: asbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbs extends arwm {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ aseu c;
    final /* synthetic */ int d;
    final /* synthetic */ asbt e;
    final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asbs(asbt asbt, String str, BluetoothDevice bluetoothDevice, byte[] bArr, aseu aseu, int i, int i2) {
        super(str);
        this.e = asbt;
        this.a = bluetoothDevice;
        this.b = bArr;
        this.c = aseu;
        this.d = i;
        this.f = i2;
    }

    public final void run() {
        if (this.e.f != null) {
            String address = this.a.getAddress();
            aucd o = asfp.c.o();
            auay a2 = auay.a(this.b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asfp asfp = (asfp) o.b;
            a2.getClass();
            asfp.a |= 1;
            asfp.b = a2;
            asfp asfp2 = (asfp) o.i();
            aseu aseu = this.c;
            aucd o2 = asft.c.o();
            auay a3 = auay.a(asgt.a(address));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asft asft = (asft) o2.b;
            a3.getClass();
            asft.a |= 1;
            asft.b = a3;
            asft asft2 = (asft) o2.i();
            boolean q = aymn.a.a().q();
            int i = this.d;
            int i2 = this.f;
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
            asev.f = 1;
            int i3 = asev.a | 16;
            asev.a = i3;
            asfp2.getClass();
            asev.b = asfp2;
            int i4 = i3 | 1;
            asev.a = i4;
            asev.d = aseu.e;
            int i5 = i4 | 4;
            asev.a = i5;
            asft2.getClass();
            asev.c = asft2;
            int i6 = i5 | 2;
            asev.a = i6;
            int i7 = i2 - 1;
            if (i2 != 0) {
                asev.g = i7;
                int i8 = i6 | 32;
                asev.a = i8;
                if (q) {
                    asev.a = i8 | 8;
                    asev.e = i;
                }
                if (aucf.c) {
                    aucf.c();
                    aucf.c = false;
                }
                asgd asgd2 = (asgd) aucf.b;
                asev asev2 = (asev) aucf2.i();
                asev2.getClass();
                asgd2.d = asev2;
                asgd2.a |= 4;
                this.e.f.a(asbt.a((asgd) aucf.i()));
                return;
            }
            throw null;
        }
    }
}
