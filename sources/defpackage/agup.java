package defpackage;

/* renamed from: agup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agup implements Runnable {
    private final agus a;

    public agup(agus agus) {
        this.a = agus;
    }

    public final void run() {
        this.a.a.delete("queue", (String) null, (String[]) null);
    }
}
