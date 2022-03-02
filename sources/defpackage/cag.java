package defpackage;

/* renamed from: cag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cag extends bzi {
    private boolean f;
    private boolean g;
    private long h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cag(defpackage.atmn r9) {
        /*
            r8 = this;
            int r0 = r9.b
            int r0 = defpackage.atmm.a(r0)
            r1 = 1
            if (r0 == 0) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            int r5 = r0 + -1
            atjs r6 = defpackage.atjs.WIFI_STATE_FENCE
            int[] r7 = new int[r1]
            int r0 = r9.b
            int r0 = defpackage.atmm.a(r0)
            if (r0 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            int r0 = r0 + -1
            if (r0 == r1) goto L_0x002d
            r1 = 2
            if (r0 != r1) goto L_0x0025
            r0 = 17
            goto L_0x002f
        L_0x0025:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid fence trigger type for wifi fence"
            r9.<init>(r0)
            throw r9
        L_0x002d:
            r0 = 91
        L_0x002f:
            r1 = 0
            r7[r1] = r0
            java.lang.Class<cag> r3 = defpackage.cag.class
            r2 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = 0
            r8.h = r2
            r8.f = r1
            r8.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cag.<init>(atmn):void");
    }

    private final boolean a(String str, String str2) {
        atmn atmn = (atmn) this.c;
        if ((atmn.a & 2) != 0 && !atmn.c.equals(str)) {
            return false;
        }
        atmn atmn2 = (atmn) this.c;
        if ((atmn2.a & 4) == 0 || atmn2.d.equals(str2)) {
            return true;
        }
        return false;
    }

    private final void b(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.WIFI_CONNECTION_STATE) {
            atmb atmb = atjl.g;
            if (atmb == null) {
                atmb = atmb.e;
            }
            int a2 = atma.a(atmb.b);
            if (a2 != 0 && a2 == 2) {
                atjm atjm = atjl.h;
                if (atjm == null) {
                    atjm = atjm.a;
                }
                auci auci = atvb.d;
                atjm.a(auci);
                if (atjm.m.a(auci.d)) {
                    atjm atjm2 = atjl.h;
                    if (atjm2 == null) {
                        atjm2 = atjm.a;
                    }
                    auci auci2 = atvb.d;
                    atjm2.a(auci2);
                    Object b = atjm2.m.b(auci2.d);
                    if (b == null) {
                        b = auci2.b;
                    } else {
                        auci2.a(b);
                    }
                    atvb atvb = (atvb) b;
                    this.g = false;
                    if ((atvb.a & 1) != 0) {
                        atva atva = atvb.b;
                        if (atva == null) {
                            atva = atva.d;
                        }
                        this.g = a(atva.b, atva.c);
                        return;
                    }
                    return;
                }
                ((anih) ((anih) bxk.a.c()).a("cag", "b", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WifiStateFenceImpl] No Wifi State data found.");
            }
        }
    }

    private final void c(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.WIFI_SCAN) {
            atmb atmb = atjl.g;
            if (atmb == null) {
                atmb = atmb.e;
            }
            int a2 = atma.a(atmb.b);
            if (a2 != 0 && a2 == 1) {
                atjm atjm = atjl.h;
                if (atjm == null) {
                    atjm = atjm.a;
                }
                auci auci = atvc.c;
                atjm.a(auci);
                if (atjm.m.a(auci.d)) {
                    atjm atjm2 = atjl.h;
                    if (atjm2 == null) {
                        atjm2 = atjm.a;
                    }
                    auci auci2 = atvc.c;
                    atjm2.a(auci2);
                    Object b = atjm2.m.b(auci2.d);
                    if (b == null) {
                        b = auci2.b;
                    } else {
                        auci2.a(b);
                    }
                    int i = 0;
                    this.f = false;
                    aucx aucx = ((atvc) b).a;
                    int size = aucx.size();
                    while (i < size) {
                        atvd atvd = (atvd) aucx.get(i);
                        i++;
                        if (a(atvd.b, atvd.c)) {
                            this.f = true;
                            return;
                        }
                    }
                    return;
                }
                ((anih) ((anih) bxk.a.c()).a("cag", "c", 100, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WifiStateFenceImpl] No WifiScan data found.");
            }
        }
    }

    public final int a(long j) {
        if (this.h == 0) {
            return b();
        }
        int a = atmm.a(((atmn) this.c).b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return a(this.g);
        }
        if (i == 2) {
            return a(this.f);
        }
        ((anih) ((anih) bxk.a.c()).a("cag", "a", 127, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WifiStateFenceImpl] Unknown trigger type: %s", this.b);
        return b();
    }

    public final void a(atjl atjl) {
        int a = atmm.a(((atmn) this.c).b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        int i2 = 0;
        if (i == 1) {
            atjv a2 = atjv.a(atjl.e);
            if (a2 == null) {
                a2 = atjv.UNKNOWN_CONTEXT_NAME;
            }
            if (a2 == atjv.WIFI_CONNECTION_STATE) {
                atmb atmb = atjl.g;
                if (atmb == null) {
                    atmb = atmb.e;
                }
                int a3 = atma.a(atmb.b);
                if (a3 != 0 && a3 == 2) {
                    atjm atjm = atjl.h;
                    if (atjm == null) {
                        atjm = atjm.a;
                    }
                    auci auci = atvb.d;
                    atjm.a(auci);
                    if (atjm.m.a(auci.d)) {
                        atjm atjm2 = atjl.h;
                        if (atjm2 == null) {
                            atjm2 = atjm.a;
                        }
                        auci auci2 = atvb.d;
                        atjm2.a(auci2);
                        Object b = atjm2.m.b(auci2.d);
                        if (b == null) {
                            b = auci2.b;
                        } else {
                            auci2.a(b);
                        }
                        atvb atvb = (atvb) b;
                        this.g = false;
                        if ((1 & atvb.a) != 0) {
                            atva atva = atvb.b;
                            if (atva == null) {
                                atva = atva.d;
                            }
                            this.g = a(atva.b, atva.c);
                        }
                    } else {
                        ((anih) ((anih) bxk.a.c()).a("cag", "b", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WifiStateFenceImpl] No Wifi State data found.");
                    }
                }
            }
        } else if (i == 2) {
            atjv a4 = atjv.a(atjl.e);
            if (a4 == null) {
                a4 = atjv.UNKNOWN_CONTEXT_NAME;
            }
            if (a4 == atjv.WIFI_SCAN) {
                atmb atmb2 = atjl.g;
                if (atmb2 == null) {
                    atmb2 = atmb.e;
                }
                int a5 = atma.a(atmb2.b);
                if (a5 != 0 && a5 == 1) {
                    atjm atjm3 = atjl.h;
                    if (atjm3 == null) {
                        atjm3 = atjm.a;
                    }
                    auci auci3 = atvc.c;
                    atjm3.a(auci3);
                    if (atjm3.m.a(auci3.d)) {
                        atjm atjm4 = atjl.h;
                        if (atjm4 == null) {
                            atjm4 = atjm.a;
                        }
                        auci auci4 = atvc.c;
                        atjm4.a(auci4);
                        Object b2 = atjm4.m.b(auci4.d);
                        if (b2 == null) {
                            b2 = auci4.b;
                        } else {
                            auci4.a(b2);
                        }
                        this.f = false;
                        aucx aucx = ((atvc) b2).a;
                        int size = aucx.size();
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            atvd atvd = (atvd) aucx.get(i2);
                            i2++;
                            if (a(atvd.b, atvd.c)) {
                                this.f = true;
                                break;
                            }
                        }
                    } else {
                        ((anih) ((anih) bxk.a.c()).a("cag", "c", 100, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WifiStateFenceImpl] No WifiScan data found.");
                    }
                }
            }
        } else {
            throw new IllegalStateException("Invalid fence trigger type for wifi fence");
        }
        atmb atmb3 = atjl.g;
        if (atmb3 == null) {
            atmb3 = atmb.e;
        }
        this.h = atmb3.c;
    }
}
