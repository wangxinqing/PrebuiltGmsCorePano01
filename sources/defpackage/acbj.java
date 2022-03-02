package defpackage;

import android.os.Handler;

/* renamed from: acbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acbj extends tiz {
    public final tiz a;
    private final Handler b;

    public acbj(Handler handler, tiz tiz) {
        this.b = handler;
        this.a = tiz;
    }

    public final void a(String str) {
        this.b.post(new acbi(this, str));
    }

    public final void a(String str, tiv tiv) {
        this.b.post(new acbh(this, str, tiv));
    }
}
