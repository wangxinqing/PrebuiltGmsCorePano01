package defpackage;

/* renamed from: zpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zpn implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ zpo c;

    public zpn(zpo zpo, String str, boolean z) {
        this.c = zpo;
        this.a = str;
        this.b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = android.net.http.SslCertificate.saveState(r4.c.a.f.getCertificate()).getByteArray("x509-certificate");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            zpo r0 = r4.c
            com.google.android.gms.recaptcha.RecaptchaChimeraActivity r0 = r0.a
            com.google.android.chimera.WebView r0 = r0.f
            android.net.http.SslCertificate r0 = r0.getCertificate()
            if (r0 == 0) goto L_0x0027
            zpo r0 = r4.c
            com.google.android.gms.recaptcha.RecaptchaChimeraActivity r0 = r0.a
            com.google.android.chimera.WebView r0 = r0.f
            android.net.http.SslCertificate r0 = r0.getCertificate()
            android.os.Bundle r0 = android.net.http.SslCertificate.saveState(r0)
            java.lang.String r1 = "x509-certificate"
            byte[] r0 = r0.getByteArray(r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = defpackage.jhy.d(r0)
            goto L_0x0029
        L_0x0027:
            java.lang.String r0 = ""
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            zpo r2 = r4.c
            com.google.android.gms.recaptcha.RecaptchaChimeraActivity r2 = r2.a
            java.lang.String r2 = r2.a
            r1.<init>(r2)
            java.lang.String r2 = r4.a
            java.lang.String r3 = "c"
            defpackage.zqg.a(r1, r3, r2)
            java.lang.String r2 = "sc"
            defpackage.zqg.a(r1, r2, r0)
            zpo r0 = r4.c
            com.google.android.gms.recaptcha.RecaptchaChimeraActivity r0 = r0.a
            boolean r2 = r4.b
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = "reload"
            goto L_0x004d
        L_0x004b:
            java.lang.String r2 = "verify"
        L_0x004d:
            r3 = 0
            r0.a((java.lang.StringBuilder) r1, (java.lang.String) r2, (boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpn.run():void");
    }
}
