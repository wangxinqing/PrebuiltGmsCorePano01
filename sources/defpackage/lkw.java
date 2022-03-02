package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Set;

/* renamed from: lkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lkw {
    static void a(SQLiteDatabase sQLiteDatabase, lkg lkg, alsw alsw, alsy alsy) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        lkg lkg2 = lkg;
        alsw alsw2 = alsw;
        Set set = alsw2.c;
        if (set.contains(alsv.ADD_TO_UNDO)) {
            llr.d.a(sQLiteDatabase2, lkg2.a(alsw2.d));
        }
        if (set.contains(alsv.ADD_TO_REDO)) {
            llo.d.a(sQLiteDatabase2, lkg2.a(alsw2.d));
        }
        if (set.contains(alsv.ADD_TO_PENDING_BATCH)) {
            llj.d.a(sQLiteDatabase2, lkg2.a(alsw2.d));
        }
        if (set.contains(alsv.TRUNCATE_UNDO)) {
            llr llr = llr.d;
            String a = llr.a.a();
            String b = llr.b();
            String b2 = llr.b();
            int length = String.valueOf(a).length();
            int length2 = String.valueOf(a).length();
            StringBuilder sb = new StringBuilder(length + 41 + length2 + String.valueOf(b2).length() + String.valueOf(a).length());
            sb.append(a);
            sb.append(" IN (SELECT ");
            sb.append(a);
            sb.append(" FROM ");
            sb.append(b2);
            sb.append(" ORDER BY ");
            sb.append(a);
            sb.append(" ASC LIMIT 1)");
            sQLiteDatabase2.delete(b, sb.toString(), (String[]) null);
        }
        if (set.contains(alsv.TRUNCATE_REDO)) {
            llo llo = llo.d;
            String a2 = llo.a.a();
            String b3 = llo.b();
            String b4 = llo.b();
            int length3 = String.valueOf(a2).length();
            int length4 = String.valueOf(a2).length();
            StringBuilder sb2 = new StringBuilder(length3 + 41 + length4 + String.valueOf(b4).length() + String.valueOf(a2).length());
            sb2.append(a2);
            sb2.append(" IN (SELECT ");
            sb2.append(a2);
            sb2.append(" FROM ");
            sb2.append(b4);
            sb2.append(" ORDER BY ");
            sb2.append(a2);
            sb2.append(" ASC LIMIT 1)");
            sQLiteDatabase2.delete(b3, sb2.toString(), (String[]) null);
        }
        if (set.contains(alsv.POP_UNDO)) {
            llr llr2 = llr.d;
            String a3 = llr2.a.a();
            String b5 = llr2.b();
            String b6 = llr2.b();
            int length5 = String.valueOf(a3).length();
            int length6 = String.valueOf(a3).length();
            StringBuilder sb3 = new StringBuilder(length5 + 52 + length6 + String.valueOf(b6).length() + String.valueOf(a3).length());
            sb3.append(a3);
            sb3.append(" IN (SELECT ");
            sb3.append(a3);
            sb3.append(" FROM ");
            sb3.append(b6);
            sb3.append(" ORDER BY ");
            sb3.append(a3);
            sb3.append(" DESC LIMIT 1)");
            sQLiteDatabase2.delete(b5, sb3.toString(), (String[]) null);
        }
        if (set.contains(alsv.POP_REDO)) {
            llo llo2 = llo.d;
            String a4 = llo2.a.a();
            String b7 = llo2.b();
            String b8 = llo2.b();
            int length7 = String.valueOf(a4).length();
            int length8 = String.valueOf(a4).length();
            StringBuilder sb4 = new StringBuilder(length7 + 52 + length8 + String.valueOf(b8).length() + String.valueOf(a4).length());
            sb4.append(a4);
            sb4.append(" IN (SELECT ");
            sb4.append(a4);
            sb4.append(" FROM ");
            sb4.append(b8);
            sb4.append(" ORDER BY ");
            sb4.append(a4);
            sb4.append(" DESC LIMIT 1)");
            sQLiteDatabase2.delete(b7, sb4.toString(), (String[]) null);
        }
        if (set.contains(alsv.REFRESH_UNDO) || set.contains(alsv.REFRESH_REDO) || set.contains(alsv.REFRESH_PENDING_BATCH)) {
            alus alus = (alus) alsy;
            alsx alsx = new alsx(alus.b, alus.c, alus.d);
            if (set.contains(alsv.REFRESH_UNDO)) {
                sQLiteDatabase2.delete(llr.d.b(), (String) null, (String[]) null);
                for (amiw a5 : alsx.b) {
                    llr.d.a(sQLiteDatabase2, lkg2.a(a5));
                }
            }
            if (set.contains(alsv.REFRESH_REDO)) {
                sQLiteDatabase2.delete(llo.d.b(), (String) null, (String[]) null);
                for (amiw a6 : alsx.c) {
                    llo.d.a(sQLiteDatabase2, lkg2.a(a6));
                }
            }
            if (set.contains(alsv.REFRESH_PENDING_BATCH)) {
                sQLiteDatabase2.delete(llj.d.b(), (String) null, (String[]) null);
                for (amiw a7 : alsx.d) {
                    llj.d.a(sQLiteDatabase2, lkg2.a(a7));
                }
            }
        }
    }
}
