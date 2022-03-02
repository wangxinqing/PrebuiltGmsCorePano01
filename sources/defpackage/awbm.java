package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: awbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbm implements awam {
    final awbh a = new awbh(this.c);
    private final batf b;
    private final awbk c = new awbk(this.b);
    private final boolean d;

    public awbm(batf batf, boolean z) {
        this.b = batf;
        this.d = z;
    }

    private final List a(int i, short s, byte b2, int i2) {
        awbk awbk = this.c;
        awbk.d = i;
        awbk.a = i;
        awbk.e = s;
        awbk.b = b2;
        awbk.c = i2;
        awbh awbh = this.a;
        while (!awbh.b.b()) {
            byte e = awbh.b.e() & 255;
            if (e == 128) {
                throw new IOException("index == 0");
            } else if ((e & 128) == 128) {
                int a2 = awbh.a(e, 127) - 1;
                if (awbh.c(a2)) {
                    awbh.a.add(awbj.a[a2]);
                } else {
                    int a3 = awbh.a(a2 - awbj.a.length);
                    if (a3 >= 0) {
                        awbg[] awbgArr = awbh.e;
                        if (a3 <= awbgArr.length - 1) {
                            awbh.a.add(awbgArr[a3]);
                        }
                    }
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Header index too large ");
                    sb.append(a2 + 1);
                    throw new IOException(sb.toString());
                }
            } else if (e == 64) {
                batg b3 = awbh.b();
                awbj.a(b3);
                awbh.a(new awbg(b3, awbh.b()));
            } else if ((e & 64) == 64) {
                awbh.a(new awbg(awbh.b(awbh.a(e, 63) - 1), awbh.b()));
            } else if ((e & 32) == 32) {
                int a4 = awbh.a(e, 31);
                awbh.d = a4;
                if (a4 < 0 || a4 > awbh.c) {
                    StringBuilder sb2 = new StringBuilder(45);
                    sb2.append("Invalid dynamic table size update ");
                    sb2.append(a4);
                    throw new IOException(sb2.toString());
                }
                awbh.a();
            } else if (e == 16 || e == 0) {
                batg b4 = awbh.b();
                awbj.a(b4);
                awbh.a.add(new awbg(b4, awbh.b()));
            } else {
                awbh.a.add(new awbg(awbh.b(awbh.a(e, 15) - 1), awbh.b()));
            }
        }
        awbh awbh2 = this.a;
        ArrayList arrayList = new ArrayList(awbh2.a);
        awbh2.a.clear();
        return arrayList;
    }

    private final void b() {
        this.b.g();
        this.b.e();
    }

    public final void close() {
        this.b.close();
    }

    public final void a() {
        if (!this.d) {
            batg d2 = this.b.d((long) awbo.b.e());
            if (awbo.a.isLoggable(Level.FINE)) {
                awbo.a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$Reader", "readConnectionPreface", String.format("<< CONNECTION %s", new Object[]{d2.c()}));
            }
            if (!awbo.b.equals(d2)) {
                throw awbo.b("Expected a connection header but was %s", d2.a());
            }
        }
    }

    public final boolean a(awal awal) {
        byte b2;
        byte b3;
        boolean z;
        byte b4;
        boolean z2 = false;
        try {
            this.b.a(9);
            int a2 = awbo.a(this.b);
            if (a2 <= 16384) {
                byte e = (byte) (this.b.e() & 255);
                byte e2 = (byte) (this.b.e() & 255);
                int g = this.b.g() & Integer.MAX_VALUE;
                if (awbo.a.isLoggable(Level.FINE)) {
                    awbo.a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$Reader", "nextFrame", awbl.a(true, g, a2, e, e2));
                }
                switch (e) {
                    case 0:
                        byte b5 = e2 & 1;
                        if ((e2 & 32) == 0) {
                            if ((e2 & 8) != 0) {
                                b2 = this.b.e() & 255;
                            } else {
                                b2 = 0;
                            }
                            int a3 = awbo.a(a2, e2, (short) b2);
                            batf batf = this.b;
                            if (b5 != 0) {
                                z2 = true;
                            }
                            awal.a(z2, g, batf, a3);
                            this.b.h((long) b2);
                            break;
                        } else {
                            throw awbo.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        }
                    case 1:
                        if (g != 0) {
                            byte b6 = e2 & 1;
                            if ((e2 & 8) != 0) {
                                b3 = this.b.e() & 255;
                            } else {
                                b3 = 0;
                            }
                            if ((e2 & 32) != 0) {
                                b();
                                a2 -= 5;
                            }
                            short s = (short) b3;
                            List a4 = a(awbo.a(a2, e2, s), s, e2, g);
                            if (b6 == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            awal.a(false, z, g, a4, 4);
                            break;
                        } else {
                            throw awbo.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        }
                    case 2:
                        if (a2 != 5) {
                            throw awbo.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a2));
                        } else if (g != 0) {
                            b();
                            break;
                        } else {
                            throw awbo.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                    case 3:
                        if (a2 != 4) {
                            throw awbo.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a2));
                        } else if (g != 0) {
                            int g2 = this.b.g();
                            awak a5 = awak.a(g2);
                            if (a5 != null) {
                                awal.a(g, a5);
                                break;
                            } else {
                                throw awbo.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(g2));
                            }
                        } else {
                            throw awbo.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                    case 4:
                        if (g != 0) {
                            throw awbo.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        } else if ((e2 & 1) == 0) {
                            if (a2 % 6 == 0) {
                                awbw awbw = new awbw();
                                for (int i = 0; i < a2; i += 6) {
                                    short f = this.b.f();
                                    int g3 = this.b.g();
                                    switch (f) {
                                        case 1:
                                        case 6:
                                            break;
                                        case 2:
                                            if (!(g3 == 0 || g3 == 1)) {
                                                throw awbo.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            }
                                        case 3:
                                            f = 4;
                                            break;
                                        case 4:
                                            if (g3 >= 0) {
                                                f = 7;
                                                break;
                                            } else {
                                                throw awbo.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            }
                                        case 5:
                                            if (g3 < 16384 || g3 > 16777215) {
                                                throw awbo.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(g3));
                                            }
                                    }
                                    awbw.a(f, 0, g3);
                                }
                                awal.a(false, awbw);
                                if (awbw.b() >= 0) {
                                    awbh awbh = this.a;
                                    int b7 = awbw.b();
                                    awbh.c = b7;
                                    awbh.d = b7;
                                    awbh.a();
                                    break;
                                }
                            } else {
                                throw awbo.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a2));
                            }
                        } else if (a2 != 0) {
                            throw awbo.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        }
                        break;
                    case 5:
                        if (g != 0) {
                            if ((e2 & 8) != 0) {
                                b4 = this.b.e() & 255;
                            } else {
                                b4 = 0;
                            }
                            int g4 = this.b.g() & Integer.MAX_VALUE;
                            short s2 = (short) b4;
                            a(awbo.a(a2 - 4, e2, s2), s2, e2, g);
                            awbb awbb = ((awba) awal).c;
                            synchronized (awbb) {
                                Set set = awbb.s;
                                Integer valueOf = Integer.valueOf(g4);
                                if (!set.contains(valueOf)) {
                                    awbb.s.add(valueOf);
                                    awbb.i.execute(new awar(awbb, "OkHttp %s Push Request[%s]", new Object[]{awbb.e, valueOf}, g4));
                                    break;
                                } else {
                                    awbb.a(g4, awak.PROTOCOL_ERROR);
                                    break;
                                }
                            }
                        } else {
                            throw awbo.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        }
                    case 6:
                        if (a2 != 8) {
                            throw awbo.b("TYPE_PING length != 8: %s", Integer.valueOf(a2));
                        } else if (g == 0) {
                            int g5 = this.b.g();
                            int g6 = this.b.g();
                            if ((e2 & 1) != 0) {
                                z2 = true;
                            }
                            awal.a(z2, g5, g6);
                            break;
                        } else {
                            throw awbo.b("TYPE_PING streamId != 0", new Object[0]);
                        }
                    case 7:
                        if (a2 < 8) {
                            throw awbo.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a2));
                        } else if (g == 0) {
                            int g7 = this.b.g();
                            int g8 = this.b.g();
                            int i2 = a2 - 8;
                            if (awak.a(g8) != null) {
                                batg batg = batg.b;
                                if (i2 > 0) {
                                    batg = this.b.d((long) i2);
                                }
                                awal.a(g7, batg);
                                break;
                            } else {
                                throw awbo.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(g8));
                            }
                        } else {
                            throw awbo.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                    case 8:
                        if (a2 == 4) {
                            long g9 = ((long) this.b.g()) & 2147483647L;
                            if (g9 != 0) {
                                awal.a(g, g9);
                                break;
                            } else {
                                throw awbo.b("windowSizeIncrement was 0", Long.valueOf(g9));
                            }
                        } else {
                            throw awbo.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a2));
                        }
                    default:
                        this.b.h((long) a2);
                        break;
                }
                return true;
            }
            throw awbo.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
        } catch (IOException e3) {
            return false;
        }
    }
}
