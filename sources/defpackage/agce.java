package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: agce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agce {
    public final Map a = new HashMap();

    public final agcj a(agck agck) {
        agcj agcj = (agcj) this.a.get(agck);
        if (agcj != null) {
            return agcj;
        }
        String valueOf = String.valueOf(agck);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Unregistered model: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
