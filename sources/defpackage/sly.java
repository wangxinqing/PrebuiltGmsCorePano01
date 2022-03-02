package defpackage;

import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: sly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sly implements slv {
    public final amsv a;
    public final agzs b;
    public final Uri c;
    private final Executor d;

    public sly(Executor executor, amsv amsv, agzs agzs, Uri uri) {
        this.d = executor;
        this.a = amsv;
        this.b = agzs;
        this.c = uri;
    }

    public final aorr a() {
        return aooz.a(aorl.a((Callable) new slw(this), this.d), Exception.class, slx.a, (Executor) aoqm.a);
    }
}
