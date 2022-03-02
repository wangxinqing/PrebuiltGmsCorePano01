package defpackage;

import java.util.Collection;

/* renamed from: wef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wef implements Runnable {
    private final wgu a;
    private final aosh b;

    public wef(wgu wgu, aosh aosh) {
        this.a = wgu;
        this.b = aosh;
    }

    public final void run() {
        wgu wgu = this.a;
        aosh aosh = this.b;
        if (wgu.h != null) {
            aosh.b((Object) amzy.a((Collection) wgu.c.keySet()));
        } else {
            aosh.b((Object) amzy.h());
        }
    }
}
