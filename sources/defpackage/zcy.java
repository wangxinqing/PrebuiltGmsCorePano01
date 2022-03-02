package defpackage;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcy extends jah {
    private static final HashMap c;
    public zcx a;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("result", FastJsonResponse$Field.a("result", zcx.class));
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return c;
    }

    public final void a(String str, jag jag) {
        this.a = (zcx) jag;
    }
}
