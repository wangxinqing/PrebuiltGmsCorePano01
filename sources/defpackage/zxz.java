package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: zxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zxz implements acvz {
    public final acwa a(Object obj) {
        List<Pair> list = (List) obj;
        if (list == null || list.size() < 2) {
            zyg.c.d("Missing values for footprint or android backup list, Number of list : %d", Integer.valueOf(list.size()));
            int size = list.size();
            StringBuilder sb = new StringBuilder(79);
            sb.append("Missing values for footprint or android backup list, Number of list ");
            sb.append(size);
            throw new IllegalStateException(sb.toString());
        }
        HashMap hashMap = new HashMap();
        List<zyi> list2 = null;
        List<zyi> list3 = null;
        for (Pair pair : list) {
            if ("gms_backup".equals(pair.first)) {
                list3 = (List) pair.second;
            } else if ("footprint_backup".equals(pair.first)) {
                list2 = (List) pair.second;
            }
        }
        for (zyi zyi : list2) {
            hashMap.put(zyi.b, zyi);
        }
        for (zyi zyi2 : list3) {
            hashMap.put(zyi2.b, zyi2);
        }
        return acws.a((Object) new ArrayList(hashMap.values()));
    }
}
