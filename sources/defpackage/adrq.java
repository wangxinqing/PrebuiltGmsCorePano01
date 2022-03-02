package defpackage;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.update.ConfigUpdateOptions;
import java.util.concurrent.ExecutionException;

/* renamed from: adrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrq extends AsyncTaskLoader {
    private static final iwd a = adnt.a("RequestConfigUpdateLoader");
    private final boolean b = true;
    private final adjg c;

    public adrq(Context context) {
        super(context);
        this.c = adiq.a(context);
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            acws.a(this.c.a(new ConfigUpdateOptions(this.b)));
            a.c("Config update succeeded.", new Object[0]);
            try {
                return (Long) acws.a(this.c.p());
            } catch (InterruptedException | ExecutionException e) {
                a.e("Error when getting last successful config update time.", e, new Object[0]);
                return -1L;
            }
        } catch (InterruptedException | ExecutionException e2) {
            a.e("Failed to check for config update.", e2, new Object[0]);
            return -1L;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        forceLoad();
    }
}
