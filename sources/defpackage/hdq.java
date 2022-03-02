package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: hdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hdq extends BoundService {
    public final BoundService a;
    private njy b;

    public hdq(BoundService boundService) {
        this.a = boundService;
    }

    public final IBinder onBind(Intent intent) {
        amky a2 = this.b.a("onBind", qvx.a);
        try {
            IBinder onBind = this.a.onBind(intent);
            if (onBind == null || !axda.a.a().g()) {
                if (a2 != null) {
                    a2.close();
                }
                return onBind;
            }
            BoundService boundService = this.a;
            if (boundService != null && nkt.a(onBind)) {
                onBind = new nkt(boundService, (Binder) onBind);
            }
            if (a2 != null) {
                a2.close();
            }
            return onBind;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        amky b2 = this.b.b("onConfigurationChanged");
        try {
            this.a.onConfigurationChanged(configuration);
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        BoundService boundService = this.a;
        njy njy = new njy((Context) boundService, (Class) boundService.getClass(), 7);
        this.b = njy;
        amky b2 = njy.b("onCreate");
        try {
            this.a.onCreate();
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        amky b2 = this.b.b("onDestroy");
        try {
            this.a.onDestroy();
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onLowMemory() {
        amky b2 = this.b.b("onLowMemory");
        try {
            this.a.onLowMemory();
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onRebind(Intent intent) {
        amky a2 = this.b.a("onRebind", qvx.a);
        try {
            this.a.onRebind(intent);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onTrimMemory(int i) {
        amky b2 = this.b.b("onTrimMemory");
        try {
            this.a.onTrimMemory(i);
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean onUnbind(Intent intent) {
        amky a2 = this.b.a("onUnbind", qvx.a);
        try {
            boolean onUnbind = this.a.onUnbind(intent);
            if (a2 != null) {
                a2.close();
            }
            return onUnbind;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void publicDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        amky b2 = this.b.b("onUnbind");
        try {
            this.a.publicDump(fileDescriptor, printWriter, strArr);
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
