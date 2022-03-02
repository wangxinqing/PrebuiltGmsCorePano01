package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: dlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dlg extends dkp {
    public final Map a = new HashMap(4);

    public final /* bridge */ /* synthetic */ void a(dkp dkp) {
        ((dlg) dkp).a.putAll(this.a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return dkp.a((Object) hashMap);
    }
}
