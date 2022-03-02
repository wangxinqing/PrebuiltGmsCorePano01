package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.SystemClock;

/* renamed from: dvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvp extends AsyncTask {
    private final dwj a;
    private final Context b;
    private final Intent c;
    private final long d = SystemClock.uptimeMillis();
    private final dwd e;
    private final dwe f;
    private final dvo g;

    public dvp(Context context, Intent intent, dwe dwe, dvo dvo) {
        this.a = dwj.a(context);
        this.e = new dwd(context);
        this.b = context.getApplicationContext();
        this.c = intent;
        this.f = dwe;
        this.g = dvo;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0080, code lost:
        if (r0.e >= java.lang.System.currentTimeMillis()) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0599, code lost:
        if (defpackage.eaq.a(r14, r0) != false) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0147, code lost:
        if ((r0.a & 8) != 0) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03e6 A[SYNTHETIC, Splitter:B:165:0x03e6] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0703  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0717  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x071a  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0783  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x07dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r41) {
        /*
            r40 = this;
            r1 = r40
            r0 = r41
            java.lang.Void[] r0 = (java.lang.Void[]) r0
            android.content.Intent r0 = r1.c
            java.lang.String r2 = "com.google.android.gms.appinvite.FROM_INTENT_URL"
            r3 = 0
            boolean r0 = r0.getBooleanExtra(r2, r3)
            r4 = 2
            if (r0 != 0) goto L_0x0014
            r5 = 2
            goto L_0x0015
        L_0x0014:
            r5 = 3
        L_0x0015:
            android.content.Intent r0 = r1.c
            java.lang.String r7 = r0.getDataString()
            android.content.Intent r0 = r1.c
            awhr r6 = defpackage.awhr.a
            awhv r6 = r6.a()
            boolean r6 = r6.q()
            if (r6 == 0) goto L_0x0084
            java.lang.String r6 = "signature"
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r9 = "response"
            java.lang.String r0 = r0.getStringExtra(r9)
            byte[] r0 = defpackage.jhy.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r9 = "SHA256withECDSA"
            java.security.Signature r9 = java.security.Signature.getInstance(r9)     // Catch:{ Exception -> 0x0083 }
            java.security.spec.X509EncodedKeySpec r10 = new java.security.spec.X509EncodedKeySpec     // Catch:{ Exception -> 0x0083 }
            awhr r11 = defpackage.awhr.a     // Catch:{ Exception -> 0x0083 }
            awhv r11 = r11.a()     // Catch:{ Exception -> 0x0083 }
            java.lang.String r11 = r11.r()     // Catch:{ Exception -> 0x0083 }
            byte[] r11 = defpackage.jhy.a((java.lang.String) r11)     // Catch:{ Exception -> 0x0083 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r11 = "EC"
            java.security.KeyFactory r11 = java.security.KeyFactory.getInstance(r11)     // Catch:{ Exception -> 0x0083 }
            java.security.PublicKey r10 = r11.generatePublic(r10)     // Catch:{ Exception -> 0x0083 }
            r9.initVerify(r10)     // Catch:{ Exception -> 0x0083 }
            r9.update(r0)     // Catch:{ Exception -> 0x0083 }
            byte[] r6 = defpackage.jhy.a((java.lang.String) r6)     // Catch:{ Exception -> 0x0083 }
            boolean r6 = r9.verify(r6)     // Catch:{ Exception -> 0x0083 }
            if (r6 == 0) goto L_0x0084
            aubs r6 = defpackage.aubs.c()     // Catch:{ Exception -> 0x0083 }
            avfa r9 = defpackage.avfa.f     // Catch:{ Exception -> 0x0083 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r9, (byte[]) r0, (defpackage.aubs) r6)     // Catch:{ Exception -> 0x0083 }
            avfa r0 = (defpackage.avfa) r0     // Catch:{ Exception -> 0x0083 }
            long r9 = r0.e     // Catch:{ Exception -> 0x0083 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0083 }
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x0084
            goto L_0x0085
        L_0x0083:
            r0 = move-exception
        L_0x0084:
            r0 = 0
        L_0x0085:
            r14 = 1
            if (r0 == 0) goto L_0x008a
            goto L_0x0121
        L_0x008a:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 != 0) goto L_0x0121
            com.google.android.gms.common.internal.ClientContext r0 = new com.google.android.gms.common.internal.ClientContext
            r0.<init>()
            int r6 = android.os.Process.myUid()
            r0.b = r6
            android.content.Context r6 = r1.b
            java.lang.String r6 = r6.getPackageName()
            r0.e = r6
            android.content.Context r6 = r1.b
            java.lang.String r6 = r6.getPackageName()
            r0.f = r6
            dwj r6 = r1.a
            dwi r6 = r6.a
            avfa r6 = r6.a(r0, r7)
            if (r6 == 0) goto L_0x0122
            int r9 = r6.a
            r9 = r9 & r14
            if (r9 == 0) goto L_0x0122
            avgk r9 = r6.b
            if (r9 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            avgk r9 = defpackage.avgk.g
        L_0x00c1:
            java.lang.String r9 = r9.f
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0120
            dwj r9 = r1.a
            avgk r6 = r6.b
            if (r6 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            avgk r6 = defpackage.avgk.g
        L_0x00d2:
            java.lang.String r6 = r6.f
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = r6.getScheme()
            r10[r3] = r11
            java.lang.String r11 = r6.getHost()
            r10[r14] = r11
            java.lang.String r11 = "%s://%s"
            java.lang.String r17 = java.lang.String.format(r11, r10)
            java.lang.String r18 = r6.getPath()
            iyn r6 = new iyn
            android.content.Context r10 = r9.b
            boolean r19 = defpackage.awhr.d()
            boolean r20 = defpackage.awhr.h()
            java.lang.String r21 = defpackage.awhr.c()
            java.lang.String r22 = defpackage.awhr.e()
            r24 = 0
            java.lang.String r23 = "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk"
            r15 = r6
            r16 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            dwi r10 = new dwi
            android.content.Context r9 = r9.b
            dwg r11 = new dwg
            r11.<init>(r6)
            r10.<init>(r9, r11)
            avfa r0 = r10.a(r0, r7)
            r6 = r0
            goto L_0x0122
        L_0x0120:
            goto L_0x0122
        L_0x0121:
            r6 = r0
        L_0x0122:
            r9 = 4
            if (r6 != 0) goto L_0x0127
            goto L_0x0386
        L_0x0127:
            int r0 = r6.a
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0386
            avgk r0 = r6.b
            if (r0 == 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            avgk r0 = defpackage.avgk.g
        L_0x0133:
            java.lang.String r0 = r0.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x013c
            goto L_0x0149
        L_0x013c:
            avgk r0 = r6.b
            if (r0 == 0) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            avgk r0 = defpackage.avgk.g
        L_0x0143:
            int r0 = r0.a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0386
        L_0x0149:
            avgk r0 = r6.b
            if (r0 == 0) goto L_0x014f
            r10 = r0
            goto L_0x0152
        L_0x014f:
            avgk r0 = defpackage.avgk.g
            r10 = r0
        L_0x0152:
            int r0 = r10.a
            r0 = r0 & 8
            if (r0 != 0) goto L_0x015d
            r0 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            goto L_0x018e
        L_0x015d:
            avfb r0 = r10.e
            if (r0 == 0) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            avfb r0 = defpackage.avfb.d
        L_0x0164:
            java.lang.String r11 = r0.b
            int r12 = r0.a
            r12 = r12 & r4
            if (r12 == 0) goto L_0x016f
            int r0 = r0.c
            r12 = r0
            goto L_0x0170
        L_0x016f:
            r12 = 0
        L_0x0170:
            android.content.Context r0 = r1.b
            boolean r13 = defpackage.jhg.g(r0, r11)
            if (r13 == 0) goto L_0x018d
            android.content.Context r0 = r1.b     // Catch:{ NameNotFoundException -> 0x018a }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x018a }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r11, r3)     // Catch:{ NameNotFoundException -> 0x018a }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x018a }
            if (r0 >= r12) goto L_0x0188
            r0 = 1
            goto L_0x018e
        L_0x0188:
            r0 = 0
            goto L_0x018e
        L_0x018a:
            r0 = move-exception
            r0 = 0
            goto L_0x018e
        L_0x018d:
            r0 = 0
        L_0x018e:
            java.lang.String r15 = r10.c
            java.lang.String r8 = r10.b
            avge r10 = r10.d
            if (r10 == 0) goto L_0x0197
            goto L_0x0199
        L_0x0197:
            avge r10 = defpackage.avge.d
        L_0x0199:
            java.lang.String r10 = r10.b
            boolean r16 = defpackage.eaq.a((java.lang.String) r8)
            if (r16 == 0) goto L_0x01b5
            android.net.Uri r14 = android.net.Uri.parse(r8)
            java.lang.String r3 = "url"
            java.lang.String r3 = r14.getQueryParameter(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x01b3
            r3 = 0
            goto L_0x01b6
        L_0x01b3:
            r3 = 1
            goto L_0x01b6
        L_0x01b5:
            r3 = 0
        L_0x01b6:
            int r14 = r6.a
            r14 = r14 & r9
            if (r14 != 0) goto L_0x01d2
            r21 = r0
            r0 = 0
            r2 = 0
            r4 = 0
            r9 = 0
            r14 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = 0
            goto L_0x026a
        L_0x01d2:
            avfo r14 = r6.d
            if (r14 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            avfo r14 = defpackage.avfo.l
        L_0x01d9:
            int r14 = r14.a
            r14 = r14 & 32
            if (r14 != 0) goto L_0x01f6
            r21 = r0
            r0 = 0
            r2 = 0
            r4 = 0
            r9 = 0
            r14 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = 0
            goto L_0x026a
        L_0x01f6:
            avfo r14 = r6.d
            if (r14 == 0) goto L_0x01fb
            goto L_0x01fd
        L_0x01fb:
            avfo r14 = defpackage.avfo.l
        L_0x01fd:
            java.lang.String r9 = r14.f
            java.lang.String r2 = r14.i
            avha r4 = r14.g
            if (r4 == 0) goto L_0x0206
            goto L_0x0208
        L_0x0206:
            avha r4 = defpackage.avha.d
        L_0x0208:
            java.lang.String r4 = r4.b
            r21 = r0
            avha r0 = r14.g
            if (r0 == 0) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            avha r0 = defpackage.avha.d
        L_0x0213:
            int r0 = r0.a
            int r0 = defpackage.avgz.a(r0)
            if (r0 == 0) goto L_0x021c
            goto L_0x021d
        L_0x021c:
            r0 = 1
        L_0x021d:
            r22 = r2
            avha r2 = r14.g
            if (r2 == 0) goto L_0x0224
            goto L_0x0226
        L_0x0224:
            avha r2 = defpackage.avha.d
        L_0x0226:
            java.lang.String r2 = r2.c
            r23 = r2
            java.lang.String r2 = r14.h
            r24 = r2
            r2 = 2
            if (r0 != r2) goto L_0x0233
            r2 = 3
            goto L_0x0244
        L_0x0233:
            r2 = 3
            if (r0 == r2) goto L_0x0244
            r25 = r0
            r0 = 0
            r2 = 0
            r14 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            goto L_0x026a
        L_0x0244:
            java.lang.String r2 = r14.b
            r25 = r0
            java.lang.String r0 = r14.d
            boolean r26 = defpackage.awhs.e()
            if (r26 == 0) goto L_0x025f
            r26 = r0
            java.lang.String r0 = r14.j
            r27 = r0
            java.lang.String r0 = r14.k
            r39 = r27
            r27 = r0
            r0 = r39
            goto L_0x0264
        L_0x025f:
            r26 = r0
            r0 = 0
            r27 = 0
        L_0x0264:
            r28 = r0
            java.lang.String r0 = r14.c
            java.lang.String r14 = r14.e
        L_0x026a:
            r29 = r0
            dwd r0 = r1.e
            dlc r0 = r0.a()
            r30 = r2
            avga r2 = r6.c
            if (r2 == 0) goto L_0x0279
            goto L_0x027b
        L_0x0279:
            avga r2 = defpackage.avga.c
        L_0x027b:
            defpackage.dwd.a((defpackage.dlc) r0, (defpackage.avga) r2)
            avga r0 = r6.c
            if (r0 == 0) goto L_0x0283
            goto L_0x0285
        L_0x0283:
            avga r0 = defpackage.avga.c
        L_0x0285:
            avft r0 = r0.b
            if (r0 == 0) goto L_0x028a
            goto L_0x028c
        L_0x028a:
            avft r0 = defpackage.avft.c
        L_0x028c:
            aucx r0 = r0.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02bc
            r6 = r14
            r2 = r21
            r31 = r24
            r14 = r28
            r28 = 1
            r21 = r13
            r24 = r22
            r13 = r26
            r26 = r4
            r22 = r5
            r5 = r25
            r4 = r30
            r25 = r9
            r9 = r12
            r12 = r11
            r11 = r15
            r15 = r8
            r8 = r3
            r3 = r29
            r39 = r23
            r23 = r7
            r7 = r39
            goto L_0x03cb
        L_0x02bc:
            avga r0 = r6.c
            if (r0 == 0) goto L_0x02c1
            goto L_0x02c3
        L_0x02c1:
            avga r0 = defpackage.avga.c
        L_0x02c3:
            avft r0 = r0.b
            if (r0 == 0) goto L_0x02c8
            goto L_0x02ca
        L_0x02c8:
            avft r0 = defpackage.avft.c
        L_0x02ca:
            aucx r0 = r0.b
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            avfu r0 = (defpackage.avfu) r0
            aucx r0 = r0.f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0303
            r6 = r14
            r2 = r21
            r31 = r24
            r14 = r28
            r28 = 1
            r21 = r13
            r24 = r22
            r13 = r26
            r26 = r4
            r22 = r5
            r5 = r25
            r4 = r30
            r25 = r9
            r9 = r12
            r12 = r11
            r11 = r15
            r15 = r8
            r8 = r3
            r3 = r29
            r39 = r23
            r23 = r7
            r7 = r39
            goto L_0x03cb
        L_0x0303:
            avga r0 = r6.c
            if (r0 == 0) goto L_0x0308
            goto L_0x030a
        L_0x0308:
            avga r0 = defpackage.avga.c
        L_0x030a:
            avft r0 = r0.b
            if (r0 == 0) goto L_0x030f
            goto L_0x0311
        L_0x030f:
            avft r0 = defpackage.avft.c
        L_0x0311:
            aucx r0 = r0.b
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            avfu r0 = (defpackage.avfu) r0
            aucx r0 = r0.f
            java.lang.Object r0 = r0.get(r2)
            avfs r0 = (defpackage.avfs) r0
            java.lang.String r0 = r0.b
            java.lang.String r2 = "Email"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0354
            r6 = r14
            r2 = r21
            r31 = r24
            r14 = r28
            r28 = 3
            r21 = r13
            r24 = r22
            r13 = r26
            r26 = r4
            r22 = r5
            r5 = r25
            r4 = r30
            r25 = r9
            r9 = r12
            r12 = r11
            r11 = r15
            r15 = r8
            r8 = r3
            r3 = r29
            r39 = r23
            r23 = r7
            r7 = r39
            goto L_0x03cb
        L_0x0354:
            java.lang.String r2 = "Sms"
            boolean r0 = r2.equals(r0)
            r6 = r14
            r2 = r21
            r31 = r24
            r14 = r28
            if (r0 == 0) goto L_0x0366
            r28 = 4
            goto L_0x0368
        L_0x0366:
            r28 = 1
        L_0x0368:
            r21 = r13
            r24 = r22
            r13 = r26
            r26 = r4
            r22 = r5
            r5 = r25
            r4 = r30
            r25 = r9
            r9 = r12
            r12 = r11
            r11 = r15
            r15 = r8
            r8 = r3
            r3 = r29
            r39 = r23
            r23 = r7
            r7 = r39
            goto L_0x03cb
        L_0x0386:
            android.content.Intent r0 = r1.c
            android.net.Uri r0 = r0.getData()
            if (r0 == 0) goto L_0x03aa
            java.lang.String r2 = "_nr"
            java.lang.String r3 = r0.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x03aa
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r3 = "1"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
            java.lang.String r0 = r0.toString()
            r8 = r0
            goto L_0x03ab
        L_0x03aa:
            r8 = 0
        L_0x03ab:
            r22 = r5
            r23 = r7
            r15 = r8
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 1
            r31 = 0
        L_0x03cb:
            r29 = r14
            android.content.Context r14 = r1.b
            r30 = r13
            android.content.Intent r13 = r1.c
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x03e2
            boolean r0 = defpackage.jhg.g(r14, r12)
            if (r0 == 0) goto L_0x03e2
            r32 = 1
            goto L_0x03e4
        L_0x03e2:
            r32 = 0
        L_0x03e4:
            if (r32 == 0) goto L_0x040b
            android.content.pm.PackageManager r0 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0406 }
            r33 = r6
            r6 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r12, r6)     // Catch:{ NameNotFoundException -> 0x0404 }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0404 }
            if (r0 == 0) goto L_0x0400
            android.content.pm.PackageManager r0 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0404 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r6)     // Catch:{ NameNotFoundException -> 0x0404 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0404 }
            goto L_0x0403
        L_0x0400:
            r0 = 0
            r32 = 0
        L_0x0403:
            goto L_0x040e
        L_0x0404:
            r0 = move-exception
            goto L_0x0409
        L_0x0406:
            r0 = move-exception
            r33 = r6
        L_0x0409:
            r0 = 0
            goto L_0x040e
        L_0x040b:
            r33 = r6
            r0 = 0
        L_0x040e:
            java.lang.String r6 = "android.intent.action.VIEW"
            if (r32 != 0) goto L_0x0413
            goto L_0x0421
        L_0x0413:
            if (r9 != 0) goto L_0x041f
            r35 = r3
            r37 = r4
            r34 = r7
            r32 = r9
            goto L_0x0548
        L_0x041f:
            if (r0 >= r9) goto L_0x0540
        L_0x0421:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0536
            boolean r0 = defpackage.eaq.a((java.lang.String) r15)
            if (r0 != 0) goto L_0x04c0
            android.net.Uri r0 = android.net.Uri.parse(r15)
            r32 = r9
            java.lang.String r9 = r0.getHost()
            if (r9 == 0) goto L_0x04a8
            r34 = r7
            java.lang.String r7 = ".app.goo.gl"
            boolean r9 = r9.endsWith(r7)
            if (r9 == 0) goto L_0x04a3
            android.net.Uri r9 = android.net.Uri.parse(r15)
            java.lang.String r9 = r9.getHost()
            boolean r7 = r9.endsWith(r7)
            if (r7 == 0) goto L_0x045f
            int r7 = r9.length()
            int r7 = r7 + -11
            r35 = r3
            r3 = 0
            java.lang.String r7 = r9.substring(r3, r7)
            goto L_0x0462
        L_0x045f:
            r35 = r3
            r7 = 0
        L_0x0462:
            android.net.Uri$Builder r3 = r0.buildUpon()
            java.lang.String r9 = "goo.gl"
            r3.authority(r9)
            java.lang.String r0 = r0.getPath()
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r9 = r9.length()
            java.lang.String r36 = java.lang.String.valueOf(r0)
            int r36 = r36.length()
            r37 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r18 = 4
            int r9 = r9 + 4
            int r9 = r9 + r36
            r4.<init>(r9)
            java.lang.String r9 = "app/"
            r4.append(r9)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.encodedPath(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x04af
        L_0x04a3:
            r35 = r3
            r37 = r4
            goto L_0x04ae
        L_0x04a8:
            r35 = r3
            r37 = r4
            r34 = r7
        L_0x04ae:
            r0 = r15
        L_0x04af:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r6)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r0 = r3.setData(r0)
            defpackage.eaq.a((android.content.Intent) r13, (android.content.Intent) r0)
            goto L_0x052b
        L_0x04c0:
            r35 = r3
            r37 = r4
            r34 = r7
            r32 = r9
            awhr r0 = defpackage.awhr.a
            awhv r0 = r0.a()
            boolean r0 = r0.p()
            java.lang.String r3 = "com.android.vending"
            if (r0 != 0) goto L_0x04ec
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            android.net.Uri r4 = android.net.Uri.parse(r15)
            android.content.Intent r0 = r0.setData(r4)
            r0.setPackage(r3)
            r3 = 335544320(0x14000000, float:6.4623485E-27)
            r0.addFlags(r3)
            goto L_0x052b
        L_0x04ec:
            java.lang.String r0 = r14.getPackageName()
            java.lang.String r4 = "market://details"
            android.net.Uri r4 = android.net.Uri.parse(r4)
            android.net.Uri$Builder r4 = r4.buildUpon()
            java.lang.String r7 = "id"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r7, r12)
            android.net.Uri r7 = android.net.Uri.parse(r15)
            java.lang.String r9 = "referrer"
            java.lang.String r7 = r7.getQueryParameter(r9)
            boolean r13 = android.text.TextUtils.isEmpty(r7)
            if (r13 != 0) goto L_0x0513
            r4.appendQueryParameter(r9, r7)
        L_0x0513:
            android.content.Intent r7 = new android.content.Intent
            android.net.Uri r4 = r4.build()
            r7.<init>(r6, r4)
            r7.setPackage(r3)
            java.lang.String r3 = "overlay"
            r4 = 1
            r7.putExtra(r3, r4)
            java.lang.String r3 = "callerId"
            r7.putExtra(r3, r0)
            r0 = r7
        L_0x052b:
            boolean r3 = defpackage.eaq.a((android.content.Context) r14, (android.content.Intent) r0)
            if (r3 == 0) goto L_0x0533
            goto L_0x059d
        L_0x0533:
            r0 = 0
            goto L_0x059d
        L_0x0536:
            r35 = r3
            r37 = r4
            r34 = r7
            r32 = r9
            r0 = 0
            goto L_0x059d
        L_0x0540:
            r35 = r3
            r37 = r4
            r34 = r7
            r32 = r9
        L_0x0548:
            android.content.pm.PackageManager r0 = r14.getPackageManager()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r12)
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L_0x058d
            android.net.Uri r3 = android.net.Uri.parse(r11)
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 != 0) goto L_0x056e
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r4 = "invitation_id"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r10)
            android.net.Uri r3 = r3.build()
        L_0x056e:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r6)
            android.content.Intent r4 = r4.setPackage(r12)
            defpackage.eaq.a((android.content.Intent) r13, (android.content.Intent) r4)
            r4.setData(r3)
            defpackage.dwa.a((java.lang.String) r10, (java.lang.String) r11, (android.content.Intent) r4)
            boolean r6 = defpackage.eaq.a((android.content.Context) r14, (android.content.Intent) r4)
            if (r6 == 0) goto L_0x0588
            r0 = r4
            goto L_0x059d
        L_0x0588:
            if (r0 == 0) goto L_0x058d
            r0.setData(r3)
        L_0x058d:
            if (r0 == 0) goto L_0x059c
            defpackage.eaq.a((android.content.Intent) r13, (android.content.Intent) r0)
            defpackage.dwa.a((java.lang.String) r10, (java.lang.String) r11, (android.content.Intent) r0)
            boolean r3 = defpackage.eaq.a((android.content.Context) r14, (android.content.Intent) r0)
            if (r3 == 0) goto L_0x059c
            goto L_0x059d
        L_0x059c:
            r0 = 0
        L_0x059d:
            if (r0 == 0) goto L_0x0703
            r3 = r21 ^ 1
            boolean r4 = defpackage.eaq.a((android.content.Intent) r0)
            if (r21 != 0) goto L_0x05a9
            r14 = 0
            goto L_0x05d6
        L_0x05a9:
            if (r2 != 0) goto L_0x05d5
            android.content.Context r6 = r1.b
            android.net.Uri r7 = r0.getData()
            if (r7 == 0) goto L_0x05d5
            android.content.ComponentName r7 = r0.getComponent()
            if (r7 == 0) goto L_0x05c7
            android.content.ComponentName r7 = r0.getComponent()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x05d5
        L_0x05c7:
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r7 = 0
            android.content.pm.ResolveInfo r6 = r6.resolveActivity(r0, r7)
            if (r6 != 0) goto L_0x05d3
            goto L_0x05d5
        L_0x05d3:
            r14 = 1
            goto L_0x05d6
        L_0x05d5:
            r14 = 0
        L_0x05d6:
            int r6 = r5 + -1
            android.content.Context r7 = r1.b
            ivk r7 = defpackage.eau.a(r7, r12)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r9 = "Existence Indicator"
            r7.putString(r9, r9)
            java.lang.String r9 = "invitationId"
            r7.putString(r9, r10)
            java.lang.String r9 = "deepLink"
            r7.putString(r9, r11)
            java.lang.String r9 = "isNewInstall"
            r7.putBoolean(r9, r3)
            java.lang.String r9 = "isInlineInstall"
            r7.putBoolean(r9, r4)
            int r9 = r28 + -1
            java.lang.String r13 = "invitationChannel"
            r7.putInt(r13, r9)
            java.lang.String r9 = "launchFromContinueUrl"
            r7.putBoolean(r9, r8)
            java.lang.String r8 = "scionInstallEvent"
            r9 = 0
            r7.putBoolean(r8, r9)
            java.lang.String r8 = "loggerInstallEvent"
            r7.putBoolean(r8, r9)
            java.lang.String r8 = "hasReturnedInvitation"
            r7.putBoolean(r8, r9)
            java.lang.String r8 = "isUpgradeInstall"
            r7.putBoolean(r8, r2)
            java.lang.String r8 = "scionSource"
            r9 = r37
            r7.putString(r8, r9)
            java.lang.String r8 = "scionMedium"
            r9 = r35
            r7.putString(r8, r9)
            java.lang.String r8 = "scionLinkName"
            r9 = r34
            r7.putString(r8, r9)
            java.lang.String r8 = "scionLinkId"
            r9 = r33
            r7.putString(r8, r9)
            java.lang.String r8 = "scionCampaign"
            r9 = r30
            r7.putString(r8, r9)
            boolean r8 = defpackage.awhs.e()
            if (r8 == 0) goto L_0x0653
            java.lang.String r8 = "scionContent"
            r9 = r29
            r7.putString(r8, r9)
            java.lang.String r8 = "scionTerm"
            r9 = r27
            r7.putString(r8, r9)
        L_0x0653:
            java.lang.String r8 = "requestedLink"
            r13 = r26
            r7.putString(r8, r13)
            java.lang.String r8 = "requestedLinkType"
            r7.putInt(r8, r6)
            java.lang.String r6 = "appCode"
            r9 = r25
            r7.putString(r6, r9)
            java.lang.String r6 = "domainUriPrefix"
            r8 = r24
            r7.putString(r6, r8)
            java.lang.String r6 = "sessionId"
            r18 = r13
            r13 = r31
            r7.putString(r6, r13)
            java.lang.String r6 = "minVersionCode"
            r24 = r3
            r3 = r32
            r7.putInt(r6, r3)
            r26 = r8
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "creationTimestamp"
            r7.putLong(r6, r8)
            r7.commit()
            awhr r6 = defpackage.awhr.a
            awhv r6 = r6.a()
            boolean r6 = r6.s()
            if (r6 != 0) goto L_0x06a7
            r41 = r12
            r3 = r18
            r23 = r25
            r18 = r4
            r25 = r11
            r4 = r13
            goto L_0x0700
        L_0x06a7:
            if (r21 != 0) goto L_0x06b5
        L_0x06a9:
            r41 = r12
            r3 = r18
            r23 = r25
            r18 = r4
            r25 = r11
            r4 = r13
            goto L_0x0700
        L_0x06b5:
            if (r2 == 0) goto L_0x06b8
            goto L_0x06a9
        L_0x06b8:
            boolean r6 = android.text.TextUtils.isEmpty(r10)
            if (r6 != 0) goto L_0x06cb
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "com.google.firebase.appinvite.fdl.extension.InvitationId"
            r6.putString(r7, r10)
            r27 = r6
            goto L_0x06cd
        L_0x06cb:
            r27 = 0
        L_0x06cd:
            com.google.firebase.dynamiclinks.internal.DynamicLinkData r10 = new com.google.firebase.dynamiclinks.internal.DynamicLinkData
            android.content.Context r6 = r1.b
            java.lang.Long r6 = defpackage.eau.d(r6, r12)
            long r29 = r6.longValue()
            r31 = 0
            r6 = r10
            r7 = r23
            r9 = r26
            r8 = r11
            r23 = r25
            r9 = r3
            r38 = r10
            r3 = r11
            r10 = r29
            r41 = r12
            r12 = r27
            r25 = r3
            r3 = r18
            r18 = r4
            r4 = r13
            r13 = r31
            r6.<init>(r7, r8, r9, r10, r12, r13)
            java.lang.String r6 = "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA"
            r7 = r38
            defpackage.ivy.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r7, (android.content.Intent) r0, (java.lang.String) r6)
        L_0x0700:
            r6 = r24
            goto L_0x0713
        L_0x0703:
            r41 = r12
            r23 = r25
            r3 = r26
            r4 = r31
            r25 = r11
            r26 = r24
            r6 = 0
            r14 = 0
            r18 = 0
        L_0x0713:
            dwe r7 = r1.f
            if (r18 == 0) goto L_0x071a
            r19 = 3
            goto L_0x0721
        L_0x071a:
            if (r6 == 0) goto L_0x071f
            r19 = 2
            goto L_0x0721
        L_0x071f:
            r19 = 1
        L_0x0721:
            if (r21 == 0) goto L_0x0726
            r15 = r25
            goto L_0x0727
        L_0x0726:
        L_0x0727:
            long r8 = android.os.SystemClock.uptimeMillis()
            long r10 = r1.d
            long r8 = r8 - r10
            anqz r10 = defpackage.anqz.j
            aucd r10 = r10.o()
            boolean r11 = android.text.TextUtils.isEmpty(r41)
            if (r11 != 0) goto L_0x077e
            anrr r11 = defpackage.anrr.c
            aucd r11 = r11.o()
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x0745
            goto L_0x074b
        L_0x0745:
            r11.c()
            r12 = 0
            r11.c = r12
        L_0x074b:
            aucj r12 = r11.b
            anrr r12 = (defpackage.anrr) r12
            r41.getClass()
            int r13 = r12.a
            r18 = 2
            r13 = r13 | 2
            r12.a = r13
            r13 = r41
            r12.b = r13
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x0763
            goto L_0x0769
        L_0x0763:
            r10.c()
            r12 = 0
            r10.c = r12
        L_0x0769:
            aucj r12 = r10.b
            anqz r12 = (defpackage.anqz) r12
            aucj r11 = r11.i()
            anrr r11 = (defpackage.anrr) r11
            r11.getClass()
            r12.b = r11
            int r11 = r12.a
            r13 = 1
            r11 = r11 | r13
            r12.a = r11
        L_0x077e:
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x0783
            goto L_0x0789
        L_0x0783:
            r10.c()
            r11 = 0
            r10.c = r11
        L_0x0789:
            aucj r11 = r10.b
            anqz r11 = (defpackage.anqz) r11
            int r12 = r28 + -1
            r11.c = r12
            int r12 = r11.a
            r13 = 2
            r12 = r12 | r13
            r11.a = r12
            int r13 = r19 + -1
            r11.d = r13
            r12 = r12 | 8
            r11.a = r12
            r12 = r12 | 16
            r11.a = r12
            r11.e = r14
            boolean r11 = android.text.TextUtils.isEmpty(r23)
            if (r11 == 0) goto L_0x07b1
            boolean r11 = android.text.TextUtils.isEmpty(r26)
            if (r11 != 0) goto L_0x07d3
        L_0x07b1:
            r11 = r23
            r12 = r26
            anrm r3 = defpackage.dwe.a(r11, r12, r3, r5, r15)
            boolean r5 = r10.c
            if (r5 != 0) goto L_0x07be
            goto L_0x07c4
        L_0x07be:
            r10.c()
            r5 = 0
            r10.c = r5
        L_0x07c4:
            aucj r5 = r10.b
            anqz r5 = (defpackage.anqz) r5
            r3.getClass()
            r5.f = r3
            int r3 = r5.a
            r3 = r3 | 32
            r5.a = r3
        L_0x07d3:
            int r2 = defpackage.dwe.a((boolean) r6, (boolean) r2)
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x07dc
            goto L_0x07e2
        L_0x07dc:
            r10.c()
            r3 = 0
            r10.c = r3
        L_0x07e2:
            aucj r3 = r10.b
            anqz r3 = (defpackage.anqz) r3
            int r2 = r2 + -1
            r3.g = r2
            int r2 = r3.a
            r2 = r2 | 64
            r3.a = r2
            r2 = r2 | 128(0x80, float:1.794E-43)
            r3.a = r2
            r3.h = r8
            int r5 = r22 + -1
            r3.i = r5
            r2 = r2 | 256(0x100, float:3.59E-43)
            r3.a = r2
            aucj r2 = r10.i()
            anqz r2 = (defpackage.anqz) r2
            r3 = 10
            r7.a(r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvp.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Intent intent = (Intent) obj;
        if (!isCancelled()) {
            dvo dvo = this.g;
            dvo.b = true;
            dvo.c = intent;
            dvo.a(dvo.getActivity());
        }
    }
}
