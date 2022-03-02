package defpackage;

/* renamed from: wa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wa extends qi {
    final /* synthetic */ wb a;
    private boolean b = false;
    private int c = 0;

    public wa(wb wbVar) {
        this.a = wbVar;
    }

    public final void b() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            qh qhVar = this.a.b;
            if (qhVar != null) {
                qhVar.b();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    public final void c() {
        if (!this.b) {
            this.b = true;
            qh qhVar = this.a.b;
            if (qhVar != null) {
                qhVar.c();
            }
        }
    }
}
