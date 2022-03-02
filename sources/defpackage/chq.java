package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: chq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chq implements Runnable {
    public final buv a = new buv();
    public final String b;
    private final ContextManagerClientInfo c;

    public chq(ContextManagerClientInfo contextManagerClientInfo, String str) {
        this.c = contextManagerClientInfo;
        this.b = str;
    }

    public final void run() {
        try {
            chs.a(this.c, this.b);
        } catch (SecurityException e) {
            new Object[1][0] = this.b;
            cce j = cbi.j();
            j.a.edit().remove(this.b).apply();
        }
        buv buv = this.a;
        if (buv.a()) {
            buv.a.quit();
            buv.a = null;
            buv.b = null;
        }
    }
}
