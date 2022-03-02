package defpackage;

import java.io.Serializable;

/* renamed from: amsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amsx implements Serializable, amsv {
    private static final long serialVersionUID = 0;
    final amsv a;
    volatile transient boolean b;
    transient Object c;

    public amsx(amsv amsv) {
        amrl.a((Object) amsv);
        this.a = amsv;
    }

    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object a2 = this.a.a();
                    this.c = a2;
                    this.b = true;
                    return a2;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
