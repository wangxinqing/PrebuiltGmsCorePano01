package defpackage;

/* renamed from: ahou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahou implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ ahov b;

    public ahou(ahov ahov, long j) {
        this.b = ahov;
        this.a = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            ahov r0 = r1.b
            java.lang.String[] r2 = r0.b
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x0009:
            if (r5 >= r3) goto L_0x02fa
            r12 = r2[r5]
            ahov r13 = r1.b
            long r14 = r1.a
            android.content.Context r0 = r13.a
            java.lang.String r6 = r0.getPackageName()
            int r7 = defpackage.jhg.i(r0, r6)
            com.google.android.gms.common.internal.ClientContext r0 = new com.google.android.gms.common.internal.ClientContext
            android.content.Context r6 = r13.a
            java.lang.String r10 = r6.getPackageName()
            android.content.Context r6 = r13.a
            java.lang.String r11 = r6.getPackageName()
            r6 = r0
            r8 = r12
            r9 = r12
            r6.<init>((int) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11)
            ahow r6 = r13.f
            java.lang.String r7 = "https://www.googleapis.com/auth/webhistory"
            r0.d(r7)
            r7 = 2
            quk r6 = r6.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxb r10 = defpackage.atxb.d     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucd r10 = r10.o()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atwr r11 = defpackage.atwr.c     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucd r11 = r11.o()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            java.lang.String r8 = "ACTIVITY_RECOGNITION_PERSONALIZATION"
            boolean r9 = r11.c     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r9 != 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            r11.c()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r11.c = r4     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
        L_0x0051:
            aucj r9 = r11.b     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atwr r9 = (defpackage.atwr) r9     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r8.getClass()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            int r4 = r9.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r4 = r4 | r7
            r9.a = r4     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r9.b = r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            boolean r4 = r10.c     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r4 != 0) goto L_0x0064
            goto L_0x006a
        L_0x0064:
            r10.c()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r4 = 0
            r10.c = r4     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
        L_0x006a:
            aucj r4 = r10.b     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxb r4 = (defpackage.atxb) r4     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucj r8 = r11.i()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atwr r8 = (defpackage.atwr) r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r8.getClass()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r4.b = r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            int r8 = r4.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r9 = 1
            r8 = r8 | r9
            r4.a = r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxa r4 = defpackage.atxa.e     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucd r4 = r4.o()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            boolean r8 = r4.c     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r8 != 0) goto L_0x008a
            goto L_0x0090
        L_0x008a:
            r4.c()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r8 = 0
            r4.c = r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
        L_0x0090:
            aucj r8 = r4.b     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxa r8 = (defpackage.atxa) r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            int r9 = r8.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r11 = 1
            r9 = r9 | r11
            r8.a = r9     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r9 = 2017(0x7e1, float:2.826E-42)
            r8.b = r9     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atiw r8 = defpackage.atiw.ACTIVITY_RECOGNITION_PERSONALIZATION_DATATYPE     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            int r8 = r8.pV     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            boolean r9 = r4.c     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r9 != 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            r4.c()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r9 = 0
            r4.c = r9     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
        L_0x00ad:
            aucj r9 = r4.b     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxa r9 = (defpackage.atxa) r9     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            int r11 = r9.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r11 = r11 | r7
            r9.a = r11     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r9.c = r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r8 = r11 | 16
            r9.a = r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r8 = 1
            r9.d = r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucj r4 = r4.i()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxa r4 = (defpackage.atxa) r4     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            boolean r8 = r10.c     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r8 != 0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            r10.c()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r8 = 0
            r10.c = r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
        L_0x00d0:
            aucj r8 = r10.b     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxb r8 = (defpackage.atxb) r8     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r4.getClass()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucx r9 = r8.c     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            boolean r9 = r9.a()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r9 == 0) goto L_0x00e0
            goto L_0x00e8
        L_0x00e0:
            aucx r9 = r8.c     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucx r9 = defpackage.aucj.a((defpackage.aucx) r9)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r8.c = r9     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
        L_0x00e8:
            aucx r8 = r8.c     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r8.add(r4)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucj r4 = r10.i()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r19 = r4
            atxb r19 = (defpackage.atxb) r19     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            baaj r4 = defpackage.quk.b     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r4 == 0) goto L_0x00fa
            goto L_0x0110
        L_0x00fa:
            baai r4 = defpackage.baai.UNARY     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            java.lang.String r8 = "footprints.oneplatform.FootprintsService/Read"
            atxb r9 = defpackage.atxb.d     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            baah r9 = defpackage.baoq.a(r9)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxd r10 = defpackage.atxd.b     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            baah r10 = defpackage.baoq.a(r10)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            baaj r4 = defpackage.baaj.a(r4, r8, r9, r10)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            defpackage.quk.b = r4     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
        L_0x0110:
            izd r4 = r6.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            baaj r17 = defpackage.quk.b     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r20 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r22 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r16 = r4
            r18 = r0
            java.lang.Object r0 = r16.a(r17, r18, r19, r20, r22)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxd r0 = (defpackage.atxd) r0     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r0 == 0) goto L_0x018e
            aubs r4 = defpackage.aubs.a()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            auci r6 = defpackage.arbo.f     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r4.a(r6)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucx r6 = r0.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            int r6 = r6.size()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r6 == 0) goto L_0x018e
            aucx r0 = r0.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            r6 = 0
            java.lang.Object r0 = r0.get(r6)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atxc r0 = (defpackage.atxc) r0     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            aucx r0 = r0.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            boolean r6 = r0.isEmpty()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r6 != 0) goto L_0x0152
            r6 = 0
            java.lang.Object r0 = r0.get(r6)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            atix r0 = (defpackage.atix) r0     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            amri r0 = defpackage.amri.b(r0)     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            goto L_0x0154
        L_0x0152:
            ampu r0 = defpackage.ampu.a     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
        L_0x0154:
            boolean r6 = r0.a()     // Catch:{ eif -> 0x0192, babk -> 0x0190 }
            if (r6 == 0) goto L_0x018e
            java.lang.Object r0 = r0.b()     // Catch:{ auda -> 0x018c }
            atix r0 = (defpackage.atix) r0     // Catch:{ auda -> 0x018c }
            aujv r0 = r0.d     // Catch:{ auda -> 0x018c }
            if (r0 == 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            aujv r0 = defpackage.aujv.a     // Catch:{ auda -> 0x018c }
        L_0x0167:
            byte[] r0 = r0.k()     // Catch:{ auda -> 0x018c }
            aujv r6 = defpackage.aujv.a     // Catch:{ auda -> 0x018c }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r6, (byte[]) r0, (defpackage.aubs) r4)     // Catch:{ auda -> 0x018c }
            aujv r0 = (defpackage.aujv) r0     // Catch:{ auda -> 0x018c }
            auci r4 = defpackage.arbo.f     // Catch:{ auda -> 0x018c }
            r0.a(r4)     // Catch:{ auda -> 0x018c }
            aubx r0 = r0.m     // Catch:{ auda -> 0x018c }
            auch r6 = r4.d     // Catch:{ auda -> 0x018c }
            java.lang.Object r0 = r0.b((defpackage.auch) r6)     // Catch:{ auda -> 0x018c }
            if (r0 != 0) goto L_0x0185
            java.lang.Object r0 = r4.b     // Catch:{ auda -> 0x018c }
            goto L_0x0188
        L_0x0185:
            r4.a(r0)     // Catch:{ auda -> 0x018c }
        L_0x0188:
            arbo r0 = (defpackage.arbo) r0     // Catch:{ auda -> 0x018c }
            r8 = r0
            goto L_0x01ad
        L_0x018c:
            r0 = move-exception
            goto L_0x01ac
        L_0x018e:
            r8 = 0
            goto L_0x01ad
        L_0x0190:
            r0 = move-exception
            goto L_0x0193
        L_0x0192:
            r0 = move-exception
        L_0x0193:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "Cannot fetch model "
            int r6 = r0.length()
            if (r6 != 0) goto L_0x01a9
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            goto L_0x01ac
        L_0x01a9:
            r4.concat(r0)
        L_0x01ac:
            r8 = 0
        L_0x01ad:
            areb r0 = defpackage.areb.d
            aucd r0 = r0.o()
            boolean r4 = r0.c
            if (r4 == 0) goto L_0x01bd
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x01bd:
            aucj r4 = r0.b
            areb r4 = (defpackage.areb) r4
            r4.c = r7
            int r6 = r4.a
            r6 = r6 | r7
            r4.a = r6
            if (r8 == 0) goto L_0x0224
            aicn r4 = r13.d
            aico r6 = defpackage.aico.PERSONAL_MODEL_DOWNLOADED_NOT_NULL
            r4.a((defpackage.aico) r6)
            arbs r4 = r8.d
            if (r4 == 0) goto L_0x01d6
            goto L_0x01d8
        L_0x01d6:
            arbs r4 = defpackage.arbs.c
        L_0x01d8:
            aucx r4 = r4.a
            int r4 = r4.size()
            if (r4 == 0) goto L_0x020b
            aicn r4 = r13.d
            aico r6 = defpackage.aico.PERSONAL_MODEL_NUMCLUSTERS
            arbs r9 = r8.d
            if (r9 == 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            arbs r9 = defpackage.arbs.c
        L_0x01eb:
            aucx r9 = r9.a
            int r9 = r9.size()
            r4.a((defpackage.aico) r6, (int) r9)
            boolean r4 = r0.c
            if (r4 == 0) goto L_0x01fe
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x01fe:
            aucj r4 = r0.b
            areb r4 = (defpackage.areb) r4
            r6 = 1
            r4.b = r6
            int r9 = r4.a
            r9 = r9 | r6
            r4.a = r9
            goto L_0x0245
        L_0x020b:
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x0210
            goto L_0x0216
        L_0x0210:
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x0216:
            aucj r4 = r0.b
            areb r4 = (defpackage.areb) r4
            r6 = 4
            r4.b = r6
            int r6 = r4.a
            r9 = 1
            r6 = r6 | r9
            r4.a = r6
            goto L_0x0245
        L_0x0224:
            arbo r8 = defpackage.arbo.e
            aicn r4 = r13.d
            aico r6 = defpackage.aico.PERSONAL_MODEL_DOWNLOADED_NULL
            r4.a((defpackage.aico) r6)
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x0232
            goto L_0x0238
        L_0x0232:
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x0238:
            aucj r4 = r0.b
            areb r4 = (defpackage.areb) r4
            r6 = 3
            r4.b = r6
            int r6 = r4.a
            r9 = 1
            r6 = r6 | r9
            r4.a = r6
        L_0x0245:
            android.content.Context r4 = r13.a
            ahol r4 = defpackage.ahol.a((android.content.Context) r4)
            aucj r0 = r0.i()
            areb r0 = (defpackage.areb) r0
            arec r6 = defpackage.arec.q
            aucd r6 = r6.o()
            boolean r9 = r6.c
            if (r9 != 0) goto L_0x025c
            goto L_0x0262
        L_0x025c:
            r6.c()
            r9 = 0
            r6.c = r9
        L_0x0262:
            aucj r9 = r6.b
            arec r9 = (defpackage.arec) r9
            r0.getClass()
            r9.l = r0
            int r0 = r9.a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r9.a = r0
            aucj r0 = r6.i()
            arec r0 = (defpackage.arec) r0
            hol r4 = r4.a
            hoi r0 = r4.a((defpackage.audx) r0)
            r4 = 13
            r0.b((int) r4)
            r0.b()
            arbo r0 = defpackage.arbo.e
            aucd r0 = r0.a((defpackage.aucj) r8)
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x0291
            r4 = 0
            goto L_0x0297
        L_0x0291:
            r0.c()
            r4 = 0
            r0.c = r4
        L_0x0297:
            aucj r6 = r0.b
            arbo r6 = (defpackage.arbo) r6
            int r8 = r6.a
            r9 = 1
            r8 = r8 | r9
            r6.a = r8
            r6.b = r14
            aucj r0 = r0.i()
            arbo r0 = (defpackage.arbo) r0
            int r6 = r0.a
            r6 = r6 & r7
            if (r6 == 0) goto L_0x02d4
            arbr r6 = r0.c
            if (r6 == 0) goto L_0x02b3
            goto L_0x02b5
        L_0x02b3:
            arbr r6 = defpackage.arbr.b
        L_0x02b5:
            int r6 = r6.a
            int r6 = defpackage.arbq.a(r6)
            if (r6 != 0) goto L_0x02be
            goto L_0x02d4
        L_0x02be:
            if (r6 != r7) goto L_0x02d4
            java.util.Map r0 = r13.c
            r0.remove(r12)
            java.io.File r0 = r13.a((java.lang.String) r12)
            r0.delete()
            aicn r0 = r13.d
            aico r6 = defpackage.aico.PERSONAL_MODEL_DELETED
            r0.a((defpackage.aico) r6)
            goto L_0x02f6
        L_0x02d4:
            ahot r6 = defpackage.ahov.a((defpackage.arbo) r0)
            if (r6 != 0) goto L_0x02e8
            java.util.Map r6 = r13.c
            boolean r6 = r6.containsKey(r12)
            if (r6 == 0) goto L_0x02ed
            java.util.Map r6 = r13.c
            r6.remove(r12)
            goto L_0x02ed
        L_0x02e8:
            java.util.Map r7 = r13.c
            r7.put(r12, r6)
        L_0x02ed:
            ahys r6 = r13.b(r12)     // Catch:{ IOException -> 0x02f5 }
            r6.a((defpackage.audx) r0)     // Catch:{ IOException -> 0x02f5 }
            goto L_0x02f6
        L_0x02f5:
            r0 = move-exception
        L_0x02f6:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x02fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahou.run():void");
    }
}
