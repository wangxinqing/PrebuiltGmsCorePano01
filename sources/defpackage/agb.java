package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: agb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agb {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    final /* synthetic */ hl c;

    public agb() {
    }

    public final void a(afu afu) {
        this.b.add(afu);
    }

    /* access modifiers changed from: package-private */
    public final void b(afu afu) {
        this.b.remove(afu);
    }

    public agb(hl hlVar) {
        this.c = hlVar;
    }
}
