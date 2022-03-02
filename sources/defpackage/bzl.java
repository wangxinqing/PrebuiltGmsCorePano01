package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: bzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bzl implements Runnable {
    private final WriteBatchImpl a;
    private final ContextManagerClientInfo b;

    public bzl(WriteBatchImpl writeBatchImpl, ContextManagerClientInfo contextManagerClientInfo) {
        this.a = writeBatchImpl;
        this.b = contextManagerClientInfo;
    }

    public final void run() {
        cbi.p().a(this.a, this.b);
    }
}
