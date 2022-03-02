package defpackage;

/* renamed from: kil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kil implements Runnable {
    final /* synthetic */ kim a;
    private final kit b;

    public kil(kim kim, kit kit) {
        this.a = kim;
        this.b = kit;
    }

    public final void run() {
        if (this.b.a()) {
            this.a.h.a();
        }
    }
}
