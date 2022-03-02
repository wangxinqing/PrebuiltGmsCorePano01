package defpackage;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: jwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwz extends jxe {
    private idg a;
    private idg b;
    private idg c;
    private idg d;
    private final jwt e;

    protected jwz() {
        this.e = null;
    }

    public static jwz a(idg idg) {
        return new jwz((idg) null, (idg) null, (idg) null, idg, (jwt) null);
    }

    private final void b(Status status) {
        jwl jwl;
        jwt jwt = this.e;
        if (jwt != null && status.c() && (jwl = jwt.a) != null) {
            synchronized (jwl.d) {
                jwl.b = null;
                jwl.c = null;
            }
        }
    }

    public jwz(idg idg, idg idg2, idg idg3, idg idg4, jwt jwt) {
        this.a = idg;
        this.b = idg2;
        this.c = idg3;
        this.d = idg4;
        this.e = jwt;
    }

    public static jwz a(idg idg, jwt jwt) {
        return new jwz(idg, (idg) null, (idg) null, (idg) null, jwt);
    }

    public final void a(Status status) {
        idg idg = this.a;
        if (idg == null) {
            bxl.a("ContextManagerPendingResult", "Unexpected callback to onStatusResult.");
            return;
        }
        idg.a((Object) status);
        this.a = null;
        b(status);
    }

    public final void b(Status status, DataHolder dataHolder) {
        idg idg = this.b;
        if (idg != null) {
            idg.a((Object) new jww(dataHolder, status));
            this.b = null;
            b(status);
            return;
        }
        bxl.a("ContextManagerPendingResult", "Unexpected callback to onReadResult.");
    }

    public final void a(Status status, Snapshot snapshot) {
        idg idg = this.d;
        if (idg != null) {
            idg.a((Object) new jwy(status, snapshot));
            this.d = null;
            b(status);
            return;
        }
        bxl.a("ContextManagerPendingResult", "Unexpected callback to onSnapshotResult");
    }

    public final void a(Status status, DataHolder dataHolder) {
        idg idg = this.c;
        if (idg != null) {
            idg.a((Object) new jwx(dataHolder, status));
            this.c = null;
            b(status);
            return;
        }
        bxl.a("ContextManagerPendingResult", "Unexpected callback to onStateResult");
    }

    public final void a(Status status, FenceStateImpl fenceStateImpl) {
        bxl.a("ContextManagerPendingResult", "Unexpected callback to onFenceEvaluateResult");
    }

    public final void a(Status status, FenceStateMapImpl fenceStateMapImpl) {
        bxl.a("ContextManagerPendingResult", "Unexpected callback to onFenceQueryResult");
    }

    public final void a(Status status, WriteBatchImpl writeBatchImpl) {
        bxl.a("ContextManagerPendingResult", "Unexpected callback to onWriteBatchResult");
    }
}
