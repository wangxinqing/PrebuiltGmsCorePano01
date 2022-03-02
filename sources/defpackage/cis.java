package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cis {
    private final Context a;
    private final HashMap b = new HashMap();

    public cis(Context context) {
        this.a = context;
    }

    public static String b(int i, String str) {
        if (i != 1) {
            String valueOf = String.valueOf(str);
            return valueOf.length() == 0 ? new String("f:") : "f:".concat(valueOf);
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String("c:") : "c:".concat(valueOf2);
    }

    public static String c(int i, String str) {
        String replaceAll = str.replaceAll("[^a-zA-Z0-9.-]", "_");
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(replaceAll).length() + 19);
            sb.append("context_feature_");
            sb.append(replaceAll);
            sb.append(".db");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(replaceAll).length() + 11);
        sb2.append("context_");
        sb2.append(replaceAll);
        sb2.append(".db");
        return sb2.toString();
    }

    public final jjj a(int i, String str) {
        jjj jjj;
        String b2 = b(i, str);
        ciu ciu = (ciu) this.b.get(b2);
        if (ciu == null) {
            Context context = this.a;
            String c = c(i, str);
            if (i != 1) {
                jjj = new cit(context, c);
            } else {
                jjj = new cir(context, c);
            }
            ciu = new ciu(jjj);
            this.b.put(b2, ciu);
        }
        return ciu.a();
    }

    public final jjj a(bsz bsz) {
        jjj a2 = a(1, bsz.b);
        a();
        return a2;
    }

    public final void a() {
        ArrayList arrayList = null;
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            if (cbi.i().a() - ((ciu) entry.getValue()).a > 300000) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(str);
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) arrayList.get(i);
                new Object[1][0] = str2;
                a(str2);
            }
        }
    }

    public final void a(String str) {
        ciu ciu = (ciu) this.b.remove(str);
        if (ciu != null) {
            ciu.a().close();
        }
    }
}
