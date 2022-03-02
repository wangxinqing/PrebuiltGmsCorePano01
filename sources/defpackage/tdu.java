package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tdu extends bhw implements tdv {
    public tes a;
    private final tdb b;
    private Device c;

    public tdu() {
        super("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
    }

    public final void a(int i) {
        this.b.a(i);
    }

    public final void b() {
        Device device;
        this.b.a();
        tes tes = this.a;
        if (tes != null && (device = this.c) != null) {
            tes.a.b(device);
            this.c = null;
        }
    }

    public final void c() {
        this.b.b();
    }

    public final void a(Device device, byte[] bArr) {
        this.b.a(device, bArr);
        tes tes = this.a;
        if (tes != null) {
            this.c = device;
            tev tev = tes.a;
            ige a2 = tev.a.a((iby) tev, (Object) device, "connection");
            igc igc = a2.b;
            iva.a((Object) igc, (Object) "Key must not be null");
            tev.a.a((iby) tev, (igi) new tet(a2), (ihg) new teu(igc));
        }
    }

    public tdu(tdb tdb) {
        super("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
        this.b = tdb;
    }

    public final void b(String str) {
        this.b.b(str);
    }

    public final void a(String str) {
        this.b.a(str);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Device) bhx.a(parcel, Device.CREATOR), parcel.createByteArray());
                return true;
            case 2:
                b();
                return true;
            case 3:
                a(parcel.readInt());
                return true;
            case 4:
                a(parcel.readString());
                return true;
            case 5:
                c();
                return true;
            case 6:
                b(parcel.readString());
                return true;
            default:
                return false;
        }
    }
}
