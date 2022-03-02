package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: gez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gez extends ijj {
    private static final iwd a = ehv.a("Auth", "DpcInstallLaunchingIntentLoader");
    private final ghj b;
    private final String c;
    private final Bundle d;

    public gez(Context context, ghj ghj, String str, Bundle bundle) {
        super(context);
        this.b = ghj;
        this.c = str;
        this.d = bundle;
    }

    /* renamed from: a */
    public final Bundle loadInBackground() {
        PendingIntent pendingIntent;
        try {
            pendingIntent = (PendingIntent) acws.a(this.b.b((ihb) new ghh(this.c, this.d)), 1, TimeUnit.MINUTES);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a.e("Failed to get PhoneskyDpcInstallActivity launching intent.", e, new Object[0]);
            pendingIntent = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("pending_intent", pendingIntent);
        return bundle;
    }
}
