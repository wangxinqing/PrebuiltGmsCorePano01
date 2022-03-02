package defpackage;

import java.io.IOException;

/* renamed from: arsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsi implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ arsj b;

    public arsi(arsj arsj, byte[] bArr) {
        this.b = arsj;
        this.a = bArr;
    }

    public final void run() {
        try {
            this.b.b(this.a);
            this.b.k = 0;
        } catch (IOException e) {
            arsj arsj = this.b;
            int i = arsj.k + 1;
            arsj.k = i;
            if (i > 3) {
                arsj.j = false;
            }
        }
        this.b.c.set(false);
    }
}
