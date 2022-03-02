package defpackage;

import java.util.Map;

/* renamed from: mxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mxr implements Runnable {
    final /* synthetic */ Map a;

    public mxr(Map map) {
        this.a = map;
    }

    public final void run() {
        if (mxu.g != null) {
            mxu.g.a(this.a);
        }
    }
}
