package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ieo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ieo extends ies {
    final /* synthetic */ iet a;
    private final ArrayList c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ieo(iet iet, ArrayList arrayList) {
        super(iet);
        this.a = iet;
        this.c = arrayList;
    }

    public final void a() {
        Set set;
        iet iet = this.a;
        iey iey = iet.a.l;
        ise ise = iet.k;
        if (ise != null) {
            set = new HashSet(ise.b);
            Map map = iet.k.d;
            for (ibq ibq : map.keySet()) {
                if (!iet.a.g.containsKey(ibq.a())) {
                    Set set2 = ((isd) map.get(ibq)).a;
                    set.addAll((Collection) null);
                }
            }
        } else {
            set = Collections.emptySet();
        }
        iey.i = set;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            iet iet2 = this.a;
            ((ibo) arrayList.get(i)).a(iet2.h, iet2.a.l.i);
        }
    }
}
