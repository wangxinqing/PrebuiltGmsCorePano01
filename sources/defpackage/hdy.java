package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Process;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: hdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hdy extends bnc {
    private ihh g;
    private njy h = null;

    protected hdy() {
        hem.a();
    }

    private final void a(Intent intent, int i) {
        if (!jkb.b(this)) {
            Log.w("GmsServiceProxy", "Current process' user is not actively running.  Exiting.");
            Process.killProcess(Process.myPid());
        }
        jca.a().a((Service) this, i);
        ihs.b();
        com.google.android.chimera.Service service = this.a;
        if (service == null) {
            Log.e("ChimeraSrvcProxy", "Proxy without impl dropping onStart()");
            stopSelf(i);
            return;
        }
        a(intent);
        service.onStart(intent, i);
    }

    public final boolean c(Context context) {
        String string;
        try {
            String name = getClass().getName();
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, name), 128);
            if (!(serviceInfo.metaData == null || (string = serviceInfo.metaData.getString("chimera.requiresExtractedAsset")) == null)) {
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

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        amky a = njy.a(this.h, "dump");
        try {
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
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        r8 = (android.os.Binder) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IBinder onBind(android.content.Intent r8) {
        /*
            r7 = this;
            njy r0 = r7.h
            java.lang.String r1 = "onBind"
            amky r0 = defpackage.njy.a((defpackage.njy) r0, (java.lang.String) r1)
            defpackage.ihs.b()     // Catch:{ all -> 0x00c8 }
            com.google.android.chimera.Service r1 = r7.a     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "ChimeraSrvcProxy"
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "Proxy without impl failing onBind()"
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x00c8 }
            r1 = 0
            goto L_0x001f
        L_0x0018:
            r7.a((android.content.Intent) r8)     // Catch:{ all -> 0x00c8 }
            android.os.IBinder r1 = r1.onBind(r8)     // Catch:{ all -> 0x00c8 }
        L_0x001f:
            if (r1 != 0) goto L_0x006d
            java.lang.String r8 = r8.getAction()     // Catch:{ all -> 0x00c8 }
            java.lang.Class r1 = r7.getClass()     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c8 }
            int r3 = r3.length()     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00c8 }
            int r4 = r4.length()     // Catch:{ all -> 0x00c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            int r3 = r3 + 33
            int r3 = r3 + r4
            r5.<init>(r3)     // Catch:{ all -> 0x00c8 }
            r5.append(r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = " returning NullBinder for action "
            r5.append(r1)     // Catch:{ all -> 0x00c8 }
            r5.append(r8)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00c8 }
            android.util.Log.i(r2, r1)     // Catch:{ all -> 0x00c8 }
            ob r1 = r7.d     // Catch:{ all -> 0x00c8 }
            if (r1 != 0) goto L_0x0062
            ob r1 = new ob     // Catch:{ all -> 0x00c8 }
            r1.<init>()     // Catch:{ all -> 0x00c8 }
            r7.d = r1     // Catch:{ all -> 0x00c8 }
        L_0x0062:
            ob r1 = r7.d     // Catch:{ all -> 0x00c8 }
            r1.add(r8)     // Catch:{ all -> 0x00c8 }
            bna r1 = new bna     // Catch:{ all -> 0x00c8 }
            r1.<init>(r7, r8)     // Catch:{ all -> 0x00c8 }
            goto L_0x00a9
        L_0x006d:
            boolean r8 = r1 instanceof android.os.Binder     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x00a8
            r8 = r1
            android.os.Binder r8 = (android.os.Binder) r8     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = r8.getInterfaceDescriptor()     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x00a8
            java.lang.String[] r3 = defpackage.bnc.f     // Catch:{ all -> 0x00c8 }
            int r4 = r3.length     // Catch:{ all -> 0x00c8 }
            r5 = 0
        L_0x007e:
            if (r5 < r4) goto L_0x009d
            bko r1 = new bko     // Catch:{ all -> 0x00c8 }
            r1.<init>(r8, r2)     // Catch:{ all -> 0x00c8 }
            java.util.List r8 = r7.c     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x008a
            goto L_0x0092
        L_0x008a:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00c8 }
            r2 = 1
            r8.<init>(r2)     // Catch:{ all -> 0x00c8 }
            r7.c = r8     // Catch:{ all -> 0x00c8 }
        L_0x0092:
            java.util.List r8 = r7.c     // Catch:{ all -> 0x00c8 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00c8 }
            r2.<init>(r1)     // Catch:{ all -> 0x00c8 }
            r8.add(r2)     // Catch:{ all -> 0x00c8 }
            goto L_0x00a9
        L_0x009d:
            r6 = r3[r5]     // Catch:{ all -> 0x00c8 }
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x00c8 }
            if (r6 != 0) goto L_0x00a8
            int r5 = r5 + 1
            goto L_0x007e
        L_0x00a8:
        L_0x00a9:
            com.google.android.chimera.Service r8 = r7.a     // Catch:{ all -> 0x00c8 }
            boolean r2 = r8 instanceof defpackage.bkj     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x00b0
            goto L_0x00c2
        L_0x00b0:
            if (r8 == 0) goto L_0x00c1
            boolean r2 = defpackage.nkt.a(r1)     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x00c1
            nkt r2 = new nkt     // Catch:{ all -> 0x00c8 }
            android.os.Binder r1 = (android.os.Binder) r1     // Catch:{ all -> 0x00c8 }
            r2.<init>(r8, r1)     // Catch:{ all -> 0x00c8 }
            r1 = r2
            goto L_0x00c2
        L_0x00c1:
        L_0x00c2:
            if (r0 == 0) goto L_0x00c7
            r0.close()
        L_0x00c7:
            return r1
        L_0x00c8:
            r8 = move-exception
            if (r0 == 0) goto L_0x00d3
            r0.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r0)
        L_0x00d3:
            goto L_0x00d5
        L_0x00d4:
            throw r8
        L_0x00d5:
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdy.onBind(android.content.Intent):android.os.IBinder");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ModuleContext moduleContext;
        amky a = njy.a(this.h, "onConfigurationChanged");
        try {
            ihh ihh = this.g;
            if (ihh != null) {
                ihh.a(configuration);
            }
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
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        amky a = njy.a(this.h, "onCreate");
        try {
            if (!jkb.b(this)) {
                Log.w("GmsServiceProxy", "Current process' user is not actively running.  Exiting.");
                Process.killProcess(Process.myPid());
            }
            ihs.b();
            super.onCreate();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        amky a = njy.a(this.h, "onDestroy");
        try {
            ihs.b();
            com.google.android.chimera.Service service = this.a;
            if (service != null) {
                service.onDestroy();
            }
            List<WeakReference> list = this.c;
            if (list != null) {
                for (WeakReference weakReference : list) {
                    bko bko = (bko) weakReference.get();
                    if (bko != null) {
                        bko.close();
                    }
                }
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onLowMemory() {
        amky a = njy.a(this.h, "onLowMemory");
        try {
            com.google.android.chimera.Service service = this.a;
            if (service != null) {
                service.onLowMemory();
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onRebind(Intent intent) {
        amky a = njy.a(this.h, "onRebind");
        try {
            ihs.b();
            com.google.android.chimera.Service service = this.a;
            if (service != null) {
                a(intent);
                service.onRebind(intent);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onStart(Intent intent, int i) {
        amky amky;
        if (axda.a.a().m()) {
            njy njy = this.h;
            if (njy != null) {
                amky = njy.a("onStartCommand", intent);
            } else {
                amky = null;
            }
            try {
                a(intent, i);
                if (amky != null) {
                    amky.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            a(intent, i);
            return;
        }
        throw th;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        amky amky;
        njy njy = this.h;
        if (njy != null) {
            amky = njy.a("onStartCommand", intent);
        } else {
            amky = null;
        }
        try {
            if (!jkb.b(this)) {
                Log.w("GmsServiceProxy", "Current process' user is not actively running.  Exiting.");
                Process.killProcess(Process.myPid());
            }
            jca.a().a((Service) this, i2);
            ihs.b();
            int onStartCommand = super.onStartCommand(intent, i, i2);
            if (amky != null) {
                amky.close();
            }
            return onStartCommand;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onTaskRemoved(Intent intent) {
        amky a = njy.a(this.h, "onTaskRemoved");
        try {
            com.google.android.chimera.Service service = this.a;
            if (service != null) {
                a(intent);
                service.onTaskRemoved(intent);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onTrimMemory(int i) {
        amky a = njy.a(this.h, "onTrimMemory");
        try {
            com.google.android.chimera.Service service = this.a;
            if (service != null) {
                service.onTrimMemory(i);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onUnbind(Intent intent) {
        boolean z;
        amky a = njy.a(this.h, "onUnbind");
        try {
            ihs.b();
            com.google.android.chimera.Service service = this.a;
            if (service != null) {
                a(intent);
                z = service.onUnbind(intent);
            } else {
                z = false;
            }
            if (a != null) {
                a.close();
            }
            return z;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void superStopSelf() {
        jca.a().b((Service) this, -1);
        super.superStopSelf();
    }

    public final boolean superStopSelfResult(int i) {
        jca.a().b((Service) this, i);
        return super.superStopSelfResult(i);
    }

    public final void superStopSelf(int i) {
        jca.a().b((Service) this, i);
        super.superStopSelf(i);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        com.google.android.chimera.Service service = (com.google.android.chimera.Service) obj;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof bkw)) {
            ihh ihh = new ihh(context);
            this.g = ihh;
            context = ihh;
        }
        this.h = new njy(context, (Class) service.getClass(), 7);
        Context a = njw.a(context);
        if (this.a == null) {
            this.a = service;
            this.a.setProxy(this, a);
            this.b = a;
            return;
        }
        throw new IllegalStateException("Service implementation already set");
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        if (!ihs.b().getInSafeBoot()) {
            return bnc.e.a(this, this);
        }
        return false;
    }
}
