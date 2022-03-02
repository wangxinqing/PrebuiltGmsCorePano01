package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: kns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kns {
    public static final ith a = new ith("GenoaValuesField", "");
    final lsb b;
    protected Object c = null;
    private final lsb d;
    private Long e = null;

    public kns(lsb lsb, lsb lsb2) {
        this.b = lsb;
        this.d = lsb2;
    }

    static kns a(lsb lsb, lsb lsb2) {
        return new knm(lsb, lsb2);
    }

    static kns b(lsb lsb, lsb lsb2) {
        return new knn(lsb, lsb2);
    }

    static kns c(lsb lsb, lsb lsb2) {
        return new kno(lsb, lsb2);
    }

    static kns d(lsb lsb, lsb lsb2) {
        return new knp(lsb, lsb2);
    }

    static kns e(lsb lsb, lsb lsb2) {
        return new knq(lsb, lsb2);
    }

    static kns f(lsb lsb, lsb lsb2) {
        return new knr(lsb, lsb2);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(Cursor cursor);

    /* access modifiers changed from: protected */
    public abstract void a(ContentValues contentValues);

    public final boolean a() {
        return this.e != null;
    }

    public final void d() {
        this.c = null;
        this.e = null;
    }

    public final void a(long j) {
        iva.a(a());
        this.e = Long.valueOf(j);
    }

    public final Object b() {
        iva.a(a());
        return this.c;
    }

    public final long c() {
        iva.a(a());
        return this.e.longValue();
    }

    public final void a(Object obj) {
        iva.a(a());
        this.c = obj;
    }

    /* access modifiers changed from: package-private */
    public final void b(ContentValues contentValues) {
        contentValues.put(((kqh) this.d.b()).a(), this.e);
        a(contentValues);
    }

    public final void a(Object obj, long j) {
        this.c = obj;
        this.e = Long.valueOf(j);
    }

    /* access modifiers changed from: package-private */
    public final void b(Cursor cursor) {
        this.c = a(cursor);
        this.e = ((kqh) this.d.b()).b(cursor);
    }
}
