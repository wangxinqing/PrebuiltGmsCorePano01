package defpackage;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jac extends jah {
    private static final HashMap a;
    private final HashMap c = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("errors", FastJsonResponse$Field.b("errors", jab.class));
        a.put("code", FastJsonResponse$Field.a("code"));
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return a;
    }

    public ArrayList getErrors() {
        return (ArrayList) this.c.get("errors");
    }

    public final void a(String str, ArrayList arrayList) {
        this.c.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.c.containsKey(str);
    }
}
