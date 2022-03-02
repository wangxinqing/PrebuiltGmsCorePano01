package defpackage;

import java.util.Arrays;

/* renamed from: adlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adlm {
    public final String a;
    public final Object b;
    public amri c = ampu.a;
    public adre d;

    protected adlm(String str, adre adre) {
        iva.c(str);
        this.a = str;
        this.d = adre;
        this.b = new Object();
    }

    public final adre a() {
        adre adre;
        synchronized (this.b) {
            adre = this.d;
        }
        return adre;
    }

    public abstract void b();

    public abstract adll c();

    public abstract boolean d();

    public final boolean equals(Object obj) {
        if (obj instanceof adlm) {
            return this.a.equals(((adlm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final Object a(adri adri) {
        Object a2;
        synchronized (this.b) {
            a2 = this.d.a(adri);
        }
        return a2;
    }
}
