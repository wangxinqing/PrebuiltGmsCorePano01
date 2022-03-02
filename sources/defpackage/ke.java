package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ke extends km {
    public volatile kd a;
    public long b = -10000;
    private Executor c;
    private volatile kd d;
    private long e;
    private Handler f;

    public ke(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.d == null && this.a != null) {
            if (this.a.a) {
                this.a.a = false;
                this.f.removeCallbacks(this.a);
            }
            if (this.e <= 0 || SystemClock.uptimeMillis() >= this.b + this.e) {
                if (this.c == null) {
                    this.c = getExecutor();
                }
                kd kdVar = this.a;
                Executor executor = this.c;
                if (kdVar.f != 1) {
                    int i = kdVar.f;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    } else if (i2 == 1) {
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    } else if (i2 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    } else {
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                } else {
                    kdVar.f = 2;
                    executor.execute(kdVar.c);
                }
            } else {
                this.a.a = true;
                this.f.postAtTime(this.a, this.b + this.e);
            }
        }
    }

    public void cancelLoadInBackground() {
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            printWriter.println(this.a.a);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.d);
            printWriter.print(" waiting=");
            printWriter.println(this.d.a);
        }
        if (this.e != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            printWriter.print(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.e)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.b != -10000) {
                str2 = "-" + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.b));
            } else {
                str2 = "--";
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    /* access modifiers changed from: protected */
    public Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.d != null;
    }

    public abstract Object loadInBackground();

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        if (this.a == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        if (this.d != null) {
            if (this.a.a) {
                this.a.a = false;
                this.f.removeCallbacks(this.a);
            }
            this.a = null;
            return false;
        } else if (!this.a.a) {
            kd kdVar = this.a;
            kdVar.d.set(true);
            boolean cancel = kdVar.c.cancel(false);
            if (cancel) {
                this.d = this.a;
                cancelLoadInBackground();
            }
            this.a = null;
            return cancel;
        } else {
            this.a.a = false;
            this.f.removeCallbacks(this.a);
            this.a = null;
            return false;
        }
    }

    public void onCanceled(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        cancelLoad();
        this.a = new kd(this);
        a();
    }

    /* access modifiers changed from: protected */
    public Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.e = j;
        if (j != 0) {
            this.f = new Handler();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(kd kdVar, Object obj) {
        onCanceled(obj);
        if (this.d == kdVar) {
            rollbackContentChanged();
            this.b = SystemClock.uptimeMillis();
            this.d = null;
            deliverCancellation();
            a();
        }
    }
}
