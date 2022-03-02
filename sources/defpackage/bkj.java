package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: bkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bkj extends Service {
    final bki a = new bki(this);

    protected static final void a(Intent intent, BoundService boundService) {
        intent.setExtrasClassLoader(boundService.getClassLoader());
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (BoundService boundService : this.a.a()) {
            printWriter.append(String.valueOf(boundService.getClass().getName()).concat(":"));
            boundService.publicDump(fileDescriptor, printWriter, strArr);
        }
    }

    public IBinder onBind(Intent intent) {
        BoundService boundService;
        int i;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("onBind: ");
        sb.append(valueOf);
        sb.toString();
        String valueOf2 = String.valueOf(intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
        sb2.append("Loading bound service for intent: ");
        sb2.append(valueOf2);
        sb2.toString();
        String action = intent.getAction();
        if (action == null) {
            Log.e("BoundBrokerSvc", "Intent doesn't have action specified");
            boundService = null;
        } else {
            boundService = (BoundService) this.a.a.get(action);
            if (boundService == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    bkv a2 = bkv.a((Context) this);
                    boz f = a2.f();
                    String F = f.f().F();
                    boolean z = !aekv.b(this);
                    apxg f2 = f.f();
                    apxg e = f2.e(brt.a(f2.F(), action));
                    if (e == null) {
                        Log.w("BoundBrokerSvc", action.length() == 0 ? new String("No bound-service is registered for action: ") : "No bound-service is registered for action: ".concat(action));
                        e = null;
                    } else if (z) {
                        int d = e.d(10);
                        if (d == 0 || e.d.get(d + e.c) == 0) {
                            Log.w("BoundBrokerSvc", action.length() == 0 ? new String("Bound-service for action is not direct boot aware: ") : "Bound-service for action is not direct boot aware: ".concat(action));
                            e = null;
                        }
                    }
                    if (e != null) {
                        String U = e.U();
                        if (!getContainerService().getClass().getName().equals(brt.b(F, U))) {
                            String valueOf3 = String.valueOf(U);
                            throw new InvalidConfigException(valueOf3.length() == 0 ? new String("Bound-service is registered with wrong container service: ") : "Bound-service is registered with wrong container service: ".concat(valueOf3));
                        }
                        int d2 = e.d(12);
                        if (d2 != 0) {
                            i = e.d.getInt(d2 + e.c);
                        } else {
                            i = 0;
                        }
                        Context a3 = a2.a((Context) this, f, i);
                        if (a3 != null) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            String b = brt.b(F, e.D());
                            bki bki = this.a;
                            BoundService boundService2 = (BoundService) bki.b.get(b);
                            if (boundService2 != null) {
                                bki.a.put(action, boundService2);
                                boundService = boundService2;
                            } else {
                                BoundService a4 = bki.c.a(a3, b);
                                if (a4 != null) {
                                    bki.c.a(a4, a3);
                                    a4.onCreate();
                                    bki.a.put(action, a4);
                                    bki.b.put(b, a4);
                                }
                                boundService = a4;
                            }
                        } else {
                            String valueOf4 = String.valueOf(e.D());
                            Log.e("BoundBrokerSvc", valueOf4.length() == 0 ? new String("Failed to load module for ") : "Failed to load module for ".concat(valueOf4));
                        }
                    }
                } catch (InvalidConfigException e2) {
                    Log.e("BoundBrokerSvc", "Chimera module config error", e2);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                boundService = null;
            }
        }
        if (boundService == null) {
            String valueOf5 = String.valueOf(intent);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 37);
            sb3.append("Proxy without impl failing onBind(): ");
            sb3.append(valueOf5);
            Log.e("BoundBrokerSvc", sb3.toString());
            return null;
        }
        a(intent, boundService);
        return boundService.onBind(intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        for (BoundService boundService : this.a.a()) {
            ModuleContext moduleContext = ModuleContext.getModuleContext(boundService);
            if (moduleContext != null) {
                moduleContext.updateModuleConfiguration(configuration);
            }
            boundService.onConfigurationChanged(configuration);
        }
    }

    public void onDestroy() {
        for (BoundService onDestroy : this.a.a()) {
            onDestroy.onDestroy();
        }
        bki bki = this.a;
        bki.a.clear();
        bki.b.clear();
    }

    public final void onLowMemory() {
        for (BoundService onLowMemory : this.a.a()) {
            onLowMemory.onLowMemory();
        }
    }

    public final void onRebind(Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("onRebind: ");
        sb.append(valueOf);
        sb.toString();
        BoundService a2 = this.a.a(intent);
        if (a2 != null) {
            a2.onRebind(intent);
            return;
        }
        String valueOf2 = String.valueOf(intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
        sb2.append("Rebinding a non-existent BoundService: ");
        sb2.append(valueOf2);
        Log.e("BoundBrokerSvc", sb2.toString());
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.e("BoundBrokerSvc", "onStartCommand is not supported");
        stopSelf(i2);
        return 2;
    }

    public final void onTrimMemory(int i) {
        for (BoundService onTrimMemory : this.a.a()) {
            onTrimMemory.onTrimMemory(i);
        }
    }

    public final boolean onUnbind(Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("onUnbind: ");
        sb.append(valueOf);
        sb.toString();
        BoundService a2 = this.a.a(intent);
        if (a2 == null) {
            String valueOf2 = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
            sb2.append("unbind a non-existent BoundService: ");
            sb2.append(valueOf2);
            Log.e("BoundBrokerSvc", sb2.toString());
            return false;
        }
        a(intent, a2);
        return a2.onUnbind(intent);
    }

    /* access modifiers changed from: protected */
    public BoundService a(Context context, String str) {
        return (BoundService) bkz.a(context.getClassLoader(), str, BoundService.class);
    }

    /* access modifiers changed from: protected */
    public void a(BoundService boundService, Context context) {
        boundService.setModuleContext(context);
    }
}
