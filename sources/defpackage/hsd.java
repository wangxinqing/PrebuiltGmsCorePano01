package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* renamed from: hsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hsd {
    public static final int a;
    private static final int h;
    private static final int i;
    public final int b;
    public final int c;
    public final hsf d;
    public final hsf e;
    public int f = 1;
    public final hpq g;
    private final int j;
    private final int k;
    private final int l;
    private final int m;

    static {
        hsb hsb = hsb.values()[0];
        int ordinal = (hsb.RESERVED_8.ordinal() + 1) * 4;
        h = ordinal;
        int i2 = ordinal + 80;
        a = i2;
        i = i2 + ordinal;
    }

    public hsd(hps hps, hps hps2, hpq hpq) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        iva.a((Object) hps);
        iva.a((Object) hps2);
        iva.b(true);
        iva.a((Object) hpq);
        int a2 = hpq.a();
        int i2 = i;
        int b2 = hps.b() + hps2.b() + 7;
        if (a2 > i2 + b2 + b2) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        int b3 = hps.b();
        this.j = b3;
        int i3 = i;
        this.k = i3;
        this.l = i3 + b3;
        int b4 = hps2.b();
        this.m = b4;
        int i4 = this.l + this.j;
        this.b = i4;
        int i5 = i4 + b4;
        this.c = i5;
        int i6 = i5 + b4;
        int a3 = (hpq.a() - i6) / 2;
        int i7 = i6 + a3;
        if (this.k % 4 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2);
        if (this.l % 4 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        iva.b(z3);
        if (this.b % 4 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        iva.b(z4);
        if (this.c % 4 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        iva.b(z5);
        if (a3 > 7) {
            z6 = true;
        } else {
            z6 = false;
        }
        iva.b(z6);
        this.g = hpq;
        try {
            if (hpq.b(0) != 2 || this.g.b(4) != 1) {
                hpq hpq2 = this.g;
                hpr.a(hpq2, 0, hpq2.a());
                this.g.a(0, 2);
                this.g.a(4, 1);
            }
            hsf hsf = new hsf(hpq, i6, a3, hps2);
            hsf hsf2 = new hsf(hpq, i7, a3, hps2);
            this.d = hsf;
            this.e = hsf2;
            try {
                int e2 = e();
                if (e2 == 5) {
                    this.g.a(8, 1);
                    a();
                } else if (e2 == 6) {
                    this.g.a(8, 0);
                    a();
                }
                try {
                    if (hpq.c(32) == 0 && hpq.c(40) == 0) {
                        hpq.a(32, SystemClock.elapsedRealtime());
                        hpq.a(40, -1);
                    }
                } catch (IOException e3) {
                    this.f = 3;
                }
            } catch (IOException e4) {
                this.f = 3;
            } catch (hpt e5) {
                this.f = 4;
            }
        } catch (IOException e6) {
            this.f = 3;
            this.d = null;
            this.e = null;
        }
    }

    public final int a(hps hps, int i2, int i3) {
        if (hsc.b(f())) {
            i2 = i3;
        }
        return this.g.b(i2 + hps.a());
    }

    public final void b() {
        if (this.f == 1) {
            try {
                int e2 = e();
                if (e2 == 3) {
                    this.g.a(8, 0);
                } else if (e2 == 4) {
                    this.g.a(8, 1);
                }
                hpr.a(this.g, 12, 16);
                hpr.a(this.g, 48, 32);
            } catch (IOException e3) {
                this.f = 3;
            } catch (hpt e4) {
                this.f = 4;
            }
        }
    }

    public final boolean c() {
        return hsc.a(e());
    }

    public final int d() {
        f();
        return this.g.b(28);
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        try {
            int b2 = this.g.b(8);
            if (b2 == 0) {
                return 1;
            }
            if (b2 == 1) {
                return 2;
            }
            if (b2 == 2) {
                return 3;
            }
            if (b2 == 3) {
                return 4;
            }
            if (b2 == 4) {
                return 5;
            }
            if (b2 == 5) {
                return 6;
            }
            throw new hpt("Invalid state");
        } catch (IOException e2) {
            this.f = 3;
            throw e2;
        } catch (hpt e3) {
            this.f = 4;
            throw e3;
        }
    }

    public final int f() {
        int i2 = this.f;
        if (i2 == 3) {
            throw new IOException("Attempt to read after an IOException");
        } else if (i2 == 4) {
            throw new hpt("Attempt to read after a FormatException");
        } else if (i2 == 1) {
            int e2 = e();
            if (hsc.a(e2)) {
                return e2;
            }
            throw new IllegalStateException("Attempt to read when there is no snapshot");
        } else {
            throw new IllegalStateException("Attempt to read when status is not ok");
        }
    }

    public final int a(hsb hsb) {
        return a(hsb, 80, a);
    }

    public final void a() {
        int i2;
        int i3;
        int i4;
        hsf hsf;
        if (this.f == 1) {
            try {
                int e2 = e();
                if (!hsc.a(e2)) {
                    boolean b2 = hsc.b(e2);
                    if (!b2) {
                        this.g.a(8, 4);
                        i2 = 3;
                    } else {
                        this.g.a(8, 5);
                        i2 = 4;
                    }
                    boolean z = true ^ b2;
                    hpr.a(this.g, !z ? a : 80, h);
                    if (!z) {
                        i3 = this.l;
                    } else {
                        i3 = this.k;
                    }
                    hpr.a(this.g, i3, this.j);
                    if (!z) {
                        i4 = this.c;
                    } else {
                        i4 = this.b;
                    }
                    hpr.a(this.g, i4, this.m);
                    if (!z) {
                        hsf = this.e;
                    } else {
                        hsf = this.d;
                    }
                    hsf.e.a(hsf.a, 0);
                    hpq hpq = this.g;
                    UUID randomUUID = UUID.randomUUID();
                    hpq.a(12, randomUUID.getMostSignificantBits());
                    hpq.a(20, randomUUID.getLeastSignificantBits());
                    this.g.a(28, 0);
                    if (this.g.c(40) >= 0) {
                        hpq hpq2 = this.g;
                        hpq2.a(32, hpq2.c(40));
                    }
                    this.g.a(40, SystemClock.elapsedRealtime());
                    this.g.a(8, i2 - 1);
                    return;
                }
                hpr.b(this.g, 28, 1);
            } catch (IOException e3) {
                this.f = 3;
            } catch (hpt e4) {
                this.f = 4;
            }
        }
    }

    public final boolean a(String str) {
        int i2;
        try {
            if (this.f == 1 && c()) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
                if (digest.length == 32) {
                    boolean z = true;
                    boolean z2 = true;
                    for (int i3 = 0; i3 < 32; i3++) {
                        byte a2 = this.g.a(i3 + 48);
                        if (digest[i3] != a2) {
                            z2 = false;
                        }
                        if (a2 != 0) {
                            z = false;
                        }
                    }
                    if (!z) {
                        return z2;
                    }
                    for (int i4 = 0; i4 < 32; i4++) {
                        this.g.a(i4 + 48, digest[i4]);
                    }
                    return true;
                }
            }
            return false;
        } catch (IOException e2) {
            i2 = 3;
            this.f = i2;
            return false;
        } catch (hpt e3) {
            i2 = 4;
            this.f = i2;
            return false;
        } catch (NoSuchAlgorithmException e4) {
            return false;
        }
    }
}
