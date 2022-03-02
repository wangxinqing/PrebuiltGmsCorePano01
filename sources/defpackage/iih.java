package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;

/* renamed from: iih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iih extends bhv implements iij {
    public iih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.audience.dynamite.IAudienceView");
    }

    public final mby getView() {
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

    public final void initialize(mby mby, mby mby2, iim iim) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        bhx.a(aQ, (IInterface) mby2);
        bhx.a(aQ, (IInterface) iim);
        b(2, aQ);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bundle);
        b(7, aQ);
    }

    public final Bundle onSaveInstanceState() {
        Parcel a = a(6, aQ());
        Bundle bundle = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void setAudience(Audience audience) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) audience);
        b(5, aQ);
    }

    public final void setEditMode(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(3, aQ);
    }

    public final void setIsUnderageAccount(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(9, aQ);
    }

    public final void setShowEmptyText(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(4, aQ);
    }
}
