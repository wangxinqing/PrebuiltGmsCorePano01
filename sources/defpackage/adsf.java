package defpackage;

import com.google.android.gms.usagereporting.ConsentInformation;

/* renamed from: adsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class adsf implements igp {
    private final String a;
    private final byte[] b;
    private final String c;
    private final adsa d;
    private final iby e;

    public adsf(iby iby, String str, byte[] bArr, String str2, adsa adsa) {
        this.e = iby;
        this.a = str;
        this.b = bArr;
        this.c = str2;
        this.d = adsa;
    }

    public final void a(Object obj, Object obj2) {
        iby iby = this.e;
        String str = this.a;
        byte[] bArr = this.b;
        String str2 = this.c;
        adry adry = (adry) iby.f;
        iva.a((Object) adry, (Object) "canLog must be called by a client that has api options.");
        ConsentInformation consentInformation = adry.a;
        iva.a((Object) consentInformation, (Object) "canLog must be called by a client that has UsageReportingOptions.consentInformation set (Almost always by a prior call to canLog).");
        ((adth) obj).a(str, bArr, str2, (int[]) null, 0, iby.c, consentInformation, (acwd) obj2);
    }
}
