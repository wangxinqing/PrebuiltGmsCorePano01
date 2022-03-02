package defpackage;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: jxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface jxi extends IInterface {
    void a(jxf jxf, String str, String str2, String str3, SnapshotRequest snapshotRequest);

    void a(jxf jxf, String str, String str2, String str3, ContextFenceStub contextFenceStub);

    void a(jxf jxf, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl);

    void a(jxf jxf, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl);

    void a(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl);

    void a(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, jxc jxc);

    void a(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, jxc jxc, PendingIntent pendingIntent);

    void a(jxf jxf, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl);

    void a(jxf jxf, String str, String str2, String str3, WriteBatchImpl writeBatchImpl);

    void a(jxf jxf, String str, String str2, String str3, jxc jxc);

    void a(jxf jxf, String str, String str2, String str3, jxc jxc, PendingIntent pendingIntent);

    void b(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl);
}
