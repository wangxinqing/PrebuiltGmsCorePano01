package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: agkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class agkg {
    public abstract audx a(audx audx, audx audx2);

    public abstract audx a(String str, Object obj);

    public abstract String a(audx audx);

    /* access modifiers changed from: package-private */
    public final List a(List list, List list2) {
        audx audx;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            audx audx2 = (audx) list.get(i);
            String a = a(audx2);
            int size2 = list2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    audx = null;
                    break;
                }
                audx = (audx) list2.get(i2);
                i2++;
                if (a.equals(a(audx))) {
                    break;
                }
            }
            audx a2 = a(audx2, audx);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List a(Map map) {
        audx a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getValue() == null || (a = a((String) entry.getKey(), entry.getValue())) == null)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
