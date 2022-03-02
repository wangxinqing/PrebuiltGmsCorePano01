package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: batm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batm implements baua {
    private final batf a;
    private final Inflater b;
    private int c;
    private boolean d;

    public batm(batf batf, Inflater inflater) {
        if (batf == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.a = batf;
            this.b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private final void c() {
        int i = this.c;
        if (i != 0) {
            int remaining = i - this.b.getRemaining();
            this.c -= remaining;
            this.a.h((long) remaining);
        }
    }

    public final boolean b() {
        if (!this.b.needsInput()) {
            return false;
        }
        c();
        if (this.b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.a.b()) {
            return true;
        } else {
            batw batw = ((batv) this.a).a.a;
            int i = batw.c;
            int i2 = batw.b;
            int i3 = i - i2;
            this.c = i3;
            this.b.setInput(batw.a, i2, i3);
            return false;
        }
    }

    public final bauc bu() {
        return this.a.bu();
    }

    public final void close() {
        if (!this.d) {
            this.b.end();
            this.d = true;
            this.a.close();
        }
    }

    public final long c(batd batd, long j) {
        batw a2;
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean b2 = b();
                try {
                    a2 = batd.a(1);
                    int inflate = this.b.inflate(a2.a, a2.c, (int) Math.min(j, (long) (8192 - a2.c)));
                    if (inflate > 0) {
                        a2.c += inflate;
                        long j2 = (long) inflate;
                        batd.b += j2;
                        return j2;
                    } else if (!this.b.finished() && !this.b.needsDictionary()) {
                        if (b2) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            c();
            if (a2.b != a2.c) {
                return -1;
            }
            batd.a = a2.b();
            batx.a(a2);
            return -1;
        }
    }
}
