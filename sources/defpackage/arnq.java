package defpackage;

import android.os.Handler;
import java.util.Map;

/* renamed from: arnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class arnq {
    private final nz a = new nz();
    private final Handler b;

    public arnq(Handler handler) {
        if (handler != null) {
            this.b = handler;
            return;
        }
        throw new IllegalArgumentException("'handler' cannot be null.");
    }

    private final arnp a(arne arne, Handler handler) {
        arnp arnp = (arnp) this.a.get(arne);
        if (arnp != null) {
            return arnp;
        }
        arnp arnp2 = new arnp(handler);
        this.a.put(arne, arnp2);
        return arnp2;
    }

    public final void c(arne arne) {
        c(arne, this.b);
    }

    public final void d(arne arne) {
        if (arne != null) {
            synchronized (this.a) {
                this.a.remove(arne);
            }
        }
    }

    public final void c(arne arne, Handler handler) {
        if (arne == null) {
            throw new IllegalArgumentException("Argument 'callback' cannot be null");
        } else if (handler != null) {
            synchronized (this.a) {
                arnp a2 = a(arne, handler);
                synchronized (a2.b) {
                    a2.c = true;
                    a2.b.clear();
                }
            }
        } else {
            throw new IllegalArgumentException("Argument 'handler' cannot be null");
        }
    }

    public final void a(int i, arnd arnd, arnh arnh, arnt arnt) {
        nz nzVar;
        boolean z;
        arnn arnn = new arnn(arnd, arnh, arnt);
        synchronized (this.a) {
            nzVar = new nz((ou) this.a);
        }
        for (Map.Entry entry : nzVar.entrySet()) {
            arne arne = (arne) entry.getKey();
            arnp arnp = (arnp) entry.getValue();
            synchronized (arnp.b) {
                z = true;
                if (!arnp.c && !arnp.b.contains(Integer.valueOf(i))) {
                    z = false;
                }
            }
            if (z) {
                arnp.a.post(new arno(arnn, arne));
            }
        }
    }

    public final void a(int i, arne arne) {
        a(i, arne, this.b);
    }

    public final void a(int i, arne arne, Handler handler) {
        if (arne == null) {
            throw new IllegalArgumentException("Argument 'callback' cannot be null");
        } else if (handler != null) {
            synchronized (this.a) {
                arnp a2 = a(arne, handler);
                synchronized (a2.b) {
                    if (!a2.c) {
                        a2.b.add(Integer.valueOf(i));
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Argument 'handler' cannot be null");
        }
    }
}
