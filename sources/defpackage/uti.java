package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.webrtc.PeerConnection;

/* renamed from: uti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uti implements utj {
    private final ute a;
    private final usu b;
    private final String c;
    private utn d;
    private auay e;

    public uti(ute ute, usu usu, String str) {
        this.a = ute;
        this.b = usu;
        this.c = str;
    }

    private static awgr b(auay auay) {
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
        auay.getClass();
        awgr.c = auay;
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

    private final boolean d() {
        return this.e != null;
    }

    private final synchronized void e() {
        utn utn = this.d;
        if (utn != null) {
            utn.a();
            this.d = null;
            ((anih) ((anih) ulh.a.d()).a("uti", "e", 257, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped receiving messages from tachyon.");
            return;
        }
        ((anih) ((anih) ulh.a.c()).a("uti", "e", 250, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping stop receiving messages. We are not currently receiving messages from tachyon.");
    }

    public final synchronized boolean a() {
        try {
            ute ute = this.a;
            utm utm = ute.b;
            ClientContext clientContext = ute.a;
            usu usu = this.b;
            String str = this.c;
            aucd o = awgh.e.o();
            awgr b2 = b(auay.b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            awgh awgh = (awgh) o.b;
            b2.getClass();
            awgh.a = b2;
            "Nearby".getClass();
            awgh.b = "Nearby";
            String a2 = arzd.a();
            aucd o2 = awgj.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            a2.getClass();
            ((awgj) o2.b).d = a2;
            aucd o3 = awgo.c.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ((awgo) o3.b).a = 1;
            String str2 = usu.a;
            str2.getClass();
            ((awgo) o3.b).b = str2;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            awgo awgo = (awgo) o3.i();
            awgo.getClass();
            ((awgj) o2.b).a = awgo;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            awgj awgj = (awgj) o2.b;
            str.getClass();
            awgj.c = str;
            String str3 = usu.a;
            str3.getClass();
            awgj.b = str3;
            awgj awgj2 = (awgj) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            awgj2.getClass();
            ((awgh) o.b).c = awgj2;
            aucd o4 = awgq.c.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            ((awgq) o4.b).b = 2;
            String country = Locale.getDefault().getCountry();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            country.getClass();
            ((awgq) o4.b).a = country;
            awgq awgq = (awgq) o4.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            awgq.getClass();
            ((awgh) o.b).d = awgq;
            awgh awgh2 = (awgh) o.i();
            if (utm.c == null) {
                utm.c = baaj.a(baai.UNARY, "google.internal.communications.instantmessaging.v1.Registration/RegisterAnonymous", baoq.a(awgh.e), baoq.a(awgi.b));
            }
            awgm awgm = ((awgi) utm.a.a(utm.c, clientContext, awgh2, (long) utm.b, TimeUnit.MILLISECONDS)).a;
            if (awgm == null) {
                ((anih) ((anih) ulh.a.c()).a("uti", "a", 95, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The tachyon register response is missing an auth token.");
                return false;
            }
            this.e = awgm.a;
            ((anih) ((anih) ulh.a.d()).a("uti", "a", 99, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Registered with tachyon as %s.", (Object) this.b);
            return true;
        } catch (babk | eif e2) {
            anih anih = (anih) ulh.a.c();
            anih.a(e2);
            ((anih) anih.a("uti", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to register with tachyon.");
            return false;
        }
    }

    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (!d()) {
            ((anih) ((anih) ulh.a.c()).a("uti", "c", 268, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping get ice servers. We are not registered with tachyon.");
            return arrayList;
        }
        try {
            ute ute = this.a;
            utl utl = ute.e;
            ClientContext clientContext = ute.a;
            auay auay = this.e;
            aucd o = awfu.c.o();
            awgr b2 = b(auay);
            if (o.c) {
                o.c();
                o.c = false;
            }
            awfu awfu = (awfu) o.b;
            b2.getClass();
            awfu.a = b2;
            "skylift_prod".getClass();
            awfu.b = "skylift_prod";
            awfq awfq = utl.a(clientContext, (awfu) o.i()).a;
            if (awfq == null) {
                awfq = awfq.b;
            }
            for (awfr awfr : awfq.a) {
                String str = awfr.b;
                String str2 = awfr.c;
                for (String a2 : awfr.a) {
                    bayf a3 = PeerConnection.IceServer.a(a2);
                    a3.a = str;
                    a3.b = str2;
                    arrayList.add(a3.a());
                }
            }
            ((anih) ((anih) ulh.a.d()).a("uti", "c", 287, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Got %d ice servers from tachyon.", arrayList.size());
        } catch (babk | eif e2) {
            anih anih = (anih) ulh.a.c();
            anih.a(e2);
            ((anih) anih.a("uti", "c", 289, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get ice servers from tachyon.");
        }
        return arrayList;
    }

    public final synchronized boolean b() {
        if (!d()) {
            ((anih) ((anih) ulh.a.c()).a("uti", "b", 123, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping unregister. We are not registered with tachyon.");
            return false;
        }
        boolean a2 = a(this.e);
        this.e = null;
        return a2;
    }

    public final boolean a(auay auay) {
        try {
            ute ute = this.a;
            utm utm = ute.b;
            ClientContext clientContext = ute.a;
            aucd o = awfs.d.o();
            awgr b2 = b(auay);
            if (o.c) {
                o.c();
                o.c = false;
            }
            awfs awfs = (awfs) o.b;
            b2.getClass();
            awfs.a = b2;
            awfs.c = 1;
            ((awfs) o.b).b = 2;
            awfs awfs2 = (awfs) o.i();
            if (utm.d == null) {
                utm.d = baaj.a(baai.UNARY, "google.internal.communications.instantmessaging.v1.Registration/DeleteAccount", baoq.a(awfs.d), baoq.a(awft.a));
            }
            awft awft = (awft) utm.a.a(utm.d, clientContext, awfs2, (long) utm.b, TimeUnit.MILLISECONDS);
            ((anih) ((anih) ulh.a.d()).a("uti", "a", 137, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unregistered from tachyon.");
            this.e = null;
            e();
            return true;
        } catch (babk | eif e2) {
            anih anih = (anih) ulh.a.c();
            anih.a(e2);
            ((anih) anih.a("uti", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to unregister from tachyon.");
            return false;
        }
    }

    public final synchronized boolean a(Executor executor) {
        if (!d()) {
            ((anih) ((anih) ulh.a.c()).a("uti", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping unregister async. We are not registered with tachyon.");
            return false;
        }
        executor.execute(new utf(this, this.e.c(0)));
        this.e = null;
        return true;
    }

    public final synchronized boolean a(Executor executor, usu usu, byte[] bArr) {
        if (!d()) {
            ((anih) ((anih) ulh.a.c()).a("uti", "a", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping send message async. We are not registered with tachyon.");
            return false;
        }
        executor.execute(new utg(this, usu, this.e.c(0), bArr));
        return true;
    }

    public final synchronized boolean a(ulv ulv) {
        synchronized (this) {
            if (!d()) {
                ((anih) ((anih) ulh.a.c()).a("uti", "a", 194, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping receive messages. We are not registered with tachyon.");
                return false;
            }
            this.d = this.a.d;
            aosh f = aosh.f();
            try {
                utn utn = this.d;
                ClientContext clientContext = this.a.a;
                auay auay = this.e;
                aucd o = awga.b.o();
                awgr b2 = b(auay);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                b2.getClass();
                ((awga) o.b).a = b2;
                awga awga = (awga) o.i();
                uth uth = new uth(f, ulv);
                if (utn.c == null) {
                    utn.c = baaj.a(baai.SERVER_STREAMING, "google.internal.communications.instantmessaging.v1.Messaging/ReceiveMessages", baoq.a(awga.b), baoq.a(awgg.c));
                }
                utn.a.a(utn.c, clientContext, awga, uth, (long) utn.b, TimeUnit.MILLISECONDS);
                if (!thr.b("TachyonLegacySignalingMessenger.readyToReceiveMessages", (Future) f, aymi.Q())) {
                    return false;
                }
                ((anih) ((anih) ulh.a.d()).a("uti", "a", 244, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Receiving messages from tachyon.");
                return true;
            } catch (babk | eif e2) {
                anih anih = (anih) ulh.a.c();
                anih.a(e2);
                ((anih) anih.a("uti", "a", 231, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive messages from tachyon.");
                return false;
            }
        }
    }

    public final boolean a(usu usu, auay auay, byte[] bArr) {
        try {
            ute ute = this.a;
            utk utk = ute.c;
            ClientContext clientContext = ute.a;
            aucd o = awfx.d.o();
            awgr b2 = b(auay);
            if (o.c) {
                o.c();
                o.c = false;
            }
            b2.getClass();
            ((awfx) o.b).c = b2;
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
            auay a2 = auay.a(bArr);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            awfw awfw2 = (awfw) o2.b;
            a2.getClass();
            awfw2.c = a2;
            awfw2.d = 2;
            awfw awfw3 = (awfw) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            awfw3.getClass();
            ((awfx) o.b).b = awfw3;
            aucd o3 = awgp.e.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            awgp awgp = (awgp) o3.b;
            "Nearby".getClass();
            awgp.c = "Nearby";
            awgp.a = basw.a(15);
            String str = usu.a;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            str.getClass();
            ((awgp) o3.b).b = str;
            awgp awgp2 = (awgp) o3.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            awgp2.getClass();
            ((awfx) o.b).a = awgp2;
            awfx awfx = (awfx) o.i();
            if (utk.c == null) {
                utk.c = baaj.a(baai.UNARY, "google.internal.communications.instantmessaging.v1.Messaging/SendMessage", baoq.a(awfx.d), baoq.a(awfy.a));
            }
            awfy awfy = (awfy) utk.a.a(utk.c, clientContext, awfx, (long) utk.b, TimeUnit.MILLISECONDS);
            ((anih) ((anih) ulh.a.d()).a("uti", "a", 182, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Sent message to tachyon.");
            return true;
        } catch (babk | eif e2) {
            anih anih = (anih) ulh.a.c();
            anih.a(e2);
            ((anih) anih.a("uti", "a", 185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send message to tachyon.");
            return false;
        }
    }

    public final synchronized boolean a(usu usu, byte[] bArr) {
        if (!d()) {
            ((anih) ((anih) ulh.a.c()).a("uti", "a", 150, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping send message. We are not registered with tachyon.");
            return false;
        }
        return a(usu, this.e, bArr);
    }
}
