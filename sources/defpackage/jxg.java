package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: jxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jxg extends bhv implements jxi {
    public jxg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.internal.IContextManagerService");
    }

    public final void a(jxf jxf, String str, String str2, String str3, SnapshotRequest snapshotRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) jxf);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        bhx.a(aQ, (Parcelable) snapshotRequest);
        b(15, aQ);
    }

    public final void a(jxf jxf, String str, String str2, String str3, ContextFenceStub contextFenceStub) {
        throw null;
    }

    public final void a(jxf jxf, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl) {
        throw null;
    }

    public final void a(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, jxc jxc) {
        throw null;
    }

    public final void a(jxf jxf, String str, String str2, String str3, WriteBatchImpl writeBatchImpl) {
        throw null;
    }

    public final void a(jxf jxf, String str, String str2, String str3, jxc jxc) {
        throw null;
    }

    public final void b(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) jxf);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        bhx.a(aQ, (Parcelable) contextDataFilterImpl);
        bhx.a(aQ, (Parcelable) null);
        b(2, aQ);
    }

    public final void a(jxf jxf, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) jxf);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        bhx.a(aQ, (Parcelable) fenceUpdateRequestImpl);
        b(13, aQ);
    }

    public final void a(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) jxf);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        bhx.a(aQ, (Parcelable) contextDataFilterImpl);
        b(14, aQ);
    }

    public final void a(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, jxc jxc, PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) jxf);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        bhx.a(aQ, (Parcelable) contextDataFilterImpl);
        bhx.a(aQ, (Parcelable) null);
        bhx.a(aQ, (IInterface) jxc);
        bhx.a(aQ, (Parcelable) pendingIntent);
        b(5, aQ);
    }

    public final void a(jxf jxf, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) jxf);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        bhx.a(aQ, (Parcelable) interestUpdateBatchImpl);
        b(12, aQ);
    }

    public final void a(jxf jxf, String str, String str2, String str3, jxc jxc, PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) jxf);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        bhx.a(aQ, (IInterface) jxc);
        bhx.a(aQ, (Parcelable) pendingIntent);
        b(6, aQ);
    }
}
