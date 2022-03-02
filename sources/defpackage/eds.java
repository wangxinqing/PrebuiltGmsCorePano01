package defpackage;

import com.google.android.gms.audiomodem.AdsrParams;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: eds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eds {
    public float a = 44100.0f;
    public int b = 16;
    public int c = 50;
    public int d = 2;
    public AdsrParams e = DtmfEncoding.b;
    private int f = 6;
    private int g = 1;
    private final float[] h = DtmfEncoding.a;

    public final Encoding a() {
        boolean z;
        boolean z2 = false;
        if (this.e.a() <= ((long) this.c)) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Sum of ADSR window components must not be more than windowDurationMillis");
        if (this.h.length > this.d) {
            z2 = true;
        }
        iva.b(z2, "Number of tone frequencies must be greater than number of frequencies per symbol");
        return new Encoding(1, (DsssEncoding) null, new DtmfEncoding(this.f, Encoding.a(this.g), this.a, this.b, this.c, this.d, Encoding.b(this.g), this.e, this.h));
    }

    public final void b(int i) {
        iva.b(i > 0, "tokenLengthBytes must be greater than zero");
        this.f = i;
    }

    public final void a(int i) {
        iva.b(true, "Not a valid ErrorControlScheme");
        this.g = i;
    }
}
