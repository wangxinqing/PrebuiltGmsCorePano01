package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import java.util.ArrayList;

/* renamed from: yho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yho extends ygu {
    private final ygj a;
    private final yhp b;

    public yho(ygj ygj, String str, String str2, String str3, String str4) {
        super("ListFlagOverridesOperationCall", avtj.LIST_FLAG_OVERRIDE);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new yhp(str2, str3, str4, str);
    }

    public final avst a() {
        yhp yhp = this.b;
        avss avss = (avss) avst.m.o();
        String str = yhp.b;
        if (str != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            avst.a |= 1;
            avst.b = str;
        }
        return (avst) avss.i();
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final void b(Context context, yfw yfw) {
        Cursor query;
        String str;
        String str2;
        yhp yhp = this.b;
        SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
        yfw.a(writableDatabase);
        ArrayList arrayList = new ArrayList();
        try {
            query = writableDatabase.query("FlagOverrides", yhp.a, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            yhp.b = ygb.a(yhp.b, yhp.e);
            while (query.moveToNext()) {
                String string = query.getString(7);
                String string2 = query.getString(8);
                boolean z = true;
                String string3 = query.getString(1);
                String str3 = yhp.b;
                if ((str3 == null || str3.equals(string)) && (((str = yhp.c) == null || str.equals(string2)) && ((str2 = yhp.d) == null || str2.equals(string3) || yhp.a(yhp.d, string3)))) {
                    Flag a2 = yhe.a(query);
                    if (query.getInt(9) == 0) {
                        z = false;
                    }
                    arrayList.add(new FlagOverride(string, string2, a2, z));
                }
            }
            writableDatabase.setTransactionSuccessful();
            if (query != null) {
                query.close();
            }
            writableDatabase.endTransaction();
            this.a.a(Status.a, new FlagOverrides(arrayList));
            return;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        throw th;
    }

    public final void a(Status status) {
        this.a.a(status, (FlagOverrides) null);
    }
}
