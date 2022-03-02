package defpackage;

import java.util.Locale;

/* renamed from: vwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vwe {
    public int a;
    public int b;
    public vwg c;

    public vwe(int i, int i2, vwg vwg) {
        this.a = i;
        this.b = i2;
        this.c = vwg;
    }

    public final String toString() {
        return String.format(Locale.US, "SightedAdvertisement<version: %s, type: %s, state: %s>", new Object[]{Integer.valueOf(this.a), vwi.d(this.b), this.c});
    }
}
