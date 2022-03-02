package defpackage;

import android.content.Context;
import com.google.android.gms.ipa.appsindexer.IpaPackageBroadcastIntentOperation;

/* renamed from: qny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class qny implements Runnable {
    private final IpaPackageBroadcastIntentOperation a;

    public qny(IpaPackageBroadcastIntentOperation ipaPackageBroadcastIntentOperation) {
        this.a = ipaPackageBroadcastIntentOperation;
    }

    public final void run() {
        qns a2 = qns.a((Context) this.a);
        if (a2 != null) {
            a2.a();
        }
    }
}
