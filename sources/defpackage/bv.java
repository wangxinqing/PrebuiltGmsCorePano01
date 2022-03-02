package defpackage;

import java.util.List;

/* renamed from: bv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bv implements Runnable {
    final /* synthetic */ vi a;
    final /* synthetic */ bw b;

    public bv(bw bwVar, vi viVar) {
        this.b = bwVar;
        this.a = viVar;
    }

    public final void run() {
        int i;
        bw bwVar = this.b;
        bx bxVar = bwVar.e;
        if (bxVar.h == bwVar.c) {
            ct ctVar = bwVar.d;
            ct ctVar2 = bwVar.b;
            vi viVar = this.a;
            int i2 = bwVar.a.m;
            ct ctVar3 = bxVar.g;
            if (ctVar3 == null || bxVar.f != null) {
                throw new IllegalStateException("must be in snapshot state to apply diff");
            }
            bxVar.f = ctVar;
            bxVar.g = null;
            vo voVar = bxVar.a;
            cw cwVar = ctVar3.l;
            cw cwVar2 = ctVar.l;
            int b2 = cwVar.b();
            int b3 = cwVar2.b();
            int a2 = cwVar.a();
            int a3 = cwVar2.a();
            if (b2 == 0 && b3 == 0 && a2 == 0 && a3 == 0) {
                viVar.a(voVar);
            } else {
                if (b2 > b3) {
                    int i3 = b2 - b3;
                    voVar.b(cwVar.size() - i3, i3);
                } else if (b2 < b3) {
                    voVar.a(cwVar.size(), b3 - b2);
                }
                if (a2 > a3) {
                    voVar.b(0, a2 - a3);
                } else if (a2 < a3) {
                    voVar.a(0, a3 - a2);
                }
                if (a3 != 0) {
                    viVar.a(new cy(a3, voVar));
                } else {
                    viVar.a(voVar);
                }
            }
            ctVar.a((List) ctVar2, bxVar.i);
            if (!bxVar.f.isEmpty()) {
                cw cwVar3 = ctVar3.l;
                cw cwVar4 = ctVar2.l;
                int a4 = cwVar3.a();
                int i4 = i2 - a4;
                int size = (cwVar3.size() - a4) - cwVar3.b();
                if (i4 >= 0 && i4 < size) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 30) {
                            break;
                        }
                        int i6 = i5 / 2;
                        int i7 = 1;
                        if (i5 % 2 == 1) {
                            i7 = -1;
                        }
                        int i8 = (i6 * i7) + i4;
                        if (i8 >= 0 && i8 < cwVar3.g) {
                            if (i8 < viVar.b) {
                                int i9 = viVar.a[i8];
                                int i10 = (i9 & 31) != 0 ? i9 >> 5 : -1;
                                if (i10 != -1) {
                                    i = i10 + cwVar4.b;
                                    break;
                                }
                            } else {
                                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i8 + ", old list size = " + viVar.b);
                            }
                        }
                        i5++;
                    }
                    ct ctVar4 = bxVar.f;
                    ctVar4.b(Math.max(0, Math.min(ctVar4.size() - 1, i)));
                }
                i = Math.max(0, Math.min(i2, cwVar4.size() - 1));
                ct ctVar42 = bxVar.f;
                ctVar42.b(Math.max(0, Math.min(ctVar42.size() - 1, i)));
            }
            ct ctVar5 = bxVar.f;
            bxVar.b();
        }
    }
}
