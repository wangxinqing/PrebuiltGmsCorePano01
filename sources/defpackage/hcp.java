package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hcp {
    private static final iwd a = gzk.a("DroidGuardResultModule");

    static amri a(Context context, amri amri, amri amri2, amri amri3, amri amri4, anax anax, lxz lxz, gwr gwr) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(gwk.b(context));
        sb.append(':');
        if (amri2.a()) {
            sb.append((String) amri2.b());
            sb.append(':');
        }
        if (amri3.a()) {
            sb.append((String) amri3.b());
            sb.append(':');
        }
        if (amri.a()) {
            sb.append((String) amri.b());
            sb.append(':');
        }
        if (amri4.a()) {
            sb.append((String) amri4.b());
            sb.append(':');
        }
        anhj a2 = anax.iterator();
        while (a2.hasNext()) {
            has has = (has) a2.next();
            sb.append(has.b);
            sb.append(':');
            sb.append(has.c);
            sb.append(':');
        }
        byte[] bytes = sb.toString().getBytes(amqn.c);
        MessageDigest a3 = jhh.a("SHA-1");
        if (a3 == null) {
            a.e("no support for SHA-1", new Object[0]);
        } else {
            a3.update(bytes);
            hashMap.put("CONTENT_BINDER", Base64.encodeToString(a3.digest(), 2));
        }
        amri amri5 = gwr.l;
        return amri.c(lxz.a("checkin", (Map) hashMap, (DroidGuardResultsRequest) null));
    }
}
