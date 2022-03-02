package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RtcCertificatePem {
    public final String a;
    public final String b;

    public RtcCertificatePem(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* access modifiers changed from: package-private */
    public String getCertificate() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public String getPrivateKey() {
        return this.a;
    }
}
