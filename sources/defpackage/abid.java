package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: abid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abid {
    private final List a;
    private final abie b;

    public abid(abie abie, abik... abikArr) {
        this.a = Arrays.asList(abikArr);
        this.b = abie;
        for (int i = 0; i < 3; i++) {
            abikArr[i].a.add(this);
        }
        a();
    }

    public final void a() {
        for (abik abik : this.a) {
            if (abik.b != 2) {
                return;
            }
        }
        abie abie = this.b;
        abij abij = abie.a;
        abfm abfm = abie.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(abij.e.c);
        arrayList.addAll(abij.f.c);
        arrayList.addAll(abij.g.c);
        abfn abfn = abfm.a;
        if (!abfn.b) {
            abfn.a = arrayList;
            abfn.b = true;
            abfn.a();
        }
    }
}
