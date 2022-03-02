package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: kqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqu {
    public final HashMap a = new LinkedHashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.a.entrySet()) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            String str = (String) entry.getValue();
            String str2 = (String) entry.getKey();
            sb.append(str);
            if (!str.equals(str2)) {
                sb.append(" AS '");
                sb.append(str2);
                sb.append("'");
            }
        }
        return sb.toString();
    }

    public final void a(String str, String str2) {
        boolean z;
        iva.a((Object) str);
        iva.a((Object) str2);
        if (this.a.containsKey(str2)) {
            z = ((String) this.a.get(str2)).equals(str);
        } else {
            z = true;
        }
        iva.a(z, (Object) String.format("Invalid duplicate alias %s", new Object[]{str2}));
        this.a.put(str2, str);
    }

    public final void a(lsb lsb, String str) {
        a(((kqe) lsb).f.a(), str);
    }

    public final void a(lsb lsb, kyq kyq) {
        a(((kne) lsb).aB.a(), kyq.a());
    }
}
