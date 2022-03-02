package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jah extends jag {
    public final HashMap b = new HashMap();

    public final void a(String str, double d) {
        this.b.put(str, Double.valueOf(d));
    }

    public final void b(String str, ArrayList arrayList) {
        this.b.put(str, arrayList);
    }

    public final Object c(String str) {
        return this.b.get(str);
    }

    public final void d(String str, ArrayList arrayList) {
        this.b.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final void e(String str, ArrayList arrayList) {
        this.b.put(str, arrayList);
    }

    public final void f(String str, ArrayList arrayList) {
        this.b.put(str, arrayList);
    }

    public final void g(String str, ArrayList arrayList) {
        this.b.put(str, arrayList);
    }

    public final void h(String str, ArrayList arrayList) {
        this.b.put(str, arrayList);
    }

    public final void i(String str, ArrayList arrayList) {
        this.b.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, float f) {
        this.b.put(str, Float.valueOf(f));
    }

    public final void c(String str, ArrayList arrayList) {
        this.b.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean d(String str) {
        return this.b.containsKey(str);
    }

    public final void a(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
    }

    public final void a(String str, long j) {
        this.b.put(str, Long.valueOf(j));
    }

    public final void a(String str, String str2) {
        this.b.put(str, str2);
    }

    public final void a(String str, BigDecimal bigDecimal) {
        this.b.put(str, bigDecimal);
    }

    public final void a(String str, BigInteger bigInteger) {
        this.b.put(str, bigInteger);
    }

    public final void a(String str, Map map) {
        this.b.put(str, map);
    }

    public final void a(String str, boolean z) {
        this.b.put(str, Boolean.valueOf(z));
    }

    public final void a(String str, byte[] bArr) {
        this.b.put(str, bArr);
    }
}
