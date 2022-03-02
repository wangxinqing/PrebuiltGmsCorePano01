package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: akri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akri {
    public final String a;
    public final double b;
    public final double c;
    public float d;
    public final List e;

    public akri(String str, double d2, double d3, float f) {
        this(str, d2, d3, f, new HashSet());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akri) {
            akri akri = (akri) obj;
            return amqx.a(this.a, akri.a) && this.b == akri.b && this.c == akri.c && this.d == akri.d && amqx.a(this.e, akri.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(this.b), Double.valueOf(this.c), Float.valueOf(this.d), this.e});
    }

    public akri(String str, double d2, double d3, float f, Collection collection) {
        this.a = str;
        this.b = d2;
        this.c = d3;
        this.d = f;
        this.e = new ArrayList(collection);
    }
}
