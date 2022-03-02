package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: niw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class niw implements Runnable {
    public final nis a;
    final /* synthetic */ nix b;
    private final agif c = agfu.a().b();

    public niw(nix nix, nis nis) {
        this.b = nix;
        this.a = nis;
    }

    public final void run() {
        amkr a2;
        amkr a3;
        amky a4;
        agfu a5 = agfu.a();
        agif agif = this.c;
        int i = this.a.n;
        StringBuilder sb = new StringBuilder(31);
        sb.append(i);
        sb.append("-AsyncOp-Dispatching");
        a5.a(agif, sb.toString());
        Status status = Status.a;
        try {
            amkr a6 = amlv.a("AsyncOpTask");
            try {
                this.b.e.onBeforeDispatching();
                a2 = amlv.a("GlobalPreProcessing");
                for (qbq a7 : nix.a) {
                    a7.a(this.a);
                }
                if (a2 != null) {
                    a2.close();
                }
                a3 = amlv.a("ServicePreProcessing");
                for (qbq a8 : this.b.f) {
                    a8.a(this.a);
                }
                if (a3 != null) {
                    a3.close();
                }
                a4 = nkf.b.a(amlv.a("AsyncOpImpl"));
                this.a.a(this.b.d);
                if (a4 != null) {
                    a4.close();
                }
                if (a6 != null) {
                    a6.close();
                }
                nix.c.execute(amll.a((Runnable) new niv(this, status)));
                return;
                throw th;
                throw th;
                throw th;
            } catch (Throwable th) {
                if (a6 != null) {
                    a6.close();
                }
                throw th;
            }
        } catch (nja e) {
            nis nis = this.a;
            Status status2 = e.a;
            if (!e.b) {
                int i2 = nis.n;
                String str = nis.m;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
                sb2.append("serviceID=");
                sb2.append(i2);
                sb2.append(", operation=");
                sb2.append(str);
                Log.e("AsyncOperation", sb2.toString(), e);
            }
            try {
                Parcel obtain = Parcel.obtain();
                icp.a(status2, obtain, 0);
                obtain.setDataPosition(0);
                nis.a((Status) Status.CREATOR.createFromParcel(obtain));
                obtain.recycle();
            } catch (RemoteException e2) {
            }
            status = status2;
        } catch (RemoteException e3) {
            status = Status.g;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }
}
