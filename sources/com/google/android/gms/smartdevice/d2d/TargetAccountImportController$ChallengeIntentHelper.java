package com.google.android.gms.smartdevice.d2d;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TargetAccountImportController$ChallengeIntentHelper extends ResultReceiver {
    public final Context a;
    public final Queue b = new ArrayDeque();
    public final acel c;
    public final absz d;
    public boolean e;

    public TargetAccountImportController$ChallengeIntentHelper(Context context, Handler handler, acel acel, absz absz) {
        super(handler);
        this.a = context;
        this.c = acel;
        this.d = absz;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        absy.a.a("Received result from challenge %d", Integer.valueOf(i));
        PendingIntent pendingIntent = (PendingIntent) this.b.poll();
        if (pendingIntent == null) {
            this.c.a();
            this.e = false;
            return;
        }
        this.d.a(pendingIntent);
    }
}
