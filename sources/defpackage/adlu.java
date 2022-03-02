package defpackage;

import java.util.concurrent.Callable;

/* renamed from: adlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adlu implements Callable {
    private final adlw a;
    private final StringBuilder b;

    public adlu(adlw adlw, StringBuilder sb) {
        this.a = adlw;
        this.b = sb;
    }

    public final Object call() {
        this.a.i.reboot(this.b.toString());
        return null;
    }
}
