package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: krc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class krc implements kqx {
    public final kqu a = new kqu();
    public final List b = new ArrayList();
    private String c = null;
    private final Collection d = new ArrayList();
    private boolean e = false;
    private String f = null;

    private krc(String str) {
        amrl.a((Object) str);
        this.c = str;
    }

    public static krc a(String str) {
        return new krc(str);
    }

    public final void b() {
        this.e = true;
    }

    public final String toString() {
        return a();
    }

    public static krc a(kql kql) {
        return new krc(kql.b());
    }

    public final void b(String str) {
        amrl.b(this.f == null);
        this.f = str;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.util.List, java.util.Collection] */
    public final String a() {
        StringBuilder sb = new StringBuilder("SELECT ");
        if (this.e) {
            sb.append('*');
            if (!this.a.a.isEmpty()) {
                sb.append(", ");
                kqu kqu = this.a;
                kqu kqu2 = new kqu();
                for (Map.Entry entry : kqu.a.entrySet()) {
                    String str = (String) entry.getValue();
                    String str2 = (String) entry.getKey();
                    if (!str.equals(str2)) {
                        kqu2.a(str, str2);
                    }
                }
                sb.append(kqu2.toString());
            }
        } else {
            sb.append(this.a.toString());
        }
        sb.append(" FROM ");
        sb.append(this.c);
        if (this.f != null) {
            sb.append(" WHERE ");
            sb.append(this.f);
        }
        if (!this.b.isEmpty()) {
            sb.append(" ORDER BY ");
            sb.append(TextUtils.join(", ", this.b));
        }
        if (!this.d.isEmpty()) {
            ? r1 = this.d;
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(((krb) r1.get(i)).a());
            }
        }
        return sb.toString();
    }

    public final kqw a(kqv kqv, kqx kqx) {
        return new kqw(kqv, this, kqx);
    }

    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }

    public final void a(kqu kqu, String str, String str2) {
        kqu kqu2 = this.a;
        for (Map.Entry entry : kqu.a.entrySet()) {
            kqu2.a(str + "." + ((String) entry.getValue()), str2 + "." + ((String) entry.getKey()));
        }
    }

    public final void a(krb krb) {
        Collection collection = this.d;
        amrl.a((Object) krb);
        collection.add(krb);
    }

    public final void a(lsb lsb) {
        String a2 = ((kqh) lsb.b()).a();
        a(a2, a2);
    }
}
