package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: aijm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aijm {
    public final aijj a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final ahqm f;
    private long g;
    private long h;
    private long i;
    private final ReadWriteLock j = new ReentrantReadWriteLock();
    private ahql k;
    private final hol l;
    private final SharedPreferences m;
    private final aoru n;
    private final ConcurrentHashMap o;

    public aijm(Context context, aijj aijj, hol hol) {
        boolean z;
        this.a = aijj;
        boolean z2 = false;
        this.m = context.getSharedPreferences("geocoder_mafe_client", 0);
        ahqk ahqk = new ahqk();
        int c2 = (int) aybf.c();
        if (c2 > 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "Memory capacity must be positive.");
        ahqk.a = c2;
        amrl.a(true, (Object) "Version must be non-negaive.");
        amrl.a(true, (Object) "Version must be non-negaive.");
        amrl.a(ahqk.a > 0 ? true : z2, (Object) "Memory capacity must be positive.");
        this.f = new ahqm(ahqk.a);
        this.g = System.currentTimeMillis();
        this.h = -1;
        this.i = -1;
        this.l = hol;
        this.o = new ConcurrentHashMap();
        this.n = jfm.a(10);
    }

    private static int a(aqub aqub) {
        aqub aqub2 = aqub.ADDRESS_COMPONENT_TYPE_UNSPECIFIED;
        int ordinal = aqub.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal != 4) {
            return ordinal != 14 ? 3 : 2;
        }
        return 1;
    }

    private final long a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.m.contains(str)) {
            return this.m.getLong(str, currentTimeMillis);
        }
        this.m.edit().putLong(str, currentTimeMillis).apply();
        return currentTimeMillis;
    }

    private final void a(ahql ahql) {
        aucd o2 = anzc.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anzc anzc = (anzc) o2.b;
        anzc.b = 1;
        anzc.a |= 1;
        aucd o3 = anzd.f.o();
        int i2 = (int) ahql.a;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anzd anzd = (anzd) o3.b;
        int i3 = anzd.a | 1;
        anzd.a = i3;
        anzd.b = i2;
        long j2 = ahql.b;
        anzd.a = i3 | 2;
        anzd.c = (int) j2;
        int b2 = (int) aybf.b();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anzd anzd2 = (anzd) o3.b;
        anzd2.a |= 4;
        anzd2.d = b2;
        int c2 = (int) aybf.c();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anzd anzd3 = (anzd) o3.b;
        anzd3.a |= 8;
        anzd3.e = c2;
        anzd anzd4 = (anzd) o3.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anzc anzc2 = (anzc) o2.b;
        anzd4.getClass();
        anzc2.c = anzd4;
        anzc2.a |= 2;
        anzc anzc3 = (anzc) o2.i();
        aucd o4 = anui.p.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        anui anui = (anui) o4.b;
        anui.b = 6;
        int i4 = 1 | anui.a;
        anui.a = i4;
        anzc3.getClass();
        anui.h = anzc3;
        anui.a = i4 | 64;
        long j3 = ahql.b;
        long j4 = ahql.a;
        StringBuilder sb = new StringBuilder(62);
        sb.append("logging cache stats: ");
        sb.append(j3);
        sb.append("/");
        sb.append(j4);
        sb.toString();
        this.l.a(((anui) o4.i()).k()).b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.aquf r17, java.util.List r18, int r19, java.util.Locale r20, java.lang.String r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r21
            int r4 = r1.a
            r4 = r4 & 1
            if (r4 != 0) goto L_0x000f
            goto L_0x003b
        L_0x000f:
            aqug r4 = r1.c
            if (r4 != 0) goto L_0x0015
            aqug r4 = defpackage.aqug.c
        L_0x0015:
            int r4 = r4.b
            if (r4 <= 0) goto L_0x003b
            java.util.concurrent.ConcurrentHashMap r4 = r0.o
            aqug r5 = r1.c
            if (r5 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            aqug r5 = defpackage.aqug.c
        L_0x0022:
            int r5 = r5.a
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0036
            aqug r5 = r1.c
            if (r5 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            aqug r5 = defpackage.aqug.c
        L_0x002f:
            int r5 = r5.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            r4.put(r3, r5)
            goto L_0x0040
        L_0x003b:
            java.util.concurrent.ConcurrentHashMap r4 = r0.o
            r4.remove(r3)
        L_0x0040:
            aucx r3 = r1.b
            int r3 = r3.size()
            if (r3 == 0) goto L_0x0191
            java.util.ArrayList r3 = new java.util.ArrayList
            aucx r1 = r1.b
            r3.<init>(r1)
            int r1 = r3.size()
            if (r1 <= r2) goto L_0x0060
            int r1 = r3.size()
            java.util.List r1 = r3.subList(r2, r1)
            r1.clear()
        L_0x0060:
            int r1 = r3.size()
            r2 = 0
            r4 = 0
        L_0x0066:
            if (r4 >= r1) goto L_0x0191
            java.lang.Object r5 = r3.get(r4)
            aque r5 = (defpackage.aque) r5
            android.location.Address r6 = new android.location.Address
            r7 = r20
            r6.<init>(r7)
            aqud r8 = r5.d
            if (r8 == 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            aqud r8 = defpackage.aqud.c
        L_0x007c:
            int r8 = r8.a
            r8 = r8 & 1
            if (r8 != 0) goto L_0x0083
            goto L_0x00a8
        L_0x0083:
            aqud r8 = r5.d
            if (r8 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            aqud r8 = defpackage.aqud.c
        L_0x008a:
            avoq r8 = r8.b
            if (r8 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            avoq r8 = defpackage.avoq.c
        L_0x0091:
            double r8 = r8.a
            r6.setLatitude(r8)
            aqud r8 = r5.d
            if (r8 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            aqud r8 = defpackage.aqud.c
        L_0x009d:
            avoq r8 = r8.b
            if (r8 != 0) goto L_0x00a3
            avoq r8 = defpackage.avoq.c
        L_0x00a3:
            double r8 = r8.b
            r6.setLongitude(r8)
        L_0x00a8:
            aucx r8 = r5.c
            int r9 = r8.size()
            if (r9 <= 0) goto L_0x016e
            java.lang.Object r9 = r8.get(r2)
            aquc r9 = (defpackage.aquc) r9
            java.lang.String r9 = r9.c
            r6.setFeatureName(r9)
            int r9 = r8.size()
            r10 = 0
        L_0x00c0:
            if (r10 >= r9) goto L_0x0179
            java.lang.Object r11 = r8.get(r10)
            aquc r11 = (defpackage.aquc) r11
            aucs r12 = r11.a
            int r12 = r12.size()
            if (r12 == 0) goto L_0x0169
            aqub r12 = defpackage.aqub.ADDRESS_COMPONENT_TYPE_UNSPECIFIED
            aucu r13 = new aucu
            aucs r14 = r11.a
            auct r15 = defpackage.aquc.b
            r13.<init>(r14, r15)
            java.util.Iterator r13 = r13.iterator()
        L_0x00df:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00f8
            java.lang.Object r14 = r13.next()
            aqub r14 = (defpackage.aqub) r14
            int r15 = a((defpackage.aqub) r14)
            int r2 = a((defpackage.aqub) r12)
            if (r15 < r2) goto L_0x00f6
            r12 = r14
        L_0x00f6:
            r2 = 0
            goto L_0x00df
        L_0x00f8:
            int r2 = r12.ordinal()
            r12 = 2
            if (r2 == r12) goto L_0x0164
            r12 = 12
            if (r2 == r12) goto L_0x015e
            r12 = 15
            if (r2 == r12) goto L_0x0158
            r12 = 21
            if (r2 == r12) goto L_0x0152
            r12 = 23
            if (r2 == r12) goto L_0x014c
            r12 = 34
            if (r2 == r12) goto L_0x0146
            switch(r2) {
                case 5: goto L_0x013b;
                case 6: goto L_0x0135;
                case 7: goto L_0x012f;
                case 8: goto L_0x0123;
                case 9: goto L_0x0117;
                default: goto L_0x0116;
            }
        L_0x0116:
            goto L_0x0169
        L_0x0117:
            java.lang.String r2 = r6.getSubLocality()
            if (r2 != 0) goto L_0x0169
            java.lang.String r2 = r11.c
            r6.setSubLocality(r2)
            goto L_0x0169
        L_0x0123:
            java.lang.String r2 = r6.getLocality()
            if (r2 != 0) goto L_0x0169
            java.lang.String r2 = r11.c
            r6.setLocality(r2)
            goto L_0x0169
        L_0x012f:
            java.lang.String r2 = r11.c
            r6.setSubAdminArea(r2)
            goto L_0x0169
        L_0x0135:
            java.lang.String r2 = r11.c
            r6.setAdminArea(r2)
            goto L_0x0169
        L_0x013b:
            java.lang.String r2 = r11.c
            r6.setCountryName(r2)
            java.lang.String r2 = r11.d
            r6.setCountryCode(r2)
            goto L_0x0169
        L_0x0146:
            java.lang.String r2 = r11.c
            r6.setSubThoroughfare(r2)
            goto L_0x0169
        L_0x014c:
            java.lang.String r2 = r11.c
            r6.setPostalCode(r2)
            goto L_0x0169
        L_0x0152:
            java.lang.String r2 = r11.c
            r6.setPremises(r2)
            goto L_0x0169
        L_0x0158:
            java.lang.String r2 = r11.c
            r6.setSubLocality(r2)
            goto L_0x0169
        L_0x015e:
            java.lang.String r2 = r11.c
            r6.setLocality(r2)
            goto L_0x0169
        L_0x0164:
            java.lang.String r2 = r11.c
            r6.setThoroughfare(r2)
        L_0x0169:
            int r10 = r10 + 1
            r2 = 0
            goto L_0x00c0
        L_0x016e:
            int r2 = r5.a
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0179
            java.lang.String r2 = r5.b
            r6.setFeatureName(r2)
        L_0x0179:
            int r2 = r5.a
            r2 = r2 & 1
            if (r2 != 0) goto L_0x0181
            r5 = 0
            goto L_0x0187
        L_0x0181:
            java.lang.String r2 = r5.b
            r5 = 0
            r6.setAddressLine(r5, r2)
        L_0x0187:
            r2 = r18
            r2.add(r6)
            int r4 = r4 + 1
            r2 = 0
            goto L_0x0066
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijm.a(aquf, java.util.List, int, java.util.Locale, java.lang.String):void");
    }

    public final void a() {
        if (aybf.a.a().geocoderLogErrorStats()) {
            if (this.i == -1) {
                this.i = a("LastClearcutErrorStats");
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.i > TimeUnit.SECONDS.toMillis(aybf.a.a().geocoderLogErrorStatsIntervalSecs())) {
                aucd o2 = anzc.e.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzc anzc = (anzc) o2.b;
                anzc.b = 2;
                anzc.a |= 1;
                aucd o3 = anza.f.o();
                int i2 = this.b;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                anza anza = (anza) o3.b;
                int i3 = 2 | anza.a;
                anza.a = i3;
                anza.c = i2;
                int i4 = this.c;
                int i5 = i3 | 1;
                anza.a = i5;
                anza.b = i4;
                int i6 = this.d;
                int i7 = i5 | 8;
                anza.a = i7;
                anza.e = i6;
                int i8 = this.e;
                anza.a = i7 | 4;
                anza.d = i8;
                anza anza2 = (anza) o3.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzc anzc2 = (anzc) o2.b;
                anza2.getClass();
                anzc2.d = anza2;
                anzc2.a |= 4;
                anzc anzc3 = (anzc) o2.i();
                aucd o4 = anui.p.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                anui anui = (anui) o4.b;
                anui.b = 6;
                int i9 = anui.a | 1;
                anui.a = i9;
                anzc3.getClass();
                anui.h = anzc3;
                anui.a = i9 | 64;
                this.c = 0;
                this.b = 0;
                this.e = 0;
                this.d = 0;
                this.l.a(((anui) o4.i()).k()).b();
                this.i = currentTimeMillis;
                this.m.edit().putLong("LastClearcutErrorStats", this.i).apply();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(long j2) {
        if (aybf.a.a().geocoderLogCacheStats()) {
            long j3 = this.h;
            if (j3 == -1) {
                j3 = a("LastClearcutCacheStats");
                this.h = j3;
            }
            if (j2 - j3 > TimeUnit.SECONDS.toMillis(aybf.a.a().geocoderLogCacheStatsIntervalSecs())) {
                this.j.readLock().lock();
                try {
                    ahqm ahqm = this.f;
                    ahql ahql = new ahql(ahqm.c.get(), ahqm.d.get());
                    this.j.readLock().unlock();
                    ahql ahql2 = this.k;
                    if (ahql2 == null) {
                        a(ahql);
                    } else {
                        a(new ahql(Math.max(0, ahql.a - ahql2.a), Math.max(0, ahql.b - ahql2.b)));
                    }
                    this.k = ahql;
                    this.h = j2;
                    this.m.edit().putLong("LastClearcutCacheStats", this.h).apply();
                } catch (Throwable th) {
                    this.j.readLock().unlock();
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.util.Collection} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Locale r20, java.lang.String r21, double r22, double r24, int r26, java.util.List r27) {
        /*
            r19 = this;
            r7 = r19
            r0 = r21
            r8 = r27
            r1 = 30
            r2 = r26
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            int r4 = java.lang.Math.max(r2, r1)
            long r5 = defpackage.aybf.b()
            int r1 = (int) r5
            if (r0 == 0) goto L_0x0046
            java.util.concurrent.ConcurrentHashMap r3 = r7.o
            java.lang.Object r3 = r3.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0046
            int r1 = r3.intValue()
            int r3 = r21.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 39
            r5.<init>(r3)
            java.lang.String r3 = "app "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = " forced to use s2 level "
            r5.append(r3)
            r5.append(r1)
            r5.toString()
        L_0x0046:
            long r5 = defpackage.aema.a((double) r22, (double) r24)
            long r5 = defpackage.aema.a((long) r5, (int) r1)
            r1 = 2
            double[] r1 = new double[r1]
            defpackage.aema.a((long) r5, (double[]) r1)
            avoq r3 = defpackage.avoq.c
            aucd r3 = r3.o()
            r9 = r1[r2]
            boolean r11 = r3.c
            if (r11 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r3.c()
            r3.c = r2
        L_0x0066:
            aucj r11 = r3.b
            avoq r11 = (defpackage.avoq) r11
            r11.a = r9
            r9 = 1
            r12 = r1[r9]
            r11.b = r12
            aucj r1 = r3.i()
            avoq r1 = (defpackage.avoq) r1
            java.lang.String r3 = java.lang.String.valueOf(r21)
            int r3 = r3.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r3 = r3 + 75
            r10.<init>(r3)
            java.lang.String r3 = "Reverse Geocode from "
            r10.append(r3)
            r10.append(r0)
            java.lang.String r3 = " for "
            r10.append(r3)
            r11 = r22
            r10.append(r11)
            java.lang.String r3 = ","
            r10.append(r3)
            r11 = r24
            r10.append(r11)
            r10.toString()
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r7.g
            long r12 = r10 - r12
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            aybf r14 = defpackage.aybf.a
            aybg r14 = r14.a()
            long r14 = r14.geocoderCacheMinManagementTtlSecs()
            long r14 = r3.toMillis(r14)
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x0145
            java.util.concurrent.locks.ReadWriteLock r3 = r7.j
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.lock()
            ahqm r3 = r7.f     // Catch:{ all -> 0x013a }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x013a }
            aybf r13 = defpackage.aybf.a     // Catch:{ all -> 0x013a }
            aybg r13 = r13.a()     // Catch:{ all -> 0x013a }
            long r13 = r13.geocoderCacheMaxTtlSecs()     // Catch:{ all -> 0x013a }
            long r12 = r12.toMillis(r13)     // Catch:{ all -> 0x013a }
            long r12 = r10 - r12
            ahqw r14 = r3.a     // Catch:{ all -> 0x013a }
            monitor-enter(r14)     // Catch:{ all -> 0x013a }
            ahqw r15 = r3.a     // Catch:{ all -> 0x0137 }
            java.util.Set r15 = r15.entrySet()     // Catch:{ all -> 0x0137 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x0137 }
        L_0x00eb:
            boolean r16 = r15.hasNext()     // Catch:{ all -> 0x0137 }
            if (r16 == 0) goto L_0x0124
            java.lang.Object r16 = r15.next()     // Catch:{ all -> 0x0137 }
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch:{ all -> 0x0137 }
            java.lang.Object r16 = r16.getValue()     // Catch:{ all -> 0x0137 }
            r9 = r16
            aibk r9 = (defpackage.aibk) r9     // Catch:{ all -> 0x0137 }
            r22 = r3
            long r2 = r9.b     // Catch:{ all -> 0x0137 }
            int r17 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r17 < 0) goto L_0x011c
            long r2 = r9.c     // Catch:{ all -> 0x0137 }
            r17 = 0
            int r9 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x0117
            r15.remove()     // Catch:{ all -> 0x0137 }
            r3 = r22
            r2 = 0
            r9 = 1
            goto L_0x00eb
        L_0x0117:
            r3 = r22
            r2 = 0
            r9 = 1
            goto L_0x00eb
        L_0x011c:
            r15.remove()     // Catch:{ all -> 0x0137 }
            r3 = r22
            r2 = 0
            r9 = 1
            goto L_0x00eb
        L_0x0124:
            r22 = r3
            monitor-exit(r14)     // Catch:{ all -> 0x0137 }
            r2 = r22
            r2.b = r12     // Catch:{ all -> 0x013a }
            java.util.concurrent.locks.ReadWriteLock r2 = r7.j
            java.util.concurrent.locks.Lock r2 = r2.writeLock()
            r2.unlock()
            r7.g = r10
            goto L_0x0145
        L_0x0137:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0137 }
            throw r0     // Catch:{ all -> 0x013a }
        L_0x013a:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r7.j
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
        L_0x0145:
            java.lang.String r2 = java.lang.Long.toHexString(r5)
            java.lang.String r3 = r20.toString()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r5 = r5 + 13
            int r5 = r5 + r6
            r9.<init>(r5)
            r9.append(r2)
            java.lang.String r2 = ","
            r9.append(r2)
            r9.append(r3)
            java.lang.String r2 = ","
            r9.append(r2)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.String r3 = "checking cache key "
            int r5 = r2.length()
            if (r5 != 0) goto L_0x018e
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x0191
        L_0x018e:
            r3.concat(r2)
        L_0x0191:
            java.util.concurrent.locks.ReadWriteLock r2 = r7.j
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.lock()
            ahqm r2 = r7.f     // Catch:{ all -> 0x02b7 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02b7 }
            java.lang.String r3 = "Key cannot be null."
            defpackage.amrl.a((java.lang.Object) r9, (java.lang.Object) r3)     // Catch:{ all -> 0x02b7 }
            java.util.concurrent.atomic.AtomicLong r3 = r2.c     // Catch:{ all -> 0x02b7 }
            r3.incrementAndGet()     // Catch:{ all -> 0x02b7 }
            ahqw r3 = r2.a     // Catch:{ all -> 0x02b7 }
            monitor-enter(r3)     // Catch:{ all -> 0x02b7 }
            ahqw r10 = r2.a     // Catch:{ all -> 0x02b4 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ all -> 0x02b4 }
            aibk r10 = (defpackage.aibk) r10     // Catch:{ all -> 0x02b4 }
            monitor-exit(r3)     // Catch:{ all -> 0x02b4 }
            if (r10 == 0) goto L_0x01c2
            java.util.concurrent.atomic.AtomicLong r2 = r2.d     // Catch:{ all -> 0x02b7 }
            r2.incrementAndGet()     // Catch:{ all -> 0x02b7 }
            r10.c = r5     // Catch:{ all -> 0x02b7 }
            java.lang.Object r2 = r10.a     // Catch:{ all -> 0x02b7 }
            goto L_0x01c3
        L_0x01c2:
            r2 = 0
        L_0x01c3:
            if (r2 != 0) goto L_0x02a7
            java.util.concurrent.locks.ReadWriteLock r2 = r7.j
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            com.google.android.gms.common.internal.ClientContext r2 = new com.google.android.gms.common.internal.ClientContext
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.f = r3
            if (r0 != 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r2.e = r0
        L_0x01dc:
            aqui r3 = defpackage.aqui.f
            aucd r3 = r3.o()
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x01e7
            goto L_0x01ed
        L_0x01e7:
            r3.c()
            r5 = 0
            r3.c = r5
        L_0x01ed:
            aucj r5 = r3.b
            aqui r5 = (defpackage.aqui) r5
            r1.getClass()
            r5.b = r1
            int r1 = r5.a
            r6 = 1
            r1 = r1 | r6
            r5.a = r1
            if (r0 == 0) goto L_0x0207
            r21.getClass()
            r1 = r1 | 16
            r5.a = r1
            r5.e = r0
        L_0x0207:
            r1 = r1 | 8
            r5.a = r1
            r5.d = r4
            java.lang.String r1 = r20.toString()
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0216
            goto L_0x021c
        L_0x0216:
            r3.c()
            r5 = 0
            r3.c = r5
        L_0x021c:
            aucj r5 = r3.b
            aqui r5 = (defpackage.aqui) r5
            r1.getClass()
            int r6 = r5.a
            r6 = r6 | 4
            r5.a = r6
            r5.c = r1
            aijl r1 = new aijl
            aucj r3 = r3.i()
            aqui r3 = (defpackage.aqui) r3
            r1.<init>(r7, r3, r2)
            aoru r2 = r7.n
            aorr r2 = r2.a(r1)
            long r5 = defpackage.aybf.d()     // Catch:{ TimeoutException -> 0x029e, CancellationException -> 0x029c, InterruptedException -> 0x029a, ExecutionException -> 0x0298 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x029e, CancellationException -> 0x029c, InterruptedException -> 0x029a, ExecutionException -> 0x0298 }
            r2.get(r5, r3)     // Catch:{ TimeoutException -> 0x029e, CancellationException -> 0x029c, InterruptedException -> 0x029a, ExecutionException -> 0x0298 }
            java.lang.Throwable r2 = r1.b
            if (r2 != 0) goto L_0x0290
            aquf r2 = r1.a
            r1 = r19
            r3 = r27
            r5 = r20
            r6 = r21
            r1.a(r2, r3, r4, r5, r6)
            java.util.concurrent.locks.ReadWriteLock r0 = r7.j
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            ahqm r0 = r7.f     // Catch:{ all -> 0x0285 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0285 }
            java.lang.String r3 = "Key cannot be null."
            defpackage.amrl.a((java.lang.Object) r9, (java.lang.Object) r3)     // Catch:{ all -> 0x0285 }
            aibk r3 = new aibk     // Catch:{ all -> 0x0285 }
            r3.<init>(r8, r1)     // Catch:{ all -> 0x0285 }
            ahqw r1 = r0.a     // Catch:{ all -> 0x0285 }
            monitor-enter(r1)     // Catch:{ all -> 0x0285 }
            ahqw r0 = r0.a     // Catch:{ all -> 0x0282 }
            r0.put(r9, r3)     // Catch:{ all -> 0x0282 }
            monitor-exit(r1)     // Catch:{ all -> 0x0282 }
            java.util.concurrent.locks.ReadWriteLock r0 = r7.j
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L_0x0282:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0282 }
            throw r0     // Catch:{ all -> 0x0285 }
        L_0x0285:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r7.j
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
        L_0x0290:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "grpc failed"
            r0.<init>(r1, r2)
            throw r0
        L_0x0298:
            r0 = move-exception
            goto L_0x029f
        L_0x029a:
            r0 = move-exception
            goto L_0x029f
        L_0x029c:
            r0 = move-exception
            goto L_0x029f
        L_0x029e:
            r0 = move-exception
        L_0x029f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "grpc failed"
            r1.<init>(r2, r0)
            throw r1
        L_0x02a7:
            r8.addAll(r2)     // Catch:{ all -> 0x02b7 }
            java.util.concurrent.locks.ReadWriteLock r0 = r7.j
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.unlock()
            return
        L_0x02b4:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02b4 }
            throw r0     // Catch:{ all -> 0x02b7 }
        L_0x02b7:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r7.j
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            goto L_0x02c3
        L_0x02c2:
            throw r0
        L_0x02c3:
            goto L_0x02c2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijm.a(java.util.Locale, java.lang.String, double, double, int, java.util.List):void");
    }

    public final void a(Locale locale, String str, String str2, double d2, double d3, double d4, double d5, int i2, List list) {
        String str3 = str;
        String str4 = str2;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
        sb.append("Forward Geocode from ");
        sb.append(str);
        sb.append(" for ");
        sb.append(str2);
        sb.toString();
        int max = Math.max(0, Math.min(30, i2));
        ClientContext clientContext = new ClientContext();
        clientContext.f = "com.google.android.gms";
        if (str3 != null) {
            clientContext.e = str3;
        }
        aucd o2 = aquh.h.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aquh aquh = (aquh) o2.b;
        str2.getClass();
        aquh.a |= 1;
        aquh.b = str4;
        String locale2 = locale.toString();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aquh aquh2 = (aquh) o2.b;
        locale2.getClass();
        int i3 = aquh2.a | 8;
        aquh2.a = i3;
        aquh2.e = locale2;
        if (str3 != null) {
            str.getClass();
            i3 |= 64;
            aquh2.a = i3;
            aquh2.g = str3;
        }
        aquh2.a = i3 | 32;
        aquh2.f = max;
        aucd o3 = avoq.c.o();
        aucd o4 = avoq.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        avoq avoq = (avoq) o3.b;
        avoq.a = d4;
        avoq.b = d5;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aquh aquh3 = (aquh) o2.b;
        avoq avoq2 = (avoq) o3.i();
        avoq2.getClass();
        aquh3.d = avoq2;
        aquh3.a |= 4;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        avoq avoq3 = (avoq) o4.b;
        avoq3.a = d2;
        avoq3.b = d3;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aquh aquh4 = (aquh) o2.b;
        avoq avoq4 = (avoq) o4.i();
        avoq4.getClass();
        aquh4.c = avoq4;
        aquh4.a |= 2;
        aijk aijk = new aijk(this, (aquh) o2.i(), clientContext);
        try {
            this.n.a(aijk).get(aybf.d(), TimeUnit.MILLISECONDS);
            Throwable th = aijk.b;
            if (th == null) {
                a(aijk.a, list, max, locale, str);
                return;
            }
            throw new IOException("grpc failed", th);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
            throw new IOException("grpc failed", e2);
        }
    }
}
