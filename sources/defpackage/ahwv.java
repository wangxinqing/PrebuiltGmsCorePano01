package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ahwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahwv extends ahvl {
    final /* synthetic */ ahww a;

    public ahwv(ahww ahww) {
        this.a = ahww;
    }

    private static final aiba a(aqek aqek, int i) {
        ArrayList arrayList;
        aqek aqek2 = aqek;
        int i2 = i;
        if (aqek2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < aqek2.j(4)) {
            aqek f = aqek2.f(4, i3);
            if (f.i(9)) {
                aqek e = f.e(9);
                boolean z = true;
                int i6 = 0;
                while (i6 < e.j(i2)) {
                    aqek f2 = e.f(i2, i6);
                    i5++;
                    if (((long) i5) > 10) {
                        arrayList2.add(f2);
                        if (z) {
                            arrayList = arrayList2;
                            z = false;
                        } else if (i4 < 5000) {
                            arrayList = arrayList2;
                            j += (((long) (f2.i(7) ? f2.b(7) : 0)) * 1000) + ((long) (f2.i(8) ? f2.b(8) : 0));
                            i4++;
                        }
                        i6++;
                        arrayList2 = arrayList;
                    }
                    arrayList = arrayList2;
                    i6++;
                    arrayList2 = arrayList;
                }
            }
            i3++;
            arrayList2 = arrayList2;
        }
        ArrayList arrayList3 = arrayList2;
        if (i4 < 100) {
            return null;
        }
        double d = (double) j;
        double d2 = (double) i4;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        StringBuilder sb = new StringBuilder(68);
        sb.append("TimeBetweenEvents for sensor:");
        sb.append(i2);
        sb.append(" is:");
        sb.append(d3);
        sb.toString();
        return aiba.a(arrayList3, Double.valueOf(d3));
    }

    private final void a(boolean z) {
        if (z) {
            ahww ahww = this.a;
            ahww.m = ahww.a(ahww.c, ahww.l);
        }
        this.a.j = ahwo.IDLE;
        this.a.h(0);
    }

    public final void a(aqek aqek) {
        Object obj;
        boolean z;
        if (this.a.a()) {
            aiba a2 = a(aqek, 4);
            aiba a3 = a(aqek, 3);
            if (a2 == null || a3 == null || a2.a == null || (obj = a2.b) == null || a3.b == null) {
                a(true);
                return;
            }
            double doubleValue = ((Double) obj).doubleValue();
            double doubleValue2 = ((Double) a3.b).doubleValue();
            int i = this.a.q;
            if (doubleValue < 7142857.142857143d) {
                i = ahww.a(i);
            }
            int i2 = this.a.r;
            if (doubleValue2 < 1.5384615E7d) {
                i2 = ahww.a(i2);
            }
            ahww ahww = this.a;
            if (i == ahww.q && i2 == ahww.r) {
                z = false;
            } else {
                z = true;
            }
            if (!ahww.k.g() || !this.a.k.h() || z) {
                this.a.k.a(i);
                this.a.k.b(i2);
                this.a.k.c();
                if (z) {
                    a(false);
                    return;
                }
            }
            long b = this.a.c.b();
            double[][] a4 = ahww.a((List) a2.a);
            aqek aqek2 = null;
            if (a4 != null) {
                String valueOf = String.valueOf(Arrays.deepToString(a4));
                if (valueOf.length() == 0) {
                    new String("Gyro stats: ");
                } else {
                    "Gyro stats: ".concat(valueOf);
                }
                double[] dArr = a4[1];
                if (dArr[0] < 8.0E-5d && dArr[1] < 8.0E-5d && dArr[2] < 8.0E-5d) {
                    aqek aqek3 = new aqek(ajck.ad);
                    aqek3.b(1, (float) a4[0][0]);
                    aqek3.b(2, (float) a4[0][1]);
                    aqek3.b(3, (float) a4[0][2]);
                    aqek3.b(4, b);
                    aqek aqek4 = new aqek(ajck.ab);
                    aqek4.b(1, (Object) aqek3);
                    aqek2 = aqek4;
                }
            }
            if (aqek2 != null) {
                try {
                    File d = this.a.b.h().d();
                    if (d != null) {
                        if (!d.exists()) {
                            if (!d.mkdirs()) {
                                String valueOf2 = String.valueOf(d);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                                sb.append("Failed to create sensorCacheDir: ");
                                sb.append(valueOf2);
                                throw new IOException(sb.toString());
                            }
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(d, "calibration"));
                        fileOutputStream.write(aqek2.b());
                        fileOutputStream.close();
                    }
                    ahww ahww2 = this.a;
                    ahww2.p = aqek2;
                    ahww2.l = ahww.a(ahww2.c, aqek2);
                } catch (IOException e) {
                    String valueOf3 = String.valueOf(e.getMessage());
                    if (valueOf3.length() == 0) {
                        new String("exception is ");
                    } else {
                        "exception is ".concat(valueOf3);
                    }
                }
            }
            a(true);
        }
    }

    public final void a(String str) {
        this.a.o.b();
        a(true);
    }
}
