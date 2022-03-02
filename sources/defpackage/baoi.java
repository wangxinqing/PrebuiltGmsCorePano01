package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* renamed from: baoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baoi implements baoa {
    public int a = 16384;
    private final bate b;
    private final batd c = new batd();
    private final baod d = new baod(this.c);
    private boolean e;

    public baoi(bate bate) {
        this.b = bate;
    }

    public final synchronized void a() {
        if (!this.e) {
            if (baoj.a.isLoggable(Level.FINE)) {
                baoj.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", new Object[]{baoj.b.c()}));
            }
            this.b.a(baoj.b.f());
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b() {
        if (!this.e) {
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() {
        this.e = true;
        this.b.close();
    }

    public final synchronized void b(baom baom) {
        int i;
        if (!this.e) {
            int i2 = 0;
            a(0, Integer.bitCount(baom.a) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (baom.a(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.b.f(i);
                    this.b.e(baom.b(i2));
                }
                i2++;
            }
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2, byte b2, byte b3) {
        if (baoj.a.isLoggable(Level.FINE)) {
            baoj.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", baog.a(false, i, i2, b2, b3));
        }
        int i3 = this.a;
        if (i2 > i3) {
            throw baoj.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            bate bate = this.b;
            bate.h((i2 >>> 16) & 255);
            bate.h((i2 >>> 8) & 255);
            bate.h(i2 & 255);
            this.b.h(b2);
            this.b.h(b3);
            this.b.e(i & Integer.MAX_VALUE);
        } else {
            throw baoj.a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public final synchronized void a(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        } else if (j != 0) {
            a(i, 4, (byte) 8, (byte) 0);
            this.b.e((int) j);
            this.b.flush();
        } else {
            throw baoj.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
    }

    public final synchronized void a(int i, bany bany) {
        if (this.e) {
            throw new IOException("closed");
        } else if (bany.s != -1) {
            a(i, 4, (byte) 3, (byte) 0);
            this.b.e(bany.s);
            this.b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void a(bany bany, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        } else if (bany.s != -1) {
            int length = bArr.length;
            a(0, length + 8, (byte) 7, (byte) 0);
            this.b.e(0);
            this.b.e(bany.s);
            if (length > 0) {
                this.b.a(bArr);
            }
            this.b.flush();
        } else {
            throw baoj.a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public final synchronized void a(baom baom) {
        if (!this.e) {
            int i = this.a;
            if ((baom.a & 32) != 0) {
                i = baom.b[5];
            }
            this.a = i;
            a(0, 0, (byte) 4, (byte) 1);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(boolean z, int i, int i2) {
        if (!this.e) {
            a(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.b.e(i);
            this.b.e(i2);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(boolean z, int i, batd batd, int i2) {
        if (!this.e) {
            a(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.b.a(batd, (long) i2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void a(boolean z, int i, List list) {
        byte b2;
        byte b3;
        int i2;
        int i3;
        int i4 = i;
        synchronized (this) {
            if (!this.e) {
                baod baod = this.d;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    baob baob = (baob) list.get(i5);
                    batg d2 = baob.f.d();
                    batg batg = baob.g;
                    Integer num = (Integer) baoe.c.get(d2);
                    if (num != null) {
                        i3 = num.intValue() + 1;
                        if (i3 < 2) {
                            i2 = i3;
                            i3 = -1;
                        } else {
                            if (i3 <= 7) {
                                if (baoe.b[i3 - 1].g.equals(batg)) {
                                    i2 = i3;
                                } else if (baoe.b[i3].g.equals(batg)) {
                                    i2 = i3;
                                    i3++;
                                }
                            }
                            i2 = i3;
                            i3 = -1;
                        }
                    } else {
                        i3 = -1;
                        i2 = -1;
                    }
                    if (i3 == -1) {
                        int i6 = baod.d + 1;
                        while (true) {
                            baob[] baobArr = baod.b;
                            if (i6 >= baobArr.length) {
                                break;
                            }
                            if (baobArr[i6].f.equals(d2)) {
                                if (baod.b[i6].g.equals(batg)) {
                                    i3 = (i6 - baod.d) + baoe.b.length;
                                    break;
                                } else if (i2 == -1) {
                                    i2 = (i6 - baod.d) + baoe.b.length;
                                }
                            }
                            i6++;
                        }
                    }
                    if (i3 != -1) {
                        baod.a(i3, 127, 128);
                    } else if (i2 == -1) {
                        baod.a.h(64);
                        baod.a(d2);
                        baod.a(batg);
                        baod.a(baob);
                    } else {
                        if (d2.a(baoe.a)) {
                            if (!baob.e.equals(d2)) {
                                baod.a(i2, 15, 0);
                                baod.a(batg);
                            }
                        }
                        baod.a(i2, 63, 64);
                        baod.a(batg);
                        baod.a(baob);
                    }
                }
                long j = this.c.b;
                int min = (int) Math.min((long) this.a, j);
                long j2 = (long) min;
                if (j == j2) {
                    b2 = 4;
                } else {
                    b2 = 0;
                }
                a(i4, min, (byte) 1, b2);
                this.b.a(this.c, j2);
                if (j > j2) {
                    long j3 = j - j2;
                    while (j3 > 0) {
                        int min2 = (int) Math.min((long) this.a, j3);
                        long j4 = (long) min2;
                        j3 -= j4;
                        if (j3 == 0) {
                            b3 = 4;
                        } else {
                            b3 = 0;
                        }
                        a(i4, min2, (byte) 9, b3);
                        this.b.a(this.c, j4);
                    }
                }
            } else {
                throw new IOException("closed");
            }
        }
    }
}
