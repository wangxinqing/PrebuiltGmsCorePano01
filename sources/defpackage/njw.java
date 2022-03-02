package defpackage;

import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.view.Display;
import java.util.concurrent.Executor;

/* renamed from: njw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class njw extends ContextWrapper {
    private final Context a;

    public njw(Context context) {
        super(context);
        this.a = context;
    }

    public static Context a(Context context) {
        return axda.a.a().a() ? new njw(context) : context;
    }

    private final Context b(Context context) {
        if (context != getBaseContext()) {
            return axda.a.a().b() ? new njw(context) : context;
        }
        return this;
    }

    public final boolean bindService(Intent intent, int i, Executor executor, ServiceConnection serviceConnection) {
        if (!axda.b()) {
            return this.a.bindService(intent, i, executor, serviceConnection);
        }
        amkr a2 = amlv.a(njm.a(njm.a(intent), intent, "OutgoingBinding"), amlw.a);
        try {
            boolean bindService = this.a.bindService(intent, i, executor, serviceConnection);
            if (a2 != null) {
                a2.close();
            }
            return bindService;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Context createConfigurationContext(Configuration configuration) {
        return b(this.a.createConfigurationContext(configuration));
    }

    public final Context createDisplayContext(Display display) {
        return b(this.a.createDisplayContext(display));
    }

    public final Context createPackageContext(String str, int i) {
        return b(this.a.createPackageContext(str, i));
    }

    public final Context getApplicationContext() {
        return b(this.a.getApplicationContext());
    }

    public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().registerComponentCallbacks(componentCallbacks);
    }

    public final void sendBroadcast(Intent intent) {
        String a2 = njm.a(intent);
        amkr a3 = amlv.a(njm.a(a2, intent, "SendBroadcast"), amlw.a);
        try {
            if (a(a2)) {
                this.a.sendBroadcast(a(intent));
            } else {
                this.a.sendBroadcast(intent);
            }
            if (a3 != null) {
                a3.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void sendOrderedBroadcast(Intent intent, String str) {
        String a2 = njm.a(intent);
        amkr a3 = amlv.a(njm.a(a2, intent, "SendOrderedBroadcast"), amlw.a);
        try {
            if (a(a2)) {
                this.a.sendOrderedBroadcast(a(intent), str);
            } else {
                this.a.sendOrderedBroadcast(intent, str);
            }
            if (a3 != null) {
                a3.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final ComponentName startForegroundService(Intent intent) {
        String a2 = njm.a(intent);
        amkr a3 = amlv.a(njm.a(a2, intent, "StartForegroundService"), amlw.a);
        try {
            if (a(a2)) {
                ComponentName startForegroundService = this.a.startForegroundService(a(intent));
                if (a3 != null) {
                    a3.close();
                }
                return startForegroundService;
            }
            ComponentName startForegroundService2 = this.a.startForegroundService(intent);
            if (a3 != null) {
                a3.close();
            }
            return startForegroundService2;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final ComponentName startService(Intent intent) {
        String a2 = njm.a(intent);
        amkr a3 = amlv.a(njm.a(a2, intent, "StartService"), amlw.a);
        try {
            if (a(a2)) {
                ComponentName startService = this.a.startService(a(intent));
                if (a3 != null) {
                    a3.close();
                }
                return startService;
            }
            ComponentName startService2 = this.a.startService(intent);
            if (a3 != null) {
                a3.close();
            }
            return startService2;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().unregisterComponentCallbacks(componentCallbacks);
    }

    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        if (!axda.b()) {
            return this.a.bindService(intent, serviceConnection, i);
        }
        amkr a2 = amlv.a(njm.a(njm.a(intent), intent, "OutgoingBinding"), amlw.a);
        try {
            boolean bindService = this.a.bindService(intent, serviceConnection, i);
            if (a2 != null) {
                a2.close();
            }
            return bindService;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    static Intent a(Intent intent) {
        String str;
        Intent intent2 = new Intent(intent);
        nih b = nku.b();
        if (b == null || (b.a & 4) == 0) {
            str = "unknown";
        } else {
            nii nii = b.d;
            if (nii == null) {
                nii = nii.d;
            }
            str = nii.b;
        }
        intent2.putExtra("gms_trace_module_LOGGED", str);
        return intent2;
    }

    public final void sendBroadcast(Intent intent, String str) {
        String a2 = njm.a(intent);
        amkr a3 = amlv.a(njm.a(a2, intent, "SendBroadcast"), amlw.a);
        try {
            if (a(a2)) {
                this.a.sendBroadcast(a(intent), str);
            } else {
                this.a.sendBroadcast(intent, str);
            }
            if (a3 != null) {
                a3.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static boolean a(String str) {
        if (!axda.d()) {
            return false;
        }
        if (str.equals("Internal") || (axda.a.a().k() && str.equals("Implicit"))) {
            return true;
        }
        return false;
    }
}
