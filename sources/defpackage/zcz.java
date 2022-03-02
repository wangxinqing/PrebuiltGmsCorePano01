package defpackage;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcz extends jah {
    private static final HashMap c;
    public ArrayList a;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("items", FastJsonResponse$Field.b("items", zcy.class));
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return c;
    }

    public final void a(String str, ArrayList arrayList) {
        this.a = arrayList;
    }
}
