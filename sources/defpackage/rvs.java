package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvs extends bhv implements rvu {
    public rvs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final mby a(float f) {
        mby mby;
        Parcel aQ = aQ();
        aQ.writeFloat(f);
        Parcel a = a(5, aQ);
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

    public final mby b() {
        mby mby;
        Parcel a = a(4, aQ());
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

    public final mby c(String str) {
        mby mby;
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(7, aQ);
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

    public final mby a(int i) {
        mby mby;
        Parcel aQ = aQ();
        aQ.writeInt(i);
        Parcel a = a(1, aQ);
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

    public final mby b(String str) {
        mby mby;
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(3, aQ);
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

    public final mby a(Bitmap bitmap) {
        mby mby;
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bitmap);
        Parcel a = a(6, aQ);
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

    public final mby a(String str) {
        mby mby;
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(2, aQ);
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
}
