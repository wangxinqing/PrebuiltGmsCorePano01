package defpackage;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jab extends jah {
    private static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("domain", FastJsonResponse$Field.f("domain"));
        a.put("reason", FastJsonResponse$Field.f("reason"));
        a.put("message", FastJsonResponse$Field.f("message"));
        a.put("locationType", FastJsonResponse$Field.f("locationType"));
        a.put("location", FastJsonResponse$Field.f("location"));
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return a;
    }
}
