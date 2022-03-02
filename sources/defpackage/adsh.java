package defpackage;

import com.google.android.gms.usagereporting.ConsentInformation;

/* renamed from: adsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class adsh implements igp {
    private final String a;
    private final byte[] b;
    private final int[] c;
    private final int d;
    private final iby e;

    public adsh(iby iby, String str, byte[] bArr, int[] iArr, int i) {
        this.e = iby;
        this.a = str;
        this.b = bArr;
        this.c = iArr;
        this.d = i;
    }

    public final void a(Object obj, Object obj2) {
        iby iby = this.e;
        String str = this.a;
        byte[] bArr = this.b;
        int[] iArr = this.c;
        int i = this.d;
        adry adry = (adry) iby.f;
        iva.a((Object) adry, (Object) "canLog must be called by a client that has api options.");
        ConsentInformation consentInformation = adry.a;
        iva.a((Object) consentInformation, (Object) "canLog must be called by a client that has UsageReportingOptions.consentInformation set (Almost always by a prior call to canLog).");
        ((adth) obj).a(str, bArr, (String) null, iArr, i, iby.c, consentInformation, (acwd) obj2);
    }
}
