package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aese  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aese extends azxe {
    private static final baab a = baab.a("X-Goog-Api-Key", baaf.a);
    private static final baab b = baab.a("X-Android-Package", baaf.a);
    private static final baab c = baab.a("X-Android-Cert", baaf.a);
    private final baaf d;

    public aese(String str, String str2, String str3) {
        baaf baaf = new baaf();
        this.d = baaf;
        baaf.a(a, (Object) str);
        this.d.a(b, (Object) str2);
        this.d.a(c, (Object) str3);
    }

    public final void a(azxc azxc, Executor executor, azxd azxd) {
        azxd.a(this.d);
    }
}
