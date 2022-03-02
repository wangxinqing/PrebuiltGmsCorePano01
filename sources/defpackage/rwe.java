package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rwe extends bhv implements rwg {
    public rwe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final boolean a(rwg rwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rwg);
        Parcel a = a(16, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final void b() {
        b(1, aQ());
    }

    public final String c() {
        Parcel a = a(2, aQ());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final int d() {
        Parcel a = a(17, aQ());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
