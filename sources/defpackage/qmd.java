package defpackage;

import android.content.ComponentName;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.chimera.Activity;
import java.util.Locale;

/* renamed from: qmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qmd extends qvy {
    final /* synthetic */ qme a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qmd(qme qme, String str) {
        super(str);
        this.a = qme;
    }

    public final void a(ComponentName componentName) {
        qfn qfn = qme.a;
        new Object[1][0] = componentName;
        this.a.c = null;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        cpw cpw;
        qfn qfn = qme.a;
        new Object[1][0] = componentName;
        qme qme = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            cpw = queryLocalInterface instanceof cpw ? (cpw) queryLocalInterface : new cpw(iBinder);
        } else {
            cpw = null;
        }
        qme.c = cpw;
        try {
            qme qme2 = this.a;
            if (qme2.c != null) {
                Activity activity = qme2.getActivity();
                if (activity != null) {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        qme2.a("InstallSupervisorFragment.Offline");
                        throw new RemoteException("Will not request install without Internet connection.");
                    }
                    String packageName = activity.getPackageName();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("show_completion", false);
                    Bundle a2 = qme2.c.a(packageName, "com.google.android.instantapps.supervisor", bundle);
                    if (a2 != null) {
                        int i = a2.getInt("status_code", -4);
                        if (i != 0) {
                            String format = String.format(Locale.US, "The failure status_code: %d", new Object[]{Integer.valueOf(i)});
                            Bundle bundle2 = a2.getBundle("error");
                            if (bundle2 != null) {
                                String string = bundle2.getString("reason", "");
                                String string2 = bundle2.getString("exception_type", "");
                                String valueOf = String.valueOf(format);
                                String valueOf2 = String.valueOf(String.format(" Failure reason: %s, failure exception: %s", new Object[]{string, string2}));
                                format = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                            }
                            throw new RemoteException(format);
                        }
                        qme2.b = true;
                        qme2.a("InstallSupervisorFragment.InstallRequested");
                        return;
                    }
                    throw new RemoteException("Received null result from PlayInstallService");
                }
                throw new RemoteException("onServiceConnected without context");
            }
            throw new RemoteException("IPlayInstallService.Stub.asInterface returned null");
        } catch (RemoteException e) {
            qme.a.a(e);
            this.a.a();
        }
    }
}
