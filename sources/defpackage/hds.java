package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.ModuleContext;

/* renamed from: hds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hds extends bkl {
    private njy d = null;

    protected hds() {
        hem.a();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) obj;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof bkw)) {
            context = new ihh(context);
        }
        this.d = new njy(context, (Class) broadcastReceiver.getClass(), 4);
        Context a = njw.a(context);
        this.a = broadcastReceiver;
        this.b = a;
        this.a.setProxy(this);
    }

    /* access modifiers changed from: protected */
    public final void b(Context context) {
        if (!ihs.b().getInSafeBoot()) {
            bkl.c.a(context, this);
        }
    }

    public final boolean c(Context context) {
        String string;
        try {
            String name = getClass().getName();
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, name), 128);
            if (!(receiverInfo.metaData == null || (string = receiverInfo.metaData.getString("chimera.requiresExtractedAsset")) == null)) {
                hem a = hem.a();
                StringBuilder sb = new StringBuilder(string.length() + 1 + String.valueOf(name).length());
                sb.append(string);
                sb.append(" ");
                sb.append(name);
                a.a(context, 82, sb.toString());
                hey.a();
                hey.a(context, string);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public final void d() {
        hey.a(true);
    }

    public final void onReceive(Context context, Intent intent) {
        amky amky;
        quu a;
        if (!jkb.b(context)) {
            Log.w("GmsChimeraRcvrProxy", "Current process' user is not actively running.  Should not process Intent. Exiting instead.");
            Process.killProcess(Process.myPid());
        }
        if (this.d == null) {
            a(context);
        }
        njy njy = this.d;
        if (njy != null) {
            amky = njy.a("onReceive", intent);
        } else {
            amky = null;
        }
        try {
            a = qut.a();
            BroadcastReceiver a2 = a(context);
            if (a2 == null) {
                String name = getClass().getName();
                String action = intent.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 20 + String.valueOf(action).length());
                sb.append(name);
                sb.append(" dropping broadcast ");
                sb.append(action);
                Log.e("ChimeraRcvrProxy", sb.toString());
            } else {
                Context context2 = this.b;
                amtf.a((Object) context2);
                intent.setExtrasClassLoader(context2.getClassLoader());
                a2.onReceive(context2, intent);
            }
            if (a != null) {
                a.close();
            }
            if (amky != null) {
                amky.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (amky != null) {
                try {
                    amky.close();
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }
}
