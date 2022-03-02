package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: adct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adct extends AsyncTaskLoader {
    private static final jjg a = jjg.a();
    private icl b;
    private long c = -1;
    private final iby d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adct(Context context, Account account) {
        super(context);
        acyp acyp = new acyp();
        acyp.a = account;
        iby iby = new iby(context, acyp.a());
        this.d = iby;
    }

    private static void b(icl icl) {
        if (icl instanceof ici) {
            try {
                ((ici) icl).c();
            } catch (RuntimeException e) {
                anih anih = (anih) a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("adct", "b", 139, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to release %s", (Object) icl);
            }
        }
    }

    public abstract acwa a(iby iby);

    /* renamed from: a */
    public final icl loadInBackground() {
        try {
            acwa a2 = a(this.d);
            long j = this.c;
            return (icl) (j >= 0 ? acws.a(a2, j, TimeUnit.MILLISECONDS) : acws.a(a2));
        } catch (TimeoutException e) {
            return a(Status.d);
        } catch (InterruptedException e2) {
            return a(Status.b);
        } catch (ExecutionException e3) {
            if (e3.getCause() instanceof nja) {
                return a(((nja) e3.getCause()).a);
            }
            return a(Status.c);
        }
    }

    public abstract icl a(Status status);

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mTimeout=");
        printWriter.print(this.c);
        printWriter.println("ms");
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        cancelLoad();
        icl icl = this.b;
        if (icl instanceof ici) {
            try {
                ((ici) icl).c();
            } catch (RuntimeException e) {
                anih anih = (anih) a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("adct", "b", 139, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to release %s", (Object) icl);
            }
        }
        this.b = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        icl icl = this.b;
        if (icl != null) {
            deliverResult(icl);
        }
        if (takeContentChanged() || this.b == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }

    public final void a(long j, TimeUnit timeUnit) {
        iva.a(isReset(), (Object) "Can only setTimeout while loader is reset");
        this.c = timeUnit.toMillis(j);
    }

    /* renamed from: a */
    public final void deliverResult(icl icl) {
        this.b = icl;
        if (isStarted()) {
            super.deliverResult(icl);
        }
    }
}
