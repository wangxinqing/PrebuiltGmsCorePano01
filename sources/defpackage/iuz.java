package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: iuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iuz {
    private static ydo a = null;

    public static synchronized void a(Context context) {
        ydo ydo;
        synchronized (iuz.class) {
            if (a == null) {
                try {
                    IBinder a2 = mcx.a(context, mcx.c, "permissions").a("com.google.android.gms.permissions.PermissionsImpl");
                    if (a2 != null) {
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.permissions.IPermissions");
                        ydo = !(queryLocalInterface instanceof ydo) ? new ydo(a2) : (ydo) queryLocalInterface;
                    } else {
                        ydo = null;
                    }
                    a = ydo;
                    mby a3 = mbz.a((Object) context);
                    Parcel aQ = ydo.aQ();
                    bhx.a(aQ, (IInterface) a3);
                    ydo.b(1, aQ);
                } catch (RemoteException | mct e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Failed to install AppOpsCollector: ");
                    sb.append(valueOf);
                    Log.w("PermissionsInstaller", sb.toString());
                    a = null;
                }
            }
        }
    }
}
