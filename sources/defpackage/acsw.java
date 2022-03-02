package defpackage;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: acsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsw extends acrl {
    public acsw() {
        super("Netstats", "netstats", "NETSTATS", false);
    }

    public final String[] a(long j, long j2) {
        long j3 = j2 - j;
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("--duration=");
            sb.append(j3);
            return new String[]{"detail", sb.toString()};
        } else if (SystemClock.elapsedRealtime() <= j3) {
            return new String[]{"detail", "full"};
        } else {
            return new String[]{"detail"};
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x03a0 A[Catch:{ all -> 0x0552, IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03a1 A[Catch:{ all -> 0x0552, IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03bc A[Catch:{ all -> 0x0552, IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x03c4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.avwc b(android.content.Context r22, java.io.InputStream r23, long r24, long r26, defpackage.hph r28) {
        /*
            r21 = this;
            r1 = r24
            acsy r3 = new acsy
            android.content.pm.PackageManager r4 = r22.getPackageManager()
            r3.<init>(r4)
            r7 = 1
            r8 = 0
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r11 = r23
            r10.<init>(r11)     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            acsx r10 = new acsx     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r10.<init>()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            actb r12 = r3.b     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            monitor-enter(r12)     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
        L_0x0021:
            java.lang.String r13 = r9.readLine()     // Catch:{ all -> 0x0552 }
            if (r13 == 0) goto L_0x04c2
            actb r14 = r3.b     // Catch:{ all -> 0x0552 }
            acsz r14 = r14.h     // Catch:{ all -> 0x0552 }
            r14.c(r13)     // Catch:{ all -> 0x0552 }
            boolean r14 = r14.a()     // Catch:{ all -> 0x0552 }
            if (r14 == 0) goto L_0x003c
            r10.b()     // Catch:{ all -> 0x0552 }
            r10.c = r7     // Catch:{ all -> 0x0552 }
            r10.d = r8     // Catch:{ all -> 0x0552 }
            goto L_0x0021
        L_0x003c:
            actb r14 = r3.b     // Catch:{ all -> 0x0552 }
            acsz r14 = r14.i     // Catch:{ all -> 0x0552 }
            r14.c(r13)     // Catch:{ all -> 0x0552 }
            boolean r14 = r14.a()     // Catch:{ all -> 0x0552 }
            if (r14 == 0) goto L_0x0051
            r10.b()     // Catch:{ all -> 0x0552 }
            r10.c = r8     // Catch:{ all -> 0x0552 }
            r10.d = r7     // Catch:{ all -> 0x0552 }
            goto L_0x0021
        L_0x0051:
            boolean r14 = r10.c     // Catch:{ all -> 0x0552 }
            if (r14 != 0) goto L_0x0059
            boolean r14 = r10.d     // Catch:{ all -> 0x0552 }
            if (r14 == 0) goto L_0x0021
        L_0x0059:
            actb r14 = r3.b     // Catch:{ all -> 0x0552 }
            acsz r14 = r14.d     // Catch:{ all -> 0x0552 }
            r14.c(r13)     // Catch:{ all -> 0x0552 }
            boolean r15 = r14.a()     // Catch:{ all -> 0x0552 }
            if (r15 != 0) goto L_0x01b7
            actb r14 = r3.b     // Catch:{ all -> 0x0552 }
            acsz r14 = r14.f     // Catch:{ all -> 0x0552 }
            r14.c(r13)     // Catch:{ all -> 0x0552 }
            boolean r15 = r14.a()     // Catch:{ all -> 0x0552 }
            if (r15 == 0) goto L_0x00bf
            android.util.Pair r13 = r10.e     // Catch:{ all -> 0x0552 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x0552 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0552 }
            android.util.Pair r15 = r10.e     // Catch:{ all -> 0x0552 }
            java.lang.Object r15 = r15.second     // Catch:{ all -> 0x0552 }
            anup r15 = (defpackage.anup) r15     // Catch:{ all -> 0x0552 }
            r4 = 5
            java.lang.Object r4 = r15.c(r4)     // Catch:{ all -> 0x0552 }
            aucd r4 = (defpackage.aucd) r4     // Catch:{ all -> 0x0552 }
            r4.a((defpackage.aucj) r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = "duration"
            java.lang.String r14 = r14.b(r15)     // Catch:{ all -> 0x0552 }
            long r14 = java.lang.Long.parseLong(r14)     // Catch:{ all -> 0x0552 }
            actb r5 = r3.b     // Catch:{ all -> 0x0552 }
            long r14 = r5.a(r14)     // Catch:{ all -> 0x0552 }
            boolean r5 = r4.c     // Catch:{ all -> 0x0552 }
            if (r5 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            r4.c()     // Catch:{ all -> 0x0552 }
            r4.c = r8     // Catch:{ all -> 0x0552 }
        L_0x00a3:
            aucj r5 = r4.b     // Catch:{ all -> 0x0552 }
            anup r5 = (defpackage.anup) r5     // Catch:{ all -> 0x0552 }
            anup r16 = defpackage.anup.h     // Catch:{ all -> 0x0552 }
            int r6 = r5.a     // Catch:{ all -> 0x0552 }
            r6 = r6 | 8
            r5.a = r6     // Catch:{ all -> 0x0552 }
            r5.g = r14     // Catch:{ all -> 0x0552 }
            aucj r4 = r4.i()     // Catch:{ all -> 0x0552 }
            anup r4 = (defpackage.anup) r4     // Catch:{ all -> 0x0552 }
            android.util.Pair r4 = android.util.Pair.create(r13, r4)     // Catch:{ all -> 0x0552 }
            r10.e = r4     // Catch:{ all -> 0x0552 }
            goto L_0x0021
        L_0x00bf:
            actb r4 = r3.b     // Catch:{ all -> 0x0552 }
            acsz r4 = r4.g     // Catch:{ all -> 0x0552 }
            r4.c(r13)     // Catch:{ all -> 0x0552 }
            boolean r5 = r4.a()     // Catch:{ all -> 0x0552 }
            if (r5 == 0) goto L_0x0021
            anun r5 = defpackage.anun.h     // Catch:{ all -> 0x0552 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x0552 }
            actb r6 = r3.b     // Catch:{ all -> 0x0552 }
            java.lang.String r13 = "start"
            java.lang.String r13 = r4.b(r13)     // Catch:{ all -> 0x0552 }
            long r13 = java.lang.Long.parseLong(r13)     // Catch:{ all -> 0x0552 }
            long r13 = r6.a(r13)     // Catch:{ all -> 0x0552 }
            r17 = -1
            long r17 = r13 + r17
            int r6 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r6 < 0) goto L_0x01ad
            boolean r6 = r5.c     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f4
        L_0x00ef:
            r5.c()     // Catch:{ all -> 0x0552 }
            r5.c = r8     // Catch:{ all -> 0x0552 }
        L_0x00f4:
            aucj r6 = r5.b     // Catch:{ all -> 0x0552 }
            anun r6 = (defpackage.anun) r6     // Catch:{ all -> 0x0552 }
            int r15 = r6.a     // Catch:{ all -> 0x0552 }
            r15 = r15 | r7
            r6.a = r15     // Catch:{ all -> 0x0552 }
            r6.b = r13     // Catch:{ all -> 0x0552 }
            java.lang.String r6 = "rxBytes"
            java.lang.String r6 = r4.b(r6)     // Catch:{ all -> 0x0552 }
            long r13 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x0552 }
            boolean r6 = r5.c     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x010e
            goto L_0x0113
        L_0x010e:
            r5.c()     // Catch:{ all -> 0x0552 }
            r5.c = r8     // Catch:{ all -> 0x0552 }
        L_0x0113:
            aucj r6 = r5.b     // Catch:{ all -> 0x0552 }
            anun r6 = (defpackage.anun) r6     // Catch:{ all -> 0x0552 }
            int r15 = r6.a     // Catch:{ all -> 0x0552 }
            r16 = 2
            r15 = r15 | 2
            r6.a = r15     // Catch:{ all -> 0x0552 }
            r6.c = r13     // Catch:{ all -> 0x0552 }
            java.lang.String r6 = "rxPackets"
            java.lang.String r6 = r4.b(r6)     // Catch:{ all -> 0x0552 }
            long r13 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x0552 }
            boolean r6 = r5.c     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x0130
            goto L_0x0135
        L_0x0130:
            r5.c()     // Catch:{ all -> 0x0552 }
            r5.c = r8     // Catch:{ all -> 0x0552 }
        L_0x0135:
            aucj r6 = r5.b     // Catch:{ all -> 0x0552 }
            anun r6 = (defpackage.anun) r6     // Catch:{ all -> 0x0552 }
            int r15 = r6.a     // Catch:{ all -> 0x0552 }
            r17 = 4
            r15 = r15 | 4
            r6.a = r15     // Catch:{ all -> 0x0552 }
            r6.d = r13     // Catch:{ all -> 0x0552 }
            java.lang.String r6 = "txBytes"
            java.lang.String r6 = r4.b(r6)     // Catch:{ all -> 0x0552 }
            long r13 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x0552 }
            boolean r6 = r5.c     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x0152
            goto L_0x0157
        L_0x0152:
            r5.c()     // Catch:{ all -> 0x0552 }
            r5.c = r8     // Catch:{ all -> 0x0552 }
        L_0x0157:
            aucj r6 = r5.b     // Catch:{ all -> 0x0552 }
            anun r6 = (defpackage.anun) r6     // Catch:{ all -> 0x0552 }
            int r15 = r6.a     // Catch:{ all -> 0x0552 }
            r15 = r15 | 8
            r6.a = r15     // Catch:{ all -> 0x0552 }
            r6.e = r13     // Catch:{ all -> 0x0552 }
            java.lang.String r6 = "txPackets"
            java.lang.String r6 = r4.b(r6)     // Catch:{ all -> 0x0552 }
            long r13 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x0552 }
            boolean r6 = r5.c     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x0172
            goto L_0x0177
        L_0x0172:
            r5.c()     // Catch:{ all -> 0x0552 }
            r5.c = r8     // Catch:{ all -> 0x0552 }
        L_0x0177:
            aucj r6 = r5.b     // Catch:{ all -> 0x0552 }
            anun r6 = (defpackage.anun) r6     // Catch:{ all -> 0x0552 }
            int r15 = r6.a     // Catch:{ all -> 0x0552 }
            r15 = r15 | 16
            r6.a = r15     // Catch:{ all -> 0x0552 }
            r6.f = r13     // Catch:{ all -> 0x0552 }
            java.lang.String r6 = "operations"
            java.lang.String r4 = r4.b(r6)     // Catch:{ all -> 0x0552 }
            if (r4 != 0) goto L_0x018c
            goto L_0x01a6
        L_0x018c:
            long r13 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0552 }
            boolean r4 = r5.c     // Catch:{ all -> 0x0552 }
            if (r4 != 0) goto L_0x0195
            goto L_0x019a
        L_0x0195:
            r5.c()     // Catch:{ all -> 0x0552 }
            r5.c = r8     // Catch:{ all -> 0x0552 }
        L_0x019a:
            aucj r4 = r5.b     // Catch:{ all -> 0x0552 }
            anun r4 = (defpackage.anun) r4     // Catch:{ all -> 0x0552 }
            int r6 = r4.a     // Catch:{ all -> 0x0552 }
            r6 = r6 | 32
            r4.a = r6     // Catch:{ all -> 0x0552 }
            r4.g = r13     // Catch:{ all -> 0x0552 }
        L_0x01a6:
            aucj r4 = r5.i()     // Catch:{ all -> 0x0552 }
            anun r4 = (defpackage.anun) r4     // Catch:{ all -> 0x0552 }
            goto L_0x01ae
        L_0x01ad:
            r4 = 0
        L_0x01ae:
            if (r4 == 0) goto L_0x0021
            java.util.List r5 = r10.f     // Catch:{ all -> 0x0552 }
            r5.add(r4)     // Catch:{ all -> 0x0552 }
            goto L_0x0021
        L_0x01b7:
            r10.b()     // Catch:{ all -> 0x0552 }
            anup r4 = defpackage.anup.h     // Catch:{ all -> 0x0552 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0552 }
            actb r5 = r3.b     // Catch:{ all -> 0x0552 }
            java.lang.String r6 = "idents"
            java.lang.String r6 = r14.b(r6)     // Catch:{ all -> 0x0552 }
            acsz r5 = r5.e     // Catch:{ all -> 0x0552 }
            r5.c(r6)     // Catch:{ all -> 0x0552 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0552 }
            r6.<init>()     // Catch:{ all -> 0x0552 }
        L_0x01d2:
            java.util.regex.Matcher r13 = r5.b     // Catch:{ all -> 0x0552 }
            boolean r13 = r13.find()     // Catch:{ all -> 0x0552 }
            if (r13 != 0) goto L_0x0415
            int r5 = r6.size()     // Catch:{ all -> 0x0552 }
            anus[] r5 = new defpackage.anus[r5]     // Catch:{ all -> 0x0552 }
            java.lang.Object[] r5 = r6.toArray(r5)     // Catch:{ all -> 0x0552 }
            anus[] r5 = (defpackage.anus[]) r5     // Catch:{ all -> 0x0552 }
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x0552 }
            boolean r6 = r4.c     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x01ef
            goto L_0x01f4
        L_0x01ef:
            r4.c()     // Catch:{ all -> 0x0552 }
            r4.c = r8     // Catch:{ all -> 0x0552 }
        L_0x01f4:
            aucj r6 = r4.b     // Catch:{ all -> 0x0552 }
            anup r6 = (defpackage.anup) r6     // Catch:{ all -> 0x0552 }
            aucx r13 = r6.b     // Catch:{ all -> 0x0552 }
            boolean r13 = r13.a()     // Catch:{ all -> 0x0552 }
            if (r13 == 0) goto L_0x0201
            goto L_0x0209
        L_0x0201:
            aucx r13 = r6.b     // Catch:{ all -> 0x0552 }
            aucx r13 = defpackage.aucj.a((defpackage.aucx) r13)     // Catch:{ all -> 0x0552 }
            r6.b = r13     // Catch:{ all -> 0x0552 }
        L_0x0209:
            aucx r6 = r6.b     // Catch:{ all -> 0x0552 }
            defpackage.auab.a((java.lang.Iterable) r5, (java.util.List) r6)     // Catch:{ all -> 0x0552 }
            java.lang.String r5 = "set"
            java.lang.String r5 = r14.b(r5)     // Catch:{ all -> 0x0552 }
            if (r5 == 0) goto L_0x02c8
            actb r6 = r3.b     // Catch:{ all -> 0x0552 }
            acsz r6 = r6.j     // Catch:{ all -> 0x0552 }
            r6.c(r5)     // Catch:{ all -> 0x0552 }
            boolean r6 = r6.a()     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x02b2
            actb r6 = r3.b     // Catch:{ all -> 0x0552 }
            acsz r6 = r6.k     // Catch:{ all -> 0x0552 }
            r6.c(r5)     // Catch:{ all -> 0x0552 }
            boolean r6 = r6.a()     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x029b
            actb r6 = r3.b     // Catch:{ all -> 0x0552 }
            acsz r6 = r6.l     // Catch:{ all -> 0x0552 }
            r6.c(r5)     // Catch:{ all -> 0x0552 }
            boolean r6 = r6.a()     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x0283
            boolean r6 = r4.c     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x0242
            goto L_0x0247
        L_0x0242:
            r4.c()     // Catch:{ all -> 0x0552 }
            r4.c = r8     // Catch:{ all -> 0x0552 }
        L_0x0247:
            aucj r6 = r4.b     // Catch:{ all -> 0x0552 }
            anup r6 = (defpackage.anup) r6     // Catch:{ all -> 0x0552 }
            r6.e = r8     // Catch:{ all -> 0x0552 }
            int r13 = r6.a     // Catch:{ all -> 0x0552 }
            r15 = 2
            r13 = r13 | r15
            r6.a = r13     // Catch:{ all -> 0x0552 }
            actb r6 = r3.b     // Catch:{ all -> 0x0552 }
            acsz r13 = r6.m     // Catch:{ all -> 0x0552 }
            r13.c(r5)     // Catch:{ all -> 0x0552 }
            boolean r13 = r13.a()     // Catch:{ all -> 0x0552 }
            if (r13 != 0) goto L_0x02c8
            acsz r6 = r6.n     // Catch:{ all -> 0x0552 }
            r6.c(r5)     // Catch:{ all -> 0x0552 }
            boolean r6 = r6.a()     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x02c8
            java.lang.String r6 = "NetstatsParser"
            java.lang.String r13 = "Unknown set: "
            int r15 = r5.length()     // Catch:{ all -> 0x0552 }
            if (r15 != 0) goto L_0x027b
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0552 }
            r5.<init>(r13)     // Catch:{ all -> 0x0552 }
            goto L_0x027f
        L_0x027b:
            java.lang.String r5 = r13.concat(r5)     // Catch:{ all -> 0x0552 }
        L_0x027f:
            android.util.Log.w(r6, r5)     // Catch:{ all -> 0x0552 }
            goto L_0x02c8
        L_0x0283:
            boolean r5 = r4.c     // Catch:{ all -> 0x0552 }
            if (r5 != 0) goto L_0x0288
            goto L_0x028d
        L_0x0288:
            r4.c()     // Catch:{ all -> 0x0552 }
            r4.c = r8     // Catch:{ all -> 0x0552 }
        L_0x028d:
            aucj r5 = r4.b     // Catch:{ all -> 0x0552 }
            anup r5 = (defpackage.anup) r5     // Catch:{ all -> 0x0552 }
            r6 = 3
            r5.e = r6     // Catch:{ all -> 0x0552 }
            int r6 = r5.a     // Catch:{ all -> 0x0552 }
            r13 = 2
            r6 = r6 | r13
            r5.a = r6     // Catch:{ all -> 0x0552 }
            goto L_0x02c8
        L_0x029b:
            boolean r5 = r4.c     // Catch:{ all -> 0x0552 }
            if (r5 != 0) goto L_0x02a0
            goto L_0x02a5
        L_0x02a0:
            r4.c()     // Catch:{ all -> 0x0552 }
            r4.c = r8     // Catch:{ all -> 0x0552 }
        L_0x02a5:
            aucj r5 = r4.b     // Catch:{ all -> 0x0552 }
            anup r5 = (defpackage.anup) r5     // Catch:{ all -> 0x0552 }
            r6 = 2
            r5.e = r6     // Catch:{ all -> 0x0552 }
            int r13 = r5.a     // Catch:{ all -> 0x0552 }
            r13 = r13 | r6
            r5.a = r13     // Catch:{ all -> 0x0552 }
            goto L_0x02c8
        L_0x02b2:
            boolean r5 = r4.c     // Catch:{ all -> 0x0552 }
            if (r5 != 0) goto L_0x02b7
            goto L_0x02bc
        L_0x02b7:
            r4.c()     // Catch:{ all -> 0x0552 }
            r4.c = r8     // Catch:{ all -> 0x0552 }
        L_0x02bc:
            aucj r5 = r4.b     // Catch:{ all -> 0x0552 }
            anup r5 = (defpackage.anup) r5     // Catch:{ all -> 0x0552 }
            r5.e = r7     // Catch:{ all -> 0x0552 }
            int r6 = r5.a     // Catch:{ all -> 0x0552 }
            r13 = 2
            r6 = r6 | r13
            r5.a = r6     // Catch:{ all -> 0x0552 }
        L_0x02c8:
            java.lang.String r5 = "tag"
            java.lang.String r5 = r14.b(r5)     // Catch:{ all -> 0x0552 }
            if (r5 == 0) goto L_0x02f6
            java.math.BigInteger r6 = new java.math.BigInteger     // Catch:{ all -> 0x0552 }
            actb r13 = r3.b     // Catch:{ all -> 0x0552 }
            int r13 = r13.o     // Catch:{ all -> 0x0552 }
            r6.<init>(r5, r13)     // Catch:{ all -> 0x0552 }
            int r5 = r6.intValue()     // Catch:{ all -> 0x0552 }
            long r5 = (long) r5     // Catch:{ all -> 0x0552 }
            boolean r13 = r4.c     // Catch:{ all -> 0x0552 }
            if (r13 != 0) goto L_0x02e3
            goto L_0x02e8
        L_0x02e3:
            r4.c()     // Catch:{ all -> 0x0552 }
            r4.c = r8     // Catch:{ all -> 0x0552 }
        L_0x02e8:
            aucj r13 = r4.b     // Catch:{ all -> 0x0552 }
            anup r13 = (defpackage.anup) r13     // Catch:{ all -> 0x0552 }
            int r15 = r13.a     // Catch:{ all -> 0x0552 }
            r17 = 4
            r15 = r15 | 4
            r13.a = r15     // Catch:{ all -> 0x0552 }
            r13.f = r5     // Catch:{ all -> 0x0552 }
        L_0x02f6:
            java.lang.String r5 = "uid"
            java.lang.String r5 = r14.b(r5)     // Catch:{ all -> 0x0552 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x0552 }
            android.content.pm.PackageManager r6 = r3.a     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x0308
            r20 = r9
            goto L_0x03fd
        L_0x0308:
            java.lang.String[] r6 = r6.getPackagesForUid(r5)     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x0312
            r20 = r9
            goto L_0x03d7
        L_0x0312:
            int r13 = r6.length     // Catch:{ all -> 0x0552 }
            r14 = 0
        L_0x0314:
            if (r14 >= r13) goto L_0x03d5
            r15 = r6[r14]     // Catch:{ all -> 0x0552 }
            anuo r17 = defpackage.anuo.d     // Catch:{ all -> 0x0552 }
            aucd r7 = r17.o()     // Catch:{ all -> 0x0552 }
            boolean r8 = r7.c     // Catch:{ all -> 0x0552 }
            if (r8 != 0) goto L_0x0323
            goto L_0x0329
        L_0x0323:
            r7.c()     // Catch:{ all -> 0x0552 }
            r8 = 0
            r7.c = r8     // Catch:{ all -> 0x0552 }
        L_0x0329:
            aucj r8 = r7.b     // Catch:{ all -> 0x0552 }
            anuo r8 = (defpackage.anuo) r8     // Catch:{ all -> 0x0552 }
            r15.getClass()     // Catch:{ all -> 0x0552 }
            r19 = r6
            int r6 = r8.a     // Catch:{ all -> 0x0552 }
            r18 = 1
            r6 = r6 | 1
            r8.a = r6     // Catch:{ all -> 0x0552 }
            r8.b = r15     // Catch:{ all -> 0x0552 }
            android.content.pm.PackageManager r6 = r3.a     // Catch:{ NameNotFoundException -> 0x0363 }
            r8 = 0
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r15, r8)     // Catch:{ NameNotFoundException -> 0x0363 }
            int r6 = r6.versionCode     // Catch:{ NameNotFoundException -> 0x0363 }
            boolean r8 = r7.c     // Catch:{ NameNotFoundException -> 0x0363 }
            if (r8 != 0) goto L_0x034a
            goto L_0x0350
        L_0x034a:
            r7.c()     // Catch:{ NameNotFoundException -> 0x0363 }
            r8 = 0
            r7.c = r8     // Catch:{ NameNotFoundException -> 0x0363 }
        L_0x0350:
            aucj r8 = r7.b     // Catch:{ NameNotFoundException -> 0x0363 }
            anuo r8 = (defpackage.anuo) r8     // Catch:{ NameNotFoundException -> 0x0363 }
            r20 = r9
            int r9 = r8.a     // Catch:{ NameNotFoundException -> 0x0361 }
            r16 = 2
            r9 = r9 | 2
            r8.a = r9     // Catch:{ NameNotFoundException -> 0x0361 }
            r8.c = r6     // Catch:{ NameNotFoundException -> 0x0361 }
            goto L_0x039c
        L_0x0361:
            r0 = move-exception
            goto L_0x0366
        L_0x0363:
            r0 = move-exception
            r20 = r9
        L_0x0366:
            r6 = r0
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0552 }
            java.lang.String r8 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0552 }
            int r8 = r8.length()     // Catch:{ all -> 0x0552 }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0552 }
            int r9 = r9.length()     // Catch:{ all -> 0x0552 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0552 }
            int r8 = r8 + 20
            int r8 = r8 + r9
            r11.<init>(r8)     // Catch:{ all -> 0x0552 }
            java.lang.String r8 = "Package "
            r11.append(r8)     // Catch:{ all -> 0x0552 }
            r11.append(r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r8 = " not found: "
            r11.append(r8)     // Catch:{ all -> 0x0552 }
            r11.append(r6)     // Catch:{ all -> 0x0552 }
            java.lang.String r6 = "NetstatsParser"
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x0552 }
            android.util.Log.w(r6, r8)     // Catch:{ all -> 0x0552 }
        L_0x039c:
            boolean r6 = r4.c     // Catch:{ all -> 0x0552 }
            if (r6 != 0) goto L_0x03a1
            goto L_0x03a7
        L_0x03a1:
            r4.c()     // Catch:{ all -> 0x0552 }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0552 }
        L_0x03a7:
            aucj r6 = r4.b     // Catch:{ all -> 0x0552 }
            anup r6 = (defpackage.anup) r6     // Catch:{ all -> 0x0552 }
            aucj r7 = r7.i()     // Catch:{ all -> 0x0552 }
            anuo r7 = (defpackage.anuo) r7     // Catch:{ all -> 0x0552 }
            r7.getClass()     // Catch:{ all -> 0x0552 }
            aucx r8 = r6.c     // Catch:{ all -> 0x0552 }
            boolean r8 = r8.a()     // Catch:{ all -> 0x0552 }
            if (r8 != 0) goto L_0x03c4
            aucx r8 = r6.c     // Catch:{ all -> 0x0552 }
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)     // Catch:{ all -> 0x0552 }
            r6.c = r8     // Catch:{ all -> 0x0552 }
        L_0x03c4:
            aucx r6 = r6.c     // Catch:{ all -> 0x0552 }
            r6.add(r7)     // Catch:{ all -> 0x0552 }
            int r14 = r14 + 1
            r11 = r23
            r6 = r19
            r9 = r20
            r7 = 1
            r8 = 0
            goto L_0x0314
        L_0x03d5:
            r20 = r9
        L_0x03d7:
            android.content.pm.PackageManager r6 = r3.a     // Catch:{ all -> 0x0552 }
            java.lang.String r6 = r6.getNameForUid(r5)     // Catch:{ all -> 0x0552 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0552 }
            if (r7 != 0) goto L_0x03fd
            boolean r7 = r4.c     // Catch:{ all -> 0x0552 }
            if (r7 != 0) goto L_0x03e8
            goto L_0x03ee
        L_0x03e8:
            r4.c()     // Catch:{ all -> 0x0552 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0552 }
        L_0x03ee:
            aucj r7 = r4.b     // Catch:{ all -> 0x0552 }
            anup r7 = (defpackage.anup) r7     // Catch:{ all -> 0x0552 }
            r6.getClass()     // Catch:{ all -> 0x0552 }
            int r8 = r7.a     // Catch:{ all -> 0x0552 }
            r9 = 1
            r8 = r8 | r9
            r7.a = r8     // Catch:{ all -> 0x0552 }
            r7.d = r6     // Catch:{ all -> 0x0552 }
        L_0x03fd:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0552 }
            aucj r4 = r4.i()     // Catch:{ all -> 0x0552 }
            anup r4 = (defpackage.anup) r4     // Catch:{ all -> 0x0552 }
            android.util.Pair r4 = android.util.Pair.create(r5, r4)     // Catch:{ all -> 0x0552 }
            r10.e = r4     // Catch:{ all -> 0x0552 }
            r11 = r23
            r9 = r20
            r7 = 1
            r8 = 0
            goto L_0x0021
        L_0x0415:
            r20 = r9
            anus r7 = defpackage.anus.f     // Catch:{ all -> 0x0552 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x0552 }
            java.lang.String r8 = "type"
            java.lang.String r8 = r5.b(r8)     // Catch:{ all -> 0x0552 }
            boolean r9 = r7.c     // Catch:{ all -> 0x0552 }
            if (r9 != 0) goto L_0x0428
            goto L_0x042e
        L_0x0428:
            r7.c()     // Catch:{ all -> 0x0552 }
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x0552 }
        L_0x042e:
            aucj r9 = r7.b     // Catch:{ all -> 0x0552 }
            anus r9 = (defpackage.anus) r9     // Catch:{ all -> 0x0552 }
            r8.getClass()     // Catch:{ all -> 0x0552 }
            int r11 = r9.a     // Catch:{ all -> 0x0552 }
            r13 = 2
            r11 = r11 | r13
            r9.a = r11     // Catch:{ all -> 0x0552 }
            r9.b = r8     // Catch:{ all -> 0x0552 }
            java.lang.String r8 = "subtype"
            java.lang.String r8 = r5.b(r8)     // Catch:{ all -> 0x0552 }
            if (r8 != 0) goto L_0x0446
            goto L_0x0460
        L_0x0446:
            boolean r9 = r7.c     // Catch:{ all -> 0x0552 }
            if (r9 != 0) goto L_0x044b
            goto L_0x0451
        L_0x044b:
            r7.c()     // Catch:{ all -> 0x0552 }
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x0552 }
        L_0x0451:
            aucj r9 = r7.b     // Catch:{ all -> 0x0552 }
            anus r9 = (defpackage.anus) r9     // Catch:{ all -> 0x0552 }
            r8.getClass()     // Catch:{ all -> 0x0552 }
            int r11 = r9.a     // Catch:{ all -> 0x0552 }
            r11 = r11 | 8
            r9.a = r11     // Catch:{ all -> 0x0552 }
            r9.c = r8     // Catch:{ all -> 0x0552 }
        L_0x0460:
            java.lang.String r8 = "subscriberId"
            java.lang.String r8 = r5.b(r8)     // Catch:{ all -> 0x0552 }
            if (r8 == 0) goto L_0x0490
            r9 = 6
            int r11 = r8.length()     // Catch:{ all -> 0x0552 }
            int r9 = java.lang.Math.min(r9, r11)     // Catch:{ all -> 0x0552 }
            r11 = 0
            java.lang.String r8 = r8.substring(r11, r9)     // Catch:{ all -> 0x0552 }
            boolean r9 = r7.c     // Catch:{ all -> 0x0552 }
            if (r9 != 0) goto L_0x047b
            goto L_0x0481
        L_0x047b:
            r7.c()     // Catch:{ all -> 0x0552 }
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x0552 }
        L_0x0481:
            aucj r9 = r7.b     // Catch:{ all -> 0x0552 }
            anus r9 = (defpackage.anus) r9     // Catch:{ all -> 0x0552 }
            r8.getClass()     // Catch:{ all -> 0x0552 }
            int r11 = r9.a     // Catch:{ all -> 0x0552 }
            r11 = r11 | 16
            r9.a = r11     // Catch:{ all -> 0x0552 }
            r9.d = r8     // Catch:{ all -> 0x0552 }
        L_0x0490:
            java.lang.String r8 = "roaming"
            java.lang.String r8 = r5.b(r8)     // Catch:{ all -> 0x0552 }
            if (r8 != 0) goto L_0x0499
            goto L_0x04b1
        L_0x0499:
            boolean r8 = r7.c     // Catch:{ all -> 0x0552 }
            if (r8 != 0) goto L_0x049e
            goto L_0x04a4
        L_0x049e:
            r7.c()     // Catch:{ all -> 0x0552 }
            r8 = 0
            r7.c = r8     // Catch:{ all -> 0x0552 }
        L_0x04a4:
            aucj r8 = r7.b     // Catch:{ all -> 0x0552 }
            anus r8 = (defpackage.anus) r8     // Catch:{ all -> 0x0552 }
            int r9 = r8.a     // Catch:{ all -> 0x0552 }
            r9 = r9 | 32
            r8.a = r9     // Catch:{ all -> 0x0552 }
            r9 = 1
            r8.e = r9     // Catch:{ all -> 0x0552 }
        L_0x04b1:
            aucj r7 = r7.i()     // Catch:{ all -> 0x0552 }
            anus r7 = (defpackage.anus) r7     // Catch:{ all -> 0x0552 }
            r6.add(r7)     // Catch:{ all -> 0x0552 }
            r11 = r23
            r9 = r20
            r7 = 1
            r8 = 0
            goto L_0x01d2
        L_0x04c2:
            monitor-exit(r12)     // Catch:{ all -> 0x0552 }
            r10.b()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            anuu r3 = defpackage.anuu.e     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            aucd r3 = r3.o()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            java.util.List r4 = r10.a     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            int r4 = r4.size()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r5 = 0
        L_0x04d3:
            if (r5 >= r4) goto L_0x050b
            java.util.List r6 = r10.a     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            java.lang.Object r6 = r6.second     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            anuq r6 = (defpackage.anuq) r6     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            boolean r7 = r3.c     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            if (r7 != 0) goto L_0x04e6
            goto L_0x04ec
        L_0x04e6:
            r3.c()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r7 = 0
            r3.c = r7     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
        L_0x04ec:
            aucj r7 = r3.b     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            anuu r7 = (defpackage.anuu) r7     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r6.getClass()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            aucx r8 = r7.b     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            boolean r8 = r8.a()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            if (r8 != 0) goto L_0x0503
            aucx r8 = r7.b     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r7.b = r8     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
        L_0x0503:
            aucx r7 = r7.b     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r7.add(r6)     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            int r5 = r5 + 1
            goto L_0x04d3
        L_0x050b:
            java.util.List r4 = r10.b     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            int r4 = r4.size()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r5 = 0
        L_0x0512:
            if (r5 >= r4) goto L_0x054a
            java.util.List r6 = r10.b     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            java.lang.Object r6 = r6.second     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            anuq r6 = (defpackage.anuq) r6     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            boolean r7 = r3.c     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            if (r7 != 0) goto L_0x0525
            goto L_0x052b
        L_0x0525:
            r3.c()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r7 = 0
            r3.c = r7     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
        L_0x052b:
            aucj r7 = r3.b     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            anuu r7 = (defpackage.anuu) r7     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r6.getClass()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            aucx r8 = r7.c     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            boolean r8 = r8.a()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            if (r8 != 0) goto L_0x0542
            aucx r8 = r7.c     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r7.c = r8     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
        L_0x0542:
            aucx r7 = r7.c     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            r7.add(r6)     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            int r5 = r5 + 1
            goto L_0x0512
        L_0x054a:
            aucj r3 = r3.i()     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            anuu r3 = (defpackage.anuu) r3     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
            goto L_0x05d9
        L_0x0552:
            r0 = move-exception
            r3 = r0
            monitor-exit(r12)     // Catch:{ all -> 0x0552 }
            throw r3     // Catch:{ IOException -> 0x05ae, NumberFormatException -> 0x0583, Exception -> 0x0556 }
        L_0x0556:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = "NetstatsParser"
            java.lang.String r5 = "Unexpected Exception"
            android.util.Log.e(r4, r5, r3)
            anuu r3 = defpackage.anuu.e
            aucd r3 = r3.o()
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x056f
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x056f:
            aucj r4 = r3.b
            anuu r4 = (defpackage.anuu) r4
            r5 = 1
            r4.d = r5
            int r5 = r4.a
            r6 = 4
            r5 = r5 | r6
            r4.a = r5
            aucj r3 = r3.i()
            anuu r3 = (defpackage.anuu) r3
            goto L_0x05d9
        L_0x0583:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = "NetstatsParser"
            android.util.Log.w(r4, r3)
            anuu r3 = defpackage.anuu.e
            aucd r3 = r3.o()
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x0595
            goto L_0x059b
        L_0x0595:
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x059b:
            aucj r4 = r3.b
            anuu r4 = (defpackage.anuu) r4
            r5 = 4
            r4.d = r5
            int r6 = r4.a
            r5 = r5 | r6
            r4.a = r5
            aucj r3 = r3.i()
            anuu r3 = (defpackage.anuu) r3
            goto L_0x05d9
        L_0x05ae:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = "NetstatsParser"
            android.util.Log.w(r4, r3)
            anuu r3 = defpackage.anuu.e
            aucd r3 = r3.o()
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x05c0
            goto L_0x05c6
        L_0x05c0:
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x05c6:
            aucj r4 = r3.b
            anuu r4 = (defpackage.anuu) r4
            r5 = 3
            r4.d = r5
            int r5 = r4.a
            r6 = 4
            r5 = r5 | r6
            r4.a = r5
            aucj r3 = r3.i()
            anuu r3 = (defpackage.anuu) r3
        L_0x05d9:
            avwc r4 = defpackage.avwc.v
            aucd r4 = r4.o()
            avvz r4 = (defpackage.avvz) r4
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x05e6
            goto L_0x05ec
        L_0x05e6:
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x05ec:
            aucj r5 = r4.b
            avwc r5 = (defpackage.avwc) r5
            int r6 = r5.a
            r7 = 1
            r6 = r6 | r7
            r5.a = r6
            r5.d = r1
            r1 = 2
            r1 = r1 | r6
            r5.a = r1
            r6 = r26
            r5.e = r6
            r3.getClass()
            r5.s = r3
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r5.a = r1
            aucj r1 = r4.i()
            avwc r1 = (defpackage.avwc) r1
            defpackage.jjt.a((java.io.Closeable) r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsw.b(android.content.Context, java.io.InputStream, long, long, hph):avwc");
    }

    public final long c() {
        return aznn.a.a().g();
    }

    public final long d() {
        return aznn.a.a().f();
    }

    public final boolean b() {
        return azms.a.a().h();
    }
}
