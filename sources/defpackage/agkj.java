package defpackage;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: agkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agkj {
    public static long a(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0;
        }
        return healthStats.getMeasurement(i);
    }

    static boolean a(baqt baqt) {
        if (baqt != null) {
            return baqt.b <= 0 && baqt.c <= 0 && baqt.d <= 0 && baqt.e <= 0 && baqt.f <= 0 && baqt.g <= 0;
        }
        return true;
    }

    static boolean a(baqu baqu) {
        return baqu == null || (((long) baqu.b) <= 0 && ((long) baqu.c) <= 0);
    }

    public static baqv b(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return a((String) null, healthStats.getTimer(i));
    }

    public static List c(HealthStats healthStats, int i) {
        if (healthStats != null && healthStats.hasTimers(i)) {
            return agki.a.a((Map) healthStats.getTimers(i));
        }
        return Collections.emptyList();
    }

    public static Map d(HealthStats healthStats, int i) {
        return (healthStats != null && healthStats.hasStats(i)) ? healthStats.getStats(i) : Collections.emptyMap();
    }

    public static baqp a(String str) {
        aucd o = baqp.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqp baqp = (baqp) o.b;
        str.getClass();
        baqp.a |= 2;
        baqp.c = str;
        return (baqp) o.i();
    }

    static baqv a(baqv baqv, baqv baqv2) {
        if (baqv == null || baqv2 == null) {
            return baqv;
        }
        int i = baqv.b - baqv2.b;
        long j = baqv.c - baqv2.c;
        if (i == 0 && j == 0) {
            return null;
        }
        aucd o = baqv.e.o();
        baqp baqp = baqv.d;
        if (baqp == null) {
            baqp = baqp.d;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqv baqv3 = (baqv) o.b;
        baqp.getClass();
        baqv3.d = baqp;
        int i2 = baqv3.a | 4;
        baqv3.a = i2;
        int i3 = i2 | 1;
        baqv3.a = i3;
        baqv3.b = i;
        baqv3.a = i3 | 2;
        baqv3.c = j;
        return (baqv) o.i();
    }

    public static baqv a(String str, TimerStat timerStat) {
        aucd o = baqv.e.o();
        int count = timerStat.getCount();
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqv baqv = (baqv) o.b;
        baqv.a |= 1;
        baqv.b = count;
        long time = timerStat.getTime();
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqv baqv2 = (baqv) o.b;
        int i = baqv2.a | 2;
        baqv2.a = i;
        baqv2.c = time;
        if (baqv2.b < 0) {
            baqv2.a = i | 1;
            baqv2.b = 0;
        }
        if (str != null) {
            baqp a = a(str);
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqv baqv3 = (baqv) o.b;
            a.getClass();
            baqv3.d = a;
            baqv3.a |= 4;
        }
        baqv baqv4 = (baqv) o.b;
        if (baqv4.b == 0 && baqv4.c == 0) {
            return null;
        }
        return (baqv) o.i();
    }

    static baqx a(baqx baqx, baqx baqx2) {
        baqv baqv;
        baqv baqv2;
        baqv baqv3;
        baqv baqv4;
        baqv baqv5;
        baqv baqv6;
        baqv baqv7;
        baqv baqv8;
        baqv baqv9;
        baqv baqv10;
        baqv baqv11;
        baqv baqv12;
        baqv baqv13;
        baqv baqv14;
        baqv baqv15;
        baqv baqv16;
        baqv baqv17;
        baqv baqv18;
        baqv baqv19;
        baqv baqv20;
        baqv baqv21;
        baqv baqv22;
        baqv baqv23;
        baqv baqv24;
        baqv baqv25;
        baqv baqv26;
        baqv baqv27;
        baqv baqv28;
        baqv baqv29;
        baqv baqv30;
        baqv baqv31;
        baqv baqv32;
        if (baqx == null || baqx2 == null) {
            return baqx;
        }
        baqw baqw = (baqw) baqx.ar.o();
        if ((baqx.a & 1) != 0) {
            long j = baqx.c - baqx2.c;
            if (j != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx3 = (baqx) baqw.b;
                baqx3.a |= 1;
                baqx3.c = j;
            }
        }
        if ((baqx.a & 2) != 0) {
            long j2 = baqx.d - baqx2.d;
            if (j2 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx4 = (baqx) baqw.b;
                baqx4.a |= 2;
                baqx4.d = j2;
            }
        }
        if ((baqx.a & 4) != 0) {
            long j3 = baqx.e - baqx2.e;
            if (j3 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx5 = (baqx) baqw.b;
                baqx5.a |= 4;
                baqx5.e = j3;
            }
        }
        if ((baqx.a & 8) != 0) {
            long j4 = baqx.f - baqx2.f;
            if (j4 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx6 = (baqx) baqw.b;
                baqx6.a |= 8;
                baqx6.f = j4;
            }
        }
        baqw.g(agki.a.a((List) baqx.g, (List) baqx2.g));
        baqw.al(agki.a.a((List) baqx.h, (List) baqx2.h));
        baqw.am(agki.a.a((List) baqx.i, (List) baqx2.i));
        baqw.f(agki.a.a((List) baqx.j, (List) baqx2.j));
        baqw.e(agki.a.a((List) baqx.k, (List) baqx2.k));
        baqw.a((Iterable) agki.a.a((List) baqx.l, (List) baqx2.l));
        if ((baqx.a & 16) != 0) {
            baqv = baqx.m;
            if (baqv == null) {
                baqv = baqv.e;
            }
        } else {
            baqv = null;
        }
        if ((baqx2.a & 16) != 0) {
            baqv2 = baqx2.m;
            if (baqv2 == null) {
                baqv2 = baqv.e;
            }
        } else {
            baqv2 = null;
        }
        baqv a = a(baqv, baqv2);
        if (a != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx7 = (baqx) baqw.b;
            a.getClass();
            baqx7.m = a;
            baqx7.a |= 16;
        }
        baqw.b(agki.a.a((List) baqx.n, (List) baqx2.n));
        baqw.d(agkf.a.a((List) baqx.p, (List) baqx2.p));
        baqw.c(agke.a.a((List) baqx.q, (List) baqx2.q));
        if ((baqx.a & 32) != 0) {
            long j5 = baqx.r - baqx2.r;
            if (j5 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx8 = (baqx) baqw.b;
                baqx8.a |= 32;
                baqx8.r = j5;
            }
        }
        if ((baqx.a & 64) != 0) {
            long j6 = baqx.s - baqx2.s;
            if (j6 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx9 = (baqx) baqw.b;
                baqx9.a |= 64;
                baqx9.s = j6;
            }
        }
        if ((baqx.a & 128) != 0) {
            long j7 = baqx.t - baqx2.t;
            if (j7 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx10 = (baqx) baqw.b;
                baqx10.a |= 128;
                baqx10.t = j7;
            }
        }
        if ((baqx.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            long j8 = baqx.u - baqx2.u;
            if (j8 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx11 = (baqx) baqw.b;
                baqx11.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                baqx11.u = j8;
            }
        }
        if ((baqx.a & 512) != 0) {
            long j9 = baqx.v - baqx2.v;
            if (j9 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx12 = (baqx) baqw.b;
                baqx12.a |= 512;
                baqx12.v = j9;
            }
        }
        if ((baqx.a & 1024) != 0) {
            long j10 = baqx.w - baqx2.w;
            if (j10 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx13 = (baqx) baqw.b;
                baqx13.a |= 1024;
                baqx13.w = j10;
            }
        }
        if ((baqx.a & 2048) != 0) {
            long j11 = baqx.x - baqx2.x;
            if (j11 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx14 = (baqx) baqw.b;
                baqx14.a |= 2048;
                baqx14.x = j11;
            }
        }
        if ((baqx.a & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
            long j12 = baqx.y - baqx2.y;
            if (j12 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx15 = (baqx) baqw.b;
                baqx15.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                baqx15.y = j12;
            }
        }
        if ((baqx.a & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
            long j13 = baqx.z - baqx2.z;
            if (j13 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx16 = (baqx) baqw.b;
                baqx16.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                baqx16.z = j13;
            }
        }
        if ((baqx.a & 16384) != 0) {
            long j14 = baqx.A - baqx2.A;
            if (j14 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx17 = (baqx) baqw.b;
                baqx17.a |= 16384;
                baqx17.A = j14;
            }
        }
        if ((baqx.a & 32768) != 0) {
            long j15 = baqx.B - baqx2.B;
            if (j15 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx18 = (baqx) baqw.b;
                baqx18.a |= 32768;
                baqx18.B = j15;
            }
        }
        if ((baqx.a & 65536) != 0) {
            long j16 = baqx.C - baqx2.C;
            if (j16 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx19 = (baqx) baqw.b;
                baqx19.a |= 65536;
                baqx19.C = j16;
            }
        }
        if ((baqx.a & 131072) != 0) {
            long j17 = baqx.D - baqx2.D;
            if (j17 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx20 = (baqx) baqw.b;
                baqx20.a |= 131072;
                baqx20.D = j17;
            }
        }
        if ((baqx.a & 262144) != 0) {
            long j18 = baqx.E - baqx2.E;
            if (j18 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx21 = (baqx) baqw.b;
                baqx21.a |= 262144;
                baqx21.E = j18;
            }
        }
        if ((baqx.a & 524288) != 0) {
            baqv3 = baqx.F;
            if (baqv3 == null) {
                baqv3 = baqv.e;
            }
        } else {
            baqv3 = null;
        }
        if ((baqx2.a & 524288) != 0) {
            baqv4 = baqx2.F;
            if (baqv4 == null) {
                baqv4 = baqv.e;
            }
        } else {
            baqv4 = null;
        }
        baqv a2 = a(baqv3, baqv4);
        if (a2 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx22 = (baqx) baqw.b;
            a2.getClass();
            baqx22.F = a2;
            baqx22.a |= 524288;
        }
        if ((baqx.a & 1048576) != 0) {
            long j19 = baqx.G - baqx2.G;
            if (j19 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx23 = (baqx) baqw.b;
                baqx23.a |= 1048576;
                baqx23.G = j19;
            }
        }
        if ((baqx.a & 2097152) != 0) {
            baqv5 = baqx.H;
            if (baqv5 == null) {
                baqv5 = baqv.e;
            }
        } else {
            baqv5 = null;
        }
        if ((baqx2.a & 2097152) != 0) {
            baqv6 = baqx2.H;
            if (baqv6 == null) {
                baqv6 = baqv.e;
            }
        } else {
            baqv6 = null;
        }
        baqv a3 = a(baqv5, baqv6);
        if (a3 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx24 = (baqx) baqw.b;
            a3.getClass();
            baqx24.H = a3;
            baqx24.a |= 2097152;
        }
        if ((baqx.a & 4194304) != 0) {
            baqv7 = baqx.I;
            if (baqv7 == null) {
                baqv7 = baqv.e;
            }
        } else {
            baqv7 = null;
        }
        if ((baqx2.a & 4194304) != 0) {
            baqv8 = baqx2.I;
            if (baqv8 == null) {
                baqv8 = baqv.e;
            }
        } else {
            baqv8 = null;
        }
        baqv a4 = a(baqv7, baqv8);
        if (a4 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx25 = (baqx) baqw.b;
            a4.getClass();
            baqx25.I = a4;
            baqx25.a |= 4194304;
        }
        if ((baqx.a & 8388608) != 0) {
            baqv9 = baqx.J;
            if (baqv9 == null) {
                baqv9 = baqv.e;
            }
        } else {
            baqv9 = null;
        }
        if ((baqx2.a & 8388608) != 0) {
            baqv10 = baqx2.J;
            if (baqv10 == null) {
                baqv10 = baqv.e;
            }
        } else {
            baqv10 = null;
        }
        baqv a5 = a(baqv9, baqv10);
        if (a5 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx26 = (baqx) baqw.b;
            a5.getClass();
            baqx26.J = a5;
            baqx26.a |= 8388608;
        }
        if ((baqx.a & 16777216) != 0) {
            baqv11 = baqx.K;
            if (baqv11 == null) {
                baqv11 = baqv.e;
            }
        } else {
            baqv11 = null;
        }
        if ((baqx2.a & 16777216) != 0) {
            baqv12 = baqx2.K;
            if (baqv12 == null) {
                baqv12 = baqv.e;
            }
        } else {
            baqv12 = null;
        }
        baqv a6 = a(baqv11, baqv12);
        if (a6 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx27 = (baqx) baqw.b;
            a6.getClass();
            baqx27.K = a6;
            baqx27.a |= 16777216;
        }
        if ((baqx.a & 33554432) != 0) {
            baqv13 = baqx.L;
            if (baqv13 == null) {
                baqv13 = baqv.e;
            }
        } else {
            baqv13 = null;
        }
        if ((baqx2.a & 33554432) != 0) {
            baqv14 = baqx2.L;
            if (baqv14 == null) {
                baqv14 = baqv.e;
            }
        } else {
            baqv14 = null;
        }
        baqv a7 = a(baqv13, baqv14);
        if (a7 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx28 = (baqx) baqw.b;
            a7.getClass();
            baqx28.L = a7;
            baqx28.a |= 33554432;
        }
        if ((baqx.a & 67108864) != 0) {
            baqv15 = baqx.M;
            if (baqv15 == null) {
                baqv15 = baqv.e;
            }
        } else {
            baqv15 = null;
        }
        if ((baqx2.a & 67108864) != 0) {
            baqv16 = baqx2.M;
            if (baqv16 == null) {
                baqv16 = baqv.e;
            }
        } else {
            baqv16 = null;
        }
        baqv a8 = a(baqv15, baqv16);
        if (a8 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx29 = (baqx) baqw.b;
            a8.getClass();
            baqx29.M = a8;
            baqx29.a |= 67108864;
        }
        if ((baqx.a & 134217728) != 0) {
            baqv17 = baqx.N;
            if (baqv17 == null) {
                baqv17 = baqv.e;
            }
        } else {
            baqv17 = null;
        }
        if ((baqx2.a & 134217728) != 0) {
            baqv18 = baqx2.N;
            if (baqv18 == null) {
                baqv18 = baqv.e;
            }
        } else {
            baqv18 = null;
        }
        baqv a9 = a(baqv17, baqv18);
        if (a9 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx30 = (baqx) baqw.b;
            a9.getClass();
            baqx30.N = a9;
            baqx30.a |= 134217728;
        }
        if ((baqx.a & 268435456) != 0) {
            baqv19 = baqx.O;
            if (baqv19 == null) {
                baqv19 = baqv.e;
            }
        } else {
            baqv19 = null;
        }
        if ((baqx2.a & 268435456) != 0) {
            baqv20 = baqx2.O;
            if (baqv20 == null) {
                baqv20 = baqv.e;
            }
        } else {
            baqv20 = null;
        }
        baqv a10 = a(baqv19, baqv20);
        if (a10 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx31 = (baqx) baqw.b;
            a10.getClass();
            baqx31.O = a10;
            baqx31.a |= 268435456;
        }
        if ((baqx.a & 536870912) != 0) {
            baqv21 = baqx.P;
            if (baqv21 == null) {
                baqv21 = baqv.e;
            }
        } else {
            baqv21 = null;
        }
        if ((baqx2.a & 536870912) != 0) {
            baqv22 = baqx2.P;
            if (baqv22 == null) {
                baqv22 = baqv.e;
            }
        } else {
            baqv22 = null;
        }
        baqv a11 = a(baqv21, baqv22);
        if (a11 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx32 = (baqx) baqw.b;
            a11.getClass();
            baqx32.P = a11;
            baqx32.a |= 536870912;
        }
        if ((baqx.a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
            baqv23 = baqx.Q;
            if (baqv23 == null) {
                baqv23 = baqv.e;
            }
        } else {
            baqv23 = null;
        }
        if ((baqx2.a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
            baqv24 = baqx2.Q;
            if (baqv24 == null) {
                baqv24 = baqv.e;
            }
        } else {
            baqv24 = null;
        }
        baqv a12 = a(baqv23, baqv24);
        if (a12 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx33 = (baqx) baqw.b;
            a12.getClass();
            baqx33.Q = a12;
            baqx33.a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        }
        if ((baqx.a & Integer.MIN_VALUE) != 0) {
            baqv25 = baqx.R;
            if (baqv25 == null) {
                baqv25 = baqv.e;
            }
        } else {
            baqv25 = null;
        }
        if ((baqx2.a & Integer.MIN_VALUE) != 0) {
            baqv26 = baqx2.R;
            if (baqv26 == null) {
                baqv26 = baqv.e;
            }
        } else {
            baqv26 = null;
        }
        baqv a13 = a(baqv25, baqv26);
        if (a13 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx34 = (baqx) baqw.b;
            a13.getClass();
            baqx34.R = a13;
            baqx34.a |= Integer.MIN_VALUE;
        }
        if ((baqx.b & 1) != 0) {
            baqv27 = baqx.W;
            if (baqv27 == null) {
                baqv27 = baqv.e;
            }
        } else {
            baqv27 = null;
        }
        if ((baqx2.b & 1) != 0) {
            baqv28 = baqx2.W;
            if (baqv28 == null) {
                baqv28 = baqv.e;
            }
        } else {
            baqv28 = null;
        }
        baqv a14 = a(baqv27, baqv28);
        if (a14 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx35 = (baqx) baqw.b;
            a14.getClass();
            baqx35.W = a14;
            baqx35.b |= 1;
        }
        if ((baqx.b & 2) != 0) {
            baqv29 = baqx.X;
            if (baqv29 == null) {
                baqv29 = baqv.e;
            }
        } else {
            baqv29 = null;
        }
        if ((baqx2.b & 2) != 0) {
            baqv30 = baqx2.X;
            if (baqv30 == null) {
                baqv30 = baqv.e;
            }
        } else {
            baqv30 = null;
        }
        baqv a15 = a(baqv29, baqv30);
        if (a15 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx36 = (baqx) baqw.b;
            a15.getClass();
            baqx36.X = a15;
            baqx36.b |= 2;
        }
        if ((baqx.b & 4) != 0) {
            long j20 = baqx.Y - baqx2.Y;
            if (j20 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx37 = (baqx) baqw.b;
                baqx37.b |= 4;
                baqx37.Y = j20;
            }
        }
        if ((baqx.b & 8) != 0) {
            long j21 = baqx.Z - baqx2.Z;
            if (j21 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx38 = (baqx) baqw.b;
                baqx38.b |= 8;
                baqx38.Z = j21;
            }
        }
        if ((baqx.b & 16) != 0) {
            long j22 = baqx.aa - baqx2.aa;
            if (j22 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx39 = (baqx) baqw.b;
                baqx39.b |= 16;
                baqx39.aa = j22;
            }
        }
        if ((baqx.b & 32) != 0) {
            long j23 = baqx.ab - baqx2.ab;
            if (j23 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx40 = (baqx) baqw.b;
                baqx40.b |= 32;
                baqx40.ab = j23;
            }
        }
        if ((baqx.b & 64) != 0) {
            long j24 = baqx.ac - baqx2.ac;
            if (j24 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx41 = (baqx) baqw.b;
                baqx41.b |= 64;
                baqx41.ac = j24;
            }
        }
        if ((baqx.b & 128) != 0) {
            long j25 = baqx.ad - baqx2.ad;
            if (j25 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx42 = (baqx) baqw.b;
                baqx42.b |= 128;
                baqx42.ad = j25;
            }
        }
        if ((baqx.b & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            long j26 = baqx.ae - baqx2.ae;
            if (j26 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx43 = (baqx) baqw.b;
                baqx43.b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                baqx43.ae = j26;
            }
        }
        if ((baqx.b & 512) != 0) {
            long j27 = baqx.af - baqx2.af;
            if (j27 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx44 = (baqx) baqw.b;
                baqx44.b |= 512;
                baqx44.af = j27;
            }
        }
        if ((baqx.b & 1024) != 0) {
            long j28 = baqx.ag - baqx2.ag;
            if (j28 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx45 = (baqx) baqw.b;
                baqx45.b |= 1024;
                baqx45.ag = j28;
            }
        }
        if ((baqx.b & 2048) != 0) {
            long j29 = baqx.ah - baqx2.ah;
            if (j29 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx46 = (baqx) baqw.b;
                baqx46.b |= 2048;
                baqx46.ah = j29;
            }
        }
        if ((baqx.b & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
            long j30 = baqx.ai - baqx2.ai;
            if (j30 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx47 = (baqx) baqw.b;
                baqx47.b |= FragmentTransaction.TRANSIT_ENTER_MASK;
                baqx47.ai = j30;
            }
        }
        if ((baqx.b & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
            long j31 = baqx.aj - baqx2.aj;
            if (j31 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx48 = (baqx) baqw.b;
                baqx48.b |= FragmentTransaction.TRANSIT_EXIT_MASK;
                baqx48.aj = j31;
            }
        }
        if ((baqx.b & 16384) != 0) {
            long j32 = baqx.ak - baqx2.ak;
            if (j32 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx49 = (baqx) baqw.b;
                baqx49.b |= 16384;
                baqx49.ak = j32;
            }
        }
        if ((baqx.b & 32768) != 0) {
            long j33 = baqx.al - baqx2.al;
            if (j33 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx50 = (baqx) baqw.b;
                baqx50.b = 32768 | baqx50.b;
                baqx50.al = j33;
            }
        }
        if ((baqx.b & 65536) != 0) {
            long j34 = baqx.am - baqx2.am;
            if (j34 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx51 = (baqx) baqw.b;
                baqx51.b |= 65536;
                baqx51.am = j34;
            }
        }
        if ((baqx.b & 131072) != 0) {
            baqv31 = baqx.an;
            if (baqv31 == null) {
                baqv31 = baqv.e;
            }
        } else {
            baqv31 = null;
        }
        if ((baqx2.b & 131072) != 0) {
            baqv32 = baqx2.an;
            if (baqv32 == null) {
                baqv32 = baqv.e;
            }
        } else {
            baqv32 = null;
        }
        baqv a16 = a(baqv31, baqv32);
        if (a16 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx52 = (baqx) baqw.b;
            a16.getClass();
            baqx52.an = a16;
            baqx52.b |= 131072;
        }
        if ((baqx.b & 262144) != 0) {
            long j35 = baqx.ao - baqx2.ao;
            if (j35 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx53 = (baqx) baqw.b;
                baqx53.b |= 262144;
                baqx53.ao = j35;
            }
        }
        if ((baqx.b & 524288) != 0) {
            long j36 = baqx.ap - baqx2.ap;
            if (j36 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx54 = (baqx) baqw.b;
                baqx54.b |= 524288;
                baqx54.ap = j36;
            }
        }
        if ((baqx.b & 1048576) != 0) {
            long j37 = baqx.aq - baqx2.aq;
            if (j37 != 0) {
                if (baqw.c) {
                    baqw.c();
                    baqw.c = false;
                }
                baqx baqx55 = (baqx) baqw.b;
                baqx55.b |= 1048576;
                baqx55.aq = j37;
            }
        }
        baqx baqx56 = (baqx) baqw.i();
        if (a(baqx56)) {
            return null;
        }
        return baqx56;
    }

    static boolean a(baqr baqr) {
        if (baqr == null || (baqr.b.size() == 0 && baqr.c.size() == 0)) {
            return true;
        }
        return false;
    }

    static boolean a(baqx baqx) {
        if (baqx != null) {
            return baqx.c <= 0 && baqx.d <= 0 && baqx.e <= 0 && baqx.f <= 0 && baqx.g.size() == 0 && baqx.h.size() == 0 && baqx.i.size() == 0 && baqx.j.size() == 0 && baqx.k.size() == 0 && baqx.l.size() == 0 && baqx.n.size() == 0 && baqx.o.size() == 0 && baqx.p.size() == 0 && baqx.q.size() == 0 && baqx.r <= 0 && baqx.s <= 0 && baqx.t <= 0 && baqx.u <= 0 && baqx.v <= 0 && baqx.w <= 0 && baqx.x <= 0 && baqx.y <= 0 && baqx.z <= 0 && baqx.A <= 0 && baqx.B <= 0 && baqx.C <= 0 && baqx.D <= 0 && baqx.E <= 0 && baqx.G <= 0 && baqx.Y <= 0 && baqx.Z <= 0 && baqx.aa <= 0 && baqx.ab <= 0 && baqx.ac <= 0 && baqx.ad <= 0 && baqx.ae <= 0 && baqx.af <= 0 && baqx.ag <= 0 && baqx.ah <= 0 && baqx.ai <= 0 && baqx.aj <= 0 && baqx.ak <= 0 && baqx.al <= 0 && baqx.am <= 0 && baqx.ao <= 0 && baqx.ap <= 0 && baqx.aq <= 0;
        }
        return true;
    }
}
