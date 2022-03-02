package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: arnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arnw implements Runnable {
    final /* synthetic */ arnz a;
    private final int b;
    private final int c;
    private final byte[] d;

    public arnw(arnz arnz, int i, int i2, byte[] bArr) {
        this.a = arnz;
        this.b = i;
        this.c = i2;
        this.d = (byte[]) bArr.clone();
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [arny, arnd] */
    public final void run() {
        arok a2 = arok.a(this.d);
        if (a2 == null) {
            new Object[1][0] = Arrays.toString(this.d);
            return;
        }
        aron a3 = this.a.f.a(a2);
        if (a3 != null && a3.a) {
            arnt arnt = a3.b;
            ? r3 = this.a.i;
            int i = this.b;
            int i2 = this.c;
            arnr arnr = r3;
            if (arnr.c(i)) {
                arnh a4 = arnr.a(i2);
                if (a4 == null) {
                    Locale locale = Locale.ENGLISH;
                    new Object[1][0] = Integer.valueOf(i2);
                    return;
                }
                aipf aipf = arnr.o;
                if (!(aipf == null || arnt == null)) {
                    aipf.a(a4, arnt.a);
                }
                r3.a(a4.b(), r3, a4, arnt);
            }
        }
    }
}
