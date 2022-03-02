package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: alxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxc extends alxd {
    private final Map d = new HashMap();

    public alxc(alxg alxg, amic amic) {
        super(amic);
        for (Map.Entry entry : a("value").d().a().entrySet()) {
            this.d.put((String) entry.getKey(), alxg.a((amic) entry.getValue()));
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList(this.d.size());
        for (Map.Entry entry : this.d.entrySet()) {
            arrayList.add(aluv.a(this.a, (String) entry.getKey(), (amjf) entry.getValue()));
        }
        return arrayList;
    }
}
