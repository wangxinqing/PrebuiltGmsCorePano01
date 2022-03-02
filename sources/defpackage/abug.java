package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import java.util.concurrent.ExecutionException;

/* renamed from: abug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abug implements abnn {
    public static final iwd a = acqa.a("D2D", "TargetDeviceServiceController");
    public final abpo b;
    public final Context c;
    public final acan d;
    public final acqi e;
    public final int f;
    public abtz g;
    public abtm h;
    public abtc i;
    public boolean j = false;
    public String k;
    public boolean l = false;

    public abug(abpo abpo) {
        acqi b2 = acec.b(abpo.a);
        int i2 = ModuleManager.get(abpo.a).getCurrentModule().moduleVersion;
        this.b = abpo;
        this.e = b2;
        this.f = i2;
        this.c = abpo.a;
        this.d = (acan) abpo.c;
    }

    public static void a(abxq abxq, Status status) {
        try {
            abxq.a(status, (AdvertisingInfo) null);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void b(abxq abxq, Status status) {
        try {
            abxq.a(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void c(abxq abxq, Status status) {
        try {
            abxq.b(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void d(abxq abxq, Status status) {
        try {
            abxq.c(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void a(abxq abxq, Status status, String str) {
        try {
            abxq.a(status, str);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public final void a() {
        a.a("resetBootstrapController()", new Object[0]);
        abtm abtm = this.h;
        if (abtm != null) {
            abtm.e();
            this.h = null;
        }
    }

    public final void a(int i2) {
        this.b.d.a(i2);
        abtc abtc = this.i;
        if (abtc != null) {
            abtc.a(i2);
        }
        a();
    }

    public final void a(BootstrapCompletionResult bootstrapCompletionResult) {
        abtz abtz;
        this.b.d.a();
        acar acar = this.d.g;
        aucd aucd = acar.b;
        int a2 = aoog.a(SystemClock.elapsedRealtime() - acar.a);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anxn anxn = (anxn) aucd.b;
        anxn anxn2 = anxn.i;
        anxn.a |= 64;
        anxn.h = a2;
        abtc abtc = this.i;
        if (abtc != null) {
            try {
                if (azlr.a.a().a()) {
                    jix.h(abtc.c);
                    abtc.b.c();
                } else {
                    abtc.b.a(bootstrapCompletionResult);
                }
            } catch (RemoteException e2) {
                abtc.a.a((Throwable) e2);
            }
        }
        if (this.j && (abtz = this.g) != null) {
            try {
                acws.a(abtz.a());
            } catch (InterruptedException | ExecutionException e3) {
                a.a(e3);
            }
        }
        a();
    }

    public final void a(String str) {
        abtc abtc = this.i;
        if (abtc != null) {
            try {
                abtc.b.a(str);
            } catch (RemoteException e2) {
                abtc.a.a((Throwable) e2);
            }
        }
    }

    public final boolean a(BootstrapProgressResult bootstrapProgressResult) {
        abtc abtc = this.i;
        if (abtc == null) {
            return false;
        }
        try {
            return abtc.b.a(bootstrapProgressResult);
        } catch (RemoteException e2) {
            abtc.a.a((Throwable) e2);
            return false;
        }
    }
}
