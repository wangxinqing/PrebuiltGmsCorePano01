package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: lll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lll extends kjs {
    public lll(Context context, String str, String str2) {
        super(context, str, str2, llk.values(), 6, 4);
        setWriteAheadLoggingEnabled(true);
    }

    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        super.b(sQLiteDatabase);
        if (sQLiteDatabase.enableWriteAheadLogging()) {
            sQLiteDatabase.execSQL("PRAGMA synchronous = normal;");
        }
        if (!((Boolean) jzq.as.c()).booleanValue()) {
            llr llr = new llr(sQLiteDatabase.getVersion());
            llo llo = new llo(sQLiteDatabase.getVersion());
            sQLiteDatabase.delete(llr.b(), (String) null, (String[]) null);
            sQLiteDatabase.delete(llo.b(), (String) null, (String[]) null);
        }
    }

    public final void c(SQLiteDatabase sQLiteDatabase) {
        String a = lkz.KEY.c.a();
        String b = lla.d.b();
        String a2 = lkz.KEY.c.a();
        String a3 = lkz.KEY.c.a();
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(b).length();
        StringBuilder sb = new StringBuilder(length + 136 + length2 + String.valueOf(a2).length() + String.valueOf(a3).length());
        sb.append("CREATE TRIGGER DocumentStoreNameTrigger BEFORE UPDATE OF ");
        sb.append(a);
        sb.append(" ON ");
        sb.append(b);
        sb.append(" WHEN OLD.");
        sb.append(a2);
        sb.append(" != NEW.");
        sb.append(a3);
        sb.append(" BEGIN SELECT RAISE(ROLLBACK, \"Cannot change key.\"); END;");
        sQLiteDatabase.execSQL(sb.toString());
        String a4 = lkz.VALUE.c.a();
        String b2 = lla.d.b();
        String a5 = lkz.KEY.c.a();
        String a6 = lkz.VALUE.c.a();
        String a7 = lkz.VALUE.c.a();
        int length3 = String.valueOf(a4).length();
        int length4 = String.valueOf(b2).length();
        int length5 = String.valueOf(a5).length();
        StringBuilder sb2 = new StringBuilder(length3 + 171 + length4 + length5 + String.valueOf(a6).length() + String.valueOf(a7).length());
        sb2.append("CREATE TRIGGER RevisionIncrementTrigger BEFORE UPDATE OF ");
        sb2.append(a4);
        sb2.append(" ON ");
        sb2.append(b2);
        sb2.append(" WHEN OLD.");
        sb2.append(a5);
        sb2.append(" = \"revision\" AND OLD.");
        sb2.append(a6);
        sb2.append(" >= NEW.");
        sb2.append(a7);
        sb2.append(" BEGIN SELECT RAISE(ROLLBACK, \"Revision can only be increased.\"); END;");
        sQLiteDatabase.execSQL(sb2.toString());
    }
}
