package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: jyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyq extends bhv implements IInterface {
    public jyq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(1002, aQ);
    }

    public final void a(DataHolder dataHolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        b(1001, aQ);
    }
}
