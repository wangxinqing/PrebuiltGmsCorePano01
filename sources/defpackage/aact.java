package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: aact  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aact extends qvy {
    private final Context a;
    private boolean b = false;

    public aact(Context context) {
        super("scheduler");
        this.a = context;
    }

    public final synchronized void a() {
        if (!this.b) {
            try {
                jca.a().a(this.a, (ServiceConnection) this);
                this.b = true;
            } catch (IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Error while unbinding: ");
                sb.append(valueOf);
                Log.w("NetworkScheduler.TID", sb.toString());
            }
        }
    }

    public final void a(ComponentName componentName) {
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        try {
            if (aaby.a(iBinder)) {
                Message obtain = Message.obtain();
                obtain.what = 4;
                new Messenger(iBinder).send(obtain);
            }
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Error sending init message: ");
            sb.append(valueOf);
            Log.e("NetworkScheduler.TID", sb.toString());
        } catch (Throwable th) {
            a();
            throw th;
        }
        a();
    }
}
