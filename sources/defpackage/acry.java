package defpackage;

import java.util.concurrent.Future;

/* renamed from: acry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acry {
    public boolean a = true;
    public Future b;
    final /* synthetic */ acrz c;
    private final String d;

    public acry(acrz acrz, String str) {
        this.c = acrz;
        this.d = str;
    }

    public final void a() {
        acrz acrz = this.c;
        acrx acrx = acrz.n;
        synchronized (acrz.a) {
            this.c.c.remove(this);
            if (this.a) {
                this.a = false;
                Future future = this.b;
                if (future != null) {
                    future.cancel(false);
                    this.b = null;
                }
                this.c.b(this.d);
            }
        }
    }
}
