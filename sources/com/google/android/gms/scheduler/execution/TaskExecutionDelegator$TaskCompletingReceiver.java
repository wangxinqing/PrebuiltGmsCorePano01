package com.google.android.gms.scheduler.execution;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TaskExecutionDelegator$TaskCompletingReceiver extends nla {
    private final acwd a;

    public TaskExecutionDelegator$TaskCompletingReceiver(acwd acwd) {
        super("scheduler");
        this.a = acwd;
    }

    public final void a(Context context, Intent intent) {
        int resultCode = getResultCode();
        acwd acwd = this.a;
        if (resultCode == 0) {
            resultCode = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        acwd.a((Object) Integer.valueOf(resultCode));
    }
}
