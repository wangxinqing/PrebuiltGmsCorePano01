package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bkt {
    public final bpw a;
    public final bpw b;
    public final List c;
    public final List d;
    public final List e;
    public final Map f;

    public bkt(bpw bpw, bpw bpw2, Collection collection, Collection collection2, Collection collection3, Map map) {
        this.a = bpw;
        this.b = bpw2;
        this.c = a(collection);
        this.d = a(collection2);
        this.e = a(collection3);
        this.f = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
    }

    private static List a(Collection collection) {
        if (collection != null) {
            return new ArrayList(collection);
        }
        return Collections.emptyList();
    }

    public final String toString() {
        return "ModuleSet Info " + bmy.a((List) this.a) + " Container APKs " + this.c.toString() + " Required APKs " + this.d.toString() + " Optional APKs " + this.e.toString();
    }
}
