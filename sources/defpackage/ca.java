package defpackage;

/* renamed from: ca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ca implements Runnable {
    final /* synthetic */ cb a;

    public ca(cb cbVar) {
        this.a = cbVar;
    }

    public final void run() {
        if (this.a.h()) {
            return;
        }
        if (this.a.a.c()) {
            this.a.i();
            return;
        }
        cb cbVar = this.a;
        by byVar = cbVar.a;
        int i = cbVar.k.a;
        byVar.a(cbVar.i, cbVar.h);
    }
}
