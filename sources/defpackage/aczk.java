package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: aczk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aczk extends nis {
    protected final mfg a;
    protected final adev b;
    protected final ClientContext c;
    protected final aful d;
    protected final Executor e;
    protected final FacsInternalSyncCallOptions f;

    protected aczk(String str, mfg mfg, adev adev, ClientContext clientContext, aful aful, Executor executor, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        super(220, str);
        this.a = mfg;
        this.b = adev;
        this.c = clientContext;
        this.d = aful;
        this.e = executor;
        this.f = facsInternalSyncCallOptions;
    }

    static final Object a(aorr aorr) {
        try {
            return aorr.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw new IllegalStateException("ExecutionException without cause", e2);
            }
            amtb.a(cause, eif.class);
            amtb.a(cause, babk.class);
            amtb.a(cause, babl.class);
            amtb.a(cause);
            throw new IllegalStateException(cause);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.c.c == null) {
            throw new nja(5, "Provided client context doesn't have a resolved account!");
        }
    }
}
