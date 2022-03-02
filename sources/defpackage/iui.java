package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.SignInButtonConfig;

/* renamed from: iui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iui extends bhv implements iuk {
    public iui(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final mby newSignInButton(mby mby, int i, int i2) {
        mby mby2;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        Parcel a = a(1, aQ);
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

    public final mby newSignInButtonFromConfig(mby mby, SignInButtonConfig signInButtonConfig) {
        mby mby2;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        bhx.a(aQ, (Parcelable) signInButtonConfig);
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
}
