package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ChimeraSystemUpdateService;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import org.chromium.net.UrlRequest;

/* renamed from: adih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adih extends bhw implements adii {
    final /* synthetic */ ChimeraSystemUpdateService a;
    private final Context b;

    public adih() {
        super("com.google.android.gms.update.ISystemUpdateService");
    }

    public final void a(boolean z) {
        Log.i("SystemUpdateServiceImpl", "approveDownload");
        if (!a()) {
            Log.w("SystemUpdateServiceImpl", "approveDownload failed: Binder does not have the permission.");
        } else {
            ((adla) adla.h.b()).a(new DownloadOptions(z, false));
        }
    }

    public final int b() {
        if (a()) {
            return ((adla) adla.h.b()).d().c;
        }
        Log.w("SystemUpdateServiceImpl", "getStatus failed: Binder does not have the permission.");
        return -1;
    }

    public final long c() {
        if (a()) {
            return ((adla) adla.h.b()).d().n + adjx.a(this.b);
        }
        Log.w("SystemUpdateServiceImpl", "whenIsMobileDownloadAllowed failed:Binder does not have the permission.");
        return -1;
    }

    public final int d() {
        if (!a()) {
            Log.w("SystemUpdateServiceImpl", "getDownloadPercent failed: Binder does not have the permission.");
            return -1;
        }
        double d = ((adla) adla.h.b()).d().f;
        if (d >= 0.0d) {
            return (int) (d * 100.0d);
        }
        return -1;
    }

    public final void e() {
        if (!a()) {
            Log.w("SystemUpdateServiceImpl", "resetUpdate failed: Binder does not have the permission.");
        } else {
            ((adla) adla.h.b()).a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adih(ChimeraSystemUpdateService chimeraSystemUpdateService, Context context) {
        super("com.google.android.gms.update.ISystemUpdateService");
        this.a = chimeraSystemUpdateService;
        this.b = context;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if ((Binder.getCallingUid() != Process.myUid() || Binder.getCallingPid() != Process.myPid()) && !hya.a((Context) this.a).a(Binder.getCallingUid())) {
            return false;
        }
        return true;
    }

    public final void b(boolean z) {
        Log.i("SystemUpdateServiceImpl", "approveInstall");
        if (!a()) {
            Log.w("SystemUpdateServiceImpl", "approveInstall failed: Binder does not have the permission.");
        } else {
            ((adla) adla.h.b()).a(new InstallationOptions(z, false, false, false));
        }
    }

    public final void c(boolean z) {
        StringBuilder sb = new StringBuilder(21);
        sb.append("setIsActivityUp:");
        sb.append(z);
        Log.i("SystemUpdateServiceImpl", sb.toString());
        if (!a()) {
            Log.w("SystemUpdateServiceImpl", "setIsActivityUp failed: Binder does not have the permission.");
        } else {
            ((adla) adla.h.b()).a(new ActivityStatus(z, false));
        }
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        int i2 = -1;
        boolean z = false;
        switch (i) {
            case 2:
                int b2 = b();
                parcel2.writeNoException();
                parcel2.writeInt(b2);
                break;
            case 3:
                long c = c();
                parcel2.writeNoException();
                parcel2.writeLong(c);
                break;
            case 4:
                int d = d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                break;
            case 5:
                a(bhx.a(parcel));
                parcel2.writeNoException();
                break;
            case 6:
                b(bhx.a(parcel));
                parcel2.writeNoException();
                break;
            case 7:
                Log.i("SystemUpdateServiceImpl", "getUrgency");
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "getUrgency failed: Binder does not have the permission.");
                } else {
                    i2 = ChimeraSystemUpdateService.a(this.b);
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                break;
            case 8:
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsActivityUp failed: Binder does not have the permission.");
                } else {
                    z = ((adla) adla.h.b()).d().r.a;
                }
                parcel2.writeNoException();
                bhx.a(parcel2, z);
                break;
            case 9:
                c(bhx.a(parcel));
                parcel2.writeNoException();
                break;
            case 10:
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "getOtaBeingManagedByPolicy failed: Binder does not have the permission.");
                } else {
                    if (adkf.a(this.b, ((adla) adla.h.b()).d().n).a != 0) {
                        z = true;
                    }
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("getOtaBeingManagedByPolicy:");
                    sb.append(z);
                    Log.i("SystemUpdateServiceImpl", sb.toString());
                }
                parcel2.writeNoException();
                bhx.a(parcel2, z);
                break;
            case 11:
                Log.i("SystemUpdateServiceImpl", "rebootNow");
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "rebootNow failed: Binder does not have the permission.");
                } else if (b() == 528) {
                    ((PowerManager) this.b.getSystemService("power")).reboot("rebootScheduledUpdate");
                } else {
                    ((adla) adla.h.b()).a(new InstallationOptions(false, false, false, false));
                }
                parcel2.writeNoException();
                break;
            case 12:
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "getBatteryState failed: Binder does not have the permission.");
                } else {
                    if (adjw.b(this.b)) {
                        i2 = ((long) adjw.c(this.b)) < ((Long) adka.c.a()).longValue() ? 1 : 0;
                    } else {
                        i2 = ((long) adjw.c(this.b)) < ((Long) adka.b.a()).longValue() ? 2 : 0;
                    }
                    StringBuilder sb2 = new StringBuilder(28);
                    sb2.append("getBatteryState: ");
                    sb2.append(i2);
                    sb2.toString();
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                Log.i("SystemUpdateServiceImpl", "pauseDownload");
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "pauseDownload failed: Binder does not have the permission.");
                } else {
                    ((adla) adla.h.b()).b();
                }
                parcel2.writeNoException();
                break;
            case Service.START_CONTINUATION_MASK:
                boolean a2 = bhx.a(parcel);
                StringBuilder sb3 = new StringBuilder(20);
                sb3.append("resumeDownload:");
                sb3.append(a2);
                Log.i("SystemUpdateServiceImpl", sb3.toString());
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "resumeDownload failed: Binder does not have the permission.");
                } else {
                    ((adla) adla.h.b()).b(new DownloadOptions(a2, false));
                }
                parcel2.writeNoException();
                break;
            case 16:
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsAutoPauseDisabled failed: Binder does not have the permission.");
                } else {
                    z = ((adla) adla.h.b()).d().g.a;
                }
                parcel2.writeNoException();
                bhx.a(parcel2, z);
                break;
            case 17:
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsStreaming failed: Binder does not have the permission.");
                } else {
                    z = ((adla) adla.h.b()).d().m;
                }
                parcel2.writeNoException();
                bhx.a(parcel2, z);
                break;
            case 18:
                e();
                parcel2.writeNoException();
                break;
            case 19:
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsStreaming failed: Binder does not have the permission.");
                } else {
                    ((adla) adla.h.b()).c();
                }
                parcel2.writeNoException();
                break;
            case 20:
                boolean a3 = bhx.a(parcel);
                if (!a()) {
                    Log.w("SystemUpdateServiceImpl", "getIsStreaming failed: Binder does not have the permission.");
                } else {
                    ((adla) adla.h.b()).b(new InstallationOptions(a3, false, false, false));
                }
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
