package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.SleepSegmentEvent;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ahjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjg implements ajcl {
    public final ahix a;
    public final ahon b;
    private final ahpo c;
    private final ahme d;
    private final ahlw e;
    private final ahld f;
    private final aizs g;
    private final ahjo h;
    private final ahpq i;
    private final aizv j;
    private final ahps k;
    private ahlc l = null;
    private final List m = new ArrayList();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: ajbb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: ajbw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: ajay} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: ajay} */
    /* JADX WARNING: type inference failed for: r2v17, types: [ahjo, ahld, ahpq, ahps, ahlw] */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ahjg(defpackage.ajqq r30, defpackage.ajbd r31, boolean r32, defpackage.aiwm r33, defpackage.ahzz r34, defpackage.ahjc r35, defpackage.aizl r36, defpackage.ajak r37, defpackage.ahon r38) {
        /*
            r29 = this;
            r1 = r29
            r0 = r36
            r29.<init>()
            r15 = 0
            r1.l = r15
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.m = r2
            r2 = r38
            r1.b = r2
            ahme r2 = new ahme
            r14 = r31
            aixc r14 = (defpackage.aixc) r14
            aizm r3 = r14.l
            r6 = r33
            r2.<init>(r3, r6)
            r1.d = r2
            boolean r2 = defpackage.axwi.c()
            if (r2 != 0) goto L_0x0032
            ajay r2 = new ajay
            r2.<init>()
            r19 = r2
            goto L_0x0053
        L_0x0032:
            r2 = r37
            aixc r2 = (defpackage.aixc) r2
            arnf r3 = r2.r
            android.content.Context r4 = r2.a
            aizy r5 = r2.f
            aixh r2 = r2.k
            arnd r3 = r3.a(r4)
            if (r3 != 0) goto L_0x004c
            ajay r2 = new ajay
            r2.<init>()
            r19 = r2
            goto L_0x0053
        L_0x004c:
            ajbw r4 = new ajbw
            r4.<init>(r3, r2)
            r19 = r4
        L_0x0053:
            if (r32 == 0) goto L_0x006c
            aiyk r2 = defpackage.aiyk.g
            r3 = r37
            aixc r3 = (defpackage.aixc) r3
            aixh r4 = r3.k
            aizy r5 = r3.f
            arnf r5 = r3.r
            android.content.Context r7 = r3.a
            aicn r3 = r3.b
            ajao r2 = r2.a((defpackage.ajbg) r4, (defpackage.arnf) r5, (android.content.Context) r7)
            r21 = r2
            goto L_0x006e
        L_0x006c:
            r21 = r15
        L_0x006e:
            aiyk r2 = defpackage.aiyk.g
            r13 = r37
            aixc r13 = (defpackage.aixc) r13
            arnf r3 = r13.r
            android.content.Context r4 = r13.a
            aixh r5 = r13.k
            aicn r7 = r13.b
            ajaj r12 = r2.a((defpackage.arnf) r3, (android.content.Context) r4, (defpackage.ajbg) r5, (defpackage.aicn) r7)
            int r2 = r12.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 39
            r3.<init>(r4)
            java.lang.String r4 = "Hardware detector version = "
            r3.append(r4)
            r3.append(r2)
            r3.toString()
            axyr r2 = defpackage.axyr.a
            axys r2 = r2.a()
            boolean r2 = r2.enableChreArBluetoothFiltering()
            if (r2 != 0) goto L_0x00a3
            goto L_0x00ad
        L_0x00a3:
            ahme r2 = r1.d
            ahjd r3 = new ahjd
            r3.<init>(r12)
            r2.a((defpackage.aiao) r3)
        L_0x00ad:
            axyr r2 = defpackage.axyr.a
            axys r2 = r2.a()
            boolean r2 = r2.enableChreArWifiFiltering()
            if (r2 == 0) goto L_0x00c3
            java.util.List r2 = r1.m
            ahje r3 = new ahje
            r3.<init>(r12)
            r2.add(r3)
        L_0x00c3:
            ahix r11 = new ahix
            aizm r5 = r14.l
            aizy r8 = r14.f
            aizz r9 = r14.o
            aicn r10 = r14.b
            ajaa r7 = r14.g
            aixe r4 = r14.p
            aixh r3 = r14.k
            aiyk r2 = defpackage.aiyk.g
            r15 = r0
            aixc r15 = (defpackage.aixc) r15
            r18 = r3
            android.hardware.SensorManager r3 = r15.m
            r31 = r4
            aixh r4 = r15.k
            aicn r6 = r15.b
            ajbi r22 = r2.a((android.hardware.SensorManager) r3, (defpackage.ajbg) r4, (defpackage.aicn) r6)
            boolean r2 = defpackage.aixc.q()
            if (r2 == 0) goto L_0x00fb
            aiyk r2 = defpackage.aiyk.g
            android.hardware.SensorManager r3 = r15.m
            aixh r4 = r15.k
            aicn r6 = r15.b
            ajbi r2 = r2.c(r3, r4, r6)
            r23 = r2
            goto L_0x0102
        L_0x00fb:
            ajbb r2 = new ajbb
            r2.<init>()
            r23 = r2
        L_0x0102:
            aixl r17 = r36.bl()
            ahme r2 = r1.d
            r20 = r2
            r2 = r11
            r3 = r35
            r24 = r31
            r4 = r36
            r6 = r33
            r25 = r7
            r7 = r30
            r0 = r11
            r11 = r25
            r30 = r12
            r12 = r24
            r26 = r13
            r13 = r18
            r27 = r14
            r14 = r32
            r28 = r15
            r15 = r22
            r16 = r23
            r18 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.a = r0
            r2 = r30
            r2.a((defpackage.ajad) r0)
            boolean r0 = defpackage.axwx.n()
            if (r0 == 0) goto L_0x0145
            java.util.List r0 = r1.m
            ahix r3 = r1.a
            r0.add(r3)
        L_0x0145:
            boolean r0 = defpackage.axxa.d()
            if (r0 == 0) goto L_0x01ad
            r0 = r27
            aizy r3 = r0.f
            aicn r4 = r0.b
            java.lang.Object r5 = defpackage.ahpi.a
            monitor-enter(r5)
            ahpi r6 = defpackage.ahpi.b     // Catch:{ all -> 0x01aa }
            if (r6 != 0) goto L_0x0161
            ahpi r6 = new ahpi     // Catch:{ all -> 0x01aa }
            r7 = r34
            r6.<init>(r3, r7, r4)     // Catch:{ all -> 0x01aa }
            defpackage.ahpi.b = r6     // Catch:{ all -> 0x01aa }
        L_0x0161:
            ahpi r3 = defpackage.ahpi.b     // Catch:{ all -> 0x01aa }
            monitor-exit(r5)     // Catch:{ all -> 0x01aa }
            aizy r8 = r0.f
            aiwl r10 = new aiwl
            ahpm r4 = new ahpm
            r4.<init>()
            r5 = r28
            android.content.Context r5 = r5.a
            r10.<init>(r4, r5)
            ahix r11 = r1.a
            java.lang.Object r4 = defpackage.ahpo.a
            monitor-enter(r4)
            ahpo r5 = defpackage.ahpo.b     // Catch:{ all -> 0x01a7 }
            if (r5 != 0) goto L_0x0188
            ahpo r5 = new ahpo     // Catch:{ all -> 0x01a7 }
            r7 = r5
            r9 = r35
            r12 = r3
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01a7 }
            defpackage.ahpo.b = r5     // Catch:{ all -> 0x01a7 }
        L_0x0188:
            ahpo r5 = defpackage.ahpo.b     // Catch:{ all -> 0x01a7 }
            monitor-exit(r4)     // Catch:{ all -> 0x01a7 }
            r1.c = r5
            java.util.List r4 = r1.m
            r4.add(r5)
            ahme r4 = r1.d
            r4.a((defpackage.aiao) r3)
            ahix r3 = r1.a
            ahpo r4 = r1.c
            java.util.List r3 = r3.aq
            r3.add(r4)
            ahpo r3 = r1.c
            r2.a((defpackage.ajad) r3)
            r2 = 0
            goto L_0x01b2
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01a7 }
            throw r0
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01aa }
            throw r0
        L_0x01ad:
            r0 = r27
            r2 = 0
            r1.c = r2
        L_0x01b2:
            if (r32 != 0) goto L_0x01e6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            ahix r3 = r1.a
            ahjw r3 = r3.n
            r9.add(r3)
            ahjf r3 = new ahjf
            r3.<init>(r1)
            r9.add(r3)
            ahlw r10 = new ahlw
            aizy r5 = r0.f
            aicn r6 = r0.b
            aixh r7 = r0.k
            ahix r8 = r1.a
            r3 = r10
            r4 = r35
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.e = r10
            ahme r3 = r1.d
            r3.a((defpackage.aiao) r10)
            ahix r3 = r1.a
            ahld r3 = r3.o
            r1.f = r3
            goto L_0x01ea
        L_0x01e6:
            r1.e = r2
            r1.f = r2
        L_0x01ea:
            r3 = r26
            arnf r4 = r3.r
            android.content.Context r5 = r3.a
            aiwq r4 = defpackage.aiwq.a((defpackage.arnf) r4, (android.content.Context) r5)
            r1.g = r4
            if (r4 == 0) goto L_0x0244
            ahjo r2 = new ahjo
            aizy r4 = r0.f
            aicn r4 = r0.b
            r5 = r36
            r2.<init>(r5, r4)
            r1.h = r2
            ahpq r2 = new ahpq
            aizy r4 = r0.f
            r4 = r35
            r2.<init>(r4)
            r1.i = r2
            aizs r2 = r1.g
            ahjo r4 = r1.h
            r2.a(r4)
            aizs r2 = r1.g
            ahpq r4 = r1.i
            r2.a(r4)
            ahps r2 = new ahps
            aizs r4 = r1.g
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            r7 = 1
            if (r5 < r6) goto L_0x023a
            android.content.Context r5 = r0.a
            java.lang.String r6 = "location"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.location.LocationManager r5 = (android.location.LocationManager) r5
            if (r5 == 0) goto L_0x023a
            boolean r7 = r5.isLocationEnabled()
            goto L_0x023b
        L_0x023a:
        L_0x023b:
            r2.<init>(r4, r7)
            r1.k = r2
            r2.a()
            goto L_0x024a
        L_0x0244:
            r1.h = r2
            r1.i = r2
            r1.k = r2
        L_0x024a:
            arnf r2 = r3.r
            android.content.Context r4 = r3.a
            aixh r3 = r3.k
            aiwt r2 = defpackage.aiwt.a((defpackage.arnf) r2, (android.content.Context) r4, (defpackage.ajbg) r3)
            r1.j = r2
            if (r2 == 0) goto L_0x0272
            ahlc r2 = new ahlc
            aizy r3 = r0.f
            aicn r0 = r0.b
            ahix r3 = r1.a
            ahld r4 = r1.f
            r2.<init>(r0, r3, r4)
            r1.l = r2
            aizv r0 = r1.j
            r0.a(r2)
            ahix r0 = r1.a
            aizv r2 = r1.j
            r0.J = r2
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjg.<init>(ajqq, ajbd, boolean, aiwm, ahzz, ahjc, aizl, ajak, ahon):void");
    }

    public final void a() {
    }

    public final void a(ahqp ahqp) {
    }

    public final void a(aiaj aiaj) {
    }

    public final void a(aiat aiat, boolean z) {
        this.a.ai = aiat.a;
    }

    public final void a(aiwz aiwz) {
    }

    public final void a(aqek aqek) {
    }

    public final void a(List list, aipj aipj) {
    }

    public final void a(boolean z, boolean z2) {
    }

    public final void a(long[] jArr, long[] jArr2, aipp aipp) {
    }

    public final void a(aibt[] aibtArr, boolean z) {
    }

    public final void b() {
    }

    public final void b(long j2) {
    }

    public final void b(aqek aqek) {
    }

    public final void c() {
        this.a.q.w();
    }

    public final void d() {
        this.a.q.x();
    }

    public final void e() {
        this.a.q.y();
    }

    public final void e(boolean z) {
    }

    public final void f() {
        ahix ahix = this.a;
        if (ahix.B.d()) {
            ahix.B.g();
        } else {
            ahix.a(ahzw.b);
        }
    }

    public final void f(boolean z) {
    }

    public final void g() {
        SharedPreferences sharedPreferences;
        ahon ahon = this.b;
        if (ahon != null && axzs.c() && axzs.b()) {
            ahop ahop = (ahop) ahon;
            iwq a2 = iwq.a(ahop.a);
            if (a2 != null && (sharedPreferences = ahop.a.getSharedPreferences("dndNotificationSharedPreference", 0)) != null) {
                boolean z = sharedPreferences.getBoolean("dndNotificationSent", false);
                if (!a2.e()) {
                    if (!z) {
                        if (aycw.b()) {
                            ahol.a(ahop.a).a(false, 2);
                        }
                    } else if (aycz.b()) {
                        ahol.a(ahop.a).a(6);
                    }
                } else if (z) {
                    ahoo.a(ahop.a, a2);
                    if (aycz.b()) {
                        ahol.a(ahop.a).a(5);
                    }
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.location.settings.ACTIVITY_RECOGNITION_PERMISSION");
                    intent.setFlags(268468224);
                    intent.putExtra("ruleAdded", true);
                    ahop.a.startActivity(intent);
                }
            }
        }
    }

    public final void g(boolean z) {
    }

    public final void h() {
        ahps ahps = this.k;
        if (ahps != null) {
            ahps.a();
        }
    }

    public final void h(Object obj) {
    }

    public final void h(boolean z) {
    }

    public final void i() {
    }

    public final void a(int i2) {
        ahme ahme = this.d;
        if (i2 == 10) {
            synchronized (ahme.c) {
                for (ahmd ahmd : ahme.d.values()) {
                    if (ahmd.b) {
                        ahme.a(ahmd.c, 5);
                    }
                }
                ahme.a((aiaf) null);
            }
        }
    }

    public final void c(boolean z) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("deepIdleModeChanged(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        ahix ahix = this.a;
        if (ahix.p && z && ahix.X.containsKey(9)) {
            ahix.a(true);
            DetectedActivity detectedActivity = new DetectedActivity(9, 100);
            aizy aizy = ahix.g;
            long currentTimeMillis = System.currentTimeMillis();
            aizy aizy2 = ahix.g;
            ahix.a(new ActivityRecognitionResult(detectedActivity, currentTimeMillis, SystemClock.elapsedRealtime(), ahnk.WATCH_OFF_BODY_MANCHEGO.am, (Bundle) null));
        }
        ahix.q.c(z);
    }

    public final void d(boolean z) {
        ahps ahps = this.k;
        if (ahps != null) {
            Locale.getDefault();
            new Object[1][0] = Boolean.valueOf(z);
            ahps.b = z;
            ahps.a();
        }
    }

    public final void b(boolean z) {
        ahix ahix = this.a;
        ahix.ad = z;
        StringBuilder sb = new StringBuilder(28);
        sb.append("isAndroidPowerSaveMode=");
        sb.append(z);
        sb.toString();
        ahix.b(false, false);
        ahix.q.A();
    }

    public final void a(int i2, int i3, boolean z) {
        ahov ahov;
        aizs aizs = this.g;
        if (aizs != null) {
            ((aiwq) aizs).a(i2, i3, z);
        }
        ahix ahix = this.a;
        if (ahix != null) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("battery charging status changed to = ");
            sb.append(z);
            sb.toString();
            ahox ahox = ahix.ax;
            if (ahox != null && (ahov = ahox.a) != null) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Plugged status changed to ");
                sb2.append(z);
                sb2.toString();
                ahov.e = z;
            }
        }
    }

    public final void a(int i2, ahzx ahzx, boolean z, boolean z2, aizx aizx, Map map) {
        Map map2;
        ajao ajao;
        int i3 = i2;
        ahzx ahzx2 = ahzx;
        boolean z3 = z;
        aizx aizx2 = aizx;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = {Integer.valueOf(i2), Long.valueOf(ahzx2.a), Long.valueOf(ahzx2.c), Boolean.valueOf(z), Boolean.valueOf(z2)};
        ahix ahix = this.a;
        long j2 = ahzx2.a;
        int i4 = ahix.Q;
        boolean z4 = i3 > i4;
        ahix.Q = i3;
        ahix.ar = ahzx2.b;
        String str = ((aixc) ahix.d).q;
        if (!ahix.as && str != null) {
            ahix.as = true;
            ahix.ax = ahix.v();
            ahox ahox = ahix.ax;
            if (ahox != null) {
                ahjy ahjy = ahix.K;
                ahjy.d.a = ahox;
                ahmz ahmz = ahjy.e;
                if (ahmz != null) {
                    ahmz.a = ahox;
                }
            }
        }
        long j3 = ahzx2.c;
        int i5 = ahix.Q;
        boolean z5 = ahix.ar;
        boolean z6 = ahix.av == null;
        StringBuilder sb = new StringBuilder(330);
        sb.append("setActivityDetectionExternalClientCount: count=");
        sb.append(i3);
        sb.append(", minPeriodMillis=");
        sb.append(j2);
        sb.append(", maxReportLatencyMillis=");
        sb.append(j3);
        sb.append(", forceDetectionNow=");
        sb.append(z3);
        sb.append(", newClientAdded=");
        sb.append(z4);
        sb.append(", externalClientCountPrevious=");
        sb.append(i4);
        sb.append(", externalClientCount=");
        sb.append(i5);
        sb.append(", hasSensorDataReceiver=");
        sb.append(z5);
        sb.append(", hardwareOffBodyDetectorIsNull = ");
        sb.append(z6);
        sb.toString();
        ahix.S = j2;
        ahix.T = ahzx2.c;
        ahjn ahjn = ahix.W;
        ajbg ajbg = ahix.k;
        if (!amqx.a(aizx2, ahjn.a) || j2 != ahjn.d) {
            ahjn.a = aizx2;
            ahjn.d = j2;
            ahjn.a(ajbg);
        }
        int i6 = ahix.Q;
        if (i6 != 0 && i6 < i4) {
            ahix.q.t();
        }
        if (map == null) {
            map2 = new ConcurrentHashMap();
        } else {
            map2 = map;
        }
        ahix.q();
        ahix.X = map2;
        if (ahix.a(9)) {
            if (ahix.p) {
                ajao ajao2 = ahix.av;
                if (ajao2 != null && !ajao2.c && !ajao2.a(ahix)) {
                    ahix.av = null;
                }
            } else {
                if (ahix.L == null) {
                    try {
                        ahix.L = new ahnc(ahix.i.a(ahna.PHONE_POSITION), ahix.i.a(ahna.PHONE_POSITION_IN_VEHICLE));
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                if (ahix.Y == null) {
                    ahix.Y = new ahku();
                }
            }
        } else if (ahix.p && (ajao = ahix.av) != null && ajao.c) {
            ajao.a();
        }
        ahix.b(z4, z3);
        ahlw ahlw = this.e;
        if (ahlw != null) {
            ahlw.e.a(z2);
        }
    }

    public final void a(int i2, Object obj, aizx aizx) {
        long j2;
        if (i2 == 2) {
            ahix ahix = this.a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (ahix.C.a()) {
                if (booleanValue != ahix.H) {
                    if (!booleanValue) {
                        if (ahix.C.b()) {
                            ahix.C.e();
                            ahix.C.d();
                            ahix.C.b(ahix);
                        }
                    } else if (!ahix.C.b()) {
                        ahix.C.a(ahix);
                        ahix.C.c((int) axwi.a.a().hardwareFloorChangeReportLatencyMillis());
                    }
                }
            } else if (!ahix.p) {
                ahjn ahjn = ahix.W;
                ajbg ajbg = ahix.k;
                if (!booleanValue) {
                    j2 = Long.MAX_VALUE;
                } else {
                    j2 = 60000;
                }
                if (!amqx.a(aizx, ahjn.b) || j2 != ahjn.e) {
                    ahjn.b = aizx;
                    ahjn.e = j2;
                    ahjn.a(ajbg);
                }
            } else {
                return;
            }
            ahix.H = booleanValue;
            StringBuilder sb = new StringBuilder(47);
            sb.append("setFloorChangeDetectionRequest: hasClient=");
            sb.append(booleanValue);
            sb.toString();
        } else if (i2 == 3) {
            ahix ahix2 = this.a;
            boolean z = obj != null;
            ahix2.I = z;
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("setSleepSegmentDetectionRequest: hasClient=");
            sb2.append(z);
            sb2.toString();
            if (z) {
                ahix2.q.a(false);
                if (ahix2.o != null && ayfc.a.a().sendSleepSegmentUponRegister()) {
                    ahix2.e.a(new aibj(ahix2.o.a(), (List) null), false);
                }
            }
            aizv aizv = ahix2.J;
            if (aizv != null) {
                ((aiwt) aizv).b = z;
                aizv.b();
            }
        } else if (i2 != 4) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb3.append("Dropping unknown request type: ");
            sb3.append(valueOf);
            sb3.toString();
        } else {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            String valueOf2 = String.valueOf(activityTransitionRequest);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb4.append("requesting activity transitions: ");
            sb4.append(valueOf2);
            sb4.toString();
            if (axyl.b() && (activityTransitionRequest = ahpr.a(this.k, this.i, activityTransitionRequest)) == null) {
                return;
            }
            if (this.c != null) {
                String valueOf3 = String.valueOf(activityTransitionRequest);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
                sb5.append("request sent to transition provider: ");
                sb5.append(valueOf3);
                sb5.toString();
                this.c.a(activityTransitionRequest);
                return;
            }
            String valueOf4 = String.valueOf(obj);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 50);
            sb6.append("Activity transition feature is disabled, dropping ");
            sb6.append(valueOf4);
            sb6.toString();
        }
    }

    public final void a(long j2) {
        ahld ahld = this.f;
        if (ahld != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = ahld.b;
            if (j3 > 0 && j3 <= currentTimeMillis) {
                ahld.c = j3;
            }
            ahld.b = j2;
            long j4 = ahld.c;
            StringBuilder sb = new StringBuilder(102);
            sb.append("lastAlarmClockTriggerMillis: ");
            sb.append(j4);
            sb.append("; nextScheduledAlarmClockMillis: ");
            sb.append(j2);
            sb.toString();
        }
    }

    public final void a(ahyg ahyg) {
        ahyg ahyg2;
        ahkd ahkd = this.a.G;
        Object[] objArr = {Boolean.valueOf(ahyg.c), Integer.valueOf(ahyg.d), Boolean.valueOf(ahyg.b)};
        if (!ahyg.c && (ahyg2 = ahkd.c) != null && ahyg2.c && ahyg.e - ahyg2.e >= 300000) {
            int[] iArr = ahkd.a[0];
            int i2 = ahyg2.d;
            iArr[i2] = iArr[i2] + 1;
            if (!ahkd.d.isEmpty()) {
                int[] iArr2 = ahkd.a[2];
                int i3 = ahkd.c.d;
                iArr2[i3] = iArr2[i3] + 1;
            }
            if (!ahkd.e.isEmpty()) {
                int[] iArr3 = ahkd.a[1];
                int i4 = ahkd.c.d;
                iArr3[i4] = iArr3[i4] + 1;
            }
        }
        ahkd.d.clear();
        ahkd.e.clear();
        ahkd.c = ahyg;
        if (ahyg.c) {
            aiap aiap = ahkd.f;
            HashMap hashMap = new HashMap();
            synchronized (((ahme) aiap).c) {
                hashMap.putAll(((ahme) aiap).d);
            }
            for (Long l2 : hashMap.keySet()) {
                if (((ahmd) hashMap.get(l2)).b) {
                    if (((ahmd) hashMap.get(l2)).a()) {
                        ahkd.d.add(l2);
                    }
                    if (((ahmd) hashMap.get(l2)).b()) {
                        ahkd.e.add(l2);
                    }
                }
            }
        }
    }

    public final void a(aibl aibl) {
        ahix ahix = this.a;
        if (aibl != null) {
            ahix.q.a(ahix.w, aibl);
            ahix.w = aibl;
            aizy aizy = ahix.g;
            ahix.x = SystemClock.elapsedRealtime();
        }
    }

    public final void a(aizo aizo, int i2) {
        ahme ahme = this.d;
        synchronized (ahme.c) {
            ahme.a(aizo, i2);
            ahme.a((aiaf) aizo);
        }
    }

    public final void a(ajbe ajbe) {
        int i2;
        HashMap hashMap;
        String str;
        String str2;
        float f2;
        String str3;
        int i3;
        Sensor defaultSensor;
        Sensor defaultSensor2;
        Sensor defaultSensor3;
        Sensor defaultSensor4;
        int i4;
        ahlw ahlw;
        ajbe ajbe2 = ajbe;
        Locale locale = Locale.ENGLISH;
        char c2 = 1;
        new Object[1][0] = ajbe.name();
        ajbe ajbe3 = ajbe.LOCATOR;
        if (!(ajbe.ordinal() != 11 || (ahlw = this.e) == null || ahlw.f == -1)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = ahlw.f;
            if (elapsedRealtime + 4000 < j2) {
                ahlw.f = -1;
                ahlw.a(j2);
            } else {
                ahlw.f = -1;
                ahlw.e.d();
            }
        }
        aizs aizs = this.g;
        if (aizs != null) {
            aizs.e();
        }
        ahix ahix = this.a;
        Locale locale2 = Locale.ENGLISH;
        new Object[1][0] = ajbe2.v;
        ahix.q();
        aizy aizy = ahix.g;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        double d2 = (double) (elapsedRealtime2 - ahix.ab);
        Double.isNaN(d2);
        long a2 = ajqz.a(d2 / 8.64E7d);
        ahix.ab = elapsedRealtime2;
        if (a2 == 0) {
            i2 = 4;
        } else {
            for (int i5 = 0; i5 < ahix.a.length; i5++) {
                ahup ahup = ahix.a[i5];
                String concat = String.valueOf(ahix.b[i5]).concat("_batching_availability");
                int c3 = ahix.j.c(ahup);
                ajbf ajbf = ahix.j;
                Integer num = (Integer) RealCollectorConfig.a.get(ahup);
                if (num != null) {
                    i4 = aiyk.g.c(((aixe) ajbf).d, num.intValue());
                } else {
                    i4 = 0;
                }
                if (c3 == 0) {
                    ahix.f.a("ar", concat, "batching_not_supported", 1);
                } else if ((!ahup.equals(ahup.ACCELEROMETER) || !ahix.r.a) && (!ahup.equals(ahup.BAROMETER) || !ahix.s.a)) {
                    String str4 = concat;
                    ahix.f.a("ar", str4, "batching_supported_but_disabled_fifo_max", (long) c3);
                    ahix.f.a("ar", str4, "batching_supported_but_disabled_fifo_reserved", (long) i4);
                    ahix.f.a("ar", str4, "batching_supported_but_disabled_count", 1);
                } else {
                    String str5 = concat;
                    ahix.f.a("ar", str5, "batching_enabled_fifo_max", (long) c3);
                    ahix.f.a("ar", str5, "batching_enabled_fifo_reserved", (long) i4);
                    ahix.f.a("ar", str5, "batching_enabled_count", 1);
                }
            }
            ajbf ajbf2 = ahix.j;
            Integer num2 = (Integer) RealCollectorConfig.a.get(ahup.ACCELEROMETER);
            float f3 = 0.0f;
            if (num2 == null || (defaultSensor4 = ((aixe) ajbf2).d.getDefaultSensor(num2.intValue())) == null) {
                f2 = 0.0f;
            } else {
                f2 = defaultSensor4.getMaximumRange();
            }
            float f4 = f2 / 9.80665f;
            int round = Math.round(f4 + f4);
            ajbf ajbf3 = ahix.j;
            Integer num3 = (Integer) RealCollectorConfig.a.get(ahup.ACCELEROMETER);
            if (!(num3 == null || (defaultSensor3 = ((aixe) ajbf3).d.getDefaultSensor(num3.intValue())) == null)) {
                f3 = defaultSensor3.getResolution();
            }
            int round2 = Math.round((f3 / 9.80665f) * 10.0f);
            aizm aizm = ahix.f;
            Locale locale3 = Locale.ENGLISH;
            Object[] objArr = new Object[5];
            ajbf ajbf4 = ahix.j;
            Integer num4 = (Integer) RealCollectorConfig.a.get(ahup.ACCELEROMETER);
            if (num4 == null || (defaultSensor2 = ((aixe) ajbf4).d.getDefaultSensor(num4.intValue())) == null) {
                str3 = null;
            } else {
                str3 = defaultSensor2.getName();
            }
            objArr[0] = str3;
            ajbf ajbf5 = ahix.j;
            Integer num5 = (Integer) RealCollectorConfig.a.get(ahup.ACCELEROMETER);
            if (num5 == null || (defaultSensor = ((aixe) ajbf5).d.getDefaultSensor(num5.intValue())) == null) {
                i3 = 0;
            } else {
                i3 = defaultSensor.getVersion();
            }
            objArr[1] = Integer.valueOf(i3);
            objArr[2] = Float.valueOf(((float) round) / 2.0f);
            objArr[3] = Float.valueOf(((float) round2) / 10.0f);
            i2 = 4;
            objArr[4] = axwx.p();
            aizm.a("ar", "accel_config_info", String.format(locale3, "Name: %s, Version: %d, Max Range: %.1f G, Resolution: %.1f G, Domain: %s", objArr), 1);
            if (ahix.B.b()) {
                ahix.f.a("ar", "hw_availability", "support all activities", a2);
            } else {
                ahix.f.a("ar", "hw_availability", "not support all activities", a2);
            }
            aizm aizm2 = ahix.f;
            ahpz.a(elapsedRealtime2);
        }
        aizy aizy2 = ahix.g;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        long j3 = ahix.ac;
        ahix.ac = elapsedRealtime3;
        double d3 = (double) (elapsedRealtime3 - j3);
        Double.isNaN(d3);
        if (ajqz.a(d3 / 8.64E7d) != 0) {
            Map r = ahix.r();
            aizm aizm3 = ahix.f;
            if (r == null || ahix.aw == null) {
                str2 = String.format(Locale.ENGLISH, "(Tala)Bluetooth not available, Domain: %s", new Object[]{axwx.p()});
            } else if (((Integer) r.get("total")).intValue() != 0 || ahix.aw.a.isEnabled()) {
                Locale locale4 = Locale.ENGLISH;
                Object[] objArr2 = new Object[i2];
                objArr2[0] = r.get("car");
                objArr2[1] = r.get("possible");
                objArr2[2] = r.get("total");
                objArr2[3] = axwx.p();
                str2 = String.format(locale4, "(Tala)Car: %d, Possibly Car: %d, Total: %d, Domain: %s", objArr2);
            } else {
                str2 = String.format(Locale.ENGLISH, "(Tala)Bluetooth disabled, Domain: %s", new Object[]{axwx.p()});
            }
            aizm3.a("ar", "bluetooth_paired_metrics", str2, 1);
            ahix.f.a("ar", "user_count", String.format(Locale.ENGLISH, "Domain: %s", new Object[]{axwx.p()}), 1);
            aizm aizm4 = ahix.f;
            ahpz.a(elapsedRealtime3);
        }
        if (axwx.a.a().enableGmmBluetoothMetrics() && axwx.j()) {
            aizy aizy3 = ahix.g;
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            ahkd ahkd = ahix.G;
            long j4 = elapsedRealtime4 - ahkd.b;
            if (j4 >= 86400000) {
                if (j4 <= 100800000) {
                    Map r2 = ahix.r();
                    int[][] iArr = ahix.G.a;
                    if (r2 != null) {
                        hashMap = new HashMap();
                        for (Map.Entry entry : r2.entrySet()) {
                            String str6 = (String) entry.getKey();
                            hashMap.put(str6, String.format(Locale.ENGLISH, "%s%s Gmm driving total: %d, possible btcar: %d, btcar: %d, Domain: %s", new Object[]{((Integer) entry.getValue()).intValue() <= 0 ? "not " : "", str6, Integer.valueOf(iArr[0][1]), Integer.valueOf(iArr[1][1]), Integer.valueOf(iArr[2][1]), axwx.p()}));
                        }
                    } else {
                        hashMap = null;
                    }
                    String[][] strArr = ahix.c;
                    int length = strArr.length;
                    int i6 = 0;
                    while (i6 < length) {
                        String[] strArr2 = strArr[i6];
                        String str7 = strArr2[0];
                        String str8 = strArr2[c2];
                        if (hashMap == null) {
                            ahix.f.a("ar", str8, "(Tala)Bluetooth not available", 1);
                        } else {
                            aizm aizm5 = ahix.f;
                            String valueOf = String.valueOf((String) hashMap.get(str7));
                            aizm5.a("ar", str8, valueOf.length() == 0 ? new String("(Tala)") : "(Tala)".concat(valueOf), 1);
                        }
                        i6++;
                        c2 = 1;
                    }
                    aizm aizm6 = ahix.f;
                    Locale locale5 = Locale.ENGLISH;
                    Object[] objArr3 = new Object[5];
                    objArr3[0] = Integer.valueOf(ahix.F.c);
                    objArr3[c2] = Integer.valueOf(ahix.F.e);
                    objArr3[2] = Integer.valueOf(ahix.F.d);
                    if (r2 != null) {
                        str = Integer.toString(((Integer) r2.get("car")).intValue());
                    } else {
                        str = "Bluetooth not available";
                    }
                    objArr3[3] = str;
                    objArr3[4] = axwx.p();
                    aizm6.a("ar", "personal_vehicle_detection_count", String.format(locale5, "Personal Veh Detects: %d, Veh Detects: %d, New Veh Detects:%s, #Paired Car BT: %s, Domain: %s", objArr3), 1);
                    aizm aizm7 = ahix.f;
                    ahpz.a(elapsedRealtime4);
                    ahix.G.a();
                    ahix.F.a();
                } else {
                    ahkd.a();
                    ahix.F.a();
                }
            }
        }
        if (ahix.e() && ayfc.a.a().sleepAlarmRingBugFix() && ahix.f()) {
            String valueOf2 = String.valueOf(ahix.q.p());
            if (valueOf2.length() == 0) {
                new String("Ringing Sleep Alarm in state: ");
            } else {
                "Ringing Sleep Alarm in state: ".concat(valueOf2);
            }
            if (ahix.B.d()) {
                ahix.B.g();
            }
            ahix.t = null;
            ahix.q.D();
        }
        if (ahix.t != null) {
            aizy aizy4 = ahix.g;
            if (SystemClock.elapsedRealtime() + 4000 >= ahix.t.a) {
                if (ajbe2 == ajbe.ACTIVITY_DETECTION) {
                    ahix.t = null;
                } else {
                    ahix.n();
                }
                if (ahix.B.d()) {
                    ahix.B.g();
                }
                ajao ajao = ahix.av;
                if (ajao != null && ajao.c) {
                    ahix.w();
                }
                if (ahix.C.b()) {
                    ahix.C.e();
                }
                String valueOf3 = String.valueOf(ahix.q.p());
                if (valueOf3.length() == 0) {
                    new String("Alarm rings. State: ");
                } else {
                    "Alarm rings. State: ".concat(valueOf3);
                }
                ahix.q.D();
            } else if (ajbe2 == ajbe.ACTIVITY_DETECTION) {
                aiac aiac = ahix.t;
                ahix.t = null;
                ahix.a(aiac);
            }
        }
    }

    public final void a(ajbe ajbe, aiac aiac) {
        ahix ahix = this.a;
        if (ajbe == ajbe.LOCATOR) {
            ahix.aj = aiac;
        }
        ahix.q.a(ajbe);
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        ahlw ahlw = this.e;
        if (!(ahlw == null || activityRecognitionResult.a().a() == 6)) {
            ahlw.e.a(activityRecognitionResult);
        }
        if (this.f != null && this.a.d()) {
            ahld ahld = this.f;
            DetectedActivity a2 = activityRecognitionResult.a();
            for (int i2 : DetectedActivity.c) {
                if (a2.a() == i2) {
                    ahld.a(activityRecognitionResult.b);
                    String valueOf = String.valueOf(a2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                    sb.append("High-confidence awake detected from AR result ");
                    sb.append(valueOf);
                    sb.toString();
                    return;
                }
            }
        }
    }

    public final void a(PrintWriter printWriter) {
        boolean z;
        boolean z2;
        String str;
        PrintWriter printWriter2 = printWriter;
        ahix ahix = this.a;
        printWriter2.println("####ActivityDetectionScheduler Start");
        boolean a2 = ahix.j.a();
        StringBuilder sb = new StringBuilder(27);
        sb.append("os.hasAccelerometer()=");
        sb.append(a2);
        printWriter2.println(sb.toString());
        boolean a3 = ahix.z.a();
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("significantMotionDetector.isSupported()=");
        sb2.append(a3);
        printWriter2.println(sb2.toString());
        boolean b2 = ahix.z.b();
        StringBuilder sb3 = new StringBuilder(43);
        sb3.append("significantMotionDetector.isEnabled()=");
        sb3.append(b2);
        printWriter2.println(sb3.toString());
        boolean a4 = ahix.A.a();
        StringBuilder sb4 = new StringBuilder(35);
        sb4.append("wristTiltSensor.isSupported()=");
        sb4.append(a4);
        printWriter2.println(sb4.toString());
        boolean b3 = ahix.A.b();
        StringBuilder sb5 = new StringBuilder(33);
        sb5.append("wristTiltSensor.isEnabled()=");
        sb5.append(b3);
        printWriter2.println(sb5.toString());
        boolean b4 = ahix.az.b();
        StringBuilder sb6 = new StringBuilder(38);
        sb6.append("wakeUpTiltDetector.isSupported()=");
        sb6.append(b4);
        printWriter2.println(sb6.toString());
        boolean b5 = ahix.j.b(ahup.ACCELEROMETER);
        StringBuilder sb7 = new StringBuilder(49);
        sb7.append("os.isSensorBatchingSupported(ACCELEROMETER)=");
        sb7.append(b5);
        printWriter2.println(sb7.toString());
        boolean b6 = ahix.j.b(ahup.BAROMETER);
        StringBuilder sb8 = new StringBuilder(45);
        sb8.append("os.isSensorBatchingSupported(BAROMETER)=");
        sb8.append(b6);
        printWriter2.println(sb8.toString());
        int c2 = ahix.j.c(ahup.ACCELEROMETER);
        StringBuilder sb9 = new StringBuilder(58);
        sb9.append("os.getSensorBatchingFifoMaxSize(ACCELEROMETER)=");
        sb9.append(c2);
        printWriter2.println(sb9.toString());
        int c3 = ahix.j.c(ahup.BAROMETER);
        StringBuilder sb10 = new StringBuilder(54);
        sb10.append("os.getSensorBatchingFifoMaxSize(BAROMETER)=");
        sb10.append(c3);
        printWriter2.println(sb10.toString());
        boolean z3 = ahix.r.a;
        StringBuilder sb11 = new StringBuilder(38);
        sb11.append("accelBatchingManager.isEnabled()=");
        sb11.append(z3);
        printWriter2.println(sb11.toString());
        boolean z4 = ahix.s.a;
        StringBuilder sb12 = new StringBuilder(37);
        sb12.append("baroBatchingManager.isEnabled()=");
        sb12.append(z4);
        printWriter2.println(sb12.toString());
        boolean b7 = ahix.B.b();
        StringBuilder sb13 = new StringBuilder(52);
        sb13.append("hardwareArDetector.areAllActivitiesSupported()=");
        sb13.append(b7);
        printWriter2.println(sb13.toString());
        boolean d2 = ahix.B.d();
        StringBuilder sb14 = new StringBuilder(36);
        sb14.append("hardwareArDetector.isEnabled()=");
        sb14.append(d2);
        printWriter2.println(sb14.toString());
        boolean a5 = ahix.C.a();
        StringBuilder sb15 = new StringBuilder(46);
        sb15.append("hardwareFloorChangeService.isSupported()=");
        sb15.append(a5);
        printWriter2.println(sb15.toString());
        boolean b8 = ahix.C.b();
        StringBuilder sb16 = new StringBuilder(44);
        sb16.append("hardwareFloorChangeService.isEnabled()=");
        sb16.append(b8);
        printWriter2.println(sb16.toString());
        String valueOf = String.valueOf(ahix.q.p());
        printWriter2.println(valueOf.length() == 0 ? new String("Current state: ") : "Current state: ".concat(valueOf));
        for (String str2 : ahix.E.keySet()) {
            printWriter2.printf("Entered %s %d times.\n", new Object[]{str2, ahix.E.get(str2)});
        }
        ahld ahld = ahix.o;
        if (ahld != null) {
            List a6 = ahld.a();
            long bj = ahix.d.bj();
            StringBuilder sb17 = new StringBuilder(49);
            sb17.append("Previous sleep segment time: ");
            sb17.append(bj);
            printWriter2.println(sb17.toString());
            ahnj bk = ahix.d.bk();
            if (bk != null) {
                String valueOf2 = String.valueOf(bk);
                StringBuilder sb18 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb18.append("User sleep window: ");
                sb18.append(valueOf2);
                printWriter2.println(sb18.toString());
            }
            if (!a6.isEmpty()) {
                long j2 = ((SleepSegmentEvent) a6.get(0)).a;
                long j3 = ((SleepSegmentEvent) a6.get(0)).b;
                StringBuilder sb19 = new StringBuilder(43);
                sb19.append(j2);
                sb19.append(" - ");
                sb19.append(j3);
                str = sb19.toString();
            } else {
                str = "none";
            }
            String valueOf3 = String.valueOf(str);
            printWriter2.println(valueOf3.length() == 0 ? new String("Previous sleep: ") : "Previous sleep: ".concat(valueOf3));
        }
        printWriter2.println("####ActivityDetectionScheduler End");
        ahlw ahlw = this.e;
        if (ahlw != null) {
            printWriter2.println("####VehicleExitDetectorStats Start");
            ahlu ahlu = ahlw.d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String b9 = ahlu.d.e.b();
            StringBuilder sb20 = new StringBuilder(String.valueOf(b9).length() + 16);
            sb20.append("Current state: ");
            sb20.append(b9);
            sb20.append("\n");
            printWriter2.print(sb20.toString());
            for (Map.Entry entry : ahlu.a.entrySet()) {
                StringBuilder sb21 = new StringBuilder();
                sb21.append((String) entry.getKey());
                ahls ahls = (ahls) entry.getValue();
                long j4 = ahls.a / 1000;
                int i2 = ahls.b;
                if (((String) entry.getKey()).equals(ahlu.b)) {
                    j4 += (elapsedRealtime - ahlu.c) / 1000;
                    i2++;
                }
                sb21.append(" TimeInState: ");
                sb21.append(j4);
                sb21.append("sec StateEnteredCount: ");
                sb21.append(i2);
                sb21.append(" Avg: ");
                sb21.append(j4 / ((long) i2));
                sb21.append("sec/entry\n");
                printWriter2.print(sb21.toString());
            }
            printWriter2.println("####VehicleExitDetectorStats End");
        }
        aizs aizs = this.g;
        if (aizs != null) {
            z = aizs.a();
        } else {
            z = false;
        }
        StringBuilder sb22 = new StringBuilder(17);
        sb22.append("ccAvailable=");
        sb22.append(z);
        printWriter2.println(sb22.toString());
        aizv aizv = this.j;
        if (aizv == null || !aizv.a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder sb23 = new StringBuilder(27);
        sb23.append("sleep chre available: ");
        sb23.append(z2);
        printWriter2.println(sb23.toString());
    }

    public final void a(boolean z) {
        ahix ahix = this.a;
        ahix.ae = z;
        StringBuilder sb = new StringBuilder(16);
        sb.append("isScreenOn=");
        sb.append(z);
        sb.toString();
        ahix.b(false, false);
        ahix.q.u();
    }

    public final void a(boolean z, boolean z2, int i2) {
        StringBuilder sb = new StringBuilder(108);
        sb.append("ActivityProvider: Data network changed stats. onWifi = ");
        sb.append(z);
        sb.append(", onCellular =");
        sb.append(z2);
        sb.append(", wifiNetworkId = ");
        sb.append(i2);
        sb.toString();
        List list = this.m;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ahlz) list.get(i3)).c(z);
        }
    }
}
