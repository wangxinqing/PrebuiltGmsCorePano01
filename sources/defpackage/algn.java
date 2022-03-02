package defpackage;

import android.os.Bundle;

/* renamed from: algn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class algn implements Runnable {
    private final algp a;
    private final int b;
    private final Bundle c;

    public algn(algp algp, int i, Bundle bundle) {
        this.a = algp;
        this.b = i;
        this.c = bundle;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
