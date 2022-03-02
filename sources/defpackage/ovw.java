package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ovw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovw extends jjj {
    private static ovw a = null;
    private static final oys b = new oys();
    private final Context c;
    private oyb d;
    private final Set e = new HashSet();

    private static long a(SQLiteDatabase sQLiteDatabase, String str) {
        if (dvk.c(sQLiteDatabase, str)) {
            return DatabaseUtils.queryNumEntries(sQLiteDatabase, oyc.a(str));
        }
        return 0;
    }

    private final void c(SQLiteDatabase sQLiteDatabase) {
        for (String str : dvk.a(sQLiteDatabase, "_seq_table")) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
            sb.append("DROP TABLE [");
            sb.append(str);
            sb.append("]");
            sQLiteDatabase.execSQL(sb.toString());
        }
        for (String str2 : dvk.a(sQLiteDatabase, "_indexapi")) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13);
            sb2.append("DROP TABLE [");
            sb2.append(str2);
            sb2.append("]");
            sQLiteDatabase.execSQL(sb2.toString());
        }
        onCreate(sQLiteDatabase);
    }

    public final void b(Set set, ozc ozc, osf osf, int i) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            oxe oxe = (oxe) it.next();
            CorpusStatus b2 = osf.b(ozc, oxe.b(), oxe.b);
            if (b2.a) {
                a(getWritableDatabase(), oxe, ozc, b2, osf, i);
            }
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        int i3 = i;
        while (true) {
            if (i3 > i2) {
                if (i3 != 9 || !((Boolean) ozx.aC.c()).booleanValue()) {
                    break;
                }
                i3--;
            } else {
                int i4 = i;
                while (i4 > i2) {
                    if (i4 == 9) {
                        try {
                            for (String str : dvk.a(sQLiteDatabase, "_seq_table")) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
                                sb.append("DROP INDEX IF EXISTS [");
                                sb.append(str);
                                sb.append("_uri_index]");
                                sQLiteDatabase.execSQL(sb.toString());
                            }
                            i4--;
                        } catch (Exception e2) {
                            a(i, i2, i4, e2);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i = i4;
            }
        }
        if (i != i2) {
            c(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        boolean z2;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        int i3 = i;
        while (true) {
            if (i3 < i2) {
                if (i3 == 7) {
                    z2 = ((Boolean) ozx.aA.c()).booleanValue();
                } else if (i3 != 8) {
                    break;
                } else {
                    z2 = ((Boolean) ozx.aB.c()).booleanValue();
                }
                if (!z2) {
                    break;
                }
                i3++;
            } else {
                int i4 = i;
                while (i4 < i2) {
                    if (i4 == 7) {
                        for (String str : dvk.a(sQLiteDatabase, "_seq_table")) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
                            sb.append("ALTER TABLE [");
                            sb.append(str);
                            sb.append("] ADD [tag] STRING");
                            sQLiteDatabase.execSQL(sb.toString());
                        }
                    } else if (i4 == 8) {
                        try {
                            for (String b2 : dvk.a(sQLiteDatabase, "_seq_table")) {
                                sQLiteDatabase.execSQL(oyc.b(b2));
                            }
                        } catch (Exception e2) {
                            a(i, i2, i4, e2);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                    i4++;
                }
                i = i4;
            }
        }
        if (i != i2) {
            c(sQLiteDatabase);
        }
    }

    public ovw(Context context, int i) {
        super(context, "icing-indexapi.db", "icing-indexapi.db", i);
        this.c = context;
    }

    private static long a(SQLiteDatabase sQLiteDatabase, oxe oxe) {
        return a(sQLiteDatabase, oxe.a());
    }

    public static List a(osf osf, List list, String[] strArr) {
        int i;
        ArrayList arrayList = new ArrayList(strArr.length);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            osz osz = (osz) list.get(i2);
            aucd o = ouj.e.o();
            int i3 = ((ozm) ozq.b(osz).get("thing_proto")).a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ouj ouj = (ouj) o.b;
            ouj.a |= 1;
            ouj.b = i3;
            ouj ouj2 = (ouj) o.i();
            aucd o2 = ouc.g.o();
            int i4 = osz.b;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ouc ouc = (ouc) o2.b;
            ouc.a |= 1;
            ouc.b = i4;
            ouj2.getClass();
            ouc.a();
            ouc.c.add(ouj2);
            aucd o3 = oul.v.o();
            o3.a((ouc) o2.i());
            oup a2 = osf.n.a(strArr, (oul) o3.i());
            oum oum = (oum) ((ouo) a2.d.get(0)).a.get(0);
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = i2 + 1;
                if (i5 >= a2.b) {
                    break;
                }
                try {
                    arrayList.add((avqi) aucj.a((aucj) avqi.f, oum.b.a(i6, oum.a.c(i5) + i6).e()));
                    i6 += oum.a.c(i5);
                    i5++;
                } catch (auda e2) {
                    throw new IllegalArgumentException("Failed to deserialize bytes", e2);
                }
            }
            i2 = i;
        }
        return arrayList;
    }

    public static Set a(Set set, String str) {
        return a(set, Arrays.asList(new String[]{str}));
    }

    public static Set a(Set set, List list) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            oxe oxe = (oxe) it.next();
            if (list.contains(oxe.a.b)) {
                hashSet.add(oxe);
            }
        }
        return hashSet;
    }

    public static synchronized ovw a(Context context) {
        ovw ovw;
        synchronized (ovw.class) {
            if (a == null) {
                int intValue = ((Integer) ozx.aF.c()).intValue();
                if (intValue == -1) {
                    intValue = 9;
                }
                a = new ovw(context, intValue);
            }
            ovw = a;
        }
        return ovw;
    }

    public static ovw a(Context context, String str) {
        if (ozx.c(str)) {
            return a(context);
        }
        return null;
    }

    private final void a(int i, int i2, int i3, Exception exc) {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        if (i > i2) {
            str = "downgrade";
        } else {
            str = "upgrade";
        }
        objArr[0] = str;
        objArr[1] = "icing-indexapi.db";
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = Integer.valueOf(i3);
        String format = String.format(locale, "Could not %s %s from version %d to version %d; error occurred at version %d.", objArr);
        oso.a((Throwable) exc, format);
        new oyt(this.c).a(format, exc, axrp.b());
    }

    public static void a(SQLiteDatabase sQLiteDatabase, oxe oxe, long j) {
        String a2 = oxe.a();
        oso.b("Cleaning sequence table '%s' where seqno <= %d: deleted %d rows", a2, Long.valueOf(j), Integer.valueOf(sQLiteDatabase.delete(oyc.a(a2), "seqno<=?", new String[]{String.valueOf(j)})));
    }

    public static void a(SQLiteDatabase sQLiteDatabase, oxe oxe, ozc ozc, CorpusStatus corpusStatus, osf osf, int i) {
        Throwable th;
        CorpusStatus corpusStatus2 = corpusStatus;
        osf osf2 = osf;
        aoiz a2 = pxm.a(osf2.b);
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (((aoiz) aucd.b).g) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoiz aoiz = (aoiz) aucd.b;
            aoiz aoiz2 = aoiz.h;
            aoiz.b = aolj.a(i);
            aoiz.a |= 1;
            osf2.r.a((aoiz) aucd.i());
        }
        String str = oxe.b;
        String b2 = oxe.b();
        Cursor query = sQLiteDatabase.query("sqlite_sequence", new String[]{"seq"}, "name=?", new String[]{oxe.a()}, (String) null, (String) null, (String) null);
        try {
            long j = query.moveToNext() ? query.getLong(0) : 0;
            if (query != null) {
                query.close();
            }
            if (j > corpusStatus2.b) {
                oso.b("Requesting indexing of '%s', maxSeqno/lastIndexedSeqno: %d/%d.", b2, Long.valueOf(j), Long.valueOf(corpusStatus2.b));
                RequestIndexingCall$Request requestIndexingCall$Request = new RequestIndexingCall$Request();
                requestIndexingCall$Request.a = str;
                requestIndexingCall$Request.b = b2;
                requestIndexingCall$Request.c = j;
                ppp ppp = osf2.c;
                ppp.d(new ovs(osf2.b, ppp, osf.a(), osf2.o, osf2.q, requestIndexingCall$Request, ozc, b2));
                return;
            }
            return;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, ozc ozc, osf osf, Set set) {
        String str = ozc.f;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            oxe oxe = (oxe) it.next();
            a(sQLiteDatabase, oxe, osf.b(ozc, oxe.b(), str).c);
        }
    }

    public static void a(PrintWriter printWriter, Context context) {
        ovw a2 = a(context, context.getPackageName());
        if (a2 == null) {
            String valueOf = String.valueOf(context.getPackageName());
            printWriter.println(valueOf.length() == 0 ? new String("3P app indexing is disabled for package: ") : "3P app indexing is disabled for package: ".concat(valueOf));
            return;
        }
        SQLiteDatabase readableDatabase = a2.getReadableDatabase();
        String path = readableDatabase.getPath();
        StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 12);
        sb.append("\nTables in ");
        sb.append(path);
        sb.append(":");
        printWriter.println(sb.toString());
        for (String str : dvk.a(readableDatabase, new String[0])) {
            printWriter.format(" %3d row(s) | %s\n", new Object[]{Long.valueOf(DatabaseUtils.queryNumEntries(readableDatabase, oyc.a(str))), str});
        }
    }

    public static void a(String str, osf osf, oyb oyb) {
        SQLiteDatabase writableDatabase;
        try {
            if (osf.m.d(str) != null) {
                try {
                    writableDatabase = a(osf.b).getWritableDatabase();
                    writableDatabase.beginTransaction();
                    for (oxe a2 : ovv.a(writableDatabase, str, oyb)) {
                        String a3 = a2.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 23);
                        sb.append("DROP TABLE IF EXISTS [");
                        sb.append(a3);
                        sb.append("]");
                        writableDatabase.execSQL(sb.toString());
                    }
                    writableDatabase.delete("type_indexapi", "app_name = ?", new String[]{str});
                    writableDatabase.delete("incarnation_indexapi", "app_name = ?", new String[]{str});
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (RuntimeException e2) {
                    RuntimeException runtimeException = e2;
                    String valueOf = String.valueOf(str);
                    String str2 = valueOf.length() == 0 ? new String("Failed to unregister package: ") : "Failed to unregister package: ".concat(valueOf);
                    oso.a((Throwable) runtimeException, str2);
                    osf.r.a("index_api_unregister_failed");
                    osf.n().a(str2, runtimeException, b, axrp.b(), ozx.bO, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (NullPointerException e3) {
            String valueOf2 = String.valueOf(str);
            oso.a((Throwable) e3, valueOf2.length() == 0 ? new String("Failed to unregister package: ") : "Failed to unregister package: ".concat(valueOf2));
        }
    }

    private static final boolean a(SQLiteDatabase sQLiteDatabase, long j, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (a(sQLiteDatabase, (oxe) it.next()) > j) {
                return false;
            }
        }
        return true;
    }

    public final Set a(SQLiteDatabase sQLiteDatabase, Set set, ozc ozc, oyb oyb) {
        iva.a(sQLiteDatabase.inTransaction());
        String str = ozc.f;
        oso.a("Running 'clear' for client '%s'.", (Object) str);
        Set a2 = ovv.a(sQLiteDatabase, str, oyb);
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            oxe oxe = (oxe) it.next();
            if (set == null || set.contains(oxe.a.b)) {
                String a3 = oxe.a();
                oso.b("Clearing sequence table: '%s' by deleting %d rows, remaining %d rows", a3, Integer.valueOf(sQLiteDatabase.delete(oyc.a(a3), (String) null, (String[]) null)), Long.valueOf(a(sQLiteDatabase, a3)));
            } else {
                it.remove();
            }
        }
        oso.a("Corpora: %d", (Object) Integer.valueOf(a2.size()));
        return a2;
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format(Locale.US, "CREATE TABLE IF NOT EXISTS [%s] ([%s] STRING PRIMARY KEY, [%s] STRING)", new Object[]{"incarnation_indexapi", "app_name", "incarnation"}));
        sQLiteDatabase.execSQL(String.format(Locale.US, "CREATE TABLE IF NOT EXISTS [%s] ([%s] STRING, [%s] STRING, PRIMARY KEY([%s], [%s]))", new Object[]{"type_indexapi", "app_name", "type", "app_name", "type"}));
    }

    /* JADX INFO: finally extract failed */
    public final void a(SQLiteDatabase sQLiteDatabase, ozc ozc, osf osf, oyb oyb, int i) {
        iva.b(sQLiteDatabase.inTransaction());
        String str = ozc.f;
        long max = Math.max(0, ((Long) ozx.bj.c()).longValue() - ((long) i));
        Set<oxe> a2 = ovv.a(sQLiteDatabase, str, oyb);
        a(sQLiteDatabase, ozc, osf, (Set) a2);
        if (!a(sQLiteDatabase, max, (Set) a2)) {
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                osf.f();
                sQLiteDatabase.beginTransaction();
                a(sQLiteDatabase, ozc, osf, (Set) a2);
                if (!a(sQLiteDatabase, max, (Set) a2)) {
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    try {
                        for (oxe oxe : a2) {
                            CorpusStatus b2 = osf.b(ozc, oxe.b(), str);
                            if (b2.a && a(sQLiteDatabase, oxe) > max) {
                                a(sQLiteDatabase, oxe, ozc, b2, osf, 7);
                            }
                        }
                        sQLiteDatabase.beginTransaction();
                        throw new oye();
                    } catch (Throwable th) {
                        sQLiteDatabase.beginTransaction();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                sQLiteDatabase.beginTransaction();
                throw th2;
            }
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String[] strArr, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            oxe oxe = (oxe) it.next();
            iva.b(sQLiteDatabase.inTransaction());
            for (String put : strArr) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("uri", put);
                contentValues.put("action", "del");
                sQLiteDatabase.insertOrThrow(oyc.a(oxe.a()), (String) null, contentValues);
            }
        }
    }

    public final void a(Set set, ozc ozc, osf osf, int i) {
        osf osf2 = osf;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            oxe oxe = (oxe) it.next();
            String str = oxe.b;
            String b2 = oxe.b();
            CorpusStatus b3 = osf2.b(ozc, b2, str);
            if (!b3.a || Integer.parseInt(b3.f) != oxe.a.e) {
                oso.a("Couldn't find corpus '%s'.", (Object) b2);
                osf2.c.d(new ovr(this, this.c, osf, oyc.a(oxe), ozc, b2, oxe, b3, osf, i));
            } else {
                a(getWritableDatabase(), oxe, ozc, b3, osf, i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r12 = new java.util.HashMap();
        r2 = getWritableDatabase();
        r2.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = defpackage.ovv.b(r2, r10, r9).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r3.hasNext() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r4 = (android.util.Pair) r3.next();
        r5 = (defpackage.oxe) r4.first;
        r4 = (java.lang.String) r4.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r9.a(defpackage.oxe.b(r4).a) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r6 = r5.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (defpackage.dvk.c(r2, r6) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r7 = new java.util.ArrayList();
        r14 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 21);
        r14.append("PRAGMA table_info([");
        r14.append(r6);
        r14.append("])");
        r6 = r2.rawQuery(r14.toString(), (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (r6.moveToNext() == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        r7.add(r6.getString(r6.getColumnIndexOrThrow("name")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (r6 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r6 = new java.util.ArrayList();
        r13 = defpackage.oyc.a(r5.a).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        if (r13.hasNext() == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        r6.add((java.lang.String) ((android.util.Pair) r13.next()).first);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ce, code lost:
        java.util.Collections.sort(r7);
        java.util.Collections.sort(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r7.equals(r6) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dc, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        if (r6 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        defpackage.apev.a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e9, code lost:
        defpackage.ovv.a(r2, r5.b, r4);
        r4 = defpackage.oxe.a(r4, r10);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 23);
        r6.append("DROP TABLE IF EXISTS [");
        r6.append(r4);
        r6.append("]");
        r2.execSQL(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0117, code lost:
        r3 = defpackage.ovv.a(r2, r10, r9).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0123, code lost:
        if (r3.hasNext() == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0125, code lost:
        r12.put((defpackage.oxe) r3.next(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0133, code lost:
        r2.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0136, code lost:
        r2.endTransaction();
        r13 = r8.f;
        r14 = r0.m.c(r13);
        r15 = r19.a();
        r16 = r15.a(r14).listIterator();
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0154, code lost:
        if (r16.hasNext() == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0156, code lost:
        r6 = (defpackage.pao) r16.next();
        r3 = r15.d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0161, code lost:
        if (r3 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0163, code lost:
        r4 = defpackage.oxe.a(r3.c, r13, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0169, code lost:
        if (r4 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016f, code lost:
        if (r12.containsKey(r4) == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0171, code lost:
        r12.put(r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0184, code lost:
        if (((java.lang.Boolean) defpackage.pba.aA.c()).booleanValue() == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018a, code lost:
        if (defpackage.axsm.b() != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018c, code lost:
        r5 = r0.c;
        r6 = new defpackage.aaib(r1.c, r0, defpackage.oyc.a(r4), r8);
        r5.d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a4, code lost:
        if (((com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response) r6.h()).b == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a6, code lost:
        r4 = r0.r;
        r5 = (defpackage.aojc) defpackage.aojd.b.o();
        r6 = defpackage.aoks.i.o();
        r7 = r3.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ba, code lost:
        if (r6.c != false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bd, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c3, code lost:
        r11 = (defpackage.aoks) r6.b;
        r7.getClass();
        r1 = r11.a | 16;
        r11.a = r1;
        r11.f = r7;
        r3 = r3.c;
        r3.getClass();
        r11.a = r1 | 32;
        r11.g = r3;
        r5.a(r6);
        r4.a(6016, (defpackage.aojd) r5.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ec, code lost:
        r1 = r0.c;
        r2 = new defpackage.ovq(defpackage.aonk.UNREGISTER_CORPUS, r3.e, r19, r6, r14);
        r1.d(r2);
        r2.h();
        r2 = true;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0209, code lost:
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020e, code lost:
        r1 = getWritableDatabase();
        r1.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r0 = r12.entrySet().iterator();
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0222, code lost:
        if (r0.hasNext() == false) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0224, code lost:
        r4 = (java.util.Map.Entry) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0234, code lost:
        if (((java.lang.Boolean) r4.getValue()).booleanValue() != false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0236, code lost:
        r3 = ((defpackage.oxe) r4.getKey()).c();
        defpackage.ovv.a(r1, ((defpackage.oxe) r4.getKey()).b, r3);
        r3 = defpackage.oxe.a(r3, r10);
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 23);
        r5.append("DROP TABLE IF EXISTS [");
        r5.append(r3);
        r5.append("]");
        r1.execSQL(r5.toString());
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0274, code lost:
        r1.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x027a, code lost:
        if (r2 != false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x027c, code lost:
        if (r3 != false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0280, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0281, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0282, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0285, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0286, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0287, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.osf r19, defpackage.ozc r20, defpackage.oyb r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r8 = r20
            r9 = r21
            java.lang.String r10 = r8.f
            java.util.Set r2 = r1.e
            monitor-enter(r2)
            boolean r3 = defpackage.pba.o()     // Catch:{ all -> 0x028e }
            if (r3 != 0) goto L_0x0014
            goto L_0x001f
        L_0x0014:
            oyb r3 = r1.d     // Catch:{ all -> 0x028e }
            if (r9 == r3) goto L_0x001f
            r1.d = r9     // Catch:{ all -> 0x028e }
            java.util.Set r3 = r1.e     // Catch:{ all -> 0x028e }
            r3.clear()     // Catch:{ all -> 0x028e }
        L_0x001f:
            java.util.Set r3 = r1.e     // Catch:{ all -> 0x028e }
            boolean r3 = r3.add(r10)     // Catch:{ all -> 0x028e }
            r11 = 0
            if (r3 == 0) goto L_0x028b
            monitor-exit(r2)     // Catch:{ all -> 0x028e }
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r18.getWritableDatabase()
            r2.beginTransaction()
            java.util.Set r3 = defpackage.ovv.b(r2, r10, r9)     // Catch:{ all -> 0x0286 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0286 }
        L_0x003d:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0286 }
            if (r4 == 0) goto L_0x0117
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0286 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0286 }
            java.lang.Object r5 = r4.first     // Catch:{ all -> 0x0286 }
            oxe r5 = (defpackage.oxe) r5     // Catch:{ all -> 0x0286 }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x0286 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0286 }
            oxd r6 = defpackage.oxe.b(r4)     // Catch:{ all -> 0x0286 }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x0286 }
            boolean r6 = r9.a((java.lang.String) r6)     // Catch:{ all -> 0x0286 }
            if (r6 == 0) goto L_0x00e9
            java.lang.String r6 = r5.a()     // Catch:{ all -> 0x0286 }
            boolean r7 = defpackage.dvk.c(r2, r6)     // Catch:{ all -> 0x0286 }
            if (r7 == 0) goto L_0x00e9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0286 }
            r7.<init>()     // Catch:{ all -> 0x0286 }
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0286 }
            int r13 = r13.length()     // Catch:{ all -> 0x0286 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0286 }
            int r13 = r13 + 21
            r14.<init>(r13)     // Catch:{ all -> 0x0286 }
            java.lang.String r13 = "PRAGMA table_info(["
            r14.append(r13)     // Catch:{ all -> 0x0286 }
            r14.append(r6)     // Catch:{ all -> 0x0286 }
            java.lang.String r6 = "])"
            r14.append(r6)     // Catch:{ all -> 0x0286 }
            java.lang.String r6 = r14.toString()     // Catch:{ all -> 0x0286 }
            r13 = 0
            android.database.Cursor r6 = r2.rawQuery(r6, r13)     // Catch:{ all -> 0x0286 }
        L_0x0091:
            boolean r13 = r6.moveToNext()     // Catch:{ all -> 0x00db }
            if (r13 == 0) goto L_0x00a5
            java.lang.String r13 = "name"
            int r13 = r6.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x00db }
            java.lang.String r13 = r6.getString(r13)     // Catch:{ all -> 0x00db }
            r7.add(r13)     // Catch:{ all -> 0x00db }
            goto L_0x0091
        L_0x00a5:
            if (r6 != 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r6.close()     // Catch:{ all -> 0x0286 }
        L_0x00ab:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0286 }
            r6.<init>()     // Catch:{ all -> 0x0286 }
            ovo r13 = r5.a     // Catch:{ all -> 0x0286 }
            java.util.List r13 = defpackage.oyc.a((defpackage.ovo) r13)     // Catch:{ all -> 0x0286 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0286 }
        L_0x00ba:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x0286 }
            if (r14 == 0) goto L_0x00ce
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x0286 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x0286 }
            java.lang.Object r14 = r14.first     // Catch:{ all -> 0x0286 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0286 }
            r6.add(r14)     // Catch:{ all -> 0x0286 }
            goto L_0x00ba
        L_0x00ce:
            java.util.Collections.sort(r7)     // Catch:{ all -> 0x0286 }
            java.util.Collections.sort(r6)     // Catch:{ all -> 0x0286 }
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x0286 }
            if (r6 != 0) goto L_0x003d
            goto L_0x00e9
        L_0x00db:
            r0 = move-exception
            r3 = r0
            if (r6 == 0) goto L_0x00e8
            r6.close()     // Catch:{ all -> 0x00e3 }
            goto L_0x00e8
        L_0x00e3:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0286 }
        L_0x00e8:
            throw r3     // Catch:{ all -> 0x0286 }
        L_0x00e9:
            java.lang.String r5 = r5.b     // Catch:{ all -> 0x0286 }
            defpackage.ovv.a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0286 }
            java.lang.String r4 = defpackage.oxe.a(r4, r10)     // Catch:{ all -> 0x0286 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0286 }
            int r5 = r5.length()     // Catch:{ all -> 0x0286 }
            int r5 = r5 + 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0286 }
            r6.<init>(r5)     // Catch:{ all -> 0x0286 }
            java.lang.String r5 = "DROP TABLE IF EXISTS ["
            r6.append(r5)     // Catch:{ all -> 0x0286 }
            r6.append(r4)     // Catch:{ all -> 0x0286 }
            java.lang.String r4 = "]"
            r6.append(r4)     // Catch:{ all -> 0x0286 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0286 }
            r2.execSQL(r4)     // Catch:{ all -> 0x0286 }
            goto L_0x003d
        L_0x0117:
            java.util.Set r3 = defpackage.ovv.a((android.database.sqlite.SQLiteDatabase) r2, (java.lang.String) r10, (defpackage.oyb) r9)     // Catch:{ all -> 0x0286 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0286 }
        L_0x011f:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0286 }
            if (r4 == 0) goto L_0x0133
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0286 }
            oxe r4 = (defpackage.oxe) r4     // Catch:{ all -> 0x0286 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0286 }
            r12.put(r4, r5)     // Catch:{ all -> 0x0286 }
            goto L_0x011f
        L_0x0133:
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0286 }
            r2.endTransaction()
            java.lang.String r13 = r8.f
            ozb r2 = r0.m
            oyz r14 = r2.c(r13)
            ozs r15 = r19.a()
            amzy r2 = r15.a((defpackage.oyz) r14)
            anhk r16 = r2.listIterator()
            r17 = 1
            r2 = 0
        L_0x0150:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x020e
            java.lang.Object r3 = r16.next()
            r6 = r3
            pao r6 = (defpackage.pao) r6
            osz r3 = r15.d(r6)
            if (r3 == 0) goto L_0x0209
            java.lang.String r4 = r3.c
            oxe r4 = defpackage.oxe.a(r4, r13, r9)
            if (r4 == 0) goto L_0x0209
            boolean r5 = r12.containsKey(r4)
            if (r5 == 0) goto L_0x01ec
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r17)
            r12.put(r4, r5)
            agvx r5 = defpackage.pba.aA
            java.lang.Object r5 = r5.c()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0209
            boolean r5 = defpackage.axsm.b()
            if (r5 != 0) goto L_0x0209
            ppp r5 = r0.c
            aaib r6 = new aaib
            android.content.Context r7 = r1.c
            com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request r4 = defpackage.oyc.a((defpackage.oxe) r4)
            r6.<init>(r7, r0, r4, r8)
            r5.d(r6)
            java.lang.Object r4 = r6.h()
            com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response r4 = (com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response) r4
            boolean r4 = r4.b
            if (r4 == 0) goto L_0x0209
            oyq r4 = r0.r
            aojd r5 = defpackage.aojd.b
            aucd r5 = r5.o()
            aojc r5 = (defpackage.aojc) r5
            aoks r6 = defpackage.aoks.i
            aucd r6 = r6.o()
            java.lang.String r7 = r3.e
            boolean r11 = r6.c
            if (r11 != 0) goto L_0x01bd
            goto L_0x01c3
        L_0x01bd:
            r6.c()
            r11 = 0
            r6.c = r11
        L_0x01c3:
            aucj r11 = r6.b
            aoks r11 = (defpackage.aoks) r11
            r7.getClass()
            int r1 = r11.a
            r1 = r1 | 16
            r11.a = r1
            r11.f = r7
            java.lang.String r3 = r3.c
            r3.getClass()
            r1 = r1 | 32
            r11.a = r1
            r11.g = r3
            r5.a(r6)
            r1 = 6016(0x1780, float:8.43E-42)
            aucj r3 = r5.i()
            aojd r3 = (defpackage.aojd) r3
            r4.a((int) r1, (defpackage.aojd) r3)
            goto L_0x0209
        L_0x01ec:
            ppp r1 = r0.c
            ovq r11 = new ovq
            aonk r4 = defpackage.aonk.UNREGISTER_CORPUS
            java.lang.String r5 = r3.e
            r2 = r11
            r3 = r4
            r4 = r5
            r5 = r19
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            r1.d(r11)
            r11.h()
            r2 = 1
            r1 = r18
            r11 = 0
            goto L_0x0150
        L_0x0209:
            r1 = r18
            r11 = 0
            goto L_0x0150
        L_0x020e:
            android.database.sqlite.SQLiteDatabase r1 = r18.getWritableDatabase()
            r1.beginTransaction()
            java.util.Set r0 = r12.entrySet()     // Catch:{ all -> 0x0281 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0281 }
            r3 = 0
        L_0x021e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0281 }
            if (r4 == 0) goto L_0x0274
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0281 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0281 }
            java.lang.Object r5 = r4.getValue()     // Catch:{ all -> 0x0281 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0281 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0281 }
            if (r5 != 0) goto L_0x021e
            java.lang.Object r3 = r4.getKey()     // Catch:{ all -> 0x0281 }
            oxe r3 = (defpackage.oxe) r3     // Catch:{ all -> 0x0281 }
            java.lang.String r3 = r3.c()     // Catch:{ all -> 0x0281 }
            java.lang.Object r4 = r4.getKey()     // Catch:{ all -> 0x0281 }
            oxe r4 = (defpackage.oxe) r4     // Catch:{ all -> 0x0281 }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x0281 }
            defpackage.ovv.a((android.database.sqlite.SQLiteDatabase) r1, (java.lang.String) r4, (java.lang.String) r3)     // Catch:{ all -> 0x0281 }
            java.lang.String r3 = defpackage.oxe.a(r3, r10)     // Catch:{ all -> 0x0281 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0281 }
            int r4 = r4.length()     // Catch:{ all -> 0x0281 }
            int r4 = r4 + 23
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0281 }
            r5.<init>(r4)     // Catch:{ all -> 0x0281 }
            java.lang.String r4 = "DROP TABLE IF EXISTS ["
            r5.append(r4)     // Catch:{ all -> 0x0281 }
            r5.append(r3)     // Catch:{ all -> 0x0281 }
            java.lang.String r3 = "]"
            r5.append(r3)     // Catch:{ all -> 0x0281 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0281 }
            r1.execSQL(r3)     // Catch:{ all -> 0x0281 }
            r3 = 1
            goto L_0x021e
        L_0x0274:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x0281 }
            r1.endTransaction()
            if (r2 != 0) goto L_0x0280
            if (r3 != 0) goto L_0x0280
            r0 = 0
            return r0
        L_0x0280:
            return r17
        L_0x0281:
            r0 = move-exception
            r1.endTransaction()
            throw r0
        L_0x0286:
            r0 = move-exception
            r2.endTransaction()
            throw r0
        L_0x028b:
            monitor-exit(r2)     // Catch:{ all -> 0x028e }
            r0 = 0
            return r0
        L_0x028e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x028e }
            goto L_0x0292
        L_0x0291:
            throw r0
        L_0x0292:
            goto L_0x0291
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovw.a(osf, ozc, oyb):boolean");
    }
}
