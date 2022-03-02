package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: itq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class itq extends bhv implements its {
    public itq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
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

    public final int c() {
        Parcel a = a(2, aQ());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
