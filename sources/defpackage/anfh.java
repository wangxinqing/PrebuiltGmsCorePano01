package defpackage;

import java.io.Serializable;

/* renamed from: anfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anfh extends anfk implements Serializable {
    public static final anfh a = new anfh();
    private static final long serialVersionUID = 0;

    private anfh() {
    }

    private Object readResolve() {
        return a;
    }

    public final anfk a() {
        return anfx.a;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        amrl.a((Object) comparable);
        amrl.a((Object) comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
