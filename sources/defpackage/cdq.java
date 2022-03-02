package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.nearby.messages.Message;

/* renamed from: cdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cdq implements Runnable {
    final /* synthetic */ Message a;
    final /* synthetic */ cds b;

    public cdq(cds cds, Message message) {
        this.b = cds;
        this.a = message;
    }

    public final void run() {
        cdu cdu = this.b.a;
        ccj ccj = cdu.b;
        if (cdu.l.containsKey(this.a)) {
            ((anih) ((anih) bxk.a.c()).a("cdq", "run", 298, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Beacon message was already found.  Ignoring.  message=%s", (Object) this.a);
            return;
        }
        cdu cdu2 = this.b.a;
        Message message = this.a;
        if (!cdu2.a(message.d, message.c, message.b)) {
            ((anih) ((anih) bxk.a.c()).a("cdq", "run", 311, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedBeaconProducer] Beacon message does not match filter. message=%s", (Object) this.a);
            return;
        }
        aucd o = atru.d.o();
        aucd o2 = atrt.d.o();
        String str = this.a.d;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atrt atrt = (atrt) o2.b;
        str.getClass();
        int i = atrt.a | 1;
        atrt.a = i;
        atrt.b = str;
        String str2 = this.a.c;
        str2.getClass();
        atrt.a = i | 2;
        atrt.c = str2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atru atru = (atru) o.b;
        atrt atrt2 = (atrt) o2.i();
        atrt2.getClass();
        atru.b = atrt2;
        atru.a |= 1;
        auay a2 = auay.a(this.a.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atru atru2 = (atru) o.b;
        a2.getClass();
        atru2.a |= 2;
        atru2.c = a2;
        jti jti = new jti(5, 26, 1);
        cdu cdu3 = this.b.a;
        jti.a(jut.b(cbi.i().a()));
        Message message2 = this.a;
        jti.a(jun.a(message2.d, message2.c, (String) null));
        jti.a(atru.e, (atru) o.i());
        ContextData a3 = jti.a();
        this.b.a.c(a3);
        this.b.a.l.put(this.a, a3);
    }
}
