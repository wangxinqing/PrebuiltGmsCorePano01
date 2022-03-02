package defpackage;

/* renamed from: aiob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiob implements Runnable {
    final /* synthetic */ isv a;
    final /* synthetic */ String b;
    final /* synthetic */ aioc c;

    public aiob(aioc aioc, isv isv, String str) {
        this.c = aioc;
        this.a = isv;
        this.b = str;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
