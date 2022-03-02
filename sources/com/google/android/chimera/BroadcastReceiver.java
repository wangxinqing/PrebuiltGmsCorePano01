package com.google.android.chimera;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class BroadcastReceiver implements bnu {
    android.content.BroadcastReceiver a;

    public final void abortBroadcast() {
        this.a.abortBroadcast();
    }

    public final void clearAbortBroadcast() {
        this.a.clearAbortBroadcast();
    }

    public final boolean getAbortBroadcast() {
        return this.a.getAbortBroadcast();
    }

    public Object getChimeraImpl() {
        return this;
    }

    public android.content.BroadcastReceiver getContainerReceiver() {
        return this.a;
    }

    public final boolean getDebugUnregister() {
        return this.a.getDebugUnregister();
    }

    public final int getResultCode() {
        return this.a.getResultCode();
    }

    public final String getResultData() {
        return this.a.getResultData();
    }

    public final Bundle getResultExtras(boolean z) {
        return this.a.getResultExtras(z);
    }

    public final BroadcastReceiver.PendingResult goAsync() {
        int i = Build.VERSION.SDK_INT;
        return this.a.goAsync();
    }

    public final boolean isInitialStickyBroadcast() {
        return this.a.isInitialStickyBroadcast();
    }

    public final boolean isOrderedBroadcast() {
        return this.a.isOrderedBroadcast();
    }

    public abstract void onReceive(Context context, Intent intent);

    public IBinder peekService(Context context, Intent intent) {
        return this.a.peekService(context, intent);
    }

    public final void setDebugUnregister(boolean z) {
        this.a.setDebugUnregister(z);
    }

    public final void setOrderedHint(boolean z) {
        this.a.setOrderedHint(z);
    }

    public void setProxy(android.content.BroadcastReceiver broadcastReceiver) {
        this.a = broadcastReceiver;
    }

    public final void setResult(int i, String str, Bundle bundle) {
        this.a.setResult(i, str, bundle);
    }

    public final void setResultCode(int i) {
        this.a.setResultCode(i);
    }

    public final void setResultData(String str) {
        this.a.setResultData(str);
    }

    public final void setResultExtras(Bundle bundle) {
        this.a.setResultExtras(bundle);
    }
}
