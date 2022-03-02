package defpackage;

import com.google.android.gms.security.snet.SnetChimeraService;

/* renamed from: aawt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aawt implements Runnable {
    final /* synthetic */ SnetChimeraService a;

    public aawt(SnetChimeraService snetChimeraService) {
        this.a = snetChimeraService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027b, code lost:
        if (r1.a(new defpackage.aasd(r2), r3) == false) goto L_0x027f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 1
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r1.a()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            defpackage.azft.c()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aaal r1 = r1.c     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r1 = r1.a()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 == 0) goto L_0x0014
        L_0x0013:
            goto L_0x0026
        L_0x0014:
            boolean r1 = defpackage.azfv.j()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 != 0) goto L_0x0013
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r2 = 5
            r1.a((int) r2)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
        L_0x0020:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a
            r1.a((boolean) r0)
            return
        L_0x0026:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r3 = 0
            android.content.Intent r1 = r1.registerReceiver(r3, r2)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r2 = "plugged"
            r4 = -1
            int r1 = r1.getIntExtra(r2, r4)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r2 = 2
            if (r1 != r0) goto L_0x003f
            goto L_0x0050
        L_0x003f:
            if (r1 == r2) goto L_0x0050
            r4 = 4
            if (r1 == r4) goto L_0x0050
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r2 = 6
            r1.a((int) r2)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a
            r1.a((boolean) r0)
            return
        L_0x0050:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r4 = "power"
            java.lang.Object r1 = r1.getSystemService(r4)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r1 = r1.isScreenOn()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r2 = 9
            r1.a((int) r2)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a
            r1.a((boolean) r0)
            return
        L_0x006d:
            boolean r1 = defpackage.azfv.w()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 == 0) goto L_0x0079
            boolean r1 = defpackage.azfv.r()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 == 0) goto L_0x028b
        L_0x0079:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r4 = r1.h     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            defpackage.aann.a()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            azfv r5 = defpackage.azfv.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            azfw r5 = r5.a()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r5 = r5.aa()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r6 = 0
            if (r5 == 0) goto L_0x019c
            aarq r3 = new aarq     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r3.<init>(r1)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r5 = "connectivity"
            java.lang.Object r5 = r1.getSystemService(r5)     // Catch:{ Exception -> 0x0196 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ Exception -> 0x0196 }
            aazv r7 = new aazv     // Catch:{ Exception -> 0x0196 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x0196 }
            boolean r5 = r7.a()     // Catch:{ Exception -> 0x0196 }
            if (r5 == 0) goto L_0x0191
            android.content.SharedPreferences r5 = r3.a     // Catch:{ Exception -> 0x0196 }
            java.lang.String r7 = "snet_last_snet_flags_update_ms"
            r8 = 0
            long r7 = r5.getLong(r7, r8)     // Catch:{ Exception -> 0x0196 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0196 }
            java.lang.String r5 = "googler"
            java.lang.String r11 = defpackage.azfv.d()     // Catch:{ Exception -> 0x0196 }
            boolean r5 = r5.equals(r11)     // Catch:{ Exception -> 0x0196 }
            if (r5 != 0) goto L_0x00c3
            r11 = 518400000(0x1ee62800, double:2.56123631E-315)
            goto L_0x00c6
        L_0x00c3:
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
        L_0x00c6:
            long r7 = r7 + r11
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x018c
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0196 }
            aase r7 = r1.b     // Catch:{ Exception -> 0x0196 }
            java.lang.String r7 = r7.b     // Catch:{ Exception -> 0x0196 }
            java.lang.String r8 = "installed/snet_flags"
            r5.<init>(r7, r8)     // Catch:{ Exception -> 0x0196 }
            boolean r7 = r5.exists()     // Catch:{ Exception -> 0x0196 }
            if (r7 != 0) goto L_0x00dd
            goto L_0x00ec
        L_0x00dd:
            long r7 = r5.lastModified()     // Catch:{ Exception -> 0x0196 }
            long r7 = r7 + r11
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ec
            java.lang.String r3 = r3.a()     // Catch:{ Exception -> 0x0196 }
            goto L_0x019d
        L_0x00ec:
            java.lang.String r5 = "snet_last_snet_flags_update_ms"
            r3.a((java.lang.String) r5, (long) r9)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r5 = "googler"
            java.lang.String r7 = defpackage.azfv.d()     // Catch:{ Exception -> 0x0196 }
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0196 }
            if (r5 != 0) goto L_0x0100
            java.lang.String r5 = "https://www.gstatic.com/android/snet/snet.flags"
            goto L_0x0102
        L_0x0100:
            java.lang.String r5 = "https://www.gstatic.com/android/snet/snet_goog.flags"
        L_0x0102:
            byte[] r5 = defpackage.aans.a((java.lang.String) r5, (int) r6, (android.content.Context) r1)     // Catch:{ Exception -> 0x0196 }
            if (r5 == 0) goto L_0x0187
            aase r7 = r1.b     // Catch:{ Exception -> 0x0196 }
            java.lang.String r8 = "download/metadata_flags"
            java.lang.String r9 = "download/snet_flags"
            boolean r5 = r7.a((byte[]) r5, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x0196 }
            if (r5 == 0) goto L_0x0182
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0196 }
            aase r7 = r1.b     // Catch:{ Exception -> 0x0196 }
            java.lang.String r7 = r7.b     // Catch:{ Exception -> 0x0196 }
            java.lang.String r8 = "download/snet_flags"
            r5.<init>(r7, r8)     // Catch:{ Exception -> 0x0196 }
            aase r7 = r1.b     // Catch:{ Exception -> 0x0196 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0196 }
            java.lang.String r9 = r7.b     // Catch:{ Exception -> 0x0196 }
            java.lang.String r10 = "download/metadata_flags"
            r8.<init>(r9, r10)     // Catch:{ Exception -> 0x0196 }
            boolean r7 = r7.b(r8, r5)     // Catch:{ Exception -> 0x0196 }
            if (r7 == 0) goto L_0x0182
            android.os.Bundle r5 = com.google.android.gms.security.snet.SnetChimeraService.a((java.io.File) r5)     // Catch:{ Exception -> 0x0196 }
            r1.i = r5     // Catch:{ Exception -> 0x0196 }
            android.os.Bundle r5 = r1.i     // Catch:{ Exception -> 0x0196 }
            java.lang.String r7 = "url"
            java.lang.String r5 = r5.getString(r7)     // Catch:{ Exception -> 0x0196 }
            android.os.Bundle r7 = r1.i     // Catch:{ Exception -> 0x0196 }
            java.lang.String r8 = "percent"
            int r7 = r7.getInt(r8)     // Catch:{ Exception -> 0x0196 }
            aase r1 = r1.b     // Catch:{ Exception -> 0x0196 }
            java.lang.String r8 = "download/metadata_flags"
            java.lang.String r9 = "installed/metadata_flags"
            java.lang.String r10 = "download/snet_flags"
            java.lang.String r11 = "installed/snet_flags"
            r1.a(r8, r9, r10, r11)     // Catch:{ Exception -> 0x0196 }
            if (r5 != 0) goto L_0x0157
            goto L_0x017d
        L_0x0157:
            if (r7 == 0) goto L_0x017d
            java.util.UUID r1 = java.util.UUID.fromString(r4)     // Catch:{ Exception -> 0x0196 }
            long r8 = r1.getMostSignificantBits()     // Catch:{ Exception -> 0x0196 }
            long r10 = r1.getLeastSignificantBits()     // Catch:{ Exception -> 0x0196 }
            long r8 = r8 ^ r10
            r1 = 32
            long r10 = r8 >> r1
            int r1 = (int) r10     // Catch:{ Exception -> 0x0196 }
            int r4 = (int) r8     // Catch:{ Exception -> 0x0196 }
            r1 = r1 ^ r4
            int r1 = java.lang.Math.abs(r1)     // Catch:{ Exception -> 0x0196 }
            int r1 = r1 % 100
            int r1 = r1 + r0
            if (r1 <= r7) goto L_0x017b
            java.lang.String r3 = r3.a()     // Catch:{ Exception -> 0x0196 }
            goto L_0x019d
        L_0x017b:
            r3 = r5
            goto L_0x019d
        L_0x017d:
            java.lang.String r3 = r3.a()     // Catch:{ Exception -> 0x0196 }
            goto L_0x019d
        L_0x0182:
            java.lang.String r3 = r3.a()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            goto L_0x019d
        L_0x0187:
            java.lang.String r3 = r3.a()     // Catch:{ Exception -> 0x0196 }
            goto L_0x019d
        L_0x018c:
            java.lang.String r3 = r3.a()     // Catch:{ Exception -> 0x0196 }
            goto L_0x019d
        L_0x0191:
            java.lang.String r3 = r3.a()     // Catch:{ Exception -> 0x0196 }
            goto L_0x019c
        L_0x0196:
            r1 = move-exception
            java.lang.String r3 = r3.a()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            goto L_0x019d
        L_0x019c:
        L_0x019d:
            if (r3 == 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            java.lang.String r3 = "https://www.gstatic.com/android/snet/11142017-10002000.snet"
        L_0x01a2:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aase r1 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r4 != 0) goto L_0x01f9
            aarq r4 = r1.e     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r4 = r4.a()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r4 = r3.equals(r4)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r4 != 0) goto L_0x01b9
        L_0x01b8:
            goto L_0x01c0
        L_0x01b9:
            boolean r1 = r1.a()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 == 0) goto L_0x01b8
            goto L_0x01f9
        L_0x01c0:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aase r1 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r4 = r1.d     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r4 != 0) goto L_0x01e4
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r4 == 0) goto L_0x01cf
        L_0x01ce:
            goto L_0x01d8
        L_0x01cf:
            java.lang.String r4 = "https://www.gstatic.com/android/snet/"
            boolean r4 = r3.startsWith(r4)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r4 == 0) goto L_0x01ce
            goto L_0x01e4
        L_0x01d8:
            aaww r4 = new aaww     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            android.content.Context r5 = r1.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            int r7 = r1.c     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r4.<init>((android.content.Context) r5, (defpackage.aase) r1, (int) r7)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            defpackage.aaww.j = r3     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            goto L_0x01f9
        L_0x01e4:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r4 = 6145(0x1801, float:8.611E-42)
            byte[] r1 = defpackage.aans.a((java.lang.String) r3, (int) r4, (android.content.Context) r1)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 == 0) goto L_0x01f9
            com.google.android.gms.security.snet.SnetChimeraService r4 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aase r4 = r4.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r5 = "download/metadata"
            java.lang.String r7 = "download/snet.jar"
            r4.a((byte[]) r1, (java.lang.String) r5, (java.lang.String) r7)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
        L_0x01f9:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aase r1 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.io.File r4 = new java.io.File     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r5 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r7 = "download/metadata"
            r4.<init>(r5, r7)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.io.File r5 = new java.io.File     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r7 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r8 = "download/snet.jar"
            r5.<init>(r7, r8)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r7 = defpackage.aase.a((java.io.File) r4, (java.io.File) r5)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r7 == 0) goto L_0x0228
            boolean r4 = r1.b(r4, r5)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r4 == 0) goto L_0x0228
            java.lang.String r4 = "download/metadata"
            java.lang.String r5 = "installed/metadata"
            java.lang.String r6 = "download/snet.jar"
            java.lang.String r7 = "installed/snet.jar"
            boolean r6 = r1.a(r4, r5, r6, r7)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            goto L_0x0229
        L_0x0228:
        L_0x0229:
            if (r6 == 0) goto L_0x023e
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 != 0) goto L_0x023e
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aase r1 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aarq r1 = r1.e     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r4 = "snet_saved_package_url"
            r1.a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r6 = 1
            goto L_0x023f
        L_0x023e:
        L_0x023f:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aase r1 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r1 = r1.a()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 != 0) goto L_0x0254
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r1.a((int) r2)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a
            r1.a((boolean) r0)
            return
        L_0x0254:
            if (r6 != 0) goto L_0x028b
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aase r1 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.io.File r2 = new java.io.File     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r3 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r4 = "installed/metadata"
            r2.<init>(r3, r4)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.io.File r3 = new java.io.File     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r4 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r5 = "installed/snet.jar"
            r3.<init>(r4, r5)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r4 = defpackage.aase.a((java.io.File) r2, (java.io.File) r3)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r4 == 0) goto L_0x027f
            aasd r4 = new aasd     // Catch:{ Exception -> 0x027e }
            r4.<init>(r2)     // Catch:{ Exception -> 0x027e }
            boolean r1 = r1.a((defpackage.aasd) r4, (java.io.File) r3)     // Catch:{ Exception -> 0x027e }
            if (r1 != 0) goto L_0x028b
            goto L_0x027f
        L_0x027e:
            r1 = move-exception
        L_0x027f:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r2 = 3
            r1.a((int) r2)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a
            r1.a((boolean) r0)
            return
        L_0x028b:
            defpackage.aaww.c = r0     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aarw r1 = defpackage.aarw.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            boolean r2 = defpackage.azfv.b()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r2 != 0) goto L_0x0298
            r12 = r1
            goto L_0x02b3
        L_0x0298:
            aatw r1 = defpackage.aatw.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r2 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aarw r3 = defpackage.aarw.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.Object r4 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            monitor-enter(r4)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            byte[] r2 = r1.a((android.content.Context) r2)     // Catch:{ IOException -> 0x02ac }
            aarw r3 = r1.a((byte[]) r2)     // Catch:{ IOException -> 0x02ac }
            goto L_0x02ad
        L_0x02aa:
            r1 = move-exception
            goto L_0x0322
        L_0x02ac:
            r2 = move-exception
        L_0x02ad:
            monitor-exit(r4)     // Catch:{ all -> 0x02aa }
            aarw r1 = r1.a((defpackage.aarw) r3)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r12 = r1
        L_0x02b3:
            aarq r1 = new aarq     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r2 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r1.<init>(r2)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            android.content.SharedPreferences r2 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r3 = "snet_verify_apps_api_usage"
            java.util.Set r4 = java.util.Collections.emptySet()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.util.Set r2 = r2.getStringSet(r3, r4)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r11.<init>(r2)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r2 = "snet_verify_apps_api_usage"
            java.util.Set r3 = java.util.Collections.emptySet()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r1.a((java.lang.String) r2, (java.util.Set) r3)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aarq r1 = new aarq     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r2 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r1.<init>(r2)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.util.Set r13 = r1.d()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            r1.b()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r2 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aase r1 = r2.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r3 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.io.File r1 = new java.io.File     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r4 = "installed/snet.jar"
            r1.<init>(r3, r4)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r4 = r1.getAbsolutePath()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            aase r1 = r1.b     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            long r5 = r1.b()     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            int r7 = r1.d     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r8 = r1.f     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r9 = r1.h     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r10 = "com.google.android.gms.security.snet.ACTION_IDLE_MODE"
            android.os.Bundle r14 = r1.i     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            android.content.ComponentName r1 = com.google.android.gms.security.snet.SnetLaunchChimeraIntentService.a(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            if (r1 == 0) goto L_0x031c
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            int r2 = r1.d     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r3 = r1.f     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r4 = r1.h     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
            java.lang.String r5 = "com.google.android.gms.security.snet.ACTION_IDLE_MODE"
            com.google.android.gms.security.snet.SnetWatchdogChimeraIntentService.a(r1, r2, r3, r4, r5)     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
        L_0x031c:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a
        L_0x031e:
            r1.a((boolean) r0)
            return
        L_0x0322:
            monitor-exit(r4)     // Catch:{ all -> 0x02aa }
            throw r1     // Catch:{ LinkageError -> 0x0338, all -> 0x0324 }
        L_0x0324:
            r1 = move-exception
            com.google.android.gms.security.snet.SnetChimeraService r2 = r15.a     // Catch:{ all -> 0x0331 }
            aaww r2 = r2.e     // Catch:{ all -> 0x0331 }
            if (r2 == 0) goto L_0x032e
            defpackage.aaww.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x0331 }
        L_0x032e:
            com.google.android.gms.security.snet.SnetChimeraService r1 = r15.a
            goto L_0x031e
        L_0x0331:
            r1 = move-exception
            com.google.android.gms.security.snet.SnetChimeraService r2 = r15.a
            r2.a((boolean) r0)
            throw r1
        L_0x0338:
            r1 = move-exception
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aawt.run():void");
    }
}
