package defpackage;

import android.util.Log;

/* renamed from: peq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class peq implements aora {
    final /* synthetic */ per a;

    public peq(per per) {
        this.a = per;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        per per = this.a;
        Log.i("AppsUpload", "Apps list updated");
        ((aetj) per.b.a()).a(12006);
        synchronized (per.f) {
            per.g = false;
            if (per.h == null) {
                per.i.b((Object) true);
                per.i = null;
            }
        }
        this.a.a();
    }

    public final void a(Throwable th) {
        this.a.a("Failed to write the installed apps", th);
    }
}
