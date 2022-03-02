package defpackage;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import java.util.concurrent.ExecutionException;

/* renamed from: adrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrp extends AsyncTaskLoader {
    private static final iwd a = adnt.a("LastConfigUpdateTimeLoader");
    private final adjg b;

    public adrp(Context context) {
        super(context);
        this.b = adiq.a(context);
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            return (Long) acws.a(this.b.p());
        } catch (InterruptedException | ExecutionException e) {
            a.e("Error when getting last successful config update time.", e, new Object[0]);
            return -1L;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        forceLoad();
    }
}
