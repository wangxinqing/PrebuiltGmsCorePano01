package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahba {
    public final String a;
    public final List b = new ArrayList();

    public ahba(String str, List list) {
        ahbx.a(!list.isEmpty(), "Missing param values", new Object[0]);
        this.a = str;
        this.b.addAll(list);
    }

    public static ahaz a(String str) {
        return new ahaz(str, (List) null);
    }

    public final String toString() {
        return ahbe.b(this.a) + "=" + TextUtils.join("+", this.b);
    }

    public final ahaz a() {
        ahaz a2 = a(this.a);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a2.a(((ahbc) list.get(i)).a());
        }
        return a2;
    }
}
