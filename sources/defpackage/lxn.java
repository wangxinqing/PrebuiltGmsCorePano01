package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: lxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxn extends lxl implements niz {
    public static final Status a = new Status(13, "Caller package not allowed to access this API.");
    private final Context b;
    private final nix c;
    private final lts d;

    public lxn(Context context, nix nix) {
        this.b = context;
        this.c = nix;
        this.d = new lts(context);
    }

    private static final void a(ifu ifu, Status status) {
        try {
            ifu.a(status);
        } catch (RemoteException e) {
            Log.w("CAR.DRIVINGMODE", "Client died during Driving Mode API call", e);
        }
    }

    public final void b(ifu ifu, int i) {
        if (a("endDrivingMode")) {
            this.c.a(new lxo(ifu, i));
        } else {
            a(ifu, a);
        }
    }

    private final boolean a(String str) {
        boolean z;
        String[] packagesForUid = this.b.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null) {
            z = false;
            for (String a2 : packagesForUid) {
                if (anbs.a(amsk.a(',').b().a().a((CharSequence) awqd.a.a().g()), (Object) a2)) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            Log.e("CAR.DRIVINGMODE", String.format("Calling package %s is not whitelisted to access %s method", new Object[]{this.b.getPackageManager().getNameForUid(Binder.getCallingUid()), str}));
            this.d.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_CLIENT_PACKAGE_VERIFICATION_FAIL);
        }
        return z;
    }

    public final void a(ifu ifu) {
        this.c.a(new lxp(ifu));
    }

    public final void a(ifu ifu, int i) {
        if (a("startDrivingMode")) {
            this.c.a(new lxq(ifu, i));
        } else {
            a(ifu, a);
        }
    }

    public final void a(ifu ifu, int i, boolean z) {
        if (a("startDrivingModeSetup")) {
            this.c.a(new lxr(ifu, i, z));
        } else {
            a(ifu, a);
        }
    }
}
