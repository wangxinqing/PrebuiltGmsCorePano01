package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbc {
    public final String a;
    private final List b;

    public ahbc(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public final ahbb a() {
        ahbb ahbb = new ahbb(this.a, (List) null);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ahbb.a((ahbd) list.get(i));
        }
        return ahbb;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ahbe.b(this.a));
        if (this.b.isEmpty()) {
            return sb.toString();
        }
        sb.append("(");
        sb.append(TextUtils.join(",", this.b));
        sb.append(")");
        return sb.toString();
    }

    public final String a(String str) {
        ahbd ahbd;
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ahbd = null;
                break;
            }
            ahbd = (ahbd) list.get(i);
            i++;
            if (ahbd.a.equals(str)) {
                break;
            }
        }
        if (ahbd != null) {
            return ahbd.b;
        }
        return null;
    }
}
