package defpackage;

import android.content.ContentValues;

/* renamed from: kqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kqq extends kqi {
    public long m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected kqq(kqg kqg, kql kql, long j) {
        super(kqg, kql, j != -1);
        this.m = -1;
        iva.b(kql.a.g());
        this.m = j;
    }

    public final kqy a() {
        return this.an.a.e(this.m);
    }

    /* access modifiers changed from: protected */
    public abstract void a(ContentValues contentValues);

    /* access modifiers changed from: protected */
    public final void b(ContentValues contentValues) {
        if (this.m != -1) {
            contentValues.put(this.an.a.a(), Long.valueOf(this.m));
        }
        a(contentValues);
    }

    public final void c(long j) {
        super.c(j);
        this.m = j;
    }

    public final void s() {
        super.s();
        this.m = -1;
    }
}
