package defpackage;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* renamed from: kqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqp {
    public final String a;
    public final boolean b;
    public final kqh c;
    public final boolean d;
    public final Set e;
    public final Object f;
    public final boolean g;
    public final kqn h;
    public final int i;

    public kqp(String str, int i2, boolean z, boolean z2, Set set, boolean z3, Object obj, kqh kqh, kqn kqn) {
        iva.a((Object) kqn);
        this.a = str;
        this.i = i2;
        this.e = set != null ? Collections.unmodifiableSet(set) : null;
        this.g = z3;
        this.b = z;
        this.f = obj;
        this.c = kqh;
        this.h = kqn;
        this.d = z2;
    }

    public final String toString() {
        return String.format(Locale.US, "FieldDefinition[%s, %s]", new Object[]{this.a, kqo.a(this.i)});
    }
}
