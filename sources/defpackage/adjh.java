package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: adjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adjh extends qvy {
    public adjh(String str) {
        super(str);
    }

    public final void a(ComponentName componentName) {
        Log.i("SystemUpdateClient", "Unexpectedly disconnected from ChimeraSystemUpdateService.");
        synchronized (adjk.e) {
            adjk.b = null;
            adjk.c = false;
            adjk.d = false;
            adjk.f.clear();
        }
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        adii adii;
        Log.i("SystemUpdateClient", "Connected to ChimeraSystemUpdateService.");
        synchronized (adjk.e) {
            if (iBinder != null) {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.update.ISystemUpdateService");
                    adii = !(queryLocalInterface instanceof adii) ? new adig(iBinder) : (adii) queryLocalInterface;
                } catch (InterruptedException e) {
                    Log.e("SystemUpdateClient", "bindService post connection run is interrupted!");
                    Thread.currentThread().interrupt();
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                    sb.append("bindService post connection run has exception:");
                    sb.append(valueOf);
                    Log.e("SystemUpdateClient", sb.toString());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                adii = null;
            }
            adjk.b = adii;
            if (adjk.b != null) {
                adjk.c = true;
                adjk.e.notifyAll();
                while (!adjk.f.isEmpty()) {
                    ((Runnable) adjk.f.take()).run();
                }
            } else {
                Log.e("SystemUpdateClient", "Failed to connect to SystemUpdateService");
                return;
            }
        }
        adjk.a.sendBroadcast(adkn.a());
    }
}
