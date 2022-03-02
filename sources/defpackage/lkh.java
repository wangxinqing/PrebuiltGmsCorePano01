package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: lkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkh extends lka {
    private final lkg b;
    private final alrr c;
    private final alsw d;
    private final alsy e;

    public lkh(lkk lkk, lkg lkg, alrr alrr, alsw alsw, alsy alsy) {
        super("LocalMutationOperation", lkk);
        this.b = lkg;
        this.c = alrr;
        this.d = alsw;
        this.e = alsy;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.d();
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        kpf b2 = b();
        if (!b2.e) {
            b2.e = true;
            b2.t();
        }
        lld.d.a(sQLiteDatabase, this.b.a(this.c.b));
        llg.d.a(sQLiteDatabase, this.b.a(this.c));
        if (this.a.b) {
            lkw.a(sQLiteDatabase, this.b, this.d, this.e);
        }
    }
}
