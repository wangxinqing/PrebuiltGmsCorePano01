package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: yiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class yiu {
    private static final jjg a = jjg.a(iyc.PHENOTYPE);
    private static final Object b = new Object();
    private static final byte[] g = new byte[0];
    public final Context c;
    public yfw d;
    public yfw e;
    public boolean f = false;
    private final yiz h;
    private final agwa i;
    private final bapu j;
    private final int k;

    public yiu(Context context, yfw yfw, yfw yfw2, yiz yiz, agwa agwa, int i2, bapu bapu) {
        this.c = context;
        this.d = yfw;
        this.e = yfw2;
        this.i = agwa;
        this.h = yiz;
        this.k = i2;
        this.j = bapu;
    }

    static int a(apfc apfc) {
        aucx aucx = apfc.c;
        int size = aucx.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            apfw apfw = (apfw) aucx.get(i3);
            apfx apfx = apfw.a;
            if (apfx == null) {
                apfx = apfx.d;
            }
            long j2 = apfx.b;
            apfx apfx2 = apfw.a;
            if (apfx2 == null) {
                apfx2 = apfx.d;
            }
            int i4 = (int) (j2 ^ (apfx2.b >>> 32));
            apfx apfx3 = apfw.a;
            if (apfx3 == null) {
                apfx3 = apfx.d;
            }
            for (byte b2 : apfx3.c.k()) {
                i4 = (i4 * 31) + b2;
            }
            i2 = (i2 * 17) ^ i4;
        }
        return i2;
    }

    private static final aucd b(yit yit) {
        aucd o = avtm.i.o();
        int i2 = yit.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtm avtm = (avtm) o.b;
        avtm.a |= 32;
        avtm.f = i2;
        int b2 = yit.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtm avtm2 = (avtm) o.b;
        int i3 = avtm2.a | 64;
        avtm2.a = i3;
        avtm2.g = b2;
        int i4 = yit.g;
        int i5 = i3 | 128;
        avtm2.a = i5;
        avtm2.h = i4;
        int i6 = yit.a;
        int i7 = i5 | 1;
        avtm2.a = i7;
        avtm2.b = i6;
        int i8 = yit.b;
        int i9 = i7 | 2;
        avtm2.a = i9;
        avtm2.c = i8;
        int i10 = yit.d;
        int i11 = i9 | 4;
        avtm2.a = i11;
        avtm2.d = i10;
        int i12 = yit.f;
        avtm2.a = i11 | 8;
        avtm2.e = i12;
        return o;
    }

    private static ArrayList c(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.endsWith("@google.com")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static yiw e() {
        return new yiw(ayzv.a.a().c());
    }

    private final void g() {
        Cursor rawQuery;
        yfw yfw = this.e;
        if (yfw != null) {
            SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                aucx aucx = ayyk.b().a;
                String join = TextUtils.join(",", Collections.nCopies(aucx.size(), "?"));
                StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 60);
                sb.append("SELECT packageName FROM Packages WHERE packageName NOT IN (");
                sb.append(join);
                sb.append(")");
                rawQuery = writableDatabase.rawQuery(sb.toString(), (String[]) aucx.toArray(new String[0]));
                while (rawQuery.moveToNext()) {
                    yih.a(writableDatabase, rawQuery.getString(0));
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return;
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }

    private static Level h() {
        return !ayzv.a.a().j() ? Level.CONFIG : Level.INFO;
    }

    /* access modifiers changed from: protected */
    public abstract String a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(int i2);

    /* access modifiers changed from: protected */
    public void a(int i2, Set set) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j2);

    /* access modifiers changed from: protected */
    public void a(yiy yiy) {
    }

    public abstract String[] a();

    /* access modifiers changed from: protected */
    public void aP() {
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public abstract void b(String str);

    /* access modifiers changed from: protected */
    public abstract avrb c();

    /* access modifiers changed from: package-private */
    public final void f() {
        ((anih) ((anih) a.d()).a("yiu", "f", 2384, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("vacuuming");
        try {
            this.d.getWritableDatabase().execSQL("VACUUM");
            yfw yfw = this.e;
            if (yfw != null) {
                yfw.getWritableDatabase().execSQL("VACUUM");
            }
            ((anih) ((anih) a.d()).a("yiu", "f", 2391, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("done vacuuming");
        } catch (SQLException e2) {
            anih anih = (anih) a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("yiu", "f", 2393, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SQLException when vacuuming:");
        }
    }

    private static int a(LinkedHashMap linkedHashMap, String str) {
        int i2 = -1;
        for (Map.Entry key : linkedHashMap.entrySet()) {
            i2++;
            if (((String) key.getKey()).equals(str)) {
                return i2;
            }
        }
        throw new AssertionError(String.format("Impossible State: Could not find key %s in map", new Object[]{str}));
    }

    private static int a(yit yit) {
        if (yit.a()) {
            return 4;
        }
        if (yit.a <= 0 || yit.a()) {
            return 1;
        }
        if (yit.b < yit.a) {
            return 10;
        }
        int i2 = yit.f;
        return i2 - yit.g < i2 ? 10 : 1;
    }

    private static amzy a(SQLiteDatabase sQLiteDatabase, apfy apfy, String str) {
        Cursor query = sQLiteDatabase.query("ApplicationTags", new String[]{"partitionId", "tag"}, "packageName = ? AND user = ? AND version = ?", new String[]{apfy.b, str, Long.toString(apfy.c)}, (String) null, (String) null, (String) null);
        try {
            amzt j2 = amzy.j();
            while (query.moveToNext()) {
                aucd o = apfx.d.o();
                long j3 = query.getLong(0);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                apfx apfx = (apfx) o.b;
                apfx.a |= 1;
                apfx.b = j3;
                auay a2 = auay.a(query.getBlob(1));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                apfx apfx2 = (apfx) o.b;
                a2.getClass();
                apfx2.a |= 2;
                apfx2.c = a2;
                j2.c((apfx) o.i());
            }
            amzy a3 = j2.a();
            if (query != null) {
                query.close();
            }
            return a3;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String[] strArr) {
        Throwable th;
        Cursor rawQuery;
        Throwable th2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Cursor query;
        Throwable th3;
        String[] strArr2 = strArr;
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            Set<String> a2 = yfv.a(writableDatabase);
            for (String remove : strArr2) {
                a2.remove(remove);
            }
            for (String remove2 : a(writableDatabase)) {
                a2.remove(remove2);
            }
            a2.remove("");
            HashSet<String> hashSet = new HashSet<>();
            for (String str : a2) {
                String[] strArr3 = {str};
                String[] strArr4 = strArr3;
                String str2 = "CrossLoggedExperimentTokens";
                String str3 = "ExperimentTokens";
                query = writableDatabase.query("ExperimentTokens", new String[]{"packageName"}, "user = ?", strArr3, (String) null, (String) null, (String) null);
                while (query.moveToNext()) {
                    hashSet.add(query.getString(0));
                }
                if (query != null) {
                    query.close();
                }
                String[] strArr5 = strArr4;
                writableDatabase.delete(str3, "user = ?", strArr5);
                writableDatabase.delete("Flags", "user = ?", strArr5);
                writableDatabase.delete("RequestTags", "user = ?", strArr5);
                writableDatabase.delete("ApplicationTags", "user = ?", strArr5);
                writableDatabase.delete(str2, "fromUser = ?", strArr5);
            }
            String str4 = "CrossLoggedExperimentTokens";
            String str5 = "ExperimentTokens";
            for (String b2 : hashSet) {
                yfm.b(writableDatabase, b2);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            SQLiteDatabase writableDatabase2 = this.d.getWritableDatabase();
            writableDatabase2.beginTransaction();
            try {
                Cursor query2 = writableDatabase2.query("Packages", new String[]{"packageName", "version"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                while (query2.moveToNext()) {
                    try {
                        String string = query2.getString(0);
                        rawQuery = writableDatabase2.rawQuery("SELECT MAX(version), user FROM ExperimentTokens WHERE packageName = ? AND version <= ? AND isCommitted = 0 GROUP BY user", new String[]{string, Integer.toString(query2.getInt(1))});
                        boolean z5 = false;
                        while (rawQuery.moveToNext()) {
                            String[] strArr6 = {string, rawQuery.getString(1), Integer.toString(rawQuery.getInt(0))};
                            if (writableDatabase2.delete("Flags", "packageName = ? AND user = ? AND version != ? AND committed = 0", strArr6) > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean z6 = z5 | z;
                            if (writableDatabase2.delete(str5, "packageName = ? AND user = ? AND version != ? AND isCommitted = 0", strArr6) > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean z7 = z6 | z2;
                            if (writableDatabase2.delete("ApplicationTags", "packageName = ? AND user = ? AND version != ?", strArr6) > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z8 = z7 | z3;
                            if (writableDatabase2.delete(str4, "fromPackageName = ? AND fromUser = ? AND fromVersion != ? AND isCommitted = 0", strArr6) > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z8 | z4 | (writableDatabase2.delete(str4, "toPackageName = ? AND fromUser = ? AND toVersion != ? AND isCommitted = 0", strArr6) > 0);
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        if (z5) {
                            yfm.b(writableDatabase2, string);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (query2 != null) {
                            query2.close();
                        }
                        throw th;
                    }
                }
                writableDatabase2.setTransactionSuccessful();
                if (query2 != null) {
                    query2.close();
                }
                writableDatabase2.endTransaction();
                return;
            } catch (Throwable th5) {
                writableDatabase2.endTransaction();
                throw th5;
            }
            throw th3;
            throw th2;
        } catch (Throwable th6) {
            writableDatabase.endTransaction();
            throw th6;
        }
    }

    private static String a(List list, LinkedHashMap linkedHashMap, apfy apfy) {
        if (linkedHashMap == null) {
            return (String) anbs.b(list);
        }
        apfk apfk = apfy.d;
        if (apfk == null) {
            apfk = apfk.c;
        }
        int i2 = apfk.b;
        return i2 != -1 ? (String) a(linkedHashMap, i2).getKey() : "";
    }

    private static Map.Entry a(LinkedHashMap linkedHashMap, int i2) {
        if (linkedHashMap == null) {
            throw new AssertionError("map shall not be null");
        } else if (i2 < 0 || i2 >= linkedHashMap.size()) {
            throw new IndexOutOfBoundsException(String.format("i: %d is out of range for a map with size of %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(linkedHashMap.size())}));
        } else {
            int i3 = -1;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                i3++;
                if (i3 == i2) {
                    return entry;
                }
            }
            throw new IndexOutOfBoundsException(String.format("j: %d is out of range for a map with size of %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(linkedHashMap.size())}));
        }
    }

    private static final Set a(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("ApplicationStates", new String[]{"user"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        try {
            HashSet hashSet = new HashSet(query.getCount());
            while (query.moveToNext()) {
                hashSet.add(query.getString(0));
            }
            if (query != null) {
                query.close();
            }
            return hashSet;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static Set a(apfo apfo, apfp apfp) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        aucx aucx = apfp.a;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            apfy apfy = ((apfc) aucx.get(i2)).b;
            if (apfy == null) {
                apfy = apfy.e;
            }
            hashSet2.add(apfy);
        }
        aucx aucx2 = apfo.c;
        int size2 = aucx2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            apfy apfy2 = ((apfb) aucx2.get(i3)).b;
            if (apfy2 == null) {
                apfy2 = apfy.e;
            }
            aucs aucs = apfp.e;
            apfk apfk = apfy2.d;
            if (apfk == null) {
                apfk = apfk.c;
            }
            if (!aucs.contains(Integer.valueOf(apfk.b)) && !hashSet2.contains(apfy2)) {
                hashSet.add(apfy2);
            }
        }
        return hashSet;
    }

    private final void a(int i2, String str, avta avta, aucd aucd, yit yit, LinkedHashMap linkedHashMap, boolean z, List list, String str2, Set set) {
        aucd aucd2;
        avta avta2 = avta;
        Iterator it = list.iterator();
        yfy e2 = null;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (aucd == null) {
                aucd2 = avsz.h.o();
            } else {
                aucd2 = aucd;
            }
            try {
                a(set, Collections.singletonList(str3), str2, i2, str, z, aucd2, yit, linkedHashMap, false);
                if (aucd != null) {
                }
            } catch (yfy e3) {
                e2 = e3;
                anih anih = (anih) a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("yiu", "a", 596, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Sync failed");
                if (avta2.c) {
                    avta.c();
                    avta2.c = false;
                }
                avtd avtd = (avtd) avta2.b;
                avtd avtd2 = avtd.h;
                avtd.f = 4;
                avtd.a |= 16;
                if ((((avsz) aucd2.b).a & 2) == 0) {
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    avsz avsz = (avsz) aucd2.b;
                    avsz avsz2 = avsz.h;
                    avsz.c = 1;
                    avsz.a |= 2;
                }
                if (aucd != null) {
                }
            } catch (Throwable th) {
                if (aucd == null) {
                    avta2.a(aucd2);
                }
                throw th;
            }
            avta2.a(aucd2);
        }
        if (e2 != null) {
            throw e2;
        }
    }

    private final void a(int i2, String str, avta avta, aucd aucd, yit yit, LinkedHashMap linkedHashMap, boolean z, List list, Set set) {
        avta avta2 = avta;
        aucd aucd2 = aucd;
        try {
            a(set, list, (String) null, i2, str, z, aucd, yit, linkedHashMap, true);
        } catch (yfy e2) {
            yfy yfy = e2;
            anih anih = (anih) a.c();
            anih.a((Throwable) yfy);
            ((anih) anih.a("yiu", "a", 551, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SyncInBatch failed");
            if (avta2.c) {
                avta.c();
                avta2.c = false;
            }
            avtd avtd = (avtd) avta2.b;
            avtd avtd2 = avtd.h;
            avtd.f = 4;
            avtd.a |= 16;
            if ((((avsz) aucd2.b).a & 2) == 0) {
                if (aucd2.c) {
                    aucd.c();
                    aucd2.c = false;
                }
                avsz avsz = (avsz) aucd2.b;
                avsz avsz2 = avsz.h;
                avsz.c = 1;
                avsz.a |= 2;
            }
            throw yfy;
        }
    }

    private static void a(SQLiteDatabase sQLiteDatabase, apfa apfa, String str) {
        byte[] blob;
        String[] strArr = {"tokensTag"};
        String[] strArr2 = new String[3];
        apfy apfy = ((apfb) apfa.b).b;
        if (apfy == null) {
            apfy = apfy.e;
        }
        strArr2[0] = apfy.b;
        strArr2[1] = str;
        apfy apfy2 = ((apfb) apfa.b).b;
        if (apfy2 == null) {
            apfy2 = apfy.e;
        }
        strArr2[2] = Long.toString(apfy2.c);
        Cursor query = sQLiteDatabase.query("ExperimentTokens", strArr, "packageName = ? AND user = ? AND version = ? AND isCommitted = 0", strArr2, (String) null, (String) null, (String) null);
        try {
            if (query.moveToFirst() && (blob = query.getBlob(0)) != null) {
                auay a2 = auay.a(blob);
                if (apfa.c) {
                    apfa.c();
                    apfa.c = false;
                }
                apfb apfb = (apfb) apfa.b;
                apfb apfb2 = apfb.g;
                a2.getClass();
                apfb.a |= 4;
                apfb.e = a2;
            }
            if (query != null) {
                query.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, apfc apfc, String str, long j2, Integer num) {
        apfy apfy = apfc.b;
        if (apfy == null) {
            apfy = apfy.e;
        }
        ContentValues contentValues = new ContentValues();
        if (apfc.c.size() > 0) {
            contentValues.put("configHash", Integer.toString(a(apfc)));
        }
        contentValues.put("flagsHash", num);
        contentValues.put("servingVersion", Long.valueOf(j2));
        sQLiteDatabase.update("ExperimentTokens", contentValues, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{apfy.b, String.valueOf(apfy.c), str});
        contentValues.put("packageName", apfy.b);
        contentValues.put("user", str);
        contentValues.put("version", Long.valueOf(apfy.c));
        contentValues.put("isCommitted", 0);
        contentValues.put("experimentToken", new byte[0]);
        contentValues.put("serverToken", "");
        sQLiteDatabase.insertWithOnConflict("ExperimentTokens", (String) null, contentValues, 4);
    }

    private static void a(SQLiteDatabase sQLiteDatabase, apfy apfy, String str, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("servingVersion", Long.valueOf(j2));
        sQLiteDatabase.update("ExperimentTokens", contentValues, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{apfy.b, String.valueOf(apfy.c), str});
    }

    private static final void a(SQLiteDatabase sQLiteDatabase, String str, long j2, String str2, long j3) {
        sQLiteDatabase.delete("Flags", "packageName = ? AND version = ? AND user = ? AND partitionId = ? AND committed = 0", new String[]{str, Long.toString(j2), str2, Long.toString(j3)});
    }

    private final void a(String str, long j2, long j3, String str2, apft apft, SQLiteStatement sQLiteStatement) {
        if (!apft.h) {
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, str);
            sQLiteStatement.bindLong(2, j2);
            sQLiteStatement.bindLong(3, (long) apft.i);
            sQLiteStatement.bindLong(4, j3);
            sQLiteStatement.bindString(5, str2);
            sQLiteStatement.bindString(6, apft.a);
            long j4 = 0;
            sQLiteStatement.bindLong(7, 0);
            int a2 = apfs.a(apft.g);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 1) {
                sQLiteStatement.bindLong(8, apft.b);
            } else if (i2 == 2) {
                if (apft.c) {
                    j4 = 1;
                }
                sQLiteStatement.bindLong(9, j4);
            } else if (i2 == 3) {
                sQLiteStatement.bindDouble(10, apft.d);
            } else if (i2 == 4) {
                sQLiteStatement.bindString(11, apft.e);
            } else if (i2 != 5) {
                ((anih) ((anih) a.c()).a("yiu", "a", 2331, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Value type not set for flag %s, ignoring", (Object) apft.a);
                return;
            } else {
                apfq apfq = apft.f;
                if (apfq == null) {
                    apfq = apfq.b;
                }
                sQLiteStatement.bindBlob(12, apfq.a.k());
            }
            String str3 = apft.a;
            sQLiteStatement.execute();
            return;
        }
        ((anih) ((anih) a.d()).a("yiu", "a", 2299, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("deleting flag in updateFlag - not supposed to happen: %s, %s", (Object) str, (Object) apft.a);
    }

    private final void a(LinkedHashMap linkedHashMap, boolean z, String... strArr) {
        String str;
        for (String str2 : strArr) {
            if (z) {
                try {
                    str = a(str2);
                } catch (yfy e2) {
                    str = null;
                }
                if (str != null) {
                    linkedHashMap.put(str2, str);
                }
            } else {
                String a2 = a(str2);
                if (a2 != null) {
                    linkedHashMap.put(str2, a2);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03de, code lost:
        if (r3 == null) goto L_0x03e0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0318 A[Catch:{ all -> 0x068e }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0319 A[Catch:{ all -> 0x068e }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x032c A[SYNTHETIC, Splitter:B:180:0x032c] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03c9 A[Catch:{ all -> 0x0659, all -> 0x0661, all -> 0x068c }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03d0 A[Catch:{ all -> 0x0659, all -> 0x0661, all -> 0x068c }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03d3 A[Catch:{ all -> 0x0659, all -> 0x0661, all -> 0x068c }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03dc A[Catch:{ all -> 0x0659, all -> 0x0661, all -> 0x068c }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03e6 A[Catch:{ all -> 0x0659, all -> 0x0661, all -> 0x068c }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03fc A[Catch:{ all -> 0x0659, all -> 0x0661, all -> 0x068c }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0694 A[SYNTHETIC, Splitter:B:344:0x0694] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0801 A[SYNTHETIC, Splitter:B:424:0x0801] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.Set r41, long r42, defpackage.apfo r44, defpackage.apfp r45, java.util.List r46, java.util.LinkedHashMap r47, defpackage.aucd r48, defpackage.yit r49, boolean r50) {
        /*
            r40 = this;
            r1 = r40
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            r7 = r49
            java.lang.String r8 = "serverToken"
            java.lang.String r9 = "experimentToken"
            java.lang.String r10 = "LastFetch"
            java.lang.String r11 = "key"
            java.lang.String r12 = "bytesTag"
            java.lang.String r13 = "servertimestamp"
            java.lang.String r0 = r3.c
            boolean r0 = r0.isEmpty()
            r15 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            if (r0 == 0) goto L_0x002a
            r18 = r14
            goto L_0x0091
        L_0x002a:
            if (r2 == 0) goto L_0x0038
            apfd r0 = r2.b     // Catch:{ yfy -> 0x0036 }
            if (r0 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            apfd r0 = defpackage.apfd.h     // Catch:{ yfy -> 0x0036 }
        L_0x0033:
            java.lang.String r0 = r0.d     // Catch:{ yfy -> 0x0036 }
            goto L_0x0039
        L_0x0036:
            r0 = move-exception
            goto L_0x004f
        L_0x0038:
            r0 = 0
        L_0x0039:
            agwa r15 = r1.i     // Catch:{ yfy -> 0x0036 }
            znz r7 = defpackage.zoa.c()     // Catch:{ yfy -> 0x0036 }
            java.lang.String r2 = r3.c     // Catch:{ yfy -> 0x0036 }
            r7.a = r2     // Catch:{ yfy -> 0x0036 }
            r7.b = r0     // Catch:{ yfy -> 0x0036 }
            zoa r0 = r7.a()     // Catch:{ yfy -> 0x0036 }
            r15.a(r0)     // Catch:{ yfy -> 0x0036 }
            r18 = r14
            goto L_0x0091
        L_0x004f:
            boolean r2 = defpackage.azaf.l()
            if (r2 == 0) goto L_0x0071
            boolean r2 = r6.c
            if (r2 != 0) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            r48.c()
            r2 = 0
            r6.c = r2
        L_0x0060:
            aucj r2 = r6.b
            avsz r2 = (defpackage.avsz) r2
            avsz r3 = defpackage.avsz.h
            r3 = 11
            r2.c = r3
            int r3 = r2.a
            r4 = 2
            r3 = r3 | r4
            r2.a = r3
            throw r0
        L_0x0071:
            jjg r2 = a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r2.a((java.lang.Throwable) r0)
            r0 = 1512(0x5e8, float:2.119E-42)
            java.lang.String r7 = "yiu"
            java.lang.String r15 = "a"
            r18 = r14
            java.lang.String r14 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r2.a((java.lang.String) r7, (java.lang.String) r15, (int) r0, (java.lang.String) r14)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "Skip setting Pseudonymous ID error."
            r0.a((java.lang.String) r2)
        L_0x0091:
            yfw r0 = r1.d
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()
            r2.beginTransaction()
            java.util.Collections.emptySet()
            long r14 = defpackage.yfm.a(r2)     // Catch:{ all -> 0x0811 }
            r0 = 1
            int r7 = (r14 > r42 ? 1 : (r14 == r42 ? 0 : -1))
            if (r7 == 0) goto L_0x00dd
            boolean r4 = r6.c     // Catch:{ all -> 0x0811 }
            if (r4 != 0) goto L_0x00ab
            goto L_0x00b1
        L_0x00ab:
            r48.c()     // Catch:{ all -> 0x0811 }
            r4 = 0
            r6.c = r4     // Catch:{ all -> 0x0811 }
        L_0x00b1:
            aucj r4 = r6.b     // Catch:{ all -> 0x0811 }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ all -> 0x0811 }
            avsz r5 = defpackage.avsz.h     // Catch:{ all -> 0x0811 }
            r5 = 7
            r4.c = r5     // Catch:{ all -> 0x0811 }
            int r5 = r4.a     // Catch:{ all -> 0x0811 }
            r6 = 2
            r5 = r5 | r6
            r4.a = r5     // Catch:{ all -> 0x0811 }
            yfy r4 = new yfy     // Catch:{ all -> 0x0811 }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x0811 }
            java.lang.Long r6 = java.lang.Long.valueOf(r42)     // Catch:{ all -> 0x0811 }
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x0811 }
            java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0811 }
            r5[r0] = r6     // Catch:{ all -> 0x0811 }
            r0 = 29504(0x7340, float:4.1344E-41)
            java.lang.String r6 = "Bad change count. Expecting %d, got %d"
            java.lang.String r5 = java.lang.String.format(r6, r5)     // Catch:{ all -> 0x0811 }
            r4.<init>(r0, r5)     // Catch:{ all -> 0x0811 }
            throw r4     // Catch:{ all -> 0x0811 }
        L_0x00dd:
            long r6 = r3.d     // Catch:{ all -> 0x0811 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0811 }
            r14.<init>()     // Catch:{ all -> 0x0811 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0811 }
            r14.put(r11, r15)     // Catch:{ all -> 0x0811 }
            java.lang.Long r15 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0811 }
            r14.put(r13, r15)     // Catch:{ all -> 0x0811 }
            r15 = 5
            r1 = 0
            r2.insertWithOnConflict(r10, r1, r14, r15)     // Catch:{ all -> 0x080d }
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x080d }
            r14 = 0
            r1[r14] = r13     // Catch:{ all -> 0x080d }
            java.lang.String r20 = "LastFetch"
            java.lang.String r22 = "key = 0"
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r19 = r2
            r21 = r1
            android.database.Cursor r1 = r19.query(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x080d }
            boolean r14 = r1.moveToFirst()     // Catch:{ all -> 0x07f8 }
            r27 = 0
            if (r14 == 0) goto L_0x0129
            r14 = 0
            long r19 = r1.getLong(r14)     // Catch:{ all -> 0x0120 }
            r29 = r19
            goto L_0x012b
        L_0x0120:
            r0 = move-exception
            r4 = r40
            r6 = r0
            r5 = r3
            r3 = r49
            goto L_0x07ff
        L_0x0129:
            r29 = r27
        L_0x012b:
            if (r1 != 0) goto L_0x012e
            goto L_0x0131
        L_0x012e:
            r1.close()     // Catch:{ all -> 0x080d }
        L_0x0131:
            int r1 = (r29 > r6 ? 1 : (r29 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0190
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x080d }
            r6 = 0
            r1[r6] = r13     // Catch:{ all -> 0x080d }
            java.lang.String r20 = "LastFetch"
            java.lang.String r22 = "key = 2"
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r19 = r2
            r21 = r1
            android.database.Cursor r1 = r19.query(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x080d }
            boolean r6 = r1.moveToFirst()     // Catch:{ all -> 0x0182 }
            if (r6 == 0) goto L_0x015a
            r6 = 0
            long r19 = r1.getLong(r6)     // Catch:{ all -> 0x0182 }
            goto L_0x015c
        L_0x015a:
            r19 = r27
        L_0x015c:
            if (r1 != 0) goto L_0x015f
            goto L_0x0162
        L_0x015f:
            r1.close()     // Catch:{ all -> 0x080d }
        L_0x0162:
            int r1 = (r19 > r29 ? 1 : (r19 == r29 ? 0 : -1))
            if (r1 == 0) goto L_0x0180
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x080d }
            r1.<init>()     // Catch:{ all -> 0x080d }
            r6 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x080d }
            r1.put(r11, r7)     // Catch:{ all -> 0x080d }
            java.lang.Long r6 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x080d }
            r1.put(r13, r6)     // Catch:{ all -> 0x080d }
            r7 = 0
            r2.insertWithOnConflict(r10, r7, r1, r15)     // Catch:{ all -> 0x080d }
            r1 = r6
            goto L_0x0191
        L_0x0180:
            r1 = 0
            goto L_0x0191
        L_0x0182:
            r0 = move-exception
            r4 = r0
            if (r1 == 0) goto L_0x018f
            r1.close()     // Catch:{ all -> 0x018a }
            goto L_0x018f
        L_0x018a:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x080d }
        L_0x018f:
            throw r4     // Catch:{ all -> 0x080d }
        L_0x0190:
            r1 = 0
        L_0x0191:
            boolean r6 = defpackage.azaf.k()     // Catch:{ all -> 0x080d }
            java.lang.String r7 = "user"
            if (r6 != 0) goto L_0x0296
            auay r6 = r3.b     // Catch:{ all -> 0x080d }
            int r6 = r6.a()     // Catch:{ all -> 0x080d }
            if (r6 != 0) goto L_0x01a8
            r43 = r1
            r30 = r8
            r0 = 0
            goto L_0x029b
        L_0x01a8:
            java.lang.String r6 = "ALL_USERS"
            if (r50 != 0) goto L_0x01b3
            java.lang.Object r10 = defpackage.anbs.b(r46)     // Catch:{ all -> 0x080d }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x080d }
            goto L_0x01b4
        L_0x01b3:
            r10 = r6
        L_0x01b4:
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x080d }
            r11.<init>()     // Catch:{ all -> 0x080d }
            r11.put(r7, r10)     // Catch:{ all -> 0x080d }
            auay r13 = r3.b     // Catch:{ all -> 0x080d }
            byte[] r13 = r13.k()     // Catch:{ all -> 0x080d }
            r11.put(r12, r13)     // Catch:{ all -> 0x080d }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ all -> 0x080d }
            r13.<init>()     // Catch:{ all -> 0x080d }
            r14 = 2
            java.lang.String[] r15 = new java.lang.String[r14]     // Catch:{ all -> 0x080d }
            r14 = 0
            r15[r14] = r7     // Catch:{ all -> 0x080d }
            r15[r0] = r12     // Catch:{ all -> 0x080d }
            java.lang.String r20 = "RequestTags"
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r19 = r2
            r21 = r15
            android.database.Cursor r14 = r19.query(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x080d }
        L_0x01e6:
            boolean r15 = r14.moveToNext()     // Catch:{ all -> 0x0288 }
            if (r15 == 0) goto L_0x01ff
            r15 = 0
            java.lang.String r0 = r14.getString(r15)     // Catch:{ all -> 0x0288 }
            r43 = r1
            r15 = 1
            byte[] r1 = r14.getBlob(r15)     // Catch:{ all -> 0x0288 }
            r13.put(r0, r1)     // Catch:{ all -> 0x0288 }
            r1 = r43
            r0 = 1
            goto L_0x01e6
        L_0x01ff:
            r43 = r1
            boolean r0 = r13.containsKey(r10)     // Catch:{ all -> 0x0288 }
            java.lang.String r1 = "user = ?"
            java.lang.String r15 = "RequestTags"
            if (r0 == 0) goto L_0x0232
            java.lang.Object r0 = r13.get(r10)     // Catch:{ all -> 0x0288 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0288 }
            r30 = r8
            auay r8 = r3.b     // Catch:{ all -> 0x0288 }
            byte[] r8 = r8.k()     // Catch:{ all -> 0x0288 }
            boolean r0 = java.util.Arrays.equals(r0, r8)     // Catch:{ all -> 0x0288 }
            if (r0 != 0) goto L_0x022a
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0288 }
            r17 = 0
            r8[r17] = r10     // Catch:{ all -> 0x0288 }
            r2.update(r15, r11, r1, r8)     // Catch:{ all -> 0x0288 }
            goto L_0x0238
        L_0x022a:
            if (r14 == 0) goto L_0x022f
            r14.close()     // Catch:{ all -> 0x080d }
        L_0x022f:
            r0 = 0
            goto L_0x029b
        L_0x0232:
            r30 = r8
            r8 = 0
            r2.insert(r15, r8, r11)     // Catch:{ all -> 0x0288 }
        L_0x0238:
            boolean r0 = r6.equals(r10)     // Catch:{ all -> 0x0288 }
            if (r0 != 0) goto L_0x0249
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0288 }
            r10 = 0
            r8[r10] = r6     // Catch:{ all -> 0x0288 }
            r2.delete(r15, r1, r8)     // Catch:{ all -> 0x0288 }
            goto L_0x0281
        L_0x0249:
            java.util.Iterator r0 = r46.iterator()     // Catch:{ all -> 0x0288 }
        L_0x024d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0288 }
            if (r1 == 0) goto L_0x0281
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0288 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0288 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0288 }
            r6.<init>()     // Catch:{ all -> 0x0288 }
            r6.put(r7, r1)     // Catch:{ all -> 0x0288 }
            byte[] r8 = defpackage.yfv.a     // Catch:{ all -> 0x0288 }
            r6.put(r12, r8)     // Catch:{ all -> 0x0288 }
            boolean r8 = r13.containsKey(r1)     // Catch:{ all -> 0x0288 }
            if (r8 == 0) goto L_0x027a
            java.lang.Object r1 = r13.get(r1)     // Catch:{ all -> 0x0288 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x0288 }
            byte[] r8 = defpackage.yfv.a     // Catch:{ all -> 0x0288 }
            boolean r1 = java.util.Arrays.equals(r1, r8)     // Catch:{ all -> 0x0288 }
            if (r1 != 0) goto L_0x024d
        L_0x027a:
            r1 = 5
            r8 = 0
            r2.insertWithOnConflict(r15, r8, r6, r1)     // Catch:{ all -> 0x0288 }
            goto L_0x024d
        L_0x0281:
            if (r14 == 0) goto L_0x0286
            r14.close()     // Catch:{ all -> 0x080d }
        L_0x0286:
            r0 = 1
            goto L_0x029b
        L_0x0288:
            r0 = move-exception
            r1 = r0
            if (r14 == 0) goto L_0x0295
            r14.close()     // Catch:{ all -> 0x0290 }
            goto L_0x0295
        L_0x0290:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r4)     // Catch:{ all -> 0x080d }
        L_0x0295:
            throw r1     // Catch:{ all -> 0x080d }
        L_0x0296:
            r43 = r1
            r30 = r8
            r0 = 0
        L_0x029b:
            aucx r1 = r3.a     // Catch:{ all -> 0x080d }
            int r1 = r1.size()     // Catch:{ all -> 0x080d }
            if (r1 <= 0) goto L_0x02a5
            r0 = 1
            goto L_0x02aa
        L_0x02a5:
            if (r0 != 0) goto L_0x02a9
            r0 = 0
            goto L_0x02aa
        L_0x02a9:
            r0 = 1
        L_0x02aa:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x080d }
            r1.<init>()     // Catch:{ all -> 0x080d }
            java.lang.String r6 = "packageName = ? AND version = ? AND user = ? AND isCommitted = 0"
            java.lang.String r8 = "flagsHash"
            java.lang.String r10 = "ExperimentTokens"
            if (r0 == 0) goto L_0x06a5
            java.lang.String r0 = "INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            android.database.sqlite.SQLiteStatement r12 = r2.compileStatement(r0)     // Catch:{ all -> 0x069e }
            java.lang.String r0 = "__sync"
            long r13 = defpackage.yfm.b(r2, r0)     // Catch:{ all -> 0x068e }
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x068e }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ all -> 0x068e }
            r13.<init>()     // Catch:{ all -> 0x068e }
            aucx r14 = r3.a     // Catch:{ all -> 0x068e }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x068e }
        L_0x02d2:
            boolean r15 = r14.hasNext()     // Catch:{ all -> 0x068e }
            if (r15 == 0) goto L_0x0667
            java.lang.Object r15 = r14.next()     // Catch:{ all -> 0x068e }
            apfc r15 = (defpackage.apfc) r15     // Catch:{ all -> 0x068e }
            apfy r11 = r15.b     // Catch:{ all -> 0x068e }
            if (r11 == 0) goto L_0x02e3
            goto L_0x02e5
        L_0x02e3:
            apfy r11 = defpackage.apfy.e     // Catch:{ all -> 0x068e }
        L_0x02e5:
            java.lang.String r11 = r11.b     // Catch:{ all -> 0x068e }
            r48 = r0
            apfy r0 = r15.b     // Catch:{ all -> 0x068e }
            if (r0 == 0) goto L_0x02ee
            goto L_0x02f0
        L_0x02ee:
            apfy r0 = defpackage.apfy.e     // Catch:{ all -> 0x068e }
        L_0x02f0:
            r31 = r1
            long r0 = r0.c     // Catch:{ all -> 0x068e }
            boolean r19 = defpackage.ayyd.b()     // Catch:{ all -> 0x068e }
            if (r19 == 0) goto L_0x0312
            boolean r19 = defpackage.azaf.d()     // Catch:{ all -> 0x030c }
            if (r19 == 0) goto L_0x0312
            r32 = r14
            apfg r14 = r15.h     // Catch:{ all -> 0x030c }
            if (r14 != 0) goto L_0x0308
            apfg r14 = defpackage.apfg.b     // Catch:{ all -> 0x030c }
        L_0x0308:
            defpackage.yfu.a(r2, r11, r14)     // Catch:{ all -> 0x030c }
            goto L_0x0314
        L_0x030c:
            r0 = move-exception
            r1 = r0
            r34 = r12
            goto L_0x0692
        L_0x0312:
            r32 = r14
        L_0x0314:
            apfy r14 = r15.b     // Catch:{ all -> 0x068e }
            if (r14 == 0) goto L_0x0319
            goto L_0x031b
        L_0x0319:
            apfy r14 = defpackage.apfy.e     // Catch:{ all -> 0x068e }
        L_0x031b:
            java.lang.String r14 = a((java.util.List) r4, (java.util.LinkedHashMap) r5, (defpackage.apfy) r14)     // Catch:{ all -> 0x068e }
            r13.add(r14)     // Catch:{ all -> 0x068e }
            boolean r19 = defpackage.azaf.d()     // Catch:{ all -> 0x068e }
            r33 = r13
            java.lang.String r13 = ""
            if (r19 == 0) goto L_0x0374
            boolean r19 = defpackage.ayyd.b()     // Catch:{ all -> 0x030c }
            if (r19 != 0) goto L_0x0333
            goto L_0x0374
        L_0x0333:
            if (r50 == 0) goto L_0x0374
            apfg r4 = r15.h     // Catch:{ all -> 0x030c }
            if (r4 == 0) goto L_0x033a
            goto L_0x033c
        L_0x033a:
            apfg r4 = defpackage.apfg.b     // Catch:{ all -> 0x030c }
        L_0x033c:
            int r4 = r4.a     // Catch:{ all -> 0x030c }
            int r4 = defpackage.apff.a(r4)     // Catch:{ all -> 0x030c }
            if (r4 != 0) goto L_0x0345
            goto L_0x036f
        L_0x0345:
            r5 = 3
            if (r4 != r5) goto L_0x036f
            boolean r4 = r14.equals(r13)     // Catch:{ all -> 0x030c }
            if (r4 == 0) goto L_0x036d
            java.util.Iterator r4 = r46.iterator()     // Catch:{ all -> 0x030c }
            r5 = 0
        L_0x0353:
            boolean r19 = r4.hasNext()     // Catch:{ all -> 0x030c }
            if (r19 == 0) goto L_0x036b
            java.lang.Object r19 = r4.next()     // Catch:{ all -> 0x030c }
            r20 = r4
            r4 = r19
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x030c }
            boolean r4 = a((java.lang.String) r4, (android.database.sqlite.SQLiteDatabase) r2, (android.database.sqlite.SQLiteStatement) r12, (defpackage.apfc) r15)     // Catch:{ all -> 0x030c }
            r5 = r5 | r4
            r4 = r20
            goto L_0x0353
        L_0x036b:
            r4 = r5
            goto L_0x0378
        L_0x036d:
            r4 = 0
            goto L_0x0378
        L_0x036f:
            boolean r4 = a((java.lang.String) r14, (android.database.sqlite.SQLiteDatabase) r2, (android.database.sqlite.SQLiteStatement) r12, (defpackage.apfc) r15)     // Catch:{ all -> 0x030c }
            goto L_0x0378
        L_0x0374:
            boolean r4 = a((java.lang.String) r14, (android.database.sqlite.SQLiteDatabase) r2, (android.database.sqlite.SQLiteStatement) r12, (defpackage.apfc) r15)     // Catch:{ all -> 0x068e }
        L_0x0378:
            boolean r5 = defpackage.azaf.c()     // Catch:{ all -> 0x068e }
            if (r5 == 0) goto L_0x03a9
            r24 = 0
            r19 = r2
            r20 = r11
            r21 = r0
            r23 = r14
            android.database.Cursor r5 = defpackage.yfe.a((android.database.sqlite.SQLiteDatabase) r19, (java.lang.String) r20, (long) r21, (java.lang.String) r23, (boolean) r24)     // Catch:{ all -> 0x030c }
            int r19 = defpackage.yfe.a(r5)     // Catch:{ all -> 0x039b }
            if (r5 != 0) goto L_0x0393
            goto L_0x0396
        L_0x0393:
            r5.close()     // Catch:{ all -> 0x030c }
        L_0x0396:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x030c }
            goto L_0x03aa
        L_0x039b:
            r0 = move-exception
            r1 = r0
            if (r5 == 0) goto L_0x03a8
            r5.close()     // Catch:{ all -> 0x03a3 }
            goto L_0x03a8
        L_0x03a3:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r4)     // Catch:{ all -> 0x030c }
        L_0x03a8:
            throw r1     // Catch:{ all -> 0x030c }
        L_0x03a9:
            r5 = 0
        L_0x03aa:
            r34 = r12
            r35 = r13
            long r12 = r3.d     // Catch:{ all -> 0x068c }
            azaf r19 = defpackage.azaf.a     // Catch:{ all -> 0x068c }
            azag r19 = r19.a()     // Catch:{ all -> 0x068c }
            boolean r36 = r19.j()     // Catch:{ all -> 0x068c }
            int r3 = r15.a     // Catch:{ all -> 0x068c }
            r3 = r3 & 8
            if (r3 == 0) goto L_0x03d0
            auay r3 = r15.g     // Catch:{ all -> 0x068c }
            byte[] r3 = r3.k()     // Catch:{ all -> 0x068c }
            int r3 = r3.length     // Catch:{ all -> 0x068c }
            if (r3 <= 0) goto L_0x03d0
            auay r3 = r15.g     // Catch:{ all -> 0x068c }
            byte[] r3 = r3.k()     // Catch:{ all -> 0x068c }
            goto L_0x03d1
        L_0x03d0:
            r3 = 0
        L_0x03d1:
            if (r36 != 0) goto L_0x03dc
            r37 = r4
            int r4 = r15.a     // Catch:{ all -> 0x068c }
            r4 = r4 & 8
            if (r4 != 0) goto L_0x0416
            goto L_0x03e0
        L_0x03dc:
            r37 = r4
            if (r3 != 0) goto L_0x0416
        L_0x03e0:
            boolean r0 = defpackage.azaf.m()     // Catch:{ all -> 0x068c }
            if (r0 != 0) goto L_0x03fc
            apfy r0 = r15.b     // Catch:{ all -> 0x068c }
            if (r0 != 0) goto L_0x03ec
            apfy r0 = defpackage.apfy.e     // Catch:{ all -> 0x068c }
        L_0x03ec:
            a((android.database.sqlite.SQLiteDatabase) r2, (defpackage.apfy) r0, (java.lang.String) r14, (long) r12)     // Catch:{ all -> 0x068c }
            r25 = r7
            r39 = r9
            r4 = r18
            r9 = 0
            r18 = r6
            r6 = r30
            goto L_0x061a
        L_0x03fc:
            r19 = r2
            r20 = r15
            r21 = r14
            r22 = r12
            r24 = r5
            a((android.database.sqlite.SQLiteDatabase) r19, (defpackage.apfc) r20, (java.lang.String) r21, (long) r22, (java.lang.Integer) r24)     // Catch:{ all -> 0x068c }
            r25 = r7
            r39 = r9
            r4 = r18
            r9 = 0
            r18 = r6
            r6 = r30
            goto L_0x061a
        L_0x0416:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x068c }
            r38 = r8
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x068c }
            r8.<init>()     // Catch:{ all -> 0x068c }
            r8.add(r9)     // Catch:{ all -> 0x068c }
            r39 = r9
            r9 = r30
            r8.add(r9)     // Catch:{ all -> 0x068c }
            r30 = r9
            java.lang.String r9 = "configHash"
            r8.add(r9)     // Catch:{ all -> 0x068c }
            java.lang.String r9 = "tokensTag"
            r8.add(r9)     // Catch:{ all -> 0x068c }
            int r9 = r8.size()     // Catch:{ all -> 0x068c }
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x068c }
            java.lang.Object[] r8 = r8.toArray(r9)     // Catch:{ all -> 0x068c }
            r21 = r8
            java.lang.String[] r21 = (java.lang.String[]) r21     // Catch:{ all -> 0x068c }
            r8 = 3
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x068c }
            r8 = 0
            r9[r8] = r11     // Catch:{ all -> 0x068c }
            java.lang.String r8 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x068c }
            r19 = 1
            r9[r19] = r8     // Catch:{ all -> 0x068c }
            r8 = 2
            r9[r8] = r14     // Catch:{ all -> 0x068c }
            java.lang.String r20 = "ExperimentTokens"
            java.lang.String r22 = "packageName = ? AND version = ? AND user = ? AND isCommitted = 0"
            r24 = 0
            r25 = 0
            r26 = 0
            r19 = r2
            r23 = r9
            android.database.Cursor r8 = r19.query(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x068c }
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0659 }
            if (r9 == 0) goto L_0x04b5
            auay r9 = r15.d     // Catch:{ all -> 0x0659 }
            byte[] r9 = r9.k()     // Catch:{ all -> 0x0659 }
            r19 = r4
            r25 = r7
            r7 = 0
            byte[] r4 = r8.getBlob(r7)     // Catch:{ all -> 0x0659 }
            boolean r4 = java.util.Arrays.equals(r9, r4)     // Catch:{ all -> 0x0659 }
            if (r4 == 0) goto L_0x04ad
            java.lang.String r4 = r15.e     // Catch:{ all -> 0x0659 }
            r7 = 1
            java.lang.String r9 = r8.getString(r7)     // Catch:{ all -> 0x0659 }
            if (r4 == 0) goto L_0x0492
            if (r9 == 0) goto L_0x048f
            goto L_0x0496
        L_0x048f:
            r9 = r35
            goto L_0x0496
        L_0x0492:
            if (r9 == 0) goto L_0x049e
            r4 = r35
        L_0x0496:
            boolean r4 = r4.equals(r9)     // Catch:{ all -> 0x0659 }
            if (r4 != 0) goto L_0x049e
            r4 = 1
            goto L_0x04ae
        L_0x049e:
            if (r36 == 0) goto L_0x04ab
            r4 = 3
            byte[] r7 = r8.getBlob(r4)     // Catch:{ all -> 0x0659 }
            boolean r4 = java.util.Arrays.equals(r7, r3)     // Catch:{ all -> 0x0659 }
            if (r4 == 0) goto L_0x04ad
        L_0x04ab:
            r4 = 0
            goto L_0x04ae
        L_0x04ad:
            r4 = 1
        L_0x04ae:
            r7 = 2
            int r9 = r8.getInt(r7)     // Catch:{ all -> 0x0659 }
            goto L_0x04bb
        L_0x04b5:
            r19 = r4
            r25 = r7
            r4 = 1
            r9 = 0
        L_0x04bb:
            if (r8 == 0) goto L_0x04c0
            r8.close()     // Catch:{ all -> 0x068c }
        L_0x04c0:
            if (r36 != 0) goto L_0x04c3
            goto L_0x04f9
        L_0x04c3:
            if (r4 != 0) goto L_0x04f9
            boolean r0 = defpackage.azaf.m()     // Catch:{ all -> 0x068c }
            if (r0 != 0) goto L_0x04e1
            apfy r0 = r15.b     // Catch:{ all -> 0x068c }
            if (r0 != 0) goto L_0x04d2
            apfy r0 = defpackage.apfy.e     // Catch:{ all -> 0x068c }
            goto L_0x04d3
        L_0x04d2:
        L_0x04d3:
            a((android.database.sqlite.SQLiteDatabase) r2, (defpackage.apfy) r0, (java.lang.String) r14, (long) r12)     // Catch:{ all -> 0x068c }
            r4 = r18
            r8 = r38
            r9 = 0
            r18 = r6
            r6 = r30
            goto L_0x061a
        L_0x04e1:
            r19 = r2
            r20 = r15
            r21 = r14
            r22 = r12
            r24 = r5
            a((android.database.sqlite.SQLiteDatabase) r19, (defpackage.apfc) r20, (java.lang.String) r21, (long) r22, (java.lang.Integer) r24)     // Catch:{ all -> 0x068c }
            r4 = r18
            r8 = r38
            r9 = 0
            r18 = r6
            r6 = r30
            goto L_0x061a
        L_0x04f9:
            r7 = 3
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x068c }
            r7 = 0
            r8[r7] = r11     // Catch:{ all -> 0x068c }
            java.lang.String r7 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x068c }
            r20 = 1
            r8[r20] = r7     // Catch:{ all -> 0x068c }
            r7 = 2
            r8[r7] = r14     // Catch:{ all -> 0x068c }
            r2.delete(r10, r6, r8)     // Catch:{ all -> 0x068c }
            aucx r7 = r15.c     // Catch:{ all -> 0x068c }
            int r7 = r7.size()     // Catch:{ all -> 0x068c }
            if (r7 <= 0) goto L_0x051a
            int r9 = a((defpackage.apfc) r15)     // Catch:{ all -> 0x068c }
            goto L_0x051b
        L_0x051a:
        L_0x051b:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x068c }
            r7.<init>()     // Catch:{ all -> 0x068c }
            java.lang.String r8 = "packageName"
            r7.put(r8, r11)     // Catch:{ all -> 0x068c }
            java.lang.String r8 = "version"
            r20 = r4
            r4 = r19
            r7.put(r8, r4)     // Catch:{ all -> 0x068c }
            r4 = r25
            r7.put(r4, r14)     // Catch:{ all -> 0x068c }
            java.lang.String r8 = "isCommitted"
            r25 = r4
            r4 = r18
            r7.put(r8, r4)     // Catch:{ all -> 0x068c }
            auay r8 = r15.d     // Catch:{ all -> 0x068c }
            byte[] r8 = r8.k()     // Catch:{ all -> 0x068c }
            r18 = r6
            r6 = r39
            r7.put(r6, r8)     // Catch:{ all -> 0x068c }
            java.lang.String r8 = r15.e     // Catch:{ all -> 0x068c }
            r39 = r6
            r6 = r30
            r7.put(r6, r8)     // Catch:{ all -> 0x068c }
            java.lang.String r8 = "configHash"
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x068c }
            r7.put(r8, r9)     // Catch:{ all -> 0x068c }
            java.lang.String r8 = "servingVersion"
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x068c }
            r7.put(r8, r9)     // Catch:{ all -> 0x068c }
            java.lang.String r8 = "tokensTag"
            r7.put(r8, r3)     // Catch:{ all -> 0x068c }
            r8 = r38
            r7.put(r8, r5)     // Catch:{ all -> 0x068c }
            if (r36 == 0) goto L_0x0571
            goto L_0x0578
        L_0x0571:
            if (r3 == 0) goto L_0x0576
            r20 = 1
            goto L_0x0578
        L_0x0576:
            r20 = 0
        L_0x0578:
            r3 = 0
            r2.insert(r10, r3, r7)     // Catch:{ all -> 0x068c }
            if (r20 == 0) goto L_0x0619
            apfy r3 = r15.b     // Catch:{ all -> 0x068c }
            if (r3 == 0) goto L_0x0584
            goto L_0x0586
        L_0x0584:
            apfy r3 = defpackage.apfy.e     // Catch:{ all -> 0x068c }
        L_0x0586:
            r5 = 3
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ all -> 0x068c }
            r5 = 0
            r7[r5] = r14     // Catch:{ all -> 0x068c }
            java.lang.String r5 = r3.b     // Catch:{ all -> 0x068c }
            r9 = 1
            r7[r9] = r5     // Catch:{ all -> 0x068c }
            long r12 = r3.c     // Catch:{ all -> 0x068c }
            java.lang.String r3 = java.lang.Long.toString(r12)     // Catch:{ all -> 0x068c }
            r5 = 2
            r7[r5] = r3     // Catch:{ all -> 0x068c }
            java.lang.String r3 = "CrossLoggedExperimentTokens"
            java.lang.String r5 = "fromUser = ? AND toPackageName = ? AND toVersion = ? AND isCommitted != 1"
            r2.delete(r3, r5, r7)     // Catch:{ all -> 0x068c }
            aucx r3 = r15.f     // Catch:{ all -> 0x068c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x068c }
        L_0x05a7:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x068c }
            if (r5 == 0) goto L_0x0617
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x068c }
            apfj r5 = (defpackage.apfj) r5     // Catch:{ all -> 0x068c }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x068c }
            r7.<init>()     // Catch:{ all -> 0x068c }
            java.lang.String r9 = "fromPackageName"
            apfy r12 = r5.a     // Catch:{ all -> 0x068c }
            if (r12 == 0) goto L_0x05bf
            goto L_0x05c1
        L_0x05bf:
            apfy r12 = defpackage.apfy.e     // Catch:{ all -> 0x068c }
        L_0x05c1:
            java.lang.String r12 = r12.b     // Catch:{ all -> 0x068c }
            r7.put(r9, r12)     // Catch:{ all -> 0x068c }
            java.lang.String r9 = "fromVersion"
            apfy r12 = r5.a     // Catch:{ all -> 0x068c }
            if (r12 == 0) goto L_0x05cd
            goto L_0x05cf
        L_0x05cd:
            apfy r12 = defpackage.apfy.e     // Catch:{ all -> 0x068c }
        L_0x05cf:
            long r12 = r12.c     // Catch:{ all -> 0x068c }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x068c }
            r7.put(r9, r12)     // Catch:{ all -> 0x068c }
            java.lang.String r9 = "fromUser"
            r7.put(r9, r14)     // Catch:{ all -> 0x068c }
            java.lang.String r9 = "toPackageName"
            r7.put(r9, r11)     // Catch:{ all -> 0x068c }
            java.lang.String r9 = "toVersion"
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x068c }
            r7.put(r9, r12)     // Catch:{ all -> 0x068c }
            java.lang.String r9 = "isCommitted"
            r7.put(r9, r4)     // Catch:{ all -> 0x068c }
            java.lang.String r9 = "token"
            auay r12 = r5.b     // Catch:{ all -> 0x068c }
            byte[] r12 = r12.k()     // Catch:{ all -> 0x068c }
            r7.put(r9, r12)     // Catch:{ all -> 0x068c }
            java.lang.String r9 = "provenance"
            int r5 = r5.c     // Catch:{ all -> 0x068c }
            int r15 = defpackage.apfi.a(r5)     // Catch:{ all -> 0x068c }
            if (r15 == 0) goto L_0x0606
            goto L_0x0607
        L_0x0606:
            r15 = 1
        L_0x0607:
            int r15 = r15 + -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x068c }
            r7.put(r9, r5)     // Catch:{ all -> 0x068c }
            java.lang.String r5 = "CrossLoggedExperimentTokens"
            r9 = 0
            r2.insert(r5, r9, r7)     // Catch:{ all -> 0x068c }
            goto L_0x05a7
        L_0x0617:
            r9 = 0
            goto L_0x061c
        L_0x0619:
            r9 = 0
        L_0x061a:
            if (r37 == 0) goto L_0x063c
        L_0x061c:
            r0 = r31
            r0.add(r11)     // Catch:{ all -> 0x068c }
            r3 = r45
            r5 = r47
            r1 = r0
            r30 = r6
            r6 = r18
            r7 = r25
            r14 = r32
            r13 = r33
            r12 = r34
            r9 = r39
            r0 = r48
            r18 = r4
            r4 = r46
            goto L_0x02d2
        L_0x063c:
            r0 = r31
            r3 = r45
            r5 = r47
            r1 = r0
            r30 = r6
            r6 = r18
            r7 = r25
            r14 = r32
            r13 = r33
            r12 = r34
            r9 = r39
            r0 = r48
            r18 = r4
            r4 = r46
            goto L_0x02d2
        L_0x0659:
            r0 = move-exception
            r1 = r0
            if (r8 == 0) goto L_0x0666
            r8.close()     // Catch:{ all -> 0x0661 }
            goto L_0x0666
        L_0x0661:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r3)     // Catch:{ all -> 0x068c }
        L_0x0666:
            throw r1     // Catch:{ all -> 0x068c }
        L_0x0667:
            r48 = r0
            r0 = r1
            r18 = r6
            r34 = r12
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x068c }
        L_0x0672:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x068c }
            if (r3 == 0) goto L_0x0682
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x068c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x068c }
            defpackage.yfm.b(r2, r3)     // Catch:{ all -> 0x068c }
            goto L_0x0672
        L_0x0682:
            if (r34 == 0) goto L_0x0688
            r34.close()     // Catch:{ all -> 0x069e }
            goto L_0x0689
        L_0x0688:
        L_0x0689:
            r15 = r48
            goto L_0x06aa
        L_0x068c:
            r0 = move-exception
            goto L_0x0691
        L_0x068e:
            r0 = move-exception
            r34 = r12
        L_0x0691:
            r1 = r0
        L_0x0692:
            if (r34 == 0) goto L_0x069d
            r34.close()     // Catch:{ all -> 0x0698 }
            goto L_0x069d
        L_0x0698:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r3)     // Catch:{ all -> 0x069e }
        L_0x069d:
            throw r1     // Catch:{ all -> 0x069e }
        L_0x069e:
            r0 = move-exception
            r4 = r40
            r5 = r45
            goto L_0x0814
        L_0x06a5:
            r0 = r1
            r18 = r6
            r9 = 0
            r15 = r9
        L_0x06aa:
            r1 = r44
            if (r1 == 0) goto L_0x079d
            aucx r3 = r1.c     // Catch:{ all -> 0x0799 }
            int r3 = r3.size()     // Catch:{ all -> 0x0799 }
            if (r3 > 0) goto L_0x06ba
            r5 = r45
            goto L_0x079f
        L_0x06ba:
            java.util.Set r3 = a((defpackage.apfo) r44, (defpackage.apfp) r45)     // Catch:{ all -> 0x0799 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0799 }
        L_0x06c2:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0799 }
            if (r4 != 0) goto L_0x0719
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0799 }
            r3.<init>()     // Catch:{ all -> 0x0799 }
            aucx r1 = r1.c     // Catch:{ all -> 0x0799 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0799 }
        L_0x06d3:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0799 }
            if (r4 == 0) goto L_0x0703
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0799 }
            apfb r4 = (defpackage.apfb) r4     // Catch:{ all -> 0x0799 }
            apfy r4 = r4.b     // Catch:{ all -> 0x0799 }
            if (r4 == 0) goto L_0x06e4
            goto L_0x06e6
        L_0x06e4:
            apfy r4 = defpackage.apfy.e     // Catch:{ all -> 0x0799 }
        L_0x06e6:
            r5 = r45
            aucs r6 = r5.e     // Catch:{ all -> 0x07f4 }
            apfk r7 = r4.d     // Catch:{ all -> 0x07f4 }
            if (r7 == 0) goto L_0x06ef
            goto L_0x06f1
        L_0x06ef:
            apfk r7 = defpackage.apfk.c     // Catch:{ all -> 0x07f4 }
        L_0x06f1:
            int r7 = r7.b     // Catch:{ all -> 0x07f4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x07f4 }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x07f4 }
            if (r6 != 0) goto L_0x06d3
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x07f4 }
            r3.add(r4)     // Catch:{ all -> 0x07f4 }
            goto L_0x06d3
        L_0x0703:
            r5 = r45
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x07f4 }
        L_0x0709:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x07f4 }
            if (r3 == 0) goto L_0x079f
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x07f4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x07f4 }
            defpackage.yfu.a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r3)     // Catch:{ all -> 0x07f4 }
            goto L_0x0709
        L_0x0719:
            r5 = r45
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x07f4 }
            apfy r4 = (defpackage.apfy) r4     // Catch:{ all -> 0x07f4 }
            aucs r6 = r5.e     // Catch:{ all -> 0x07f4 }
            apfk r7 = r4.d     // Catch:{ all -> 0x07f4 }
            if (r7 == 0) goto L_0x0728
            goto L_0x072a
        L_0x0728:
            apfk r7 = defpackage.apfk.c     // Catch:{ all -> 0x07f4 }
        L_0x072a:
            int r7 = r7.b     // Catch:{ all -> 0x07f4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x07f4 }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x07f4 }
            if (r6 != 0) goto L_0x078d
            r6 = r46
            r7 = r47
            java.lang.String r9 = a((java.util.List) r6, (java.util.LinkedHashMap) r7, (defpackage.apfy) r4)     // Catch:{ all -> 0x07f4 }
            long r11 = r5.d     // Catch:{ all -> 0x07f4 }
            a((android.database.sqlite.SQLiteDatabase) r2, (defpackage.apfy) r4, (java.lang.String) r9, (long) r11)     // Catch:{ all -> 0x07f4 }
            boolean r11 = defpackage.azaf.c()     // Catch:{ all -> 0x07f4 }
            if (r11 != 0) goto L_0x0785
            azaf r11 = defpackage.azaf.a     // Catch:{ all -> 0x07f4 }
            azag r11 = r11.a()     // Catch:{ all -> 0x07f4 }
            boolean r11 = r11.b()     // Catch:{ all -> 0x07f4 }
            if (r11 == 0) goto L_0x077d
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x07f4 }
            r11.<init>()     // Catch:{ all -> 0x07f4 }
            r11.putNull(r8)     // Catch:{ all -> 0x07f4 }
            r12 = 3
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ all -> 0x07f4 }
            java.lang.String r14 = r4.b     // Catch:{ all -> 0x07f4 }
            r16 = 0
            r13[r16] = r14     // Catch:{ all -> 0x07f4 }
            r14 = r13
            long r12 = r4.c     // Catch:{ all -> 0x07f4 }
            java.lang.String r4 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x07f4 }
            r12 = 1
            r14[r12] = r4     // Catch:{ all -> 0x07f4 }
            r4 = 2
            r14[r4] = r9     // Catch:{ all -> 0x07f4 }
            r9 = r14
            r13 = r18
            r2.update(r10, r11, r13, r9)     // Catch:{ all -> 0x07f4 }
            r18 = r13
            goto L_0x06c2
        L_0x077d:
            r13 = r18
            r4 = 2
            r12 = 1
            r16 = 0
            goto L_0x06c2
        L_0x0785:
            r13 = r18
            r4 = 2
            r12 = 1
            r16 = 0
            goto L_0x06c2
        L_0x078d:
            r6 = r46
            r7 = r47
            r13 = r18
            r4 = 2
            r12 = 1
            r16 = 0
            goto L_0x06c2
        L_0x0799:
            r0 = move-exception
            r5 = r45
            goto L_0x07f5
        L_0x079d:
            r5 = r45
        L_0x079f:
            r1 = r41
            r1.addAll(r0)     // Catch:{ all -> 0x07f4 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x07f4 }
            r3 = r49
            if (r3 == 0) goto L_0x07bb
            aucs r0 = r5.e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x07bb
            aucs r0 = r5.e
            int r0 = r0.size()
            r3.g = r0
        L_0x07bb:
            r2.endTransaction()
            defpackage.yfh.a()
            if (r43 == 0) goto L_0x07d6
            boolean r0 = defpackage.azac.b()
            if (r0 == 0) goto L_0x07d3
            long r0 = r43.longValue()
            r4 = r40
            r4.a((long) r0)
            goto L_0x07d8
        L_0x07d3:
            r4 = r40
            goto L_0x07d8
        L_0x07d6:
            r4 = r40
        L_0x07d8:
            if (r15 == 0) goto L_0x07f0
            long r0 = r15.longValue()
            ayzv r2 = defpackage.ayzv.a
            ayzw r2 = r2.a()
            long r2 = r2.r()
            long r0 = r0 % r2
            int r2 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r2 != 0) goto L_0x07f0
            r40.f()
        L_0x07f0:
            r40.g()
            return
        L_0x07f4:
            r0 = move-exception
        L_0x07f5:
            r4 = r40
            goto L_0x0814
        L_0x07f8:
            r0 = move-exception
            r4 = r40
            r5 = r3
            r3 = r49
            r6 = r0
        L_0x07ff:
            if (r1 == 0) goto L_0x080a
            r1.close()     // Catch:{ all -> 0x0805 }
            goto L_0x080a
        L_0x0805:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r6, (java.lang.Throwable) r1)     // Catch:{ all -> 0x080b }
        L_0x080a:
            throw r6     // Catch:{ all -> 0x080b }
        L_0x080b:
            r0 = move-exception
            goto L_0x0816
        L_0x080d:
            r0 = move-exception
            r4 = r40
            goto L_0x0813
        L_0x0811:
            r0 = move-exception
            r4 = r1
        L_0x0813:
            r5 = r3
        L_0x0814:
            r3 = r49
        L_0x0816:
            if (r3 == 0) goto L_0x0828
            aucs r1 = r5.e
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0828
            aucs r1 = r5.e
            int r1 = r1.size()
            r3.g = r1
        L_0x0828:
            r2.endTransaction()
            goto L_0x082d
        L_0x082c:
            throw r0
        L_0x082d:
            goto L_0x082c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yiu.a(java.util.Set, long, apfo, apfp, java.util.List, java.util.LinkedHashMap, aucd, yit, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v53, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v90 */
    /* JADX WARNING: type inference failed for: r3v91 */
    /* JADX WARNING: type inference failed for: r3v92 */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0655, code lost:
        if (r14 == null) goto L_0x0657;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0906, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:?, code lost:
        defpackage.apev.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x090c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x090d, code lost:
        r2 = r36;
        r7 = r43;
        r1 = r44;
        r4 = r0;
        r3 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0acc, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:477:0x08f0, B:485:0x0902] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0631 A[SYNTHETIC, Splitter:B:360:0x0631] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0653 A[Catch:{ all -> 0x064d }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x065d A[Catch:{ all -> 0x064d }] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0671 A[Catch:{ all -> 0x064d }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x08a1  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0902 A[SYNTHETIC, Splitter:B:485:0x0902] */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x0b03 A[SYNTHETIC, Splitter:B:618:0x0b03] */
    /* JADX WARNING: Removed duplicated region for block: B:643:0x0b55 A[Catch:{ all -> 0x0b69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:644:0x0b56 A[Catch:{ all -> 0x0b69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:652:0x0b76 A[Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af, IOException -> 0x0b8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:653:0x0b77 A[Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af, IOException -> 0x0b8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:670:0x0bb1 A[Catch:{ all -> 0x0bcd, all -> 0x0bd2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:671:0x0bb2 A[Catch:{ all -> 0x0bcd, all -> 0x0bd2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:674:0x0bc6 A[Catch:{ all -> 0x0bcd, all -> 0x0bd2 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.Set r37, java.util.List r38, java.lang.String r39, int r40, java.lang.String r41, boolean r42, defpackage.aucd r43, defpackage.yit r44, java.util.LinkedHashMap r45, boolean r46) {
        /*
            r36 = this;
            r9 = r36
            r10 = r38
            r11 = r39
            r12 = r43
            r13 = r44
            r14 = r45
            long r15 = android.os.SystemClock.elapsedRealtime()
            r8 = 0
            if (r46 != 0) goto L_0x001b
            java.lang.Object r1 = defpackage.anbs.b(r38)
            java.lang.String r1 = (java.lang.String) r1
            r7 = r1
            goto L_0x001c
        L_0x001b:
            r7 = r8
        L_0x001c:
            r6 = 4
            r5 = 3
            r4 = 2
            if (r46 != 0) goto L_0x002d
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x002b
            r1 = 3
            goto L_0x002e
        L_0x002b:
            r1 = 2
            goto L_0x002e
        L_0x002d:
            r1 = 4
        L_0x002e:
            boolean r2 = r12.c
            r3 = 0
            if (r2 != 0) goto L_0x0034
            goto L_0x0039
        L_0x0034:
            r43.c()
            r12.c = r3
        L_0x0039:
            aucj r2 = r12.b
            avsz r2 = (defpackage.avsz) r2
            avsz r17 = defpackage.avsz.h
            int r1 = r1 + -1
            r2.b = r1
            int r1 = r2.a
            r17 = r15
            r15 = 1
            r1 = r1 | r15
            r2.a = r1
            java.lang.Object r16 = b
            monitor-enter(r16)
            r1 = r36
            r2 = r38
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r45
            r15 = r7
            r7 = r46
            r10 = r8
            r8 = r43
            apfo r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0bcd }
            if (r14 == 0) goto L_0x0076
            java.lang.String r2 = "+"
            java.util.Collection r3 = r45.values()     // Catch:{ all -> 0x0071 }
            java.lang.String r8 = android.text.TextUtils.join(r2, r3)     // Catch:{ all -> 0x0071 }
            goto L_0x008b
        L_0x0071:
            r0 = move-exception
            r1 = r0
            r2 = r9
            goto L_0x0bd0
        L_0x0076:
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r15)     // Catch:{ all -> 0x0bcd }
            if (r2 != 0) goto L_0x0083
            java.lang.String r8 = r9.a((java.lang.String) r15)     // Catch:{ all -> 0x0071 }
            goto L_0x008b
        L_0x0083:
            if (r11 == 0) goto L_0x008a
            java.lang.String r8 = r9.a((java.lang.String) r11)     // Catch:{ all -> 0x0071 }
            goto L_0x008b
        L_0x008a:
            r8 = r10
        L_0x008b:
            yfw r2 = r9.d     // Catch:{ all -> 0x0bcd }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ all -> 0x0bcd }
            long r2 = defpackage.yfm.a(r2)     // Catch:{ all -> 0x0bcd }
            java.lang.String r5 = r36.b()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            java.lang.String r6 = "yiu"
            java.lang.String r7 = "a"
            java.lang.String r11 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            jjg r15 = a     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            java.util.logging.Level r10 = h()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            anih r10 = r15.b((java.util.logging.Level) r10)     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            r15 = 1295(0x50f, float:1.815E-42)
            anie r10 = r10.a((java.lang.String) r6, (java.lang.String) r7, (int) r15, (java.lang.String) r11)     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            anih r10 = (defpackage.anih) r10     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            java.lang.String r15 = "Heterodyne Request: %s"
            r10.a((java.lang.String) r15, (java.lang.Object) r1)     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            long r23 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            r36.aP()     // Catch:{ IOException -> 0x0b4a, all -> 0x0b42 }
            yiz r10 = r9.h     // Catch:{ IOException -> 0x0b4a, all -> 0x0b42 }
            yiy r5 = r10.a(r1, r8, r5)     // Catch:{ IOException -> 0x0b4a, all -> 0x0b42 }
            int r10 = r5.b     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            if (r10 > 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            r9.a((int) r10)     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
        L_0x00cb:
            boolean r10 = r5.c     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            if (r10 == 0) goto L_0x010f
            apfp r8 = r5.a     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r8 == 0) goto L_0x014c
            aucs r8 = r8.e     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r8 = r8.size()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r8 <= 0) goto L_0x014c
            apfp r8 = r5.a     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            aucs r8 = r8.e     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
        L_0x00e3:
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r10 == 0) goto L_0x014c
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r10 = r10.intValue()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.util.Map$Entry r10 = a((java.util.LinkedHashMap) r14, (int) r10)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r9.b((java.lang.String) r10)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            goto L_0x00e3
        L_0x0101:
            r0 = move-exception
            r3 = r0
            r2 = r9
            r7 = r12
            r1 = r13
            goto L_0x0b39
        L_0x0108:
            r0 = move-exception
            r3 = r0
            r2 = r9
            r7 = r12
            r1 = r13
            goto L_0x0b40
        L_0x010f:
            if (r46 == 0) goto L_0x0134
            java.util.Collection r8 = r45.values()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
        L_0x0119:
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r10 == 0) goto L_0x0129
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r9.b((java.lang.String) r10)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            goto L_0x0119
        L_0x0129:
            if (r13 == 0) goto L_0x014c
            int r8 = r38.size()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r8 = r8 + -1
            r13.g = r8     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            goto L_0x014c
        L_0x0134:
            if (r14 == 0) goto L_0x0149
            java.lang.Object r8 = defpackage.anbs.b(r38)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.Object r8 = r14.get(r8)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r9.b((java.lang.String) r8)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r13 == 0) goto L_0x014c
            r8 = 1
            r13.g = r8     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            goto L_0x014c
        L_0x0149:
            r9.b((java.lang.String) r8)     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
        L_0x014c:
            boolean r8 = r5.c     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            if (r8 != 0) goto L_0x016b
            boolean r8 = r12.c     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r8 != 0) goto L_0x0156
            r8 = 0
            goto L_0x015c
        L_0x0156:
            r43.c()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r8 = 0
            r12.c = r8     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
        L_0x015c:
            aucj r4 = r12.b     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r10 = 3
            r4.c = r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r10 = r4.a     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r15 = 2
            r10 = r10 | r15
            r4.a = r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            goto L_0x01e2
        L_0x016b:
            r8 = 0
            r15 = 2
            int r4 = r5.d     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            if (r4 != 0) goto L_0x0188
            boolean r4 = r12.c     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r4 != 0) goto L_0x0176
            goto L_0x017b
        L_0x0176:
            r43.c()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r12.c = r8     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
        L_0x017b:
            aucj r4 = r12.b     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r10 = 4
            r4.c = r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r10 = r4.a     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r10 = r10 | r15
            r4.a = r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            goto L_0x01e2
        L_0x0188:
            r10 = 200(0xc8, float:2.8E-43)
            if (r4 >= r10) goto L_0x018d
            goto L_0x01cc
        L_0x018d:
            r10 = 300(0x12c, float:4.2E-43)
            if (r4 >= r10) goto L_0x01cc
            apfp r4 = r5.a     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r4 == 0) goto L_0x01b5
            aucs r4 = r4.e     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r4 = r4.size()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r4 <= 0) goto L_0x01e2
            boolean r4 = r12.c     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r4 != 0) goto L_0x01a2
            goto L_0x01a7
        L_0x01a2:
            r43.c()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r12.c = r8     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
        L_0x01a7:
            aucj r4 = r12.b     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r10 = 9
            r4.c = r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r10 = r4.a     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r10 = r10 | r15
            r4.a = r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            goto L_0x01e2
        L_0x01b5:
            boolean r4 = r12.c     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r4 != 0) goto L_0x01ba
            goto L_0x01bf
        L_0x01ba:
            r43.c()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r12.c = r8     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
        L_0x01bf:
            aucj r4 = r12.b     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r10 = 5
            r4.c = r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r10 = r4.a     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r10 = r10 | r15
            r4.a = r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            goto L_0x01e2
        L_0x01cc:
            boolean r4 = r12.c     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            if (r4 != 0) goto L_0x01d1
            goto L_0x01d6
        L_0x01d1:
            r43.c()     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            r12.c = r8     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
        L_0x01d6:
            aucj r4 = r12.b     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            r10 = 6
            r4.c = r10     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            int r10 = r4.a     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            r10 = r10 | r15
            r4.a = r10     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
        L_0x01e2:
            azaf r4 = defpackage.azaf.a     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            azag r4 = r4.a()     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            boolean r4 = r4.m()     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            if (r4 == 0) goto L_0x020d
            int r4 = r5.d     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r10 = 200(0xc8, float:2.8E-43)
            if (r4 == r10) goto L_0x020d
            boolean r10 = r12.c     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r10 != 0) goto L_0x01f9
        L_0x01f8:
            goto L_0x01ff
        L_0x01f9:
            r43.c()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r12.c = r8     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            goto L_0x01f8
        L_0x01ff:
            aucj r10 = r12.b     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            avsz r10 = (defpackage.avsz) r10     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r8 = r10.a     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r20 = 4
            r8 = r8 | 4
            r10.a = r8     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r10.d = r4     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
        L_0x020d:
            apfp r4 = r5.a     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            if (r4 != 0) goto L_0x0258
            azaf r1 = defpackage.azaf.a     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            azag r1 = r1.a()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            boolean r1 = r1.f()     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r1 == 0) goto L_0x024e
            yfy r1 = new yfy     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            aucj r3 = r12.b     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            avsz r3 = (defpackage.avsz) r3     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r3 = r3.d     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r4 = 0
            r2[r4] = r3     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            aucj r3 = r12.b     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            avsz r3 = (defpackage.avsz) r3     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r3 = r3.c     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            int r3 = defpackage.avsy.a(r3)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            if (r3 != 0) goto L_0x023b
            r3 = 1
        L_0x023b:
            java.lang.String r3 = defpackage.avsy.b(r3)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r4 = 1
            r2[r4] = r3     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.String r3 = "Null server response, http status code %d: %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            r3 = 29504(0x7340, float:4.1344E-41)
            r1.<init>(r3, r2)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            throw r1     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
        L_0x024e:
            yfy r1 = new yfy     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            java.lang.String r2 = "Null server response"
            r3 = 29504(0x7340, float:4.1344E-41)
            r1.<init>(r3, r2)     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
            throw r1     // Catch:{ IOException -> 0x0108, all -> 0x0101 }
        L_0x0258:
            jjg r4 = a     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            java.util.logging.Level r8 = h()     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            anih r4 = r4.b((java.util.logging.Level) r8)     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            r8 = 1377(0x561, float:1.93E-42)
            anie r4 = r4.a((java.lang.String) r6, (java.lang.String) r7, (int) r8, (java.lang.String) r11)     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            anih r4 = (defpackage.anih) r4     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            java.lang.String r6 = "Heterodyne Response: %s"
            apfp r7 = r5.a     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            r4.a((java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            apfp r4 = r5.a     // Catch:{ IOException -> 0x0b3b, all -> 0x0b34 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            long r6 = r6 - r23
            int r7 = (int) r6     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            boolean r6 = r12.c     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            if (r6 != 0) goto L_0x027f
            goto L_0x0285
        L_0x027f:
            r43.c()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            r6 = 0
            r12.c = r6     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
        L_0x0285:
            aucj r6 = r12.b     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            avsz r6 = (defpackage.avsz) r6     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            int r8 = r6.a     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            r8 = r8 | 8
            r6.a = r8     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            r6.e = r7     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            r9.a((defpackage.yiy) r5)     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            java.lang.String r5 = "yiu"
            java.lang.String r6 = "a"
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r8 = r4.c     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            boolean r8 = r8.isEmpty()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            if (r8 == 0) goto L_0x02a3
            goto L_0x02f3
        L_0x02a3:
            if (r1 == 0) goto L_0x02c0
            apfd r8 = r1.b     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
            if (r8 == 0) goto L_0x02aa
            goto L_0x02ac
        L_0x02aa:
            apfd r8 = defpackage.apfd.h     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
        L_0x02ac:
            java.lang.String r8 = r8.d     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
            goto L_0x02c1
        L_0x02af:
            r0 = move-exception
            r3 = r0
            r2 = r9
            r7 = r12
            r1 = r13
            goto L_0x0ba6
        L_0x02b6:
            r0 = move-exception
            r3 = r0
            r2 = r9
            r7 = r12
            r1 = r13
            goto L_0x0b9a
        L_0x02bd:
            r0 = move-exception
            r8 = r0
            goto L_0x02d5
        L_0x02c0:
            r8 = 0
        L_0x02c1:
            agwa r10 = r9.i     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
            znz r11 = defpackage.zoa.c()     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
            java.lang.String r15 = r4.c     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
            r11.a = r15     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
            r11.b = r8     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
            zoa r8 = r11.a()     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
            r10.a(r8)     // Catch:{ yfy -> 0x02bd, IOException -> 0x02b6, all -> 0x02af }
            goto L_0x02f3
        L_0x02d5:
            boolean r10 = defpackage.azaf.l()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            if (r10 != 0) goto L_0x0b17
            jjg r10 = a     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            anie r10 = r10.c()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            anih r10 = (defpackage.anih) r10     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            r10.a((java.lang.Throwable) r8)     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            r8 = 1512(0x5e8, float:2.119E-42)
            anie r5 = r10.a((java.lang.String) r5, (java.lang.String) r6, (int) r8, (java.lang.String) r7)     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            anih r5 = (defpackage.anih) r5     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            java.lang.String r6 = "Skip setting Pseudonymous ID error."
            r5.a((java.lang.String) r6)     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
        L_0x02f3:
            yfw r5 = r9.d     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            android.database.sqlite.SQLiteDatabase r5 = r5.getWritableDatabase()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            r5.beginTransaction()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            java.util.Collections.emptySet()     // Catch:{ IOException -> 0x0b95, all -> 0x0b8f }
            long r6 = defpackage.yfm.a(r5)     // Catch:{ all -> 0x0afb }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x033d
            boolean r1 = r12.c     // Catch:{ all -> 0x0afb }
            if (r1 != 0) goto L_0x030c
            goto L_0x0312
        L_0x030c:
            r43.c()     // Catch:{ all -> 0x0afb }
            r1 = 0
            r12.c = r1     // Catch:{ all -> 0x0afb }
        L_0x0312:
            aucj r1 = r12.b     // Catch:{ all -> 0x0afb }
            avsz r1 = (defpackage.avsz) r1     // Catch:{ all -> 0x0afb }
            r8 = 7
            r1.c = r8     // Catch:{ all -> 0x0afb }
            int r8 = r1.a     // Catch:{ all -> 0x0afb }
            r10 = 2
            r8 = r8 | r10
            r1.a = r8     // Catch:{ all -> 0x0afb }
            yfy r1 = new yfy     // Catch:{ all -> 0x0afb }
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ all -> 0x0afb }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0afb }
            r3 = 0
            r8[r3] = r2     // Catch:{ all -> 0x0afb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0afb }
            r3 = 1
            r8[r3] = r2     // Catch:{ all -> 0x0afb }
            java.lang.String r2 = "Bad change count. Expecting %d, got %d"
            java.lang.String r2 = java.lang.String.format(r2, r8)     // Catch:{ all -> 0x0afb }
            r3 = 29504(0x7340, float:4.1344E-41)
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0afb }
            throw r1     // Catch:{ all -> 0x0afb }
        L_0x033d:
            long r2 = r4.d     // Catch:{ all -> 0x0afb }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0afb }
            r6.<init>()     // Catch:{ all -> 0x0afb }
            java.lang.String r7 = "key"
            r8 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0afb }
            r6.put(r7, r10)     // Catch:{ all -> 0x0afb }
            java.lang.String r7 = "servertimestamp"
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0afb }
            r6.put(r7, r8)     // Catch:{ all -> 0x0afb }
            java.lang.String r7 = "LastFetch"
            r8 = 5
            r10 = 0
            r5.insertWithOnConflict(r7, r10, r6, r8)     // Catch:{ all -> 0x0afb }
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x0afb }
            java.lang.String r6 = "servertimestamp"
            r8 = 0
            r7[r8] = r6     // Catch:{ all -> 0x0afb }
            java.lang.String r24 = "LastFetch"
            java.lang.String r26 = "key = 0"
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r23 = r5
            r25 = r7
            android.database.Cursor r6 = r23.query(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0afb }
            boolean r7 = r6.moveToFirst()     // Catch:{ all -> 0x0ae7 }
            if (r7 == 0) goto L_0x0388
            r7 = 0
            long r23 = r6.getLong(r7)     // Catch:{ all -> 0x0ae7 }
            r7 = r23
            goto L_0x038a
        L_0x0388:
            r7 = 0
        L_0x038a:
            if (r6 != 0) goto L_0x038d
            goto L_0x0390
        L_0x038d:
            r6.close()     // Catch:{ all -> 0x0afb }
        L_0x0390:
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x03f8
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x0afb }
            java.lang.String r2 = "servertimestamp"
            r6 = 0
            r3[r6] = r2     // Catch:{ all -> 0x0afb }
            java.lang.String r24 = "LastFetch"
            java.lang.String r26 = "key = 2"
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r23 = r5
            r25 = r3
            android.database.Cursor r2 = r23.query(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0afb }
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x03ea }
            if (r3 == 0) goto L_0x03bc
            r3 = 0
            long r23 = r2.getLong(r3)     // Catch:{ all -> 0x03ea }
            goto L_0x03be
        L_0x03bc:
            r23 = 0
        L_0x03be:
            if (r2 != 0) goto L_0x03c1
            goto L_0x03c4
        L_0x03c1:
            r2.close()     // Catch:{ all -> 0x0afb }
        L_0x03c4:
            int r2 = (r23 > r7 ? 1 : (r23 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x03e8
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0afb }
            r2.<init>()     // Catch:{ all -> 0x0afb }
            java.lang.String r3 = "key"
            r6 = 2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0afb }
            r2.put(r3, r15)     // Catch:{ all -> 0x0afb }
            java.lang.Long r8 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0afb }
            java.lang.String r3 = "servertimestamp"
            r2.put(r3, r8)     // Catch:{ all -> 0x0afb }
            java.lang.String r3 = "LastFetch"
            r6 = 5
            r7 = 0
            r5.insertWithOnConflict(r3, r7, r2, r6)     // Catch:{ all -> 0x0afb }
            goto L_0x03f9
        L_0x03e8:
            r8 = 0
            goto L_0x03f9
        L_0x03ea:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x03f7
            r2.close()     // Catch:{ all -> 0x03f2 }
            goto L_0x03f7
        L_0x03f2:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0afb }
        L_0x03f7:
            throw r1     // Catch:{ all -> 0x0afb }
        L_0x03f8:
            r8 = 0
        L_0x03f9:
            boolean r2 = defpackage.azaf.k()     // Catch:{ all -> 0x0afb }
            if (r2 != 0) goto L_0x0508
            auay r2 = r4.b     // Catch:{ all -> 0x0afb }
            int r2 = r2.a()     // Catch:{ all -> 0x0afb }
            if (r2 != 0) goto L_0x040b
            r3 = 0
            r15 = 0
            goto L_0x050a
        L_0x040b:
            if (r46 != 0) goto L_0x0414
            java.lang.Object r2 = defpackage.anbs.b(r38)     // Catch:{ all -> 0x0afb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0afb }
            goto L_0x0416
        L_0x0414:
            java.lang.String r2 = "ALL_USERS"
        L_0x0416:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0afb }
            r3.<init>()     // Catch:{ all -> 0x0afb }
            java.lang.String r6 = "user"
            r3.put(r6, r2)     // Catch:{ all -> 0x0afb }
            java.lang.String r6 = "bytesTag"
            auay r7 = r4.b     // Catch:{ all -> 0x0afb }
            byte[] r7 = r7.k()     // Catch:{ all -> 0x0afb }
            r3.put(r6, r7)     // Catch:{ all -> 0x0afb }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0afb }
            r6.<init>()     // Catch:{ all -> 0x0afb }
            r7 = 2
            java.lang.String[] r15 = new java.lang.String[r7]     // Catch:{ all -> 0x0afb }
            java.lang.String r7 = "user"
            r19 = 0
            r15[r19] = r7     // Catch:{ all -> 0x0afb }
            java.lang.String r7 = "bytesTag"
            r21 = 1
            r15[r21] = r7     // Catch:{ all -> 0x0afb }
            java.lang.String r24 = "RequestTags"
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r23 = r5
            r25 = r15
            android.database.Cursor r7 = r23.query(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0afb }
        L_0x0453:
            boolean r15 = r7.moveToNext()     // Catch:{ all -> 0x04fa }
            if (r15 == 0) goto L_0x0467
            r15 = 0
            java.lang.String r10 = r7.getString(r15)     // Catch:{ all -> 0x04fa }
            r11 = 1
            byte[] r15 = r7.getBlob(r11)     // Catch:{ all -> 0x04fa }
            r6.put(r10, r15)     // Catch:{ all -> 0x04fa }
            goto L_0x0453
        L_0x0467:
            boolean r10 = r6.containsKey(r2)     // Catch:{ all -> 0x04fa }
            if (r10 == 0) goto L_0x0496
            java.lang.Object r10 = r6.get(r2)     // Catch:{ all -> 0x04fa }
            byte[] r10 = (byte[]) r10     // Catch:{ all -> 0x04fa }
            auay r11 = r4.b     // Catch:{ all -> 0x04fa }
            byte[] r11 = r11.k()     // Catch:{ all -> 0x04fa }
            boolean r10 = java.util.Arrays.equals(r10, r11)     // Catch:{ all -> 0x04fa }
            if (r10 != 0) goto L_0x048d
            r10 = 1
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ all -> 0x04fa }
            r10 = 0
            r11[r10] = r2     // Catch:{ all -> 0x04fa }
            java.lang.String r10 = "RequestTags"
            java.lang.String r15 = "user = ?"
            r5.update(r10, r3, r15, r11)     // Catch:{ all -> 0x04fa }
            goto L_0x049c
        L_0x048d:
            if (r7 == 0) goto L_0x0492
            r7.close()     // Catch:{ all -> 0x0afb }
        L_0x0492:
            r3 = 0
            r15 = 0
            goto L_0x050a
        L_0x0496:
            java.lang.String r10 = "RequestTags"
            r11 = 0
            r5.insert(r10, r11, r3)     // Catch:{ all -> 0x04fa }
        L_0x049c:
            java.lang.String r3 = "ALL_USERS"
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x04fa }
            if (r2 != 0) goto L_0x04b5
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x04fa }
            java.lang.String r2 = "ALL_USERS"
            r6 = 0
            r3[r6] = r2     // Catch:{ all -> 0x04fa }
            java.lang.String r2 = "RequestTags"
            java.lang.String r6 = "user = ?"
            r5.delete(r2, r6, r3)     // Catch:{ all -> 0x04fa }
            r15 = 0
            goto L_0x04f3
        L_0x04b5:
            java.util.Iterator r2 = r38.iterator()     // Catch:{ all -> 0x04fa }
        L_0x04b9:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x04fa }
            if (r3 == 0) goto L_0x04f2
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x04fa }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04fa }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x04fa }
            r10.<init>()     // Catch:{ all -> 0x04fa }
            java.lang.String r11 = "user"
            r10.put(r11, r3)     // Catch:{ all -> 0x04fa }
            java.lang.String r11 = "bytesTag"
            byte[] r15 = defpackage.yfv.a     // Catch:{ all -> 0x04fa }
            r10.put(r11, r15)     // Catch:{ all -> 0x04fa }
            boolean r11 = r6.containsKey(r3)     // Catch:{ all -> 0x04fa }
            if (r11 == 0) goto L_0x04ea
            java.lang.Object r3 = r6.get(r3)     // Catch:{ all -> 0x04fa }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x04fa }
            byte[] r11 = defpackage.yfv.a     // Catch:{ all -> 0x04fa }
            boolean r3 = java.util.Arrays.equals(r3, r11)     // Catch:{ all -> 0x04fa }
            if (r3 != 0) goto L_0x04b9
        L_0x04ea:
            java.lang.String r3 = "RequestTags"
            r11 = 5
            r15 = 0
            r5.insertWithOnConflict(r3, r15, r10, r11)     // Catch:{ all -> 0x04fa }
            goto L_0x04b9
        L_0x04f2:
            r15 = 0
        L_0x04f3:
            if (r7 == 0) goto L_0x04f8
            r7.close()     // Catch:{ all -> 0x0afb }
        L_0x04f8:
            r3 = 1
            goto L_0x050a
        L_0x04fa:
            r0 = move-exception
            r1 = r0
            if (r7 == 0) goto L_0x0507
            r7.close()     // Catch:{ all -> 0x0502 }
            goto L_0x0507
        L_0x0502:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0afb }
        L_0x0507:
            throw r1     // Catch:{ all -> 0x0afb }
        L_0x0508:
            r15 = 0
            r3 = 0
        L_0x050a:
            aucx r2 = r4.a     // Catch:{ all -> 0x0afb }
            int r2 = r2.size()     // Catch:{ all -> 0x0afb }
            if (r2 <= 0) goto L_0x0514
            r3 = 1
            goto L_0x0519
        L_0x0514:
            if (r3 != 0) goto L_0x0518
            r3 = 0
            goto L_0x0519
        L_0x0518:
            r3 = 1
        L_0x0519:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0afb }
            r2.<init>()     // Catch:{ all -> 0x0afb }
            if (r3 == 0) goto L_0x0922
            java.lang.String r3 = "INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            android.database.sqlite.SQLiteStatement r3 = r5.compileStatement(r3)     // Catch:{ all -> 0x0918 }
            java.lang.String r6 = "__sync"
            long r6 = defpackage.yfm.b(r5, r6)     // Catch:{ all -> 0x08fa }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x08fa }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x08fa }
            r7.<init>()     // Catch:{ all -> 0x08fa }
            aucx r10 = r4.a     // Catch:{ all -> 0x08fa }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x08fa }
        L_0x053b:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x08fa }
            if (r11 == 0) goto L_0x08cf
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x08fa }
            apfc r11 = (defpackage.apfc) r11     // Catch:{ all -> 0x08fa }
            apfy r15 = r11.b     // Catch:{ all -> 0x08fa }
            if (r15 == 0) goto L_0x054c
            goto L_0x054e
        L_0x054c:
            apfy r15 = defpackage.apfy.e     // Catch:{ all -> 0x08fa }
        L_0x054e:
            java.lang.String r15 = r15.b     // Catch:{ all -> 0x08fa }
            r41 = r6
            apfy r6 = r11.b     // Catch:{ all -> 0x08fa }
            if (r6 == 0) goto L_0x0557
            goto L_0x0559
        L_0x0557:
            apfy r6 = defpackage.apfy.e     // Catch:{ all -> 0x08fa }
        L_0x0559:
            r21 = r10
            long r9 = r6.c     // Catch:{ all -> 0x08fa }
            boolean r6 = defpackage.ayyd.b()     // Catch:{ all -> 0x08fa }
            if (r6 == 0) goto L_0x057b
            boolean r6 = defpackage.azaf.d()     // Catch:{ all -> 0x0573 }
            if (r6 == 0) goto L_0x057b
            apfg r6 = r11.h     // Catch:{ all -> 0x0573 }
            if (r6 != 0) goto L_0x056f
            apfg r6 = defpackage.apfg.b     // Catch:{ all -> 0x0573 }
        L_0x056f:
            defpackage.yfu.a(r5, r15, r6)     // Catch:{ all -> 0x0573 }
            goto L_0x057b
        L_0x0573:
            r0 = move-exception
            r1 = r0
            r35 = r3
            r33 = r4
            goto L_0x0900
        L_0x057b:
            apfy r6 = r11.b     // Catch:{ all -> 0x08fa }
            if (r6 == 0) goto L_0x0580
            goto L_0x0582
        L_0x0580:
            apfy r6 = defpackage.apfy.e     // Catch:{ all -> 0x08fa }
        L_0x0582:
            r12 = r38
            r40 = r8
            r8 = 0
            java.lang.String r6 = a((java.util.List) r12, (java.util.LinkedHashMap) r14, (defpackage.apfy) r6)     // Catch:{ all -> 0x08fa }
            r7.add(r6)     // Catch:{ all -> 0x08fa }
            boolean r23 = defpackage.azaf.d()     // Catch:{ all -> 0x08fa }
            if (r23 == 0) goto L_0x05e7
            boolean r23 = defpackage.ayyd.b()     // Catch:{ all -> 0x0573 }
            if (r23 != 0) goto L_0x059d
            r31 = r7
            goto L_0x05e9
        L_0x059d:
            if (r46 == 0) goto L_0x05e4
            apfg r8 = r11.h     // Catch:{ all -> 0x0573 }
            if (r8 == 0) goto L_0x05a4
            goto L_0x05a6
        L_0x05a4:
            apfg r8 = defpackage.apfg.b     // Catch:{ all -> 0x0573 }
        L_0x05a6:
            int r8 = r8.a     // Catch:{ all -> 0x0573 }
            int r8 = defpackage.apff.a(r8)     // Catch:{ all -> 0x0573 }
            if (r8 != 0) goto L_0x05b1
            r31 = r7
            goto L_0x05df
        L_0x05b1:
            r31 = r7
            r7 = 3
            if (r8 != r7) goto L_0x05df
            java.lang.String r7 = ""
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x0573 }
            if (r7 == 0) goto L_0x05dd
            java.util.Iterator r7 = r38.iterator()     // Catch:{ all -> 0x0573 }
            r8 = 0
        L_0x05c3:
            boolean r23 = r7.hasNext()     // Catch:{ all -> 0x0573 }
            if (r23 == 0) goto L_0x05db
            java.lang.Object r23 = r7.next()     // Catch:{ all -> 0x0573 }
            r24 = r7
            r7 = r23
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0573 }
            boolean r7 = a((java.lang.String) r7, (android.database.sqlite.SQLiteDatabase) r5, (android.database.sqlite.SQLiteStatement) r3, (defpackage.apfc) r11)     // Catch:{ all -> 0x0573 }
            r8 = r8 | r7
            r7 = r24
            goto L_0x05c3
        L_0x05db:
            r7 = r8
            goto L_0x05ed
        L_0x05dd:
            r7 = 0
            goto L_0x05ed
        L_0x05df:
            boolean r7 = a((java.lang.String) r6, (android.database.sqlite.SQLiteDatabase) r5, (android.database.sqlite.SQLiteStatement) r3, (defpackage.apfc) r11)     // Catch:{ all -> 0x0573 }
            goto L_0x05ed
        L_0x05e4:
            r31 = r7
            goto L_0x05e9
        L_0x05e7:
            r31 = r7
        L_0x05e9:
            boolean r7 = a((java.lang.String) r6, (android.database.sqlite.SQLiteDatabase) r5, (android.database.sqlite.SQLiteStatement) r3, (defpackage.apfc) r11)     // Catch:{ all -> 0x08fa }
        L_0x05ed:
            boolean r8 = defpackage.azaf.c()     // Catch:{ all -> 0x08fa }
            if (r8 == 0) goto L_0x061e
            r28 = 0
            r23 = r5
            r24 = r15
            r25 = r9
            r27 = r6
            android.database.Cursor r8 = defpackage.yfe.a((android.database.sqlite.SQLiteDatabase) r23, (java.lang.String) r24, (long) r25, (java.lang.String) r27, (boolean) r28)     // Catch:{ all -> 0x0573 }
            int r23 = defpackage.yfe.a(r8)     // Catch:{ all -> 0x0610 }
            if (r8 != 0) goto L_0x0608
            goto L_0x060b
        L_0x0608:
            r8.close()     // Catch:{ all -> 0x0573 }
        L_0x060b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0573 }
            goto L_0x061f
        L_0x0610:
            r0 = move-exception
            r1 = r0
            if (r8 == 0) goto L_0x061d
            r8.close()     // Catch:{ all -> 0x0618 }
            goto L_0x061d
        L_0x0618:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0573 }
        L_0x061d:
            throw r1     // Catch:{ all -> 0x0573 }
        L_0x061e:
            r8 = 0
        L_0x061f:
            long r12 = r4.d     // Catch:{ all -> 0x08fa }
            azaf r23 = defpackage.azaf.a     // Catch:{ all -> 0x08fa }
            azag r23 = r23.a()     // Catch:{ all -> 0x08fa }
            boolean r32 = r23.j()     // Catch:{ all -> 0x08fa }
            int r14 = r11.a     // Catch:{ all -> 0x08fa }
            r14 = r14 & 8
            if (r14 == 0) goto L_0x0641
            auay r14 = r11.g     // Catch:{ all -> 0x0573 }
            byte[] r14 = r14.k()     // Catch:{ all -> 0x0573 }
            int r14 = r14.length     // Catch:{ all -> 0x0573 }
            if (r14 <= 0) goto L_0x0641
            auay r14 = r11.g     // Catch:{ all -> 0x0573 }
            byte[] r14 = r14.k()     // Catch:{ all -> 0x0573 }
            goto L_0x0642
        L_0x0641:
            r14 = 0
        L_0x0642:
            if (r32 != 0) goto L_0x0653
            r33 = r4
            int r4 = r11.a     // Catch:{ all -> 0x064d }
            r4 = r4 & 8
            if (r4 != 0) goto L_0x0689
            goto L_0x0657
        L_0x064d:
            r0 = move-exception
            r1 = r0
            r35 = r3
            goto L_0x0900
        L_0x0653:
            r33 = r4
            if (r14 != 0) goto L_0x0689
        L_0x0657:
            boolean r4 = defpackage.azaf.m()     // Catch:{ all -> 0x064d }
            if (r4 != 0) goto L_0x0671
            apfy r4 = r11.b     // Catch:{ all -> 0x064d }
            if (r4 != 0) goto L_0x0663
            apfy r4 = defpackage.apfy.e     // Catch:{ all -> 0x064d }
        L_0x0663:
            a((android.database.sqlite.SQLiteDatabase) r5, (defpackage.apfy) r4, (java.lang.String) r6, (long) r12)     // Catch:{ all -> 0x064d }
            r34 = r1
            r29 = r2
            r35 = r3
            r30 = r7
            r4 = 0
            goto L_0x0880
        L_0x0671:
            r23 = r5
            r24 = r11
            r25 = r6
            r26 = r12
            r28 = r8
            a((android.database.sqlite.SQLiteDatabase) r23, (defpackage.apfc) r24, (java.lang.String) r25, (long) r26, (java.lang.Integer) r28)     // Catch:{ all -> 0x064d }
            r34 = r1
            r29 = r2
            r35 = r3
            r30 = r7
            r4 = 0
            goto L_0x0880
        L_0x0689:
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x08cb }
            r34 = r1
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x08cb }
            r1.<init>()     // Catch:{ all -> 0x08cb }
            r35 = r3
            java.lang.String r3 = "experimentToken"
            r1.add(r3)     // Catch:{ all -> 0x08f8 }
            java.lang.String r3 = "serverToken"
            r1.add(r3)     // Catch:{ all -> 0x08f8 }
            java.lang.String r3 = "configHash"
            r1.add(r3)     // Catch:{ all -> 0x08f8 }
            java.lang.String r3 = "tokensTag"
            r1.add(r3)     // Catch:{ all -> 0x08f8 }
            int r3 = r1.size()     // Catch:{ all -> 0x08f8 }
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x08f8 }
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch:{ all -> 0x08f8 }
            r25 = r1
            java.lang.String[] r25 = (java.lang.String[]) r25     // Catch:{ all -> 0x08f8 }
            r1 = 3
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x08f8 }
            r1 = 0
            r3[r1] = r15     // Catch:{ all -> 0x08f8 }
            java.lang.String r1 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x08f8 }
            r22 = 1
            r3[r22] = r1     // Catch:{ all -> 0x08f8 }
            r1 = 2
            r3[r1] = r6     // Catch:{ all -> 0x08f8 }
            java.lang.String r24 = "ExperimentTokens"
            java.lang.String r26 = "packageName = ? AND version = ? AND user = ? AND isCommitted = 0"
            r28 = 0
            r29 = 0
            r30 = 0
            r23 = r5
            r27 = r3
            android.database.Cursor r1 = r23.query(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x08f8 }
            boolean r3 = r1.moveToFirst()     // Catch:{ all -> 0x08bd }
            if (r3 == 0) goto L_0x0728
            auay r3 = r11.d     // Catch:{ all -> 0x08bd }
            byte[] r3 = r3.k()     // Catch:{ all -> 0x08bd }
            r29 = r2
            r30 = r7
            r2 = 0
            byte[] r7 = r1.getBlob(r2)     // Catch:{ all -> 0x08bd }
            boolean r2 = java.util.Arrays.equals(r3, r7)     // Catch:{ all -> 0x08bd }
            if (r2 == 0) goto L_0x0720
            java.lang.String r2 = r11.e     // Catch:{ all -> 0x08bd }
            r3 = 1
            java.lang.String r7 = r1.getString(r3)     // Catch:{ all -> 0x08bd }
            if (r2 == 0) goto L_0x0705
            if (r7 == 0) goto L_0x0702
            goto L_0x0709
        L_0x0702:
            java.lang.String r7 = ""
            goto L_0x0709
        L_0x0705:
            if (r7 == 0) goto L_0x0711
            java.lang.String r2 = ""
        L_0x0709:
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x08bd }
            if (r2 != 0) goto L_0x0711
            r3 = 1
            goto L_0x0721
        L_0x0711:
            if (r32 == 0) goto L_0x071e
            r2 = 3
            byte[] r3 = r1.getBlob(r2)     // Catch:{ all -> 0x08bd }
            boolean r2 = java.util.Arrays.equals(r3, r14)     // Catch:{ all -> 0x08bd }
            if (r2 == 0) goto L_0x0720
        L_0x071e:
            r3 = 0
            goto L_0x0721
        L_0x0720:
            r3 = 1
        L_0x0721:
            r2 = 2
            int r7 = r1.getInt(r2)     // Catch:{ all -> 0x08bd }
            goto L_0x072e
        L_0x0728:
            r29 = r2
            r30 = r7
            r3 = 1
            r7 = 0
        L_0x072e:
            if (r1 == 0) goto L_0x0733
            r1.close()     // Catch:{ all -> 0x08f8 }
        L_0x0733:
            if (r32 != 0) goto L_0x0736
            goto L_0x075a
        L_0x0736:
            if (r3 != 0) goto L_0x075a
            boolean r1 = defpackage.azaf.m()     // Catch:{ all -> 0x08f8 }
            if (r1 != 0) goto L_0x074a
            apfy r1 = r11.b     // Catch:{ all -> 0x08f8 }
            if (r1 != 0) goto L_0x0744
            apfy r1 = defpackage.apfy.e     // Catch:{ all -> 0x08f8 }
        L_0x0744:
            a((android.database.sqlite.SQLiteDatabase) r5, (defpackage.apfy) r1, (java.lang.String) r6, (long) r12)     // Catch:{ all -> 0x08f8 }
            r4 = 0
            goto L_0x0880
        L_0x074a:
            r23 = r5
            r24 = r11
            r25 = r6
            r26 = r12
            r28 = r8
            a((android.database.sqlite.SQLiteDatabase) r23, (defpackage.apfc) r24, (java.lang.String) r25, (long) r26, (java.lang.Integer) r28)     // Catch:{ all -> 0x08f8 }
            r4 = 0
            goto L_0x0880
        L_0x075a:
            r1 = 3
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x08f8 }
            r1 = 0
            r2[r1] = r15     // Catch:{ all -> 0x08f8 }
            java.lang.String r1 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x08f8 }
            r22 = 1
            r2[r22] = r1     // Catch:{ all -> 0x08f8 }
            r1 = 2
            r2[r1] = r6     // Catch:{ all -> 0x08f8 }
            java.lang.String r1 = "ExperimentTokens"
            r23 = r3
            java.lang.String r3 = "packageName = ? AND version = ? AND user = ? AND isCommitted = 0"
            r5.delete(r1, r3, r2)     // Catch:{ all -> 0x08f8 }
            aucx r1 = r11.c     // Catch:{ all -> 0x08f8 }
            int r1 = r1.size()     // Catch:{ all -> 0x08f8 }
            if (r1 <= 0) goto L_0x0781
            int r7 = a((defpackage.apfc) r11)     // Catch:{ all -> 0x08f8 }
            goto L_0x0782
        L_0x0781:
        L_0x0782:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x08f8 }
            r1.<init>()     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "packageName"
            r1.put(r2, r15)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "version"
            r1.put(r2, r4)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "user"
            r1.put(r2, r6)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "isCommitted"
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x08f8 }
            r1.put(r2, r4)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "experimentToken"
            auay r3 = r11.d     // Catch:{ all -> 0x08f8 }
            byte[] r3 = r3.k()     // Catch:{ all -> 0x08f8 }
            r1.put(r2, r3)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "serverToken"
            java.lang.String r3 = r11.e     // Catch:{ all -> 0x08f8 }
            r1.put(r2, r3)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "configHash"
            java.lang.String r3 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x08f8 }
            r1.put(r2, r3)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "servingVersion"
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x08f8 }
            r1.put(r2, r3)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "tokensTag"
            r1.put(r2, r14)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "flagsHash"
            r1.put(r2, r8)     // Catch:{ all -> 0x08f8 }
            if (r32 == 0) goto L_0x07d3
            r3 = r23
            goto L_0x07d8
        L_0x07d3:
            if (r14 == 0) goto L_0x07d7
            r3 = 1
            goto L_0x07d8
        L_0x07d7:
            r3 = 0
        L_0x07d8:
            java.lang.String r2 = "ExperimentTokens"
            r4 = 0
            r5.insert(r2, r4, r1)     // Catch:{ all -> 0x08f8 }
            if (r3 == 0) goto L_0x087f
            apfy r1 = r11.b     // Catch:{ all -> 0x08f8 }
            if (r1 == 0) goto L_0x07e5
            goto L_0x07e7
        L_0x07e5:
            apfy r1 = defpackage.apfy.e     // Catch:{ all -> 0x08f8 }
        L_0x07e7:
            r2 = 3
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x08f8 }
            r2 = 0
            r3[r2] = r6     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = r1.b     // Catch:{ all -> 0x08f8 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x08f8 }
            long r1 = r1.c     // Catch:{ all -> 0x08f8 }
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch:{ all -> 0x08f8 }
            r2 = 2
            r3[r2] = r1     // Catch:{ all -> 0x08f8 }
            java.lang.String r1 = "CrossLoggedExperimentTokens"
            java.lang.String r2 = "fromUser = ? AND toPackageName = ? AND toVersion = ? AND isCommitted != 1"
            r5.delete(r1, r2, r3)     // Catch:{ all -> 0x08f8 }
            aucx r1 = r11.f     // Catch:{ all -> 0x08f8 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x08f8 }
        L_0x0808:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x08f8 }
            if (r2 == 0) goto L_0x087d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x08f8 }
            apfj r2 = (defpackage.apfj) r2     // Catch:{ all -> 0x08f8 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x08f8 }
            r3.<init>()     // Catch:{ all -> 0x08f8 }
            java.lang.String r4 = "fromPackageName"
            apfy r7 = r2.a     // Catch:{ all -> 0x08f8 }
            if (r7 == 0) goto L_0x0820
            goto L_0x0822
        L_0x0820:
            apfy r7 = defpackage.apfy.e     // Catch:{ all -> 0x08f8 }
        L_0x0822:
            java.lang.String r7 = r7.b     // Catch:{ all -> 0x08f8 }
            r3.put(r4, r7)     // Catch:{ all -> 0x08f8 }
            java.lang.String r4 = "fromVersion"
            apfy r7 = r2.a     // Catch:{ all -> 0x08f8 }
            if (r7 == 0) goto L_0x082e
            goto L_0x0830
        L_0x082e:
            apfy r7 = defpackage.apfy.e     // Catch:{ all -> 0x08f8 }
        L_0x0830:
            long r7 = r7.c     // Catch:{ all -> 0x08f8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x08f8 }
            r3.put(r4, r7)     // Catch:{ all -> 0x08f8 }
            java.lang.String r4 = "fromUser"
            r3.put(r4, r6)     // Catch:{ all -> 0x08f8 }
            java.lang.String r4 = "toPackageName"
            r3.put(r4, r15)     // Catch:{ all -> 0x08f8 }
            java.lang.String r4 = "toVersion"
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x08f8 }
            r3.put(r4, r7)     // Catch:{ all -> 0x08f8 }
            java.lang.String r4 = "isCommitted"
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x08f8 }
            r3.put(r4, r8)     // Catch:{ all -> 0x08f8 }
            java.lang.String r4 = "token"
            auay r7 = r2.b     // Catch:{ all -> 0x08f8 }
            byte[] r7 = r7.k()     // Catch:{ all -> 0x08f8 }
            r3.put(r4, r7)     // Catch:{ all -> 0x08f8 }
            java.lang.String r4 = "provenance"
            int r2 = r2.c     // Catch:{ all -> 0x08f8 }
            int r8 = defpackage.apfi.a(r2)     // Catch:{ all -> 0x08f8 }
            if (r8 == 0) goto L_0x086c
            goto L_0x086d
        L_0x086c:
            r8 = 1
        L_0x086d:
            int r8 = r8 + -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x08f8 }
            r3.put(r4, r2)     // Catch:{ all -> 0x08f8 }
            java.lang.String r2 = "CrossLoggedExperimentTokens"
            r4 = 0
            r5.insert(r2, r4, r3)     // Catch:{ all -> 0x08f8 }
            goto L_0x0808
        L_0x087d:
            r4 = 0
            goto L_0x0882
        L_0x087f:
            r4 = 0
        L_0x0880:
            if (r30 == 0) goto L_0x08a1
        L_0x0882:
            r1 = r29
            r1.add(r15)     // Catch:{ all -> 0x08f8 }
            r9 = r36
            r8 = r40
            r6 = r41
            r12 = r43
            r13 = r44
            r14 = r45
            r2 = r1
            r15 = r4
            r10 = r21
            r7 = r31
            r4 = r33
            r1 = r34
            r3 = r35
            goto L_0x053b
        L_0x08a1:
            r1 = r29
            r9 = r36
            r8 = r40
            r6 = r41
            r12 = r43
            r13 = r44
            r14 = r45
            r2 = r1
            r15 = r4
            r10 = r21
            r7 = r31
            r4 = r33
            r1 = r34
            r3 = r35
            goto L_0x053b
        L_0x08bd:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x08ca
            r1.close()     // Catch:{ all -> 0x08c5 }
            goto L_0x08ca
        L_0x08c5:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x08f8 }
        L_0x08ca:
            throw r2     // Catch:{ all -> 0x08f8 }
        L_0x08cb:
            r0 = move-exception
            r35 = r3
            goto L_0x08ff
        L_0x08cf:
            r34 = r1
            r1 = r2
            r35 = r3
            r33 = r4
            r41 = r6
            r40 = r8
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x08f8 }
        L_0x08de:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x08f8 }
            if (r3 == 0) goto L_0x08ee
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x08f8 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x08f8 }
            defpackage.yfm.b(r5, r3)     // Catch:{ all -> 0x08f8 }
            goto L_0x08de
        L_0x08ee:
            if (r35 == 0) goto L_0x08f4
            r35.close()     // Catch:{ all -> 0x090c }
            goto L_0x08f5
        L_0x08f4:
        L_0x08f5:
            r8 = r41
            goto L_0x092b
        L_0x08f8:
            r0 = move-exception
            goto L_0x08ff
        L_0x08fa:
            r0 = move-exception
            r35 = r3
            r33 = r4
        L_0x08ff:
            r1 = r0
        L_0x0900:
            if (r35 == 0) goto L_0x090b
            r35.close()     // Catch:{ all -> 0x0906 }
            goto L_0x090b
        L_0x0906:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x090c }
        L_0x090b:
            throw r1     // Catch:{ all -> 0x090c }
        L_0x090c:
            r0 = move-exception
            r2 = r36
            r7 = r43
            r1 = r44
            r4 = r0
            r3 = r33
            goto L_0x0b01
        L_0x0918:
            r0 = move-exception
            r2 = r36
            r7 = r43
            r1 = r44
            r3 = r4
            goto L_0x0b00
        L_0x0922:
            r34 = r1
            r1 = r2
            r33 = r4
            r40 = r8
            r4 = r15
            r8 = r4
        L_0x092b:
            if (r34 == 0) goto L_0x0a1b
            r2 = r34
            aucx r3 = r2.c     // Catch:{ all -> 0x0a14 }
            int r3 = r3.size()     // Catch:{ all -> 0x0a14 }
            if (r3 > 0) goto L_0x093d
            r7 = r38
            r3 = r33
            goto L_0x0a1f
        L_0x093d:
            r3 = r33
            java.util.Set r4 = a((defpackage.apfo) r2, (defpackage.apfp) r3)     // Catch:{ all -> 0x0a0f }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0a0f }
        L_0x0947:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0a0f }
            if (r6 != 0) goto L_0x099e
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0adf }
            r4.<init>()     // Catch:{ all -> 0x0adf }
            aucx r2 = r2.c     // Catch:{ all -> 0x0adf }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0adf }
        L_0x0958:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0adf }
            if (r6 == 0) goto L_0x0986
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0adf }
            apfb r6 = (defpackage.apfb) r6     // Catch:{ all -> 0x0adf }
            apfy r6 = r6.b     // Catch:{ all -> 0x0adf }
            if (r6 == 0) goto L_0x0969
            goto L_0x096b
        L_0x0969:
            apfy r6 = defpackage.apfy.e     // Catch:{ all -> 0x0adf }
        L_0x096b:
            aucs r7 = r3.e     // Catch:{ all -> 0x0adf }
            apfk r9 = r6.d     // Catch:{ all -> 0x0adf }
            if (r9 == 0) goto L_0x0972
            goto L_0x0974
        L_0x0972:
            apfk r9 = defpackage.apfk.c     // Catch:{ all -> 0x0adf }
        L_0x0974:
            int r9 = r9.b     // Catch:{ all -> 0x0adf }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0adf }
            boolean r7 = r7.contains(r9)     // Catch:{ all -> 0x0adf }
            if (r7 != 0) goto L_0x0958
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x0adf }
            r4.add(r6)     // Catch:{ all -> 0x0adf }
            goto L_0x0958
        L_0x0986:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0adf }
        L_0x098a:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0adf }
            if (r4 == 0) goto L_0x099a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0adf }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0adf }
            defpackage.yfu.a((android.database.sqlite.SQLiteDatabase) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0adf }
            goto L_0x098a
        L_0x099a:
            r7 = r38
            goto L_0x0a1f
        L_0x099e:
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0a0f }
            apfy r6 = (defpackage.apfy) r6     // Catch:{ all -> 0x0a0f }
            aucs r7 = r3.e     // Catch:{ all -> 0x0a0f }
            apfk r9 = r6.d     // Catch:{ all -> 0x0a0f }
            if (r9 == 0) goto L_0x09ab
            goto L_0x09ad
        L_0x09ab:
            apfk r9 = defpackage.apfk.c     // Catch:{ all -> 0x0a0f }
        L_0x09ad:
            int r9 = r9.b     // Catch:{ all -> 0x0a0f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0a0f }
            boolean r7 = r7.contains(r9)     // Catch:{ all -> 0x0a0f }
            if (r7 != 0) goto L_0x0a07
            r7 = r38
            r9 = r45
            java.lang.String r10 = a((java.util.List) r7, (java.util.LinkedHashMap) r9, (defpackage.apfy) r6)     // Catch:{ all -> 0x0adf }
            long r11 = r3.d     // Catch:{ all -> 0x0adf }
            a((android.database.sqlite.SQLiteDatabase) r5, (defpackage.apfy) r6, (java.lang.String) r10, (long) r11)     // Catch:{ all -> 0x0adf }
            boolean r11 = defpackage.azaf.c()     // Catch:{ all -> 0x0adf }
            if (r11 != 0) goto L_0x0a03
            azaf r11 = defpackage.azaf.a     // Catch:{ all -> 0x0adf }
            azag r11 = r11.a()     // Catch:{ all -> 0x0adf }
            boolean r11 = r11.b()     // Catch:{ all -> 0x0adf }
            if (r11 == 0) goto L_0x09ff
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0adf }
            r11.<init>()     // Catch:{ all -> 0x0adf }
            java.lang.String r12 = "flagsHash"
            r11.putNull(r12)     // Catch:{ all -> 0x0adf }
            r12 = 3
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ all -> 0x0adf }
            java.lang.String r14 = r6.b     // Catch:{ all -> 0x0adf }
            r15 = 0
            r13[r15] = r14     // Catch:{ all -> 0x0adf }
            long r14 = r6.c     // Catch:{ all -> 0x0adf }
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0adf }
            r14 = 1
            r13[r14] = r6     // Catch:{ all -> 0x0adf }
            r6 = 2
            r13[r6] = r10     // Catch:{ all -> 0x0adf }
            java.lang.String r6 = "ExperimentTokens"
            java.lang.String r10 = "packageName = ? AND version = ? AND user = ? AND isCommitted = 0"
            r5.update(r6, r11, r10, r13)     // Catch:{ all -> 0x0adf }
            goto L_0x0947
        L_0x09ff:
            r12 = 3
            r14 = 1
            goto L_0x0947
        L_0x0a03:
            r12 = 3
            r14 = 1
            goto L_0x0947
        L_0x0a07:
            r7 = r38
            r9 = r45
            r12 = 3
            r14 = 1
            goto L_0x0947
        L_0x0a0f:
            r0 = move-exception
            r7 = r38
            goto L_0x0ae0
        L_0x0a14:
            r0 = move-exception
            r7 = r38
            r3 = r33
            goto L_0x0ae0
        L_0x0a1b:
            r7 = r38
            r3 = r33
        L_0x0a1f:
            r2 = r37
            r2.addAll(r1)     // Catch:{ all -> 0x0adf }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x0adf }
            r1 = r44
            if (r1 == 0) goto L_0x0a3b
            aucs r2 = r3.e     // Catch:{ IOException -> 0x0ad8, all -> 0x0ad1 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0ad8, all -> 0x0ad1 }
            if (r2 <= 0) goto L_0x0a3b
            aucs r2 = r3.e     // Catch:{ IOException -> 0x0ad8, all -> 0x0ad1 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0ad8, all -> 0x0ad1 }
            r1.g = r2     // Catch:{ IOException -> 0x0ad8, all -> 0x0ad1 }
        L_0x0a3b:
            r5.endTransaction()     // Catch:{ IOException -> 0x0ad8, all -> 0x0ad1 }
            defpackage.yfh.a()     // Catch:{ IOException -> 0x0ad8, all -> 0x0ad1 }
            if (r40 == 0) goto L_0x0a56
            boolean r2 = defpackage.azac.b()     // Catch:{ IOException -> 0x0ad8, all -> 0x0ad1 }
            if (r2 == 0) goto L_0x0a53
            long r4 = r40.longValue()     // Catch:{ IOException -> 0x0ad8, all -> 0x0ad1 }
            r2 = r36
            r2.a((long) r4)     // Catch:{ IOException -> 0x0acf, all -> 0x0acd }
            goto L_0x0a58
        L_0x0a53:
            r2 = r36
            goto L_0x0a58
        L_0x0a56:
            r2 = r36
        L_0x0a58:
            if (r8 != 0) goto L_0x0a5b
            goto L_0x0a73
        L_0x0a5b:
            long r4 = r8.longValue()     // Catch:{ IOException -> 0x0acf, all -> 0x0acd }
            ayzv r6 = defpackage.ayzv.a     // Catch:{ IOException -> 0x0acf, all -> 0x0acd }
            ayzw r6 = r6.a()     // Catch:{ IOException -> 0x0acf, all -> 0x0acd }
            long r8 = r6.r()     // Catch:{ IOException -> 0x0acf, all -> 0x0acd }
            long r4 = r4 % r8
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0a73
            r36.f()     // Catch:{ IOException -> 0x0acf, all -> 0x0acd }
        L_0x0a73:
            r36.g()     // Catch:{ IOException -> 0x0acf, all -> 0x0acd }
            aucs r3 = r3.e     // Catch:{ IOException -> 0x0acf, all -> 0x0acd }
            boolean r3 = r3.isEmpty()     // Catch:{ IOException -> 0x0acf, all -> 0x0acd }
            if (r3 != 0) goto L_0x0aa3
            r7 = r43
            boolean r3 = r7.c     // Catch:{ IOException -> 0x0b8d }
            if (r3 != 0) goto L_0x0a85
            goto L_0x0a8b
        L_0x0a85:
            r43.c()     // Catch:{ IOException -> 0x0b8d }
            r3 = 0
            r7.c = r3     // Catch:{ IOException -> 0x0b8d }
        L_0x0a8b:
            aucj r3 = r7.b     // Catch:{ IOException -> 0x0b8d }
            avsz r3 = (defpackage.avsz) r3     // Catch:{ IOException -> 0x0b8d }
            r4 = 9
            r3.c = r4     // Catch:{ IOException -> 0x0b8d }
            int r4 = r3.a     // Catch:{ IOException -> 0x0b8d }
            r5 = 2
            r4 = r4 | r5
            r3.a = r4     // Catch:{ IOException -> 0x0b8d }
            yfy r3 = new yfy     // Catch:{ IOException -> 0x0b8d }
            java.lang.String r4 = "Partial authentication failure"
            r5 = 29504(0x7340, float:4.1344E-41)
            r3.<init>(r5, r4)     // Catch:{ IOException -> 0x0b8d }
            throw r3     // Catch:{ IOException -> 0x0b8d }
        L_0x0aa3:
            r7 = r43
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0bd2 }
            long r3 = r3 - r17
            int r4 = (int) r3     // Catch:{ all -> 0x0bd2 }
            boolean r3 = r7.c     // Catch:{ all -> 0x0bd2 }
            if (r3 != 0) goto L_0x0ab1
            goto L_0x0ab7
        L_0x0ab1:
            r43.c()     // Catch:{ all -> 0x0bd2 }
            r3 = 0
            r7.c = r3     // Catch:{ all -> 0x0bd2 }
        L_0x0ab7:
            aucj r3 = r7.b     // Catch:{ all -> 0x0bd2 }
            avsz r3 = (defpackage.avsz) r3     // Catch:{ all -> 0x0bd2 }
            int r5 = r3.a     // Catch:{ all -> 0x0bd2 }
            r5 = r5 | 16
            r3.a = r5     // Catch:{ all -> 0x0bd2 }
            r3.f = r4     // Catch:{ all -> 0x0bd2 }
            if (r1 == 0) goto L_0x0acb
            int r3 = r38.size()     // Catch:{ all -> 0x0bd2 }
            r1.e = r3     // Catch:{ all -> 0x0bd2 }
        L_0x0acb:
            monitor-exit(r16)     // Catch:{ all -> 0x0bd2 }
            return
        L_0x0acd:
            r0 = move-exception
            goto L_0x0ad4
        L_0x0acf:
            r0 = move-exception
            goto L_0x0adb
        L_0x0ad1:
            r0 = move-exception
            r2 = r36
        L_0x0ad4:
            r7 = r43
            goto L_0x0b93
        L_0x0ad8:
            r0 = move-exception
            r2 = r36
        L_0x0adb:
            r7 = r43
            goto L_0x0b99
        L_0x0adf:
            r0 = move-exception
        L_0x0ae0:
            r2 = r36
            r7 = r43
            r1 = r44
            goto L_0x0b00
        L_0x0ae7:
            r0 = move-exception
            r3 = r4
            r2 = r9
            r7 = r12
            r1 = r13
            r4 = r0
            if (r6 == 0) goto L_0x0af8
            r6.close()     // Catch:{ all -> 0x0af3 }
            goto L_0x0af8
        L_0x0af3:
            r0 = move-exception
            r6 = r0
            defpackage.apev.a((java.lang.Throwable) r4, (java.lang.Throwable) r6)     // Catch:{ all -> 0x0af9 }
        L_0x0af8:
            throw r4     // Catch:{ all -> 0x0af9 }
        L_0x0af9:
            r0 = move-exception
            goto L_0x0b00
        L_0x0afb:
            r0 = move-exception
            r3 = r4
            r2 = r9
            r7 = r12
            r1 = r13
        L_0x0b00:
            r4 = r0
        L_0x0b01:
            if (r1 == 0) goto L_0x0b13
            aucs r6 = r3.e     // Catch:{ IOException -> 0x0b8d }
            int r6 = r6.size()     // Catch:{ IOException -> 0x0b8d }
            if (r6 <= 0) goto L_0x0b13
            aucs r3 = r3.e     // Catch:{ IOException -> 0x0b8d }
            int r3 = r3.size()     // Catch:{ IOException -> 0x0b8d }
            r1.g = r3     // Catch:{ IOException -> 0x0b8d }
        L_0x0b13:
            r5.endTransaction()     // Catch:{ IOException -> 0x0b8d }
            throw r4     // Catch:{ IOException -> 0x0b8d }
        L_0x0b17:
            r2 = r9
            r7 = r12
            r1 = r13
            boolean r3 = r7.c     // Catch:{ IOException -> 0x0b8d }
            if (r3 != 0) goto L_0x0b1f
            goto L_0x0b25
        L_0x0b1f:
            r43.c()     // Catch:{ IOException -> 0x0b8d }
            r3 = 0
            r7.c = r3     // Catch:{ IOException -> 0x0b8d }
        L_0x0b25:
            aucj r3 = r7.b     // Catch:{ IOException -> 0x0b8d }
            avsz r3 = (defpackage.avsz) r3     // Catch:{ IOException -> 0x0b8d }
            r4 = 11
            r3.c = r4     // Catch:{ IOException -> 0x0b8d }
            int r4 = r3.a     // Catch:{ IOException -> 0x0b8d }
            r5 = 2
            r4 = r4 | r5
            r3.a = r4     // Catch:{ IOException -> 0x0b8d }
            throw r8     // Catch:{ IOException -> 0x0b8d }
        L_0x0b34:
            r0 = move-exception
            r2 = r9
            r7 = r12
            r1 = r13
            r3 = r0
        L_0x0b39:
            r8 = r5
            goto L_0x0b6b
        L_0x0b3b:
            r0 = move-exception
            r2 = r9
            r7 = r12
            r1 = r13
            r3 = r0
        L_0x0b40:
            r8 = r5
            goto L_0x0b51
        L_0x0b42:
            r0 = move-exception
            r2 = r9
            r7 = r12
            r1 = r13
            r4 = 0
            r3 = r0
            r8 = r4
            goto L_0x0b6b
        L_0x0b4a:
            r0 = move-exception
            r2 = r9
            r7 = r12
            r1 = r13
            r4 = 0
            r3 = r0
            r8 = r4
        L_0x0b51:
            boolean r4 = r7.c     // Catch:{ all -> 0x0b69 }
            if (r4 != 0) goto L_0x0b56
            goto L_0x0b5c
        L_0x0b56:
            r43.c()     // Catch:{ all -> 0x0b69 }
            r4 = 0
            r7.c = r4     // Catch:{ all -> 0x0b69 }
        L_0x0b5c:
            aucj r4 = r7.b     // Catch:{ all -> 0x0b69 }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ all -> 0x0b69 }
            r5 = 2
            r4.c = r5     // Catch:{ all -> 0x0b69 }
            int r6 = r4.a     // Catch:{ all -> 0x0b69 }
            r5 = r5 | r6
            r4.a = r5     // Catch:{ all -> 0x0b69 }
            throw r3     // Catch:{ all -> 0x0b69 }
        L_0x0b69:
            r0 = move-exception
            r3 = r0
        L_0x0b6b:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0b8d }
            long r4 = r4 - r23
            int r5 = (int) r4     // Catch:{ IOException -> 0x0b8d }
            boolean r4 = r7.c     // Catch:{ IOException -> 0x0b8d }
            if (r4 != 0) goto L_0x0b77
            goto L_0x0b7d
        L_0x0b77:
            r43.c()     // Catch:{ IOException -> 0x0b8d }
            r4 = 0
            r7.c = r4     // Catch:{ IOException -> 0x0b8d }
        L_0x0b7d:
            aucj r4 = r7.b     // Catch:{ IOException -> 0x0b8d }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ IOException -> 0x0b8d }
            int r6 = r4.a     // Catch:{ IOException -> 0x0b8d }
            r6 = r6 | 8
            r4.a = r6     // Catch:{ IOException -> 0x0b8d }
            r4.e = r5     // Catch:{ IOException -> 0x0b8d }
            r2.a((defpackage.yiy) r8)     // Catch:{ IOException -> 0x0b8d }
            throw r3     // Catch:{ IOException -> 0x0b8d }
        L_0x0b8d:
            r0 = move-exception
            goto L_0x0b99
        L_0x0b8f:
            r0 = move-exception
            r2 = r9
            r7 = r12
            r1 = r13
        L_0x0b93:
            r3 = r0
            goto L_0x0ba6
        L_0x0b95:
            r0 = move-exception
            r2 = r9
            r7 = r12
            r1 = r13
        L_0x0b99:
            r3 = r0
        L_0x0b9a:
            yfy r4 = new yfy     // Catch:{ all -> 0x0ba4 }
            java.lang.String r5 = "Network error"
            r6 = 29504(0x7340, float:4.1344E-41)
            r4.<init>(r6, r5, r3)     // Catch:{ all -> 0x0ba4 }
            throw r4     // Catch:{ all -> 0x0ba4 }
        L_0x0ba4:
            r0 = move-exception
            goto L_0x0b93
        L_0x0ba6:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0bd2 }
            long r4 = r4 - r17
            int r5 = (int) r4     // Catch:{ all -> 0x0bd2 }
            boolean r4 = r7.c     // Catch:{ all -> 0x0bd2 }
            if (r4 != 0) goto L_0x0bb2
            goto L_0x0bb8
        L_0x0bb2:
            r43.c()     // Catch:{ all -> 0x0bd2 }
            r4 = 0
            r7.c = r4     // Catch:{ all -> 0x0bd2 }
        L_0x0bb8:
            aucj r4 = r7.b     // Catch:{ all -> 0x0bd2 }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ all -> 0x0bd2 }
            int r6 = r4.a     // Catch:{ all -> 0x0bd2 }
            r6 = r6 | 16
            r4.a = r6     // Catch:{ all -> 0x0bd2 }
            r4.f = r5     // Catch:{ all -> 0x0bd2 }
            if (r1 == 0) goto L_0x0bcc
            int r4 = r38.size()     // Catch:{ all -> 0x0bd2 }
            r1.e = r4     // Catch:{ all -> 0x0bd2 }
        L_0x0bcc:
            throw r3     // Catch:{ all -> 0x0bd2 }
        L_0x0bcd:
            r0 = move-exception
            r2 = r9
        L_0x0bcf:
            r1 = r0
        L_0x0bd0:
            monitor-exit(r16)     // Catch:{ all -> 0x0bd2 }
            throw r1
        L_0x0bd2:
            r0 = move-exception
            goto L_0x0bcf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yiu.a(java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, aucd, yit, java.util.LinkedHashMap, boolean):void");
    }

    private static final boolean a(String str, SQLiteDatabase sQLiteDatabase, SQLiteStatement sQLiteStatement, apfc apfc) {
        int i2;
        aucx aucx;
        String str2;
        Throwable th;
        byte[] bArr;
        int i3;
        apfw apfw;
        aucx aucx2;
        long j2;
        long j3;
        int i4;
        String str3;
        int i5;
        int i6;
        aucx aucx3;
        int i7;
        int i8;
        String str4 = str;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        SQLiteStatement sQLiteStatement2 = sQLiteStatement;
        apfc apfc2 = apfc;
        apfy apfy = apfc2.b;
        if (apfy == null) {
            apfy = apfy.e;
        }
        String str5 = apfy.b;
        apfy apfy2 = apfc2.b;
        if (apfy2 == null) {
            apfy2 = apfy.e;
        }
        long j4 = apfy2.c;
        aucx aucx4 = apfc2.c;
        int size = aucx4.size();
        int i9 = 0;
        while (i9 < size) {
            apfw apfw2 = (apfw) aucx4.get(i9);
            int a2 = apfv.a(apfw2.c);
            if (a2 == 0) {
                i8 = i9;
                aucx3 = aucx4;
                i7 = size;
            } else if (a2 == 3) {
                apfx apfx = apfw2.a;
                if (apfx == null) {
                    apfx = apfx.d;
                }
                aucx3 = aucx4;
                apfw apfw3 = apfw2;
                i7 = size;
                String str6 = "ApplicationTags";
                i8 = i9;
                a(sQLiteDatabase, str5, j4, str, apfx.b);
                apfx apfx2 = apfw3.a;
                String[] strArr = new String[4];
                strArr[0] = str5;
                strArr[1] = Long.toString(j4);
                strArr[2] = str4;
                apfx apfx3 = apfw3.a;
                if (apfx3 == null) {
                    apfx3 = apfx.d;
                }
                strArr[3] = Long.toString(apfx3.b);
                sQLiteDatabase2.delete(str6, "packageName = ? AND version = ? AND user = ? AND partitionId = ?", strArr);
            } else {
                i8 = i9;
                aucx3 = aucx4;
                i7 = size;
            }
            i9 = i8 + 1;
            size = i7;
            aucx4 = aucx3;
        }
        String str7 = "ApplicationTags";
        int i10 = 0;
        aucx aucx5 = apfc2.c;
        int size2 = aucx5.size();
        int i11 = 0;
        while (i11 < size2) {
            apfw apfw4 = (apfw) aucx5.get(i11);
            aucx aucx6 = apfw4.b;
            int size3 = aucx6.size();
            while (true) {
                i4 = i11 + 1;
                if (i10 >= size3) {
                    break;
                }
                apft apft = (apft) aucx6.get(i10);
                aucx aucx7 = aucx5;
                if (apft.h) {
                    String str8 = apft.a;
                    apfx apfx4 = apfw4.a;
                    if (apfx4 == null) {
                        apfx4 = apfx.d;
                    }
                    i5 = size2;
                    long j5 = apfx4.b;
                    str3 = str7;
                    String[] strArr2 = new String[6];
                    strArr2[0] = str5;
                    strArr2[1] = Long.toString(j4);
                    strArr2[2] = str4;
                    apfx apfx5 = apfw4.a;
                    if (apfx5 == null) {
                        apfx5 = apfx.d;
                    }
                    i6 = i10;
                    strArr2[3] = Long.toString(apfx5.b);
                    strArr2[4] = apft.a;
                    strArr2[5] = Integer.toString(apft.i);
                    sQLiteDatabase2.delete("Flags", "packageName = ? AND version = ? AND user = ? AND partitionId = ? AND name = ? AND flagType = ? AND committed = 0", strArr2);
                } else {
                    i5 = size2;
                    str3 = str7;
                    i6 = i10;
                }
                i10 = i6 + 1;
                aucx5 = aucx7;
                size2 = i5;
                str7 = str3;
            }
            aucx aucx8 = aucx5;
            int i12 = size2;
            String str9 = str7;
            i11 = i4;
            i10 = 0;
        }
        String str10 = str7;
        aucx aucx9 = apfc2.c;
        int size4 = aucx9.size();
        int i13 = 0;
        boolean z = false;
        while (i13 < size4) {
            apfw apfw5 = (apfw) aucx9.get(i13);
            int a3 = apfv.a(apfw5.c);
            if (a3 != 0 && a3 == 3) {
                i2 = i13;
                aucx = aucx9;
                str2 = str10;
                z = true;
            } else {
                apfx apfx6 = apfw5.a;
                if (apfx6 == null) {
                    apfx6 = apfx.d;
                }
                long j6 = apfx6.b;
                apfx apfx7 = apfw5.a;
                if (apfx7 == null) {
                    apfx7 = apfx.d;
                }
                byte[] k2 = apfx7.c.k();
                if (k2 == null) {
                    i2 = i13;
                    aucx = aucx9;
                    str2 = str10;
                } else if (k2.length != 0) {
                    long j7 = j6;
                    long j8 = j7;
                    byte[] bArr2 = k2;
                    String str11 = str10;
                    apfw apfw6 = apfw5;
                    i2 = i13;
                    aucx = aucx9;
                    String str12 = "tag";
                    Cursor query = sQLiteDatabase.query("ApplicationTags", new String[]{"tag"}, "packageName = ? AND version = ? AND partitionId = ? AND user = ?", new String[]{str5, Long.toString(j4), Long.toString(j6), str4}, (String) null, (String) null, (String) null);
                    try {
                        if (query.moveToFirst()) {
                            bArr = bArr2;
                            if (Arrays.equals(bArr, query.getBlob(0))) {
                                if (query != null) {
                                    query.close();
                                    str2 = str11;
                                } else {
                                    str2 = str11;
                                }
                            }
                        } else {
                            bArr = bArr2;
                        }
                        if (query != null) {
                            query.close();
                        }
                        Long valueOf = Long.valueOf(j4);
                        Long valueOf2 = Long.valueOf(j8);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("packageName", str5);
                        contentValues.put("version", valueOf);
                        contentValues.put("partitionId", valueOf2);
                        contentValues.put("user", str4);
                        contentValues.put(str12, bArr);
                        str2 = str11;
                        sQLiteDatabase2.insertWithOnConflict(str2, (String) null, contentValues, 5);
                        apfw apfw7 = apfw6;
                        int a4 = apfv.a(apfw7.c);
                        if (a4 == 0 || a4 == 1) {
                            apfw = apfw7;
                            i3 = 5;
                            a(sQLiteDatabase, str5, j4, str, j8);
                        } else {
                            apfw = apfw7;
                            i3 = 5;
                        }
                        aucx aucx10 = apfw.b;
                        int size5 = aucx10.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            apft apft2 = (apft) aucx10.get(i14);
                            if (!apft2.h) {
                                sQLiteStatement.clearBindings();
                                sQLiteStatement2.bindString(1, str5);
                                sQLiteStatement2.bindLong(2, j4);
                                sQLiteStatement2.bindLong(3, (long) apft2.i);
                                j2 = j8;
                                sQLiteStatement2.bindLong(4, j2);
                                sQLiteStatement2.bindString(i3, str4);
                                sQLiteStatement2.bindString(6, apft2.a);
                                sQLiteStatement2.bindLong(7, 0);
                                int a5 = apfs.a(apft2.g);
                                if (a5 == 0) {
                                    a5 = 1;
                                }
                                int i15 = a5 - 1;
                                if (i15 == 1) {
                                    aucx2 = aucx10;
                                    sQLiteStatement2.bindLong(8, apft2.b);
                                } else if (i15 == 2) {
                                    aucx2 = aucx10;
                                    if (!apft2.c) {
                                        j3 = 0;
                                    } else {
                                        j3 = 1;
                                    }
                                    sQLiteStatement2.bindLong(9, j3);
                                } else if (i15 == 3) {
                                    aucx2 = aucx10;
                                    sQLiteStatement2.bindDouble(10, apft2.d);
                                } else if (i15 == 4) {
                                    aucx2 = aucx10;
                                    sQLiteStatement2.bindString(11, apft2.e);
                                } else if (i15 != 5) {
                                    aucx2 = aucx10;
                                    ((anih) ((anih) a.c()).a("yiu", "a", 2331, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Value type not set for flag %s, ignoring", (Object) apft2.a);
                                } else {
                                    aucx2 = aucx10;
                                    apfq apfq = apft2.f;
                                    if (apfq == null) {
                                        apfq = apfq.b;
                                    }
                                    sQLiteStatement2.bindBlob(12, apfq.a.k());
                                }
                                String str13 = apft2.a;
                                sQLiteStatement.execute();
                            } else {
                                aucx2 = aucx10;
                                j2 = j8;
                            }
                            i14++;
                            str4 = str;
                            j8 = j2;
                            aucx10 = aucx2;
                            i3 = 5;
                        }
                        z = true;
                    } catch (Throwable th2) {
                        apev.a(th, th2);
                    }
                } else {
                    i2 = i13;
                    aucx = aucx9;
                    str2 = str10;
                }
            }
            i13 = i2 + 1;
            str4 = str;
            sQLiteDatabase2 = sQLiteDatabase;
            str10 = str2;
            aucx9 = aucx;
        }
        return z;
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0338, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0339, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x033a, code lost:
        if (r13 != null) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0340, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        defpackage.apev.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x051c, code lost:
        if (r1 != null) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0528, code lost:
        if (r1 != null) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0570, code lost:
        if (r1 != null) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0578, code lost:
        if (r1 != null) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05ca, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05cb, code lost:
        if (r1 != null) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        defpackage.apev.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05d8, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05d9, code lost:
        if (r1 != null) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:?, code lost:
        defpackage.apev.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05e6, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05e7, code lost:
        if (r1 != null) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        defpackage.apev.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05f4, code lost:
        r3.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05f7, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:64:0x01a1, B:137:0x033c, B:146:0x0369, B:222:0x0514, B:227:0x051e, B:240:0x0562, B:266:0x05cd, B:276:0x05db, B:286:0x05e9] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04c5 A[Catch:{ all -> 0x05e5, all -> 0x05ed, all -> 0x05d7, all -> 0x05df, all -> 0x05c9, all -> 0x05d1, all -> 0x0338, all -> 0x0340, all -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04c6 A[Catch:{ all -> 0x05e5, all -> 0x05ed, all -> 0x05d7, all -> 0x05df, all -> 0x05c9, all -> 0x05d1, all -> 0x0338, all -> 0x0340, all -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04d8 A[Catch:{ all -> 0x05e5, all -> 0x05ed, all -> 0x05d7, all -> 0x05df, all -> 0x05c9, all -> 0x05d1, all -> 0x0338, all -> 0x0340, all -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04eb A[Catch:{ all -> 0x05e5, all -> 0x05ed, all -> 0x05d7, all -> 0x05df, all -> 0x05c9, all -> 0x05d1, all -> 0x0338, all -> 0x0340, all -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04ec A[Catch:{ all -> 0x05e5, all -> 0x05ed, all -> 0x05d7, all -> 0x05df, all -> 0x05c9, all -> 0x05d1, all -> 0x0338, all -> 0x0340, all -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0576 A[SYNTHETIC, Splitter:B:248:0x0576] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0586 A[Catch:{ all -> 0x05e5, all -> 0x05ed, all -> 0x05d7, all -> 0x05df, all -> 0x05c9, all -> 0x05d1, all -> 0x0338, all -> 0x0340, all -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0587 A[Catch:{ all -> 0x05e5, all -> 0x05ed, all -> 0x05d7, all -> 0x05df, all -> 0x05c9, all -> 0x05d1, all -> 0x0338, all -> 0x0340, all -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05a0 A[Catch:{ all -> 0x05e5, all -> 0x05ed, all -> 0x05d7, all -> 0x05df, all -> 0x05c9, all -> 0x05d1, all -> 0x0338, all -> 0x0340, all -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x05a1 A[Catch:{ all -> 0x05e5, all -> 0x05ed, all -> 0x05d7, all -> 0x05df, all -> 0x05c9, all -> 0x05d1, all -> 0x0338, all -> 0x0340, all -> 0x05f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.apfo a(java.util.List r23, int r24, java.lang.String r25, boolean r26, java.util.LinkedHashMap r27, boolean r28, defpackage.aucd r29) {
        /*
            r22 = this;
            r1 = r22
            r0 = r25
            r2 = r27
            r3 = r29
            apfo r4 = defpackage.apfo.h
            aucd r4 = r4.o()
            apfd r5 = defpackage.apfd.h
            aucd r5 = r5.o()
            bapu r6 = r1.j
            r7 = 0
            if (r6 == 0) goto L_0x003f
            java.lang.Object r6 = r6.a()
            if (r6 == 0) goto L_0x003f
            bapu r6 = r1.j
            java.lang.Object r6 = r6.a()
            apfz r6 = (defpackage.apfz) r6
            boolean r8 = r5.c
            if (r8 == 0) goto L_0x0030
            r5.c()
            r5.c = r7
        L_0x0030:
            aucj r8 = r5.b
            apfd r8 = (defpackage.apfd) r8
            r6.getClass()
            r8.g = r6
            int r6 = r8.a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r8.a = r6
        L_0x003f:
            java.lang.String r6 = ""
            r8 = 2
            if (r28 != 0) goto L_0x0068
            java.lang.Object r9 = defpackage.anbs.b(r23)
            boolean r9 = r6.equals(r9)
            if (r9 != 0) goto L_0x0051
            r9 = 1
            goto L_0x0053
        L_0x0051:
            r9 = 0
        L_0x0053:
            boolean r11 = r5.c
            if (r11 != 0) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            r5.c()
            r5.c = r7
        L_0x005d:
            aucj r11 = r5.b
            apfd r11 = (defpackage.apfd) r11
            int r12 = r11.a
            r12 = r12 | r8
            r11.a = r12
            r11.b = r9
        L_0x0068:
            boolean r9 = r4.c
            if (r9 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r4.c()
            r4.c = r7
        L_0x0072:
            aucj r9 = r4.b
            apfo r9 = (defpackage.apfo) r9
            int r10 = r24 + -1
            if (r24 == 0) goto L_0x05fb
            r9.e = r10
            int r10 = r9.a
            r12 = 4
            r10 = r10 | r12
            r9.a = r10
            if (r0 == 0) goto L_0x008d
            r25.getClass()
            r10 = r10 | 8
            r9.a = r10
            r9.f = r0
        L_0x008d:
            int r0 = r1.k
            int r13 = r0 + -1
            if (r0 == 0) goto L_0x05f8
            r0 = r10 | 16
            r9.a = r0
            r9.g = r13
            agwa r0 = r1.i     // Catch:{ yfy -> 0x00a0 }
            java.lang.String r0 = r0.a()     // Catch:{ yfy -> 0x00a0 }
            goto L_0x00e0
        L_0x00a0:
            r0 = move-exception
            boolean r9 = defpackage.azaf.l()
            if (r9 == 0) goto L_0x00c1
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r29.c()
            r3.c = r7
        L_0x00b1:
            aucj r2 = r3.b
            avsz r2 = (defpackage.avsz) r2
            avsz r3 = defpackage.avsz.h
            r3 = 10
            r2.c = r3
            int r3 = r2.a
            r3 = r3 | r8
            r2.a = r3
            throw r0
        L_0x00c1:
            jjg r3 = a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r0)
            r0 = 1015(0x3f7, float:1.422E-42)
            java.lang.String r9 = "yiu"
            java.lang.String r10 = "a"
            java.lang.String r13 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r3.a((java.lang.String) r9, (java.lang.String) r10, (int) r0, (java.lang.String) r13)
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = "Skip getting Pseudonymous ID error."
            r0.a((java.lang.String) r3)
            r0 = 0
        L_0x00e0:
            if (r0 != 0) goto L_0x00e3
            goto L_0x00fc
        L_0x00e3:
            boolean r3 = r5.c
            if (r3 != 0) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            r5.c()
            r5.c = r7
        L_0x00ed:
            aucj r3 = r5.b
            apfd r3 = (defpackage.apfd) r3
            r0.getClass()
            int r9 = r3.a
            r9 = r9 | 16
            r3.a = r9
            r3.d = r0
        L_0x00fc:
            avrf r0 = defpackage.avrf.e
            aucd r0 = r0.o()
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0107
            goto L_0x010c
        L_0x0107:
            r0.c()
            r0.c = r7
        L_0x010c:
            aucj r3 = r0.b
            avrf r3 = (defpackage.avrf) r3
            r3.b = r12
            int r9 = r3.a
            r10 = 1
            r9 = r9 | r10
            r3.a = r9
            avrb r3 = r22.c()
            boolean r9 = r0.c
            if (r9 != 0) goto L_0x0121
            goto L_0x0126
        L_0x0121:
            r0.c()
            r0.c = r7
        L_0x0126:
            aucj r9 = r0.b
            avrf r9 = (defpackage.avrf) r9
            r3.getClass()
            r9.c = r3
            int r3 = r9.a
            r3 = r3 | 8
            r9.a = r3
            aucj r0 = r0.i()
            avrf r0 = (defpackage.avrf) r0
            boolean r3 = r5.c
            if (r3 != 0) goto L_0x0140
            goto L_0x0145
        L_0x0140:
            r5.c()
            r5.c = r7
        L_0x0145:
            aucj r3 = r5.b
            apfd r3 = (defpackage.apfd) r3
            r0.getClass()
            r3.c = r0
            int r0 = r3.a
            r0 = r0 | 8
            r3.a = r0
            r0 = r0 | 64
            r3.a = r0
            r9 = r26
            r3.f = r9
            yfw r0 = r1.d
            android.database.sqlite.SQLiteDatabase r3 = r0.getWritableDatabase()
            r3.beginTransaction()
            boolean r0 = defpackage.azaf.d()     // Catch:{ all -> 0x05f3 }
            java.lang.String r9 = "__internal."
            java.lang.String r13 = "dynamicParams"
            java.lang.String r14 = "params"
            java.lang.String r15 = "version"
            java.lang.String r16 = "packageName"
            r11 = 3
            if (r0 != 0) goto L_0x017a
            r21 = r5
            goto L_0x0348
        L_0x017a:
            boolean r0 = defpackage.ayyd.b()     // Catch:{ all -> 0x05f3 }
            if (r0 == 0) goto L_0x0346
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x05f3 }
            r0[r7] = r16     // Catch:{ all -> 0x05f3 }
            r0[r10] = r15     // Catch:{ all -> 0x05f3 }
            r0[r8] = r14     // Catch:{ all -> 0x05f3 }
            r0[r11] = r13     // Catch:{ all -> 0x05f3 }
            java.lang.String r13 = "configTier"
            r0[r12] = r13     // Catch:{ all -> 0x05f3 }
            java.lang.String r14 = "Packages"
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r13 = r3
            r15 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x05f3 }
            amzt r0 = new amzt     // Catch:{ all -> 0x0338 }
            r0.<init>()     // Catch:{ all -> 0x0338 }
        L_0x01a6:
            boolean r14 = r13.moveToNext()     // Catch:{ all -> 0x0338 }
            if (r14 == 0) goto L_0x032b
            java.lang.String r14 = r13.getString(r7)     // Catch:{ all -> 0x0338 }
            boolean r15 = r14.startsWith(r9)     // Catch:{ all -> 0x0338 }
            if (r15 != 0) goto L_0x0320
            long r11 = r13.getLong(r10)     // Catch:{ all -> 0x0338 }
            byte[] r15 = r13.getBlob(r8)     // Catch:{ all -> 0x0338 }
            r8 = 3
            byte[] r16 = r13.getBlob(r8)     // Catch:{ all -> 0x0338 }
            r8 = 4
            int r17 = r13.getInt(r8)     // Catch:{ all -> 0x0338 }
            int r8 = defpackage.apff.a(r17)     // Catch:{ all -> 0x0338 }
            java.util.Iterator r17 = r23.iterator()     // Catch:{ all -> 0x0338 }
        L_0x01d0:
            boolean r18 = r17.hasNext()     // Catch:{ all -> 0x0338 }
            if (r18 == 0) goto L_0x0315
            java.lang.Object r18 = r17.next()     // Catch:{ all -> 0x0338 }
            r10 = r18
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0338 }
            apfb r18 = defpackage.apfb.g     // Catch:{ all -> 0x0338 }
            aucd r18 = r18.o()     // Catch:{ all -> 0x0338 }
            r7 = r18
            apfa r7 = (defpackage.apfa) r7     // Catch:{ all -> 0x0338 }
            apfy r18 = defpackage.apfy.e     // Catch:{ all -> 0x0338 }
            aucd r1 = r18.o()     // Catch:{ all -> 0x0338 }
            r26 = r15
            boolean r15 = r1.c     // Catch:{ all -> 0x0338 }
            if (r15 != 0) goto L_0x01f5
            goto L_0x01fb
        L_0x01f5:
            r1.c()     // Catch:{ all -> 0x0338 }
            r15 = 0
            r1.c = r15     // Catch:{ all -> 0x0338 }
        L_0x01fb:
            aucj r15 = r1.b     // Catch:{ all -> 0x0338 }
            apfy r15 = (defpackage.apfy) r15     // Catch:{ all -> 0x0338 }
            r14.getClass()     // Catch:{ all -> 0x0338 }
            r21 = r5
            int r5 = r15.a     // Catch:{ all -> 0x0338 }
            r18 = 1
            r5 = r5 | 1
            r15.a = r5     // Catch:{ all -> 0x0338 }
            r15.b = r14     // Catch:{ all -> 0x0338 }
            r5 = r5 | 2
            r15.a = r5     // Catch:{ all -> 0x0338 }
            r15.c = r11     // Catch:{ all -> 0x0338 }
            if (r2 == 0) goto L_0x027e
            apfk r5 = defpackage.apfk.c     // Catch:{ all -> 0x0338 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x0338 }
            boolean r15 = r6.equals(r10)     // Catch:{ all -> 0x0338 }
            if (r15 == 0) goto L_0x023e
            boolean r15 = r5.c     // Catch:{ all -> 0x0338 }
            if (r15 != 0) goto L_0x0227
        L_0x0226:
            goto L_0x022e
        L_0x0227:
            r5.c()     // Catch:{ all -> 0x0338 }
            r15 = 0
            r5.c = r15     // Catch:{ all -> 0x0338 }
            goto L_0x0226
        L_0x022e:
            aucj r15 = r5.b     // Catch:{ all -> 0x0338 }
            apfk r15 = (defpackage.apfk) r15     // Catch:{ all -> 0x0338 }
            r18 = r11
            int r11 = r15.a     // Catch:{ all -> 0x0338 }
            r12 = 1
            r11 = r11 | r12
            r15.a = r11     // Catch:{ all -> 0x0338 }
            r11 = -1
            r15.b = r11     // Catch:{ all -> 0x0338 }
            goto L_0x025d
        L_0x023e:
            r18 = r11
            int r11 = a((java.util.LinkedHashMap) r2, (java.lang.String) r10)     // Catch:{ all -> 0x0338 }
            boolean r12 = r5.c     // Catch:{ all -> 0x0338 }
            if (r12 != 0) goto L_0x0249
            goto L_0x024f
        L_0x0249:
            r5.c()     // Catch:{ all -> 0x0338 }
            r12 = 0
            r5.c = r12     // Catch:{ all -> 0x0338 }
        L_0x024f:
            aucj r12 = r5.b     // Catch:{ all -> 0x0338 }
            apfk r12 = (defpackage.apfk) r12     // Catch:{ all -> 0x0338 }
            int r15 = r12.a     // Catch:{ all -> 0x0338 }
            r20 = 1
            r15 = r15 | 1
            r12.a = r15     // Catch:{ all -> 0x0338 }
            r12.b = r11     // Catch:{ all -> 0x0338 }
        L_0x025d:
            boolean r11 = r1.c     // Catch:{ all -> 0x0338 }
            if (r11 != 0) goto L_0x0262
            goto L_0x0268
        L_0x0262:
            r1.c()     // Catch:{ all -> 0x0338 }
            r11 = 0
            r1.c = r11     // Catch:{ all -> 0x0338 }
        L_0x0268:
            aucj r11 = r1.b     // Catch:{ all -> 0x0338 }
            apfy r11 = (defpackage.apfy) r11     // Catch:{ all -> 0x0338 }
            aucj r5 = r5.i()     // Catch:{ all -> 0x0338 }
            apfk r5 = (defpackage.apfk) r5     // Catch:{ all -> 0x0338 }
            r5.getClass()     // Catch:{ all -> 0x0338 }
            r11.d = r5     // Catch:{ all -> 0x0338 }
            int r5 = r11.a     // Catch:{ all -> 0x0338 }
            r12 = 4
            r5 = r5 | r12
            r11.a = r5     // Catch:{ all -> 0x0338 }
            goto L_0x0280
        L_0x027e:
            r18 = r11
        L_0x0280:
            if (r16 == 0) goto L_0x0285
            r5 = r16
            goto L_0x0287
        L_0x0285:
            r5 = r26
        L_0x0287:
            if (r5 != 0) goto L_0x028a
            goto L_0x02a8
        L_0x028a:
            auay r5 = defpackage.auay.a((byte[]) r5)     // Catch:{ all -> 0x0338 }
            boolean r11 = r7.c     // Catch:{ all -> 0x0338 }
            if (r11 != 0) goto L_0x0293
            goto L_0x0299
        L_0x0293:
            r7.c()     // Catch:{ all -> 0x0338 }
            r11 = 0
            r7.c = r11     // Catch:{ all -> 0x0338 }
        L_0x0299:
            aucj r11 = r7.b     // Catch:{ all -> 0x0338 }
            apfb r11 = (defpackage.apfb) r11     // Catch:{ all -> 0x0338 }
            r5.getClass()     // Catch:{ all -> 0x0338 }
            int r12 = r11.a     // Catch:{ all -> 0x0338 }
            r15 = 2
            r12 = r12 | r15
            r11.a = r12     // Catch:{ all -> 0x0338 }
            r11.c = r5     // Catch:{ all -> 0x0338 }
        L_0x02a8:
            aucj r1 = r1.i()     // Catch:{ all -> 0x0338 }
            apfy r1 = (defpackage.apfy) r1     // Catch:{ all -> 0x0338 }
            boolean r5 = r7.c     // Catch:{ all -> 0x0338 }
            if (r5 != 0) goto L_0x02b3
            goto L_0x02b9
        L_0x02b3:
            r7.c()     // Catch:{ all -> 0x0338 }
            r5 = 0
            r7.c = r5     // Catch:{ all -> 0x0338 }
        L_0x02b9:
            aucj r5 = r7.b     // Catch:{ all -> 0x0338 }
            apfb r5 = (defpackage.apfb) r5     // Catch:{ all -> 0x0338 }
            r1.getClass()     // Catch:{ all -> 0x0338 }
            r5.b = r1     // Catch:{ all -> 0x0338 }
            int r11 = r5.a     // Catch:{ all -> 0x0338 }
            r12 = 1
            r11 = r11 | r12
            r5.a = r11     // Catch:{ all -> 0x0338 }
            boolean r5 = defpackage.ayzv.d()     // Catch:{ all -> 0x0338 }
            if (r5 != 0) goto L_0x02d8
            a((android.database.sqlite.SQLiteDatabase) r3, (defpackage.apfa) r7, (java.lang.String) r10)     // Catch:{ all -> 0x0338 }
            amzy r1 = a((android.database.sqlite.SQLiteDatabase) r3, (defpackage.apfy) r1, (java.lang.String) r10)     // Catch:{ all -> 0x0338 }
            r7.a(r1)     // Catch:{ all -> 0x0338 }
        L_0x02d8:
            if (r8 == 0) goto L_0x0312
            r1 = 3
            if (r8 != r1) goto L_0x02e5
            boolean r1 = r10.equals(r6)     // Catch:{ all -> 0x0338 }
            if (r1 != 0) goto L_0x02e5
            r1 = 1
            goto L_0x02e6
        L_0x02e5:
            r1 = 0
        L_0x02e6:
            boolean r5 = r7.c     // Catch:{ all -> 0x0338 }
            if (r5 != 0) goto L_0x02eb
            goto L_0x02f1
        L_0x02eb:
            r7.c()     // Catch:{ all -> 0x0338 }
            r5 = 0
            r7.c = r5     // Catch:{ all -> 0x0338 }
        L_0x02f1:
            aucj r5 = r7.b     // Catch:{ all -> 0x0338 }
            apfb r5 = (defpackage.apfb) r5     // Catch:{ all -> 0x0338 }
            int r10 = r5.a     // Catch:{ all -> 0x0338 }
            r10 = r10 | 8
            r5.a = r10     // Catch:{ all -> 0x0338 }
            r5.f = r1     // Catch:{ all -> 0x0338 }
            aucj r1 = r7.i()     // Catch:{ all -> 0x0338 }
            apfb r1 = (defpackage.apfb) r1     // Catch:{ all -> 0x0338 }
            r0.c(r1)     // Catch:{ all -> 0x0338 }
            r1 = r22
            r15 = r26
            r11 = r18
            r5 = r21
            r7 = 0
            r10 = 1
            goto L_0x01d0
        L_0x0312:
            r1 = 0
            throw r1     // Catch:{ all -> 0x0338 }
        L_0x0315:
            r21 = r5
            r1 = r22
            r7 = 0
            r8 = 2
            r10 = 1
            r11 = 3
            r12 = 4
            goto L_0x01a6
        L_0x0320:
            r21 = r5
            r1 = r22
            r7 = 0
            r8 = 2
            r10 = 1
            r11 = 3
            r12 = 4
            goto L_0x01a6
        L_0x032b:
            r21 = r5
            amzy r0 = r0.a()     // Catch:{ all -> 0x0338 }
            if (r13 == 0) goto L_0x04c1
            r13.close()     // Catch:{ all -> 0x05f3 }
            goto L_0x04c1
        L_0x0338:
            r0 = move-exception
            r1 = r0
            if (r13 == 0) goto L_0x0345
            r13.close()     // Catch:{ all -> 0x0340 }
            goto L_0x0345
        L_0x0340:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x05f3 }
        L_0x0345:
            throw r1     // Catch:{ all -> 0x05f3 }
        L_0x0346:
            r21 = r5
        L_0x0348:
            r1 = 4
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ all -> 0x05f3 }
            r1 = 0
            r0[r1] = r16     // Catch:{ all -> 0x05f3 }
            r1 = 1
            r0[r1] = r15     // Catch:{ all -> 0x05f3 }
            r1 = 2
            r0[r1] = r14     // Catch:{ all -> 0x05f3 }
            r1 = 3
            r0[r1] = r13     // Catch:{ all -> 0x05f3 }
            java.lang.String r14 = "Packages"
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r13 = r3
            r15 = r0
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x05f3 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            int r5 = r1.getCount()     // Catch:{ all -> 0x05e5 }
            r0.<init>(r5)     // Catch:{ all -> 0x05e5 }
        L_0x0372:
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x05e5 }
            if (r5 == 0) goto L_0x04ba
            r5 = 0
            java.lang.String r7 = r1.getString(r5)     // Catch:{ all -> 0x05e5 }
            boolean r5 = r7.startsWith(r9)     // Catch:{ all -> 0x05e5 }
            if (r5 != 0) goto L_0x04b6
            java.util.Iterator r5 = r23.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x0387:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r7 == 0) goto L_0x04b2
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x05e5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x05e5 }
            apfb r8 = defpackage.apfb.g     // Catch:{ all -> 0x05e5 }
            aucd r8 = r8.o()     // Catch:{ all -> 0x05e5 }
            apfa r8 = (defpackage.apfa) r8     // Catch:{ all -> 0x05e5 }
            apfy r10 = defpackage.apfy.e     // Catch:{ all -> 0x05e5 }
            aucd r10 = r10.o()     // Catch:{ all -> 0x05e5 }
            r11 = 0
            java.lang.String r12 = r1.getString(r11)     // Catch:{ all -> 0x05e5 }
            boolean r11 = r10.c     // Catch:{ all -> 0x05e5 }
            if (r11 != 0) goto L_0x03ab
            goto L_0x03b1
        L_0x03ab:
            r10.c()     // Catch:{ all -> 0x05e5 }
            r11 = 0
            r10.c = r11     // Catch:{ all -> 0x05e5 }
        L_0x03b1:
            aucj r11 = r10.b     // Catch:{ all -> 0x05e5 }
            apfy r11 = (defpackage.apfy) r11     // Catch:{ all -> 0x05e5 }
            r12.getClass()     // Catch:{ all -> 0x05e5 }
            int r13 = r11.a     // Catch:{ all -> 0x05e5 }
            r14 = 1
            r13 = r13 | r14
            r11.a = r13     // Catch:{ all -> 0x05e5 }
            r11.b = r12     // Catch:{ all -> 0x05e5 }
            long r11 = r1.getLong(r14)     // Catch:{ all -> 0x05e5 }
            boolean r13 = r10.c     // Catch:{ all -> 0x05e5 }
            if (r13 != 0) goto L_0x03c9
            goto L_0x03cf
        L_0x03c9:
            r10.c()     // Catch:{ all -> 0x05e5 }
            r13 = 0
            r10.c = r13     // Catch:{ all -> 0x05e5 }
        L_0x03cf:
            aucj r13 = r10.b     // Catch:{ all -> 0x05e5 }
            apfy r13 = (defpackage.apfy) r13     // Catch:{ all -> 0x05e5 }
            int r14 = r13.a     // Catch:{ all -> 0x05e5 }
            r15 = 2
            r14 = r14 | r15
            r13.a = r14     // Catch:{ all -> 0x05e5 }
            r13.c = r11     // Catch:{ all -> 0x05e5 }
            if (r2 != 0) goto L_0x03e0
            r13 = -1
            r14 = 4
            goto L_0x0444
        L_0x03e0:
            apfk r11 = defpackage.apfk.c     // Catch:{ all -> 0x05e5 }
            aucd r11 = r11.o()     // Catch:{ all -> 0x05e5 }
            boolean r12 = r6.equals(r7)     // Catch:{ all -> 0x05e5 }
            if (r12 == 0) goto L_0x0406
            boolean r12 = r11.c     // Catch:{ all -> 0x05e5 }
            if (r12 != 0) goto L_0x03f1
        L_0x03f0:
            goto L_0x03f8
        L_0x03f1:
            r11.c()     // Catch:{ all -> 0x05e5 }
            r12 = 0
            r11.c = r12     // Catch:{ all -> 0x05e5 }
            goto L_0x03f0
        L_0x03f8:
            aucj r12 = r11.b     // Catch:{ all -> 0x05e5 }
            apfk r12 = (defpackage.apfk) r12     // Catch:{ all -> 0x05e5 }
            int r13 = r12.a     // Catch:{ all -> 0x05e5 }
            r14 = 1
            r13 = r13 | r14
            r12.a = r13     // Catch:{ all -> 0x05e5 }
            r13 = -1
            r12.b = r13     // Catch:{ all -> 0x05e5 }
            goto L_0x0424
        L_0x0406:
            r13 = -1
            int r12 = a((java.util.LinkedHashMap) r2, (java.lang.String) r7)     // Catch:{ all -> 0x05e5 }
            boolean r14 = r11.c     // Catch:{ all -> 0x05e5 }
            if (r14 != 0) goto L_0x0410
            goto L_0x0416
        L_0x0410:
            r11.c()     // Catch:{ all -> 0x05e5 }
            r14 = 0
            r11.c = r14     // Catch:{ all -> 0x05e5 }
        L_0x0416:
            aucj r14 = r11.b     // Catch:{ all -> 0x05e5 }
            apfk r14 = (defpackage.apfk) r14     // Catch:{ all -> 0x05e5 }
            int r15 = r14.a     // Catch:{ all -> 0x05e5 }
            r16 = 1
            r15 = r15 | 1
            r14.a = r15     // Catch:{ all -> 0x05e5 }
            r14.b = r12     // Catch:{ all -> 0x05e5 }
        L_0x0424:
            boolean r12 = r10.c     // Catch:{ all -> 0x05e5 }
            if (r12 != 0) goto L_0x0429
            goto L_0x042f
        L_0x0429:
            r10.c()     // Catch:{ all -> 0x05e5 }
            r12 = 0
            r10.c = r12     // Catch:{ all -> 0x05e5 }
        L_0x042f:
            aucj r12 = r10.b     // Catch:{ all -> 0x05e5 }
            apfy r12 = (defpackage.apfy) r12     // Catch:{ all -> 0x05e5 }
            aucj r11 = r11.i()     // Catch:{ all -> 0x05e5 }
            apfk r11 = (defpackage.apfk) r11     // Catch:{ all -> 0x05e5 }
            r11.getClass()     // Catch:{ all -> 0x05e5 }
            r12.d = r11     // Catch:{ all -> 0x05e5 }
            int r11 = r12.a     // Catch:{ all -> 0x05e5 }
            r14 = 4
            r11 = r11 | r14
            r12.a = r11     // Catch:{ all -> 0x05e5 }
        L_0x0444:
            r11 = 2
            byte[] r12 = r1.getBlob(r11)     // Catch:{ all -> 0x05e5 }
            r11 = 3
            byte[] r15 = r1.getBlob(r11)     // Catch:{ all -> 0x05e5 }
            if (r15 != 0) goto L_0x0452
            goto L_0x0453
        L_0x0452:
            r12 = r15
        L_0x0453:
            if (r12 != 0) goto L_0x0456
            goto L_0x0476
        L_0x0456:
            auay r12 = defpackage.auay.a((byte[]) r12)     // Catch:{ all -> 0x05e5 }
            boolean r15 = r8.c     // Catch:{ all -> 0x05e5 }
            if (r15 != 0) goto L_0x045f
            goto L_0x0465
        L_0x045f:
            r8.c()     // Catch:{ all -> 0x05e5 }
            r15 = 0
            r8.c = r15     // Catch:{ all -> 0x05e5 }
        L_0x0465:
            aucj r15 = r8.b     // Catch:{ all -> 0x05e5 }
            apfb r15 = (defpackage.apfb) r15     // Catch:{ all -> 0x05e5 }
            r12.getClass()     // Catch:{ all -> 0x05e5 }
            int r11 = r15.a     // Catch:{ all -> 0x05e5 }
            r16 = 2
            r11 = r11 | 2
            r15.a = r11     // Catch:{ all -> 0x05e5 }
            r15.c = r12     // Catch:{ all -> 0x05e5 }
        L_0x0476:
            aucj r10 = r10.i()     // Catch:{ all -> 0x05e5 }
            apfy r10 = (defpackage.apfy) r10     // Catch:{ all -> 0x05e5 }
            boolean r11 = r8.c     // Catch:{ all -> 0x05e5 }
            if (r11 != 0) goto L_0x0481
            goto L_0x0487
        L_0x0481:
            r8.c()     // Catch:{ all -> 0x05e5 }
            r11 = 0
            r8.c = r11     // Catch:{ all -> 0x05e5 }
        L_0x0487:
            aucj r11 = r8.b     // Catch:{ all -> 0x05e5 }
            apfb r11 = (defpackage.apfb) r11     // Catch:{ all -> 0x05e5 }
            r10.getClass()     // Catch:{ all -> 0x05e5 }
            r11.b = r10     // Catch:{ all -> 0x05e5 }
            int r12 = r11.a     // Catch:{ all -> 0x05e5 }
            r15 = 1
            r12 = r12 | r15
            r11.a = r12     // Catch:{ all -> 0x05e5 }
            boolean r11 = defpackage.ayzv.d()     // Catch:{ all -> 0x05e5 }
            if (r11 == 0) goto L_0x049d
            goto L_0x04a7
        L_0x049d:
            a((android.database.sqlite.SQLiteDatabase) r3, (defpackage.apfa) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05e5 }
            amzy r7 = a((android.database.sqlite.SQLiteDatabase) r3, (defpackage.apfy) r10, (java.lang.String) r7)     // Catch:{ all -> 0x05e5 }
            r8.a(r7)     // Catch:{ all -> 0x05e5 }
        L_0x04a7:
            aucj r7 = r8.i()     // Catch:{ all -> 0x05e5 }
            apfb r7 = (defpackage.apfb) r7     // Catch:{ all -> 0x05e5 }
            r0.add(r7)     // Catch:{ all -> 0x05e5 }
            goto L_0x0387
        L_0x04b2:
            r13 = -1
            r14 = 4
            goto L_0x0372
        L_0x04b6:
            r13 = -1
            r14 = 4
            goto L_0x0372
        L_0x04ba:
            if (r1 == 0) goto L_0x04c0
            r1.close()     // Catch:{ all -> 0x05f3 }
            goto L_0x04c1
        L_0x04c0:
        L_0x04c1:
            boolean r1 = r4.c     // Catch:{ all -> 0x05f3 }
            if (r1 != 0) goto L_0x04c6
            goto L_0x04cc
        L_0x04c6:
            r4.c()     // Catch:{ all -> 0x05f3 }
            r1 = 0
            r4.c = r1     // Catch:{ all -> 0x05f3 }
        L_0x04cc:
            aucj r1 = r4.b     // Catch:{ all -> 0x05f3 }
            apfo r1 = (defpackage.apfo) r1     // Catch:{ all -> 0x05f3 }
            aucx r2 = r1.c     // Catch:{ all -> 0x05f3 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x05f3 }
            if (r2 != 0) goto L_0x04e0
            aucx r2 = r1.c     // Catch:{ all -> 0x05f3 }
            aucx r2 = defpackage.aucj.a((defpackage.aucx) r2)     // Catch:{ all -> 0x05f3 }
            r1.c = r2     // Catch:{ all -> 0x05f3 }
        L_0x04e0:
            aucx r1 = r1.c     // Catch:{ all -> 0x05f3 }
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r1)     // Catch:{ all -> 0x05f3 }
            boolean r0 = defpackage.azaf.k()     // Catch:{ all -> 0x05f3 }
            if (r0 == 0) goto L_0x04ec
            goto L_0x0549
        L_0x04ec:
            if (r28 != 0) goto L_0x04f5
            java.lang.Object r0 = defpackage.anbs.b(r23)     // Catch:{ all -> 0x05f3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x05f3 }
            goto L_0x04f7
        L_0x04f5:
            java.lang.String r0 = "ALL_USERS"
        L_0x04f7:
            r1 = 1
            java.lang.String[] r15 = new java.lang.String[r1]     // Catch:{ all -> 0x05f3 }
            java.lang.String r2 = "bytesTag"
            r5 = 0
            r15[r5] = r2     // Catch:{ all -> 0x05f3 }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x05f3 }
            r2[r5] = r0     // Catch:{ all -> 0x05f3 }
            java.lang.String r14 = "RequestTags"
            java.lang.String r16 = "user = ?"
            r18 = 0
            r19 = 0
            r20 = 0
            r13 = r3
            r17 = r2
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x05f3 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x05d7 }
            if (r0 != 0) goto L_0x0523
            byte[] r0 = g     // Catch:{ all -> 0x05d7 }
            if (r1 == 0) goto L_0x0522
        L_0x051e:
            r1.close()     // Catch:{ all -> 0x05f3 }
        L_0x0521:
            goto L_0x052b
        L_0x0522:
            goto L_0x052b
        L_0x0523:
            r2 = 0
            byte[] r0 = r1.getBlob(r2)     // Catch:{ all -> 0x05d7 }
            if (r1 == 0) goto L_0x0521
            goto L_0x051e
        L_0x052b:
            auay r0 = defpackage.auay.a((byte[]) r0)     // Catch:{ all -> 0x05f3 }
            boolean r1 = r4.c     // Catch:{ all -> 0x05f3 }
            if (r1 != 0) goto L_0x0534
            goto L_0x053a
        L_0x0534:
            r4.c()     // Catch:{ all -> 0x05f3 }
            r1 = 0
            r4.c = r1     // Catch:{ all -> 0x05f3 }
        L_0x053a:
            aucj r1 = r4.b     // Catch:{ all -> 0x05f3 }
            apfo r1 = (defpackage.apfo) r1     // Catch:{ all -> 0x05f3 }
            r0.getClass()     // Catch:{ all -> 0x05f3 }
            int r2 = r1.a     // Catch:{ all -> 0x05f3 }
            r5 = 2
            r2 = r2 | r5
            r1.a = r2     // Catch:{ all -> 0x05f3 }
            r1.d = r0     // Catch:{ all -> 0x05f3 }
        L_0x0549:
            r0 = 1
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ all -> 0x05f3 }
            java.lang.String r0 = "token"
            r1 = 0
            r15[r1] = r0     // Catch:{ all -> 0x05f3 }
            java.lang.String r14 = "DogfoodsToken"
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r13 = r3
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x05f3 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x05c9 }
            if (r0 == 0) goto L_0x0576
            r2 = 0
            byte[] r0 = r1.getBlob(r2)     // Catch:{ all -> 0x05c9 }
            if (r0 != 0) goto L_0x0570
            goto L_0x0576
        L_0x0570:
            if (r1 == 0) goto L_0x0575
        L_0x0572:
            r1.close()     // Catch:{ all -> 0x05f3 }
        L_0x0575:
            goto L_0x057c
        L_0x0576:
            byte[] r0 = g     // Catch:{ all -> 0x05c9 }
            if (r1 == 0) goto L_0x057b
            goto L_0x0572
        L_0x057b:
        L_0x057c:
            auay r0 = defpackage.auay.a((byte[]) r0)     // Catch:{ all -> 0x05f3 }
            r1 = r21
            boolean r2 = r1.c     // Catch:{ all -> 0x05f3 }
            if (r2 != 0) goto L_0x0587
            goto L_0x058d
        L_0x0587:
            r1.c()     // Catch:{ all -> 0x05f3 }
            r2 = 0
            r1.c = r2     // Catch:{ all -> 0x05f3 }
        L_0x058d:
            aucj r2 = r1.b     // Catch:{ all -> 0x05f3 }
            apfd r2 = (defpackage.apfd) r2     // Catch:{ all -> 0x05f3 }
            r0.getClass()     // Catch:{ all -> 0x05f3 }
            int r5 = r2.a     // Catch:{ all -> 0x05f3 }
            r5 = r5 | 32
            r2.a = r5     // Catch:{ all -> 0x05f3 }
            r2.e = r0     // Catch:{ all -> 0x05f3 }
            boolean r0 = r4.c     // Catch:{ all -> 0x05f3 }
            if (r0 != 0) goto L_0x05a1
            goto L_0x05a7
        L_0x05a1:
            r4.c()     // Catch:{ all -> 0x05f3 }
            r2 = 0
            r4.c = r2     // Catch:{ all -> 0x05f3 }
        L_0x05a7:
            aucj r0 = r4.b     // Catch:{ all -> 0x05f3 }
            apfo r0 = (defpackage.apfo) r0     // Catch:{ all -> 0x05f3 }
            aucj r1 = r1.i()     // Catch:{ all -> 0x05f3 }
            apfd r1 = (defpackage.apfd) r1     // Catch:{ all -> 0x05f3 }
            r1.getClass()     // Catch:{ all -> 0x05f3 }
            r0.b = r1     // Catch:{ all -> 0x05f3 }
            int r1 = r0.a     // Catch:{ all -> 0x05f3 }
            r2 = 1
            r1 = r1 | r2
            r0.a = r1     // Catch:{ all -> 0x05f3 }
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x05f3 }
            aucj r0 = r4.i()     // Catch:{ all -> 0x05f3 }
            apfo r0 = (defpackage.apfo) r0     // Catch:{ all -> 0x05f3 }
            r3.endTransaction()
            return r0
        L_0x05c9:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x05d6
            r1.close()     // Catch:{ all -> 0x05d1 }
            goto L_0x05d6
        L_0x05d1:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x05f3 }
        L_0x05d6:
            throw r2     // Catch:{ all -> 0x05f3 }
        L_0x05d7:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x05e4
            r1.close()     // Catch:{ all -> 0x05df }
            goto L_0x05e4
        L_0x05df:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x05f3 }
        L_0x05e4:
            throw r2     // Catch:{ all -> 0x05f3 }
        L_0x05e5:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x05f2
            r1.close()     // Catch:{ all -> 0x05ed }
            goto L_0x05f2
        L_0x05ed:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x05f3 }
        L_0x05f2:
            throw r2     // Catch:{ all -> 0x05f3 }
        L_0x05f3:
            r0 = move-exception
            r3.endTransaction()
            throw r0
        L_0x05f8:
            r1 = 0
            throw r1
        L_0x05fb:
            r1 = 0
            goto L_0x05fe
        L_0x05fd:
            throw r1
        L_0x05fe:
            goto L_0x05fd
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yiu.a(java.util.List, int, java.lang.String, boolean, java.util.LinkedHashMap, boolean, aucd):apfo");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0207 A[Catch:{ all -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0208 A[Catch:{ all -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.apfp a(defpackage.apfo r17, java.util.List r18, java.lang.String r19, java.lang.String r20, defpackage.aucd r21, java.util.LinkedHashMap r22, defpackage.yit r23, boolean r24) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            jjg r6 = a
            java.util.logging.Level r7 = h()
            anih r6 = r6.b((java.util.logging.Level) r7)
            java.lang.String r7 = "yiu"
            java.lang.String r8 = "a"
            r9 = 1295(0x50f, float:1.815E-42)
            java.lang.String r10 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r6 = r6.a((java.lang.String) r7, (java.lang.String) r8, (int) r9, (java.lang.String) r10)
            anih r6 = (defpackage.anih) r6
            java.lang.String r9 = "Heterodyne Request: %s"
            r6.a((java.lang.String) r9, (java.lang.Object) r0)
            long r11 = android.os.SystemClock.elapsedRealtime()
            r6 = 0
            r9 = 2
            r13 = 0
            r16.aP()     // Catch:{ IOException -> 0x0202, all -> 0x0200 }
            yiz r14 = r1.h     // Catch:{ IOException -> 0x0202, all -> 0x0200 }
            r15 = r20
            yiy r6 = r14.a(r0, r2, r15)     // Catch:{ IOException -> 0x0202, all -> 0x0200 }
            int r0 = r6.b     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 > 0) goto L_0x0040
            goto L_0x0043
        L_0x0040:
            r1.a((int) r0)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x0043:
            boolean r0 = r6.c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r14 = 1
            if (r0 == 0) goto L_0x007a
            apfp r0 = r6.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 == 0) goto L_0x00b6
            aucs r0 = r0.e     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r0 = r0.size()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 <= 0) goto L_0x00b6
            apfp r0 = r6.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            aucs r0 = r0.e     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x005c:
            boolean r2 = r0.hasNext()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r0.next()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.util.Map$Entry r2 = a((java.util.LinkedHashMap) r4, (int) r2)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r1.b((java.lang.String) r2)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            goto L_0x005c
        L_0x007a:
            if (r24 == 0) goto L_0x009f
            java.util.Collection r0 = r22.values()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x0084:
            boolean r2 = r0.hasNext()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r0.next()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r1.b((java.lang.String) r2)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            goto L_0x0084
        L_0x0094:
            if (r5 == 0) goto L_0x00b6
            int r0 = r18.size()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r0 = r0 + -1
            r5.g = r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            goto L_0x00b6
        L_0x009f:
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r0 = defpackage.anbs.b(r18)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r1.b((java.lang.String) r0)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r5 == 0) goto L_0x00b6
            r5.g = r14     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            goto L_0x00b6
        L_0x00b3:
            r1.b((java.lang.String) r2)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x00b6:
            boolean r0 = r6.c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r2 = 4
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 != 0) goto L_0x00d7
            boolean r0 = r3.c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 != 0) goto L_0x00c2
            goto L_0x00c7
        L_0x00c2:
            r21.c()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r3.c = r13     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x00c7:
            aucj r0 = r3.b     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r0 = (defpackage.avsz) r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r5 = defpackage.avsz.h     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5 = 3
            r0.c = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r5 = r0.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5 = r5 | r9
            r0.a = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            goto L_0x0151
        L_0x00d7:
            int r0 = r6.d     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r3.c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 != 0) goto L_0x00e0
            goto L_0x00e5
        L_0x00e0:
            r21.c()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r3.c = r13     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x00e5:
            aucj r0 = r3.b     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r0 = (defpackage.avsz) r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r5 = defpackage.avsz.h     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r0.c = r2     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r5 = r0.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5 = r5 | r9
            r0.a = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            goto L_0x0151
        L_0x00f3:
            if (r0 >= r4) goto L_0x00f6
            goto L_0x0139
        L_0x00f6:
            r5 = 300(0x12c, float:4.2E-43)
            if (r0 >= r5) goto L_0x0139
            apfp r0 = r6.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 == 0) goto L_0x0120
            aucs r0 = r0.e     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r0 = r0.size()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 <= 0) goto L_0x0151
            boolean r0 = r3.c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 != 0) goto L_0x010b
            goto L_0x0110
        L_0x010b:
            r21.c()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r3.c = r13     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x0110:
            aucj r0 = r3.b     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r0 = (defpackage.avsz) r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r5 = defpackage.avsz.h     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5 = 9
            r0.c = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r5 = r0.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5 = r5 | r9
            r0.a = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            goto L_0x0151
        L_0x0120:
            boolean r0 = r3.c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 != 0) goto L_0x0125
            goto L_0x012a
        L_0x0125:
            r21.c()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r3.c = r13     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x012a:
            aucj r0 = r3.b     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r0 = (defpackage.avsz) r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r5 = defpackage.avsz.h     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5 = 5
            r0.c = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r5 = r0.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5 = r5 | r9
            r0.a = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            goto L_0x0151
        L_0x0139:
            boolean r0 = r3.c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 != 0) goto L_0x013e
            goto L_0x0143
        L_0x013e:
            r21.c()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r3.c = r13     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x0143:
            aucj r0 = r3.b     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r0 = (defpackage.avsz) r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r5 = defpackage.avsz.h     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5 = 6
            r0.c = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r5 = r0.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5 = r5 | r9
            r0.a = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x0151:
            azaf r0 = defpackage.azaf.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            azag r0 = r0.a()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            boolean r0 = r0.m()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 == 0) goto L_0x0178
            int r0 = r6.d     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 == r4) goto L_0x0178
            boolean r4 = r3.c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r4 != 0) goto L_0x0166
            goto L_0x016b
        L_0x0166:
            r21.c()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r3.c = r13     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x016b:
            aucj r4 = r3.b     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r4 = (defpackage.avsz) r4     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r5 = defpackage.avsz.h     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r5 = r4.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r2 = r2 | r5
            r4.a = r2     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r4.d = r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x0178:
            apfp r0 = r6.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r0 != 0) goto L_0x01bf
            azaf r0 = defpackage.azaf.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            azag r0 = r0.a()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            boolean r0 = r0.f()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r2 = 29504(0x7340, float:4.1344E-41)
            if (r0 == 0) goto L_0x01b7
            yfy r0 = new yfy     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            aucj r5 = r3.b     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r5 = (defpackage.avsz) r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r5 = r5.d     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r4[r13] = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            aucj r5 = r3.b     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            avsz r5 = (defpackage.avsz) r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r5 = r5.c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r5 = defpackage.avsy.a(r5)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            if (r5 != 0) goto L_0x01a7
            r5 = 1
        L_0x01a7:
            java.lang.String r5 = defpackage.avsy.b(r5)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r4[r14] = r5     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = "Null server response, http status code %d: %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r0.<init>(r2, r4)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            throw r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x01b7:
            yfy r0 = new yfy     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r4 = "Null server response"
            r0.<init>(r2, r4)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            throw r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
        L_0x01bf:
            jjg r0 = a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.util.logging.Level r2 = h()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            anih r0 = r0.b((java.util.logging.Level) r2)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r2 = 1377(0x561, float:1.93E-42)
            anie r0 = r0.a((java.lang.String) r7, (java.lang.String) r8, (int) r2, (java.lang.String) r10)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            anih r0 = (defpackage.anih) r0     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r2 = "Heterodyne Response: %s"
            apfp r4 = r6.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r0.a((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            apfp r0 = r6.a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r11
            int r2 = (int) r4
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x01e5
            goto L_0x01ea
        L_0x01e5:
            r21.c()
            r3.c = r13
        L_0x01ea:
            aucj r3 = r3.b
            avsz r3 = (defpackage.avsz) r3
            avsz r4 = defpackage.avsz.h
            int r4 = r3.a
            r4 = r4 | 8
            r3.a = r4
            r3.e = r2
            r1.a((defpackage.yiy) r6)
            return r0
        L_0x01fc:
            r0 = move-exception
            goto L_0x021c
        L_0x01fe:
            r0 = move-exception
            goto L_0x0203
        L_0x0200:
            r0 = move-exception
            goto L_0x021c
        L_0x0202:
            r0 = move-exception
        L_0x0203:
            boolean r2 = r3.c     // Catch:{ all -> 0x021b }
            if (r2 != 0) goto L_0x0208
            goto L_0x020d
        L_0x0208:
            r21.c()     // Catch:{ all -> 0x021b }
            r3.c = r13     // Catch:{ all -> 0x021b }
        L_0x020d:
            aucj r2 = r3.b     // Catch:{ all -> 0x021b }
            avsz r2 = (defpackage.avsz) r2     // Catch:{ all -> 0x021b }
            avsz r4 = defpackage.avsz.h     // Catch:{ all -> 0x021b }
            r2.c = r9     // Catch:{ all -> 0x021b }
            int r4 = r2.a     // Catch:{ all -> 0x021b }
            r4 = r4 | r9
            r2.a = r4     // Catch:{ all -> 0x021b }
            throw r0     // Catch:{ all -> 0x021b }
        L_0x021b:
            r0 = move-exception
        L_0x021c:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r11
            int r2 = (int) r4
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x022b
            r21.c()
            r3.c = r13
        L_0x022b:
            aucj r3 = r3.b
            avsz r3 = (defpackage.avsz) r3
            avsz r4 = defpackage.avsz.h
            int r4 = r3.a
            r4 = r4 | 8
            r3.a = r4
            r3.e = r2
            r1.a((defpackage.yiy) r6)
            goto L_0x023e
        L_0x023d:
            throw r0
        L_0x023e:
            goto L_0x023d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yiu.a(apfo, java.util.List, java.lang.String, java.lang.String, aucd, java.util.LinkedHashMap, yit, boolean):apfp");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Runnable runnable) {
        if (!azaf.g().a.isEmpty()) {
            aucs aucs = azaf.g().a;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (!aucs.contains(Integer.valueOf(i3))) {
                return;
            }
        }
        try {
            runnable.run();
        } catch (RuntimeException e2) {
            anih anih = (anih) a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("yiu", "a", 761, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Garbage collection failed");
        }
    }

    public final void a(int i2, String str, avta avta) {
        String[] a2 = a();
        a(i2, str, a2, a2, true, avta);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v36, resolved type: yit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v42, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v96, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v75, resolved type: yit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v77, resolved type: yit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v79, resolved type: yit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v102, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v103, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v83, resolved type: yit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v110, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v90, resolved type: aucd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v84, resolved type: int} */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v37 */
    /* JADX WARNING: type inference failed for: r9v38 */
    /* JADX WARNING: type inference failed for: r9v39 */
    /* JADX WARNING: type inference failed for: r9v40 */
    /* JADX WARNING: type inference failed for: r9v43 */
    /* JADX WARNING: type inference failed for: r9v46 */
    /* JADX WARNING: type inference failed for: r9v51 */
    /* JADX WARNING: type inference failed for: r0v153, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r9v80 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0494 A[Catch:{ all -> 0x04e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0496 A[Catch:{ all -> 0x04e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04b3 A[SYNTHETIC, Splitter:B:236:0x04b3] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04d3 A[SYNTHETIC, Splitter:B:249:0x04d3] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04eb A[Catch:{ RuntimeException -> 0x04f1, all -> 0x04ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0522 A[Catch:{ RuntimeException -> 0x0548, all -> 0x053e }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0523 A[Catch:{ RuntimeException -> 0x0548, all -> 0x053e }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x076d A[SYNTHETIC, Splitter:B:371:0x076d] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x07f0 A[Catch:{ all -> 0x0808 }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0827  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0844  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0896  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r42, java.lang.String r43, java.lang.String[] r44, java.lang.String[] r45, boolean r46, defpackage.avta r47) {
        /*
            r41 = this;
            r12 = r41
            r13 = r42
            r0 = r44
            r14 = r45
            boolean r1 = r12.f
            if (r1 != 0) goto L_0x08ae
            long r15 = android.os.SystemClock.elapsedRealtime()
            if (r47 == 0) goto L_0x0015
            r11 = r47
            goto L_0x001e
        L_0x0015:
            avtd r1 = defpackage.avtd.h
            aucd r1 = r1.o()
            avta r1 = (defpackage.avta) r1
            r11 = r1
        L_0x001e:
            int r1 = r12.k
            boolean r2 = r11.c
            r10 = 0
            if (r2 != 0) goto L_0x0026
            goto L_0x002b
        L_0x0026:
            r11.c()
            r11.c = r10
        L_0x002b:
            aucj r2 = r11.b
            avtd r2 = (defpackage.avtd) r2
            int r3 = r1 + -1
            avtd r4 = defpackage.avtd.h
            if (r1 == 0) goto L_0x08ab
            r2.b = r3
            int r1 = r2.a
            r9 = 1
            r1 = r1 | r9
            r2.a = r1
            int r3 = r13 + -1
            if (r13 == 0) goto L_0x08a8
            r2.c = r3
            r8 = 2
            r1 = r1 | r8
            r2.a = r1
            java.lang.String r1 = defpackage.amrk.b(r43)
            boolean r2 = r11.c
            if (r2 != 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r11.c()
            r11.c = r10
        L_0x0055:
            aucj r2 = r11.b
            avtd r2 = (defpackage.avtd) r2
            r1.getClass()
            int r3 = r2.a
            r7 = 4
            r3 = r3 | r7
            r2.a = r3
            r2.d = r1
            ayyu r1 = defpackage.ayyu.a
            ayyv r1 = r1.a()
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x007e
            ayyu r2 = defpackage.ayyu.a
            ayyv r2 = r2.a()
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x007e
            r6 = 1
            goto L_0x007f
        L_0x007e:
            r6 = 0
        L_0x007f:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0186
            avsz r3 = defpackage.avsz.h     // Catch:{ RuntimeException -> 0x0173, all -> 0x0160 }
            aucd r3 = r3.o()     // Catch:{ RuntimeException -> 0x0173, all -> 0x0160 }
            yit r7 = new yit     // Catch:{ RuntimeException -> 0x014a, all -> 0x0134 }
            r7.<init>()     // Catch:{ RuntimeException -> 0x014a, all -> 0x0134 }
            r18 = r5
            long r4 = defpackage.ayzv.e()     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            int r5 = (int) r4     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            int r8 = r14.length     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            r7.a = r8     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            if (r8 <= r5) goto L_0x00f6
            java.util.ArrayList r8 = c(r45)     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            yfw r9 = r12.d     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            android.database.sqlite.SQLiteDatabase r9 = r9.getWritableDatabase()     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            java.util.Set r9 = a((android.database.sqlite.SQLiteDatabase) r9)     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            r10.<init>(r9)     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x0120, all -> 0x010c }
            r22 = r3
            java.util.List r3 = java.util.Arrays.asList(r45)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            r9.<init>(r3)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            r3.<init>(r8)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            r10.remove(r2)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            java.util.Collections.sort(r10)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            r3.addAll(r10)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            java.util.Collections.sort(r9)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            r3.addAll(r9)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
        L_0x00da:
            boolean r8 = r3.hasNext()     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            if (r8 == 0) goto L_0x00fb
            java.lang.Object r8 = r3.next()     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            int r9 = r4.size()     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            if (r9 >= r5) goto L_0x00fb
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            r9 = 0
            r10[r9] = r8     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            r12.a((java.util.LinkedHashMap) r4, (boolean) r6, (java.lang.String[]) r10)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            goto L_0x00da
        L_0x00f6:
            r22 = r3
            r12.a((java.util.LinkedHashMap) r4, (boolean) r6, (java.lang.String[]) r14)     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
        L_0x00fb:
            int r3 = r4.size()     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            r7.b = r3     // Catch:{ RuntimeException -> 0x010a, all -> 0x0108 }
            r9 = r7
            r10 = r22
            r22 = r4
            goto L_0x018c
        L_0x0108:
            r0 = move-exception
            goto L_0x010f
        L_0x010a:
            r0 = move-exception
            goto L_0x0123
        L_0x010c:
            r0 = move-exception
            r22 = r3
        L_0x010f:
            r17 = r7
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r27 = r15
            r2 = r18
            r4 = r22
            r6 = 0
            r8 = 2
            r9 = 1
            goto L_0x0809
        L_0x0120:
            r0 = move-exception
            r22 = r3
        L_0x0123:
            r17 = r7
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r27 = r15
            r2 = r18
            r4 = r22
            r6 = 0
            r8 = 2
            r9 = 1
            goto L_0x07e6
        L_0x0134:
            r0 = move-exception
            r22 = r3
            r18 = r5
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r27 = r15
            r2 = r18
            r4 = r22
            r6 = 0
            r8 = 2
            r9 = 1
            r17 = 0
            goto L_0x0809
        L_0x014a:
            r0 = move-exception
            r22 = r3
            r18 = r5
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r27 = r15
            r2 = r18
            r4 = r22
            r6 = 0
            r8 = 2
            r9 = 1
            r17 = 0
            goto L_0x07e6
        L_0x0160:
            r0 = move-exception
            r18 = r5
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r27 = r15
            r2 = r18
            r4 = 0
            r6 = 0
            r8 = 2
            r9 = 1
            r17 = 0
            goto L_0x0809
        L_0x0173:
            r0 = move-exception
            r18 = r5
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r27 = r15
            r2 = r18
            r4 = 0
            r6 = 0
            r8 = 2
            r9 = 1
            r17 = 0
            goto L_0x07e6
        L_0x0186:
            r18 = r5
            r9 = 0
            r10 = 0
            r22 = 0
        L_0x018c:
            java.util.ArrayList r3 = c(r45)     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            boolean r3 = r3.isEmpty()     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            r4 = 1
            r23 = r3 ^ 1
            azaf r3 = defpackage.azaf.a     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            azag r3 = r3.a()     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            boolean r3 = r3.p()     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            if (r3 != 0) goto L_0x01a4
            goto L_0x01ac
        L_0x01a4:
            yip r3 = new yip     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            r3.<init>(r12)     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            r12.a((int) r13, (java.lang.Runnable) r3)     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
        L_0x01ac:
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r7 = "a"
            java.lang.String r5 = "yiu"
            if (r22 == 0) goto L_0x0234
            ayyu r3 = defpackage.ayyu.a     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            ayyv r3 = r3.a()     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            boolean r3 = r3.b()     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            if (r3 == 0) goto L_0x01ca
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            java.util.List r4 = java.util.Arrays.asList(r44)     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            r3.<init>(r4)     // Catch:{ RuntimeException -> 0x07d5, all -> 0x07c3 }
            goto L_0x01d3
        L_0x01ca:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            java.util.List r4 = java.util.Arrays.asList(r44)     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            r3.<init>(r4)     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
        L_0x01d3:
            java.util.Set r4 = r22.keySet()     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            r3.retainAll(r4)     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            jjg r4 = a     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            anie r4 = r4.d()     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            anih r4 = (defpackage.anih) r4     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            r24 = r6
            r6 = 734(0x2de, float:1.029E-42)
            anie r4 = r4.a((java.lang.String) r5, (java.lang.String) r7, (int) r6, (java.lang.String) r8)     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            anih r4 = (defpackage.anih) r4     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            int r6 = r0.length     // Catch:{ RuntimeException -> 0x0226, all -> 0x0218 }
            r25 = r11
            java.lang.String r11 = "Removed %d invalid users"
            int r26 = r3.size()     // Catch:{ RuntimeException -> 0x0213, all -> 0x020e }
            r27 = r15
            int r15 = r6 - r26
            r4.a((java.lang.String) r11, (int) r15)     // Catch:{ RuntimeException -> 0x07b8, all -> 0x07ad }
            r9.d = r6     // Catch:{ RuntimeException -> 0x07b8, all -> 0x07ad }
            int r4 = r3.size()     // Catch:{ RuntimeException -> 0x07b8, all -> 0x07ad }
            r9.f = r4     // Catch:{ RuntimeException -> 0x07b8, all -> 0x07ad }
            r4 = 0
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x07b8, all -> 0x07ad }
            java.lang.Object[] r3 = r3.toArray(r6)     // Catch:{ RuntimeException -> 0x07b8, all -> 0x07ad }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ RuntimeException -> 0x07b8, all -> 0x07ad }
            goto L_0x023b
        L_0x020e:
            r0 = move-exception
            r27 = r15
            goto L_0x07ae
        L_0x0213:
            r0 = move-exception
            r27 = r15
            goto L_0x07b9
        L_0x0218:
            r0 = move-exception
            r27 = r15
            r15 = r10
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r2 = r18
        L_0x0222:
            r6 = 0
            r8 = 2
            goto L_0x07cf
        L_0x0226:
            r0 = move-exception
            r27 = r15
            r15 = r10
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r2 = r18
        L_0x0230:
            r6 = 0
            r8 = 2
            goto L_0x07e1
        L_0x0234:
            r24 = r6
            r25 = r11
            r27 = r15
            r3 = r0
        L_0x023b:
            int r0 = r0.length     // Catch:{ RuntimeException -> 0x07b8, all -> 0x07ad }
            int r4 = r3.length     // Catch:{ RuntimeException -> 0x07b8, all -> 0x07ad }
            int r15 = r0 - r4
            long r13 = (long) r4
            long r29 = defpackage.ayzv.e()     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            int r0 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))
            if (r0 <= 0) goto L_0x026e
            jjg r0 = a     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            anie r0 = r0.d()     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            anih r0 = (defpackage.anih) r0     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            r6 = 744(0x2e8, float:1.043E-42)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r7, (int) r6, (java.lang.String) r8)     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            anih r0 = (defpackage.anih) r0     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            java.lang.String r6 = "users truncated from %d to %d"
            long r13 = defpackage.ayzv.e()     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            r0.a((java.lang.String) r6, (int) r4, (long) r13)     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            long r13 = defpackage.ayzv.e()     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            int r0 = (int) r13     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            goto L_0x026f
        L_0x026e:
        L_0x026f:
            yfw r0 = r12.d     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            android.database.sqlite.SQLiteDatabase r29 = r0.getWritableDatabase()     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            java.lang.String r4 = "packageName"
            r6 = 0
            r0[r6] = r4     // Catch:{ RuntimeException -> 0x0787, all -> 0x077d }
            java.lang.String r30 = "Packages"
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r31 = r0
            android.database.Cursor r4 = r29.query(r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
        L_0x0291:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x075b }
            if (r0 == 0) goto L_0x0684
            r11 = 0
            java.lang.String r0 = r4.getString(r11)     // Catch:{ all -> 0x0672 }
            java.lang.String r6 = "__internal."
            boolean r0 = r0.startsWith(r6)     // Catch:{ all -> 0x0672 }
            if (r0 != 0) goto L_0x0657
            if (r4 != 0) goto L_0x02a7
            goto L_0x02aa
        L_0x02a7:
            r4.close()     // Catch:{ RuntimeException -> 0x0646, all -> 0x0635 }
        L_0x02aa:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x0646, all -> 0x0635 }
            int r4 = r3.length     // Catch:{ RuntimeException -> 0x0646, all -> 0x0635 }
            r6 = 1
            int r4 = r4 + r6
            r0.<init>(r4)     // Catch:{ RuntimeException -> 0x0646, all -> 0x0635 }
            if (r46 == 0) goto L_0x02b7
            r0.add(r2)     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
        L_0x02b7:
            java.util.Collections.addAll(r0, r3)     // Catch:{ RuntimeException -> 0x0646, all -> 0x0635 }
            if (r9 == 0) goto L_0x02cf
            int r3 = r0.size()     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            r9.e = r3     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            int r4 = r9.f     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            if (r3 > r4) goto L_0x02c9
            int r3 = r9.d     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            goto L_0x02cd
        L_0x02c9:
            int r3 = r9.d     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
            r4 = 1
            int r3 = r3 + r4
        L_0x02cd:
            r9.c = r3     // Catch:{ RuntimeException -> 0x079f, all -> 0x0791 }
        L_0x02cf:
            if (r1 == 0) goto L_0x03cc
            int r1 = r0.size()     // Catch:{ RuntimeException -> 0x03bb, all -> 0x03aa }
            r13 = 1
            if (r1 <= r13) goto L_0x0399
            r4 = 0
            r14 = 1
            r1 = r41
            r2 = r18
            r3 = r0
            r13 = r5
            r6 = r18
            r5 = r42
            r16 = r24
            r6 = r43
            r38 = r7
            r7 = r23
            r39 = r8
            r8 = r10
            r44 = r9
            r11 = r10
            r10 = r22
            r47 = r15
            r12 = r25
            r15 = r11
            r11 = r14
            r1.a((java.util.Set) r2, (java.util.List) r3, (java.lang.String) r4, (int) r5, (java.lang.String) r6, (boolean) r7, (defpackage.aucd) r8, (defpackage.yit) r9, (java.util.LinkedHashMap) r10, (boolean) r11)     // Catch:{ yfy -> 0x0325 }
            r6 = 0
            r7 = 4
            r8 = 2
            r9 = 1
            goto L_0x050e
        L_0x0303:
            r0 = move-exception
            r11 = r41
            r1 = r42
            r10 = r44
            r7 = r12
            r2 = r18
            r6 = 0
            r8 = 2
        L_0x030f:
            r9 = 1
        L_0x0310:
            r12 = r45
            goto L_0x07d1
        L_0x0314:
            r0 = move-exception
            r11 = r41
            r1 = r42
            r10 = r44
            r7 = r12
            r2 = r18
            r6 = 0
            r8 = 2
        L_0x0320:
            r9 = 1
        L_0x0321:
            r12 = r45
            goto L_0x07e3
        L_0x0325:
            r0 = move-exception
            r1 = r0
            jjg r0 = a     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            anie r0 = r0.c()     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            anih r0 = (defpackage.anih) r0     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            r0.a((java.lang.Throwable) r1)     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            r2 = 551(0x227, float:7.72E-43)
            r11 = r38
            r14 = r39
            anie r0 = r0.a((java.lang.String) r13, (java.lang.String) r11, (int) r2, (java.lang.String) r14)     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            anih r0 = (defpackage.anih) r0     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            java.lang.String r2 = "SyncInBatch failed"
            r0.a((java.lang.String) r2)     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            boolean r0 = r12.c     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            if (r0 != 0) goto L_0x0349
            r10 = 0
            goto L_0x034f
        L_0x0349:
            r12.c()     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            r10 = 0
            r12.c = r10     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
        L_0x034f:
            aucj r0 = r12.b     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            avtd r0 = (defpackage.avtd) r0     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            r9 = 4
            r0.f = r9     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            int r2 = r0.a     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            r2 = r2 | 16
            r0.a = r2     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            aucj r0 = r15.b     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            avsz r0 = (defpackage.avsz) r0     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            int r0 = r0.a     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
            r8 = 2
            r0 = r0 & r8
            if (r0 != 0) goto L_0x037f
            boolean r0 = r15.c     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
            if (r0 != 0) goto L_0x036b
            goto L_0x0370
        L_0x036b:
            r15.c()     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
            r15.c = r10     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
        L_0x0370:
            aucj r0 = r15.b     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
            avsz r0 = (defpackage.avsz) r0     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
            avsz r2 = defpackage.avsz.h     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
            r7 = 1
            r0.c = r7     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
            int r2 = r0.a     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
            r2 = r2 | r8
            r0.a = r2     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
            goto L_0x0380
        L_0x037f:
            r7 = 1
        L_0x0380:
            throw r1     // Catch:{ RuntimeException -> 0x038d, all -> 0x0381 }
        L_0x0381:
            r0 = move-exception
            r11 = r41
            r1 = r42
            r10 = r44
            r7 = r12
            r2 = r18
            r6 = 0
            goto L_0x030f
        L_0x038d:
            r0 = move-exception
            r11 = r41
            r1 = r42
            r10 = r44
            r7 = r12
            r2 = r18
            r6 = 0
            goto L_0x0320
        L_0x0399:
            r13 = r5
            r11 = r7
            r14 = r8
            r44 = r9
            r47 = r15
            r16 = r24
            r12 = r25
            r7 = 1
            r8 = 2
            r9 = 4
            r15 = r10
            r10 = 0
            goto L_0x03dc
        L_0x03aa:
            r0 = move-exception
            r15 = r10
            r11 = r41
            r1 = r42
            r12 = r45
            r10 = r9
            r2 = r18
            r7 = r25
            r6 = 0
            r8 = 2
            goto L_0x07d0
        L_0x03bb:
            r0 = move-exception
            r15 = r10
            r11 = r41
            r1 = r42
            r12 = r45
            r10 = r9
            r2 = r18
            r7 = r25
            r6 = 0
            r8 = 2
            goto L_0x07e2
        L_0x03cc:
            r13 = r5
            r11 = r7
            r14 = r8
            r44 = r9
            r47 = r15
            r16 = r24
            r12 = r25
            r7 = 1
            r8 = 2
            r9 = 4
            r15 = r10
            r10 = 0
        L_0x03dc:
            r6 = r45
            int r1 = r6.length     // Catch:{ RuntimeException -> 0x0624, all -> 0x0613 }
            r3 = 0
        L_0x03e0:
            if (r3 >= r1) goto L_0x040e
            r4 = r6[r3]     // Catch:{ RuntimeException -> 0x03ff, all -> 0x03f0 }
            boolean r5 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x03ff, all -> 0x03f0 }
            if (r5 == 0) goto L_0x03ed
            int r3 = r3 + 1
            goto L_0x03e0
        L_0x03ed:
            r19 = r4
            goto L_0x0410
        L_0x03f0:
            r0 = move-exception
            r11 = r41
            r1 = r42
            r10 = r44
            r7 = r12
            r2 = r18
            r9 = 1
            r12 = r6
            r6 = 0
            goto L_0x07d1
        L_0x03ff:
            r0 = move-exception
            r11 = r41
            r1 = r42
            r10 = r44
            r7 = r12
            r2 = r18
            r9 = 1
            r12 = r6
            r6 = 0
            goto L_0x07e3
        L_0x040e:
            r19 = 0
        L_0x0410:
            java.util.Iterator r20 = r0.iterator()     // Catch:{ RuntimeException -> 0x0624, all -> 0x0613 }
            r17 = 0
        L_0x0417:
            boolean r0 = r20.hasNext()     // Catch:{ RuntimeException -> 0x0624, all -> 0x0613 }
            if (r0 == 0) goto L_0x0509
            java.lang.Object r0 = r20.next()     // Catch:{ RuntimeException -> 0x04fe, all -> 0x04f3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x04fe, all -> 0x04f3 }
            if (r15 != 0) goto L_0x042d
            avsz r1 = defpackage.avsz.h     // Catch:{ RuntimeException -> 0x03ff, all -> 0x03f0 }
            aucd r1 = r1.o()     // Catch:{ RuntimeException -> 0x03ff, all -> 0x03f0 }
            r5 = r1
            goto L_0x042e
        L_0x042d:
            r5 = r15
        L_0x042e:
            java.util.List r3 = java.util.Collections.singletonList(r0)     // Catch:{ yfy -> 0x0471, all -> 0x046a }
            r0 = 0
            r1 = r41
            r2 = r18
            r4 = r19
            r46 = r5
            r5 = r42
            r6 = r43
            r7 = r23
            r8 = r46
            r9 = r44
            r10 = r22
            r21 = r13
            r13 = r11
            r11 = r0
            r1.a((java.util.Set) r2, (java.util.List) r3, (java.lang.String) r4, (int) r5, (java.lang.String) r6, (boolean) r7, (defpackage.aucd) r8, (defpackage.yit) r9, (java.util.LinkedHashMap) r10, (boolean) r11)     // Catch:{ yfy -> 0x0466, all -> 0x045f }
            if (r15 != 0) goto L_0x0455
            r1 = r46
            r12.a(r1)     // Catch:{ RuntimeException -> 0x0314, all -> 0x0303 }
        L_0x0455:
            r6 = r45
            r11 = r13
            r13 = r21
            r7 = 1
            r8 = 2
            r9 = 4
            r10 = 0
            goto L_0x0417
        L_0x045f:
            r0 = move-exception
            r1 = r46
        L_0x0462:
            r6 = 0
        L_0x0463:
            r7 = 4
        L_0x0464:
            r8 = 2
            goto L_0x046e
        L_0x0466:
            r0 = move-exception
            r1 = r46
            goto L_0x0476
        L_0x046a:
            r0 = move-exception
            r1 = r5
            r6 = 0
            r7 = 4
        L_0x046e:
            r9 = 1
            goto L_0x04e9
        L_0x0471:
            r0 = move-exception
            r1 = r5
            r21 = r13
            r13 = r11
        L_0x0476:
            jjg r2 = a     // Catch:{ all -> 0x04e6 }
            anie r2 = r2.c()     // Catch:{ all -> 0x04e6 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x04e6 }
            r2.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x04e6 }
            r3 = 596(0x254, float:8.35E-43)
            r5 = r21
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r13, (int) r3, (java.lang.String) r14)     // Catch:{ all -> 0x04e6 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x04e6 }
            java.lang.String r3 = "Sync failed"
            r2.a((java.lang.String) r3)     // Catch:{ all -> 0x04e6 }
            boolean r2 = r12.c     // Catch:{ all -> 0x04e6 }
            if (r2 != 0) goto L_0x0496
            r6 = 0
            goto L_0x049c
        L_0x0496:
            r12.c()     // Catch:{ all -> 0x04e6 }
            r6 = 0
            r12.c = r6     // Catch:{ all -> 0x04e3 }
        L_0x049c:
            aucj r2 = r12.b     // Catch:{ all -> 0x04e3 }
            avtd r2 = (defpackage.avtd) r2     // Catch:{ all -> 0x04e3 }
            r7 = 4
            r2.f = r7     // Catch:{ all -> 0x04e1 }
            int r3 = r2.a     // Catch:{ all -> 0x04e1 }
            r3 = r3 | 16
            r2.a = r3     // Catch:{ all -> 0x04e1 }
            aucj r2 = r1.b     // Catch:{ all -> 0x04e1 }
            avsz r2 = (defpackage.avsz) r2     // Catch:{ all -> 0x04e1 }
            int r2 = r2.a     // Catch:{ all -> 0x04e1 }
            r8 = 2
            r2 = r2 & r8
            if (r2 != 0) goto L_0x04d0
            boolean r2 = r1.c     // Catch:{ all -> 0x04ce }
            if (r2 != 0) goto L_0x04b8
            goto L_0x04bd
        L_0x04b8:
            r1.c()     // Catch:{ all -> 0x04ce }
            r1.c = r6     // Catch:{ all -> 0x04ce }
        L_0x04bd:
            aucj r2 = r1.b     // Catch:{ all -> 0x04ce }
            avsz r2 = (defpackage.avsz) r2     // Catch:{ all -> 0x04ce }
            avsz r3 = defpackage.avsz.h     // Catch:{ all -> 0x04ce }
            r9 = 1
            r2.c = r9     // Catch:{ all -> 0x04cc }
            int r3 = r2.a     // Catch:{ all -> 0x04cc }
            r3 = r3 | r8
            r2.a = r3     // Catch:{ all -> 0x04cc }
            goto L_0x04d1
        L_0x04cc:
            r0 = move-exception
            goto L_0x04e9
        L_0x04ce:
            r0 = move-exception
            goto L_0x046e
        L_0x04d0:
            r9 = 1
        L_0x04d1:
            if (r15 != 0) goto L_0x04d6
            r12.a(r1)     // Catch:{ RuntimeException -> 0x04f1, all -> 0x04ef }
        L_0x04d6:
            r6 = r45
            r17 = r0
            r11 = r13
            r7 = 1
            r9 = 4
            r10 = 0
            r13 = r5
            goto L_0x0417
        L_0x04e1:
            r0 = move-exception
            goto L_0x0464
        L_0x04e3:
            r0 = move-exception
            goto L_0x0463
        L_0x04e6:
            r0 = move-exception
            goto L_0x0462
        L_0x04e9:
            if (r15 != 0) goto L_0x04ee
            r12.a(r1)     // Catch:{ RuntimeException -> 0x04f1, all -> 0x04ef }
        L_0x04ee:
            throw r0     // Catch:{ RuntimeException -> 0x04f1, all -> 0x04ef }
        L_0x04ef:
            r0 = move-exception
            goto L_0x04f7
        L_0x04f1:
            r0 = move-exception
            goto L_0x0502
        L_0x04f3:
            r0 = move-exception
            r6 = 0
            r7 = 4
            r9 = 1
        L_0x04f7:
            r11 = r41
            r1 = r42
            r10 = r44
            goto L_0x0543
        L_0x04fe:
            r0 = move-exception
            r6 = 0
            r7 = 4
            r9 = 1
        L_0x0502:
            r11 = r41
            r1 = r42
            r10 = r44
            goto L_0x054d
        L_0x0509:
            r6 = 0
            r7 = 4
            r9 = 1
            if (r17 != 0) goto L_0x05fb
        L_0x050e:
            if (r47 <= 0) goto L_0x0513
            r10 = r44
            goto L_0x051e
        L_0x0513:
            if (r16 == 0) goto L_0x0552
            r10 = r44
            int r0 = r10.a     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            int r1 = r10.b     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            if (r0 > r1) goto L_0x051e
            goto L_0x0554
        L_0x051e:
            boolean r0 = r12.c     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            if (r0 != 0) goto L_0x0523
            goto L_0x0528
        L_0x0523:
            r12.c()     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            r12.c = r6     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
        L_0x0528:
            aucj r0 = r12.b     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            avtd r0 = (defpackage.avtd) r0     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            r0.f = r7     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            int r1 = r0.a     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            r1 = r1 | 16
            r0.a = r1     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            yfy r0 = new yfy     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            r1 = 29504(0x7340, float:4.1344E-41)
            java.lang.String r2 = "Could not find valid auth token for all requested accounts"
            r0.<init>(r1, r2)     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
            throw r0     // Catch:{ RuntimeException -> 0x0548, all -> 0x053e }
        L_0x053e:
            r0 = move-exception
            r11 = r41
            r1 = r42
        L_0x0543:
            r7 = r12
            r2 = r18
            goto L_0x0310
        L_0x0548:
            r0 = move-exception
            r11 = r41
            r1 = r42
        L_0x054d:
            r7 = r12
            r2 = r18
            goto L_0x0321
        L_0x0552:
            r10 = r44
        L_0x0554:
            if (r15 != 0) goto L_0x0558
            goto L_0x05c9
        L_0x0558:
            if (r10 == 0) goto L_0x05c9
            aucj r0 = r15.b
            avsz r0 = (defpackage.avsz) r0
            int r0 = r0.c
            int r0 = defpackage.avsy.a(r0)
            if (r0 != 0) goto L_0x0567
            goto L_0x0569
        L_0x0567:
            if (r0 != r9) goto L_0x0585
        L_0x0569:
            int r0 = a((defpackage.yit) r10)
            boolean r1 = r15.c
            if (r1 == 0) goto L_0x0576
            r15.c()
            r15.c = r6
        L_0x0576:
            aucj r1 = r15.b
            avsz r1 = (defpackage.avsz) r1
            avsz r2 = defpackage.avsz.h
            int r0 = r0 + -1
            r1.c = r0
            int r0 = r1.a
            r0 = r0 | r8
            r1.a = r0
        L_0x0585:
            aucd r0 = b((defpackage.yit) r10)
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x058e
            goto L_0x0593
        L_0x058e:
            r15.c()
            r15.c = r6
        L_0x0593:
            aucj r1 = r15.b
            avsz r1 = (defpackage.avsz) r1
            aucj r0 = r0.i()
            avtm r0 = (defpackage.avtm) r0
            avsz r2 = defpackage.avsz.h
            r0.getClass()
            r1.g = r0
            int r0 = r1.a
            r0 = r0 | 64
            r1.a = r0
            r12.a(r15)
            int r0 = a((defpackage.yit) r10)
            if (r0 == r9) goto L_0x05c9
            boolean r0 = r12.c
            if (r0 != 0) goto L_0x05b8
            goto L_0x05bd
        L_0x05b8:
            r12.c()
            r12.c = r6
        L_0x05bd:
            aucj r0 = r12.b
            avtd r0 = (defpackage.avtd) r0
            r0.f = r7
            int r1 = r0.a
            r1 = r1 | 16
            r0.a = r1
        L_0x05c9:
            yir r0 = new yir
            r11 = r41
            r1 = r12
            r12 = r45
            r0.<init>(r11, r12)
            r2 = r42
            r11.a((int) r2, (java.lang.Runnable) r0)
            r3 = r18
            r11.a((int) r2, (java.util.Set) r3)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r27
            int r0 = (int) r2
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x05e9
            goto L_0x05ee
        L_0x05e9:
            r1.c()
            r1.c = r6
        L_0x05ee:
            aucj r1 = r1.b
            avtd r1 = (defpackage.avtd) r1
            int r2 = r1.a
            r2 = r2 | 32
            r1.a = r2
            r1.g = r0
            return
        L_0x05fb:
            r11 = r41
            r2 = r42
            r10 = r44
            r1 = r12
            r3 = r18
            r12 = r45
            throw r17     // Catch:{ RuntimeException -> 0x060d, all -> 0x0607 }
        L_0x0607:
            r0 = move-exception
            r7 = r1
            r1 = r2
            r2 = r3
            goto L_0x07d1
        L_0x060d:
            r0 = move-exception
            r7 = r1
            r1 = r2
            r2 = r3
            goto L_0x07e3
        L_0x0613:
            r0 = move-exception
            r11 = r41
            r10 = r44
            r1 = r12
            r7 = 4
            r9 = 1
            r12 = r6
            r6 = 0
            r7 = r1
            r2 = r18
            r1 = r42
            goto L_0x07d1
        L_0x0624:
            r0 = move-exception
            r11 = r41
            r10 = r44
            r1 = r12
            r7 = 4
            r9 = 1
            r12 = r6
            r6 = 0
            r7 = r1
            r2 = r18
            r1 = r42
            goto L_0x07e3
        L_0x0635:
            r0 = move-exception
            r15 = r10
            r11 = r12
            r6 = 0
            r8 = 2
            r12 = r45
            r10 = r9
            r9 = 1
            r1 = r42
            r2 = r18
            r7 = r25
            goto L_0x07d1
        L_0x0646:
            r0 = move-exception
            r15 = r10
            r11 = r12
            r6 = 0
            r8 = 2
            r12 = r45
            r10 = r9
            r9 = 1
            r1 = r42
            r2 = r18
            r7 = r25
            goto L_0x07e3
        L_0x0657:
            r13 = r7
            r14 = r8
            r11 = r12
            r47 = r15
            r40 = r18
            r16 = r24
            r7 = r25
            r6 = 0
            r8 = 2
            r12 = r45
            r15 = r10
            r10 = r9
            r9 = 1
            r9 = r10
            r12 = r11
            r7 = r13
            r8 = r14
            r10 = r15
            r15 = r47
            goto L_0x0291
        L_0x0672:
            r0 = move-exception
            r15 = r10
            r11 = r12
            r7 = r25
            r6 = 0
            r8 = 2
            r12 = r45
            r10 = r9
            r9 = 1
            r1 = r42
            r3 = r0
            r2 = r18
            goto L_0x076b
        L_0x0684:
            r15 = r10
            r11 = r12
            r40 = r18
            r7 = r25
            r6 = 0
            r8 = 2
            r12 = r45
            r10 = r9
            r9 = 1
            if (r4 != 0) goto L_0x0693
        L_0x0692:
            goto L_0x0697
        L_0x0693:
            r4.close()     // Catch:{ RuntimeException -> 0x0754, all -> 0x074d }
            goto L_0x0692
        L_0x0697:
            boolean r0 = r7.c     // Catch:{ RuntimeException -> 0x0754, all -> 0x074d }
            if (r0 != 0) goto L_0x069c
            goto L_0x06a1
        L_0x069c:
            r7.c()     // Catch:{ RuntimeException -> 0x0754, all -> 0x074d }
            r7.c = r6     // Catch:{ RuntimeException -> 0x0754, all -> 0x074d }
        L_0x06a1:
            aucj r0 = r7.b     // Catch:{ RuntimeException -> 0x0754, all -> 0x074d }
            avtd r0 = (defpackage.avtd) r0     // Catch:{ RuntimeException -> 0x0754, all -> 0x074d }
            r0.f = r8     // Catch:{ RuntimeException -> 0x0754, all -> 0x074d }
            int r1 = r0.a     // Catch:{ RuntimeException -> 0x0754, all -> 0x074d }
            r1 = r1 | 16
            r0.a = r1     // Catch:{ RuntimeException -> 0x0754, all -> 0x074d }
            if (r15 != 0) goto L_0x06b0
            goto L_0x0720
        L_0x06b0:
            aucj r0 = r15.b
            avsz r0 = (defpackage.avsz) r0
            int r0 = r0.c
            int r0 = defpackage.avsy.a(r0)
            if (r0 != 0) goto L_0x06bd
            goto L_0x06bf
        L_0x06bd:
            if (r0 != r9) goto L_0x06db
        L_0x06bf:
            int r0 = a((defpackage.yit) r10)
            boolean r1 = r15.c
            if (r1 == 0) goto L_0x06cc
            r15.c()
            r15.c = r6
        L_0x06cc:
            aucj r1 = r15.b
            avsz r1 = (defpackage.avsz) r1
            avsz r2 = defpackage.avsz.h
            int r0 = r0 + -1
            r1.c = r0
            int r0 = r1.a
            r0 = r0 | r8
            r1.a = r0
        L_0x06db:
            aucd r0 = b((defpackage.yit) r10)
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x06e4
            goto L_0x06e9
        L_0x06e4:
            r15.c()
            r15.c = r6
        L_0x06e9:
            aucj r1 = r15.b
            avsz r1 = (defpackage.avsz) r1
            aucj r0 = r0.i()
            avtm r0 = (defpackage.avtm) r0
            avsz r2 = defpackage.avsz.h
            r0.getClass()
            r1.g = r0
            int r0 = r1.a
            r0 = r0 | 64
            r1.a = r0
            r7.a(r15)
            int r0 = a((defpackage.yit) r10)
            if (r0 == r9) goto L_0x0720
            boolean r0 = r7.c
            if (r0 != 0) goto L_0x070e
            goto L_0x0713
        L_0x070e:
            r7.c()
            r7.c = r6
        L_0x0713:
            aucj r0 = r7.b
            avtd r0 = (defpackage.avtd) r0
            r1 = 4
            r0.f = r1
            int r1 = r0.a
            r1 = r1 | 16
            r0.a = r1
        L_0x0720:
            yiq r0 = new yiq
            r0.<init>(r11, r12)
            r1 = r42
            r11.a((int) r1, (java.lang.Runnable) r0)
            r2 = r40
            r11.a((int) r1, (java.util.Set) r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r27
            int r1 = (int) r0
            boolean r0 = r7.c
            if (r0 != 0) goto L_0x073b
            goto L_0x0740
        L_0x073b:
            r7.c()
            r7.c = r6
        L_0x0740:
            aucj r0 = r7.b
            avtd r0 = (defpackage.avtd) r0
            int r2 = r0.a
            r2 = r2 | 32
            r0.a = r2
            r0.g = r1
            return
        L_0x074d:
            r0 = move-exception
            r1 = r42
            r2 = r40
            goto L_0x07d1
        L_0x0754:
            r0 = move-exception
            r1 = r42
            r2 = r40
            goto L_0x07e3
        L_0x075b:
            r0 = move-exception
            r1 = r42
            r15 = r10
            r11 = r12
            r2 = r18
            r7 = r25
            r6 = 0
            r8 = 2
            r12 = r45
            r10 = r9
            r9 = 1
            r3 = r0
        L_0x076b:
            if (r4 == 0) goto L_0x0776
            r4.close()     // Catch:{ all -> 0x0771 }
            goto L_0x0776
        L_0x0771:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ RuntimeException -> 0x077a, all -> 0x0777 }
        L_0x0776:
            throw r3     // Catch:{ RuntimeException -> 0x077a, all -> 0x0777 }
        L_0x0777:
            r0 = move-exception
            goto L_0x07d1
        L_0x077a:
            r0 = move-exception
            goto L_0x07e3
        L_0x077d:
            r0 = move-exception
            r1 = r42
            r15 = r10
            r11 = r12
            r2 = r18
            r7 = r25
            goto L_0x079b
        L_0x0787:
            r0 = move-exception
            r1 = r42
            r15 = r10
            r11 = r12
            r2 = r18
            r7 = r25
            goto L_0x07a9
        L_0x0791:
            r0 = move-exception
            r1 = r42
            r15 = r10
            r11 = r12
            r2 = r18
            r7 = r25
            r6 = 0
        L_0x079b:
            r8 = 2
            r12 = r45
            goto L_0x07cf
        L_0x079f:
            r0 = move-exception
            r1 = r42
            r15 = r10
            r11 = r12
            r2 = r18
            r7 = r25
            r6 = 0
        L_0x07a9:
            r8 = 2
            r12 = r45
            goto L_0x07e1
        L_0x07ad:
            r0 = move-exception
        L_0x07ae:
            r15 = r10
            r11 = r12
            r1 = r13
            r12 = r14
            r2 = r18
            r7 = r25
            goto L_0x0222
        L_0x07b8:
            r0 = move-exception
        L_0x07b9:
            r15 = r10
            r11 = r12
            r1 = r13
            r12 = r14
            r2 = r18
            r7 = r25
            goto L_0x0230
        L_0x07c3:
            r0 = move-exception
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r27 = r15
            r2 = r18
            r6 = 0
            r8 = 2
            r15 = r10
        L_0x07cf:
            r10 = r9
        L_0x07d0:
            r9 = 1
        L_0x07d1:
            r17 = r10
            r4 = r15
            goto L_0x0809
        L_0x07d5:
            r0 = move-exception
            r7 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            r27 = r15
            r2 = r18
            r6 = 0
            r8 = 2
            r15 = r10
        L_0x07e1:
            r10 = r9
        L_0x07e2:
            r9 = 1
        L_0x07e3:
            r17 = r10
            r4 = r15
        L_0x07e6:
            aucj r3 = r7.b     // Catch:{ all -> 0x0808 }
            avtd r3 = (defpackage.avtd) r3     // Catch:{ all -> 0x0808 }
            int r3 = r3.a     // Catch:{ all -> 0x0808 }
            r3 = r3 & 16
            if (r3 != 0) goto L_0x0807
            boolean r3 = r7.c     // Catch:{ all -> 0x0808 }
            if (r3 != 0) goto L_0x07f5
            goto L_0x07fa
        L_0x07f5:
            r7.c()     // Catch:{ all -> 0x0808 }
            r7.c = r6     // Catch:{ all -> 0x0808 }
        L_0x07fa:
            aucj r3 = r7.b     // Catch:{ all -> 0x0808 }
            avtd r3 = (defpackage.avtd) r3     // Catch:{ all -> 0x0808 }
            r5 = 3
            r3.f = r5     // Catch:{ all -> 0x0808 }
            int r5 = r3.a     // Catch:{ all -> 0x0808 }
            r5 = r5 | 16
            r3.a = r5     // Catch:{ all -> 0x0808 }
        L_0x0807:
            throw r0     // Catch:{ all -> 0x0808 }
        L_0x0808:
            r0 = move-exception
        L_0x0809:
            if (r4 != 0) goto L_0x080d
            goto L_0x087f
        L_0x080d:
            if (r17 == 0) goto L_0x087f
            aucj r3 = r4.b
            avsz r3 = (defpackage.avsz) r3
            int r3 = r3.c
            int r3 = defpackage.avsy.a(r3)
            if (r3 != 0) goto L_0x081c
            goto L_0x081e
        L_0x081c:
            if (r3 != r9) goto L_0x083b
        L_0x081e:
            int r3 = a((defpackage.yit) r17)
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0827
            goto L_0x082c
        L_0x0827:
            r4.c()
            r4.c = r6
        L_0x082c:
            aucj r5 = r4.b
            avsz r5 = (defpackage.avsz) r5
            avsz r10 = defpackage.avsz.h
            int r3 = r3 + -1
            r5.c = r3
            int r3 = r5.a
            r3 = r3 | r8
            r5.a = r3
        L_0x083b:
            aucd r3 = b((defpackage.yit) r17)
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0844
            goto L_0x0849
        L_0x0844:
            r4.c()
            r4.c = r6
        L_0x0849:
            aucj r5 = r4.b
            avsz r5 = (defpackage.avsz) r5
            aucj r3 = r3.i()
            avtm r3 = (defpackage.avtm) r3
            avsz r8 = defpackage.avsz.h
            r3.getClass()
            r5.g = r3
            int r3 = r5.a
            r3 = r3 | 64
            r5.a = r3
            r7.a(r4)
            int r3 = a((defpackage.yit) r17)
            if (r3 == r9) goto L_0x087f
            boolean r3 = r7.c
            if (r3 == 0) goto L_0x0872
            r7.c()
            r7.c = r6
        L_0x0872:
            aucj r3 = r7.b
            avtd r3 = (defpackage.avtd) r3
            r4 = 4
            r3.f = r4
            int r4 = r3.a
            r4 = r4 | 16
            r3.a = r4
        L_0x087f:
            yis r3 = new yis
            r3.<init>(r11, r12)
            r11.a((int) r1, (java.lang.Runnable) r3)
            r11.a((int) r1, (java.util.Set) r2)
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r27
            int r2 = (int) r1
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x0896
            goto L_0x089b
        L_0x0896:
            r7.c()
            r7.c = r6
        L_0x089b:
            aucj r1 = r7.b
            avtd r1 = (defpackage.avtd) r1
            int r3 = r1.a
            r3 = r3 | 32
            r1.a = r3
            r1.g = r2
            throw r0
        L_0x08a8:
            r11 = r12
            r1 = 0
            throw r1
        L_0x08ab:
            r11 = r12
            r1 = 0
            throw r1
        L_0x08ae:
            r11 = r12
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "not implemented yet"
            r0.<init>(r1)
            goto L_0x08b8
        L_0x08b7:
            throw r0
        L_0x08b8:
            goto L_0x08b7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yiu.a(int, java.lang.String, java.lang.String[], java.lang.String[], boolean, avta):void");
    }

    /* access modifiers changed from: package-private */
    public final String[] a(String[] strArr) {
        int length = strArr.length;
        if (((long) length) <= ayzv.e()) {
            return strArr;
        }
        ((anih) ((anih) a.d()).a("yiu", "a", 744, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("users truncated from %d to %d", length, ayzv.e());
        return (String[]) Arrays.copyOf(strArr, (int) ayzv.e());
    }

    /* access modifiers changed from: package-private */
    public final String[] a(String[] strArr, LinkedHashMap linkedHashMap, yit yit) {
        if (linkedHashMap == null) {
            return strArr;
        }
        Set linkedHashSet = ayyu.a.a().b() ? new LinkedHashSet(Arrays.asList(strArr)) : new HashSet(Arrays.asList(strArr));
        linkedHashSet.retainAll(linkedHashMap.keySet());
        int length = strArr.length;
        ((anih) ((anih) a.d()).a("yiu", "a", 734, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Removed %d invalid users", length - linkedHashSet.size());
        yit.d = length;
        yit.f = linkedHashSet.size();
        return (String[]) linkedHashSet.toArray(new String[0]);
    }
}
