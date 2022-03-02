package defpackage;

import com.google.android.gms.awareness.fence.FenceState;

/* renamed from: bzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzw extends bzi {
    private int f;
    private int g;
    private int h;
    private int i;
    private long j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bzw(defpackage.atln r10) {
        /*
            r9 = this;
            int r0 = r10.a
            int r0 = defpackage.atlm.a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            atjs r6 = defpackage.atjs.POWER_CONNECTION_FENCE
            int[] r7 = new int[r1]
            r1 = 8
            r8 = 0
            r7[r8] = r1
            java.lang.Class<bzw> r3 = defpackage.bzw.class
            int r5 = r0 + -1
            r2 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r9.g = r8
            r9.f = r8
            r9.i = r8
            r9.h = r8
            r0 = 0
            r9.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzw.<init>(atln):void");
    }

    private final int b(long j2) {
        int i2 = this.f;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        if (i3 == 1) {
            if (i2 == 1) {
                z = true;
            }
            return FenceState.a(z);
        } else if (i3 == 2) {
            if (i2 == 1 && this.g == 2) {
                if (bzi.a(j2, this.j, a())) {
                    z = true;
                }
            }
            return FenceState.a(z);
        } else if (i3 != 3) {
            ((anih) ((anih) bxk.a.b()).a("bzw", "b", 158, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PowerConnectionFenceImpl] unexpected trigger type=%s", this.b);
            return 0;
        } else {
            if (i2 == 2 && this.g == 1) {
                if (bzi.a(j2, this.j, a())) {
                    z = true;
                }
            }
            return FenceState.a(z);
        }
    }

    private final int c(long j2) {
        int i2 = this.h;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        if (i3 == 4) {
            if (i2 == 1) {
                z = true;
            }
            return FenceState.a(z);
        } else if (i3 == 5) {
            if (i2 == 1 && this.i == 2) {
                if (bzi.a(j2, this.j, a())) {
                    z = true;
                }
            }
            return FenceState.a(z);
        } else if (i3 != 6) {
            ((anih) ((anih) bxk.a.b()).a("bzw", "c", 184, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PowerConnectionFenceImpl] unexpected trigger type=%s", this.b);
            return 0;
        } else {
            if (i2 == 2 && this.i == 1) {
                if (bzi.a(j2, this.j, a())) {
                    z = true;
                }
            }
            return FenceState.a(z);
        }
    }

    public final int a(long j2) {
        boolean z = true;
        switch (this.b) {
            case 1:
                int b = b(j2);
                this.e = b;
                return b;
            case 2:
            case 3:
                if (b(j2) != 2) {
                    z = false;
                }
                return a(z, a());
            case 4:
                int c = c(j2);
                this.e = c;
                return c;
            case 5:
            case 6:
                if (c(j2) != 2) {
                    z = false;
                }
                return a(z, a());
            default:
                ((anih) ((anih) bxk.a.b()).a("bzw", "a", 132, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PowerConnectionFenceImpl] Unknown trigger type=%s", this.b);
                return b();
        }
    }

    public final long a() {
        return ((atln) this.c).d;
    }

    public final void a(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.POWER_CONNECTION) {
            atmb atmb = atjl.g;
            if (atmb == null) {
                atmb = atmb.e;
            }
            int a2 = atma.a(atmb.b);
            if (a2 != 0) {
                int i2 = 2;
                if (a2 == 2) {
                    atjm atjm = atjl.h;
                    if (atjm == null) {
                        atjm = atjm.a;
                    }
                    auci auci = attx.e;
                    atjm.a(auci);
                    if (atjm.m.a(auci.d)) {
                        atjm atjm2 = atjl.h;
                        if (atjm2 == null) {
                            atjm2 = atjm.a;
                        }
                        auci auci2 = attx.e;
                        atjm2.a(auci2);
                        Object b = atjm2.m.b(auci2.d);
                        if (b == null) {
                            b = auci2.b;
                        } else {
                            auci2.a(b);
                        }
                        attx attx = (attx) b;
                        switch (this.b) {
                            case 1:
                            case 2:
                            case 3:
                                double d = attx.c;
                                atln atln = (atln) this.c;
                                double d2 = atln.b;
                                double d3 = atln.c;
                                if (d2 <= d && d <= d3) {
                                    i2 = 1;
                                }
                                int i3 = this.f;
                                if (i2 != i3) {
                                    this.g = i3;
                                    this.f = i2;
                                    atmb atmb2 = atjl.g;
                                    if (atmb2 == null) {
                                        atmb2 = atmb.e;
                                    }
                                    this.j = atmb2.c;
                                    return;
                                }
                                return;
                            case 4:
                            case 5:
                            case 6:
                                aucu aucu = new aucu(((atln) this.c).e, atln.f);
                                attw a3 = attw.a(attx.b);
                                if (a3 == null) {
                                    a3 = attw.UNKNOWN;
                                }
                                if (aucu.contains(a3)) {
                                    i2 = 1;
                                }
                                int i4 = this.h;
                                if (i2 != i4) {
                                    this.i = i4;
                                    this.h = i2;
                                    atmb atmb3 = atjl.g;
                                    if (atmb3 == null) {
                                        atmb3 = atmb.e;
                                    }
                                    this.j = atmb3.c;
                                    return;
                                }
                                return;
                            default:
                                ((anih) ((anih) bxk.a.b()).a("bzw", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PowerConnectionFenceImpl] Unknown trigger type=%s", this.b);
                                return;
                        }
                    } else {
                        ((anih) ((anih) bxk.a.c()).a("bzw", "a", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PowerConnectionFenceImpl] No power connection data.");
                    }
                }
            }
        }
    }
}
