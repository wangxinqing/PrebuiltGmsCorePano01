package defpackage;

import android.os.Handler;
import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.ExecutorDelivery;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ihx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ihx extends RequestQueue {
    public static final ThreadLocal d = new ThreadLocal();
    public final Map c = new WeakHashMap(8, 4.0f);
    public final amsv e = amta.a(ihu.a);
    private final amsv f = amta.a(iht.a);

    public ihx(Cache cache, Network network, qvr qvr) {
        super(cache, network, 4, new ExecutorDelivery((Handler) qvr));
        if (((Boolean) this.f.a()).booleanValue()) {
            addRequestEventListener(new ihv(this));
        }
    }

    public final Request add(Request request) {
        ihw ihw;
        if (((Boolean) this.f.a()).booleanValue()) {
            synchronized (this) {
                amlo a = amlo.a();
                if (!((Boolean) this.e.a()).booleanValue()) {
                    ihw = new ihw(a);
                } else {
                    amkr a2 = amlv.a("Volley");
                    try {
                        nkg nkg = nkf.b;
                        aosh f2 = aosh.f();
                        nkg.a(a2, f2);
                        ihw ihw2 = new ihw(a, f2);
                        if (a2 != null) {
                            a2.close();
                        }
                        ihw = ihw2;
                    } catch (Throwable th) {
                        apev.a(th, th);
                    }
                }
                this.c.put(request, ihw);
            }
        }
        super.add(request);
        return request;
        throw th;
    }

    public final void stop() {
        Log.e("GmsRequestQueue", "Tried to stop global GMSCore RequestQueue. This is likely unintended, so ignoring.");
    }
}
