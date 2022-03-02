package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: amsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amsi {
    private final amsk a;
    private final amsk b;

    public amsi(amsk amsk, amsk amsk2) {
        this.a = amsk;
        amrl.a((Object) amsk2);
        this.b = amsk2;
    }

    public final Map a(CharSequence charSequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : this.a.a(charSequence)) {
            Iterator b2 = this.b.b((CharSequence) str);
            amrl.a(b2.hasNext(), "Chunk [%s] is not a valid entry", (Object) str);
            String str2 = (String) b2.next();
            amrl.a(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", (Object) str2);
            amrl.a(b2.hasNext(), "Chunk [%s] is not a valid entry", (Object) str);
            linkedHashMap.put(str2, (String) b2.next());
            amrl.a(!b2.hasNext(), "Chunk [%s] is not a valid entry", (Object) str);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
