package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* renamed from: awbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbn implements awan {
    private final bate a;
    private final boolean b;
    private final batd c = new batd();
    private final awbi d = new awbi(this.c);
    private int e = 16384;
    private boolean f;

    public awbn(bate bate, boolean z) {
        this.a = bate;
        this.b = z;
    }

    public final synchronized void a() {
        if (this.f) {
            throw new IOException("closed");
        } else if (this.b) {
            if (awbo.a.isLoggable(Level.FINE)) {
                awbo.a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", new Object[]{awbo.b.c()}));
            }
            this.a.a(awbo.b.f());
            this.a.flush();
        }
    }

    public final synchronized void b() {
        if (!this.f) {
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final int c() {
        return this.e;
    }

    public final synchronized void close() {
        this.f = true;
        this.a.close();
    }

    public final synchronized void b(awbw awbw) {
        int i;
        if (!this.f) {
            int i2 = 0;
            a(0, awbw.a() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (awbw.a(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.a.f(i);
                    this.a.e(awbw.b(i2));
                }
                i2++;
            }
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, int i2) {
        if (!this.f) {
            a(0, 8, (byte) 6, (byte) 1);
            this.a.e(i);
            this.a.e(i2);
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2, byte b2, byte b3) {
        if (awbo.a.isLoggable(Level.FINE)) {
            awbo.a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$Writer", "frameHeader", awbl.a(false, i, i2, b2, b3));
        }
        int i3 = this.e;
        if (i2 > i3) {
            throw awbo.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            bate bate = this.a;
            bate.h((i2 >>> 16) & 255);
            bate.h((i2 >>> 8) & 255);
            bate.h(i2 & 255);
            this.a.h(b2);
            this.a.h(b3);
            this.a.e(i & Integer.MAX_VALUE);
        } else {
            throw awbo.a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public final synchronized void a(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw awbo.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            a(i, 4, (byte) 8, (byte) 0);
            this.a.e((int) j);
            this.a.flush();
        }
    }

    public final synchronized void a(int i, awak awak) {
        if (this.f) {
            throw new IOException("closed");
        } else if (awak.s != -1) {
            a(i, 4, (byte) 3, (byte) 0);
            this.a.e(awak.s);
            this.a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void a(int i, awak awak, byte[] bArr) {
        if (this.f) {
            throw new IOException("closed");
        } else if (awak.s != -1) {
            int length = bArr.length;
            a(0, length + 8, (byte) 7, (byte) 0);
            this.a.e(i);
            this.a.e(awak.s);
            if (length > 0) {
                this.a.a(bArr);
            }
            this.a.flush();
        } else {
            throw awbo.a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public final synchronized void a(awbw awbw) {
        if (!this.f) {
            int i = this.e;
            if ((awbw.a & 32) != 0) {
                i = awbw.d[5];
            }
            this.e = i;
            a(0, 0, (byte) 4, (byte) 1);
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(boolean z, int i, batd batd, int i2) {
        if (!this.f) {
            a(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.a.a(batd, (long) i2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void a(boolean z, int i, List list) {
        int i2;
        byte b2;
        if (!this.f) {
            awbi awbi = this.d;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                batg d2 = ((awbg) list.get(i3)).h.d();
                Integer num = (Integer) awbj.b.get(d2);
                if (num != null) {
                    awbi.a(num.intValue() + 1, 15);
                    awbi.a(((awbg) list.get(i3)).i);
                } else {
                    awbi.a.h(0);
                    awbi.a(d2);
                    awbi.a(((awbg) list.get(i3)).i);
                }
            }
            long j = this.c.b;
            int min = (int) Math.min((long) this.e, j);
            long j2 = (long) min;
            if (j == j2) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            a(i, min, (byte) 1, (byte) i2);
            this.a.a(this.c, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int min2 = (int) Math.min((long) this.e, j3);
                    long j4 = (long) min2;
                    j3 -= j4;
                    if (j3 == 0) {
                        b2 = 4;
                    } else {
                        b2 = 0;
                    }
                    a(i, min2, (byte) 9, b2);
                    this.a.a(this.c, j4);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }
}
