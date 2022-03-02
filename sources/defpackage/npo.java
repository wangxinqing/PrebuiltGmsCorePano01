package defpackage;

import android.os.Parcel;
import com.google.android.gms.gass.internal.GassEventParcel;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;

/* renamed from: npo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npo extends bhw implements npp {
    private final noj a;
    private final noa b;

    public npo() {
        super("com.google.android.gms.gass.internal.IGassService");
    }

    private static ProgramResponse a(int i) {
        return new ProgramResponse((byte[]) null, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: nog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: nqc} */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: type inference failed for: r6v31 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02e8 A[Catch:{ noh -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x034c A[Catch:{ noh -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03dd A[SYNTHETIC, Splitter:B:181:0x03dd] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012d A[Catch:{ noh -> 0x013e, all -> 0x013b }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0149 A[Catch:{ noh -> 0x013e, all -> 0x013b }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1 A[Catch:{ noh -> 0x013e, all -> 0x013b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.gass.internal.GassResponseParcel a(com.google.android.gms.gass.internal.GassRequestParcel r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = r0.b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0420
            java.lang.String r1 = r0.c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0014
            goto L_0x0420
        L_0x0014:
            com.google.android.gms.gass.internal.GassResponseParcel r1 = new com.google.android.gms.gass.internal.GassResponseParcel
            ihs r2 = defpackage.ihs.b()
            java.lang.String r3 = r0.b
            java.lang.String r0 = r0.c
            int r4 = android.os.Binder.getCallingUid()
            com.google.ads.afma.proto2api.c r5 = com.google.ads.afma.proto2api.c.Q
            aucd r5 = r5.o()
            axjs r6 = defpackage.axjs.a
            axjt r6 = r6.a()
            boolean r6 = r6.a()
            r7 = -1
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L_0x0102
            ihs r6 = defpackage.ihs.b()
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            int r11 = android.os.Process.myUid()
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            if (r11 == r4) goto L_0x00ea
            java.lang.String[] r4 = r6.getPackagesForUid(r4)
            int r11 = r4.length
            r13 = 0
        L_0x004e:
            if (r13 >= r11) goto L_0x007a
            r14 = r4[r13]
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L_0x0077
            int r4 = r4.length
            if (r4 != r9) goto L_0x005e
            r13 = 1
            goto L_0x0060
        L_0x005e:
            r13 = 2
        L_0x0060:
            boolean r4 = r5.c
            if (r4 != 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            r5.c()
            r5.c = r10
        L_0x006a:
            aucj r4 = r5.b
            com.google.ads.afma.proto2api.c r4 = (com.google.ads.afma.proto2api.c) r4
            int r6 = r4.b
            r6 = r6 | r12
            r4.b = r6
            r4.I = r13
            goto L_0x0103
        L_0x0077:
            int r13 = r13 + 1
            goto L_0x004e
        L_0x007a:
            int r11 = r4.length
            if (r11 != r9) goto L_0x00d2
            r0 = r4[r10]
            boolean r3 = r5.c
            if (r3 == 0) goto L_0x0088
            r5.c()
            r5.c = r10
        L_0x0088:
            aucj r3 = r5.b
            com.google.ads.afma.proto2api.c r3 = (com.google.ads.afma.proto2api.c) r3
            r0.getClass()
            int r4 = r3.b
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.b = r4
            r3.w = r0
            android.content.pm.PackageInfo r0 = r6.getPackageInfo(r0, r10)     // Catch:{ NameNotFoundException -> 0x00a3 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00a3 }
            long r3 = (long) r0     // Catch:{ NameNotFoundException -> 0x00a3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ NameNotFoundException -> 0x00a3 }
            goto L_0x00a8
        L_0x00a3:
            r0 = move-exception
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
        L_0x00a8:
            long r3 = r0.longValue()
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            r5.c()
            r5.c = r10
        L_0x00b6:
            aucj r0 = r5.b
            com.google.ads.afma.proto2api.c r0 = (com.google.ads.afma.proto2api.c) r0
            int r6 = r0.a
            r6 = r6 | r12
            r0.a = r6
            r0.u = r3
            int r6 = r0.b
            r6 = r6 | r12
            r0.b = r6
            r11 = 3
            r0.I = r11
            java.lang.String r0 = r0.w
            java.lang.String r3 = java.lang.Long.toString(r3)
            r4 = r0
            goto L_0x0105
        L_0x00d2:
            boolean r4 = r5.c
            if (r4 != 0) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            r5.c()
            r5.c = r10
        L_0x00dc:
            aucj r4 = r5.b
            com.google.ads.afma.proto2api.c r4 = (com.google.ads.afma.proto2api.c) r4
            int r6 = r4.b
            r6 = r6 | r12
            r4.b = r6
            r11 = 4
            r4.I = r11
            goto L_0x0103
        L_0x00ea:
            boolean r4 = r5.c
            if (r4 != 0) goto L_0x00ef
            goto L_0x00f4
        L_0x00ef:
            r5.c()
            r5.c = r10
        L_0x00f4:
            aucj r4 = r5.b
            com.google.ads.afma.proto2api.c r4 = (com.google.ads.afma.proto2api.c) r4
            int r6 = r4.b
            r6 = r6 | r12
            r4.b = r6
            r11 = 127(0x7f, double:6.27E-322)
            r4.I = r11
            goto L_0x0103
        L_0x0102:
        L_0x0103:
            r4 = r3
            r3 = r0
        L_0x0105:
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            r5.c()
            r5.c = r10
        L_0x010f:
            aucj r0 = r5.b
            com.google.ads.afma.proto2api.c r0 = (com.google.ads.afma.proto2api.c) r0
            int r6 = r0.b
            r11 = 1048576(0x100000, float:1.469368E-39)
            r6 = r6 | r11
            r0.b = r6
            r11 = 201216073(0xbfe5049, double:9.9413949E-316)
            r0.D = r11
            r6 = 0
            nog r11 = defpackage.nog.a(r2)     // Catch:{ all -> 0x0419 }
            r12 = 2
            nnx r0 = r11.a     // Catch:{ noh -> 0x013e }
            nqc r0 = r0.b(r4, r3)     // Catch:{ noh -> 0x013e }
            if (r0 == 0) goto L_0x013a
            r13 = 3
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ noh -> 0x013e }
            r13[r10] = r4     // Catch:{ noh -> 0x013e }
            r13[r9] = r3     // Catch:{ noh -> 0x013e }
            java.lang.String r14 = r0.e     // Catch:{ noh -> 0x013e }
            r13[r12] = r14     // Catch:{ noh -> 0x013e }
            r6 = r0
            goto L_0x0145
        L_0x013a:
            goto L_0x0145
        L_0x013b:
            r0 = move-exception
            goto L_0x0417
        L_0x013e:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x013b }
            r0[r10] = r4     // Catch:{ all -> 0x013b }
            r0[r9] = r3     // Catch:{ all -> 0x013b }
        L_0x0145:
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r6 != 0) goto L_0x01a1
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x013b }
            r6[r10] = r4     // Catch:{ all -> 0x013b }
            r6[r9] = r3     // Catch:{ all -> 0x013b }
            nqg r3 = defpackage.nqg.c     // Catch:{ all -> 0x013b }
            aucd r3 = r3.o()     // Catch:{ all -> 0x013b }
            if (r4 != 0) goto L_0x0158
            goto L_0x0171
        L_0x0158:
            boolean r6 = r3.c     // Catch:{ all -> 0x013b }
            if (r6 != 0) goto L_0x015d
        L_0x015c:
            goto L_0x0163
        L_0x015d:
            r3.c()     // Catch:{ all -> 0x013b }
            r3.c = r10     // Catch:{ all -> 0x013b }
            goto L_0x015c
        L_0x0163:
            aucj r6 = r3.b     // Catch:{ all -> 0x013b }
            nqg r6 = (defpackage.nqg) r6     // Catch:{ all -> 0x013b }
            r4.getClass()     // Catch:{ all -> 0x013b }
            int r13 = r6.a     // Catch:{ all -> 0x013b }
            r13 = r13 | r9
            r6.a = r13     // Catch:{ all -> 0x013b }
            r6.b = r4     // Catch:{ all -> 0x013b }
        L_0x0171:
            aucj r3 = r3.i()     // Catch:{ all -> 0x013b }
            nqg r3 = (defpackage.nqg) r3     // Catch:{ all -> 0x013b }
            byte[] r3 = r3.k()     // Catch:{ all -> 0x013b }
            nqf r3 = defpackage.nol.a((int) r12, (byte[]) r3)     // Catch:{ all -> 0x013b }
            defpackage.nol.a((android.content.Context) r2, (defpackage.nqf) r3)     // Catch:{ all -> 0x013b }
            java.lang.String r3 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r6 = r5.c     // Catch:{ all -> 0x013b }
            if (r6 != 0) goto L_0x018a
            goto L_0x018f
        L_0x018a:
            r5.c()     // Catch:{ all -> 0x013b }
            r5.c = r10     // Catch:{ all -> 0x013b }
        L_0x018f:
            aucj r6 = r5.b     // Catch:{ all -> 0x013b }
            com.google.ads.afma.proto2api.c r6 = (com.google.ads.afma.proto2api.c) r6     // Catch:{ all -> 0x013b }
            r3.getClass()     // Catch:{ all -> 0x013b }
            int r13 = r6.a     // Catch:{ all -> 0x013b }
            r0 = r0 | r13
            r6.a = r0     // Catch:{ all -> 0x013b }
            r6.o = r3     // Catch:{ all -> 0x013b }
            r17 = r4
            goto L_0x02c2
        L_0x01a1:
            java.lang.String r3 = r6.e     // Catch:{ all -> 0x013b }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x013b }
            if (r3 != 0) goto L_0x01c3
            java.lang.String r3 = r6.e     // Catch:{ all -> 0x013b }
            boolean r13 = r5.c     // Catch:{ all -> 0x013b }
            if (r13 != 0) goto L_0x01b0
            goto L_0x01b5
        L_0x01b0:
            r5.c()     // Catch:{ all -> 0x013b }
            r5.c = r10     // Catch:{ all -> 0x013b }
        L_0x01b5:
            aucj r13 = r5.b     // Catch:{ all -> 0x013b }
            com.google.ads.afma.proto2api.c r13 = (com.google.ads.afma.proto2api.c) r13     // Catch:{ all -> 0x013b }
            r3.getClass()     // Catch:{ all -> 0x013b }
            int r14 = r13.a     // Catch:{ all -> 0x013b }
            r0 = r0 | r14
            r13.a = r0     // Catch:{ all -> 0x013b }
            r13.o = r3     // Catch:{ all -> 0x013b }
        L_0x01c3:
            boolean r0 = defpackage.axjd.b()     // Catch:{ all -> 0x013b }
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != 0) goto L_0x01cc
        L_0x01cb:
            goto L_0x01ee
        L_0x01cc:
            java.lang.String r0 = r6.f     // Catch:{ all -> 0x013b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x013b }
            if (r0 != 0) goto L_0x01cb
            java.lang.String r0 = r6.f     // Catch:{ all -> 0x013b }
            boolean r6 = r5.c     // Catch:{ all -> 0x013b }
            if (r6 != 0) goto L_0x01db
            goto L_0x01e0
        L_0x01db:
            r5.c()     // Catch:{ all -> 0x013b }
            r5.c = r10     // Catch:{ all -> 0x013b }
        L_0x01e0:
            aucj r6 = r5.b     // Catch:{ all -> 0x013b }
            com.google.ads.afma.proto2api.c r6 = (com.google.ads.afma.proto2api.c) r6     // Catch:{ all -> 0x013b }
            r0.getClass()     // Catch:{ all -> 0x013b }
            int r13 = r6.a     // Catch:{ all -> 0x013b }
            r13 = r13 | r3
            r6.a = r13     // Catch:{ all -> 0x013b }
            r6.p = r0     // Catch:{ all -> 0x013b }
        L_0x01ee:
            axjg r0 = defpackage.axjg.a     // Catch:{ all -> 0x013b }
            axjh r0 = r0.a()     // Catch:{ all -> 0x013b }
            boolean r0 = r0.a()     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x02c0
            nok r0 = new nok     // Catch:{ all -> 0x013b }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x013b }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x013b }
            java.lang.String r6 = r0.c     // Catch:{ all -> 0x013b }
            if (r6 == 0) goto L_0x02bd
            android.content.Context r6 = r0.b     // Catch:{ all -> 0x013b }
            java.lang.String r13 = "usagestats"
            java.lang.Object r6 = r6.getSystemService(r13)     // Catch:{ all -> 0x013b }
            android.app.usage.UsageStatsManager r6 = (android.app.usage.UsageStatsManager) r6     // Catch:{ all -> 0x013b }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x013b }
            axjg r15 = defpackage.axjg.a     // Catch:{ all -> 0x013b }
            axjh r15 = r15.a()     // Catch:{ all -> 0x013b }
            long r15 = r15.h()     // Catch:{ all -> 0x013b }
            long r17 = defpackage.nok.a     // Catch:{ all -> 0x013b }
            java.lang.Long.signum(r15)
            long r15 = r15 * r17
            r17 = r4
            long r3 = r13 - r15
            android.app.usage.UsageEvents r6 = r6.queryEvents(r3, r13)     // Catch:{ all -> 0x013b }
            android.app.usage.UsageEvents$Event r15 = new android.app.usage.UsageEvents$Event     // Catch:{ all -> 0x013b }
            r15.<init>()     // Catch:{ all -> 0x013b }
            r18 = r7
            r20 = r18
        L_0x0235:
            boolean r16 = r6.getNextEvent(r15)     // Catch:{ all -> 0x013b }
            if (r16 == 0) goto L_0x0277
            java.lang.String r10 = r15.getPackageName()     // Catch:{ all -> 0x013b }
            java.lang.String r7 = r0.c     // Catch:{ all -> 0x013b }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x013b }
            if (r7 == 0) goto L_0x0273
            int r7 = r15.getEventType()     // Catch:{ all -> 0x013b }
            if (r7 != r9) goto L_0x025d
            long r7 = r15.getTimeStamp()     // Catch:{ all -> 0x013b }
            int r10 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x025d
            long r20 = r15.getTimeStamp()     // Catch:{ all -> 0x013b }
            r7 = -1
            r10 = 0
            goto L_0x0235
        L_0x025d:
            int r7 = r15.getEventType()     // Catch:{ all -> 0x013b }
            if (r7 != r12) goto L_0x0273
            long r7 = r15.getTimeStamp()     // Catch:{ all -> 0x013b }
            int r10 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r10 <= 0) goto L_0x0273
            long r18 = r15.getTimeStamp()     // Catch:{ all -> 0x013b }
            r7 = -1
            r10 = 0
            goto L_0x0235
        L_0x0273:
            r7 = -1
            r10 = 0
            goto L_0x0235
        L_0x0277:
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x027e
            r18 = r13
            goto L_0x027f
        L_0x027e:
        L_0x027f:
            r6 = 0
            r22 = -1
            int r0 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x028e
            int r0 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x028e
            long r6 = r18 - r20
            goto L_0x02a4
        L_0x028e:
            int r0 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x0293
        L_0x0292:
            goto L_0x029a
        L_0x0293:
            int r0 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x0292
            long r6 = r13 - r20
            goto L_0x02a4
        L_0x029a:
            int r0 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x02a4
            int r0 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r0 != 0) goto L_0x02a4
            long r6 = r18 - r3
        L_0x02a4:
            boolean r0 = r5.c     // Catch:{ all -> 0x013b }
            if (r0 != 0) goto L_0x02a9
            goto L_0x02af
        L_0x02a9:
            r5.c()     // Catch:{ all -> 0x013b }
            r3 = 0
            r5.c = r3     // Catch:{ all -> 0x013b }
        L_0x02af:
            aucj r0 = r5.b     // Catch:{ all -> 0x013b }
            com.google.ads.afma.proto2api.c r0 = (com.google.ads.afma.proto2api.c) r0     // Catch:{ all -> 0x013b }
            int r3 = r0.b     // Catch:{ all -> 0x013b }
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 | r4
            r0.b = r3     // Catch:{ all -> 0x013b }
            r0.H = r6     // Catch:{ all -> 0x013b }
            goto L_0x02c2
        L_0x02bd:
            r17 = r4
            goto L_0x02c2
        L_0x02c0:
            r17 = r4
        L_0x02c2:
            r3 = -2
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r0 = defpackage.nol.a()     // Catch:{ noh -> 0x038c }
            long r13 = r0.longValue()     // Catch:{ noh -> 0x038c }
            axja r0 = defpackage.axja.a     // Catch:{ noh -> 0x038c }
            axjb r0 = r0.a()     // Catch:{ noh -> 0x038c }
            long r18 = r0.e()     // Catch:{ noh -> 0x038c }
            long r18 = r18 * r6
            long r13 = r13 - r18
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ noh -> 0x038c }
            nnq r8 = r11.b     // Catch:{ noh -> 0x038c }
            nqb r0 = r8.a((java.lang.Long) r0)     // Catch:{ noh -> 0x038c }
            if (r0 == 0) goto L_0x034c
            com.google.ads.afma.proto2api.g r8 = com.google.ads.afma.proto2api.g.e     // Catch:{ noh -> 0x038c }
            aucd r8 = r8.o()     // Catch:{ noh -> 0x038c }
            long r13 = r0.b     // Catch:{ noh -> 0x038c }
            boolean r10 = r8.c     // Catch:{ noh -> 0x038c }
            if (r10 != 0) goto L_0x02f5
            goto L_0x02fb
        L_0x02f5:
            r8.c()     // Catch:{ noh -> 0x038c }
            r10 = 0
            r8.c = r10     // Catch:{ noh -> 0x038c }
        L_0x02fb:
            aucj r10 = r8.b     // Catch:{ noh -> 0x038c }
            com.google.ads.afma.proto2api.g r10 = (com.google.ads.afma.proto2api.g) r10     // Catch:{ noh -> 0x038c }
            int r15 = r10.a     // Catch:{ noh -> 0x038c }
            r15 = r15 | r9
            r10.a = r15     // Catch:{ noh -> 0x038c }
            r10.b = r13     // Catch:{ noh -> 0x038c }
            java.lang.String r13 = r0.d     // Catch:{ noh -> 0x038c }
            r13.getClass()     // Catch:{ noh -> 0x038c }
            r12 = r12 | r15
            r10.a = r12     // Catch:{ noh -> 0x038c }
            r10.c = r13     // Catch:{ noh -> 0x038c }
            auay r0 = r0.e     // Catch:{ noh -> 0x038c }
            r0.getClass()     // Catch:{ noh -> 0x038c }
            r12 = r12 | 4
            r10.a = r12     // Catch:{ noh -> 0x038c }
            r10.d = r0     // Catch:{ noh -> 0x038c }
            boolean r0 = r5.c     // Catch:{ noh -> 0x038c }
            if (r0 != 0) goto L_0x0320
            goto L_0x0326
        L_0x0320:
            r5.c()     // Catch:{ noh -> 0x038c }
            r10 = 0
            r5.c = r10     // Catch:{ noh -> 0x038c }
        L_0x0326:
            aucj r0 = r5.b     // Catch:{ noh -> 0x038c }
            com.google.ads.afma.proto2api.c r0 = (com.google.ads.afma.proto2api.c) r0     // Catch:{ noh -> 0x038c }
            aucj r8 = r8.i()     // Catch:{ noh -> 0x038c }
            com.google.ads.afma.proto2api.g r8 = (com.google.ads.afma.proto2api.g) r8     // Catch:{ noh -> 0x038c }
            r8.getClass()     // Catch:{ noh -> 0x038c }
            r0.P = r8     // Catch:{ noh -> 0x038c }
            int r8 = r0.c     // Catch:{ noh -> 0x038c }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r0.c = r8     // Catch:{ noh -> 0x038c }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ noh -> 0x038c }
            aucj r8 = r5.b     // Catch:{ noh -> 0x038c }
            com.google.ads.afma.proto2api.c r8 = (com.google.ads.afma.proto2api.c) r8     // Catch:{ noh -> 0x038c }
            com.google.ads.afma.proto2api.g r8 = r8.P     // Catch:{ noh -> 0x038c }
            if (r8 != 0) goto L_0x0347
            com.google.ads.afma.proto2api.g r8 = com.google.ads.afma.proto2api.g.e     // Catch:{ noh -> 0x038c }
        L_0x0347:
            r10 = 0
            r0[r10] = r8     // Catch:{ noh -> 0x038c }
            goto L_0x03cb
        L_0x034c:
            com.google.ads.afma.proto2api.g r0 = com.google.ads.afma.proto2api.g.e     // Catch:{ noh -> 0x038c }
            aucd r0 = r0.o()     // Catch:{ noh -> 0x038c }
            boolean r8 = r0.c     // Catch:{ noh -> 0x038c }
            if (r8 != 0) goto L_0x0357
            goto L_0x035d
        L_0x0357:
            r0.c()     // Catch:{ noh -> 0x038c }
            r8 = 0
            r0.c = r8     // Catch:{ noh -> 0x038c }
        L_0x035d:
            aucj r8 = r0.b     // Catch:{ noh -> 0x038c }
            com.google.ads.afma.proto2api.g r8 = (com.google.ads.afma.proto2api.g) r8     // Catch:{ noh -> 0x038c }
            int r10 = r8.a     // Catch:{ noh -> 0x038c }
            r10 = r10 | r9
            r8.a = r10     // Catch:{ noh -> 0x038c }
            r8.b = r3     // Catch:{ noh -> 0x038c }
            boolean r8 = r5.c     // Catch:{ noh -> 0x038c }
            if (r8 != 0) goto L_0x036d
            goto L_0x0373
        L_0x036d:
            r5.c()     // Catch:{ noh -> 0x038c }
            r8 = 0
            r5.c = r8     // Catch:{ noh -> 0x038c }
        L_0x0373:
            aucj r8 = r5.b     // Catch:{ noh -> 0x038c }
            com.google.ads.afma.proto2api.c r8 = (com.google.ads.afma.proto2api.c) r8     // Catch:{ noh -> 0x038c }
            aucj r0 = r0.i()     // Catch:{ noh -> 0x038c }
            com.google.ads.afma.proto2api.g r0 = (com.google.ads.afma.proto2api.g) r0     // Catch:{ noh -> 0x038c }
            r0.getClass()     // Catch:{ noh -> 0x038c }
            r8.P = r0     // Catch:{ noh -> 0x038c }
            int r0 = r8.c     // Catch:{ noh -> 0x038c }
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r8.c = r0     // Catch:{ noh -> 0x038c }
            com.google.android.gms.gass.SchedulePeriodicTasksServiceImpl.a((android.content.Context) r2)     // Catch:{ noh -> 0x038c }
            goto L_0x03cb
        L_0x038c:
            r0 = move-exception
            com.google.ads.afma.proto2api.g r0 = com.google.ads.afma.proto2api.g.e     // Catch:{ all -> 0x013b }
            aucd r0 = r0.o()     // Catch:{ all -> 0x013b }
            boolean r8 = r0.c     // Catch:{ all -> 0x013b }
            if (r8 != 0) goto L_0x0398
            goto L_0x039e
        L_0x0398:
            r0.c()     // Catch:{ all -> 0x013b }
            r8 = 0
            r0.c = r8     // Catch:{ all -> 0x013b }
        L_0x039e:
            aucj r8 = r0.b     // Catch:{ all -> 0x013b }
            com.google.ads.afma.proto2api.g r8 = (com.google.ads.afma.proto2api.g) r8     // Catch:{ all -> 0x013b }
            int r10 = r8.a     // Catch:{ all -> 0x013b }
            r9 = r9 | r10
            r8.a = r9     // Catch:{ all -> 0x013b }
            r9 = -1
            r8.b = r9     // Catch:{ all -> 0x013b }
            boolean r8 = r5.c     // Catch:{ all -> 0x013b }
            if (r8 != 0) goto L_0x03b0
            goto L_0x03b6
        L_0x03b0:
            r5.c()     // Catch:{ all -> 0x013b }
            r8 = 0
            r5.c = r8     // Catch:{ all -> 0x013b }
        L_0x03b6:
            aucj r8 = r5.b     // Catch:{ all -> 0x013b }
            com.google.ads.afma.proto2api.c r8 = (com.google.ads.afma.proto2api.c) r8     // Catch:{ all -> 0x013b }
            aucj r0 = r0.i()     // Catch:{ all -> 0x013b }
            com.google.ads.afma.proto2api.g r0 = (com.google.ads.afma.proto2api.g) r0     // Catch:{ all -> 0x013b }
            r0.getClass()     // Catch:{ all -> 0x013b }
            r8.P = r0     // Catch:{ all -> 0x013b }
            int r0 = r8.c     // Catch:{ all -> 0x013b }
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r8.c = r0     // Catch:{ all -> 0x013b }
        L_0x03cb:
            if (r11 != 0) goto L_0x03ce
            goto L_0x03d1
        L_0x03ce:
            r11.a()
        L_0x03d1:
            axjv r0 = defpackage.axjv.a
            axjw r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x040d
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ Exception -> 0x03f5 }
            r2 = r17
            r8 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r8)     // Catch:{ Exception -> 0x03f5 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x03f5 }
            long r10 = r0.firstInstallTime     // Catch:{ Exception -> 0x03f5 }
            long r8 = r8 - r10
            r10 = 60
            long r8 = r8 / r10
            long r3 = r8 / r6
            goto L_0x03f6
        L_0x03f5:
            r0 = move-exception
        L_0x03f6:
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x03fb
            goto L_0x0401
        L_0x03fb:
            r5.c()
            r2 = 0
            r5.c = r2
        L_0x0401:
            aucj r0 = r5.b
            com.google.ads.afma.proto2api.c r0 = (com.google.ads.afma.proto2api.c) r0
            int r2 = r0.b
            r2 = r2 | 512(0x200, float:7.175E-43)
            r0.b = r2
            r0.y = r3
        L_0x040d:
            aucj r0 = r5.i()
            com.google.ads.afma.proto2api.c r0 = (com.google.ads.afma.proto2api.c) r0
            r1.<init>(r0)
            return r1
        L_0x0417:
            r6 = r11
            goto L_0x041a
        L_0x0419:
            r0 = move-exception
        L_0x041a:
            if (r6 == 0) goto L_0x041f
            r6.a()
        L_0x041f:
            throw r0
        L_0x0420:
            com.google.android.gms.gass.internal.GassResponseParcel r0 = new com.google.android.gms.gass.internal.GassResponseParcel
            com.google.ads.afma.proto2api.c r1 = com.google.ads.afma.proto2api.c.Q
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npo.a(com.google.android.gms.gass.internal.GassRequestParcel):com.google.android.gms.gass.internal.GassResponseParcel");
    }

    public npo(noj noj, noa noa) {
        super("com.google.android.gms.gass.internal.IGassService");
        this.a = noj;
        this.b = noa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.gass.internal.ProgramResponse a(com.google.android.gms.gass.internal.ProgramRequest r15) {
        /*
            r14 = this;
            boolean r0 = defpackage.axjj.b()
            if (r0 != 0) goto L_0x000c
            r15 = 7
            com.google.android.gms.gass.internal.ProgramResponse r15 = a((int) r15)
            return r15
        L_0x000c:
            int r0 = r15.e
            bhs r0 = defpackage.bhs.a(r0)
            if (r0 != 0) goto L_0x001a
            r15 = 6
            com.google.android.gms.gass.internal.ProgramResponse r15 = a((int) r15)
            return r15
        L_0x001a:
            npe r1 = new npe
            ihs r2 = defpackage.ihs.b()
            r1.<init>(r2)
            bhs r2 = defpackage.bhs.UNSUPPORTED
            r3 = 1
            if (r0 == r2) goto L_0x003b
            int r2 = r0.f
            java.lang.String r2 = java.lang.Integer.toString(r2)
            android.content.SharedPreferences r1 = r1.a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r3)
            r1.commit()
        L_0x003b:
            ihs r1 = defpackage.ihs.b()
            noa r2 = r14.b
            nps r4 = new nps
            r4.<init>(r1, r0)
            npb r0 = new npb
            r0.<init>(r4, r2)
            long r1 = java.lang.System.currentTimeMillis()
            nps r4 = r0.a
            npr r4 = r4.a()
            r5 = 0
            if (r4 == 0) goto L_0x014b
            boolean r6 = r4.b()
            if (r6 == 0) goto L_0x0060
            goto L_0x014b
        L_0x0060:
            bhu r6 = r4.a
            java.lang.String r7 = r15.c
            if (r7 == 0) goto L_0x0071
            java.lang.String r8 = r6.b
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r7 = r5
            goto L_0x0086
        L_0x0071:
            byte[] r7 = r4.d
            if (r7 != 0) goto L_0x007d
            java.io.File r7 = r4.b
            byte[] r7 = defpackage.npt.a((java.io.File) r7)
            r4.d = r7
        L_0x007d:
            byte[] r7 = r4.d
            if (r7 == 0) goto L_0x006f
            int r8 = r7.length
            byte[] r7 = java.util.Arrays.copyOf(r7, r8)
        L_0x0086:
            java.lang.String r15 = r15.d
            if (r15 == 0) goto L_0x0094
            java.lang.String r8 = r6.c
            boolean r15 = r15.equals(r8)
            if (r15 != 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            goto L_0x0098
        L_0x0094:
            byte[] r5 = r4.a()
        L_0x0098:
            bhu r15 = defpackage.bhu.g
            aucd r15 = r15.o()
            java.lang.String r4 = r6.b
            boolean r8 = r15.c
            r9 = 0
            if (r8 != 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            r15.c()
            r15.c = r9
        L_0x00ab:
            aucj r8 = r15.b
            bhu r8 = (defpackage.bhu) r8
            r4.getClass()
            int r10 = r8.a
            r10 = r10 | r3
            r8.a = r10
            r8.b = r4
            java.lang.String r4 = r6.c
            r4.getClass()
            r11 = 2
            r10 = r10 | r11
            r8.a = r10
            r8.c = r4
            long r12 = r6.d
            r4 = 4
            r6 = r10 | 4
            r8.a = r6
            r8.d = r12
            aucj r15 = r15.i()
            bhu r15 = (defpackage.bhu) r15
            bht r6 = defpackage.bht.e
            aucd r6 = r6.o()
            if (r5 == 0) goto L_0x00f9
            auay r5 = defpackage.auay.a((byte[]) r5)
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x00e4
            goto L_0x00e9
        L_0x00e4:
            r6.c()
            r6.c = r9
        L_0x00e9:
            aucj r8 = r6.b
            bht r8 = (defpackage.bht) r8
            r5.getClass()
            int r10 = r8.a
            r10 = r10 | r4
            r8.a = r10
            r8.d = r5
            r5 = 3
            goto L_0x00fa
        L_0x00f9:
            r5 = 2
        L_0x00fa:
            if (r7 == 0) goto L_0x0119
            auay r5 = defpackage.auay.a((byte[]) r7)
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0105
            goto L_0x010a
        L_0x0105:
            r6.c()
            r6.c = r9
        L_0x010a:
            aucj r7 = r6.b
            bht r7 = (defpackage.bht) r7
            r5.getClass()
            int r8 = r7.a
            r8 = r8 | r11
            r7.a = r8
            r7.c = r5
            goto L_0x011a
        L_0x0119:
            r4 = r5
        L_0x011a:
            r5 = 5003(0x138b, float:7.01E-42)
            r0.a(r5, r1)
            com.google.android.gms.gass.internal.ProgramResponse r0 = new com.google.android.gms.gass.internal.ProgramResponse
            boolean r1 = r6.c
            if (r1 != 0) goto L_0x0126
            goto L_0x012b
        L_0x0126:
            r6.c()
            r6.c = r9
        L_0x012b:
            aucj r1 = r6.b
            bht r1 = (defpackage.bht) r1
            r15.getClass()
            r1.b = r15
            int r15 = r1.a
            r15 = r15 | r3
            r1.a = r15
            aucj r15 = r6.i()
            bht r15 = (defpackage.bht) r15
            auay r15 = r15.au()
            byte[] r15 = r15.k()
            r0.<init>(r15, r4)
            goto L_0x0155
        L_0x014b:
            r15 = 5004(0x138c, float:7.012E-42)
            r0.a(r15, r1)
            com.google.android.gms.gass.internal.ProgramResponse r0 = new com.google.android.gms.gass.internal.ProgramResponse
            r0.<init>(r5, r3)
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npo.a(com.google.android.gms.gass.internal.ProgramRequest):com.google.android.gms.gass.internal.ProgramResponse");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            GassResponseParcel a2 = a((GassRequestParcel) bhx.a(parcel, GassRequestParcel.CREATOR));
            parcel2.writeNoException();
            bhx.b(parcel2, a2);
        } else if (i == 2) {
            GassEventParcel gassEventParcel = (GassEventParcel) bhx.a(parcel, GassEventParcel.CREATOR);
            if (axjg.c() && this.a != null) {
                try {
                    nph nph = (nph) aucj.a((aucj) nph.a, gassEventParcel.b);
                    noj noj = this.a;
                    aucd o = npg.c.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    npg npg = (npg) o.b;
                    nph.getClass();
                    npg.b = nph;
                    npg.a |= 2;
                    hoi a3 = noj.a.a(((npg) o.i()).k());
                    a3.b(2);
                    a3.b();
                } catch (auda e) {
                }
            }
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            ProgramResponse a4 = a((ProgramRequest) bhx.a(parcel, ProgramRequest.CREATOR));
            parcel2.writeNoException();
            bhx.b(parcel2, a4);
        }
        return true;
    }
}
