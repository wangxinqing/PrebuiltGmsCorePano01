package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: iur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iur {
    private final List a = new ArrayList();
    private final Object b;

    public iur(Object obj) {
        iva.a(obj);
        this.b = obj;
    }

    public final void a(Object obj) {
        this.a.add(String.valueOf(obj));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.b.getClass().getSimpleName());
        sb.append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.a.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void a(String str, Object obj) {
        List list = this.a;
        iva.a((Object) str);
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }
}
