package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;

/* renamed from: it  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class it extends aw implements kl {
    public final int a;
    public final Bundle h;
    public final km i;
    public iu j;
    private aj k;
    private km l;

    public it(int i2, Bundle bundle, km kmVar, km kmVar2) {
        this.a = i2;
        this.h = bundle;
        this.i = kmVar;
        this.l = kmVar2;
        kmVar.registerListener(i2, this);
    }

    /* access modifiers changed from: package-private */
    public final km a(aj ajVar, ir irVar) {
        iu iuVar = new iu(this.i, irVar);
        a(ajVar, iuVar);
        iu iuVar2 = this.j;
        if (iuVar2 != null) {
            a((ax) iuVar2);
        }
        this.k = ajVar;
        this.j = iuVar;
        return this.i;
    }

    public final void b(Object obj) {
        super.b(obj);
        km kmVar = this.l;
        if (kmVar != null) {
            kmVar.reset();
            this.l = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (ix.c(2)) {
            "  Stopping: " + this;
        }
        this.i.stopLoading();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        aj ajVar = this.k;
        iu iuVar = this.j;
        if (ajVar != null && iuVar != null) {
            super.a((ax) iuVar);
            a(ajVar, iuVar);
        }
    }

    public final void onLoadComplete(km kmVar, Object obj) {
        if (ix.c(2)) {
            "onLoadComplete: " + this;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(obj);
            return;
        }
        if (ix.c(4)) {
            Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
        }
        c(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.a);
        sb.append(" : ");
        sb.append(this.i.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.i)));
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final km a(boolean z) {
        if (ix.c(3)) {
            "  Destroying: " + this;
        }
        this.i.cancelLoad();
        this.i.abandon();
        iu iuVar = this.j;
        if (iuVar != null) {
            a((ax) iuVar);
            if (z && iuVar.c) {
                if (ix.c(2)) {
                    "  Resetting: " + iuVar.a;
                }
                iuVar.b.a(iuVar.a);
            }
        }
        this.i.unregisterListener(this);
        if ((iuVar == null || iuVar.c) && !z) {
            return this.i;
        }
        this.i.reset();
        return this.l;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (ix.c(2)) {
            "  Starting: " + this;
        }
        this.i.startLoading();
    }

    public final void a(ax axVar) {
        super.a(axVar);
        this.k = null;
        this.j = null;
    }
}
