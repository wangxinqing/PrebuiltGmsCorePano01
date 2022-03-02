package defpackage;

/* renamed from: hyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hyg implements Runnable {
    private final hyo a;

    public hyg(hyo hyo) {
        this.a = hyo;
    }

    public final void run() {
        this.a.notifyDataSetChanged();
    }
}
