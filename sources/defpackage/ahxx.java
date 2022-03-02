package defpackage;

import android.os.Build;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: ahxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahxx extends ahwp {
    private ahyw A;
    private boolean B = false;
    private final ahwn C;
    private boolean D = false;
    public final Set k = ahup.a(ahup.GPS, ahup.WIFI, ahup.WIFI_RTT, ahup.GYROSCOPE, ahup.ACCELEROMETER, ahup.GPS_SATELLITE);
    public long l = -1;
    public ahxq m = null;
    public boolean n = false;
    public long o = -1;
    public ahtp p = null;
    public boolean q = false;
    public final ahvl r = new ahxw(this);
    long s = -1;
    private final ahxb t;
    private final ahxu u;
    private final ahww v;
    private final aizk w;
    private final ahxt x;
    private boolean y = false;
    private Integer z;

    static {
        ahup.a(ahup.ACCELEROMETER);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahxx(ajbd ajbd, aizy aizy, ajbg ajbg, ahqq ahqq, ajbx ajbx, ajph ajph, ahwm ahwm, ahxb ahxb, ahww ahww, ahxu ahxu, aizk aizk, ahxt ahxt) {
        super("SCollector", ajbd, aizy, ajbg, ahqq, ajbx, ajph, ahwm, ahwo.IDLE);
        this.t = ahxb;
        this.u = ahxu;
        this.v = ahww;
        this.w = aizk;
        this.x = ahxt;
        ajbf p2 = ajbd.p();
        if (p2.a(ahup.UNCAL_MAGNETIC_FIELD)) {
            this.k.add(ahup.UNCAL_MAGNETIC_FIELD);
        } else if (p2.a(ahup.MAGNETIC_FIELD)) {
            this.k.add(ahup.MAGNETIC_FIELD);
        }
        if (p2.a(ahup.BAROMETER)) {
            this.k.add(ahup.BAROMETER);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.k.add(ahup.GNSS_MEASUREMENTS);
        }
        aizy aizy2 = aizy;
        this.C = new ahwn(aizy, 2);
    }

    /* access modifiers changed from: private */
    public final void a(long j, long j2, long j3, int i, boolean z2) {
        long d = this.c.d();
        long j4 = j + d;
        long j5 = j3 + d;
        this.t.a(j4, j5, i, this.m);
        this.t.c();
        Locale locale = Locale.ENGLISH;
        Object[] objArr = {Integer.valueOf(i), new Date(j4), new Date(j5)};
        if (j2 != -1) {
            long j6 = j3 - j2;
            if (j6 > 0) {
                ajbx ajbx = this.g;
                long c = ajbx.f.c();
                ajbx.a.d.b(j6, c);
                long j7 = ajbx.a.d.c;
                StringBuilder sb = new StringBuilder(59);
                sb.append("gps tokens left for sensor collection: ");
                sb.append(j7);
                sb.toString();
                ajbx.a.a(c);
            }
        }
        h(z2);
    }

    private final void g(boolean z2) {
        if (z2 != this.n) {
            if (z2) {
                this.w.a(180000, true);
            } else {
                this.w.c(180000);
            }
            this.n = z2;
        }
    }

    private final void h(long j) {
        long j2 = this.l;
        if (j2 == -1 || Math.abs(j - j2) > 1000) {
            this.l = j;
            this.d.a(ajbe.SENSOR_COLLECTOR, j, (aizx) null);
            Locale locale = Locale.ENGLISH;
            new Object[1][0] = new Date(this.c.d() + j);
        }
    }

    private final Calendar j() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.c.b());
        return instance;
    }

    public final void a(aiaj aiaj) {
        this.B = true;
    }

    public final void b(boolean z2) {
        this.u.b();
    }

    public final void c(boolean z2) {
        this.y = z2;
    }

    public final void e() {
        String valueOf = String.valueOf(this.u.c());
        if (valueOf.length() == 0) {
            new String("Sensor policy changed: ");
        } else {
            "Sensor policy changed: ".concat(valueOf);
        }
        a(j());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(boolean r12) {
        /*
            r11 = this;
            r0 = 1
            if (r12 != 0) goto L_0x008e
            ahxu r12 = r11.u
            int r12 = r12.i
            ajbd r1 = r11.b
            ajac r1 = r1.l()
            boolean r1 = r1.bf()
            ahww r2 = r11.v
            aqek r2 = r2.p
            ajbx r3 = r11.g
            ajbz r4 = r3.a
            ajcc r5 = r4.d
            r6 = 300000(0x493e0, double:1.482197E-318)
            aizy r3 = r3.f
            long r8 = r3.c()
            r10 = 1
            boolean r3 = r5.a(r6, r8, r10)
            r4 = 0
            if (r12 != r0) goto L_0x003c
            boolean r5 = r11.y
            if (r5 != 0) goto L_0x0032
            r5 = 0
            goto L_0x003d
        L_0x0032:
            if (r1 != 0) goto L_0x0035
            goto L_0x003c
        L_0x0035:
            if (r2 != 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            if (r3 == 0) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x0070
            ajbd r5 = r11.b
            ajaa r5 = r5.h()
            java.io.File r5 = r5.d()
            if (r5 == 0) goto L_0x0064
            java.io.File[] r5 = r5.listFiles()
            if (r5 == 0) goto L_0x0064
            int r6 = r5.length
            r7 = 0
            r8 = 0
        L_0x0054:
            if (r7 >= r6) goto L_0x0065
            r9 = r5[r7]
            boolean r9 = r9.isDirectory()
            if (r9 != 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            int r8 = r8 + 1
        L_0x0061:
            int r7 = r7 + 1
            goto L_0x0054
        L_0x0064:
            r8 = 0
        L_0x0065:
            r5 = 3
            if (r8 < r5) goto L_0x006a
            r6 = 0
            goto L_0x006b
        L_0x006a:
            r6 = 1
        L_0x006b:
            if (r8 < r5) goto L_0x006e
            r4 = 1
        L_0x006e:
            r5 = r6
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            if (r5 == 0) goto L_0x0074
            goto L_0x008e
        L_0x0074:
            if (r12 != r0) goto L_0x008d
            if (r1 == 0) goto L_0x008a
            if (r2 == 0) goto L_0x0087
            if (r3 == 0) goto L_0x0084
            if (r4 != 0) goto L_0x0081
            r0 = 99
            goto L_0x008e
        L_0x0081:
            r12 = 27
            return r12
        L_0x0084:
            r0 = 25
            goto L_0x008e
        L_0x0087:
            r0 = 26
            goto L_0x008e
        L_0x008a:
            r0 = 24
            goto L_0x008e
        L_0x008d:
            r0 = r12
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxx.f(boolean):int");
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        ahxu ahxu = this.u;
        boolean z2 = ahxu.h;
        if (!z2) {
            String valueOf = String.valueOf(ahxu.toString());
            if (valueOf.length() == 0) {
                new String("cantSchedule: ");
            } else {
                "cantSchedule: ".concat(valueOf);
            }
        }
        return z2;
    }

    public final boolean b(long j) {
        boolean z2;
        ahyw ahyw;
        ahxr ahxr;
        ahyw ahyw2;
        ahtp ahtp;
        Integer num;
        long j2 = j;
        if (this.B) {
            z2 = false;
        } else if (i()) {
            Calendar j3 = j();
            boolean a = this.C.a();
            if (this.l == -1) {
                a(j3);
            }
            ahxr a2 = this.x.a(j3, a);
            ahyw ahyw3 = a2.c;
            if (ahyw3 != null) {
                List list = this.x.a;
                int size = list.size();
                int i = 0;
                while (i < size) {
                    ahyw ahyw4 = (ahyw) list.get(i);
                    i++;
                    if (ahyw4.a(ahyw3.a)) {
                        ahyw = ahyw4;
                    }
                }
                String valueOf = String.valueOf(ahyw3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Did not find parent of subtimespan: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            ahyw = null;
            ahyw ahyw5 = this.A;
            if (ahyw5 == null) {
                ahyw2 = ahyw;
                ahxr = a2;
            } else if (ahyw5.equals(ahyw) || (num = this.z) == null) {
                ahyw2 = ahyw;
                ahxr = a2;
            } else {
                String valueOf2 = String.valueOf(num);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 69);
                sb2.append("Unable to do collection in the last timespan. Reporting the failure: ");
                sb2.append(valueOf2);
                sb2.toString();
                ahyw2 = ahyw;
                ahxr = a2;
                a(j, -1, j, num.intValue(), false);
            }
            this.A = ahyw2;
            if (ahxr.a) {
                this.m = ahxr.b;
                int f = f(a);
                if (f != 1) {
                    this.z = Integer.valueOf(f);
                } else {
                    if (!a) {
                        long j4 = this.s;
                        if (j4 == -1 || j2 - j4 >= 30000) {
                            this.z = 21;
                        }
                    }
                    this.C.b();
                    if (this.l != -1) {
                        this.l = -1;
                        this.d.a(ajbe.SENSOR_COLLECTOR);
                    }
                    this.j = ahwo.SENSOR_COLLECTION_WAIT;
                    g(false);
                    HashMap hashMap = new HashMap();
                    hashMap.put(ahup.GYROSCOPE, Integer.valueOf(this.t.e()));
                    hashMap.put(ahup.ACCELEROMETER, Integer.valueOf(this.t.f()));
                    ajbf p2 = this.b.p();
                    if (p2.a(ahup.UNCAL_MAGNETIC_FIELD)) {
                        hashMap.put(ahup.UNCAL_MAGNETIC_FIELD, 1);
                    } else if (p2.a(ahup.MAGNETIC_FIELD)) {
                        hashMap.put(ahup.MAGNETIC_FIELD, 1);
                    }
                    if (p2.a(ahup.BAROMETER)) {
                        hashMap.put(ahup.BAROMETER, 3);
                    }
                    EnumSet<E> noneOf = EnumSet.noneOf(ahup.class);
                    for (ahup ahup : this.k) {
                        if (ahup != ahup.WIFI_RTT || aydu.a.a().useWifiRtt()) {
                            noneOf.add(ahup);
                        }
                    }
                    File d = this.b.h().d();
                    if (d != null) {
                        ahtp = this.b.b().a(noneOf, hashMap, d.getPath(), 14, ayez.a.a().forceSensorCollectionUpload(), ayez.a.a().sensorCollectionWifiScanDelayMs(), this.v.p, this.r, this.a);
                    } else {
                        ahtp = null;
                    }
                    this.p = ahtp;
                    if (ahtp != null) {
                        this.o = j2;
                        this.q = false;
                        this.D = a;
                        ahtp.a();
                        ahwy.a(this.b.o(), true);
                    }
                    if (this.p == null) {
                        this.j = ahwo.IDLE;
                        a(j, -1, j, 29, false);
                    }
                }
            }
            if (this.j != ahwo.IDLE) {
                return true;
            }
            return false;
        } else {
            z2 = false;
        }
        this.B = z2;
        return z2;
    }

    public final void g(long j) {
        this.C.a(j);
    }

    private final void h(boolean z2) {
        this.p = null;
        this.q = false;
        this.o = -1;
        this.D = false;
        this.z = null;
        this.A = null;
        if (z2) {
            this.d.a(ajbe.SENSOR_COLLECTOR, 0, (aizx) null);
        }
    }

    public final boolean h() {
        if (this.p != null) {
            if (!this.D) {
                ahxu ahxu = this.u;
                if (ahxu.i != 1) {
                    this.q = true;
                    if (ahxu.d() && a()) {
                        ahtp ahtp = this.p;
                        if (ahtp != null) {
                            ahtp.b();
                        }
                    } else {
                        ahtp ahtp2 = this.p;
                        if (ahtp2 != null) {
                            ahtp2.c();
                        }
                        h(false);
                        this.j = ahwo.IDLE;
                        return true;
                    }
                }
            }
            return false;
        }
        this.j = ahwo.IDLE;
        return true;
    }

    private final void a(Calendar calendar) {
        boolean a = this.C.a();
        int f = f(a);
        boolean z2 = this.x.a(calendar, a).a;
        if (f == 1 && z2 && this.j == ahwo.IDLE) {
            g(true);
            h(this.x.a(calendar));
            return;
        }
        g(false);
        if (!i()) {
            return;
        }
        if (z2) {
            h(this.x.a(calendar));
        } else {
            h(this.x.b(calendar, true));
        }
    }

    public final void a(ajbe ajbe) {
        if (ajbe == ajbe.SENSOR_COLLECTOR) {
            this.l = -1;
            a(j());
        }
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        String valueOf = String.valueOf(activityRecognitionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Detected activity: ");
        sb.append(valueOf);
        sb.toString();
        if (activityRecognitionResult.a().a() == 2) {
            this.s = this.c.c();
        }
    }
}
