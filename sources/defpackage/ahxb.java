package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.SecretKey;

/* renamed from: ahxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahxb implements ajpi {
    public final aibh a;
    public long b = 0;
    public amzy c = amzy.h();
    private long d = 0;
    private long e = 0;
    private long f = 0;
    private long g = 0;
    private int h = 0;
    private int i = Integer.MIN_VALUE;
    private int j = Integer.MIN_VALUE;
    private int k;
    private amzy l = amzy.h();

    public ahxb(ajaa ajaa, SecretKey secretKey, byte[] bArr) {
        SecretKey secretKey2 = secretKey;
        byte[] bArr2 = bArr;
        this.a = new aibh(1, secretKey2, 2, bArr2, ajck.ca, a(ajaa), aibh.c);
    }

    public static File a(ajaa ajaa) {
        File h2 = ajaa.h();
        if (h2 != null) {
            return new File(h2, "nlp_clts");
        }
        return null;
    }

    public final void a() {
    }

    public final synchronized void a(int i2) {
        this.j = i2;
    }

    public final synchronized void a(long j2) {
        this.e = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063 A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073 A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095 A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0 A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f6 A[Catch:{ IOException -> 0x015e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            r2 = 0
            r3 = 1
            aibh r0 = r1.a     // Catch:{ IOException -> 0x015e }
            aqek r4 = r0.a()     // Catch:{ IOException -> 0x015e }
            r5 = 0
            r7 = 2
            long r8 = defpackage.aqen.a(r4, r7, r5)     // Catch:{ IOException -> 0x015e }
            r1.d = r8     // Catch:{ IOException -> 0x015e }
            r0 = 11
            r8 = 1
            long r8 = defpackage.aqen.a(r4, r0, r8)     // Catch:{ IOException -> 0x015e }
            int r0 = (int) r8     // Catch:{ IOException -> 0x015e }
            r1.k = r0     // Catch:{ IOException -> 0x015e }
            r0 = 3
            long r8 = defpackage.aqen.a(r4, r0, r5)     // Catch:{ IOException -> 0x015e }
            r1.e = r8     // Catch:{ IOException -> 0x015e }
            r0 = 6
            long r8 = defpackage.aqen.a(r4, r0, r5)     // Catch:{ IOException -> 0x015e }
            r1.f = r8     // Catch:{ IOException -> 0x015e }
            r0 = 9
            long r8 = defpackage.aqen.a(r4, r0, r5)     // Catch:{ IOException -> 0x015e }
            r1.b = r8     // Catch:{ IOException -> 0x015e }
            r0 = 8
            long r5 = defpackage.aqen.a(r4, r0, r5)     // Catch:{ IOException -> 0x015e }
            r1.g = r5     // Catch:{ IOException -> 0x015e }
            if (r4 == 0) goto L_0x0050
            r0 = 7
            boolean r5 = r4.i(r0)     // Catch:{ IllegalArgumentException -> 0x004d, ClassCastException -> 0x004b }
            if (r5 == 0) goto L_0x0050
            int r0 = r4.b((int) r0)     // Catch:{ IllegalArgumentException -> 0x004d, ClassCastException -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r0 = move-exception
            goto L_0x004e
        L_0x004d:
            r0 = move-exception
        L_0x004e:
            r0 = 0
            goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            r1.h = r0     // Catch:{ IOException -> 0x015e }
            r0 = 5
            int r5 = r4.j(r0)     // Catch:{ IOException -> 0x015e }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 <= 0) goto L_0x0063
            int r5 = r4.b((int) r0)     // Catch:{ IOException -> 0x015e }
            r1.i = r5     // Catch:{ IOException -> 0x015e }
            goto L_0x0065
        L_0x0063:
            r1.i = r6     // Catch:{ IOException -> 0x015e }
        L_0x0065:
            r5 = 4
            int r8 = r4.j(r5)     // Catch:{ IOException -> 0x015e }
            if (r8 <= 0) goto L_0x0073
            int r6 = r4.b((int) r5)     // Catch:{ IOException -> 0x015e }
            r1.j = r6     // Catch:{ IOException -> 0x015e }
            goto L_0x0075
        L_0x0073:
            r1.j = r6     // Catch:{ IOException -> 0x015e }
        L_0x0075:
            r6 = 10
            int r8 = r4.j(r6)     // Catch:{ IOException -> 0x015e }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ IOException -> 0x015e }
            r9.<init>(r8)     // Catch:{ IOException -> 0x015e }
            r10 = 0
        L_0x0081:
            if (r10 < r8) goto L_0x00f6
            amzy r6 = defpackage.amzy.a((java.util.Collection) r9)     // Catch:{ IOException -> 0x015e }
            r1.c = r6     // Catch:{ IOException -> 0x015e }
            int r6 = r4.j(r3)     // Catch:{ IOException -> 0x015e }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ IOException -> 0x015e }
            r8.<init>(r6)     // Catch:{ IOException -> 0x015e }
            r9 = 0
        L_0x0093:
            if (r9 >= r6) goto L_0x00c5
            aqek r10 = r4.f(r3, r9)     // Catch:{ IOException -> 0x015e }
            int r11 = r10.j(r0)     // Catch:{ IOException -> 0x015e }
            if (r11 <= 0) goto L_0x00aa
            int r11 = r10.b((int) r0)     // Catch:{ IOException -> 0x015e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x015e }
            r18 = r11
            goto L_0x00ad
        L_0x00aa:
            r11 = 0
            r18 = r11
        L_0x00ad:
            ahwz r11 = new ahwz     // Catch:{ IOException -> 0x015e }
            long r13 = r10.c(r3)     // Catch:{ IOException -> 0x015e }
            long r15 = r10.c(r7)     // Catch:{ IOException -> 0x015e }
            int r17 = r10.b((int) r5)     // Catch:{ IOException -> 0x015e }
            r12 = r11
            r12.<init>(r13, r15, r17, r18)     // Catch:{ IOException -> 0x015e }
            r8.add(r11)     // Catch:{ IOException -> 0x015e }
            int r9 = r9 + 1
            goto L_0x0093
        L_0x00c5:
            java.util.Collections.sort(r8)     // Catch:{ IOException -> 0x015e }
            int r0 = r8.size()     // Catch:{ IOException -> 0x015e }
            r4 = 20
            if (r0 <= r4) goto L_0x00d7
            int r4 = r0 + -20
            java.util.List r8 = r8.subList(r4, r0)     // Catch:{ IOException -> 0x015e }
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            amzy r0 = defpackage.amzy.a((java.util.Collection) r8)     // Catch:{ IOException -> 0x015e }
            r1.l = r0     // Catch:{ IOException -> 0x015e }
            aibh r0 = r1.a     // Catch:{ IOException -> 0x015e }
            int r0 = r0.b     // Catch:{ IOException -> 0x015e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015e }
            r5 = 32
            r4.<init>(r5)     // Catch:{ IOException -> 0x015e }
            java.lang.String r5 = "Actual file version: "
            r4.append(r5)     // Catch:{ IOException -> 0x015e }
            r4.append(r0)     // Catch:{ IOException -> 0x015e }
            r4.toString()     // Catch:{ IOException -> 0x015e }
            goto L_0x0162
        L_0x00f6:
            aqek r11 = r4.f(r6, r10)     // Catch:{ IOException -> 0x015e }
            boolean r12 = r11.i(r3)     // Catch:{ IOException -> 0x015e }
            if (r12 == 0) goto L_0x0151
            java.lang.String r12 = r11.f(r3)     // Catch:{ IOException -> 0x015e }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ IOException -> 0x015e }
            r13.<init>()     // Catch:{ IOException -> 0x015e }
            r14 = 0
        L_0x010b:
            int r15 = r11.j(r7)     // Catch:{ IOException -> 0x015e }
            if (r14 < r15) goto L_0x011c
            ahxa r11 = new ahxa     // Catch:{ IOException -> 0x015e }
            r11.<init>(r12, r13)     // Catch:{ IOException -> 0x015e }
            r9.add(r11)     // Catch:{ IOException -> 0x015e }
            r15 = r8
            goto L_0x0152
        L_0x011c:
            aqek r15 = r11.f(r7, r14)     // Catch:{ IOException -> 0x015e }
            boolean r16 = r15.i(r3)     // Catch:{ IOException -> 0x015e }
            if (r16 != 0) goto L_0x0129
            r15 = r8
            goto L_0x0148
        L_0x0129:
            boolean r16 = r15.i(r7)     // Catch:{ IOException -> 0x015e }
            if (r16 == 0) goto L_0x0147
            int r0 = r15.b((int) r3)     // Catch:{ IOException -> 0x015e }
            long r5 = (long) r0     // Catch:{ IOException -> 0x015e }
            int r0 = r15.b((int) r7)     // Catch:{ IOException -> 0x015e }
            r15 = r8
            long r7 = (long) r0     // Catch:{ IOException -> 0x015e }
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0148
            ahyw r0 = new ahyw     // Catch:{ IOException -> 0x015e }
            r0.<init>(r5, r7)     // Catch:{ IOException -> 0x015e }
            r13.add(r0)     // Catch:{ IOException -> 0x015e }
            goto L_0x0148
        L_0x0147:
            r15 = r8
        L_0x0148:
            int r14 = r14 + 1
            r8 = r15
            r0 = 5
            r5 = 4
            r6 = 10
            r7 = 2
            goto L_0x010b
        L_0x0151:
            r15 = r8
        L_0x0152:
            int r10 = r10 + 1
            r8 = r15
            r0 = 5
            r5 = 4
            r6 = 10
            r7 = 2
            goto L_0x0081
        L_0x015c:
            r0 = move-exception
            goto L_0x016c
        L_0x015e:
            r0 = move-exception
            r0.toString()     // Catch:{ all -> 0x015c }
        L_0x0162:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x015c }
            java.lang.String r3 = r19.toString()     // Catch:{ all -> 0x015c }
            r0[r2] = r3     // Catch:{ all -> 0x015c }
            monitor-exit(r19)
            return
        L_0x016c:
            monitor-exit(r19)
            goto L_0x016f
        L_0x016e:
            throw r0
        L_0x016f:
            goto L_0x016e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxb.b():void");
    }

    public final synchronized void b(int i2) {
        this.i = i2;
    }

    public final synchronized void b(long j2) {
        this.g = j2;
    }

    public final synchronized aqek c(long j2) {
        int i2;
        aqek aqek = new aqek(ajck.ar);
        anhk i3 = this.l.listIterator();
        while (i3.hasNext()) {
            ahwz ahwz = (ahwz) i3.next();
            long j3 = ahwz.b;
            if (j3 >= j2) {
                aqek aqek2 = new aqek(ajck.aq);
                Integer num = ahwz.d;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 1;
                }
                aqek2.g(2, i2);
                aqek2.g(1, ahwz.c);
                aqek2.g(3, (int) ahyw.b(j3));
                aqek.a(1, (Object) aqek2);
            }
        }
        if (aqek.j(1) == 0) {
            return null;
        }
        return aqek;
    }

    /* access modifiers changed from: package-private */
    public final synchronized aqek d() {
        int size;
        size = this.l.size();
        return size != 0 ? ((ahwz) this.l.get(size - 1)).a() : null;
    }

    public final synchronized int e() {
        int i2 = this.j;
        if (i2 == Integer.MIN_VALUE) {
            return 1;
        }
        return i2;
    }

    public final synchronized int f() {
        int i2 = this.i;
        if (i2 == Integer.MIN_VALUE) {
            return 1;
        }
        return i2;
    }

    public final synchronized boolean g() {
        return this.j != Integer.MIN_VALUE;
    }

    public final synchronized boolean h() {
        return this.i != Integer.MIN_VALUE;
    }

    public final synchronized long i() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void j() {
        this.g = 0;
    }

    public final synchronized Date k() {
        long j2 = this.f;
        if (j2 == 0) {
            return null;
        }
        return new Date(j2);
    }

    public final synchronized void l() {
        this.h++;
    }

    public final synchronized int m() {
        return this.h;
    }

    public final synchronized Map n() {
        HashMap hashMap;
        if (this.b != 0) {
            hashMap = new HashMap();
            anhk i2 = this.c.listIterator();
            while (i2.hasNext()) {
                ahxa ahxa = (ahxa) i2.next();
                hashMap.put(ahxa.a, ahxa.b);
            }
        } else {
            hashMap = null;
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final synchronized aqek o() {
        aqek aqek;
        aqek = new aqek(ajck.ca);
        long j2 = this.d;
        if (j2 != 0) {
            aqek.b(2, j2);
        }
        aqek.g(11, this.k);
        aqek.b(3, this.e);
        long j3 = this.f;
        if (j3 != 0) {
            aqek.b(6, j3);
        }
        long j4 = this.b;
        if (j4 != 0) {
            aqek.b(9, j4);
        }
        long j5 = this.g;
        if (j5 != 0) {
            aqek.b(8, j5);
        }
        aqek.g(7, this.h);
        int i2 = this.i;
        if (i2 != Integer.MIN_VALUE) {
            aqek.g(5, i2);
        }
        int i3 = this.j;
        if (i3 != Integer.MIN_VALUE) {
            aqek.g(4, i3);
        }
        anhk i4 = this.c.listIterator();
        while (i4.hasNext()) {
            ahxa ahxa = (ahxa) i4.next();
            aqek aqek2 = new aqek(ajck.bZ);
            aqek2.b(1, (Object) ahxa.a);
            anhk i5 = ahxa.b.listIterator();
            while (i5.hasNext()) {
                ahyw ahyw = (ahyw) i5.next();
                aqek aqek3 = new aqek(ajck.bY);
                aqek3.g(1, (int) ahyw.a);
                aqek3.g(2, (int) ahyw.b);
                aqek2.a(2, (Object) aqek3);
            }
            aqek.a(10, (Object) aqek2);
        }
        anhk i6 = this.l.listIterator();
        while (i6.hasNext()) {
            aqek.a(1, (Object) ((ahwz) i6.next()).a());
        }
        return aqek;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String str;
        sb = new StringBuilder();
        Object[] objArr = new Object[1];
        long j2 = this.d;
        if (j2 != 0) {
            str = new Date(j2).toString();
        } else {
            str = "none";
        }
        objArr[0] = str;
        sb.append(String.format("NextSensorCollectionTimeSinceEpoch: %s", objArr));
        anhk i2 = this.l.listIterator();
        while (i2.hasNext()) {
            ahwz ahwz = (ahwz) i2.next();
            sb.append(", [");
            sb.append(String.format("start: %s, end: %s", new Object[]{new Date(ahwz.a), new Date(ahwz.b)}));
            sb.append("]");
        }
        return sb.toString();
    }

    public final synchronized void a(long j2, long j3, int i2, ahxq ahxq) {
        Integer num;
        int i3;
        long min = Math.min(j2, j3);
        long max = Math.max(j2, j3);
        if (ahxq != null) {
            if (ahxq == ahxq.USING_IN_OUTDOOR_HINTS) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            num = Integer.valueOf(i3);
        } else {
            num = null;
        }
        List arrayList = new ArrayList(this.l);
        arrayList.add(new ahwz(min, max, i2, num));
        Collections.sort(arrayList);
        int size = arrayList.size();
        if (size > 20) {
            arrayList = arrayList.subList(size - 20, size);
        }
        this.l = amzy.a((Collection) arrayList);
    }

    public final void c() {
        byte[] byteArray;
        FileOutputStream fileOutputStream;
        try {
            synchronized (this) {
                aibh aibh = this.a;
                aqek o = o();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                aibh.a(o, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            }
            aibh aibh2 = this.a;
            File file = aibh2.a;
            if (file != null) {
                try {
                    if (!file.exists()) {
                        aibh2.a.createNewFile();
                    }
                    fileOutputStream = new FileOutputStream(aibh2.a);
                    try {
                        fileOutputStream.write(byteArray);
                        ajre.a((Closeable) fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        ajre.a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    ajre.a((Closeable) fileOutputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
        }
    }

    public final void a(aqek aqek, long j2) {
        aqek c2 = c(j2);
        if (c2 != null) {
            aqek.b(12, (Object) c2);
        }
    }

    public final void a(aucd aucd, long j2) {
        int i2;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            anhk i3 = this.l.listIterator();
            while (i3.hasNext()) {
                ahwz ahwz = (ahwz) i3.next();
                if (ahwz.b >= j2) {
                    arrayList.add(ahwz);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            aucd o = artj.b.o();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                ahwz ahwz2 = (ahwz) arrayList.get(i4);
                Integer num = ahwz2.d;
                if (num != null) {
                    i2 = artm.a(num.intValue());
                } else {
                    i2 = 1;
                }
                long b2 = ahyw.b(ahwz2.b);
                int a2 = arto.a(ahwz2.c);
                aucd o2 = artp.e.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                artp artp = (artp) o2.b;
                if (a2 != 0) {
                    artp.b = a2;
                    int i5 = artp.a | 1;
                    artp.a = i5;
                    int i6 = i5 | 4;
                    artp.a = i6;
                    artp.d = (int) b2;
                    if (i2 != 0) {
                        artp.c = i2;
                        artp.a = i6 | 2;
                        artp artp2 = (artp) o2.i();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        artj artj = (artj) o.b;
                        artp2.getClass();
                        if (!artj.a.a()) {
                            artj.a = aucj.a(artj.a);
                        }
                        artj.a.add(artp2);
                        i4++;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            artj artj2 = (artj) o.i();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            artq artq = (artq) aucd.b;
            artq artq2 = artq.i;
            artj2.getClass();
            artq.e = artj2;
            artq.a |= 512;
        }
    }

    public final synchronized void a(Calendar calendar) {
        if (calendar != null) {
            this.f = calendar.getTimeInMillis();
            this.h = 0;
        }
    }
}
