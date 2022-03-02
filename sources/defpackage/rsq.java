package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rsq extends bhv implements rss {
    public rsq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    public final void a(Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bundle);
        b(2, aQ);
    }

    public final void b() {
        b(3, aQ());
    }

    public final void c() {
        b(4, aQ());
    }

    public final void d() {
        b(5, aQ());
    }

    public final void e() {
        b(6, aQ());
    }

    public final mby f() {
        mby mby;
        Parcel a = a(8, aQ());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby = null;
        }
        a.recycle();
        return mby;
    }

    public final void a(rts rts) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rts);
        b(9, aQ);
    }

    public final void b(Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bundle);
        Parcel a = a(7, aQ);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }
}
