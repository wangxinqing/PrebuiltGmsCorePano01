package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: sap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sap extends bhv implements IInterface {
    public sap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMdhTimeSeriesFootprintsWriteResultCallback");
    }

    public final void a(Status status, long j) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeLong(j);
        c(1, aQ);
    }
}
