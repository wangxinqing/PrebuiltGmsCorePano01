package defpackage;

import android.content.Context;
import java.io.Closeable;

/* renamed from: hvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hvj {
    public hvn a;
    public huv b;
    private hvs c;
    private final Context d;

    public hvj(Context context, hvn hvn, hvs hvs, huv huv) {
        this.d = context;
        this.a = hvn;
        this.c = hvs;
        this.b = huv;
    }

    public final amzy a() {
        hvs hvs;
        if (awtf.b() && (hvs = this.c) != null) {
            jjt.b((Closeable) hvs);
            this.c = null;
            jjt.b((Closeable) this.a);
            this.a = null;
            this.d.deleteDatabase("playlog.db");
        }
        return amzy.a((Object) this.b);
    }

    public final void b() {
        jjt.b((Closeable) this.c);
        this.c = null;
        jjt.b((Closeable) this.a);
        this.a = null;
        jjt.b((Closeable) this.b);
        this.b = null;
    }
}
