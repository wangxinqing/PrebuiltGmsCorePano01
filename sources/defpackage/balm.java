package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: balm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class balm {
    public static final balm a = new balm(new babm[0]);
    public final babm[] b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public balm(babm[] babmArr) {
        this.b = babmArr;
    }

    public static balm a(azxh azxh, azxa azxa) {
        List list = azxh.f;
        if (list.isEmpty()) {
            return a;
        }
        azxs azxs = new azxs();
        amrl.a((Object) azxa, (Object) "transportAttrs cannot be null");
        azxs.a = azxa;
        amrl.a((Object) azxh, (Object) "callOptions cannot be null");
        azxs.b = azxh;
        new azxt(azxs.a, azxs.b);
        int size = list.size();
        babm[] babmArr = new babm[size];
        for (int i = 0; i < size; i++) {
            babmArr[i] = ((azxr) list.get(i)).a();
        }
        return new balm(babmArr);
    }

    public final void b() {
        for (babm babm : this.b) {
        }
    }

    public final void a() {
        for (babm babm : this.b) {
        }
    }

    public final void a(long j) {
        for (babm b2 : this.b) {
            b2.b(j);
        }
    }
}
