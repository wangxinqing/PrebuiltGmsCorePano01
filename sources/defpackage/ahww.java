package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahww extends ahwp {
    public final ahxb k;
    long l = -1;
    long m;
    public long n = -1;
    public ahtp o;
    public aqek p;
    public int q;
    public int r;
    private final ahxu s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahww(ajbd ajbd, aizy aizy, ajbg ajbg, ahqq ahqq, ajbx ajbx, ajph ajph, ahwm ahwm, aqek aqek, ahxu ahxu, ahxb ahxb) {
        super("CalibrationCollector", ajbd, aizy, ajbg, ahqq, ajbx, ajph, ahwm, ahwo.OFF);
        aizy aizy2 = aizy;
        aqek aqek2 = aqek;
        this.s = ahxu;
        this.p = aqek2;
        this.k = ahxb;
        long a = a(aizy, aqek2);
        this.l = a;
        this.m = a(aizy, a);
    }

    public static int a(int i) {
        if (i != 0) {
            return i != 1 ? 3 : 2;
        }
        return 1;
    }

    public final void a(int i, int i2, boolean z) {
    }

    public final void a(ahqp ahqp) {
    }

    public final void a(aiaj aiaj) {
    }

    public final void a(aibt aibt) {
    }

    public final void a(aiwz aiwz) {
    }

    public final void a(aqek aqek) {
    }

    /* access modifiers changed from: protected */
    public final boolean b(long j) {
        boolean z;
        int i;
        int i2;
        boolean z2 = this.s.i == 1 && a();
        long j2 = this.m;
        long j3 = j - j2;
        if (j3 >= 0) {
            z = j3 < 3600000;
        } else {
            z = false;
        }
        if (z2 && z) {
            this.j = ahwo.CALIBRATION_WAIT;
            if (this.k.g()) {
                i = this.k.e();
            } else {
                i = 0;
            }
            if (this.k.h()) {
                i2 = this.k.f();
            } else {
                i2 = 0;
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Starting calibration with delays: gyro: ");
            sb.append(i);
            sb.append(" accel:");
            sb.append(i2);
            sb.toString();
            this.q = i;
            this.r = i2;
            HashMap hashMap = new HashMap();
            hashMap.put(ahup.GYROSCOPE, Integer.valueOf(i));
            hashMap.put(ahup.ACCELEROMETER, Integer.valueOf(i2));
            ahtp a = this.b.b().a(false, ahup.a(ahup.GYROSCOPE, ahup.ACCELEROMETER), hashMap, 15000, (ahuu) null, new ahwv(this), this.a, (aizx) null);
            this.o = a;
            a.a();
            return true;
        }
        if (j3 >= 3600000) {
            long a2 = a(this.c, this.l);
            this.m = a2;
            h(a2);
        } else if (j >= j2) {
            h(j2 + 3600000);
        } else {
            h(j2);
        }
        return false;
    }

    public final void c(boolean z) {
    }

    public final void d(boolean z) {
    }

    public final void e(boolean z) {
    }

    /* access modifiers changed from: protected */
    public final boolean f() {
        if (a()) {
            return false;
        }
        this.o.b();
        this.j = ahwo.OFF;
        return true;
    }

    public final void h(long j) {
        if (j != this.n) {
            this.n = j;
            String valueOf = String.valueOf(new Date(this.c.d() + j));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Alarm set to: ");
            sb.append(j);
            sb.append(" ");
            sb.append(valueOf);
            sb.toString();
            this.d.a(ajbe.CALIBRATION_COLLECTOR, j, (aizx) null);
        }
    }

    public static long a(aizy aizy, long j) {
        Calendar instance = Calendar.getInstance();
        if (j == -1 || j > aizy.b()) {
            j = 0;
        }
        instance.setTimeInMillis(j);
        instance.add(6, 7);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(aizy.b());
        if (instance.before(instance2)) {
            instance.setTimeInMillis(instance2.getTimeInMillis());
        }
        instance.set(11, 3);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        if (instance.before(instance2)) {
            instance.add(6, 1);
        }
        long timeInMillis = instance.getTimeInMillis() - aizy.d();
        String valueOf = String.valueOf(new Date(aizy.d() + timeInMillis));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("Next calibration time: ");
        sb.append(timeInMillis);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
        return timeInMillis;
    }

    public static long a(aizy aizy, aqek aqek) {
        long j;
        if (aqek == null || !aqek.i(1)) {
            j = -1;
        } else {
            j = aqek.e(1).c(4);
            if (j > aizy.b()) {
                j = -1;
            }
        }
        String valueOf = String.valueOf(j != -1 ? new Date(j) : "");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("Last successful calibration occurred at: ");
        sb.append(j);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
        return j;
    }

    public static double[][] a(List list) {
        if (list != null) {
            if (((long) list.size()) >= 200) {
                int size = list.size();
                Iterator it = list.iterator();
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                double d6 = 0.0d;
                while (true) {
                    int i = size;
                    if (it.hasNext()) {
                        aqek aqek = (aqek) it.next();
                        double d7 = (double) aqek.d(1);
                        Double.isNaN(d7);
                        Iterator it2 = it;
                        d4 += Math.pow((double) aqek.d(1), 2.0d);
                        double d8 = (double) aqek.d(2);
                        Double.isNaN(d8);
                        d2 += d8;
                        d5 += Math.pow((double) aqek.d(2), 2.0d);
                        double d9 = (double) aqek.d(3);
                        Double.isNaN(d9);
                        d3 += d9;
                        d6 += Math.pow((double) aqek.d(3), 2.0d);
                        size = i;
                        it = it2;
                        d += d7;
                    } else {
                        double d10 = (double) i;
                        Double.isNaN(d10);
                        double d11 = d / d10;
                        Double.isNaN(d10);
                        double d12 = d2 / d10;
                        Double.isNaN(d10);
                        double d13 = d3 / d10;
                        double[][] dArr = new double[2][];
                        double d14 = d6;
                        dArr[0] = new double[]{d11, d12, d13};
                        Double.isNaN(d10);
                        double[][] dArr2 = dArr;
                        Double.isNaN(d10);
                        Double.isNaN(d10);
                        dArr2[1] = new double[]{(d4 / d10) - Math.pow(d11, 2.0d), (d5 / d10) - Math.pow(d12, 2.0d), (d14 / d10) - Math.pow(d13, 2.0d)};
                        return dArr2;
                    }
                }
            }
        }
        int size2 = list != null ? list.size() : 0;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Not enough gyro samples: ");
        sb.append(size2);
        sb.toString();
        return null;
    }

    public final void a(ajbe ajbe) {
        if (ajbe == ajbe.CALIBRATION_COLLECTOR) {
            this.n = -1;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(long j) {
        if (!this.s.h) {
            return false;
        }
        this.j = ahwo.IDLE;
        return true;
    }
}
