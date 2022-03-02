package defpackage;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: amdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amdn implements amdg {
    private static final Charset d = Charset.forName("UTF-8");
    public final OutputStream a;
    public int b = 0;
    public amdc c;
    private final byte[] e;

    public amdn(OutputStream outputStream) {
        this.a = outputStream;
        this.e = new byte[1048576];
    }

    public final void a() {
        this.a.write(Integer.toString(this.b).getBytes(d));
        this.a.write(10);
        this.a.write(this.e, 0, this.b);
        this.a.write(10);
        this.b = 0;
    }

    public final void b() {
        if (this.c != null) {
            this.a.write(String.format(Locale.US, "%d-%d", new Object[]{Long.valueOf(this.c.a), Long.valueOf(this.c.b)}).getBytes(d));
            this.a.write(10);
            this.c = null;
        }
    }

    public final void a(byte b2) {
        if (this.c != null) {
            b();
        }
        byte[] bArr = this.e;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b2;
        if (i2 == 1048576) {
            a();
        }
    }

    public final void a(long j, int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.a(z2);
        if (this.b != 0) {
            a();
        }
        amdc amdc = this.c;
        if (amdc != null && amdc.b + 1 == j) {
            long j2 = (long) i;
            if (j2 <= 0) {
                z3 = false;
            }
            amrl.a(z3);
            this.c = new amdc(amdc.a, amdc.b + j2);
            return;
        }
        b();
        this.c = new amdc(j, (((long) i) + j) - 1);
    }
}
