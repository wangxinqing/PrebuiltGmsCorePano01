package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dfr implements o {
    private final dfx a;

    public dfr(dfx dfx) {
        this.a = dfx;
    }

    public final Object a(Object obj) {
        List<aqsr> list;
        dfx dfx = this.a;
        aqso aqso = ((csl) obj).a;
        if (aqso.b == 6) {
            list = ((aqqk) aqso.c).a;
        } else {
            list = amzy.h();
        }
        ArrayList arrayList = new ArrayList();
        for (aqsr c : list) {
            arrayList.add(dfx.b.c(c));
        }
        return new csj(arrayList);
    }
}
