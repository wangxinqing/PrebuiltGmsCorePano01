package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: dqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqq extends AsyncTask {
    private final Future a;
    private final dqd b;

    public dqq(dqd dqd, Future future) {
        this.b = dqd;
        this.a = future;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Future future = this.a;
        if (future == null) {
            return null;
        }
        try {
            return (Boolean) future.get();
        } catch (InterruptedException e) {
            e.getMessage();
            e.fillInStackTrace();
            apev.a(e);
            return null;
        } catch (ExecutionException e2) {
            e2.getMessage();
            e2.fillInStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        dqd dqd;
        Boolean bool = (Boolean) obj;
        if (!isCancelled() && (dqd = this.b) != null) {
            dqd.a();
        }
    }
}
