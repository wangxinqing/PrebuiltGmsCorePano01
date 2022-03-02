package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnl implements aoqb {
    private final afnt a;

    public afnl(afnt afnt) {
        this.a = afnt;
    }

    public final aorr a(Object obj) {
        afnt afnt = this.a;
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (List) obj) {
            aflf aflf = (aflf) pair.first;
            afkr afkr = (afkr) pair.second;
            Long valueOf = Long.valueOf(afsq.a(afkr));
            Object[] objArr = {"ExpirationHandler", afkr.c, valueOf};
            if (afsq.a(valueOf.longValue(), afnt.f)) {
                afnt.e.a(1051, afkr.c, afkr.e);
                Object[] objArr2 = {"ExpirationHandler", afkr.c, valueOf};
                arrayList.add(aflf);
            }
        }
        afpi afpi = afnt.b;
        SharedPreferences.Editor edit = afst.a(afpi.a, "gms_icing_mdd_groups", afpi.b).edit();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aflf aflf2 = (aflf) arrayList.get(i);
            Object[] objArr3 = {"FileGroupsMetadata", aflf2.b, aflf2.c};
            edit.remove(afst.a(aflf2));
        }
        return aopr.a(aorl.a((Object) Boolean.valueOf(edit.commit())), (amqy) new afnr(afnt), afnt.i);
    }
}
