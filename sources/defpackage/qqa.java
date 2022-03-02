package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.InstantIndexingIntentOperation;

/* renamed from: qqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qqa implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ qqb b;

    public qqa(qqb qqb, Context context) {
        this.b = qqb;
        this.a = context;
    }

    public final void run() {
        Intent startIntent = IntentOperation.getStartIntent(this.a, InstantIndexingIntentOperation.class, "com.google.android.gms.ipa.mediastoreindexer.INSTANT_INDEX");
        if (startIntent != null) {
            this.a.startService(startIntent);
            this.b.b.set(false);
        }
    }
}
