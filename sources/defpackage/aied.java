package defpackage;

/* renamed from: aied  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aied implements Runnable {
    final /* synthetic */ ref a;
    final /* synthetic */ aiei b;

    public aied(aiei aiei, ref ref) {
        this.b = aiei;
        this.a = ref;
    }

    public final void run() {
        this.b.a((Object) this.a.asBinder());
    }
}
