package defpackage;

/* renamed from: auqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auqt {
    public final bapu a;

    public auqt(bapu bapu, bapu bapu2) {
        a(bapu, 1);
        this.a = bapu;
        a(bapu2, 2);
    }

    public static void a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
