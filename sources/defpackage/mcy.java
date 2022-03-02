package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: mcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mcy extends bhv implements mda {
    public mcy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final mby createModuleContext(mby mby, String str, int i) {
        mby mby2;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        aQ.writeString(str);
        aQ.writeInt(i);
        Parcel a = a(2, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby2 = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby2 = null;
        }
        a.recycle();
        return mby2;
    }

    public final mby createModuleContextNoCrashUtils(mby mby, String str, int i) {
        mby mby2;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        aQ.writeString(str);
        aQ.writeInt(i);
        Parcel a = a(4, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby2 = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby2 = null;
        }
        a.recycle();
        return mby2;
    }

    public final int getIDynamiteLoaderVersion() {
        Parcel a = a(6, aQ());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int getModuleVersion(mby mby, String str) {
        throw null;
    }

    public final int getModuleVersion2(mby mby, String str, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        aQ.writeString(str);
        bhx.a(aQ, z);
        Parcel a = a(3, aQ);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int getModuleVersion2NoCrashUtils(mby mby, String str, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        aQ.writeString(str);
        bhx.a(aQ, z);
        Parcel a = a(5, aQ);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
