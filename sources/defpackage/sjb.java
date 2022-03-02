package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.SyncResult;

/* renamed from: sjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sjb extends bhv implements IInterface {
    public sjb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
    }

    public final void a(Status status, SyncResult syncResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) syncResult);
        c(1, aQ);
    }
}
