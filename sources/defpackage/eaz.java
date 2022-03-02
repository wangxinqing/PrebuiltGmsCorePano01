package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: eaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eaz extends bhv implements IInterface {
    public eaz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appstate.internal.IAppStateCallbacks");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(5005, aQ);
    }

    public final void b(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(6);
        aQ.writeInt(i);
        b(5003, aQ);
    }

    public final void a(int i, DataHolder dataHolder) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) dataHolder);
        b(5001, aQ);
    }

    public final void a(DataHolder dataHolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        b(5002, aQ);
    }
}
