package defpackage;

import java.util.List;

/* renamed from: arxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arxh implements Runnable {
    private final List a;
    private final aryb b;

    public arxh(aryb aryb, List list) {
        this.b = aryb;
        this.a = list;
    }

    public final void run() {
        aryb aryb = this.b;
        List list = this.a;
        if (aryb.a != null) {
            aryb.b.a(list);
        }
    }
}
