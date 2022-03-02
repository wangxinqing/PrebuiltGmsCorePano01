package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkv extends lka {
    private final lkg b;
    private final List c;
    private final alrt d;
    private final alsw e;
    private final alsy f;
    private final boolean g;

    public lkv(lkk lkk, lkg lkg, List list, alrt alrt, alsw alsw, alsy alsy, boolean z) {
        super("RemoteMutationOperation", lkk);
        this.b = lkg;
        this.c = list;
        this.d = alrt;
        this.e = alsw;
        this.f = alsy;
        this.g = z;
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        for (amiw a : this.c) {
            lld.d.a(sQLiteDatabase, this.b.a(a));
        }
        List<alrr> list = this.d.d;
        llg llg = llg.d;
        lkg lkg = this.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (alrr a2 : list) {
            arrayList.add(lkg.a(a2));
        }
        sQLiteDatabase.delete(llg.b(), "1", (String[]) null);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            llg.a(sQLiteDatabase, (String) arrayList.get(i));
        }
        b().e = !list.isEmpty();
        lla.d.a(sQLiteDatabase, this.d.b);
        sQLiteDatabase.delete(llr.d.b(), (String) null, (String[]) null);
        if (this.a.b) {
            lkw.a(sQLiteDatabase, this.b, this.e, this.f);
        }
        b().f = this.g;
        b().t();
    }
}
