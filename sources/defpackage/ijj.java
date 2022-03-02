package defpackage;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* renamed from: ijj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ijj extends AsyncTaskLoader {
    private Object a;

    public ijj(Context context) {
        super(context);
    }

    public final void deliverResult(Object obj) {
        this.a = obj;
        if (isStarted()) {
            super.deliverResult(obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        cancelLoad();
        this.a = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        Object obj = this.a;
        if (obj != null) {
            deliverResult(obj);
        }
        if (takeContentChanged() || this.a == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        super.onStopLoading();
        cancelLoad();
    }
}
