package defpackage;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import java.util.ArrayList;

/* renamed from: dqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqr extends AsyncTaskLoader {
    private ArrayList a;
    private final long b;
    private final long c;

    public dqr(Context context, long j, long j2) {
        super(context);
        this.b = j;
        this.c = j2;
    }

    /* renamed from: a */
    public final void deliverResult(ArrayList arrayList) {
        if (!isReset()) {
            this.a = arrayList;
            if (isStarted()) {
                super.deliverResult(arrayList);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            deliverResult(arrayList);
        }
        if (takeContentChanged() || this.a == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
            return jec.b(getContext().getContentResolver(), this.b, this.c);
        }
        return jec.c(getContext().getContentResolver(), this.b, this.c);
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        cancelLoad();
        this.a = null;
    }
}
