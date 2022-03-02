package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: mdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mdb extends bhv implements mdd {
    public mdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final mby loadModule(mby mby, String str, byte[] bArr) {
        throw null;
    }

    public final mby loadModule2(mby mby, String str, int i, mby mby2) {
        mby mby3;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        aQ.writeString(str);
        aQ.writeInt(i);
        bhx.a(aQ, (IInterface) mby2);
        Parcel a = a(2, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby3 = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby3 = null;
        }
        a.recycle();
        return mby3;
    }

    public final mby loadModule2NoCrashUtils(mby mby, String str, int i, mby mby2) {
        mby mby3;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        aQ.writeString(str);
        aQ.writeInt(i);
        bhx.a(aQ, (IInterface) mby2);
        Parcel a = a(3, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby3 = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby3 = null;
        }
        a.recycle();
        return mby3;
    }
}
