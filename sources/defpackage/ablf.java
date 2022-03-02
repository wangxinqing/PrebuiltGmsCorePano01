package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ablf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ablf implements abmj {
    private final ablh a;

    public ablf(ablh ablh) {
        this.a = ablh;
    }

    public final void a(List list) {
        ablh ablh = this.a;
        ablh.c = list == null ? new abgl(Collections.emptyList()) : new abgl(list);
        List list2 = ablh.b;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((ablg) list2.get(i)).a(ablh.c);
        }
    }
}
