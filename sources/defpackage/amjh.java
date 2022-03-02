package defpackage;

import java.util.Arrays;

/* renamed from: amjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjh {
    public amjj a = amjj.a;
    public amiw b = amiw.a;

    static {
        new amjh();
    }

    private amjh() {
    }

    public static amjg a() {
        return new amjg();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amjh) {
            amjh amjh = (amjh) obj;
            return alyr.a(this.a, amjh.a) && alyr.a(this.b, amjh.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public amjh(amjg amjg) {
        this.a = amjg.a;
        this.b = amjg.b;
    }
}
