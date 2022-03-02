package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: dvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dvf extends SQLiteOpenHelper {
    public final Context a;
    public final aaig b;
    public final dvg c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dvf(Context context, String str, int i, dvg dvg) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        aaig b2 = aafi.b(context, (aafk) null);
        this.a = context;
        this.b = b2;
        this.c = dvg;
    }

    public static final Cursor a(Cursor cursor, dvj dvj, SQLiteDatabase sQLiteDatabase) {
        if (cursor == null) {
            return null;
        }
        String a2 = dvd.a(sQLiteDatabase, dvj);
        return a2 != null ? dun.a(cursor, a2) : cursor;
    }

    /* access modifiers changed from: protected */
    public abstract void a(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    public abstract void a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract boolean a();

    public final SQLiteDatabase c() {
        try {
            return super.getReadableDatabase();
        } catch (SQLiteException e) {
            Log.e("AppDataSearchHelper", "Failed to get a readable database", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        throw null;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        dvd.a(sQLiteDatabase);
        for (dvj a2 : this.c.b) {
            a(sQLiteDatabase, a2);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        RegisterSectionInfo[] registerSectionInfoArr;
        b(sQLiteDatabase);
        if (a()) {
            dvh dvh = new dvh(this.a, this, this.b);
            ArrayList arrayList = new ArrayList();
            for (dvj dvj : dvh.c.b) {
                aaig aaig = dvh.b;
                String packageName = dvh.a.getPackageName();
                String str = dvj.a;
                iha b2 = ihb.b();
                b2.a = new aaix(packageName, str);
                acwa a2 = ((iby) aaig).a(b2.a());
                try {
                    acws.a(a2);
                    RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) a2.d();
                    if (registerCorpusInfo == null) {
                        String valueOf = String.valueOf(dvj.a);
                        arrayList.add(valueOf.length() == 0 ? new String("Could not get info for ") : "Could not get info for ".concat(valueOf));
                    } else {
                        Uri.Builder authority = new Uri.Builder().scheme("content").authority(dvh.c.a);
                        String valueOf2 = String.valueOf(Uri.encode(dvj.a));
                        Uri build = authority.path(valueOf2.length() == 0 ? new String("appdatasearch/") : "appdatasearch/".concat(valueOf2)).build();
                        if (!registerCorpusInfo.c.toString().startsWith(build.toString())) {
                            String valueOf3 = String.valueOf(registerCorpusInfo.c);
                            String str2 = dvj.a;
                            String valueOf4 = String.valueOf(build);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 62 + String.valueOf(str2).length() + String.valueOf(valueOf4).length());
                            sb.append("Content provider URI ");
                            sb.append(valueOf3);
                            sb.append(" for corpus ");
                            sb.append(str2);
                            sb.append(" does not match expected URI ");
                            sb.append(valueOf4);
                            arrayList.add(sb.toString());
                        }
                        RegisterSectionInfo[] registerSectionInfoArr2 = registerCorpusInfo.d;
                        HashSet<String> hashSet = new HashSet<>(dvj.j.keySet());
                        int length = registerSectionInfoArr2.length;
                        int i = 0;
                        while (i < length) {
                            RegisterSectionInfo registerSectionInfo = registerSectionInfoArr2[i];
                            hashSet.remove(registerSectionInfo.a);
                            if (!dvj.j.containsKey(registerSectionInfo.a)) {
                                String str3 = dvj.d;
                                String str4 = registerSectionInfo.a;
                                String str5 = dvj.a;
                                registerSectionInfoArr = registerSectionInfoArr2;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 74 + String.valueOf(str4).length() + String.valueOf(str5).length());
                                sb2.append("CorpusTableMapping for ");
                                sb2.append(str3);
                                sb2.append(" does not contain a mapping for section ");
                                sb2.append(str4);
                                sb2.append(" in corpus ");
                                sb2.append(str5);
                                arrayList.add(sb2.toString());
                            } else {
                                registerSectionInfoArr = registerSectionInfoArr2;
                            }
                            i++;
                            registerSectionInfoArr2 = registerSectionInfoArr;
                        }
                        if (!hashSet.isEmpty()) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Mapping for ");
                            sb3.append(hashSet.size());
                            sb3.append(" non-existent sections(s) for corpus ");
                            sb3.append(dvj.a);
                            sb3.append(": ");
                            for (String str6 : hashSet) {
                                sb3.append("\n  ");
                                sb3.append(str6);
                                sb3.append(" -> ");
                                sb3.append((String) dvj.j.get(str6));
                            }
                            arrayList.add(sb3.toString());
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
                    String valueOf5 = String.valueOf(dvj.a);
                    arrayList.add(valueOf5.length() == 0 ? new String("Could not get info for ") : "Could not get info for ".concat(valueOf5));
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Encountered ");
                sb4.append(arrayList.size());
                sb4.append(" error(s) with corpus configuration: ");
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb4.append("\n");
                    sb4.append((String) arrayList.get(i2));
                }
                throw new AssertionError(sb4.toString());
            }
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a(sQLiteDatabase, i, i2);
        b(sQLiteDatabase);
    }

    private final void b(SQLiteDatabase sQLiteDatabase) {
        int i;
        dvd.a(sQLiteDatabase);
        if (dvk.c(sQLiteDatabase, "version_appdatasearch")) {
            Cursor query = sQLiteDatabase.query("version_appdatasearch", new String[]{"version"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (query == null) {
                Log.w("AppDataSearchHelper", "Empty version table.");
                i = 0;
            } else {
                try {
                    if (query.moveToNext()) {
                        i = query.getInt(query.getColumnIndex("version"));
                    } else {
                        Log.w("AppDataSearchHelper", "Empty version table.");
                        query.close();
                        i = 0;
                    }
                } finally {
                    query.close();
                }
            }
        } else {
            i = 0;
        }
        if (i < 6) {
            if (i <= 0) {
                for (String a2 : dvk.a(sQLiteDatabase, "_appdatasearch_seqno_table")) {
                    dvk.a(sQLiteDatabase, a2);
                }
                for (String b2 : dvk.b(sQLiteDatabase, "_appdatasearch_insert_trigger", "_appdatasearch_delete_trigger", "_appdatasearch_update_trigger")) {
                    dvk.b(sQLiteDatabase, b2);
                }
            }
            if (i == 2) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE [%s] ADD COLUMN [%s] INTEGER", new Object[]{"incarnation_appdatasearch", "seqno_table_complete"}));
            } else if (i >= 3) {
                for (String a3 : dve.a(sQLiteDatabase)) {
                    dvk.a(sQLiteDatabase, a3);
                }
                for (String b3 : dve.b(sQLiteDatabase)) {
                    dvk.b(sQLiteDatabase, b3);
                }
            }
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("version", 6);
            sQLiteDatabase.update("version_appdatasearch", contentValues, (String) null, (String[]) null);
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (dvj dvj : this.c.b) {
            hashSet.add(dve.a(dvj));
            hashSet2.addAll(dve.g(dvj));
        }
        Set<String> a4 = dve.a(sQLiteDatabase);
        for (String str : a4) {
            if (!hashSet.contains(str)) {
                dvk.a(sQLiteDatabase, str);
            }
        }
        Set<String> b4 = dve.b(sQLiteDatabase);
        for (String str2 : b4) {
            if (!hashSet2.contains(str2)) {
                dvk.b(sQLiteDatabase, str2);
            }
        }
        for (dvj dvj2 : this.c.b) {
            if (!a4.contains(dve.a(dvj2)) || !b4.containsAll(dve.g(dvj2))) {
                a(sQLiteDatabase, dvj2);
            }
        }
    }

    public static String a(String str, String str2) {
        agyu a2 = agyu.a();
        a2.a("[");
        a2.a(str);
        a2.a("].");
        a2.a("[");
        a2.a(str2);
        a2.a("]");
        return ((agys) a2.b()).a;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, dvj dvj) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        dvj dvj2 = dvj;
        String a2 = dve.a(dvj);
        dvk.a(sQLiteDatabase2, a2);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 108);
        sb.append("CREATE TABLE [");
        sb.append(a2);
        sb.append("] (seqno INTEGER PRIMARY KEY AUTOINCREMENT,action_type INTEGER,uri TEXT,tag TEXT DEFAULT NULL)");
        sQLiteDatabase2.execSQL(sb.toString());
        String str = dvj2.f;
        String str2 = dvj2.d;
        int length = String.valueOf(a2).length();
        StringBuilder sb2 = new StringBuilder(length + 52 + str.length() + String.valueOf(str2).length());
        sb2.append("INSERT INTO [");
        sb2.append(a2);
        sb2.append("] (action_type,uri) SELECT 0,[");
        sb2.append(str);
        sb2.append("] FROM [");
        sb2.append(str2);
        sb2.append("]");
        sQLiteDatabase2.execSQL(sb2.toString());
        String str3 = dvj2.e;
        if (str3 != null) {
            String str4 = dvj2.f;
            String str5 = dvj2.g;
            int length2 = String.valueOf(a2).length();
            int length3 = str4.length();
            StringBuilder sb3 = new StringBuilder(length2 + 59 + length3 + String.valueOf(str5).length() + str3.length());
            sb3.append("INSERT INTO [");
            sb3.append(a2);
            sb3.append("] (action_type,uri,tag) SELECT 0,[");
            sb3.append(str4);
            sb3.append("],[");
            sb3.append(str5);
            sb3.append("] FROM [");
            sb3.append(str3);
            sb3.append("]");
            sQLiteDatabase2.execSQL(sb3.toString());
        }
        dvd.a(sQLiteDatabase2, dvj2, true);
        String b2 = dve.b(dvj);
        String c2 = dve.c(dvj);
        String d = dve.d(dvj);
        String str6 = dvj2.f;
        dvk.b(sQLiteDatabase2, b2);
        dvk.b(sQLiteDatabase2, d);
        dvk.b(sQLiteDatabase2, c2);
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("corpus_name", dvj2.a);
        contentValues.put("incarnation", String.format("%d-%s", new Object[]{Long.valueOf(System.currentTimeMillis()), Long.toHexString(new Random().nextLong())}));
        contentValues.put("seqno_table_complete", 1);
        sQLiteDatabase2.replace("incarnation_appdatasearch", (String) null, contentValues);
        StringBuilder sb4 = new StringBuilder(String.valueOf(a2).length() + 49);
        sb4.append("INSERT INTO [");
        sb4.append(a2);
        sb4.append("]  (action_type,uri) VALUES (%s,%s);");
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder(str6.length() + 6);
        sb6.append("new.[");
        sb6.append(str6);
        sb6.append("]");
        String format = String.format(sb5, new Object[]{0, sb6.toString()});
        StringBuilder sb7 = new StringBuilder(str6.length() + 6);
        sb7.append("old.[");
        sb7.append(str6);
        sb7.append("]");
        String format2 = String.format(sb5, new Object[]{1, sb7.toString()});
        String str7 = dvj2.b;
        int length4 = String.valueOf(b2).length();
        String str8 = "old.[";
        StringBuilder sb8 = new StringBuilder(length4 + 60 + String.valueOf(str7).length() + String.valueOf(format).length());
        sb8.append("CREATE TRIGGER [");
        sb8.append(b2);
        sb8.append("] AFTER INSERT ON [");
        sb8.append(str7);
        sb8.append("] FOR EACH ROW BEGIN ");
        sb8.append(format);
        String str9 = "] AFTER INSERT ON [";
        sb8.append(" END");
        sQLiteDatabase2.execSQL(sb8.toString());
        int length5 = String.valueOf(c2).length();
        String str10 = "]";
        StringBuilder sb9 = new StringBuilder(length5 + 60 + String.valueOf(str7).length() + String.valueOf(format2).length());
        sb9.append("CREATE TRIGGER [");
        sb9.append(c2);
        sb9.append("] AFTER DELETE ON [");
        sb9.append(str7);
        sb9.append("] FOR EACH ROW BEGIN ");
        sb9.append(format2);
        sb9.append(" END");
        sQLiteDatabase2.execSQL(sb9.toString());
        int length6 = String.valueOf(d).length();
        String str11 = "] AFTER DELETE ON [";
        StringBuilder sb10 = new StringBuilder(length6 + 60 + String.valueOf(str7).length() + String.valueOf(format).length());
        sb10.append("CREATE TRIGGER [");
        sb10.append(d);
        sb10.append("] AFTER UPDATE ON [");
        sb10.append(str7);
        sb10.append("] FOR EACH ROW BEGIN ");
        sb10.append(format);
        sb10.append(" END");
        sQLiteDatabase2.execSQL(sb10.toString());
        String str12 = dvj2.c;
        if (str12 != null) {
            String str13 = dvj2.f;
            String str14 = dvj2.g;
            String e = dve.e(dvj);
            String f = dve.f(dvj);
            dvk.b(sQLiteDatabase2, e);
            dvk.b(sQLiteDatabase2, f);
            StringBuilder sb11 = new StringBuilder(String.valueOf(a2).length() + 55);
            sb11.append("INSERT INTO [");
            sb11.append(a2);
            sb11.append("] (action_type,uri,tag) VALUES (%s,%s,%s);");
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder(str13.length() + 6);
            sb13.append("new.[");
            sb13.append(str13);
            String str15 = str10;
            sb13.append(str15);
            StringBuilder sb14 = new StringBuilder(String.valueOf(str14).length() + 6);
            sb14.append("new.[");
            sb14.append(str14);
            sb14.append(str15);
            String format3 = String.format(sb12, new Object[]{0, sb13.toString(), sb14.toString()});
            StringBuilder sb15 = new StringBuilder(str13.length() + 6);
            String str16 = str8;
            sb15.append(str16);
            sb15.append(str13);
            sb15.append(str15);
            StringBuilder sb16 = new StringBuilder(String.valueOf(str14).length() + 6);
            sb16.append(str16);
            sb16.append(str14);
            sb16.append(str15);
            String format4 = String.format(sb12, new Object[]{1, sb15.toString(), sb16.toString()});
            int length7 = String.valueOf(e).length();
            StringBuilder sb17 = new StringBuilder(length7 + 60 + str12.length() + String.valueOf(format3).length());
            sb17.append("CREATE TRIGGER [");
            sb17.append(e);
            sb17.append(str9);
            sb17.append(str12);
            sb17.append("] FOR EACH ROW BEGIN ");
            sb17.append(format3);
            sb17.append(" END");
            sQLiteDatabase2.execSQL(sb17.toString());
            StringBuilder sb18 = new StringBuilder(String.valueOf(f).length() + 60 + str12.length() + String.valueOf(format4).length());
            sb18.append("CREATE TRIGGER [");
            sb18.append(f);
            sb18.append(str11);
            sb18.append(str12);
            sb18.append("] FOR EACH ROW BEGIN ");
            sb18.append(format4);
            sb18.append(" END");
            sQLiteDatabase2.execSQL(sb18.toString());
        }
    }

    public final long b(dvj dvj) {
        SQLiteDatabase c2 = c();
        long j = 0;
        if (c2 == null) {
            return 0;
        }
        String a2 = dve.a(dvj);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 25);
        sb.append("SELECT MAX(seqno) FROM [");
        sb.append(a2);
        sb.append("]");
        Cursor rawQuery = c2.rawQuery(sb.toString(), (String[]) null);
        if (rawQuery == null) {
            return 0;
        }
        try {
            if (rawQuery.moveToNext()) {
                j = rawQuery.getLong(0);
            }
            return j;
        } finally {
            rawQuery.close();
        }
    }

    @Deprecated
    public final boolean a(dvj dvj) {
        return a(dvj, 30000);
    }

    public final SQLiteDatabase b() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("AppDataSearchHelper", "Failed to get a writable database", e);
            return null;
        }
    }

    public final boolean a(dvj dvj, long j) {
        if (Arrays.asList(this.c.b).contains(dvj)) {
            String str = dvj.a;
            acwa b2 = this.b.b(this.a.getPackageName(), str);
            try {
                acws.a(b2, j, TimeUnit.MILLISECONDS);
                CorpusStatus corpusStatus = (CorpusStatus) b2.d();
                if (!corpusStatus.a) {
                    String str2 = dvj.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 23);
                    sb.append("Couldn't find corpus '");
                    sb.append(str2);
                    sb.append("'");
                    Log.e("AppDataSearchHelper", sb.toString());
                    return false;
                }
                long j2 = 0;
                if (!corpusStatus.g.equals(dvd.a(c(), dvj))) {
                    if (d()) {
                        try {
                            acws.a(this.b.a(this.a.getPackageName(), str), j, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException | ExecutionException | TimeoutException e) {
                            String valueOf = String.valueOf(dvj.a);
                            Log.w("AppDataSearchHelper", valueOf.length() == 0 ? new String("Couldn't clear corpus ") : "Couldn't clear corpus ".concat(valueOf));
                        }
                    }
                } else if (!b(dvj, corpusStatus.c)) {
                    return false;
                } else {
                    j2 = corpusStatus.b;
                }
                long b3 = b(dvj);
                if (b3 <= j2) {
                    return true;
                }
                try {
                    return ((Boolean) acws.a(this.b.a(this.a.getPackageName(), str, b3), j, TimeUnit.MILLISECONDS)).booleanValue();
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    String str3 = dvj.a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 39);
                    sb2.append("Couldn't request indexing for corpus '");
                    sb2.append(str3);
                    sb2.append("'");
                    Log.w("AppDataSearchHelper", sb2.toString());
                    return false;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                String valueOf2 = String.valueOf(dvj.a);
                Log.e("AppDataSearchHelper", valueOf2.length() == 0 ? new String("Couldn't fetch status for corpus ") : "Couldn't fetch status for corpus ".concat(valueOf2));
                return false;
            }
        } else {
            String str4 = dvj.a;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 57);
            sb3.append("The table ");
            sb3.append(str4);
            sb3.append(" does not have a registered CorpusTableMapping.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final boolean b(dvj dvj, long j) {
        SQLiteDatabase b2 = b();
        if (b2 == null) {
            return false;
        }
        String a2 = dve.a(dvj);
        b2.beginTransaction();
        try {
            b2.delete(a2, "seqno < ?", new String[]{String.valueOf(j)});
            dvd.a(b2, dvj, false);
            b2.setTransactionSuccessful();
            return true;
        } finally {
            b2.endTransaction();
        }
    }
}
