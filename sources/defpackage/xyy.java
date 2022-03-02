package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyy {
    public final List a = new ArrayList();
    private final Map b = new HashMap();

    private final List a(Integer num) {
        List list = (List) this.b.get(num);
        if (list != null) {
            return list;
        }
        Map map = this.b;
        ArrayList arrayList = new ArrayList();
        map.put(num, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List b() {
        return a(1);
    }

    /* access modifiers changed from: package-private */
    public final List c() {
        return a(2);
    }

    /* access modifiers changed from: package-private */
    public final List d() {
        return a(3);
    }

    /* access modifiers changed from: package-private */
    public final List a() {
        return a(0);
    }
}
