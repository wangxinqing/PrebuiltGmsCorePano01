package defpackage;

import android.content.Context;

/* renamed from: ump  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ump {
    public final uvf a;
    public final uvx b;
    private final uts c = new uts();
    private final uvp d = new uvp();

    public ump(Context context, uru uru) {
        this.a = new uvf(context, this.c, this.d, uru);
        this.b = new uvx(this.a, this.c, this.d, uru);
    }

    public final synchronized void a() {
        this.b.a();
        this.a.a();
        this.d.a();
    }

    public final boolean b() {
        return this.a.b();
    }
}
