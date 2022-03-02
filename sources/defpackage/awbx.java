package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;

/* renamed from: awbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbx implements awam {
    private final batf a;
    private final boolean b;
    private final awbt c = new awbt(this.a);

    public awbx(batf batf, boolean z) {
        this.a = batf;
        this.b = z;
    }

    private static IOException a(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    public final void a() {
    }

    public final void close() {
        this.c.b.close();
    }

    public final boolean a(awal awal) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        try {
            int g = this.a.g();
            int g2 = this.a.g();
            int i = g2 >>> 24;
            int i2 = g2 & 16777215;
            if ((Integer.MIN_VALUE & g) != 0) {
                int i3 = (g >>> 16) & 32767;
                char c2 = (char) g;
                if (i3 == 3) {
                    awak awak = null;
                    switch (c2) {
                        case 1:
                            int g3 = this.a.g() & Integer.MAX_VALUE;
                            this.a.g();
                            this.a.f();
                            List a2 = this.c.a(i2 - 10);
                            int i4 = i & 1;
                            if ((i & 2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i4 == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            awal.a(z, z2, g3, a2, 1);
                            return true;
                        case 2:
                            int g4 = this.a.g() & Integer.MAX_VALUE;
                            List a3 = this.c.a(i2 - 4);
                            if ((i & 1) == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            awal.a(false, z3, g4, a3, 2);
                            return true;
                        case 3:
                            if (i2 == 8) {
                                int g5 = this.a.g() & Integer.MAX_VALUE;
                                int g6 = this.a.g();
                                awak[] values = awak.values();
                                int length = values.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        awak awak2 = values[i5];
                                        if (awak2.t != g6) {
                                            i5++;
                                        } else {
                                            awak = awak2;
                                        }
                                    }
                                }
                                if (awak != null) {
                                    awal.a(g5, awak);
                                    return true;
                                }
                                throw a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(g6));
                            }
                            throw a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
                        case 4:
                            int g7 = this.a.g();
                            if (i2 == (g7 * 8) + 4) {
                                awbw awbw = new awbw();
                                for (int i6 = 0; i6 < g7; i6++) {
                                    int g8 = this.a.g();
                                    awbw.a(g8 & 16777215, g8 >>> 24, this.a.g());
                                }
                                if ((i & 1) != 0) {
                                    z5 = true;
                                }
                                awal.a(z5, awbw);
                                return true;
                            }
                            throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(g7));
                        case 6:
                            if (i2 == 4) {
                                int g9 = this.a.g();
                                if (this.b == (g9 & true)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                awal.a(z4, g9, 0);
                                return true;
                            }
                            throw a("TYPE_PING length: %d != 4", Integer.valueOf(i2));
                        case 7:
                            if (i2 == 8) {
                                int g10 = this.a.g() & Integer.MAX_VALUE;
                                int g11 = this.a.g();
                                awak[] values2 = awak.values();
                                int length2 = values2.length;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < length2) {
                                        awak awak3 = values2[i7];
                                        if (awak3.u != g11) {
                                            i7++;
                                        } else {
                                            awak = awak3;
                                        }
                                    }
                                }
                                if (awak != null) {
                                    awal.a(g10, batg.b);
                                    return true;
                                }
                                throw a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(g11));
                            }
                            throw a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
                        case 8:
                            awal.a(false, false, this.a.g() & Integer.MAX_VALUE, this.c.a(i2 - 4), 3);
                            return true;
                        case 9:
                            if (i2 == 8) {
                                int g12 = this.a.g() & Integer.MAX_VALUE;
                                long g13 = (long) (this.a.g() & Integer.MAX_VALUE);
                                if (g13 != 0) {
                                    awal.a(g12, g13);
                                    return true;
                                }
                                throw a("windowSizeIncrement was 0", Long.valueOf(g13));
                            }
                            throw a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
                        default:
                            this.a.h((long) i2);
                            return true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("version != 3: ");
                    sb.append(i3);
                    throw new ProtocolException(sb.toString());
                }
            } else {
                int i8 = g & Integer.MAX_VALUE;
                batf batf = this.a;
                if ((i & 1) != 0) {
                    z5 = true;
                }
                awal.a(z5, i8, batf, i2);
                return true;
            }
        } catch (IOException e) {
            return false;
        }
    }
}
