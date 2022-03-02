package com.google.android.gms.chimera.container;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsModuleFinder$StageFileApksResultReceiver extends ResultReceiver {
    public ArrayBlockingQueue a = new ArrayBlockingQueue(1);

    public GmsModuleFinder$StageFileApksResultReceiver(Handler handler) {
        super(handler);
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        try {
            this.a.add(Integer.valueOf(i));
        } catch (IllegalStateException e) {
            Log.w("GmsModuleFndr", "Duplicate result received");
        }
    }
}
