package defpackage;

import android.content.Context;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;

/* renamed from: pma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pma implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ pmb b;

    public pma(pmb pmb, Context context) {
        this.b = pmb;
        this.a = context;
    }

    public final void run() {
        this.a.startService(UpdateIcingCorporaIntentOperation.c(this.a));
        this.b.b.set(false);
    }
}
