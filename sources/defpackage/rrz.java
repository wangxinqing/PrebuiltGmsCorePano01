package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: rrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rrz extends bhv implements rsb {
    public rrz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final mby a(float f) {
        mby mby;
        Parcel aQ = aQ();
        aQ.writeFloat(f);
        Parcel a = a(4, aQ);
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
        Parcel a = a(1, aQ());
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

    public final mby c() {
        mby mby;
        Parcel a = a(2, aQ());
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

    public final mby a(float f, float f2) {
        mby mby;
        Parcel aQ = aQ();
        aQ.writeFloat(f);
        aQ.writeFloat(f2);
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

    public final mby b(float f) {
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

    public final mby a(float f, int i, int i2) {
        mby mby;
        Parcel aQ = aQ();
        aQ.writeFloat(f);
        aQ.writeInt(i);
        aQ.writeInt(i2);
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

    public final mby a(CameraPosition cameraPosition) {
        mby mby;
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) cameraPosition);
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

    public final mby a(LatLng latLng) {
        mby mby;
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) latLng);
        Parcel a = a(8, aQ);
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

    public final mby a(LatLng latLng, float f) {
        mby mby;
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) latLng);
        aQ.writeFloat(f);
        Parcel a = a(9, aQ);
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

    public final mby a(LatLngBounds latLngBounds, int i) {
        mby mby;
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) latLngBounds);
        aQ.writeInt(i);
        Parcel a = a(10, aQ);
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

    public final mby a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        mby mby;
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) latLngBounds);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        aQ.writeInt(i3);
        Parcel a = a(11, aQ);
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
