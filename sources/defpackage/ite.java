package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: ite  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ite implements Handler.Callback {
    final /* synthetic */ itc a;

    public ite(itc itc) {
        this.a = itc;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.a) {
                itb itb = (itb) message.obj;
                itd itd = (itd) this.a.a.get(itb);
                if (itd != null && itd.a()) {
                    if (itd.c) {
                        itd.g.c.removeMessages(1, itd.e);
                        itc itc = itd.g;
                        itc.d.a(itc.b, (ServiceConnection) itd);
                        itd.c = false;
                        itd.b = 2;
                    }
                    this.a.a.remove(itb);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.a.a) {
                itb itb2 = (itb) message.obj;
                itd itd2 = (itd) this.a.a.get(itb2);
                if (itd2 != null && itd2.b == 3) {
                    String valueOf = String.valueOf(itb2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = itd2.f;
                    if (componentName == null) {
                        componentName = itb2.b;
                    }
                    if (componentName == null) {
                        String str = itb2.a;
                        iva.a((Object) str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    itd2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
