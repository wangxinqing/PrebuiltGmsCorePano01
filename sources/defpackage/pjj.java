package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: pjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pjj {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public pjj(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5) {
        a((Object) bapu, 1);
        this.a = bapu;
        a((Object) bapu2, 2);
        this.b = bapu2;
        a((Object) bapu3, 3);
        a((Object) bapu4, 4);
        this.c = bapu4;
        a((Object) bapu5, 5);
    }

    private static void a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    public final pji a(aelh aelh, String str) {
        Context context = (Context) this.a.a();
        a((Object) context, 1);
        qwq qwq = (qwq) this.b.a();
        a((Object) qwq, 2);
        String b2 = pkm.b();
        a((Object) b2, 3);
        Random random = (Random) this.c.a();
        a((Object) random, 4);
        pcz b3 = pdb.b();
        a((Object) b3, 5);
        a((Object) aelh, 6);
        a((Object) str, 7);
        return new pji(context, qwq, b2, random, b3, aelh, str);
    }
}
