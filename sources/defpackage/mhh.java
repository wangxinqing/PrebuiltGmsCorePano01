package defpackage;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* renamed from: mhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class mhh extends AsyncTaskLoader {
    protected Object a;

    public mhh(Context context) {
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
        Object obj = this.a;
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
