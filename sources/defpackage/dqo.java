package defpackage;

import android.os.AsyncTask;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: dqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqo extends AsyncTask {
    private final Future a;
    private final dqg b;

    public dqo(dqg dqg, Future future) {
        this.b = dqg;
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
        } catch (InterruptedException | ExecutionException e) {
            e.getMessage();
            e.fillInStackTrace();
            apev.a(e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        dqg dqg;
        Boolean bool = (Boolean) obj;
        if (!isCancelled() && (dqg = this.b) != null) {
            for (int i = 0; i < ((ou) dqg.b).h; i++) {
                dqf dqf = (dqf) dqg.b.get(Integer.valueOf(dqg.b(i)));
                dqv dqv = dqf.b;
                if (dqv != null) {
                    dqv.a.clear();
                    dqv.e.clear();
                    dqv.f.clear();
                    dqv.as();
                    dqf.a();
                    dqf.getLoaderManager().restartLoader(0, (Bundle) null, dqf.b);
                }
            }
        }
    }
}
