package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: acbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acbn implements abox {
    public final Device a;
    private final tda b;

    public acbn(tda tda, Device device) {
        iva.a((Object) tda);
        this.b = tda;
        iva.a((Object) device);
        this.a = device;
    }

    public final void a() {
        acqd.a(this.b.a(this.a));
    }

    public final void a(byte[] bArr) {
        boolean z;
        tda tda = this.b;
        Device device = this.a;
        iva.a((Object) bArr);
        int length = bArr.length;
        boolean z2 = true;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (length >= 65536) {
            z2 = false;
        }
        iva.b(z2);
        iha b2 = ihb.b();
        b2.a = new tel(device, bArr);
        ((iby) tda).b(b2.a());
    }
}
