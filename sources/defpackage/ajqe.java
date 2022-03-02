package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: ajqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqe extends ajqd {
    public ajqe(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void a(Executor executor) {
        this.a.registerGnssStatusCallback(executor, this.e);
    }
}
