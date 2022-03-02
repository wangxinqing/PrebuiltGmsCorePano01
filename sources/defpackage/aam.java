package defpackage;

/* renamed from: aam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aam implements Runnable {
    final /* synthetic */ aan a;

    public aam(aan aan) {
        this.a = aan;
    }

    public final void run() {
        aan aan = this.a;
        aan.b = null;
        aan.drawableStateChanged();
    }
}
