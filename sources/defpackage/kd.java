package defpackage;

import android.os.SystemClock;

/* renamed from: kd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kd extends kq implements Runnable {
    boolean a;
    final /* synthetic */ ke b;

    public kd(ke keVar) {
        this.b = keVar;
    }

    /* access modifiers changed from: protected */
    public final Object a() {
        try {
            return this.b.onLoadInBackground();
        } catch (mu e) {
            if (b()) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Object obj) {
        this.b.a(this, obj);
    }

    public final void run() {
        this.a = false;
        this.b.a();
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        ke keVar = this.b;
        if (keVar.a != this) {
            keVar.a(this, obj);
        } else if (keVar.isAbandoned()) {
            keVar.onCanceled(obj);
        } else {
            keVar.commitContentChanged();
            keVar.b = SystemClock.uptimeMillis();
            keVar.a = null;
            keVar.deliverResult(obj);
        }
    }
}
