package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: ygy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygy extends ygu {
    private final ygj a;
    private final ygz b;

    public ygy(ygj ygj, String str, String str2, String str3, String str4) {
        super("DeleteFlagOverridesOperationCall", avtj.DELETE_FLAG_OVERRIDE);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new ygz(str2, str3, str4, str);
    }

    public final avst a() {
        ygz ygz = this.b;
        avss avss = (avss) avst.m.o();
        String str = ygz.a;
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

    public final List d() {
        return this.b.b;
    }

    public final void b(Context context, yfw yfw) {
        Cursor query;
        avsu a2;
        String str;
        String str2;
        ygz ygz = this.b;
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet<>();
        SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ygz.a = ygb.a(ygz.a, ygz.e);
            query = writableDatabase.query("FlagOverrides", yhp.a, "committed = 0", (String[]) null, (String) null, (String) null, (String) null);
            String[] strArr = {null, null, null};
            while (query.moveToNext()) {
                String string = query.getString(7);
                String string2 = query.getString(8);
                String string3 = query.getString(1);
                String str3 = ygz.a;
                if ((str3 == null || str3.equals(string)) && (((str = ygz.c) == null || str.equals(string2)) && ((str2 = ygz.d) == null || str2.equals(string3) || yhp.a(ygz.d, string3)))) {
                    FlagOverride flagOverride = new FlagOverride(string, string2, yhe.a(query), false);
                    arrayList.add(flagOverride);
                    hashSet.add(flagOverride.a);
                    strArr[0] = string;
                    strArr[1] = string2;
                    strArr[2] = string3;
                    writableDatabase.delete("FlagOverrides", "packageName = ? AND user = ? AND name = ? AND committed = 0", strArr);
                }
            }
            if (query != null) {
                query.close();
            }
            for (String b2 : hashSet) {
                yfm.b(writableDatabase, b2);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            for (String str4 : hashSet) {
                String b3 = yfu.b(writableDatabase, str4);
                if (!(b3 == null || (a2 = ygc.a(context, str4, b3, 9, true)) == null)) {
                    ygz.b.add(a2);
                }
            }
            this.a.a(Status.a, new FlagOverrides(arrayList));
            ygf.a(context).a(this.b.a);
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
