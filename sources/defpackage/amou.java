package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: amou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amou implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ amoz b;

    public amou(amoz amoz, byte[] bArr) {
        this.b = amoz;
        this.a = bArr;
    }

    public final void run() {
        amof amof;
        int i = ampm.c;
        new Object[1][0] = Arrays.toString(this.a);
        this.b.b.setValue(this.a);
        amoz amoz = this.b;
        if (!amoz.a.a(amoz.b) && (amof = this.b.c) != null) {
            amof.a(amon.a(new IOException("intenal error writing characteristic")));
        }
    }
}
