package defpackage;

import android.os.IBinder;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: byc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byc implements jxf {
    private final String a;

    public byc(String str) {
        this.a = str;
    }

    public final void a(Status status) {
        Object[] objArr = {this.a, status};
        if (!status.c()) {
            ((anih) ((anih) bxk.a.c()).a("byc", "a", 989, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FenceManager failed %s with %s", (Object) aqcr.a(this.a), (Object) aqcr.a(Integer.valueOf(status.i)));
        }
    }

    public final void a(Status status, Snapshot snapshot) {
    }

    public final void a(Status status, DataHolder dataHolder) {
    }

    public final void a(Status status, FenceStateImpl fenceStateImpl) {
    }

    public final void a(Status status, FenceStateMapImpl fenceStateMapImpl) {
    }

    public final void a(Status status, WriteBatchImpl writeBatchImpl) {
    }

    public final IBinder asBinder() {
        return null;
    }

    public final void b(Status status, DataHolder dataHolder) {
    }
}
