package defpackage;

import android.os.Looper;

/* renamed from: ige  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ige {
    public volatile Object a;
    public volatile igc b;
    private final igb c;

    public ige(Looper looper, Object obj, String str) {
        this.c = new igb(this, looper);
        iva.a(obj, (Object) "Listener must not be null");
        this.a = obj;
        iva.c(str);
        this.b = new igc(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void a(igd igd) {
        iva.a((Object) igd, (Object) "Notifier must not be null");
        this.c.sendMessage(this.c.obtainMessage(1, igd));
    }
}
