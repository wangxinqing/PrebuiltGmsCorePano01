package defpackage;

/* renamed from: pht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pht {
    public final bapu a;
    public final bapu b;

    public pht(bapu bapu, bapu bapu2) {
        a(bapu, 1);
        this.a = bapu;
        a(bapu2, 2);
        this.b = bapu2;
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
