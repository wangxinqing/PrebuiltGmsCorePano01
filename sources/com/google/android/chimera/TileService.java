package com.google.android.chimera;

import android.app.Dialog;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.quicksettings.Tile;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TileService extends Service {
    public static final String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
    public static final String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
    public static final String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";
    private bjq a;

    public static final void requestListeningState(Context context, ComponentName componentName) {
        bjq.requestListeningState(context, componentName);
    }

    public final Tile getQsTile() {
        return this.a.getQsTile();
    }

    public final boolean isLocked() {
        return this.a.isLocked();
    }

    public final boolean isSecure() {
        return this.a.isSecure();
    }

    public IBinder onBind(Intent intent) {
        try {
            return this.a.onBind(intent);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof RemoteException) {
                return null;
            }
            throw e;
        }
    }

    public void onClick() {
    }

    public void onStartListening() {
    }

    public void onStopListening() {
    }

    public void onTileAdded() {
    }

    public void onTileRemoved() {
    }

    public boolean onUnbind(Intent intent) {
        return this.a.onUnbind(intent);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        bjq bjq = new bjq(this);
        this.a = bjq;
        bjq.attachBaseContext(context);
    }

    public final void setStatusIcon(Icon icon, String str) {
        this.a.setStatusIcon(icon, str);
    }

    public final void showDialog(Dialog dialog) {
        this.a.showDialog(dialog);
    }

    public final void startActivityAndCollapse(Intent intent) {
        this.a.startActivityAndCollapse(intent);
    }

    public final void unlockAndRun(Runnable runnable) {
        this.a.unlockAndRun(runnable);
    }
}
