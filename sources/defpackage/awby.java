package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;

/* renamed from: awby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awby implements awan {
    private final bate a;
    private final batd b = new batd();
    private final bate c;
    private final boolean d;
    private boolean e;

    public awby(bate bate, boolean z) {
        this.a = bate;
        this.d = z;
        Deflater deflater = new Deflater();
        deflater.setDictionary(awbz.a);
        this.c = batq.a((batz) new bath(batq.a((batz) this.b), deflater));
    }

    public final synchronized void a() {
    }

    public final void a(awbw awbw) {
    }

    public final synchronized void b() {
        if (!this.e) {
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final int c() {
        return 16383;
    }

    public final synchronized void close() {
        this.e = true;
        awaj.a((Closeable) this.a, (Closeable) this.c);
    }

    public final synchronized void a(int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        } else if (this.d != (i & true)) {
            this.a.e(-2147287034);
            this.a.e(4);
            this.a.e(i);
            this.a.flush();
        } else {
            throw new IllegalArgumentException("payload != reply");
        }
    }

    public final synchronized void b(awbw awbw) {
        if (!this.e) {
            int a2 = awbw.a();
            this.a.e(-2147287036);
            this.a.e(((a2 * 8) + 4) & 16777215);
            this.a.e(a2);
            for (int i = 0; i <= 10; i++) {
                if (awbw.a(i)) {
                    this.a.e((awbw.c(i) << 24) | (i & 16777215));
                    this.a.e(awbw.b(i));
                }
            }
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            StringBuilder sb = new StringBuilder(74);
            sb.append("windowSizeIncrement must be between 1 and 0x7fffffff: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.a.e(-2147287031);
            this.a.e(8);
            this.a.e(i);
            this.a.e((int) j);
            this.a.flush();
        }
    }

    public final synchronized void a(int i, awak awak) {
        if (this.e) {
            throw new IOException("closed");
        } else if (awak.t != -1) {
            this.a.e(-2147287037);
            this.a.e(8);
            this.a.e(i & Integer.MAX_VALUE);
            this.a.e(awak.t);
            this.a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void a(int i, awak awak, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        } else if (awak.u != -1) {
            this.a.e(-2147287033);
            this.a.e(8);
            this.a.e(i);
            this.a.e(awak.u);
            this.a.flush();
        } else {
            throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
        }
    }

    public final synchronized void a(boolean z, int i, batd batd, int i2) {
        if (!this.e) {
            long j = (long) i2;
            if (j <= 16777215) {
                this.a.e(i & Integer.MAX_VALUE);
                this.a.e(((z ? 1 : 0) << true) | (16777215 & i2));
                if (i2 > 0) {
                    this.a.a(batd, j);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("FRAME_TOO_LARGE max size is 16Mib: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IOException("closed");
    }

    public final synchronized void a(boolean z, int i, List list) {
        if (!this.e) {
            this.c.e(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                batg batg = ((awbg) list.get(i2)).h;
                this.c.e(batg.e());
                this.c.c(batg);
                batg batg2 = ((awbg) list.get(i2)).i;
                this.c.e(batg2.e());
                this.c.c(batg2);
            }
            this.c.flush();
            long j = this.b.b;
            this.a.e(-2147287039);
            this.a.e(((z ? 1 : 0) << true) | (((int) (j + 10)) & 16777215));
            this.a.e(i & Integer.MAX_VALUE);
            this.a.e(0);
            this.a.f(0);
            bate bate = this.a;
            batd batd = this.b;
            if (batd != null) {
                while (batd.c(((batt) bate).a, 8192) != -1) {
                    ((batt) bate).p();
                }
                this.a.flush();
            } else {
                throw new IllegalArgumentException("source == null");
            }
        } else {
            throw new IOException("closed");
        }
    }
}
