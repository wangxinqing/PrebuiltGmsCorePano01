package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: kqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqm {
    public final String a;
    public kqh b = null;
    public boolean c = false;
    public boolean d = false;
    public Set e = null;
    public boolean f = false;
    public Object g = null;
    public kqn h = kqn.CASCADE;
    public final int i;

    public kqm(String str, int i2) {
        this.a = str;
        this.i = i2;
    }

    public final void a() {
        this.d = true;
    }

    public final void b() {
        this.f = true;
    }

    public final void c() {
        this.c = true;
    }

    public final void a(Object obj) {
        boolean z;
        if (this.g == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "defaultValue already set");
        iva.a(obj, (Object) "null defaultValue");
        int i2 = this.i - 1;
        if (i2 == 0) {
            iva.b(obj instanceof Number, "defaultValue for an INTEGER field has to be of type Number");
        } else if (i2 != 1) {
            iva.b(obj instanceof byte[], "defaultValue for a BLOB field has to be a byte array");
        } else {
            iva.b(obj instanceof String, "defaultValue for a TEXT field has to be of type String");
        }
        this.g = obj;
    }

    public final void a(kqh kqh, kqn kqn) {
        iva.a((Object) kqh);
        this.b = kqh;
        iva.a((Object) kqn);
        this.h = kqn;
    }

    public final void a(kqh... kqhArr) {
        iva.a(this.e == null);
        this.e = new ob((Collection) Arrays.asList(kqhArr));
    }
}
