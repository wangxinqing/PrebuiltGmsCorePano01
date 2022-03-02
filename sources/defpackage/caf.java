package defpackage;

/* renamed from: caf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class caf extends bzi {
    private int f;
    private long g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public caf(defpackage.atmk r9) {
        /*
            r8 = this;
            int r0 = r9.a
            int r0 = defpackage.atmj.a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            atjs r6 = defpackage.atjs.WEATHER_FENCE
            int[] r7 = new int[r1]
            r1 = 0
            r2 = 31
            r7[r1] = r2
            java.lang.Class<caf> r3 = defpackage.caf.class
            r1 = -1
            int r5 = r0 + -1
            r2 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f = r1
            r0 = -1
            r8.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caf.<init>(atmk):void");
    }

    private static final int a(float f2, float f3, float f4) {
        return (f2 > f4 || f4 >= f3) ? 0 : 1;
    }

    public final float j() {
        return ((atmk) this.c).c;
    }

    public final float a() {
        return ((atmk) this.c).b;
    }

    public final int a(long j) {
        int i = this.f;
        if (i == -1) {
            return b();
        }
        int i2 = this.b;
        boolean z = true;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            if (i == 0) {
                z = false;
            }
            return a(z);
        }
        ((anih) ((anih) bxk.a.c()).a("caf", "a", 173, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WeatherFenceImpl] Unknown trigger type: %s", this.b);
        return b();
    }

    public final void a(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.WEATHER) {
            atjm atjm = atjl.h;
            if (atjm == null) {
                atjm = atjm.a;
            }
            auci auci = atuv.d;
            atjm.a(auci);
            if (atjm.m.a(auci.d)) {
                atjm atjm2 = atjl.h;
                if (atjm2 == null) {
                    atjm2 = atjm.a;
                }
                auci auci2 = atuv.d;
                atjm2.a(auci2);
                Object b = atjm2.m.b(auci2.d);
                if (b == null) {
                    b = auci2.b;
                } else {
                    auci2.a(b);
                }
                atuv atuv = (atuv) b;
                long j = this.g;
                atmb atmb = atjl.g;
                if (atmb == null) {
                    atmb = atmb.e;
                }
                if (j < atmb.c) {
                    int i = this.b;
                    int i2 = -1;
                    if (i == 1) {
                        atuu atuu = atuv.b;
                        if (atuu == null) {
                            atuu = atuu.c;
                        }
                        atuz atuz = atuu.b;
                        if (atuz == null) {
                            atuz = atuz.f;
                        }
                        i2 = a(a(), j(), atuz.a);
                    } else if (i == 2) {
                        atuu atuu2 = atuv.b;
                        if (atuu2 == null) {
                            atuu2 = atuu.c;
                        }
                        atuz atuz2 = atuu2.b;
                        if (atuz2 == null) {
                            atuz2 = atuz.f;
                        }
                        i2 = a(a(), j(), atuz2.b);
                    } else if (i == 3) {
                        atuu atuu3 = atuv.b;
                        if (atuu3 == null) {
                            atuu3 = atuu.c;
                        }
                        atuz atuz3 = atuu3.b;
                        if (atuz3 == null) {
                            atuz3 = atuz.f;
                        }
                        i2 = a(a(), j(), atuz3.c);
                    } else if (i == 4) {
                        atuu atuu4 = atuv.b;
                        if (atuu4 == null) {
                            atuu4 = atuu.c;
                        }
                        atuz atuz4 = atuu4.b;
                        if (atuz4 == null) {
                            atuz4 = atuz.f;
                        }
                        int i3 = atuz4.d;
                        atmk atmk = (atmk) this.c;
                        float f2 = (float) i3;
                        i2 = (((float) atmk.d) > f2 || f2 >= ((float) atmk.e)) ? 0 : 1;
                    } else if (i == 5) {
                        int i4 = ((atmk) this.c).f;
                        atuu atuu5 = atuv.b;
                        if (atuu5 == null) {
                            atuu5 = atuu.c;
                        }
                        atuz atuz5 = atuu5.b;
                        if (atuz5 == null) {
                            atuz5 = atuz.f;
                        }
                        aucx aucx = atuz5.e;
                        int size = aucx.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size) {
                                int a2 = atux.a(((atuy) aucx.get(i5)).a);
                                if (a2 == 0) {
                                    a2 = 1;
                                }
                                i5++;
                                if (a2 - 1 == i4) {
                                    i2 = 1;
                                    break;
                                }
                            } else {
                                i2 = 0;
                                break;
                            }
                        }
                    }
                    if (i2 != this.f) {
                        this.f = i2;
                        atmb atmb2 = atjl.g;
                        if (atmb2 == null) {
                            atmb2 = atmb.e;
                        }
                        this.g = atmb2.c;
                        return;
                    }
                    return;
                }
                ((anih) ((anih) bxk.a.c()).a("caf", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WeatherFenceImpl] This weather data was received earlier and processed");
                return;
            }
            ((anih) ((anih) bxk.a.c()).a("caf", "a", 95, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WeatherFenceImpl] No weather data.");
        }
    }
}
