package defpackage;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: cco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cco implements acvf {
    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        if (acwa.b()) {
            ick ick = (ick) acwa.d();
            if (ick == null || jir.a((Collection) ick.e())) {
                return acws.a((Object) null);
            }
            byt byt = new byt(ick);
            String a = byt.a("Home");
            String a2 = byt.a("Work");
            HashMap hashMap = new HashMap();
            if (a != null) {
                hashMap.put("Home", a);
            }
            if (a2 != null) {
                hashMap.put("Work", a2);
            }
            return acws.a((Object) hashMap);
        }
        String valueOf = String.valueOf(acwa.e());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("getStandardAliases failed: ");
        sb.append(valueOf);
        sb.toString();
        return acws.a((Object) null);
    }
}
