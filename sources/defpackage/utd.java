package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.webrtc.PeerConnection;

/* renamed from: utd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class utd implements utj {
    private final ute a;
    private final usu b;
    private final String c;
    private utn d;

    public utd(ute ute, usu usu, String str) {
        this.a = ute;
        this.b = usu;
        this.c = str;
    }

    private static awgr a(usu usu) {
        aucd o = awgr.f.o();
        String uuid = UUID.randomUUID().toString();
        if (o.c) {
            o.c();
            o.c = false;
        }
        awgr awgr = (awgr) o.b;
        uuid.getClass();
        awgr.a = uuid;
        "Nearby".getClass();
        awgr.b = "Nearby";
        awgp b2 = b(usu);
        if (o.c) {
            o.c();
            o.c = false;
        }
        b2.getClass();
        ((awgr) o.b).e = b2;
        aucd o2 = awgn.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((awgn) o2.b).b = 1;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((awgn) o2.b).d = 1;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((awgn) o2.b).e = 24;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((awgn) o2.b).f = 0;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((awgn) o2.b).a = 4;
        awgn awgn = (awgn) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        awgn.getClass();
        ((awgr) o.b).d = awgn;
        return (awgr) o.i();
    }

    private static awgp b(usu usu) {
        aucd o = awgp.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        awgp awgp = (awgp) o.b;
        "Nearby".getClass();
        awgp.c = "Nearby";
        awgp.a = basw.a(29);
        String str = usu.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        str.getClass();
        ((awgp) o.b).b = str;
        aucd o2 = awgq.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((awgq) o2.b).b = 2;
        String country = arzd.b().getCountry();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        country.getClass();
        ((awgq) o2.b).a = country;
        awgq awgq = (awgq) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        awgq.getClass();
        ((awgp) o.b).d = awgq;
        return (awgp) o.i();
    }

    private final synchronized void d() {
        if (!e()) {
            ((anih) ((anih) ulh.a.c()).a("utd", "d", 174, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping stop receiving messages. We are not currently receiving messages from tachyon.");
            return;
        }
        this.d.a();
        this.d = null;
        ((anih) ((anih) ulh.a.d()).a("utd", "d", 181, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped receiving messages from tachyon.");
    }

    private final boolean e() {
        return this.d != null;
    }

    public final synchronized boolean a() {
        return true;
    }

    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            ute ute = this.a;
            utl utl = ute.e;
            ClientContext clientContext = ute.a;
            usu usu = this.b;
            aucd o = awfu.c.o();
            awgr a2 = a(usu);
            if (o.c) {
                o.c();
                o.c = false;
            }
            awfu awfu = (awfu) o.b;
            a2.getClass();
            awfu.a = a2;
            "skylift_prod".getClass();
            awfu.b = "skylift_prod";
            awfq awfq = utl.a(clientContext, (awfu) o.i()).a;
            if (awfq == null) {
                awfq = awfq.b;
            }
            for (awfr awfr : awfq.a) {
                String str = awfr.b;
                String str2 = awfr.c;
                for (String a3 : awfr.a) {
                    bayf a4 = PeerConnection.IceServer.a(a3);
                    a4.a = str;
                    a4.b = str2;
                    arrayList.add(a4.a());
                }
            }
            ((anih) ((anih) ulh.a.d()).a("utd", "c", 203, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Got %d ice servers from tachyon.", arrayList.size());
        } catch (babk | eif e) {
            anih anih = (anih) ulh.a.c();
            anih.a(e);
            ((anih) anih.a("utd", "c", 205, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get ice servers from tachyon.");
        }
        return arrayList;
    }

    public final synchronized boolean b() {
        if (e()) {
            d();
        }
        return true;
    }

    public final synchronized boolean a(Executor executor) {
        executor.execute(new uta(this));
        return true;
    }

    public final synchronized boolean a(Executor executor, usu usu, byte[] bArr) {
        executor.execute(new utb(this, usu, bArr));
        return true;
    }

    public final synchronized boolean a(ulv ulv) {
        synchronized (this) {
            if (e()) {
                ((anih) ((anih) ulh.a.c()).a("utd", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping receive messages. We are already receiving messages from tachyon.");
                return false;
            }
            this.d = this.a.d;
            aosh f = aosh.f();
            try {
                utn utn = this.d;
                ClientContext clientContext = this.a.a;
                usu usu = this.b;
                String str = this.c;
                aucd o = awfz.c.o();
                awgr a2 = a(usu);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                awfz awfz = (awfz) o.b;
                a2.getClass();
                awfz.a = a2;
                str.getClass();
                awfz.b = str;
                awfz awfz2 = (awfz) o.i();
                utc utc = new utc(f, ulv);
                if (utn.d == null) {
                    utn.d = baaj.a(baai.SERVER_STREAMING, "google.internal.communications.instantmessaging.v1.Messaging/ReceiveMessagesExpress", baoq.a(awfz.c), baoq.a(awgg.c));
                }
                utn.a.a(utn.d, clientContext, awfz2, utc, (long) utn.b, TimeUnit.MILLISECONDS);
                if (!thr.b("TachyonExpressSignalingMessenger.readyToReceiveMessages", (Future) f, aymi.Q())) {
                    return false;
                }
                ((anih) ((anih) ulh.a.d()).a("utd", "a", 168, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Receiving messages from tachyon.");
                return true;
            } catch (babk | eif e) {
                anih anih = (anih) ulh.a.c();
                anih.a(e);
                ((anih) anih.a("utd", "a", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive messages from tachyon.");
                return false;
            }
        }
    }

    public final synchronized boolean a(usu usu, byte[] bArr) {
        try {
            ute ute = this.a;
            utk utk = ute.c;
            ClientContext clientContext = ute.a;
            usu usu2 = this.b;
            String str = this.c;
            aucd o = awgk.e.o();
            awgr a2 = a(usu2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            awgk awgk = (awgk) o.b;
            a2.getClass();
            awgk.a = a2;
            str.getClass();
            awgk.b = str;
            aucd o2 = awfw.e.o();
            String uuid = UUID.randomUUID().toString();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            awfw awfw = (awfw) o2.b;
            uuid.getClass();
            awfw.a = uuid;
            awfw.b = 4;
            auay a3 = auay.a(bArr);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            awfw awfw2 = (awfw) o2.b;
            a3.getClass();
            awfw2.c = a3;
            awfw2.d = 2;
            awfw awfw3 = (awfw) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            awfw3.getClass();
            ((awgk) o.b).d = awfw3;
            awgp b2 = b(usu);
            if (o.c) {
                o.c();
                o.c = false;
            }
            b2.getClass();
            ((awgk) o.b).c = b2;
            awgk awgk2 = (awgk) o.i();
            if (utk.d == null) {
                utk.d = baaj.a(baai.UNARY, "google.internal.communications.instantmessaging.v1.Messaging/SendMessageExpress", baoq.a(awgk.e), baoq.a(awgl.a));
            }
            awgl awgl = (awgl) utk.a.a(utk.d, clientContext, awgk2, (long) utk.b, TimeUnit.MILLISECONDS);
            ((anih) ((anih) ulh.a.d()).a("utd", "a", 98, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Sent message to tachyon.");
        } catch (babk | eif e) {
            anih anih = (anih) ulh.a.c();
            anih.a(e);
            ((anih) anih.a("utd", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send message to tachyon.");
            return false;
        }
        return true;
    }
}
