package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Set;

/* renamed from: oxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxp extends oxi {
    private final String[] a;

    public oxp(String[] strArr) {
        this.a = strArr;
    }

    /* access modifiers changed from: protected */
    public final Set a(SQLiteDatabase sQLiteDatabase, ovw ovw, ozc ozc, oyb oyb) {
        return ovw.a(sQLiteDatabase, (Set) anax.a((Object[]) this.a), ozc, oyb);
    }

    public final /* bridge */ /* synthetic */ void a(ozc ozc, osf osf) {
    }

    public final void a(ozc ozc, osf osf, oyb oyb) {
    }

    public final void a(osf osf, ozc ozc, owf owf) {
        for (String str : this.a) {
            aucd o = ora.c.o();
            aucd o2 = ord.c.o();
            String str2 = ozc.f;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ord ord = (ord) o2.b;
            str2.getClass();
            ord.a = str2;
            str.getClass();
            ord.b = str;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ora ora = (ora) o.b;
            ord ord2 = (ord) o2.i();
            ord2.getClass();
            ora.b = ord2;
            ora.a = 5;
            owf.a((ora) o.i());
        }
    }
}
