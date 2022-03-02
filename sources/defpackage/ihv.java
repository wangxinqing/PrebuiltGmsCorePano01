package defpackage;

import android.util.Log;
import com.android.volley.Request;
import com.android.volley.RequestQueue;

/* renamed from: ihv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ihv implements RequestQueue.RequestEventListener {
    final /* synthetic */ ihx a;

    public ihv(ihx ihx) {
        this.a = ihx;
    }

    public final void onRequestEvent(Request request, int i) {
        synchronized (this.a) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (((Boolean) this.a.e.a()).booleanValue()) {
                                    ((ihw) this.a.c.get(request)).b.b((Object) null);
                                }
                                this.a.c.remove(request);
                            }
                        }
                    }
                }
                amlo amlo = (amlo) ihx.d.get();
                if (amlo == null) {
                    Log.e("GmsRequestQueue", "Old trace reference is null");
                } else {
                    amlo.a(amlo);
                    ihx.d.remove();
                }
            }
            if (ihx.d.get() == null) {
                ihx.d.set(amlo.a());
            }
            amlo.a(((ihw) this.a.c.get(request)).a);
        }
    }
}
