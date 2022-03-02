package defpackage;

/* renamed from: amlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class amlf implements Runnable {
    private final amlz a;

    public amlf(amlz amlz) {
        this.a = amlz;
    }

    public final void run() {
        this.a.d.cancel(true);
    }
}
