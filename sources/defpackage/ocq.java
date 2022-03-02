package defpackage;

/* renamed from: ocq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ocq implements Runnable {
    final /* synthetic */ ocr a;

    public ocq(ocr ocr) {
        this.a = ocr;
    }

    public final void run() {
        if (this.a.a()) {
            ocr ocr = this.a;
            ocr.b.executeOnExecutor(ocr.c, new Void[0]);
            this.a.b = null;
        }
    }
}
