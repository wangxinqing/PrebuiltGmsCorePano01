package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: gui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gui extends isy {
    private static final ifu u = new guh();
    public final gun a = new gun();

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.beacon.internal.IBleService");
        if (queryLocalInterface instanceof gup) {
            return (gup) queryLocalInterface;
        }
        return new gup(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.beacon.internal.IBleService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.beacon.internal.IBleService";
    }

    public final int d() {
        return 12800000;
    }

    public final synchronized void j() {
        int a2 = this.a.a();
        if (a2 > 0) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("disconnect(): Cleaning up ");
            sb.append(a2);
            sb.append(" dangling listeners.");
            Log.w("BleClientImpl", sb.toString());
            for (int i = a2 - 1; i >= 0; i--) {
                guo a3 = this.a.a(i);
                a3.a.a();
                try {
                    k().a(u, a3);
                } catch (RemoteException e) {
                    Log.e("BleClientImpl", "RemoteException cleaning up listeners on disconnect.", e);
                }
            }
        }
        super.j();
    }

    public final gup k() {
        return (gup) x();
    }

    public gui(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 111, ise, ica, icb);
    }

    public final synchronized ige a(icc icc, gth gth) {
        return this.a.a(icc, gth);
    }
}
