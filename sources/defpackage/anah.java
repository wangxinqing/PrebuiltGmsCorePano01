package defpackage;

import java.util.Map;

/* renamed from: anah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class anah extends anax {
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h().get(entry.getKey());
            return obj2 != null && obj2.equals(entry.getValue());
        }
    }

    public final boolean f() {
        return h().bo();
    }

    public final boolean g() {
        return false;
    }

    public abstract anaf h();

    public final int hashCode() {
        return h().hashCode();
    }

    public final int size() {
        return h().size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new anag(h());
    }
}
