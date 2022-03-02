package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import java.util.concurrent.TimeUnit;

/* renamed from: aand  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aand extends nis {
    public final aanc a;
    private final zzw b;
    private final aanf c;
    private final int d;

    static {
        aand.class.getSimpleName();
    }

    public aand(Context context, zzw zzw) {
        super(45, "listharmful");
        this.d = aann.a(context);
        this.b = zzw;
        this.a = new aanc(context, this.b);
        this.c = new aanf(context, this.b, TimeUnit.HOURS.toMillis(1));
    }

    public static final void a(Context context, ServiceConnection serviceConnection) {
        jca.a().a(context, new Intent("com.google.android.vending.verifier.ACTION_PACKAGE_VERIFICATION_API").setPackage("com.android.vending"), serviceConnection, 1);
    }

    public final void a(Context context) {
        if (!aann.b(context, "com.android.vending")) {
            a(new Status(12003));
        } else if (this.d < 80700200) {
            a(new Status(12003));
        } else if (!aann.b(context)) {
            a(new Status(12005));
        } else if (this.d >= 80852100) {
            a(context, this.c.c);
        } else {
            a(context, this.a.c);
        }
    }

    public final void a(Status status) {
        zzw zzw = this.b;
        if (zzw != null) {
            try {
                zzw.a(status, (HarmfulAppsInfo) null);
            } catch (RemoteException e) {
            }
        }
    }
}
