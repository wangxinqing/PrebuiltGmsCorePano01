package defpackage;

import java.util.concurrent.Callable;

/* renamed from: abvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abvd implements Callable {
    private final abvf a;

    public abvd(abvf abvf) {
        this.a = abvf;
    }

    public final Object call() {
        abvf abvf = this.a;
        return Boolean.valueOf(abvf.a.f.post(new abve(abvf)));
    }
}
