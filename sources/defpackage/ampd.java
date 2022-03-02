package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: ampd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ampd implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ ampi b;

    public ampd(ampi ampi, byte[] bArr) {
        this.b = ampi;
        this.a = bArr;
    }

    public final void run() {
        IOException iOException;
        int i = ampm.c;
        new Object[1][0] = Arrays.toString(this.a);
        this.b.b.setValue(this.a);
        try {
            ampi ampi = this.b;
            aeka aeka = ampi.a;
            aejw aejw = ampi.c;
            if (!aeka.a.notifyCharacteristicChanged(aejw.a, ampi.b, true)) {
                iOException = new IOException("internal error notifying characteristic");
                amof amof = this.b.d;
                if (amof != null) {
                    amof.a(amon.a(iOException));
                }
            }
        } catch (RuntimeException e) {
            iOException = new IOException("exception thrown when notifying characteristic", e);
        }
    }
}
