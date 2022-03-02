package defpackage;

import java.nio.charset.Charset;
import java.util.zip.Deflater;

/* renamed from: bath  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bath implements batz {
    private final bate a;
    private final Deflater b;
    private boolean c;

    public bath(bate bate, Deflater deflater) {
        this.a = bate;
        this.b = deflater;
    }

    private final void a(boolean z) {
        batw a2;
        int i;
        batd batd = ((batt) this.a).a;
        while (true) {
            a2 = batd.a(1);
            if (z) {
                Deflater deflater = this.b;
                byte[] bArr = a2.a;
                int i2 = a2.c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.b;
                byte[] bArr2 = a2.a;
                int i3 = a2.c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                a2.c += i;
                batd.b += (long) i;
                this.a.p();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (a2.b == a2.c) {
            batd.a = a2.b();
            batx.a(a2);
        }
    }

    public final bauc bu() {
        return this.a.bu();
    }

    public final void close() {
        if (!this.c) {
            try {
                this.b.finish();
                a(false);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.b.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                Charset charset = baud.a;
                throw th;
            }
        }
    }

    public final void flush() {
        a(true);
        this.a.flush();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("DeflaterSink(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final void a(batd batd, long j) {
        baud.a(batd.b, 0, j);
        while (j > 0) {
            batw batw = batd.a;
            int min = (int) Math.min(j, (long) (batw.c - batw.b));
            this.b.setInput(batw.a, batw.b, min);
            a(false);
            long j2 = (long) min;
            batd.b -= j2;
            int i = batw.b + min;
            batw.b = i;
            if (i == batw.c) {
                batd.a = batw.b();
                batx.a(batw);
            }
            j -= j2;
        }
    }
}
