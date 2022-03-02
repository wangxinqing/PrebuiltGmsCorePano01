package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: jxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jxd extends bhv implements jxf {
    public jxd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        b(1, aQ);
    }

    public final void b(Status status, DataHolder dataHolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) dataHolder);
        bhx.a(aQ, (Parcelable) null);
        b(2, aQ);
    }

    public final void a(Status status, Snapshot snapshot) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) snapshot);
        b(6, aQ);
    }

    public final void a(Status status, DataHolder dataHolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) dataHolder);
        b(5, aQ);
    }

    public final void a(Status status, FenceStateImpl fenceStateImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) fenceStateImpl);
        b(8, aQ);
    }

    public final void a(Status status, FenceStateMapImpl fenceStateMapImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) fenceStateMapImpl);
        b(7, aQ);
    }

    public final void a(Status status, WriteBatchImpl writeBatchImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) writeBatchImpl);
        b(3, aQ);
    }
}
