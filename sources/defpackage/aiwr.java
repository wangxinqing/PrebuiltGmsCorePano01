package defpackage;

/* renamed from: aiwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiwr implements Runnable {
    final /* synthetic */ aizt a;
    final /* synthetic */ aizu b;

    public aiwr(aizt aizt, aizu aizu) {
        this.a = aizt;
        this.b = aizu;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
