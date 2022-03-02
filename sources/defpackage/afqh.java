package defpackage;

/* renamed from: afqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afqh implements aoqb {
    private final afqn a;
    private final afkr b;
    private final aflf c;

    public afqh(afqn afqn, afkr afkr, aflf aflf) {
        this.a = afqn;
        this.b = afkr;
        this.c = aflf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0236, code lost:
        defpackage.afsh.b("%s File details missing in added group = %s, file id = %s", "DataFileGroupValidator", r0.c, r13.b);
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x021a A[LOOP:1: B:96:0x017f->B:135:0x021a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0200 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "MDDManager"
            java.lang.String r3 = "%s %s"
            afqn r4 = r1.a
            afkr r0 = r1.b
            aflf r5 = r1.c
            r6 = r22
            java.lang.Void r6 = (java.lang.Void) r6
            android.content.Context r6 = r4.b
            java.lang.String r7 = r0.c
            boolean r7 = r7.isEmpty()
            java.lang.String r8 = "DataFileGroupValidator"
            if (r7 == 0) goto L_0x0023
            java.lang.String r2 = "%s Group name missing in added group"
            defpackage.afsh.a((java.lang.String) r2, (java.lang.Object) r8)
            goto L_0x049b
        L_0x0023:
            java.lang.String r7 = r0.c
            java.lang.String r10 = "|"
            boolean r7 = r7.contains(r10)
            if (r7 == 0) goto L_0x0036
            java.lang.String r2 = r0.c
            java.lang.String r3 = "%s Group name = %s contains '|'"
            defpackage.afsh.a((java.lang.String) r3, (java.lang.Object) r8, (java.lang.Object) r2)
            goto L_0x049b
        L_0x0036:
            java.lang.String r7 = r0.d
            boolean r7 = r7.contains(r10)
            if (r7 != 0) goto L_0x0494
            aucx r7 = r0.j
            int r11 = r7.size()
            r12 = 0
        L_0x0045:
            r15 = 1
            if (r12 >= r11) goto L_0x024d
            java.lang.Object r16 = r7.get(r12)
            r13 = r16
            afkn r13 = (defpackage.afkn) r13
            java.lang.String r14 = r13.b
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0236
            java.lang.String r14 = r13.b
            boolean r14 = r14.contains(r10)
            if (r14 == 0) goto L_0x0062
            goto L_0x0236
        L_0x0062:
            boolean r14 = defpackage.afsq.a((defpackage.afkn) r13)
            if (r14 != 0) goto L_0x007a
            int r14 = r13.a
            r14 = r14 & 16
            if (r14 == 0) goto L_0x0078
            java.lang.String r14 = r13.f
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0078
            r14 = 1
            goto L_0x008b
        L_0x0078:
            r14 = 0
            goto L_0x008b
        L_0x007a:
            int r14 = r13.a
            r14 = r14 & 64
            if (r14 == 0) goto L_0x008a
            java.lang.String r14 = r13.h
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x008a
            r14 = 1
            goto L_0x008b
        L_0x008a:
            r14 = 0
        L_0x008b:
            int r9 = r13.e
            int r9 = defpackage.afkm.a(r9)
            if (r9 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r9 = 1
        L_0x0095:
            int r9 = r9 + -1
            if (r9 == r15) goto L_0x009b
            r9 = r14
            goto L_0x00a0
        L_0x009b:
            if (r14 != 0) goto L_0x009f
            r9 = 1
            goto L_0x00a0
        L_0x009f:
            r9 = 0
        L_0x00a0:
            boolean r17 = defpackage.afsq.a((defpackage.afkn) r13)
            if (r17 != 0) goto L_0x00a8
            r14 = 0
            goto L_0x00ad
        L_0x00a8:
            if (r14 != 0) goto L_0x00ac
            r14 = 1
            goto L_0x00ad
        L_0x00ac:
            r14 = 0
        L_0x00ad:
            r9 = r9 | r14
            java.lang.String r14 = r13.c
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0236
            java.lang.String r14 = r13.c
            boolean r14 = r14.contains(r10)
            if (r14 != 0) goto L_0x0236
            int r14 = r13.d
            if (r14 < 0) goto L_0x0236
            if (r9 == 0) goto L_0x0236
            java.lang.String r9 = defpackage.afsq.b(r13)
            boolean r9 = r9.contains(r10)
            if (r9 != 0) goto L_0x0236
            int r9 = r13.a
            r9 = r9 & 32
            if (r9 != 0) goto L_0x00d6
            goto L_0x0163
        L_0x00d6:
            avlu r9 = r13.g
            if (r9 != 0) goto L_0x00dc
            avlu r9 = defpackage.avlu.b
        L_0x00dc:
            boolean r9 = defpackage.afnj.a(r9)
            if (r9 == 0) goto L_0x049b
            java.lang.String r9 = r0.c
            boolean r17 = defpackage.afsq.a((defpackage.afkn) r13)
            if (r17 == 0) goto L_0x0146
            axsv r17 = defpackage.axsv.a
            axsw r17 = r17.a()
            boolean r17 = r17.m()
            if (r17 != 0) goto L_0x00ff
            java.lang.String r2 = r13.b
            java.lang.String r3 = "Feature enableZipFolder is not enabled. Group = %s, file id = %s"
            defpackage.afsh.a((java.lang.String) r3, (java.lang.Object) r9, (java.lang.Object) r2)
            goto L_0x049b
        L_0x00ff:
            avlu r14 = r13.g
            if (r14 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            avlu r14 = defpackage.avlu.b
        L_0x0106:
            aucx r14 = r14.a
            int r14 = r14.size()
            if (r14 <= r15) goto L_0x0117
            java.lang.String r2 = r13.b
            java.lang.String r3 = "Download zip folder transform cannot not be applied with other transforms. Group = %s, file id = %s"
            defpackage.afsh.a((java.lang.String) r3, (java.lang.Object) r9, (java.lang.Object) r2)
            goto L_0x049b
        L_0x0117:
            avlu r14 = r13.g
            if (r14 == 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            avlu r14 = defpackage.avlu.b
        L_0x011e:
            aucx r14 = r14.a
            r15 = 0
            java.lang.Object r14 = r14.get(r15)
            avlt r14 = (defpackage.avlt) r14
            int r15 = r14.a
            r1 = 4
            if (r15 != r1) goto L_0x0131
            java.lang.Object r1 = r14.b
            avlv r1 = (defpackage.avlv) r1
            goto L_0x0133
        L_0x0131:
            avlv r1 = defpackage.avlv.c
        L_0x0133:
            java.lang.String r1 = r1.b
            java.lang.String r14 = "*"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x0146
            java.lang.String r1 = r13.b
            java.lang.String r2 = "Download zip folder transform can only have * as target. Group = %s, file id = %s"
            defpackage.afsh.a((java.lang.String) r2, (java.lang.Object) r9, (java.lang.Object) r1)
            goto L_0x049b
        L_0x0146:
            int r1 = r13.e
            int r1 = defpackage.afkm.a(r1)
            if (r1 != 0) goto L_0x014f
            goto L_0x0152
        L_0x014f:
            r9 = 2
            if (r1 == r9) goto L_0x0163
        L_0x0152:
            int r1 = r13.a
            r1 = r1 & 64
            if (r1 != 0) goto L_0x0163
            java.lang.String r1 = r0.c
            java.lang.String r2 = r13.b
            java.lang.String r3 = "Download checksum must be provided. Group = %s, file id = %s"
            defpackage.afsh.a((java.lang.String) r3, (java.lang.Object) r1, (java.lang.Object) r2)
            goto L_0x049b
        L_0x0163:
            int r1 = r13.a
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x016a
            goto L_0x0176
        L_0x016a:
            avlu r1 = r13.j
            if (r1 != 0) goto L_0x0170
            avlu r1 = defpackage.avlu.b
        L_0x0170:
            boolean r1 = defpackage.afnj.a(r1)
            if (r1 == 0) goto L_0x049b
        L_0x0176:
            java.lang.String r1 = r0.c
            aucx r9 = r13.k
            int r14 = r9.size()
            r15 = 0
        L_0x017f:
            if (r15 >= r14) goto L_0x0223
            java.lang.Object r18 = r9.get(r15)
            r19 = r7
            r7 = r18
            afku r7 = (defpackage.afku) r7
            r18 = r9
            java.lang.String r9 = r7.b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01f9
            java.lang.String r9 = r7.b
            boolean r9 = r9.contains(r10)
            if (r9 != 0) goto L_0x01f9
            int r9 = r7.a
            r16 = 2
            r9 = r9 & 2
            if (r9 == 0) goto L_0x01f9
            int r9 = r7.c
            if (r9 < 0) goto L_0x01f9
            java.lang.String r9 = r7.d
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01f9
            java.lang.String r9 = r7.d
            boolean r9 = r9.contains(r10)
            if (r9 != 0) goto L_0x01f9
            int r9 = r7.a
            r9 = r9 & 8
            if (r9 == 0) goto L_0x01f9
            int r9 = r7.e
            int r9 = defpackage.afkt.a(r9)
            if (r9 != 0) goto L_0x01cb
            r20 = r11
            r9 = 0
            goto L_0x01fc
        L_0x01cb:
            r20 = r11
            r11 = 1
            if (r9 == r11) goto L_0x01fb
            int r9 = r7.a
            r9 = r9 & 16
            if (r9 == 0) goto L_0x01fb
            afkk r9 = r7.f
            if (r9 == 0) goto L_0x01db
            goto L_0x01dd
        L_0x01db:
            afkk r9 = defpackage.afkk.b
        L_0x01dd:
            java.lang.String r9 = r9.a
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01f7
            afkk r9 = r7.f
            if (r9 == 0) goto L_0x01ea
            goto L_0x01ec
        L_0x01ea:
            afkk r9 = defpackage.afkk.b
        L_0x01ec:
            java.lang.String r9 = r9.a
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r9 = 1
            goto L_0x01fc
        L_0x01f7:
            r9 = 0
            goto L_0x01fc
        L_0x01f9:
            r20 = r11
        L_0x01fb:
            r9 = 0
        L_0x01fc:
            int r15 = r15 + 1
            if (r9 != 0) goto L_0x021a
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r11 = 0
            r9[r11] = r8
            r11 = 1
            r9[r11] = r1
            java.lang.String r1 = r13.b
            r11 = 2
            r9[r11] = r1
            java.lang.String r1 = r7.b
            r7 = 3
            r9[r7] = r1
            java.lang.String r1 = "%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s."
            defpackage.afsh.b(r1, r9)
            r15 = 0
            goto L_0x0228
        L_0x021a:
            r9 = 4
            r9 = r18
            r7 = r19
            r11 = r20
            goto L_0x017f
        L_0x0223:
            r19 = r7
            r20 = r11
            r15 = 1
        L_0x0228:
            int r12 = r12 + 1
            if (r15 != 0) goto L_0x022e
            goto L_0x049b
        L_0x022e:
            r1 = r21
            r7 = r19
            r11 = r20
            goto L_0x0045
        L_0x0236:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            java.lang.String r2 = r0.c
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = r13.b
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "%s File details missing in added group = %s, file id = %s"
            defpackage.afsh.b(r2, r1)
            goto L_0x049b
        L_0x024d:
            r1 = 0
        L_0x024e:
            aucx r7 = r0.j
            int r7 = r7.size()
            if (r1 >= r7) goto L_0x029f
            int r7 = r1 + 1
            r9 = r7
        L_0x0259:
            aucx r10 = r0.j
            int r10 = r10.size()
            if (r9 >= r10) goto L_0x029d
            aucx r10 = r0.j
            java.lang.Object r10 = r10.get(r1)
            afkn r10 = (defpackage.afkn) r10
            java.lang.String r10 = r10.b
            aucx r11 = r0.j
            java.lang.Object r11 = r11.get(r9)
            afkn r11 = (defpackage.afkn) r11
            java.lang.String r11 = r11.b
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x029a
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r8
            java.lang.String r3 = r0.c
            r5 = 1
            r2[r5] = r3
            aucx r3 = r0.j
            java.lang.Object r1 = r3.get(r1)
            afkn r1 = (defpackage.afkn) r1
            java.lang.String r1 = r1.b
            r3 = 2
            r2[r3] = r1
            java.lang.String r1 = "%s Repeated file id in added group = %s, file id = %s"
            defpackage.afsh.b(r1, r2)
            goto L_0x049b
        L_0x029a:
            int r9 = r9 + 1
            goto L_0x0259
        L_0x029d:
            r1 = r7
            goto L_0x024e
        L_0x029f:
            aflb r1 = r0.i
            if (r1 == 0) goto L_0x02a4
            goto L_0x02a6
        L_0x02a4:
            aflb r1 = defpackage.aflb.f
        L_0x02a6:
            int r1 = r1.c
            int r1 = defpackage.afky.a(r1)
            if (r1 != 0) goto L_0x02af
            goto L_0x02c8
        L_0x02af:
            r7 = 3
            if (r1 != r7) goto L_0x02c8
            aflb r1 = r0.i
            if (r1 == 0) goto L_0x02b7
            goto L_0x02b9
        L_0x02b7:
            aflb r1 = defpackage.aflb.f
        L_0x02b9:
            long r9 = r1.d
            r11 = 0
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x02c8
            java.lang.String r1 = "%s For DOWNLOAD_FIRST_ON_WIFI_THEN_ON_ANY_NETWORK policy, the download_first_on_wifi_period_secs must be > 0"
            defpackage.afsh.a((java.lang.String) r1, (java.lang.Object) r8)
            goto L_0x049b
        L_0x02c8:
            boolean r1 = defpackage.afpk.a(r6)
            if (r1 == 0) goto L_0x02cf
            goto L_0x02e1
        L_0x02cf:
            int r1 = r0.f
            int r1 = defpackage.afkq.a(r1)
            if (r1 == 0) goto L_0x02e1
            r6 = 3
            if (r1 != r6) goto L_0x02e1
            java.lang.String r1 = "%s For AllowedReaders ALL_APPS policy, the device should be migrated to new key"
            defpackage.afsh.a((java.lang.String) r1, (java.lang.Object) r8)
            goto L_0x049b
        L_0x02e1:
            aucx r1 = r0.j
            int r6 = r1.size()
            r7 = 0
        L_0x02e8:
            if (r7 >= r6) goto L_0x03c1
            java.lang.Object r8 = r1.get(r7)
            afkn r8 = (defpackage.afkn) r8
            int r8 = r8.e
            int r8 = defpackage.afkm.a(r8)
            if (r8 == 0) goto L_0x02f9
            goto L_0x02fa
        L_0x02f9:
            r8 = 1
        L_0x02fa:
            int r7 = r7 + 1
            r9 = 2
            if (r8 != r9) goto L_0x02e8
            r1 = 5
            java.lang.Object r6 = r0.c(r1)
            aucd r6 = (defpackage.aucd) r6
            r6.a((defpackage.aucj) r0)
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x030e
            goto L_0x0314
        L_0x030e:
            r6.c()
            r7 = 0
            r6.c = r7
        L_0x0314:
            aucj r7 = r6.b
            afkr r7 = (defpackage.afkr) r7
            afkr r8 = defpackage.afkr.m
            aucx r8 = defpackage.aucj.s()
            r7.j = r8
            aucx r0 = r0.j
            int r7 = r0.size()
            r8 = 0
        L_0x0327:
            if (r8 >= r7) goto L_0x03ba
            java.lang.Object r9 = r0.get(r8)
            afkn r9 = (defpackage.afkn) r9
            int r10 = r9.e
            int r10 = defpackage.afkm.a(r10)
            if (r10 == 0) goto L_0x0338
            goto L_0x0339
        L_0x0338:
            r10 = 1
        L_0x0339:
            int r10 = r10 + -1
            r11 = 1
            if (r10 == r11) goto L_0x0343
            r6.a((defpackage.afkn) r9)
            goto L_0x03b6
        L_0x0343:
            java.lang.Object r10 = r9.c(r1)
            aucd r10 = (defpackage.aucd) r10
            r10.a((defpackage.aucj) r9)
            java.lang.String r11 = r9.c
            java.lang.String r12 = "SHA1"
            java.security.MessageDigest r12 = defpackage.afru.a((java.lang.String) r12)
            if (r12 == 0) goto L_0x0368
            byte[] r11 = r11.getBytes()
            int r13 = r11.length
            r14 = 0
            r12.update(r11, r14, r13)
            byte[] r11 = r12.digest()
            java.lang.String r11 = defpackage.afru.a((byte[]) r11)
            goto L_0x036a
        L_0x0368:
            java.lang.String r11 = ""
        L_0x036a:
            boolean r9 = defpackage.afsq.a((defpackage.afkn) r9)
            if (r9 != 0) goto L_0x038d
            boolean r9 = r10.c
            if (r9 != 0) goto L_0x0375
            goto L_0x037b
        L_0x0375:
            r10.c()
            r9 = 0
            r10.c = r9
        L_0x037b:
            aucj r9 = r10.b
            afkn r9 = (defpackage.afkn) r9
            afkn r12 = defpackage.afkn.l
            r11.getClass()
            int r12 = r9.a
            r12 = r12 | 16
            r9.a = r12
            r9.f = r11
            goto L_0x03a9
        L_0x038d:
            boolean r9 = r10.c
            if (r9 != 0) goto L_0x0392
            goto L_0x0398
        L_0x0392:
            r10.c()
            r9 = 0
            r10.c = r9
        L_0x0398:
            aucj r9 = r10.b
            afkn r9 = (defpackage.afkn) r9
            afkn r12 = defpackage.afkn.l
            r11.getClass()
            int r12 = r9.a
            r12 = r12 | 64
            r9.a = r12
            r9.h = r11
        L_0x03a9:
            aucj r9 = r10.b
            afkn r9 = (defpackage.afkn) r9
            aucj r9 = r10.i()
            afkn r9 = (defpackage.afkn) r9
            r6.a((defpackage.afkn) r9)
        L_0x03b6:
            int r8 = r8 + 1
            goto L_0x0327
        L_0x03ba:
            aucj r0 = r6.i()
            afkr r0 = (defpackage.afkr) r0
            goto L_0x03c2
        L_0x03c1:
        L_0x03c2:
            afpf r1 = r4.d     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            aekn r6 = r1.f     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            long r7 = defpackage.afsq.a((defpackage.afkr) r0)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            boolean r6 = defpackage.afsq.a((long) r7, (defpackage.aekn) r6)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.lang.String r7 = "FileGroupManager"
            if (r6 != 0) goto L_0x0457
            java.lang.String r6 = r5.c     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            boolean r6 = r1.a((java.lang.String) r6)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            if (r6 == 0) goto L_0x0431
            r6 = 0
            aorr r6 = defpackage.aorl.a((java.lang.Object) r6)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            boolean r7 = defpackage.axsv.e()     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            if (r7 == 0) goto L_0x0409
            aflb r7 = r0.i     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            if (r7 == 0) goto L_0x03ea
            goto L_0x03ec
        L_0x03ea:
            aflb r7 = defpackage.aflb.f     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
        L_0x03ec:
            int r7 = r7.e     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            int r7 = defpackage.afkw.a(r7)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            if (r7 != 0) goto L_0x03f5
            goto L_0x040a
        L_0x03f5:
            r8 = 2
            if (r7 != r8) goto L_0x0409
            afpi r6 = r1.d     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            aorr r6 = r6.c(r5)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            afnv r7 = new afnv     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r7.<init>(r1, r5, r0)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.util.concurrent.Executor r8 = r1.h     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            aorr r6 = defpackage.aopr.a((defpackage.aorr) r6, (defpackage.aoqb) r7, (java.util.concurrent.Executor) r8)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
        L_0x0409:
        L_0x040a:
            aoqw r6 = defpackage.aoqw.c(r6)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            afog r7 = new afog     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r7.<init>(r1, r5, r0)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.util.concurrent.Executor r8 = r1.h     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            aorr r6 = defpackage.aopr.a((defpackage.aorr) r6, (defpackage.aoqb) r7, (java.util.concurrent.Executor) r8)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            afor r7 = new afor     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r7.<init>(r1, r5, r0)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.util.concurrent.Executor r1 = r1.h     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            aorr r1 = defpackage.aopr.a((defpackage.aorr) r6, (defpackage.aoqb) r7, (java.util.concurrent.Executor) r1)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            afqb r6 = new afqb     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r6.<init>(r4, r5, r0)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.util.concurrent.Executor r0 = r4.n     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r1, (defpackage.aoqb) r6, (java.util.concurrent.Executor) r0)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            goto L_0x04af
        L_0x0431:
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r8 = 0
            r6[r8] = r7     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.lang.String r7 = r5.b     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r8 = 1
            r6[r8] = r7     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.lang.String r5 = r5.c     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r7 = 2
            r6[r7] = r5     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.lang.String r5 = "%s: Trying to add group %s for uninstalled app %s."
            defpackage.afsh.b(r5, r6)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            afsb r1 = r1.b     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.lang.String r5 = r0.c     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r6 = 1042(0x412, float:1.46E-42)
            int r0 = r0.e     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r1.a((int) r6, (java.lang.String) r5, (int) r0)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            afqv r0 = new afqv     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r0.<init>()     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            throw r0     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
        L_0x0457:
            java.lang.String r6 = "%s: Trying to add expired group %s."
            java.lang.String r5 = r5.b     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            defpackage.afsh.a((java.lang.String) r6, (java.lang.Object) r7, (java.lang.Object) r5)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            afsb r1 = r1.b     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            java.lang.String r5 = r0.c     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r6 = 1048(0x418, float:1.469E-42)
            int r0 = r0.e     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r1.a((int) r6, (java.lang.String) r5, (int) r0)     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            afnu r0 = new afnu     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            r0.<init>()     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
            throw r0     // Catch:{ afnu -> 0x0487, afqv -> 0x0485, afni -> 0x0483, IOException -> 0x046f }
        L_0x046f:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            defpackage.afsh.a((java.lang.String) r3, (java.lang.Object) r2, (java.lang.Object) r1)
            afmh r1 = r4.i
            java.lang.String r2 = "Failed to add group to MDD"
            r1.a(r2, r0)
            aorr r0 = defpackage.aorl.a((java.lang.Throwable) r0)
            goto L_0x04af
        L_0x0483:
            r0 = move-exception
            goto L_0x0488
        L_0x0485:
            r0 = move-exception
            goto L_0x0488
        L_0x0487:
            r0 = move-exception
        L_0x0488:
            java.lang.Class r1 = r0.getClass()
            defpackage.afsh.c(r3, r2, r1)
            aorr r0 = defpackage.aorl.a((java.lang.Throwable) r0)
            goto L_0x04af
        L_0x0494:
            java.lang.String r1 = r0.d
            java.lang.String r2 = "%s Owner package = %s contains '|'"
            defpackage.afsh.a((java.lang.String) r2, (java.lang.Object) r8, (java.lang.Object) r1)
        L_0x049b:
            afsb r1 = r4.c
            r2 = 1020(0x3fc, float:1.43E-42)
            java.lang.String r3 = r0.c
            int r0 = r0.e
            r1.a((int) r2, (java.lang.String) r3, (int) r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            aorr r0 = defpackage.aorl.a((java.lang.Object) r0)
        L_0x04af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqh.a(java.lang.Object):aorr");
    }
}
