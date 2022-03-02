package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.location.internal.server.GoogleLocationChimeraService;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ahju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ahju extends ahle implements ahiq {
    private static final Map k;
    protected final Map a = new HashMap();
    protected boolean b = false;
    protected final Map c = new HashMap();
    private long l = -1;
    private long m = -1;
    private boolean n;

    static {
        HashMap hashMap = new HashMap();
        k = hashMap;
        hashMap.put(ahup.ACCELEROMETER, 10000);
        k.put(ahup.BAROMETER, 5000);
        k.put(ahup.LIGHT, 5000);
    }

    public ahju(ahix ahix, boolean z) {
        super(ahix);
        this.n = z;
    }

    /* access modifiers changed from: protected */
    public abstract ahis a();

    /* access modifiers changed from: protected */
    public void a(long j) {
        throw null;
    }

    public void a(List list) {
    }

    /* access modifiers changed from: protected */
    public int c() {
        return 10;
    }

    /* access modifiers changed from: protected */
    public abstract ahil d();

    public void d(ActivityRecognitionResult activityRecognitionResult) {
        if (!this.b) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: protected */
    public long e() {
        if (d() != null) {
            return d().a;
        }
        return 3200000000L;
    }

    /* access modifiers changed from: protected */
    public abstract String f();

    public final void g() {
        super.g();
        this.d.g();
        ahil d = d();
        if (d != null) {
            d.a();
        }
        j();
    }

    public void h() {
        super.h();
        if (this.d.ar && !this.c.isEmpty()) {
            long j = this.l;
            if (j != -1) {
                long j2 = this.m;
                Map map = this.c;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new DetectedActivity(((Integer) entry.getKey()).intValue(), ((Integer) entry.getValue()).intValue()));
                }
                Collections.sort(arrayList, DetectedActivity.a);
                ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(arrayList, j, j2);
                ahjc ahjc = this.f;
                long j3 = this.l;
                long j4 = this.m;
                Map map2 = this.a;
                aixa aixa = ((aixc) ahjc).d;
                synchronized (((aire) aixa).f) {
                    aiov aiov = ((aire) aixa).n;
                    GoogleLocationChimeraService googleLocationChimeraService = ((aire) aixa).a;
                    if (!aiov.p.isEmpty() && map2.size() != 0) {
                        Parcel obtain = Parcel.obtain();
                        obtain.writeLong(j3);
                        obtain.writeLong(j4);
                        obtain.writeInt(map2.size());
                        for (Map.Entry entry2 : map2.entrySet()) {
                            ahyq ahyq = (ahyq) entry2.getValue();
                            int a2 = ahyq.a();
                            obtain.writeInt(((ahup) entry2.getKey()).x);
                            obtain.writeInt(ahyq.b);
                            obtain.writeInt(a2);
                            int i = ahyq.b;
                            long[] jArr = new long[i];
                            float[] fArr = new float[(i * a2)];
                            for (int i2 = 0; i2 < ahyq.b; i2++) {
                                jArr[i2] = ahyq.a(i2) - ahyq.a(0);
                                for (int i3 = 0; i3 < a2; i3++) {
                                    fArr[(i2 * a2) + i3] = ahyq.a(i2, i3);
                                }
                            }
                            obtain.writeLongArray(jArr);
                            obtain.writeFloatArray(fArr);
                        }
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        for (aiot a3 : aiov.p) {
                            Intent i4 = aiov.i();
                            i4.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", activityRecognitionResult);
                            i4.putExtra("com.google.android.location.internal.EXTRA_SENSOR_DATA_FOR_ACTIVITY", marshall);
                            a3.a(googleLocationChimeraService, i4);
                        }
                    }
                }
            }
        }
        this.b = true;
        ahis a4 = a();
        if (a4.a) {
            a4.a = false;
            a4.b.b();
        }
        i();
        this.h.a(aico.ACTIVITY_DETECTION_DONE);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r23 = this;
            r0 = r23
            ahil r1 = r23.d()
            java.lang.String r10 = r23.f()
            ahix r2 = r0.d
            ahla r3 = r2.r
            boolean r4 = r3.a
            if (r4 == 0) goto L_0x0015
            int r2 = r3.d
            goto L_0x0017
        L_0x0015:
            int r2 = r2.af
        L_0x0017:
            r11 = r2
            aicn r12 = r0.h
            ahiz r13 = new ahiz
            aico r3 = defpackage.aico.ACTIVITY_DETECTION_START
            long r4 = r12.b()
            int r6 = r10.hashCode()
            r2 = r13
            r7 = r11
            r8 = r10
            r9 = r11
            r2.<init>(r3, r4, r6, r7, r8, r9)
            r12.a((defpackage.aicl) r13)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r4 = java.lang.String.valueOf(r10)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 90
            r5.<init>(r4)
            java.lang.String r4 = "Starting activity detection at: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = " with detector: "
            r5.append(r2)
            r5.append(r10)
            java.lang.String r2 = " at delay: "
            r5.append(r2)
            r5.append(r11)
            r5.toString()
            ahis r2 = r23.a()
            ahix r3 = r0.d
            int r4 = r3.af
            int r5 = r3.ag
            int r3 = r3.ah
            long r6 = r23.e()
            int r14 = r23.c()
            double r8 = r23.l()
            ahix r10 = r0.d
            ahjn r11 = r10.W
            aizx r11 = r11.c
            r12 = 9
            boolean r13 = r10.a((int) r12)
            if (r13 == 0) goto L_0x008b
            boolean r13 = r10.p
            if (r13 != 0) goto L_0x008b
            ahnc r10 = r10.L
            goto L_0x008c
        L_0x008b:
            r10 = 0
        L_0x008c:
            boolean r13 = r0.n
            if (r13 == 0) goto L_0x009f
            ahix r13 = r0.d
            boolean r15 = r13.p
            if (r15 == 0) goto L_0x009f
            boolean r12 = r13.a((int) r12)
            if (r12 == 0) goto L_0x009f
            ahko r15 = r13.N
            goto L_0x00a0
        L_0x009f:
            r15 = 0
        L_0x00a0:
            ahix r12 = r0.d
            ahnx r13 = r12.M
            ahpe r12 = r12.h()
            r17 = r11
            ahix r11 = r0.d
            ahku r11 = r11.Y
            r16 = r14
            r18 = 0
            if (r11 == 0) goto L_0x00c8
            ahkt r11 = r11.f
            int r11 = r11.a
            if (r11 <= 0) goto L_0x00c8
            long r19 = defpackage.axwo.b()
            r21 = 0
            int r11 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r11 > 0) goto L_0x00c6
            r11 = 0
            goto L_0x00c9
        L_0x00c6:
            r11 = 1
            goto L_0x00c9
        L_0x00c8:
            r11 = 0
        L_0x00c9:
            ahix r14 = r0.d
            boolean r14 = r14.c()
            r19 = r3
            ahix r3 = r0.d
            boolean r3 = r3.f()
            r20 = r5
            boolean r5 = r2.a
            if (r5 != 0) goto L_0x0127
            r2.d = r1
            r2.e = r0
            r2.c = r6
            r2.n = r8
            r2.g = r10
            r2.h = r15
            r2.j = r13
            r2.l = r12
            r2.f = r11
            r2.i = r14
            r2.k = r3
            r1 = 1
            r2.a = r1
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            ahup r1 = defpackage.ahup.ACCELEROMETER
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13.put(r1, r4)
            ahup r1 = defpackage.ahup.BAROMETER
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r13.put(r1, r4)
            ahup r1 = defpackage.ahup.LIGHT
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r13.put(r1, r4)
            r12 = r2
            r14 = r16
            r15 = r6
            r18 = r3
            ahtp r1 = r12.a(r13, r14, r15, r17, r18)
            r2.b = r1
            ahtp r1 = r2.b
            r1.a()
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahju.j():void");
    }

    /* access modifiers changed from: protected */
    public void k() {
        if (!this.b) {
            if (ahix.Z) {
                this.d.a(false, true);
            }
            a((ahle) new ahkz(this.d));
        }
    }

    /* access modifiers changed from: protected */
    public double l() {
        return 35.0d;
    }

    /* access modifiers changed from: protected */
    public final void m() {
        if (!this.d.a() || !r()) {
            a((ahle) new ahkz(this.d));
        } else if (!this.j) {
            a((ahle) new ahlb(this.d));
        } else if (this.d.a(9)) {
            a((ahle) new ahly(this.d));
        } else {
            a((ahle) new ahlb(this.d));
        }
    }

    public final void o() {
        this.n = false;
    }

    public final void a(long j, long j2, ahup ahup, ahyq ahyq) {
        ahup ahup2 = ahup;
        ahyq ahyq2 = ahyq;
        if (this.d.ar && k.containsKey(ahup2) && ahyq2.b != 0) {
            if (this.a.containsKey(ahup2)) {
                ahyq ahyq3 = (ahyq) this.a.get(ahup2);
                if (ahyq.a() == ahyq3.a()) {
                    long[] jArr = new long[(ahyq3.b + ahyq2.b)];
                    int a2 = ahyq3.a();
                    int i = ahyq3.b;
                    int[] iArr = new int[2];
                    iArr[1] = ahyq2.b + i;
                    iArr[0] = a2;
                    float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                    System.arraycopy(ahyq3.c, ahyq3.a, jArr, 0, i);
                    int i2 = ahyq2.a;
                    for (int i3 = 0; i3 < ahyq2.b; i3++) {
                        jArr[ahyq3.b + i3] = ahyq2.c[i2 + i3];
                    }
                    for (int i4 = 0; i4 < ahyq3.a(); i4++) {
                        System.arraycopy(ahyq3.d[i4], ahyq3.a, fArr[i4], 0, ahyq3.b);
                        System.arraycopy(ahyq2.d[i4], i2, fArr[i4], ahyq3.b, ahyq2.b);
                    }
                    ahyq2 = new ahyq(jArr, fArr);
                } else {
                    int a3 = ahyq3.a();
                    int a4 = ahyq.a();
                    StringBuilder sb = new StringBuilder(123);
                    sb.append("Cannot concatenate data of different dimensionalities, this dimension: ");
                    sb.append(a3);
                    sb.append(", dataToBeAppended dimension: ");
                    sb.append(a4);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            int intValue = ((Integer) k.get(ahup2)).intValue();
            int i5 = ahyq2.b;
            if (i5 <= intValue) {
                this.a.put(ahup2, ahyq2);
            } else {
                this.a.put(ahup2, ahyq2.b(i5 - intValue, intValue));
            }
            this.l = j;
            this.m = j2;
        }
    }

    public void c(ActivityRecognitionResult activityRecognitionResult) {
        this.d.b(activityRecognitionResult);
        if (!this.b && activityRecognitionResult.a().a() == 5) {
            ActivityRecognitionResult activityRecognitionResult2 = new ActivityRecognitionResult(activityRecognitionResult.a, activityRecognitionResult.b, activityRecognitionResult.c, activityRecognitionResult.d, activityRecognitionResult.c());
            String valueOf = String.valueOf(activityRecognitionResult2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Reporting tilting: ");
            sb.append(valueOf);
            sb.toString();
            this.d.a(activityRecognitionResult2);
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ahix ahix = this.d;
        ahix.ak = elapsedRealtime;
        ahix.al = elapsedRealtime;
        ahix.an = elapsedRealtime;
        ahix.ao = elapsedRealtime;
    }

    /* access modifiers changed from: protected */
    public final void n() {
        long j;
        long e = ajbt.e();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!axwx.c()) {
            j = 0;
        } else {
            j = 60000;
        }
        this.d.a(new aiac(ahlx.b(j + elapsedRealtime, elapsedRealtime, 0, e) - 1000, 2000));
    }

    /* access modifiers changed from: protected */
    public final void e(ActivityRecognitionResult activityRecognitionResult) {
        if (this.d.ar) {
            for (DetectedActivity detectedActivity : activityRecognitionResult.a) {
                this.c.put(Integer.valueOf(detectedActivity.a()), Integer.valueOf(detectedActivity.e));
            }
        }
    }

    public final void a(ahip ahip) {
        String str;
        int i = ahip.a;
        if (i == 0) {
            a(ahip.a());
        } else if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = ahip.b;
            }
            a(str);
        } else {
            k();
        }
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        ativ.a((Object) activityRecognitionResult);
        this.d.b(activityRecognitionResult);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: ahng} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.location.ActivityRecognitionResult r56, defpackage.ahng r57, com.google.android.gms.location.ActivityRecognitionResult r58) {
        /*
            r55 = this;
            r0 = r55
            r1 = r56
            r2 = r57
            boolean r3 = r0.b
            if (r3 != 0) goto L_0x056d
            ahix r3 = r0.d
            ahku r3 = r3.Y
            if (r3 == 0) goto L_0x056d
            boolean r4 = r0 instanceof defpackage.ahjt
            com.google.android.gms.location.DetectedActivity r5 = r56.a()
            int r6 = r5.a()
            r8 = 9
            r9 = 1
            if (r6 == r8) goto L_0x003d
            int r1 = r5.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 49
            r2.<init>(r3)
            java.lang.String r3 = "Detected activity is of type "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", ignore."
            r2.append(r1)
            r2.toString()
            r7 = 0
            goto L_0x0557
        L_0x003d:
            long r12 = r1.b
            long r14 = r1.c
            java.util.LinkedList r1 = r3.a
            aiba r6 = new aiba
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r6.<init>(r10, r2)
            r1.addLast(r6)
            r1 = 50
            r10 = 0
            if (r4 == 0) goto L_0x0119
            ahks r11 = r3.e
            int r7 = r11.c
            if (r7 <= 0) goto L_0x00b2
            r17 = r7
            long r6 = r11.b
            long r6 = r14 - r6
            r18 = 20000(0x4e20, double:9.8813E-320)
            int r20 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r20 <= 0) goto L_0x00b4
            r11.c = r9
            int r5 = r5.e
            if (r5 < r1) goto L_0x006f
            r11.d = r9
            goto L_0x0071
        L_0x006f:
            r11.d = r10
        L_0x0071:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r8 = 133(0x85, float:1.86E-43)
            r5.<init>(r8)
            java.lang.String r8 = "Millis since last batch start: "
            r5.append(r8)
            r5.append(r6)
            java.lang.String r6 = ", abandon last batch and reset votes, new batch start millis: "
            r5.append(r6)
            r5.append(r14)
            r5.toString()
            r11.b = r14
            long r5 = r11.a
            long r5 = r14 - r5
            r7 = 180000(0x2bf20, double:8.8932E-319)
            int r17 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r17 < 0) goto L_0x00b0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 91
            r7.<init>(r8)
            java.lang.String r8 = "Millis since last filtering: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = ", run filter despite of insufficient votes"
            r7.append(r5)
            r7.toString()
            goto L_0x00dd
        L_0x00b0:
            r5 = 0
            goto L_0x010f
        L_0x00b2:
            r17 = r7
        L_0x00b4:
            if (r17 != 0) goto L_0x00ca
            r11.b = r14
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 44
            r6.<init>(r7)
            java.lang.String r7 = "New batch start millis: "
            r6.append(r7)
            r6.append(r14)
            r6.toString()
        L_0x00ca:
            int r6 = r11.c
            int r6 = r6 + r9
            r11.c = r6
            int r5 = r5.e
            if (r5 < r1) goto L_0x00d8
            int r5 = r11.d
            int r5 = r5 + r9
            r11.d = r5
        L_0x00d8:
            r5 = 5
            if (r6 >= r5) goto L_0x00dd
            r5 = 0
            goto L_0x010f
        L_0x00dd:
            int r5 = r11.c
            int r6 = r11.d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 57
            r7.<init>(r8)
            java.lang.String r8 = "Total votes: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = ", votes for off-body: "
            r7.append(r5)
            r7.append(r6)
            r7.toString()
            int r5 = r11.d
            int r5 = r5 + r5
            int r6 = r11.c
            if (r5 <= r6) goto L_0x0104
            r5 = 1
            goto L_0x0105
        L_0x0104:
            r5 = 0
        L_0x0105:
            r11.c = r10
            r11.d = r10
            r11.a = r14
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
        L_0x010f:
            if (r5 == 0) goto L_0x0116
            boolean r5 = r5.booleanValue()
            goto L_0x0120
        L_0x0116:
            r7 = 0
            goto L_0x0557
        L_0x0119:
            int r5 = r5.e
            if (r5 < r1) goto L_0x011f
            r5 = 1
            goto L_0x0120
        L_0x011f:
            r5 = 0
        L_0x0120:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 25
            r6.<init>(r7)
            java.lang.String r8 = "rawResultIsOffBody: "
            r6.append(r8)
            r6.append(r5)
            r6.toString()
            r6 = 100
            if (r5 == 0) goto L_0x0154
            boolean r1 = r3.a(r14)
            if (r1 == 0) goto L_0x0144
            com.google.android.gms.location.DetectedActivity r1 = new com.google.android.gms.location.DetectedActivity
            r2 = 9
            r1.<init>(r2, r6)
            goto L_0x014d
        L_0x0144:
            r2 = 9
            com.google.android.gms.location.DetectedActivity r1 = new com.google.android.gms.location.DetectedActivity
            r4 = 51
            r1.<init>(r2, r4)
        L_0x014d:
            r3.c = r14
            r11 = r1
            r31 = r12
            goto L_0x0529
        L_0x0154:
            ahkt r5 = r3.f
            r5.a(r14)
            int r8 = r5.a
            r11 = 6
            if (r8 > 0) goto L_0x0160
            goto L_0x01da
        L_0x0160:
            if (r4 == 0) goto L_0x016d
            axwo r4 = defpackage.axwo.a
            axwp r4 = r4.a()
            long r19 = r4.inVehicleOffBodyCountThresholdForBatching()
            goto L_0x0171
        L_0x016d:
            long r19 = defpackage.axwo.b()
        L_0x0171:
            r21 = 0
            int r4 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r4 > 0) goto L_0x0178
            goto L_0x0189
        L_0x0178:
            if (r58 == 0) goto L_0x0189
            com.google.android.gms.location.DetectedActivity r4 = r58.a()
            int r4 = r4.e
            if (r4 <= r1) goto L_0x0189
            int r1 = r5.b
            int r1 = r1 + r9
            r5.b = r1
            r5.e = r14
        L_0x0189:
            long r7 = r5.c
            int r4 = r5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r6 = 81
            r1.<init>(r6)
            java.lang.String r6 = "in vehicle millis: "
            r1.append(r6)
            long r7 = r14 - r7
            r1.append(r7)
            java.lang.String r6 = ", numInVehicleOffBodyDetected: "
            r1.append(r6)
            r1.append(r4)
            r1.toString()
            long r6 = r5.c
            long r6 = r14 - r6
            r21 = 160000(0x27100, double:7.90505E-319)
            int r1 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r1 < 0) goto L_0x01da
            int r1 = r5.a
            if (r1 < r11) goto L_0x01da
            int r1 = r5.b
            long r4 = (long) r1
            int r1 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r1 < 0) goto L_0x01da
            r3.c = r14
            com.google.android.gms.location.ActivityRecognitionResult r7 = new com.google.android.gms.location.ActivityRecognitionResult
            com.google.android.gms.location.DetectedActivity r11 = new com.google.android.gms.location.DetectedActivity
            r1 = 70
            r2 = 9
            r11.<init>(r2, r1)
            ahnk r1 = defpackage.ahnk.PHONE_POSITION_FILTER_ORLA
            int r1 = r1.am
            r17 = 0
            r10 = r7
            r16 = r1
            r10.<init>((com.google.android.gms.location.DetectedActivity) r11, (long) r12, (long) r14, (int) r16, (android.os.Bundle) r17)
            goto L_0x0557
        L_0x01da:
            java.util.LinkedList r1 = r3.a
            java.lang.Object r1 = r1.pollFirst()
            aiba r1 = (defpackage.aiba) r1
        L_0x01e2:
            java.util.LinkedList r4 = r3.a
            boolean r4 = r4.isEmpty()
            r5 = 62000(0xf230, double:3.0632E-319)
            if (r4 != 0) goto L_0x020c
            java.util.LinkedList r4 = r3.a
            java.lang.Object r4 = r4.getFirst()
            aiba r4 = (defpackage.aiba) r4
            java.lang.Object r4 = r4.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            long r7 = r14 - r7
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x020c
            java.util.LinkedList r1 = r3.a
            java.lang.Object r1 = r1.pollFirst()
            aiba r1 = (defpackage.aiba) r1
            goto L_0x01e2
        L_0x020c:
            java.lang.Object r4 = r1.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            long r7 = r14 - r7
            r19 = 50000(0xc350, double:2.47033E-319)
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x026d
            java.util.LinkedList r4 = r3.a
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x026d
            java.lang.Object r4 = r1.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            java.util.LinkedList r4 = r3.a
            java.lang.Object r4 = r4.getFirst()
            aiba r4 = (defpackage.aiba) r4
            java.lang.Object r4 = r4.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r21 = r4.longValue()
            long r21 = r14 - r21
            long r5 = r5 - r21
            long r5 = r5 + r5
            long r7 = r14 - r7
            r21 = -62000(0xffffffffffff0dd0, double:NaN)
            long r7 = r7 + r21
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x026d
            java.util.LinkedList r4 = r3.a
            java.lang.Object r4 = r4.getFirst()
            aiba r4 = (defpackage.aiba) r4
            java.lang.Object r4 = r4.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = r14 - r4
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r6 < 0) goto L_0x026d
            java.util.LinkedList r1 = r3.a
            java.lang.Object r1 = r1.getFirst()
            aiba r1 = (defpackage.aiba) r1
            r4 = 0
            goto L_0x026e
        L_0x026d:
            r4 = 1
        L_0x026e:
            r5 = 200000(0x30d40, double:9.8813E-319)
            if (r4 == 0) goto L_0x0286
            java.lang.Object r4 = r1.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            long r7 = r14 - r7
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0286
            java.util.LinkedList r4 = r3.a
            r4.addFirst(r1)
        L_0x0286:
            java.lang.Object r4 = r1.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            long r7 = r14 - r7
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x02a8
            java.lang.Object r4 = r1.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = r14 - r4
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r6 < 0) goto L_0x02a8
            java.lang.Object r1 = r1.b
            r7 = r1
            ahng r7 = (defpackage.ahng) r7
            goto L_0x02a9
        L_0x02a8:
            r7 = 0
        L_0x02a9:
            if (r7 == 0) goto L_0x04f9
            ahnf r4 = r3.d
            float r1 = r7.a
            double r5 = (double) r1
            float r1 = r7.b
            r31 = r12
            double r11 = (double) r1
            float r1 = r7.c
            double r8 = (double) r1
            float r1 = r2.a
            r33 = r14
            double r13 = (double) r1
            float r1 = r2.b
            r21 = r11
            double r10 = (double) r1
            float r1 = r2.c
            double r0 = (double) r1
            r19 = r5
            r23 = r8
            r25 = r13
            r27 = r10
            r29 = r0
            double r0 = defpackage.ahnf.a(r19, r21, r23, r25, r27, r29)
            r5 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x04f5
            float r0 = r7.d
            double r0 = (double) r0
            r5 = 4585637198182676955(0x3fa374bc6a7ef9db, double:0.038)
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x02ed
            r0 = r3
            r14 = r33
            goto L_0x04fc
        L_0x02ed:
            float r0 = r2.d
            double r0 = (double) r0
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x04f1
            float r0 = r7.e
            double r0 = (double) r0
            double r0 = java.lang.Math.acos(r0)
            r5 = 4629137466983448576(0x403e000000000000, double:30.0)
            double r0 = defpackage.ahnf.a((double) r0, (double) r5)
            float r8 = r2.e
            double r8 = (double) r8
            double r8 = java.lang.Math.acos(r8)
            double r8 = defpackage.ahnf.a((double) r8, (double) r5)
            float r10 = r7.d
            double r10 = (double) r10
            r12 = 4634626229029306368(0x4051800000000000, double:70.0)
            double r10 = defpackage.ahnf.a((double) r10, (double) r12)
            float r14 = r2.d
            double r5 = (double) r14
            double r5 = defpackage.ahnf.a((double) r5, (double) r12)
            r12 = 5
            double[] r13 = new double[r12]
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = 0
            r13[r12] = r21
            double r23 = r0 * r8
            r12 = 1
            r13[r12] = r23
            double r23 = r10 * r5
            r12 = 2
            r13[r12] = r23
            double r0 = r0 * r0
            double r8 = r8 * r8
            double r0 = r0 + r8
            r9 = 3
            r13[r9] = r0
            double r10 = r10 * r10
            double r5 = r5 * r5
            double r10 = r10 + r5
            r0 = 4
            r13[r0] = r10
            r5 = 1
        L_0x0342:
            r1 = 5
            if (r5 < r1) goto L_0x04c8
            float r1 = r7.a
            float r5 = r7.b
            float r6 = r7.c
            float r8 = r2.a
            float r10 = r2.b
            float r11 = r2.c
            double r0 = (double) r1
            double r14 = (double) r5
            double r5 = (double) r6
            r25 = r13
            double r12 = (double) r8
            double r9 = (double) r10
            r28 = r3
            r29 = r4
            double r3 = (double) r11
            r35 = r0
            r37 = r14
            r39 = r5
            r41 = r12
            r43 = r9
            r45 = r3
            double r0 = defpackage.ahnf.a(r35, r37, r39, r41, r43, r45)
            float r3 = r7.a
            float r4 = r7.b
            float r5 = r7.c
            float r6 = r2.a
            float r8 = r2.b
            float r9 = r2.c
            double r10 = (double) r3
            double r3 = (double) r4
            double r12 = (double) r5
            double r5 = (double) r6
            double r14 = (double) r8
            double r8 = (double) r9
            r35 = r10
            r37 = r3
            r39 = r12
            r41 = r5
            r43 = r14
            r45 = r8
            double r3 = defpackage.ahnf.b(r35, r37, r39, r41, r43, r45)
            float r5 = r7.f
            float r6 = r7.g
            float r8 = r7.h
            float r9 = r2.f
            float r10 = r2.g
            float r11 = r2.h
            double r12 = (double) r5
            double r5 = (double) r6
            double r14 = (double) r8
            double r8 = (double) r9
            r47 = r3
            double r3 = (double) r10
            double r10 = (double) r11
            r35 = r12
            r37 = r5
            r39 = r14
            r41 = r8
            r43 = r3
            r45 = r10
            double r3 = defpackage.ahnf.a(r35, r37, r39, r41, r43, r45)
            float r5 = r7.f
            float r6 = r7.g
            float r8 = r7.h
            float r9 = r2.f
            float r10 = r2.g
            float r11 = r2.h
            double r12 = (double) r5
            double r5 = (double) r6
            double r14 = (double) r8
            double r8 = (double) r9
            r49 = r3
            double r3 = (double) r10
            double r10 = (double) r11
            r35 = r12
            r37 = r5
            r39 = r14
            r41 = r8
            r43 = r3
            r45 = r10
            double r3 = defpackage.ahnf.b(r35, r37, r39, r41, r43, r45)
            float r5 = r7.i
            float r6 = r7.j
            float r8 = r7.k
            float r9 = r2.i
            float r10 = r2.j
            float r11 = r2.k
            double r12 = (double) r5
            double r5 = (double) r6
            double r14 = (double) r8
            double r8 = (double) r9
            r51 = r3
            double r3 = (double) r10
            double r10 = (double) r11
            r35 = r12
            r37 = r5
            r39 = r14
            r41 = r8
            r43 = r3
            r45 = r10
            double r3 = defpackage.ahnf.a(r35, r37, r39, r41, r43, r45)
            float r5 = r7.i
            float r6 = r7.j
            float r7 = r7.k
            float r8 = r2.i
            float r9 = r2.j
            float r2 = r2.k
            double r10 = (double) r5
            double r5 = (double) r6
            double r12 = (double) r7
            double r7 = (double) r8
            double r14 = (double) r9
            r53 = r3
            double r2 = (double) r2
            r35 = r10
            r37 = r5
            r39 = r12
            r41 = r7
            r43 = r14
            r45 = r2
            double r2 = defpackage.ahnf.b(r35, r37, r39, r41, r43, r45)
            r4 = 6
            double[] r5 = new double[r4]
            double r0 = java.lang.Math.acos(r0)
            r9 = 4629137466983448576(0x403e000000000000, double:30.0)
            double r0 = defpackage.ahnf.a((double) r0, (double) r9)
            r4 = 0
            r5[r4] = r0
            double r0 = java.lang.Math.acos(r49)
            double r0 = defpackage.ahnf.a((double) r0, (double) r9)
            r4 = 1
            r5[r4] = r0
            double r0 = java.lang.Math.acos(r53)
            double r0 = defpackage.ahnf.a((double) r0, (double) r9)
            r4 = 2
            r5[r4] = r0
            r0 = 4619567317775286272(0x401c000000000000, double:7.0)
            r6 = r47
            double r6 = defpackage.ahnf.a((double) r6, (double) r0)
            r11 = 3
            r5[r11] = r6
            r6 = 4616189618054758400(0x4010000000000000, double:4.0)
            r9 = r51
            double r6 = defpackage.ahnf.a((double) r9, (double) r6)
            r12 = 4
            r5[r12] = r6
            double r0 = defpackage.ahnf.a((double) r2, (double) r0)
            r2 = 5
            r5[r2] = r0
            r0 = 7
            double[] r0 = java.util.Arrays.copyOf(r5, r0)
            r3 = 6
            r0[r3] = r21
            r0 = -4618199821126205440(0xbfe8dbbb20000000, double:-0.7768226265907288)
            r2 = 0
            r12 = 0
        L_0x0471:
            if (r12 >= r3) goto L_0x049b
            r6 = r5[r12]
            double r8 = r6 * r6
            r4 = 0
        L_0x0478:
            r13 = 5
            if (r4 >= r13) goto L_0x0495
            r10 = r25[r4]
            double r14 = r6 / r10
            r3 = r29
            double r14 = r3.a((int) r2, (double) r14)
            double r0 = r0 + r14
            int r14 = r2 + 1
            double r10 = r8 / r10
            double r10 = r3.a((int) r14, (double) r10)
            double r0 = r0 + r10
            int r2 = r2 + 2
            int r4 = r4 + 1
            r3 = 6
            goto L_0x0478
        L_0x0495:
            r3 = r29
            int r12 = r12 + 1
            r3 = 6
            goto L_0x0471
        L_0x049b:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x04c3
            r0 = r28
            r14 = r33
            boolean r1 = r0.a(r14)
            if (r1 == 0) goto L_0x04b5
            com.google.android.gms.location.DetectedActivity r1 = new com.google.android.gms.location.DetectedActivity
            r2 = 9
            r6 = 100
            r1.<init>(r2, r6)
            goto L_0x04be
        L_0x04b5:
            r2 = 9
            com.google.android.gms.location.DetectedActivity r1 = new com.google.android.gms.location.DetectedActivity
            r3 = 25
            r1.<init>(r2, r3)
        L_0x04be:
            r0.c = r14
            r11 = r1
            goto L_0x0529
        L_0x04c3:
            r0 = r28
            r14 = r33
            goto L_0x04fc
        L_0x04c8:
            r0 = r3
            r3 = r4
            r25 = r13
            r14 = r33
            r4 = 2
            r6 = 100
            r9 = 4629137466983448576(0x403e000000000000, double:30.0)
            r11 = 3
            r12 = 4
            r13 = 5
            r19 = r25[r5]
            r26 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r8 = (r19 > r26 ? 1 : (r19 == r26 ? 0 : -1))
            if (r8 < 0) goto L_0x04e2
            goto L_0x04e4
        L_0x04e2:
            r25[r5] = r26
        L_0x04e4:
            int r5 = r5 + 1
            r4 = r3
            r33 = r14
            r13 = r25
            r9 = 3
            r12 = 2
            r3 = r0
            r0 = 4
            goto L_0x0342
        L_0x04f1:
            r0 = r3
            r14 = r33
            goto L_0x04fc
        L_0x04f5:
            r0 = r3
            r14 = r33
            goto L_0x04fc
        L_0x04f9:
            r0 = r3
            r31 = r12
        L_0x04fc:
            java.util.LinkedList r2 = r0.b
            r2.clear()
            long r2 = r0.c
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x050c
            r2 = 9
            goto L_0x0522
        L_0x050c:
            long r2 = r14 - r2
            r4 = 110000(0x1adb0, double:5.4347E-319)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0520
            com.google.android.gms.location.DetectedActivity r0 = new com.google.android.gms.location.DetectedActivity
            r1 = 25
            r2 = 9
            r0.<init>(r2, r1)
            r11 = r0
            goto L_0x0529
        L_0x0520:
            r2 = 9
        L_0x0522:
            com.google.android.gms.location.DetectedActivity r0 = new com.google.android.gms.location.DetectedActivity
            r1 = 0
            r0.<init>(r2, r1)
            r11 = r0
        L_0x0529:
            com.google.android.gms.location.ActivityRecognitionResult r7 = new com.google.android.gms.location.ActivityRecognitionResult
            ahnk r0 = defpackage.ahnk.PHONE_POSITION_FILTER_ORLA
            int r0 = r0.am
            r17 = 0
            r10 = r7
            r12 = r31
            r16 = r0
            r10.<init>((com.google.android.gms.location.DetectedActivity) r11, (long) r12, (long) r14, (int) r16, (android.os.Bundle) r17)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 18
            r2.<init>(r1)
            java.lang.String r1 = "Result to report: "
            r2.append(r1)
            r2.append(r0)
            r2.toString()
        L_0x0557:
            if (r7 == 0) goto L_0x056a
            r0 = r55
            aicn r1 = r0.h
            r2 = 1
            defpackage.ahis.a(r1, r7, r2)
            ahjc r1 = r0.f
            r1.a((com.google.android.gms.location.ActivityRecognitionResult) r7)
            r0.e(r7)
            return
        L_0x056a:
            r0 = r55
            return
        L_0x056d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahju.a(com.google.android.gms.location.ActivityRecognitionResult, ahng, com.google.android.gms.location.ActivityRecognitionResult):void");
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("onFatalError: ");
        } else {
            "onFatalError: ".concat(valueOf);
        }
        if (!this.b) {
            if (ahix.Z) {
                this.d.a(false, true);
            }
            a((ahle) new ahkz(this.d));
        }
    }
}
