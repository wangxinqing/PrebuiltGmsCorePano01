package defpackage;

import android.os.IInterface;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: jxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface jxf extends IInterface {
    void a(Status status);

    void a(Status status, Snapshot snapshot);

    void a(Status status, DataHolder dataHolder);

    void a(Status status, FenceStateImpl fenceStateImpl);

    void a(Status status, FenceStateMapImpl fenceStateMapImpl);

    void a(Status status, WriteBatchImpl writeBatchImpl);

    void b(Status status, DataHolder dataHolder);
}
