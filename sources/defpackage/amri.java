package defpackage;

import java.io.Serializable;

/* renamed from: amri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amri implements Serializable {
    private static final long serialVersionUID = 0;

    public static amri b(Object obj) {
        amrl.a(obj);
        return new amrt(obj);
    }

    public static amri c(Object obj) {
        return obj != null ? new amrt(obj) : ampu.a;
    }

    public abstract amri a(amri amri);

    public abstract Object a(Object obj);

    public abstract boolean a();

    public abstract Object b();

    public abstract Object c();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();
}
