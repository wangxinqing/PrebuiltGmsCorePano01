package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: fwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwa extends ke {
    public final Semaphore c = new Semaphore(0);
    private final Set d;

    public fwa(Context context, Set set) {
        super(context);
        this.d = set;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i = 0;
        for (icc a : this.d) {
            if (a.a(this)) {
                i++;
            }
        }
        try {
            this.c.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        this.c.drainPermits();
        forceLoad();
    }
}
