package defpackage;

import java.util.concurrent.Future;

/* renamed from: amjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class amjo implements Runnable {
    private final amju a;
    private final aosh b;
    private final amjs c;

    public amjo(amju amju, aosh aosh, amjs amjs) {
        this.a = amju;
        this.b = aosh;
        this.c = amjs;
    }

    public final void run() {
        amju amju = this.a;
        aosh aosh = this.b;
        amjs amjs = this.c;
        try {
            amju.d.b(aorl.a((Future) aosh));
            amjs.b((aorr) amju.d);
        } catch (Throwable th) {
            amjs.b((aorr) aosh);
        }
    }
}
