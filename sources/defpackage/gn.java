package defpackage;

import android.view.View;

/* renamed from: gn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gn implements Runnable {
    final /* synthetic */ go a;

    public gn(go goVar) {
        this.a = goVar;
    }

    public final void run() {
        if (this.a.b.f() != null) {
            this.a.b.a((View) null);
            go goVar = this.a;
            goVar.d.b(goVar.b, goVar.c);
        }
    }
}
