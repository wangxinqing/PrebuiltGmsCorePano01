package defpackage;

import java.io.Closeable;

/* renamed from: avzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzx implements Closeable {
    public final baua[] a;

    public avzx(baua[] bauaArr) {
        this.a = bauaArr;
    }

    public final void close() {
        for (baua a2 : this.a) {
            awaj.a((Closeable) a2);
        }
    }
}
