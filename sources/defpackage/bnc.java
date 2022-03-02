package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: bnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bnc extends Service implements Service.ProxyCallbacks, bou, bku {
    public static final bnb e = new bnb();
    public static final String[] f = {"com.google.android.gms.common.internal.ISharedPreferencesService", "android.content.ISyncAdapter", "android.service.notification.IConditionProvider", "android.hardware.location.IActivityRecognitionHardwareClient", "android.hardware.location.IActivityRecognitionHardwareWatcher", "android.location.IFusedProvider", "android.location.IGeocodeProvider", "android.location.IGeofenceProvider", "com.android.internal.location.ILocationProvider"};
    public com.google.android.chimera.Service a = null;
    public Context b = null;
    public List c;
    public ob d = null;

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        com.google.android.chimera.Service service = this.a;
        if (service != null && intent != null) {
            intent.setExtrasClassLoader(service.getClassLoader());
        }
    }

    public /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!a()) {
            bkv.a((Context) this).a((bku) this);
        }
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ob obVar = this.d;
        if (obVar != null) {
            printWriter.println("NullBinders:");
            for (int i = 0; i < obVar.b; i++) {
                String valueOf = String.valueOf((String) obVar.b(i));
                printWriter.println(valueOf.length() == 0 ? new String("  ") : "  ".concat(valueOf));
            }
            printWriter.println();
        }
        com.google.android.chimera.Service service = this.a;
        if (service != null) {
            service.publicDump(fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        r7 = (android.os.Binder) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IBinder onBind(android.content.Intent r7) {
        /*
            r6 = this;
            com.google.android.chimera.Service r0 = r6.a
            java.lang.String r1 = "ChimeraSrvcProxy"
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "Proxy without impl failing onBind()"
            android.util.Log.e(r1, r0)
            r0 = 0
            goto L_0x0014
        L_0x000d:
            r6.a((android.content.Intent) r7)
            android.os.IBinder r0 = r0.onBind(r7)
        L_0x0014:
            if (r0 != 0) goto L_0x0062
            java.lang.String r7 = r7.getAction()
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 33
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = " returning NullBinder for action "
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = r4.toString()
            android.util.Log.i(r1, r0)
            ob r0 = r6.d
            if (r0 != 0) goto L_0x0057
            ob r0 = new ob
            r0.<init>()
            r6.d = r0
        L_0x0057:
            ob r0 = r6.d
            r0.add(r7)
            bna r0 = new bna
            r0.<init>(r6, r7)
            return r0
        L_0x0062:
            boolean r7 = r0 instanceof android.os.Binder
            if (r7 == 0) goto L_0x009c
            r7 = r0
            android.os.Binder r7 = (android.os.Binder) r7
            java.lang.String r1 = r7.getInterfaceDescriptor()
            if (r1 == 0) goto L_0x009c
            java.lang.String[] r2 = f
            int r3 = r2.length
            r4 = 0
        L_0x0073:
            if (r4 < r3) goto L_0x0091
            bko r0 = new bko
            r0.<init>(r7, r1)
            java.util.List r7 = r6.c
            if (r7 != 0) goto L_0x0086
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 1
            r7.<init>(r1)
            r6.c = r7
        L_0x0086:
            java.util.List r7 = r6.c
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r7.add(r1)
            return r0
        L_0x0091:
            r5 = r2[r4]
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x009c
            int r4 = r4 + 1
            goto L_0x0073
        L_0x009c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnc.onBind(android.content.Intent):android.os.IBinder");
    }

    public void onConfigurationChanged(Configuration configuration) {
        ModuleContext moduleContext;
        Context context = this.b;
        if (context != null) {
            moduleContext = ModuleContext.getModuleContext(context);
        } else {
            moduleContext = null;
        }
        if (moduleContext != null) {
            moduleContext.updateModuleConfiguration(configuration);
        }
        com.google.android.chimera.Service service = this.a;
        if (service != null) {
            service.onConfigurationChanged(configuration);
        }
    }

    public void onCreate() {
        com.google.android.chimera.Service service = this.a;
        if (service != null) {
            service.onCreate();
        } else {
            super.onCreate();
        }
    }

    public void onDestroy() {
        com.google.android.chimera.Service service = this.a;
        if (service != null) {
            service.onDestroy();
        }
        List list = this.c;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bko bko = (bko) ((WeakReference) list.get(i)).get();
                if (bko != null) {
                    bko.close();
                }
            }
        }
    }

    public void onLowMemory() {
        com.google.android.chimera.Service service = this.a;
        if (service != null) {
            service.onLowMemory();
        }
    }

    public void onRebind(Intent intent) {
        com.google.android.chimera.Service service = this.a;
        if (service != null) {
            a(intent);
            service.onRebind(intent);
        }
    }

    public void onStart(Intent intent, int i) {
        com.google.android.chimera.Service service = this.a;
        if (service == null) {
            Log.e("ChimeraSrvcProxy", "Proxy without impl dropping onStart()");
            stopSelf(i);
            return;
        }
        a(intent);
        service.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        com.google.android.chimera.Service service = this.a;
        if (service == null) {
            return super.onStartCommand(intent, i, i2);
        }
        a(intent);
        return service.onStartCommand(intent, i, i2);
    }

    public void onTaskRemoved(Intent intent) {
        com.google.android.chimera.Service service = this.a;
        if (service != null) {
            a(intent);
            service.onTaskRemoved(intent);
        }
    }

    public void onTrimMemory(int i) {
        com.google.android.chimera.Service service = this.a;
        if (service != null) {
            service.onTrimMemory(i);
        }
    }

    public boolean onUnbind(Intent intent) {
        com.google.android.chimera.Service service = this.a;
        if (service == null) {
            return false;
        }
        a(intent);
        return service.onUnbind(intent);
    }

    public final void superOnCreate() {
        super.onCreate();
    }

    public final void superOnDestroy() {
        super.onDestroy();
    }

    public final int superOnStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    public void superStopSelf() {
        super.stopSelf();
    }

    public boolean superStopSelfResult(int i) {
        return super.stopSelfResult(i);
    }

    public void superStopSelf(int i) {
        super.stopSelf(i);
    }

    public final boolean a(boz boz) {
        return boz.f().b(brt.a(boz.f().F(), getClass().getName())) != null;
    }
}
