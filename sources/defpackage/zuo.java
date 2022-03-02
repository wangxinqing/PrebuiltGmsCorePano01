package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zuo implements Runnable {
    private final zuk a;
    private final SharedPreferences b;
    private final zsn c;
    private final zty d;
    private final Context e;
    private zsp f;

    static {
        zsg.a("ContactsLoggerTask");
    }

    public zuo(Context context, zuk zuk) {
        SharedPreferences a2 = zti.a(context);
        zui zui = new zui(context, zuk);
        zsn zsn = new zsn(context);
        this.a = zuk;
        this.b = a2;
        this.d = zui;
        this.c = zsn;
        this.e = context;
        if (azdq.g()) {
            this.f = new zsp(5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:196:0x04c3 A[Catch:{ Exception -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04d7 A[Catch:{ Exception -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04ed A[Catch:{ Exception -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04ee A[Catch:{ Exception -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r0 = "romanesco-contacts-logger-upload-version-reset-random"
            boolean r2 = defpackage.azdq.g()
            if (r2 == 0) goto L_0x000f
            zsp r2 = r1.f
            r2.a()
        L_0x000f:
            r2 = 1
            zty r3 = r1.d     // Catch:{ Exception -> 0x056a }
            zuk r4 = r1.a     // Catch:{ Exception -> 0x056a }
            r5 = r3
            zui r5 = (defpackage.zui) r5     // Catch:{ Exception -> 0x056a }
            avdg r5 = r5.a((defpackage.zuk) r4)     // Catch:{ Exception -> 0x056a }
            if (r5 == 0) goto L_0x057d
            java.util.Set r6 = r4.b     // Catch:{ Exception -> 0x056a }
            java.lang.String r7 = r4.a     // Catch:{ Exception -> 0x056a }
            boolean r8 = r6.isEmpty()     // Catch:{ Exception -> 0x056a }
            java.lang.String r9 = "romanesco-contacts-logger-batch-upload-version"
            if (r8 == 0) goto L_0x0035
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x056a }
            if (r8 != 0) goto L_0x0030
            goto L_0x0035
        L_0x0030:
            r22 = r9
            r2 = 0
            goto L_0x04b1
        L_0x0035:
            zru r8 = new zru     // Catch:{ Exception -> 0x056a }
            r11 = r3
            zui r11 = (defpackage.zui) r11     // Catch:{ Exception -> 0x056a }
            android.content.Context r11 = r11.a     // Catch:{ Exception -> 0x056a }
            r8.<init>(r11)     // Catch:{ Exception -> 0x056a }
            r8 = r3
            zui r8 = (defpackage.zui) r8     // Catch:{ Exception -> 0x056a }
            zvd r8 = r8.b     // Catch:{ Exception -> 0x056a }
            amri r8 = r8.a()     // Catch:{ Exception -> 0x056a }
            boolean r11 = r6.contains(r7)     // Catch:{ Exception -> 0x056a }
            boolean r12 = defpackage.azdq.o()     // Catch:{ Exception -> 0x056a }
            boolean r13 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x056a }
            r16 = 65536(0x10000, float:9.18355E-41)
            r14 = 0
            if (r13 != 0) goto L_0x015c
            defpackage.zui.a((java.lang.String) r7, (defpackage.avdg) r5)     // Catch:{ Exception -> 0x0566 }
            defpackage.zui.b((java.lang.String) r7, (defpackage.avdg) r5)     // Catch:{ Exception -> 0x0566 }
            defpackage.zui.a((boolean) r2, (boolean) r11, (defpackage.avdg) r5)     // Catch:{ Exception -> 0x0566 }
            aucj r13 = r5.b     // Catch:{ Exception -> 0x0566 }
            avdi r13 = (defpackage.avdi) r13     // Catch:{ Exception -> 0x0566 }
            aucx r13 = r13.b     // Catch:{ Exception -> 0x0566 }
            int r13 = r13.size()     // Catch:{ Exception -> 0x0566 }
            if (r13 == 0) goto L_0x014a
            avdf r13 = r5.m()     // Catch:{ Exception -> 0x0566 }
            r20 = r11
            long r10 = r13.o     // Catch:{ Exception -> 0x0566 }
            int r13 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r13 == 0) goto L_0x007f
            r22 = r9
            goto L_0x014e
        L_0x007f:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0566 }
            boolean r13 = defpackage.azdq.q()     // Catch:{ Exception -> 0x0566 }
            if (r13 == 0) goto L_0x009e
            r13 = r3
            zui r13 = (defpackage.zui) r13     // Catch:{ Exception -> 0x056a }
            android.content.Context r13 = r13.a     // Catch:{ Exception -> 0x056a }
            android.content.SharedPreferences r13 = defpackage.zti.a(r13)     // Catch:{ Exception -> 0x056a }
            r14 = 0
            int r13 = r13.getInt(r9, r14)     // Catch:{ Exception -> 0x056a }
            boolean r14 = r4.e     // Catch:{ Exception -> 0x056a }
            if (r14 != 0) goto L_0x009f
            int r13 = r13 + 1
            goto L_0x009f
        L_0x009e:
            r13 = 0
        L_0x009f:
            boolean r14 = r4.e     // Catch:{ Exception -> 0x0566 }
            if (r14 != 0) goto L_0x00a5
            r14 = 2
            goto L_0x00a6
        L_0x00a5:
            r14 = 3
        L_0x00a6:
            boolean r15 = defpackage.azdq.q()     // Catch:{ Exception -> 0x0566 }
            if (r15 == 0) goto L_0x00d8
            r15 = r3
            zui r15 = (defpackage.zui) r15     // Catch:{ Exception -> 0x056a }
            android.content.Context r15 = r15.a     // Catch:{ Exception -> 0x056a }
            android.content.SharedPreferences r15 = defpackage.zti.a(r15)     // Catch:{ Exception -> 0x056a }
            r22 = r9
            r2 = -1
            int r9 = r15.getInt(r0, r2)     // Catch:{ Exception -> 0x056a }
            if (r9 != r2) goto L_0x00d6
            java.util.Random r2 = new java.util.Random     // Catch:{ Exception -> 0x056a }
            r2.<init>()     // Catch:{ Exception -> 0x056a }
            r9 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r2.nextInt(r9)     // Catch:{ Exception -> 0x056a }
            android.content.SharedPreferences$Editor r9 = r15.edit()     // Catch:{ Exception -> 0x056a }
            android.content.SharedPreferences$Editor r0 = r9.putInt(r0, r2)     // Catch:{ Exception -> 0x056a }
            r0.apply()     // Catch:{ Exception -> 0x056a }
            goto L_0x00db
        L_0x00d6:
            r2 = r9
            goto L_0x00db
        L_0x00d8:
            r22 = r9
            r2 = 0
        L_0x00db:
            aucj r0 = r5.i()     // Catch:{ Exception -> 0x0566 }
            avdi r0 = (defpackage.avdi) r0     // Catch:{ Exception -> 0x0566 }
            aucx r0 = r0.b     // Catch:{ Exception -> 0x0566 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0566 }
            r9 = 0
        L_0x00e8:
            boolean r15 = r0.hasNext()     // Catch:{ Exception -> 0x0566 }
            if (r15 == 0) goto L_0x014e
            int r15 = r9 + 1
            java.lang.Object r23 = r0.next()     // Catch:{ Exception -> 0x0566 }
            r24 = r0
            r0 = r23
            avdf r0 = (defpackage.avdf) r0     // Catch:{ Exception -> 0x0566 }
            r23 = r15
            r15 = 5
            java.lang.Object r25 = r0.c(r15)     // Catch:{ Exception -> 0x0566 }
            r15 = r25
            aucd r15 = (defpackage.aucd) r15     // Catch:{ Exception -> 0x0566 }
            r15.a((defpackage.aucj) r0)     // Catch:{ Exception -> 0x0566 }
            avdd r15 = (defpackage.avdd) r15     // Catch:{ Exception -> 0x0566 }
            boolean r0 = r15.c     // Catch:{ Exception -> 0x0566 }
            if (r0 != 0) goto L_0x010f
            goto L_0x0115
        L_0x010f:
            r15.c()     // Catch:{ Exception -> 0x0566 }
            r1 = 0
            r15.c = r1     // Catch:{ Exception -> 0x0566 }
        L_0x0115:
            aucj r0 = r15.b     // Catch:{ Exception -> 0x0566 }
            avdf r0 = (defpackage.avdf) r0     // Catch:{ Exception -> 0x0566 }
            avdf r1 = defpackage.avdf.q     // Catch:{ Exception -> 0x0566 }
            int r1 = r0.a     // Catch:{ Exception -> 0x0566 }
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            r0.a = r1     // Catch:{ Exception -> 0x0566 }
            r0.m = r13     // Catch:{ Exception -> 0x0566 }
            r1 = r1 | r16
            r0.a = r1     // Catch:{ Exception -> 0x0566 }
            r0.o = r10     // Catch:{ Exception -> 0x0566 }
            r25 = r10
            r19 = -1
            int r10 = r14 + -1
            r0.p = r10     // Catch:{ Exception -> 0x0566 }
            r10 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r10
            r0.a = r1     // Catch:{ Exception -> 0x0566 }
            r10 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r10
            r0.a = r1     // Catch:{ Exception -> 0x0566 }
            r0.n = r2     // Catch:{ Exception -> 0x0566 }
            r5.a(r9, r15)     // Catch:{ Exception -> 0x0566 }
            r1 = r27
            r9 = r23
            r0 = r24
            r10 = r25
            goto L_0x00e8
        L_0x014a:
            r22 = r9
            r20 = r11
        L_0x014e:
            aucj r0 = r5.i()     // Catch:{ Exception -> 0x0566 }
            avdi r0 = (defpackage.avdi) r0     // Catch:{ Exception -> 0x0566 }
            r1 = r3
            zui r1 = (defpackage.zui) r1     // Catch:{ Exception -> 0x0566 }
            boolean r0 = r1.a((defpackage.zuk) r4, (defpackage.avdi) r0, (java.lang.String) r7)     // Catch:{ Exception -> 0x0566 }
            goto L_0x0161
        L_0x015c:
            r22 = r9
            r20 = r11
            r0 = 1
        L_0x0161:
            defpackage.zui.a((java.util.Set) r6, (defpackage.avdg) r5)     // Catch:{ Exception -> 0x0566 }
            boolean r1 = r4.e     // Catch:{ Exception -> 0x0566 }
            if (r1 == 0) goto L_0x0169
            goto L_0x016e
        L_0x0169:
            if (r12 == 0) goto L_0x016e
            defpackage.zui.b((java.util.Set) r6, (defpackage.avdg) r5)     // Catch:{ Exception -> 0x0566 }
        L_0x016e:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ Exception -> 0x0566 }
            r2 = r0
        L_0x0173:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0566 }
            if (r0 == 0) goto L_0x0447
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x0566 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0566 }
            boolean r9 = r0.equals(r7)     // Catch:{ Exception -> 0x0566 }
            if (r9 != 0) goto L_0x0187
            r9 = 0
            goto L_0x018a
        L_0x0187:
            if (r12 == 0) goto L_0x043d
            r9 = 1
        L_0x018a:
            java.lang.String r10 = defpackage.zru.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0566 }
            if (r10 == 0) goto L_0x042e
            boolean r11 = r5.c     // Catch:{ Exception -> 0x0566 }
            if (r11 != 0) goto L_0x0195
            goto L_0x019b
        L_0x0195:
            r5.c()     // Catch:{ Exception -> 0x0566 }
            r11 = 0
            r5.c = r11     // Catch:{ Exception -> 0x0566 }
        L_0x019b:
            aucj r11 = r5.b     // Catch:{ Exception -> 0x0566 }
            avdi r11 = (defpackage.avdi) r11     // Catch:{ Exception -> 0x0566 }
            avdi r13 = defpackage.avdi.h     // Catch:{ Exception -> 0x0566 }
            r10.getClass()     // Catch:{ Exception -> 0x0566 }
            int r13 = r11.a     // Catch:{ Exception -> 0x0566 }
            r14 = 1
            r13 = r13 | r14
            r11.a = r13     // Catch:{ Exception -> 0x0566 }
            r11.c = r10     // Catch:{ Exception -> 0x0566 }
            defpackage.zui.a((java.lang.String) r0, (defpackage.avdg) r5)     // Catch:{ Exception -> 0x0566 }
            defpackage.zui.b((java.lang.String) r0, (defpackage.avdg) r5)     // Catch:{ Exception -> 0x0566 }
            boolean r10 = defpackage.azdw.b()     // Catch:{ Exception -> 0x0566 }
            if (r10 != 0) goto L_0x01be
            r13 = 2
            r14 = 3
            r17 = -1
            goto L_0x0263
        L_0x01be:
            r10 = r3
            zui r10 = (defpackage.zui) r10     // Catch:{ Exception -> 0x0566 }
            amri r10 = r10.i     // Catch:{ Exception -> 0x0566 }
            boolean r10 = r10.a()     // Catch:{ Exception -> 0x0566 }
            if (r10 == 0) goto L_0x025f
            r10 = r3
            zui r10 = (defpackage.zui) r10     // Catch:{ Exception -> 0x0566 }
            amri r10 = r10.i     // Catch:{ Exception -> 0x0566 }
            java.lang.Object r10 = r10.b()     // Catch:{ Exception -> 0x0566 }
            zth r10 = (defpackage.zth) r10     // Catch:{ Exception -> 0x0566 }
            amri r10 = r10.a()     // Catch:{ Exception -> 0x0566 }
            boolean r11 = r10.a()     // Catch:{ Exception -> 0x0566 }
            if (r11 == 0) goto L_0x0204
            java.lang.Object r10 = r10.b()     // Catch:{ Exception -> 0x0566 }
            com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState r10 = (com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState) r10     // Catch:{ Exception -> 0x0566 }
            int r11 = r10.c     // Catch:{ Exception -> 0x0566 }
            r13 = 1
            if (r11 == r13) goto L_0x0200
            r13 = 2
            if (r11 == r13) goto L_0x01fd
            r14 = 3
            if (r11 == r14) goto L_0x01f1
            r10 = 1
            goto L_0x0207
        L_0x01f1:
            java.lang.String r10 = r10.a     // Catch:{ Exception -> 0x0566 }
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0566 }
            if (r10 == 0) goto L_0x01fb
            r10 = 2
            goto L_0x0207
        L_0x01fb:
            r10 = 3
            goto L_0x0207
        L_0x01fd:
            r14 = 3
            r10 = 4
            goto L_0x0207
        L_0x0200:
            r13 = 2
            r14 = 3
            r10 = 5
            goto L_0x0207
        L_0x0204:
            r13 = 2
            r14 = 3
            r10 = 1
        L_0x0207:
            aucj r11 = r5.b     // Catch:{ Exception -> 0x0566 }
            avdi r11 = (defpackage.avdi) r11     // Catch:{ Exception -> 0x0566 }
            avdq r11 = r11.f     // Catch:{ Exception -> 0x0566 }
            if (r11 == 0) goto L_0x0210
            goto L_0x0212
        L_0x0210:
            avdq r11 = defpackage.avdq.A     // Catch:{ Exception -> 0x0566 }
        L_0x0212:
            r15 = 5
            java.lang.Object r17 = r11.c(r15)     // Catch:{ Exception -> 0x0566 }
            r15 = r17
            aucd r15 = (defpackage.aucd) r15     // Catch:{ Exception -> 0x0566 }
            r15.a((defpackage.aucj) r11)     // Catch:{ Exception -> 0x0566 }
            avdk r15 = (defpackage.avdk) r15     // Catch:{ Exception -> 0x0566 }
            boolean r11 = r15.c     // Catch:{ Exception -> 0x0566 }
            if (r11 != 0) goto L_0x0226
            goto L_0x022c
        L_0x0226:
            r15.c()     // Catch:{ Exception -> 0x0566 }
            r11 = 0
            r15.c = r11     // Catch:{ Exception -> 0x0566 }
        L_0x022c:
            aucj r11 = r15.b     // Catch:{ Exception -> 0x0566 }
            avdq r11 = (defpackage.avdq) r11     // Catch:{ Exception -> 0x0566 }
            r17 = -1
            int r10 = r10 + -1
            r11.z = r10     // Catch:{ Exception -> 0x0566 }
            int r10 = r11.a     // Catch:{ Exception -> 0x0566 }
            r18 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r10 | r18
            r11.a = r10     // Catch:{ Exception -> 0x0566 }
            boolean r10 = r5.c     // Catch:{ Exception -> 0x0566 }
            if (r10 != 0) goto L_0x0243
            goto L_0x0249
        L_0x0243:
            r5.c()     // Catch:{ Exception -> 0x0566 }
            r10 = 0
            r5.c = r10     // Catch:{ Exception -> 0x0566 }
        L_0x0249:
            aucj r10 = r5.b     // Catch:{ Exception -> 0x0566 }
            avdi r10 = (defpackage.avdi) r10     // Catch:{ Exception -> 0x0566 }
            aucj r11 = r15.i()     // Catch:{ Exception -> 0x0566 }
            avdq r11 = (defpackage.avdq) r11     // Catch:{ Exception -> 0x0566 }
            r11.getClass()     // Catch:{ Exception -> 0x0566 }
            r10.f = r11     // Catch:{ Exception -> 0x0566 }
            int r11 = r10.a     // Catch:{ Exception -> 0x0566 }
            r11 = r11 | 16
            r10.a = r11     // Catch:{ Exception -> 0x0566 }
            goto L_0x0263
        L_0x025f:
            r13 = 2
            r14 = 3
            r17 = -1
        L_0x0263:
            aucj r10 = r5.b     // Catch:{ Exception -> 0x0566 }
            avdi r10 = (defpackage.avdi) r10     // Catch:{ Exception -> 0x0566 }
            avdq r10 = r10.f     // Catch:{ Exception -> 0x0566 }
            if (r10 == 0) goto L_0x026c
            goto L_0x026e
        L_0x026c:
            avdq r10 = defpackage.avdq.A     // Catch:{ Exception -> 0x0566 }
        L_0x026e:
            r11 = 5
            java.lang.Object r15 = r10.c(r11)     // Catch:{ Exception -> 0x0566 }
            aucd r15 = (defpackage.aucd) r15     // Catch:{ Exception -> 0x0566 }
            r15.a((defpackage.aucj) r10)     // Catch:{ Exception -> 0x0566 }
            avdk r15 = (defpackage.avdk) r15     // Catch:{ Exception -> 0x0566 }
            boolean r10 = r8.a()     // Catch:{ Exception -> 0x0566 }
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r10 == 0) goto L_0x02a6
            java.lang.Object r10 = r8.b()     // Catch:{ Exception -> 0x0566 }
            boolean r10 = r0.equals(r10)     // Catch:{ Exception -> 0x0566 }
            r18 = 1
            r10 = r10 ^ 1
            boolean r13 = r15.c     // Catch:{ Exception -> 0x0566 }
            if (r13 != 0) goto L_0x0294
            goto L_0x029a
        L_0x0294:
            r15.c()     // Catch:{ Exception -> 0x0566 }
            r13 = 0
            r15.c = r13     // Catch:{ Exception -> 0x0566 }
        L_0x029a:
            aucj r13 = r15.b     // Catch:{ Exception -> 0x0566 }
            avdq r13 = (defpackage.avdq) r13     // Catch:{ Exception -> 0x0566 }
            int r14 = r13.a     // Catch:{ Exception -> 0x0566 }
            r11 = r11 | r14
            r13.a = r11     // Catch:{ Exception -> 0x0566 }
            r13.r = r10     // Catch:{ Exception -> 0x0566 }
            goto L_0x02bd
        L_0x02a6:
            boolean r10 = r15.c     // Catch:{ Exception -> 0x0566 }
            if (r10 != 0) goto L_0x02ab
            goto L_0x02b1
        L_0x02ab:
            r15.c()     // Catch:{ Exception -> 0x0566 }
            r10 = 0
            r15.c = r10     // Catch:{ Exception -> 0x0566 }
        L_0x02b1:
            aucj r10 = r15.b     // Catch:{ Exception -> 0x0566 }
            avdq r10 = (defpackage.avdq) r10     // Catch:{ Exception -> 0x0566 }
            int r13 = r10.a     // Catch:{ Exception -> 0x0566 }
            r11 = r11 | r13
            r10.a = r11     // Catch:{ Exception -> 0x0566 }
            r11 = 1
            r10.r = r11     // Catch:{ Exception -> 0x0566 }
        L_0x02bd:
            boolean r10 = r5.c     // Catch:{ Exception -> 0x0566 }
            if (r10 != 0) goto L_0x02c2
            goto L_0x02c8
        L_0x02c2:
            r5.c()     // Catch:{ Exception -> 0x0566 }
            r10 = 0
            r5.c = r10     // Catch:{ Exception -> 0x0566 }
        L_0x02c8:
            aucj r10 = r5.b     // Catch:{ Exception -> 0x0566 }
            avdi r10 = (defpackage.avdi) r10     // Catch:{ Exception -> 0x0566 }
            aucj r11 = r15.i()     // Catch:{ Exception -> 0x0566 }
            avdq r11 = (defpackage.avdq) r11     // Catch:{ Exception -> 0x0566 }
            r11.getClass()     // Catch:{ Exception -> 0x0566 }
            r10.f = r11     // Catch:{ Exception -> 0x0566 }
            int r11 = r10.a     // Catch:{ Exception -> 0x0566 }
            r11 = r11 | 16
            r10.a = r11     // Catch:{ Exception -> 0x0566 }
            r10 = 1
            defpackage.zui.a((boolean) r9, (boolean) r10, (defpackage.avdg) r5)     // Catch:{ Exception -> 0x0566 }
            boolean r9 = defpackage.azdq.o()     // Catch:{ Exception -> 0x0566 }
            if (r9 == 0) goto L_0x041a
            aucj r9 = r5.b     // Catch:{ Exception -> 0x0566 }
            avdi r9 = (defpackage.avdi) r9     // Catch:{ Exception -> 0x0566 }
            aucx r9 = r9.b     // Catch:{ Exception -> 0x0566 }
            int r9 = r9.size()     // Catch:{ Exception -> 0x0566 }
            if (r9 == 0) goto L_0x037b
            avdf r9 = r5.m()     // Catch:{ Exception -> 0x0566 }
            long r9 = r9.o     // Catch:{ Exception -> 0x0566 }
            r13 = 0
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0372
            aucj r9 = r5.i()     // Catch:{ Exception -> 0x0566 }
            avdi r9 = (defpackage.avdi) r9     // Catch:{ Exception -> 0x0566 }
            aucx r9 = r9.b     // Catch:{ Exception -> 0x0566 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0566 }
            r10 = 0
        L_0x030c:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0566 }
            if (r11 != 0) goto L_0x031c
            r23 = r1
            r14 = r8
            r8 = 131072(0x20000, float:1.83671E-40)
            r9 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0383
        L_0x031c:
            int r11 = r10 + 1
            java.lang.Object r13 = r9.next()     // Catch:{ Exception -> 0x0566 }
            avdf r13 = (defpackage.avdf) r13     // Catch:{ Exception -> 0x0566 }
            r14 = 5
            java.lang.Object r15 = r13.c(r14)     // Catch:{ Exception -> 0x0566 }
            aucd r15 = (defpackage.aucd) r15     // Catch:{ Exception -> 0x0566 }
            r15.a((defpackage.aucj) r13)     // Catch:{ Exception -> 0x0566 }
            avdd r15 = (defpackage.avdd) r15     // Catch:{ Exception -> 0x0566 }
            boolean r13 = r15.c     // Catch:{ Exception -> 0x0566 }
            if (r13 != 0) goto L_0x0335
            goto L_0x033b
        L_0x0335:
            r15.c()     // Catch:{ Exception -> 0x0566 }
            r13 = 0
            r15.c = r13     // Catch:{ Exception -> 0x0566 }
        L_0x033b:
            aucj r13 = r15.b     // Catch:{ Exception -> 0x0566 }
            avdf r13 = (defpackage.avdf) r13     // Catch:{ Exception -> 0x0566 }
            avdf r21 = defpackage.avdf.q     // Catch:{ Exception -> 0x0566 }
            int r14 = r13.a     // Catch:{ Exception -> 0x0566 }
            r14 = r14 | 16384(0x4000, float:2.2959E-41)
            r13.a = r14     // Catch:{ Exception -> 0x0566 }
            r23 = r1
            r1 = 0
            r13.m = r1     // Catch:{ Exception -> 0x0566 }
            r1 = r14 | r16
            r13.a = r1     // Catch:{ Exception -> 0x0566 }
            r14 = r8
            r24 = r9
            r8 = 0
            r13.o = r8     // Catch:{ Exception -> 0x0566 }
            r8 = 0
            r13.p = r8     // Catch:{ Exception -> 0x0566 }
            r8 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r8
            r13.a = r1     // Catch:{ Exception -> 0x0566 }
            r9 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r9
            r13.a = r1     // Catch:{ Exception -> 0x0566 }
            r1 = 0
            r13.n = r1     // Catch:{ Exception -> 0x0566 }
            r5.a(r10, r15)     // Catch:{ Exception -> 0x0566 }
            r10 = r11
            r8 = r14
            r1 = r23
            r9 = r24
            goto L_0x030c
        L_0x0372:
            r23 = r1
            r14 = r8
            r8 = 131072(0x20000, float:1.83671E-40)
            r9 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0383
        L_0x037b:
            r23 = r1
            r14 = r8
            r8 = 131072(0x20000, float:1.83671E-40)
            r9 = 32768(0x8000, float:4.5918E-41)
        L_0x0383:
            aucj r1 = r5.i()     // Catch:{ Exception -> 0x0566 }
            avdi r1 = (defpackage.avdi) r1     // Catch:{ Exception -> 0x0566 }
            zsi r10 = defpackage.zsi.a()     // Catch:{ IllegalArgumentException -> 0x0408 }
            aucx r11 = r1.b     // Catch:{ IllegalArgumentException -> 0x0408 }
            int r11 = r11.size()     // Catch:{ IllegalArgumentException -> 0x0408 }
            aucv r13 = r1.d     // Catch:{ IllegalArgumentException -> 0x0408 }
            int r13 = r13.size()     // Catch:{ IllegalArgumentException -> 0x0408 }
            aveg r15 = defpackage.aveg.q     // Catch:{ IllegalArgumentException -> 0x0408 }
            aucd r15 = r15.o()     // Catch:{ IllegalArgumentException -> 0x0408 }
            boolean r8 = r15.c     // Catch:{ IllegalArgumentException -> 0x0408 }
            if (r8 != 0) goto L_0x03a4
            goto L_0x03aa
        L_0x03a4:
            r15.c()     // Catch:{ IllegalArgumentException -> 0x0408 }
            r8 = 0
            r15.c = r8     // Catch:{ IllegalArgumentException -> 0x0408 }
        L_0x03aa:
            aucj r8 = r15.b     // Catch:{ IllegalArgumentException -> 0x0408 }
            aveg r8 = (defpackage.aveg) r8     // Catch:{ IllegalArgumentException -> 0x0408 }
            r8.o = r11     // Catch:{ IllegalArgumentException -> 0x0408 }
            r8.p = r13     // Catch:{ IllegalArgumentException -> 0x0408 }
            aucj r8 = r15.i()     // Catch:{ IllegalArgumentException -> 0x0408 }
            aveg r8 = (defpackage.aveg) r8     // Catch:{ IllegalArgumentException -> 0x0408 }
            aveu r11 = defpackage.aveu.p     // Catch:{ IllegalArgumentException -> 0x0408 }
            aucd r11 = r11.o()     // Catch:{ IllegalArgumentException -> 0x0408 }
            boolean r13 = r11.c     // Catch:{ IllegalArgumentException -> 0x0408 }
            if (r13 != 0) goto L_0x03c3
            goto L_0x03c9
        L_0x03c3:
            r11.c()     // Catch:{ IllegalArgumentException -> 0x0408 }
            r13 = 0
            r11.c = r13     // Catch:{ IllegalArgumentException -> 0x0408 }
        L_0x03c9:
            aucj r13 = r11.b     // Catch:{ IllegalArgumentException -> 0x0408 }
            aveu r13 = (defpackage.aveu) r13     // Catch:{ IllegalArgumentException -> 0x0408 }
            r8.getClass()     // Catch:{ IllegalArgumentException -> 0x0408 }
            r13.g = r8     // Catch:{ IllegalArgumentException -> 0x0408 }
            r10.a((defpackage.aucd) r11)     // Catch:{ IllegalArgumentException -> 0x0408 }
            byte[] r1 = r1.k()     // Catch:{ IllegalArgumentException -> 0x0408 }
            r8 = r3
            zui r8 = (defpackage.zui) r8     // Catch:{ IllegalArgumentException -> 0x0408 }
            boolean r8 = r8.h     // Catch:{ IllegalArgumentException -> 0x0408 }
            if (r8 == 0) goto L_0x03e8
            r8 = r3
            zui r8 = (defpackage.zui) r8     // Catch:{ IllegalArgumentException -> 0x0408 }
            zsp r8 = r8.j     // Catch:{ IllegalArgumentException -> 0x0408 }
            r8.a()     // Catch:{ IllegalArgumentException -> 0x0408 }
        L_0x03e8:
            r8 = r3
            zui r8 = (defpackage.zui) r8     // Catch:{ IllegalArgumentException -> 0x0408 }
            ztj r8 = r8.g     // Catch:{ IllegalArgumentException -> 0x0408 }
            defpackage.zty.a(r4, r1, r0, r8)     // Catch:{ IllegalArgumentException -> 0x0408 }
            r0 = r3
            zui r0 = (defpackage.zui) r0     // Catch:{ IllegalArgumentException -> 0x0408 }
            boolean r0 = r0.h     // Catch:{ IllegalArgumentException -> 0x0408 }
            if (r0 == 0) goto L_0x0406
            r0 = r3
            zui r0 = (defpackage.zui) r0     // Catch:{ IllegalArgumentException -> 0x0408 }
            zsp r0 = r0.j     // Catch:{ IllegalArgumentException -> 0x0408 }
            r1 = r3
            zui r1 = (defpackage.zui) r1     // Catch:{ IllegalArgumentException -> 0x0408 }
            android.content.Context r1 = r1.a     // Catch:{ IllegalArgumentException -> 0x0408 }
            java.lang.String r8 = "contacts_logger:log_contact_list"
            r0.a(r1, r8)     // Catch:{ IllegalArgumentException -> 0x0408 }
        L_0x0406:
            r0 = 1
            goto L_0x0437
        L_0x0408:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0566 }
            r1 = 0
            r8[r1] = r0     // Catch:{ Exception -> 0x0566 }
            zsi r0 = defpackage.zsi.a()     // Catch:{ Exception -> 0x0566 }
            java.lang.String r1 = "ContactsLogger.contact_list_serialize_failure"
            r0.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0566 }
            r0 = 0
            goto L_0x0437
        L_0x041a:
            r23 = r1
            r14 = r8
            r9 = 32768(0x8000, float:4.5918E-41)
            aucj r1 = r5.i()     // Catch:{ Exception -> 0x0566 }
            avdi r1 = (defpackage.avdi) r1     // Catch:{ Exception -> 0x0566 }
            r8 = r3
            zui r8 = (defpackage.zui) r8     // Catch:{ Exception -> 0x0566 }
            boolean r0 = r8.a((defpackage.zuk) r4, (defpackage.avdi) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0566 }
            goto L_0x0437
        L_0x042e:
            r23 = r1
            r14 = r8
            r9 = 32768(0x8000, float:4.5918E-41)
            r17 = -1
            r0 = 0
        L_0x0437:
            r2 = r2 & r0
            r8 = r14
            r1 = r23
            goto L_0x0173
        L_0x043d:
            r23 = r1
            r14 = r8
            r9 = 32768(0x8000, float:4.5918E-41)
            r17 = -1
            goto L_0x0173
        L_0x0447:
            zsi r0 = defpackage.zsi.a()     // Catch:{ Exception -> 0x0566 }
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0566 }
            r3 = 1
            r1 = r1 ^ r3
            boolean r4 = r6.isEmpty()     // Catch:{ Exception -> 0x0566 }
            r4 = r4 ^ r3
            r5 = r20 ^ 1
            int r3 = r6.size()     // Catch:{ Exception -> 0x0566 }
            aveg r6 = defpackage.aveg.q     // Catch:{ Exception -> 0x0566 }
            aucd r6 = r6.o()     // Catch:{ Exception -> 0x0566 }
            boolean r7 = r6.c     // Catch:{ Exception -> 0x0566 }
            if (r7 != 0) goto L_0x0467
            goto L_0x046d
        L_0x0467:
            r6.c()     // Catch:{ Exception -> 0x0566 }
            r7 = 0
            r6.c = r7     // Catch:{ Exception -> 0x0566 }
        L_0x046d:
            aucj r7 = r6.b     // Catch:{ Exception -> 0x0566 }
            aveg r7 = (defpackage.aveg) r7     // Catch:{ Exception -> 0x0566 }
            r7.n = r3     // Catch:{ Exception -> 0x0566 }
            if (r1 == 0) goto L_0x0481
            if (r4 == 0) goto L_0x0481
            if (r5 == 0) goto L_0x047d
            r1 = 1
            r7.b = r1     // Catch:{ Exception -> 0x0566 }
            goto L_0x048e
        L_0x047d:
            r1 = 1
            r7.a = r1     // Catch:{ Exception -> 0x0566 }
            goto L_0x048e
        L_0x0481:
            if (r1 != 0) goto L_0x0489
            if (r4 == 0) goto L_0x0489
            r1 = 1
            r7.d = r1     // Catch:{ Exception -> 0x0566 }
            goto L_0x048e
        L_0x0489:
            if (r1 == 0) goto L_0x048e
            r1 = 1
            r7.c = r1     // Catch:{ Exception -> 0x0566 }
        L_0x048e:
            aveu r1 = defpackage.aveu.p     // Catch:{ Exception -> 0x0566 }
            aucd r1 = r1.o()     // Catch:{ Exception -> 0x0566 }
            boolean r3 = r1.c     // Catch:{ Exception -> 0x0566 }
            if (r3 != 0) goto L_0x0499
            goto L_0x049f
        L_0x0499:
            r1.c()     // Catch:{ Exception -> 0x0566 }
            r3 = 0
            r1.c = r3     // Catch:{ Exception -> 0x0566 }
        L_0x049f:
            aucj r3 = r1.b     // Catch:{ Exception -> 0x0566 }
            aveu r3 = (defpackage.aveu) r3     // Catch:{ Exception -> 0x0566 }
            aucj r4 = r6.i()     // Catch:{ Exception -> 0x0566 }
            aveg r4 = (defpackage.aveg) r4     // Catch:{ Exception -> 0x0566 }
            r4.getClass()     // Catch:{ Exception -> 0x0566 }
            r3.g = r4     // Catch:{ Exception -> 0x0566 }
            r0.a((defpackage.aucd) r1)     // Catch:{ Exception -> 0x0566 }
        L_0x04b1:
            zsi r0 = defpackage.zsi.a()     // Catch:{ Exception -> 0x0566 }
            aveu r1 = defpackage.aveu.p     // Catch:{ Exception -> 0x0566 }
            aucd r1 = r1.o()     // Catch:{ Exception -> 0x0566 }
            aveg r3 = defpackage.aveg.q     // Catch:{ Exception -> 0x0566 }
            aucd r3 = r3.o()     // Catch:{ Exception -> 0x0566 }
            if (r2 == 0) goto L_0x04d7
            boolean r4 = r3.c     // Catch:{ Exception -> 0x0566 }
            if (r4 != 0) goto L_0x04c8
        L_0x04c7:
            goto L_0x04cf
        L_0x04c8:
            r3.c()     // Catch:{ Exception -> 0x0566 }
            r4 = 0
            r3.c = r4     // Catch:{ Exception -> 0x0566 }
            goto L_0x04c7
        L_0x04cf:
            aucj r4 = r3.b     // Catch:{ Exception -> 0x0566 }
            aveg r4 = (defpackage.aveg) r4     // Catch:{ Exception -> 0x0566 }
            r5 = 1
            r4.k = r5     // Catch:{ Exception -> 0x0566 }
            goto L_0x04e9
        L_0x04d7:
            boolean r4 = r3.c     // Catch:{ Exception -> 0x0566 }
            if (r4 != 0) goto L_0x04dc
            goto L_0x04e2
        L_0x04dc:
            r3.c()     // Catch:{ Exception -> 0x0566 }
            r4 = 0
            r3.c = r4     // Catch:{ Exception -> 0x0566 }
        L_0x04e2:
            aucj r4 = r3.b     // Catch:{ Exception -> 0x0566 }
            aveg r4 = (defpackage.aveg) r4     // Catch:{ Exception -> 0x0566 }
            r5 = 1
            r4.l = r5     // Catch:{ Exception -> 0x0566 }
        L_0x04e9:
            boolean r4 = r1.c     // Catch:{ Exception -> 0x0566 }
            if (r4 != 0) goto L_0x04ee
            goto L_0x04f4
        L_0x04ee:
            r1.c()     // Catch:{ Exception -> 0x0566 }
            r4 = 0
            r1.c = r4     // Catch:{ Exception -> 0x0566 }
        L_0x04f4:
            aucj r4 = r1.b     // Catch:{ Exception -> 0x0566 }
            aveu r4 = (defpackage.aveu) r4     // Catch:{ Exception -> 0x0566 }
            aucj r3 = r3.i()     // Catch:{ Exception -> 0x0566 }
            aveg r3 = (defpackage.aveg) r3     // Catch:{ Exception -> 0x0566 }
            r3.getClass()     // Catch:{ Exception -> 0x0566 }
            r4.g = r3     // Catch:{ Exception -> 0x0566 }
            r0.a((defpackage.aucd) r1)     // Catch:{ Exception -> 0x0566 }
            if (r2 == 0) goto L_0x0563
            r1 = r27
            android.content.SharedPreferences r0 = r1.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            zuk r2 = r1.a
            boolean r3 = r2.e
            if (r3 != 0) goto L_0x0534
            long r2 = r2.c
            java.lang.String r4 = "romanesco-contacts-logger-full-upload-timestamp"
            r0.putLong(r4, r2)
            boolean r2 = defpackage.azdq.q()
            if (r2 == 0) goto L_0x0531
            android.content.SharedPreferences r2 = r1.b
            r3 = r22
            r4 = 0
            int r2 = r2.getInt(r3, r4)
            r4 = 1
            int r2 = r2 + r4
            r0.putInt(r3, r2)
        L_0x0531:
            r0.apply()
        L_0x0534:
            zuk r2 = r1.a
            long r2 = r2.c
            java.lang.String r4 = "romanesco-contacts-logger-incremental-upload-timestamp"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r2)
            java.lang.String r2 = "romanesco-contacts-logger-pending-significant-update"
            r3 = 0
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)
            r0.apply()
            boolean r0 = defpackage.azdq.g()
            if (r0 == 0) goto L_0x0562
            zsp r0 = r1.f
            android.content.Context r2 = r1.e
            zuk r3 = r1.a
            boolean r3 = r3.e
            if (r3 != 0) goto L_0x055b
            java.lang.String r3 = "contacts_logger_task:batch_upload"
            goto L_0x055d
        L_0x055b:
            java.lang.String r3 = "contacts_logger_task:incremental_upload"
        L_0x055d:
            r4 = 1
            r0.a(r2, r3, r4)
        L_0x0562:
            return
        L_0x0563:
            r1 = r27
            goto L_0x057d
        L_0x0566:
            r0 = move-exception
            r1 = r27
            goto L_0x056b
        L_0x056a:
            r0 = move-exception
        L_0x056b:
            zsi r2 = defpackage.zsi.a()
            java.lang.String r3 = "ContactsLoggerTask.logData_failure"
            r2.a((java.lang.String) r3)
            zsn r2 = r1.c
            double r3 = defpackage.azfa.l()
            r2.a(r0, r3)
        L_0x057d:
            boolean r0 = defpackage.azdq.g()
            if (r0 == 0) goto L_0x0597
            zsp r0 = r1.f
            android.content.Context r2 = r1.e
            zuk r3 = r1.a
            boolean r3 = r3.e
            if (r3 != 0) goto L_0x0590
            java.lang.String r3 = "contacts_logger_task:batch_failure"
            goto L_0x0592
        L_0x0590:
            java.lang.String r3 = "contacts_logger_task:incremental_failure"
        L_0x0592:
            r4 = 1
            r0.a(r2, r3, r4)
        L_0x0597:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zuo.run():void");
    }
}
