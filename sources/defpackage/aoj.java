package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: aoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoj {
    final Uri a;
    final Executor b;
    final aod c;
    final Runnable d = new aoh(this);
    public final ContentObserver e = new aoi(this, new Handler(Looper.getMainLooper()));
    final /* synthetic */ aok f;
    private boolean g;

    public aoj(aok aok, Uri uri, Executor executor, aod aod) {
        this.f = aok;
        this.a = uri;
        this.b = executor;
        this.c = aod;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.g) {
            try {
                this.f.a(this.a);
                this.g = true;
            } catch (SecurityException e2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f.a.getContentResolver().unregisterContentObserver(this.e);
        if (this.g) {
            this.f.b(this.a);
            this.g = false;
        }
    }
}
