package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;

/* renamed from: gwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwc {
    static hwz a(Context context) {
        try {
            int i = hxk.c;
            hxz.l(context);
            hwz hwz = new hwz();
            Intent intent = new Intent("com.google.android.gms.checkin.BIND_TO_SERVICE");
            intent.setPackage("com.google.android.gms");
            if (jca.a().a(context, intent, hwz, 1)) {
                return hwz;
            }
            throw new IOException("Connection failure.");
        } catch (hxw e) {
            throw new IOException(e);
        }
    }

    public static String b(Context context) {
        gyl gyl;
        iva.b("Calling this from your main thread can lead to deadlock.");
        hwz a = a(context);
        try {
            IBinder a2 = a.a();
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinService");
                gyl = !(queryLocalInterface instanceof gyl) ? new gyj(a2) : (gyl) queryLocalInterface;
            } else {
                gyl = null;
            }
            String b = gyl.b();
            try {
                jca.a().a(context, (ServiceConnection) a);
            } catch (IllegalArgumentException e) {
                Log.i("CheckinServiceClient", "unbind failed: ", e);
            }
            return b;
        } catch (RemoteException e2) {
            Log.i("CheckinServiceClient", "GMS remote exception: ", e2);
            throw new IOException("Remote exception.");
        } catch (InterruptedException e3) {
            throw new IOException("Interrupted exception.");
        } catch (Throwable th) {
            try {
                jca.a().a(context, (ServiceConnection) a);
            } catch (IllegalArgumentException e4) {
                Log.i("CheckinServiceClient", "unbind failed: ", e4);
            }
            throw th;
        }
    }

    public static long c(Context context) {
        gyl gyl;
        iva.b("Calling this from your main thread can lead to deadlock.");
        hwz a = a(context);
        try {
            IBinder a2 = a.a();
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinService");
                gyl = !(queryLocalInterface instanceof gyl) ? new gyj(a2) : (gyl) queryLocalInterface;
            } else {
                gyl = null;
            }
            long c = gyl.c();
            try {
                jca.a().a(context, (ServiceConnection) a);
            } catch (IllegalArgumentException e) {
                Log.i("CheckinServiceClient", "unbind failed: ", e);
            }
            return c;
        } catch (RemoteException e2) {
            Log.i("CheckinServiceClient", "GMS remote exception: ", e2);
            throw new IOException("Remote exception.");
        } catch (InterruptedException e3) {
            throw new IOException("Interrupted exception.");
        } catch (Throwable th) {
            try {
                jca.a().a(context, (ServiceConnection) a);
            } catch (IllegalArgumentException e4) {
                Log.i("CheckinServiceClient", "unbind failed: ", e4);
            }
            throw th;
        }
    }
}
