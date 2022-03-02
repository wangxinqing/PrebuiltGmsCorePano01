package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tdt extends bhv implements tdv {
    public tdt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        c(3, aQ);
    }

    public final void b() {
        c(2, aQ());
    }

    public final void c() {
        c(5, aQ());
    }

    public final void a(Device device, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) device);
        aQ.writeByteArray((byte[]) null);
        c(1, aQ);
    }

    public final void b(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        c(6, aQ);
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        c(4, aQ);
    }
}
