package defpackage;

/* renamed from: nyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nyg implements Runnable {
    private final nyi a;
    private final nyn b;

    public nyg(nyi nyi, nyn nyn) {
        this.a = nyi;
        this.b = nyn;
    }

    public final void run() {
        nyi nyi = this.a;
        nyn nyn = this.b;
        amzy a2 = nyi.b.a();
        if (!a2.isEmpty()) {
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                nyi.a(nyn, (ntx) a2.get(i));
            }
        }
    }
}
