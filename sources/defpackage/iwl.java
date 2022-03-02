package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: iwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwl extends bhv implements iwn {
    public iwl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.net.ISocketFactoryCreator");
    }

    public final mby newSocketFactory(mby mby, mby mby2, mby mby3, boolean z) {
        mby mby4;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        bhx.a(aQ, (IInterface) mby2);
        bhx.a(aQ, (IInterface) mby3);
        bhx.a(aQ, z);
        Parcel a = a(1, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby4 = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby4 = null;
        }
        a.recycle();
        return mby4;
    }

    public final mby newSocketFactoryWithCacheDir(mby mby, mby mby2, mby mby3, String str) {
        mby mby4;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        bhx.a(aQ, (IInterface) mby2);
        bhx.a(aQ, (IInterface) mby3);
        aQ.writeString(str);
        Parcel a = a(2, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby4 = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby4 = null;
        }
        a.recycle();
        return mby4;
    }
}
