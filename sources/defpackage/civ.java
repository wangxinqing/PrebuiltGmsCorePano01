package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: civ  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class civ extends cbe {
    public final cis a;
    public final String b = "default";
    private final Context c;

    public static String a(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        for (String append : strArr) {
            sb.append(append);
            sb.append('_');
        }
        sb.append("index");
        return sb.toString();
    }

    public final void b(bsz bsz) {
        this.a.a(cis.b(1, bsz.b));
        File databasePath = this.c.getDatabasePath(cis.c(1, bsz.b));
        if (databasePath.exists()) {
            databasePath.delete();
        }
        cbi.y().c(bsz);
    }

    public civ(Context context) {
        this.c = context;
        this.a = new cis(context);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        cji.b();
        cjg cjg = new cjg(str);
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            String str3 = strArr2[i];
            if (cjg.b) {
                cjg.a.append(",");
            } else {
                cjg.b = true;
            }
            StringBuilder sb = cjg.a;
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
        }
        cjg.a.append(");");
        sQLiteDatabase.execSQL(cjg.a.toString());
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String[][] strArr) {
        for (String[] strArr2 : strArr) {
            String a2 = a(str, strArr2);
            cji.b();
            cjf cjf = new cjf(str, a2);
            for (String str2 : strArr2) {
                if (cjf.b) {
                    cjf.a.append(',');
                }
                cjf.b = true;
                cjf.a.append(str2);
            }
            cjf.a.append(')');
            sQLiteDatabase.execSQL(cjf.a.toString());
        }
    }

    public final SQLiteDatabase a() {
        return this.a.a(2, this.b).getWritableDatabase();
    }

    public final SQLiteDatabase a(bsz bsz) {
        cbi.y().a(bsz);
        return this.a.a(bsz).getWritableDatabase();
    }
}
