package com.google.android.chimera;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class BoundService extends ContextWrapper implements ComponentCallbacks {
    public BoundService() {
        super((Context) null);
    }

    public static Intent getStartIntent(Context context, String str) {
        try {
            apxg f = bkv.a(context).f().f();
            String F = f.F();
            apxg e = f.e(brt.a(F, str));
            if (e == null) {
                return null;
            }
            Intent intent = new Intent(str);
            intent.setClassName(context, brt.b(F, e.U()));
            return intent;
        } catch (InvalidConfigException e2) {
            Log.e("BoundService", "Failed to get Chimera config", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract IBinder onBind(Intent intent);

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onLowMemory() {
    }

    public void onRebind(Intent intent) {
    }

    public void onTrimMemory(int i) {
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public void publicDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(fileDescriptor, printWriter, strArr);
    }

    public final void setModuleContext(Context context) {
        attachBaseContext(context);
    }
}
