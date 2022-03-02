package defpackage;

import android.os.AsyncTask;
import android.os.SystemClock;

/* renamed from: gon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gon extends AsyncTask {
    final /* synthetic */ gop a;
    private lya b;

    public gon(gop gop) {
        this.a = gop;
    }

    public final void a() {
        lya lya = this.b;
        if (lya != null) {
            lya.b();
            this.b = null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        gop gop = this.a;
        iwd iwd = gop.a;
        this.b = lxz.a(gop.c, gop.b);
        gop.a.b("init: %sms", Long.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        a();
    }
}
