package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: ko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ko extends FutureTask {
    final /* synthetic */ kq a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ko(kq kqVar, Callable callable) {
        super(callable);
        this.a = kqVar;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        try {
            this.a.c(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            this.a.c((Object) null);
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
