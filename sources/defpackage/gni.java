package defpackage;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;

/* renamed from: gni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gni extends AsyncTaskLoader {
    private final boolean a;
    private Object b;

    public gni(Context context) {
        this(context, false);
    }

    public final void deliverResult(Object obj) {
        this.b = obj;
        if (isStarted()) {
            super.deliverResult(obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        cancelLoad();
        this.b = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        Object obj;
        super.onStartLoading();
        if (this.a && (obj = this.b) != null) {
            deliverResult(obj);
        }
        if (takeContentChanged() || this.b == null) {
            forceLoad();
        }
    }

    public gni(Context context, boolean z) {
        super(context);
        this.a = z;
    }
}
