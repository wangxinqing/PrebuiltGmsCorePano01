package defpackage;

import java.util.concurrent.Executor;

/* renamed from: agkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agkt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public agkt(bapu bapu, bapu bapu2, bapu bapu3) {
        a((Object) bapu, 1);
        this.a = bapu;
        a((Object) bapu2, 2);
        this.b = bapu2;
        a((Object) bapu3, 3);
        this.c = bapu3;
    }

    private static void a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    public final agks a(Executor executor, agnf agnf) {
        bapu bapu = this.a;
        bapu bapu2 = this.b;
        agic agic = (agic) this.c.a();
        a((Object) agic, 3);
        a((Object) executor, 4);
        a((Object) agnf, 5);
        return new agks(bapu, bapu2, agic, executor, agnf);
    }
}
