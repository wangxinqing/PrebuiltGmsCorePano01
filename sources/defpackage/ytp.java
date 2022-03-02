package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ytp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ytp extends bhw implements ytq {
    public ytp() {
        super("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
    }

    public static ytq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        if (queryLocalInterface instanceof ytq) {
            return (ytq) queryLocalInterface;
        }
        return new yto(iBinder);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        mby mby;
        mby mby2;
        mbw mbw = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof mby) {
                    mby = (mby) queryLocalInterface;
                    mby newPlusOneButton = newPlusOneButton(mby, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    bhx.a(parcel2, (IInterface) newPlusOneButton);
                } else {
                    mbw = new mbw(readStrongBinder);
                }
            }
            mby = mbw;
            mby newPlusOneButton2 = newPlusOneButton(mby, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            bhx.a(parcel2, (IInterface) newPlusOneButton2);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface2 instanceof mby) {
                    mby2 = (mby) queryLocalInterface2;
                    mby newPlusOneButtonWithPopup = newPlusOneButtonWithPopup(mby2, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    bhx.a(parcel2, (IInterface) newPlusOneButtonWithPopup);
                } else {
                    mbw = new mbw(readStrongBinder2);
                }
            }
            mby2 = mbw;
            mby newPlusOneButtonWithPopup2 = newPlusOneButtonWithPopup(mby2, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            bhx.a(parcel2, (IInterface) newPlusOneButtonWithPopup2);
        }
        return true;
    }
}
