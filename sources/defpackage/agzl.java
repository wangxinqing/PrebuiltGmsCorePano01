package defpackage;

import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: agzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agzl implements Callable {
    private final agzm a;
    private final Uri b;
    private final agzr c;
    private final agzk[] d;

    public agzl(agzm agzm, Uri uri, agzr agzr, agzk[] agzkArr) {
        this.a = agzm;
        this.b = uri;
        this.c = agzr;
        this.d = agzkArr;
    }

    public final Object call() {
        agzm agzm = this.a;
        return agzm.a.a(this.b, this.c, this.d);
    }
}
