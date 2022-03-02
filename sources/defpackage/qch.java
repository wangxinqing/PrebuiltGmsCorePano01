package defpackage;

/* renamed from: qch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qch implements ax {
    private final qci a;
    private final ax b;

    public qch(qci qci, ax axVar) {
        this.a = qci;
        this.b = axVar;
    }

    public final void a(Object obj) {
        qci qci = this.a;
        ax axVar = this.b;
        if (qci.a.compareAndSet(true, false)) {
            axVar.a(obj);
        }
    }
}
