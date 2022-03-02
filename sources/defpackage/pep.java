package defpackage;

import android.util.Log;

/* renamed from: pep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pep implements aora {
    final /* synthetic */ anuc a;
    final /* synthetic */ per b;

    public pep(per per, anuc anuc) {
        this.b = per;
        this.a = anuc;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            per per = this.b;
            Log.i("AppsUpload", "Apps list not changed: skip upload");
            synchronized (per.f) {
                per.g = false;
                if (per.h == null) {
                    per.i.b((Object) false);
                    per.i = null;
                }
            }
            this.b.a();
            return;
        }
        this.b.a(this.a);
    }

    public final void a(Throwable th) {
        this.b.a("Failed to read the installed apps", th);
    }
}
