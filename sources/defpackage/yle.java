package defpackage;

/* renamed from: yle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yle implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ylf b;

    public yle(ylf ylf, String str) {
        this.b = ylf;
        this.a = str;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
