package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: qwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qwv extends qvr {
    final /* synthetic */ qwz a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qwv(qwz qwz, Looper looper) {
        super(looper);
        this.a = qwz;
    }

    public final void handleMessage(Message message) {
        Messenger messenger;
        String string;
        StackTraceElement[] stackTraceElementArr;
        aorr aorr;
        int i = message.what;
        if (i == 1) {
            Bundle data = message.getData();
            if (!data.isEmpty() && (messenger = message.replyTo) != null && (string = data.getString("tag")) != null) {
                ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                data.getLong("max_exec_duration", 180);
                if (!this.a.a(string)) {
                    this.a.a(new qwy(this.a, string, messenger, data.getBundle("extras"), (List) parcelableArrayList, qwd.a(data.getBundle("engine_flags"))));
                }
            }
        } else if (i == 2) {
            Bundle data2 = message.getData();
            if (!data2.isEmpty()) {
                String string2 = data2.getString("tag");
                if (string2 == null) {
                    String valueOf = String.valueOf(message);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
                    sb.append("Empty tag: ");
                    sb.append(valueOf);
                    Log.w("GmsTaskChimeraService", sb.toString());
                    return;
                }
                if (axbn.e() && message.arg1 == qxy.a(3)) {
                    qwz qwz = this.a;
                    synchronized (qwz.j) {
                        Thread thread = (Thread) qwz.j.get(string2);
                        if (thread != null) {
                            stackTraceElementArr = thread.getStackTrace();
                        } else {
                            stackTraceElementArr = null;
                        }
                    }
                    if (stackTraceElementArr == null) {
                        Class<?> cls = qwz.c().getClass();
                        aorr = ((qyd) qwz.l.a()).a(qwz, cls, string2, new StackTraceElement[]{new StackTraceElement(cls.getName(), "onRunAsync", cls.getName(), 0)});
                    } else {
                        aorr = ((qyd) qwz.l.a()).a(qwz, qwz.c().getClass(), string2, stackTraceElementArr);
                    }
                    aorl.a(aorr, new qwu(), aoqm.a);
                }
                if (((Boolean) this.a.i.a()).booleanValue()) {
                    synchronized (this.a.k) {
                        Future future = (Future) this.a.k.get(string2);
                        if (future != null) {
                            String valueOf2 = String.valueOf(message);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                            sb2.append("Interrupting timed out task: ");
                            sb2.append(valueOf2);
                            Log.w("GmsTaskChimeraService", sb2.toString());
                            future.cancel(true);
                        }
                    }
                }
            }
        } else if (i != 4) {
            String valueOf3 = String.valueOf(message);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 31);
            sb3.append("Unrecognized message received: ");
            sb3.append(valueOf3);
            Log.e("GmsTaskChimeraService", sb3.toString());
        } else {
            this.a.b();
        }
    }
}
