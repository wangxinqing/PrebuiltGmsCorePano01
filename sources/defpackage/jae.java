package defpackage;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jae extends jah {
    private static final HashMap c;
    public final HashMap a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("error", FastJsonResponse$Field.a("error", jac.class));
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return c;
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.a.containsKey(str);
    }

    public final void a(String str, jag jag) {
        this.a.put(str, jag);
    }
}
