package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: afzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afzf implements afzh {
    private final Map a = new HashMap();

    public final List a(String str) {
        if (this.a.containsKey(str)) {
            return new ArrayList((Collection) this.a.get(str));
        }
        return Collections.emptyList();
    }

    public final void a(String str, List list) {
        this.a.put(str, list);
    }
}
