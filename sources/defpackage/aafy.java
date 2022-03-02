package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: aafy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aafy extends ppr {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ aagb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aafy(aagb aagb, aonk aonk, String str, String str2) {
        super(aonk);
        this.c = aagb;
        this.a = str;
        this.b = str2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        try {
            aagb aagb = this.c;
            String str = this.a;
            String str2 = this.b;
            if (oxe.a(str2)) {
                ovw a2 = ovw.a(aagb.a.b, str);
                if (a2 != null) {
                    oxe a3 = oxe.a(str2, str, oyb.a(aagb.a.b));
                    SQLiteDatabase writableDatabase = a2.getWritableDatabase();
                    if (dvk.c(writableDatabase, a3.a())) {
                        writableDatabase.delete(oyc.a(a3.a()), (String) null, (String[]) null);
                    }
                }
            }
            osf osf = this.c.a;
            String str3 = this.a;
            osf.e();
            osf.m.c(str3).d();
            return this.c.a.b(this.a, this.b);
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.toString());
            return valueOf.length() == 0 ? new String("SQLiteException in clearSequenceTable: ") : "SQLiteException in clearSequenceTable: ".concat(valueOf);
        }
    }
}
