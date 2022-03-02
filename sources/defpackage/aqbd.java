package defpackage;

/* renamed from: aqbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbd implements Runnable {
    private final aqbq a;
    private final String b;
    private final Throwable c;

    public aqbd(aqbq aqbq, String str, Throwable th) {
        this.a = aqbq;
        this.b = str;
        this.c = th;
    }

    public final void run() {
        aqbq aqbq = this.a;
        String str = this.b;
        Throwable th = this.c;
        for (aorr cancel : aqbq.a) {
            cancel.cancel(true);
        }
        azxl azxl = aqbq.h;
        if (azxl != null) {
            azxl.a(str, th);
        }
    }
}
