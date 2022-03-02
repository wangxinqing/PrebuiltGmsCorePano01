package defpackage;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: awci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awci extends awcg {
    final /* synthetic */ awcm d;
    private long e = -1;
    private boolean f = true;
    private final awcs g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awci(awcm awcm, awcs awcs) {
        super(awcm);
        this.d = awcm;
        this.g = awcs;
    }

    public final long c(batd batd, long j) {
        long j2;
        byte b;
        byte b2;
        int i;
        byte b3;
        int i2;
        long j3 = j;
        if (j3 < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.b) {
            throw new IllegalStateException("closed");
        } else if (!this.f) {
            return -1;
        } else {
            long j4 = this.e;
            if (j4 == 0 || j4 == -1) {
                if (j4 != -1) {
                    this.d.b.l();
                }
                try {
                    batf batf = this.d.b;
                    ((batv) batf).a(1);
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        b = 97;
                        b2 = 48;
                        if (!((batv) batf).b((long) i4)) {
                            break;
                        }
                        byte c = ((batv) batf).a.c((long) i3);
                        if (c < 48 || c > 57) {
                            if (c < 97 || c > 102) {
                                if (c < 65 || c > 70) {
                                    if (i3 == 0) {
                                        throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(c)}));
                                    }
                                }
                            }
                        }
                        i3 = i4;
                    }
                    batd batd2 = ((batv) batf).a;
                    if (batd2.b != 0) {
                        int i5 = 0;
                        long j5 = 0;
                        boolean z = false;
                        while (true) {
                            batw batw = batd2.a;
                            byte[] bArr = batw.a;
                            int i6 = batw.b;
                            int i7 = batw.c;
                            while (true) {
                                if (i6 >= i7) {
                                    i = i7;
                                    break;
                                }
                                b3 = bArr[i6];
                                if (b3 < b2 || b3 > 57) {
                                    if (b3 >= b) {
                                        if (b3 <= 102) {
                                            i2 = b3 - 87;
                                        }
                                    }
                                    if (b3 < 65 || b3 > 70) {
                                        i = i7;
                                    } else {
                                        i2 = b3 - 55;
                                    }
                                } else {
                                    i2 = b3 - 48;
                                }
                                if ((j5 & -1152921504606846976L) != 0) {
                                    batd batd3 = new batd();
                                    batd3.j(j5);
                                    batd3.h((int) b3);
                                    String valueOf = String.valueOf(batd3.k());
                                    throw new NumberFormatException(valueOf.length() == 0 ? new String("Number too large: ") : "Number too large: ".concat(valueOf));
                                }
                                j5 = (j5 << 4) | ((long) i2);
                                i6++;
                                i5++;
                                i7 = i7;
                                b = 97;
                                b2 = 48;
                            }
                            i = i7;
                            if (i5 != 0) {
                                z = true;
                                if (i6 == i) {
                                    batd2.a = batw.b();
                                    batx.a(batw);
                                } else {
                                    batw.b = i6;
                                }
                                if (!z) {
                                    if (batd2.a == null) {
                                        break;
                                    }
                                    b = 97;
                                    b2 = 48;
                                } else {
                                    break;
                                }
                            } else {
                                String valueOf2 = String.valueOf(Integer.toHexString(b3));
                                throw new NumberFormatException(valueOf2.length() == 0 ? new String("Expected leading [0-9a-fA-F] character but was 0x") : "Expected leading [0-9a-fA-F] character but was 0x".concat(valueOf2));
                            }
                        }
                        batd2.b -= (long) i5;
                        this.e = j5;
                        String trim = this.d.b.l().trim();
                        if (this.e < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            long j6 = this.e;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(trim).length() + 74);
                            sb2.append("expected chunk size and optional extensions but was \"");
                            sb2.append(j6);
                            sb2.append(trim);
                            sb2.append("\"");
                            throw new ProtocolException(sb2.toString());
                        }
                        if (this.e == 0) {
                            this.f = false;
                            this.g.a(this.d.e());
                            b();
                        }
                        if (!this.f) {
                            return -1;
                        }
                        j2 = -1;
                    } else {
                        throw new IllegalStateException("size == 0");
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            } else {
                j2 = -1;
            }
            long c2 = this.d.b.c(batd, Math.min(j3, this.e));
            if (c2 != j2) {
                this.e -= c2;
                return c2;
            }
            c();
            throw new ProtocolException("unexpected end of stream");
        }
    }

    public final void close() {
        if (!this.b) {
            if (this.f && !awaj.a((baua) this, TimeUnit.MILLISECONDS)) {
                c();
            }
            this.b = true;
        }
    }
}
