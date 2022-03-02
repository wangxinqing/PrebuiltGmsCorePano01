package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.nearby.messages.Message;

/* renamed from: cdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cdr implements Runnable {
    final /* synthetic */ Message a;
    final /* synthetic */ cds b;

    public cdr(cds cds, Message message) {
        this.b = cds;
        this.a = message;
    }

    public final void run() {
        cdu cdu = this.b.a;
        ccj ccj = cdu.b;
        ContextData contextData = (ContextData) cdu.l.get(this.a);
        if (contextData == null) {
            ((anih) ((anih) bxk.a.c()).a("cdr", "run", 353, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Got an onLost without a corresponding onFound for message: %s", (Object) this.a);
            return;
        }
        jti jti = new jti(contextData);
        cdu cdu2 = this.b.a;
        jti.a(cbi.i().a());
        this.b.a.c(jti.a());
        this.b.a.l.remove(this.a);
    }
}
