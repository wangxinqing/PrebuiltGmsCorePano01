package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ardi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardi {
    public static final double a = (-Math.log10(0.01d));
    public static final double b = (-Math.log10(0.15d));
    public static final double c = (-Math.log10(0.19d));
    public static final double d = (-Math.log10(1.0E-11d));
    public final ardx e;
    public final ardl f;

    public ardi() {
        ardn ardn = new ardn();
        ardn.a = true;
        ardn.b = TimeUnit.MINUTES.toMillis(15);
        ardn.c = TimeUnit.MINUTES.toMillis(5);
        ardn.d = TimeUnit.MINUTES.toMillis(5);
        ardn.e = TimeUnit.MINUTES.toMillis(1);
        ardo ardo = new ardo(ardn);
        this.e = new ardx(ardo);
        this.f = new ardl(ardo);
    }
}
