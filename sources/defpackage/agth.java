package defpackage;

import java.util.concurrent.Executor;

/* renamed from: agth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agth implements agtj {
    private final agtj a;
    private final amsv b;
    private final Executor c;

    public agth(agtj agtj, amsv amsv, Executor executor) {
        this.a = agtj;
        this.b = amsv;
        this.c = executor;
    }

    private final aorr a(aorr aorr) {
        return agsv.a(aorr, this.b, this.c);
    }

    public final void close() {
        this.a.close();
    }

    public final aorr a() {
        return a(this.a.a());
    }

    public final aorr a(Iterable iterable) {
        return a(this.a.a(iterable));
    }
}
