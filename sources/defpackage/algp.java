package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: algp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algp {
    private static algp e;
    private static final long f = TimeUnit.SECONDS.toMillis(10);
    private final Context a;
    private final ExecutorService b = algf.a.c;
    private final ExecutorService c = algf.b.c;
    private final long d = f;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    private algp(Context context) {
        this.a = context;
    }

    public static synchronized algp a(Context context) {
        algp algp;
        synchronized (algp.class) {
            if (e == null) {
                e = new algp(context.getApplicationContext());
            }
            algp = e;
        }
        return algp;
    }

    public final void b(int i, Bundle bundle) {
        try {
            algb a2 = algt.a(this.a, this.d, TimeUnit.MILLISECONDS);
            if (a2 == null) {
                Log.w("SucServiceInvoker", "logMetric failed since service reference is null. Are the permissions valid?");
                return;
            }
            Bundle bundle2 = Bundle.EMPTY;
            Parcel aQ = a2.aQ();
            aQ.writeInt(i);
            bhx.a(aQ, (Parcelable) bundle);
            bhx.a(aQ, (Parcelable) bundle2);
            a2.c(2, aQ);
        } catch (RemoteException | InterruptedException | TimeoutException e2) {
            Log.e("SucServiceInvoker", String.format("Exception occurred while trying to log metric = [%s]", new Object[]{bundle}), e2);
        }
    }

    public final void a(int i, Bundle bundle) {
        try {
            this.b.execute(new algn(this, i, bundle));
        } catch (RejectedExecutionException e2) {
            Log.e("SucServiceInvoker", String.format("Metric of type %d dropped since queue is full.", new Object[]{Integer.valueOf(i)}), e2);
        }
    }

    public final void a(String str, Bundle bundle) {
        try {
            this.c.execute(new algo(this, str, bundle));
        } catch (RejectedExecutionException e2) {
            Log.e("SucServiceInvoker", String.format("Screen %s bind back fail.", new Object[]{str}), e2);
        }
    }

    public final void b(String str, Bundle bundle) {
        try {
            algb a2 = algt.a(this.a, this.d, TimeUnit.MILLISECONDS);
            if (a2 != null) {
                Parcel aQ = a2.aQ();
                aQ.writeString(str);
                bhx.a(aQ, (Parcelable) bundle);
                a2.c(1, aQ);
                return;
            }
            Log.w("SucServiceInvoker", "BindBack failed since service reference is null. Are the permissions valid?");
        } catch (RemoteException | InterruptedException | TimeoutException e2) {
            Log.e("SucServiceInvoker", String.format("Exception occurred while %s trying bind back to SetupWizard.", new Object[]{str}), e2);
        }
    }
}
