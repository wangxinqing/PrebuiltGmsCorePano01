package defpackage;

import com.google.android.gms.audiomodem.AdsrParams;

/* renamed from: ecd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ecd {
    public long a = 8;
    public long b = 0;
    public long c = 0;
    public long d = 40;
    public float e = 1.0f;

    public final AdsrParams a() {
        boolean z;
        AdsrParams adsrParams = new AdsrParams(this.a, this.b, this.c, this.d, this.e);
        if (adsrParams.a() > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Sum of all ADSR window components must be greater than zero");
        return adsrParams;
    }
}
