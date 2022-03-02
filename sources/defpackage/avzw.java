package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: avzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzw {
    public final String a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public avzv f;
    public long g;
    final /* synthetic */ avzy h;

    public avzw(avzy avzy, String str) {
        this.h = avzy;
        this.a = str;
        int i = avzy.d;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < avzy.d; i2++) {
            sb.append(i2);
            this.c[i2] = new File(avzy.c, sb.toString());
            sb.append(".tmp");
            this.d[i2] = new File(avzy.c, sb.toString());
            sb.setLength(length);
        }
    }

    public static final IOException a(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() == 0 ? new String("unexpected journal line: ") : "unexpected journal line: ".concat(valueOf));
    }

    /* access modifiers changed from: package-private */
    public final avzx a() {
        baua baua;
        if (Thread.holdsLock(this.h)) {
            baua[] bauaArr = new baua[this.h.d];
            long[] jArr = (long[]) this.b.clone();
            int i = 0;
            int i2 = 0;
            while (i2 < this.h.d) {
                try {
                    bauaArr[i2] = batq.a(this.c[i2]);
                    i2++;
                } catch (FileNotFoundException e2) {
                    while (i < this.h.d && (baua = bauaArr[i]) != null) {
                        awaj.a((Closeable) baua);
                        i++;
                    }
                    return null;
                }
            }
            return new avzx(bauaArr);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public final void a(bate bate) {
        for (long i : this.b) {
            bate.h(32);
            bate.i(i);
        }
    }
}
