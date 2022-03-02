package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.util.Log;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aacu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aacu {
    static final ScheduledExecutorService a = jfm.a(1, 10);
    public static final /* synthetic */ int b = 0;

    public static void a(Context context, ntx ntx) {
        ComponentName[] componentNameArr;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        nqw.a(context);
        int d = nqw.d();
        int i = ntx.b;
        if (d == i) {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(ntx.a), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                componentNameArr = null;
            } else {
                int size = queryIntentServices.size();
                ComponentName[] componentNameArr2 = new ComponentName[size];
                for (int i2 = 0; i2 < size; i2++) {
                    ResolveInfo resolveInfo = queryIntentServices.get(i2);
                    componentNameArr2[i2] = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                }
                componentNameArr = componentNameArr2;
            }
            if (componentNameArr != null) {
                if (jkr.e()) {
                    String str = ntx.a;
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        z = packageManager == null || packageManager.getApplicationInfo(str, 0).targetSdkVersion >= 26;
                    } catch (PackageManager.NameNotFoundException e) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                for (ComponentName componentName : componentNameArr) {
                    try {
                        Intent component = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setComponent(componentName);
                        if (z) {
                            aact aact = new aact(context);
                            if (!jca.a().a(context, "NetworkScheduler", component, (ServiceConnection) aact, aacp.a())) {
                                String valueOf = String.valueOf(componentName);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                                sb.append("Failed to bind to ");
                                sb.append(valueOf);
                                Log.e("NetworkScheduler.TID", sb.toString());
                                aact.a();
                            } else {
                                ScheduledExecutorService scheduledExecutorService = a;
                                aact.getClass();
                                ((jfv) scheduledExecutorService).schedule((Runnable) new aacs(aact), (long) ((int) axlu.b()), TimeUnit.SECONDS);
                            }
                        } else if (!jim.b(context, componentName.getPackageName())) {
                            context.startService(new Intent("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE").setComponent(componentName));
                        }
                    } catch (IllegalStateException | SecurityException e2) {
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                        sb2.append("Encountered exception sending broadcast: ");
                        sb2.append(valueOf2);
                        Log.e("NetworkScheduler.TID", sb2.toString());
                    }
                }
                return;
            }
            return;
        }
        nqw.a(context, i, new Intent("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE").putExtra("user_serial", ntx.b).putExtra("package", ntx.a).setClassName("com.google.android.gms", "com.google.android.gms.gcm.nts.SchedulerInternalReceiver"), "com.google.android.gms.permission.INTERNAL_BROADCAST", (BroadcastReceiver) null, (Handler) null);
    }
}
