package defpackage;

/* renamed from: agze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agze implements Runnable {
    final /* synthetic */ agzd a;

    public agze(agzd agzd) {
        this.a = agzd;
    }

    public final void run() {
        agzf.a.add(this.a);
        if (agzf.b != -1) {
            this.a.b();
        }
    }
}
