package com.google.android.gms.chromesync.sync;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SyncReceiverChimeraService extends TracingIntentService {

    @Deprecated
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ChimeraReceiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
        }
    }

    public SyncReceiverChimeraService() {
        super("ChimeraSyncReceiverService");
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
    }
}
