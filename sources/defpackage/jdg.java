package defpackage;

/* renamed from: jdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jdg implements jje {
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0211 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e8 A[Catch:{ IllegalArgumentException -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e9 A[Catch:{ IllegalArgumentException -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0208 A[Catch:{ IllegalArgumentException -> 0x0346 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.trim()
            java.lang.String r2 = "\t"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            java.lang.String r4 = "StatsUploader"
            r5 = 7
            if (r2 >= r5) goto L_0x0030
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Invaid data: "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0026
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x002a
        L_0x0026:
            java.lang.String r0 = r1.concat(r0)
        L_0x002a:
            android.util.Log.w(r4, r0)
            r3 = 0
            goto L_0x0348
        L_0x0030:
            aoia r0 = defpackage.aoia.o
            aucd r2 = r0.o()
            r6 = 0
            r0 = r1[r6]     // Catch:{ IllegalArgumentException -> 0x0346 }
            long r7 = java.lang.Long.parseLong(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x0042
            goto L_0x0047
        L_0x0042:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r2.c = r6     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0047:
            aucj r0 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r0 = (defpackage.aoia) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r9 = r0.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r10 = 1
            r9 = r9 | r10
            r0.a = r9     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.b = r7     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0 = r1[r10]     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            android.content.pm.PackageManager r7 = defpackage.jdk.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r8 = 3
            r9 = 16
            r11 = 4
            r12 = 5
            r13 = 8
            r14 = 2
            if (r0 == r9) goto L_0x0092
            switch(r0) {
                case 7: goto L_0x0090;
                case 8: goto L_0x008e;
                case 9: goto L_0x008c;
                case 10: goto L_0x008a;
                case 11: goto L_0x0088;
                case 12: goto L_0x0086;
                default: goto L_0x0068;
            }     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0068:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0346 }
            r2 = 36
            r1.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r2 = "Wrong WakeLockEventType: "
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0346 }
            android.util.Log.e(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r1 = "Wrong WakeLockEventType"
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0346 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0086:
            r0 = 7
            goto L_0x0094
        L_0x0088:
            r0 = 6
            goto L_0x0094
        L_0x008a:
            r0 = 5
            goto L_0x0094
        L_0x008c:
            r0 = 4
            goto L_0x0094
        L_0x008e:
            r0 = 3
            goto L_0x0094
        L_0x0090:
            r0 = 2
            goto L_0x0094
        L_0x0092:
            r0 = 8
        L_0x0094:
            boolean r15 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r15 != 0) goto L_0x0099
            goto L_0x009e
        L_0x0099:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r2.c = r6     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x009e:
            aucj r15 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r15 = (defpackage.aoia) r15     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3 = -1
            int r0 = r0 + r3
            r15.c = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r0 = r15.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0 = r0 | r14
            r15.a = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0 = r1[r14]     // Catch:{ IllegalArgumentException -> 0x0346 }
            r15 = r4
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x00b7
            goto L_0x00bc
        L_0x00b7:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r2.c = r6     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x00bc:
            aucj r0 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r0 = (defpackage.aoia) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r9 = r0.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r9 = r9 | r11
            r0.a = r9     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.d = r3     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3 = r1[r8]     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.getClass()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4 = r9 | 8
            r0.a = r4     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.e = r3     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0 = r1[r11]     // Catch:{ IllegalArgumentException -> 0x0346 }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x00dd
            goto L_0x00e2
        L_0x00dd:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r2.c = r6     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x00e2:
            aucj r0 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r0 = (defpackage.aoia) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r8 = r0.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r8 = r8 | 64
            r0.a = r8     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.h = r3     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0 = r1[r12]     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x027b
            agvx r0 = defpackage.jcf.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.Object r0 = r0.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r3 = ","
            if (r0 != 0) goto L_0x0108
            goto L_0x024b
        L_0x0108:
            r0 = r1[r12]     // Catch:{ IllegalArgumentException -> 0x0346 }
            aucj r4 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r4 = (defpackage.aoia) r4     // Catch:{ IllegalArgumentException -> 0x0346 }
            long r8 = r4.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0346 }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String[] r13 = android.text.TextUtils.split(r0, r3)     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r5 = r13.length     // Catch:{ IllegalArgumentException -> 0x0346 }
            r7 = 0
        L_0x0121:
            if (r7 >= r5) goto L_0x0226
            r12 = r13[r7]     // Catch:{ IllegalArgumentException -> 0x0346 }
            aohz r0 = defpackage.aohz.d     // Catch:{ IllegalArgumentException -> 0x0346 }
            aucd r14 = r0.o()     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = r14.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x0130
            goto L_0x0135
        L_0x0130:
            r14.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r14.c = r6     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0135:
            aucj r0 = r14.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aohz r0 = (defpackage.aohz) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            r12.getClass()     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r6 = r0.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r6 = r6 | r10
            r0.a = r6     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.b = r12     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.Object r0 = r4.get(r12)     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r4.get(r12)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r6 = r14.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r6 != 0) goto L_0x0158
            goto L_0x015e
        L_0x0158:
            r14.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r6 = 0
            r14.c = r6     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x015e:
            aucj r6 = r14.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aohz r6 = (defpackage.aohz) r6     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r12 = r6.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r17 = 2
            r12 = r12 | 2
            r6.a = r12     // Catch:{ IllegalArgumentException -> 0x0346 }
            r6.c = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            r18 = r11
            r10 = r15
            r11 = -1
            r16 = 2
            goto L_0x0211
        L_0x0174:
            android.content.pm.PackageManager r0 = defpackage.jdk.a     // Catch:{ NameNotFoundException -> 0x01be }
            r6 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r6)     // Catch:{ NameNotFoundException -> 0x01be }
            r18 = r11
            long r10 = r0.lastUpdateTime     // Catch:{ NameNotFoundException -> 0x01bc }
            int r19 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r19 <= 0) goto L_0x019e
            boolean r0 = r14.c     // Catch:{ NameNotFoundException -> 0x01bc }
            if (r0 != 0) goto L_0x0188
            goto L_0x018e
        L_0x0188:
            r14.c()     // Catch:{ NameNotFoundException -> 0x01bc }
            r10 = 0
            r14.c = r10     // Catch:{ NameNotFoundException -> 0x01bc }
        L_0x018e:
            aucj r0 = r14.b     // Catch:{ NameNotFoundException -> 0x01bc }
            aohz r0 = (defpackage.aohz) r0     // Catch:{ NameNotFoundException -> 0x01bc }
            int r10 = r0.a     // Catch:{ NameNotFoundException -> 0x01bc }
            r11 = 2
            r10 = r10 | r11
            r0.a = r10     // Catch:{ NameNotFoundException -> 0x01bc }
            r10 = -2
            r0.c = r10     // Catch:{ NameNotFoundException -> 0x01bc }
            r10 = r15
            r11 = -1
            goto L_0x01fc
        L_0x019e:
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x01bc }
            boolean r10 = r14.c     // Catch:{ NameNotFoundException -> 0x01bc }
            if (r10 != 0) goto L_0x01a5
            goto L_0x01ab
        L_0x01a5:
            r14.c()     // Catch:{ NameNotFoundException -> 0x01bc }
            r10 = 0
            r14.c = r10     // Catch:{ NameNotFoundException -> 0x01bc }
        L_0x01ab:
            aucj r10 = r14.b     // Catch:{ NameNotFoundException -> 0x01bc }
            aohz r10 = (defpackage.aohz) r10     // Catch:{ NameNotFoundException -> 0x01bc }
            int r11 = r10.a     // Catch:{ NameNotFoundException -> 0x01bc }
            r17 = 2
            r11 = r11 | 2
            r10.a = r11     // Catch:{ NameNotFoundException -> 0x01bc }
            r10.c = r0     // Catch:{ NameNotFoundException -> 0x01bc }
            r10 = r15
            r11 = -1
            goto L_0x01fc
        L_0x01bc:
            r0 = move-exception
            goto L_0x01c1
        L_0x01be:
            r0 = move-exception
            r18 = r11
        L_0x01c1:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r10 = r10.length()     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r10 = r10 + 34
            r11.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r10 = "Package not found at upload time: "
            r11.append(r10)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String r0 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r10 = r15
            android.util.Log.w(r10, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = r14.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x01e9
            goto L_0x01ef
        L_0x01e9:
            r14.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r11 = 0
            r14.c = r11     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x01ef:
            aucj r0 = r14.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aohz r0 = (defpackage.aohz) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r11 = r0.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r15 = 2
            r11 = r11 | r15
            r0.a = r11     // Catch:{ IllegalArgumentException -> 0x0346 }
            r11 = -1
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x01fc:
            aucj r0 = r14.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aohz r0 = (defpackage.aohz) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r15 = r0.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r16 = 2
            r15 = r15 & 2
            if (r15 == 0) goto L_0x0211
            int r0 = r0.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4.put(r12, r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0211:
            aucj r0 = r14.i()     // Catch:{ IllegalArgumentException -> 0x0346 }
            aohz r0 = (defpackage.aohz) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            r12 = r18
            r12.add(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r7 = r7 + 1
            r15 = r10
            r11 = r12
            r6 = 0
            r10 = 1
            r12 = 5
            r14 = 2
            goto L_0x0121
        L_0x0226:
            r12 = r11
            boolean r0 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x022c
            goto L_0x0232
        L_0x022c:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4 = 0
            r2.c = r4     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0232:
            aucj r0 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r0 = (defpackage.aoia) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            aucx r4 = r0.j     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r4 = r4.a()     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r4 != 0) goto L_0x0246
            aucx r4 = r0.j     // Catch:{ IllegalArgumentException -> 0x0346 }
            aucx r4 = defpackage.aucj.a((defpackage.aucx) r4)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.j = r4     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0246:
            aucx r0 = r0.j     // Catch:{ IllegalArgumentException -> 0x0346 }
            defpackage.auab.a((java.lang.Iterable) r12, (java.util.List) r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x024b:
            r4 = 5
            r0 = r1[r4]     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r3)     // Catch:{ IllegalArgumentException -> 0x0346 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r3 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r3 != 0) goto L_0x025c
            goto L_0x0262
        L_0x025c:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3 = 0
            r2.c = r3     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0262:
            aucj r3 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r3 = (defpackage.aoia) r3     // Catch:{ IllegalArgumentException -> 0x0346 }
            aucx r4 = r3.i     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r4 = r4.a()     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r4 != 0) goto L_0x0276
            aucx r4 = r3.i     // Catch:{ IllegalArgumentException -> 0x0346 }
            aucx r4 = defpackage.aucj.a((defpackage.aucx) r4)     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3.i = r4     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0276:
            aucx r3 = r3.i     // Catch:{ IllegalArgumentException -> 0x0346 }
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r3)     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x027b:
            r3 = 6
            r0 = r1[r3]     // Catch:{ IllegalArgumentException -> 0x0346 }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x0288
            goto L_0x028e
        L_0x0288:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r5 = 0
            r2.c = r5     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x028e:
            aucj r0 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r0 = (defpackage.aoia) r0     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r5 = r0.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r5 = r5 | 512(0x200, float:7.175E-43)
            r0.a = r5     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.l = r3     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r3 = r1.length     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4 = 7
            if (r3 <= r4) goto L_0x02aa
            r4 = r1[r4]     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4.getClass()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r6 = 16
            r5 = r5 | r6
            r0.a = r5     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.f = r4     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x02aa:
            r4 = 8
            if (r3 <= r4) goto L_0x02d2
            r0 = r1[r4]     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r0 != 0) goto L_0x02d2
            r0 = r1[r4]     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r4 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r4 != 0) goto L_0x02bd
            goto L_0x02c3
        L_0x02bd:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4 = 0
            r2.c = r4     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x02c3:
            aucj r4 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r4 = (defpackage.aoia) r4     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r5 = r4.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r5 = r5 | 256(0x100, float:3.59E-43)
            r4.a = r5     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4.k = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x02d2:
            r0 = 9
            if (r3 <= r0) goto L_0x02f3
            r0 = r1[r0]     // Catch:{ IllegalArgumentException -> 0x0346 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r4 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r4 != 0) goto L_0x02e1
            goto L_0x02e7
        L_0x02e1:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4 = 0
            r2.c = r4     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x02e7:
            aucj r4 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r4 = (defpackage.aoia) r4     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r5 = r4.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r4.a = r5     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4.m = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x02f3:
            r0 = 10
            if (r3 <= r0) goto L_0x031b
            r4 = r1[r0]     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r4 != 0) goto L_0x031b
            r0 = r1[r0]     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r4 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r4 != 0) goto L_0x0306
            goto L_0x030c
        L_0x0306:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4 = 0
            r2.c = r4     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x030c:
            aucj r4 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r4 = (defpackage.aoia) r4     // Catch:{ IllegalArgumentException -> 0x0346 }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r5 = r4.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r5 = r5 | 32
            r4.a = r5     // Catch:{ IllegalArgumentException -> 0x0346 }
            r4.g = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x031b:
            r0 = 11
            if (r3 > r0) goto L_0x0320
            goto L_0x033e
        L_0x0320:
            r0 = r1[r0]     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IllegalArgumentException -> 0x0346 }
            boolean r1 = r2.c     // Catch:{ IllegalArgumentException -> 0x0346 }
            if (r1 != 0) goto L_0x032c
            goto L_0x0332
        L_0x032c:
            r2.c()     // Catch:{ IllegalArgumentException -> 0x0346 }
            r1 = 0
            r2.c = r1     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x0332:
            aucj r1 = r2.b     // Catch:{ IllegalArgumentException -> 0x0346 }
            aoia r1 = (defpackage.aoia) r1     // Catch:{ IllegalArgumentException -> 0x0346 }
            int r3 = r1.a     // Catch:{ IllegalArgumentException -> 0x0346 }
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r1.a = r3     // Catch:{ IllegalArgumentException -> 0x0346 }
            r1.n = r0     // Catch:{ IllegalArgumentException -> 0x0346 }
        L_0x033e:
            aucj r0 = r2.i()
            r3 = r0
            aoia r3 = (defpackage.aoia) r3
            goto L_0x0348
        L_0x0346:
            r0 = move-exception
            r3 = 0
        L_0x0348:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdg.a(java.lang.Object):java.lang.Object");
    }
}
