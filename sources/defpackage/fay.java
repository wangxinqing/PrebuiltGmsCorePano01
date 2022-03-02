package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: fay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fay implements Callable {
    private final fbk a;

    public fay(fbk fbk) {
        this.a = fbk;
    }

    public final Object call() {
        fbk fbk = this.a;
        fbk.x = fcf.a(fbk.getContext().getApplicationContext(), fbk.c, fbk.l, new ArrayList(fbk.o), fbk.k, fbk.i);
        return amri.b(qcr.SET_DEFAULT_ACCOUNT);
    }
}
