package defpackage;

import java.util.Arrays;

/* renamed from: ampg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ampg implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ ampi b;

    public ampg(ampi ampi, byte[] bArr) {
        this.b = ampi;
        this.a = bArr;
    }

    public final void run() {
        int i = ampm.c;
        new Object[1][0] = Arrays.toString(this.a);
        amof amof = this.b.d;
        if (amof != null) {
            amof.a(this.a);
        }
    }
}
