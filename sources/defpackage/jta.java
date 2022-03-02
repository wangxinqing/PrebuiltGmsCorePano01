package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.chimera.AsyncTaskLoader;

/* renamed from: jta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jta extends AsyncTaskLoader {
    public Handler a;
    public Runnable b;
    private Object c;
    private boolean d;

    public jta(Context context) {
        super(context);
    }

    public final void a() {
        Runnable runnable;
        Handler handler = this.a;
        if (handler != null && (runnable = this.b) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public final void deliverResult(Object obj) {
        if (!this.d) {
            this.c = obj;
            if (isStarted() && !isReset()) {
                super.deliverResult(obj);
                this.d = true;
                a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        this.c = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        Object obj = this.c;
        if (obj != null) {
            deliverResult(obj);
        } else {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }
}
