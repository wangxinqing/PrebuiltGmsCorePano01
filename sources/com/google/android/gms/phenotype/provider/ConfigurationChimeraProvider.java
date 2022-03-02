package com.google.android.gms.phenotype.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Base64;
import com.google.android.chimera.ContentProvider;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfigurationChimeraProvider extends ContentProvider {
    private static final jjg a = jjg.a(iyc.PHENOTYPE);

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        PrintWriter printWriter2 = printWriter;
        yfg a2 = yfg.a(getContext());
        try {
            SQLiteDatabase writableDatabase = a2.getWritableDatabase();
            query = writableDatabase.query("ExperimentTokens", new String[]{"packageName", "version", "user", "experimentToken", "servingVersion"}, "isCommitted = 1", (String[]) null, (String) null, (String) null, "packageName");
            printWriter2.println("Phenotype committed experiment tokens; config-package v=version u=user: base64-token (config version)");
            while (query.moveToNext()) {
                printWriter2.println(String.format(Locale.US, "%s v=%d u=%s: %s (%d)", new Object[]{query.getString(0), Integer.valueOf(query.getInt(1)), query.getString(2), Base64.encodeToString(query.getBlob(3), 11), Long.valueOf(query.getLong(4))}));
            }
            if (query != null) {
                query.close();
            }
            if (ayya.a.a().b()) {
                apgl apgl = (apgl) apgn.d.o();
                if (apgl.c) {
                    apgl.c();
                    apgl.c = false;
                }
                apgn apgn = (apgn) apgl.b;
                apgn.b = 2;
                apgn.a |= 1;
                apgl apgl2 = apgl;
                query2 = writableDatabase.query("Flags", new String[]{"packageName", "name", "intVal", "boolVal", "floatVal", "stringVal", "extensionVal"}, "committed = 1", (String[]) null, (String) null, (String) null, "packageName, name");
                String str = null;
                aucd aucd = null;
                while (query2.moveToNext()) {
                    String string = query2.getString(0);
                    if (!string.equals(str)) {
                        if (aucd != null) {
                            if (((apgo) aucd.b).c.size() > 0) {
                                apgl2.a(aucd);
                            }
                        }
                        aucd o = apgo.d.o();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        apgo apgo = (apgo) o.b;
                        string.getClass();
                        apgo.a |= 1;
                        apgo.b = string;
                        aucd = o;
                        str = string;
                    }
                    aucd o2 = apgp.e.o();
                    String string2 = query2.getString(1);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    apgp apgp = (apgp) o2.b;
                    string2.getClass();
                    apgp.a |= 1;
                    apgp.d = string2;
                    if (!query2.isNull(2)) {
                        long j = query2.getLong(2);
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        apgp apgp2 = (apgp) o2.b;
                        apgp2.b = 2;
                        apgp2.c = Long.valueOf(j);
                    } else if (!query2.isNull(3)) {
                        boolean z = query2.getInt(3) != 0;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        apgp apgp3 = (apgp) o2.b;
                        apgp3.b = 4;
                        apgp3.c = Boolean.valueOf(z);
                    } else if (!query2.isNull(4)) {
                        double d = query2.getDouble(4);
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        apgp apgp4 = (apgp) o2.b;
                        apgp4.b = 3;
                        apgp4.c = Double.valueOf(d);
                    } else if (!query2.isNull(5)) {
                        String string3 = query2.getString(5);
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        apgp apgp5 = (apgp) o2.b;
                        string3.getClass();
                        apgp5.b = 5;
                        apgp5.c = string3;
                    } else if (!query2.isNull(6)) {
                        auay a3 = auay.a(query2.getBlob(6));
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        apgp apgp6 = (apgp) o2.b;
                        a3.getClass();
                        apgp6.b = 6;
                        apgp6.c = a3;
                    }
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    apgo apgo2 = (apgo) aucd.b;
                    apgp apgp7 = (apgp) o2.i();
                    apgo apgo3 = apgo.d;
                    apgp7.getClass();
                    if (!apgo2.c.a()) {
                        apgo2.c = aucj.a(apgo2.c);
                    }
                    apgo2.c.add(apgp7);
                }
                if (query2 != null) {
                    query2.close();
                }
                if (aucd != null) {
                    if (((apgo) aucd.b).c.size() > 0) {
                        apgl2.a(aucd);
                    }
                }
                String valueOf = String.valueOf(Base64.encodeToString(((apgn) apgl2.i()).k(), 11));
                printWriter2.println(valueOf.length() == 0 ? new String("Phenotype committed flags: ") : "Phenotype committed flags: ".concat(valueOf));
            }
        } catch (SQLiteException e) {
            try {
                ygu.a(getContext(), "ConfigurationChimeraProvider-dump", e);
            } catch (Throwable th3) {
                a2.close();
                throw th3;
            }
        } catch (Throwable th4) {
            apev.a(th2, th4);
        }
        a2.close();
        return;
        throw th2;
        throw th;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final boolean onCreate() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: android.database.sqlite.SQLiteException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: yfx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: yfx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: yfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: yfy} */
    /* JADX WARNING: type inference failed for: r0v36, types: [java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v41, types: [java.lang.RuntimeException] */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03f0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03f6, code lost:
        if (r0.a == 29512) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03f8, code lost:
        ((defpackage.anih) ((defpackage.anih) a.c()).a("com.google.android.gms.phenotype.provider.ConfigurationChimeraProvider", "query", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s", (java.lang.Object) r0.b);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0411, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:37:0x00e1, B:189:0x03dd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02cf A[Catch:{ all -> 0x03da, yfx -> 0x03f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02d0 A[Catch:{ all -> 0x03da, yfx -> 0x03f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f8 A[Catch:{ all -> 0x03da, yfx -> 0x03f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02f9 A[Catch:{ all -> 0x03da, yfx -> 0x03f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0314 A[Catch:{ all -> 0x03da, yfx -> 0x03f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0315 A[Catch:{ all -> 0x03da, yfx -> 0x03f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x032c A[Catch:{ all -> 0x03da, yfx -> 0x03f1 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor query(android.net.Uri r21, java.lang.String[] r22, java.lang.String r23, java.lang.String[] r24, java.lang.String r25) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            android.content.Context r2 = r20.getContext()
            boolean r2 = defpackage.aekv.a(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0017
            boolean r2 = defpackage.ayyk.c()
            if (r2 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            return r3
        L_0x0017:
            java.lang.String r2 = r21.getLastPathSegment()
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r5 = "query"
            java.lang.String r6 = "com.google.android.gms.phenotype.provider.ConfigurationChimeraProvider"
            if (r2 != 0) goto L_0x0039
            jjg r1 = a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r2 = 100
            anie r1 = r1.a((java.lang.String) r6, (java.lang.String) r5, (int) r2, (java.lang.String) r4)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "Invalid Uri: %s"
            r1.a((java.lang.String) r2, (java.lang.Object) r0)
            return r3
        L_0x0039:
            android.content.Context r7 = r20.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            int r8 = android.os.Binder.getCallingUid()
            java.lang.String r7 = r7.getNameForUid(r8)
            boolean r8 = defpackage.azam.b()
            if (r8 == 0) goto L_0x0053
            java.lang.String r2 = defpackage.ygb.a(r2, r7)
        L_0x0053:
            android.content.Context r8 = r20.getContext()
            android.content.Context r8 = r8.getApplicationContext()
            int r9 = android.os.Binder.getCallingUid()
            hya r8 = defpackage.hya.a((android.content.Context) r8)
            boolean r8 = r8.a((int) r9)
            if (r8 != 0) goto L_0x008e
            java.lang.String r8 = defpackage.ayya.b()
            java.lang.String r9 = defpackage.ygb.a(r2)
            boolean r8 = defpackage.yge.a(r8, r9)
            if (r8 == 0) goto L_0x0078
            goto L_0x008e
        L_0x0078:
            jjg r1 = a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r2 = 111(0x6f, float:1.56E-43)
            anie r1 = r1.a((java.lang.String) r6, (java.lang.String) r5, (int) r2, (java.lang.String) r4)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "Caller is not authorized to access Uri: %s"
            r1.a((java.lang.String) r2, (java.lang.Object) r0)
            return r3
        L_0x008e:
            r8 = 0
            if (r1 == 0) goto L_0x00db
            r9 = r3
            r0 = 0
        L_0x0093:
            int r10 = r0 + 1
            int r11 = r1.length
            if (r10 >= r11) goto L_0x00d9
            r11 = r1[r0]
            r10 = r1[r10]
            java.lang.String r12 = "account"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00a5
            goto L_0x00c0
        L_0x00a5:
            if (r10 != 0) goto L_0x00bd
            jjg r0 = a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 123(0x7b, float:1.72E-43)
            anie r0 = r0.a((java.lang.String) r6, (java.lang.String) r5, (int) r1, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Invalid argument for account: null"
            r0.a((java.lang.String) r1)
            return r3
        L_0x00bd:
            if (r9 != 0) goto L_0x00c3
            r9 = r10
        L_0x00c0:
            int r0 = r0 + 2
            goto L_0x0093
        L_0x00c3:
            jjg r0 = a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 127(0x7f, float:1.78E-43)
            anie r0 = r0.a((java.lang.String) r6, (java.lang.String) r5, (int) r1, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Cannot specify argument \"account\" twice"
            r0.a((java.lang.String) r1)
            return r3
        L_0x00d9:
            r1 = r9
            goto L_0x00dc
        L_0x00db:
            r1 = r3
        L_0x00dc:
            r15 = 2
            r16 = 1
            if (r1 == 0) goto L_0x03b0
            android.content.Context r0 = r20.getContext()     // Catch:{ yfx -> 0x03f1 }
            boolean r0 = defpackage.aekv.a(r0)     // Catch:{ yfx -> 0x03f1 }
            if (r0 != 0) goto L_0x03a8
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)     // Catch:{ yfx -> 0x03f1 }
            if (r0 == 0) goto L_0x00f4
            goto L_0x0101
        L_0x00f4:
            android.content.Context r0 = r20.getContext()     // Catch:{ yfx -> 0x03f1 }
            boolean r0 = defpackage.ygd.a(r1, r0)     // Catch:{ yfx -> 0x03f1 }
            if (r0 != 0) goto L_0x0101
            r0 = r3
            goto L_0x0412
        L_0x0101:
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ yfx -> 0x03f1 }
            android.content.Context r0 = r20.getContext()     // Catch:{ yfx -> 0x03f1 }
            yfg r14 = defpackage.yfg.a(r0)     // Catch:{ yfx -> 0x03f1 }
            r13 = 37
            android.database.sqlite.SQLiteDatabase r19 = r14.getWritableDatabase()     // Catch:{ SQLiteException -> 0x02a2, yfx -> 0x0296, yfy -> 0x028c, RuntimeException -> 0x0285, all -> 0x0282 }
            r19.beginTransaction()     // Catch:{ SQLiteException -> 0x02a2, yfx -> 0x0296, yfy -> 0x028c, RuntimeException -> 0x0285, all -> 0x0282 }
            yhe r0 = new yhe     // Catch:{ all -> 0x0274 }
            r12 = 0
            r9 = r0
            r10 = r2
            r11 = r1
            r3 = 37
            r13 = r2
            r3 = r14
            r14 = r7
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0272 }
            android.content.Context r9 = r20.getContext()     // Catch:{ all -> 0x0272 }
            com.google.android.gms.phenotype.Configurations r0 = r0.a(r9, r3)     // Catch:{ all -> 0x0272 }
            java.lang.String r9 = r0.a     // Catch:{ all -> 0x0272 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0272 }
            if (r9 != 0) goto L_0x01dd
            ygx r9 = new ygx     // Catch:{ all -> 0x0272 }
            java.lang.String r10 = r0.a     // Catch:{ all -> 0x0272 }
            r9.<init>(r10, r7)     // Catch:{ all -> 0x0272 }
            android.content.Context r7 = r20.getContext()     // Catch:{ all -> 0x0272 }
            r9.a(r7, r3)     // Catch:{ all -> 0x0272 }
            android.content.Context r7 = r20.getContext()     // Catch:{ all -> 0x0272 }
            defpackage.ygw.a(r7, r3, r9)     // Catch:{ all -> 0x0272 }
            r19.setTransactionSuccessful()     // Catch:{ all -> 0x0272 }
            r19.endTransaction()     // Catch:{ SQLiteException -> 0x0280, yfx -> 0x027e, yfy -> 0x027c, RuntimeException -> 0x027a }
            r3.close()     // Catch:{ yfx -> 0x03f1 }
            android.content.Context r3 = r20.getContext()     // Catch:{ yfx -> 0x03f1 }
            aucd r3 = defpackage.yfd.a(r3)     // Catch:{ yfx -> 0x03f1 }
            avst r7 = defpackage.avst.m     // Catch:{ yfx -> 0x03f1 }
            aucd r7 = r7.o()     // Catch:{ yfx -> 0x03f1 }
            avss r7 = (defpackage.avss) r7     // Catch:{ yfx -> 0x03f1 }
            boolean r9 = r7.c     // Catch:{ yfx -> 0x03f1 }
            if (r9 != 0) goto L_0x0167
            goto L_0x016c
        L_0x0167:
            r7.c()     // Catch:{ yfx -> 0x03f1 }
            r7.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x016c:
            aucj r9 = r7.b     // Catch:{ yfx -> 0x03f1 }
            avst r9 = (defpackage.avst) r9     // Catch:{ yfx -> 0x03f1 }
            r2.getClass()     // Catch:{ yfx -> 0x03f1 }
            int r10 = r9.a     // Catch:{ yfx -> 0x03f1 }
            r10 = r10 | 1
            r9.a = r10     // Catch:{ yfx -> 0x03f1 }
            r9.b = r2     // Catch:{ yfx -> 0x03f1 }
            r1.getClass()     // Catch:{ yfx -> 0x03f1 }
            r2 = r10 | 4
            r9.a = r2     // Catch:{ yfx -> 0x03f1 }
            r9.f = r1     // Catch:{ yfx -> 0x03f1 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ yfx -> 0x03f1 }
            long r1 = r1 - r17
            int r2 = (int) r1     // Catch:{ yfx -> 0x03f1 }
            boolean r1 = r7.c     // Catch:{ yfx -> 0x03f1 }
            if (r1 != 0) goto L_0x0190
            goto L_0x0195
        L_0x0190:
            r7.c()     // Catch:{ yfx -> 0x03f1 }
            r7.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x0195:
            aucj r1 = r7.b     // Catch:{ yfx -> 0x03f1 }
            avst r1 = (defpackage.avst) r1     // Catch:{ yfx -> 0x03f1 }
            int r9 = r1.a     // Catch:{ yfx -> 0x03f1 }
            r9 = r9 | 256(0x100, float:3.59E-43)
            r1.a = r9     // Catch:{ yfx -> 0x03f1 }
            r1.l = r2     // Catch:{ yfx -> 0x03f1 }
            aucj r1 = r7.i()     // Catch:{ yfx -> 0x03f1 }
            avst r1 = (defpackage.avst) r1     // Catch:{ yfx -> 0x03f1 }
            boolean r2 = r3.c     // Catch:{ yfx -> 0x03f1 }
            if (r2 != 0) goto L_0x01ac
            goto L_0x01b1
        L_0x01ac:
            r3.c()     // Catch:{ yfx -> 0x03f1 }
            r3.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x01b1:
            aucj r2 = r3.b     // Catch:{ yfx -> 0x03f1 }
            avtk r2 = (defpackage.avtk) r2     // Catch:{ yfx -> 0x03f1 }
            avtk r7 = defpackage.avtk.k     // Catch:{ yfx -> 0x03f1 }
            r1.getClass()     // Catch:{ yfx -> 0x03f1 }
            r2.c = r1     // Catch:{ yfx -> 0x03f1 }
            int r1 = r2.a     // Catch:{ yfx -> 0x03f1 }
            r1 = r1 | r15
            r2.a = r1     // Catch:{ yfx -> 0x03f1 }
            hol r1 = defpackage.yfd.a()     // Catch:{ yfx -> 0x03f1 }
            aucj r2 = r3.i()     // Catch:{ yfx -> 0x03f1 }
            avtk r2 = (defpackage.avtk) r2     // Catch:{ yfx -> 0x03f1 }
            byte[] r2 = r2.k()     // Catch:{ yfx -> 0x03f1 }
            hoi r1 = r1.a((byte[]) r2)     // Catch:{ yfx -> 0x03f1 }
            r2 = 37
            r1.b((int) r2)     // Catch:{ yfx -> 0x03f1 }
            r1.b()     // Catch:{ yfx -> 0x03f1 }
            goto L_0x0412
        L_0x01dd:
            r19.setTransactionSuccessful()     // Catch:{ all -> 0x0272 }
            r19.endTransaction()     // Catch:{ SQLiteException -> 0x0280, yfx -> 0x027e, yfy -> 0x027c, RuntimeException -> 0x027a }
            r3.close()     // Catch:{ yfx -> 0x03f1 }
            android.content.Context r0 = r20.getContext()     // Catch:{ yfx -> 0x03f1 }
            aucd r0 = defpackage.yfd.a(r0)     // Catch:{ yfx -> 0x03f1 }
            avst r3 = defpackage.avst.m     // Catch:{ yfx -> 0x03f1 }
            aucd r3 = r3.o()     // Catch:{ yfx -> 0x03f1 }
            avss r3 = (defpackage.avss) r3     // Catch:{ yfx -> 0x03f1 }
            boolean r7 = r3.c     // Catch:{ yfx -> 0x03f1 }
            if (r7 != 0) goto L_0x01fb
            goto L_0x0200
        L_0x01fb:
            r3.c()     // Catch:{ yfx -> 0x03f1 }
            r3.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x0200:
            aucj r7 = r3.b     // Catch:{ yfx -> 0x03f1 }
            avst r7 = (defpackage.avst) r7     // Catch:{ yfx -> 0x03f1 }
            r2.getClass()     // Catch:{ yfx -> 0x03f1 }
            int r9 = r7.a     // Catch:{ yfx -> 0x03f1 }
            r9 = r9 | 1
            r7.a = r9     // Catch:{ yfx -> 0x03f1 }
            r7.b = r2     // Catch:{ yfx -> 0x03f1 }
            r1.getClass()     // Catch:{ yfx -> 0x03f1 }
            r2 = r9 | 4
            r7.a = r2     // Catch:{ yfx -> 0x03f1 }
            r7.f = r1     // Catch:{ yfx -> 0x03f1 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ yfx -> 0x03f1 }
            long r1 = r1 - r17
            int r2 = (int) r1     // Catch:{ yfx -> 0x03f1 }
            boolean r1 = r3.c     // Catch:{ yfx -> 0x03f1 }
            if (r1 != 0) goto L_0x0224
            goto L_0x0229
        L_0x0224:
            r3.c()     // Catch:{ yfx -> 0x03f1 }
            r3.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x0229:
            aucj r1 = r3.b     // Catch:{ yfx -> 0x03f1 }
            avst r1 = (defpackage.avst) r1     // Catch:{ yfx -> 0x03f1 }
            int r7 = r1.a     // Catch:{ yfx -> 0x03f1 }
            r7 = r7 | 256(0x100, float:3.59E-43)
            r1.a = r7     // Catch:{ yfx -> 0x03f1 }
            r1.l = r2     // Catch:{ yfx -> 0x03f1 }
            aucj r1 = r3.i()     // Catch:{ yfx -> 0x03f1 }
            avst r1 = (defpackage.avst) r1     // Catch:{ yfx -> 0x03f1 }
            boolean r2 = r0.c     // Catch:{ yfx -> 0x03f1 }
            if (r2 != 0) goto L_0x0240
            goto L_0x0245
        L_0x0240:
            r0.c()     // Catch:{ yfx -> 0x03f1 }
            r0.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x0245:
            aucj r2 = r0.b     // Catch:{ yfx -> 0x03f1 }
            avtk r2 = (defpackage.avtk) r2     // Catch:{ yfx -> 0x03f1 }
            avtk r3 = defpackage.avtk.k     // Catch:{ yfx -> 0x03f1 }
            r1.getClass()     // Catch:{ yfx -> 0x03f1 }
            r2.c = r1     // Catch:{ yfx -> 0x03f1 }
            int r1 = r2.a     // Catch:{ yfx -> 0x03f1 }
            r1 = r1 | r15
            r2.a = r1     // Catch:{ yfx -> 0x03f1 }
            hol r1 = defpackage.yfd.a()     // Catch:{ yfx -> 0x03f1 }
            aucj r0 = r0.i()     // Catch:{ yfx -> 0x03f1 }
            avtk r0 = (defpackage.avtk) r0     // Catch:{ yfx -> 0x03f1 }
            byte[] r0 = r0.k()     // Catch:{ yfx -> 0x03f1 }
            hoi r0 = r1.a((byte[]) r0)     // Catch:{ yfx -> 0x03f1 }
            r1 = 37
            r0.b((int) r1)     // Catch:{ yfx -> 0x03f1 }
            r0.b()     // Catch:{ yfx -> 0x03f1 }
            r0 = 0
            goto L_0x0412
        L_0x0272:
            r0 = move-exception
            goto L_0x0276
        L_0x0274:
            r0 = move-exception
            r3 = r14
        L_0x0276:
            r19.endTransaction()     // Catch:{ SQLiteException -> 0x0280, yfx -> 0x027e, yfy -> 0x027c, RuntimeException -> 0x027a }
            throw r0     // Catch:{ SQLiteException -> 0x0280, yfx -> 0x027e, yfy -> 0x027c, RuntimeException -> 0x027a }
        L_0x027a:
            r0 = move-exception
            goto L_0x0287
        L_0x027c:
            r0 = move-exception
            goto L_0x028e
        L_0x027e:
            r0 = move-exception
            goto L_0x0298
        L_0x0280:
            r0 = move-exception
            goto L_0x02a4
        L_0x0282:
            r0 = move-exception
            r3 = r14
            goto L_0x02b6
        L_0x0285:
            r0 = move-exception
            r3 = r14
        L_0x0287:
            r7 = r0
            throw r7     // Catch:{ all -> 0x0289 }
        L_0x0289:
            r0 = move-exception
            r9 = 0
            goto L_0x02b8
        L_0x028c:
            r0 = move-exception
            r3 = r14
        L_0x028e:
            r7 = r0
            int r0 = r7.a     // Catch:{ all -> 0x02b5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02b5 }
            throw r7     // Catch:{ all -> 0x02a0 }
        L_0x0296:
            r0 = move-exception
            r3 = r14
        L_0x0298:
            r7 = r0
            int r0 = r7.a     // Catch:{ all -> 0x02b5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02b5 }
            throw r7     // Catch:{ all -> 0x02a0 }
        L_0x02a0:
            r0 = move-exception
            goto L_0x02b8
        L_0x02a2:
            r0 = move-exception
            r3 = r14
        L_0x02a4:
            r7 = r0
            android.content.Context r0 = r20.getContext()     // Catch:{ all -> 0x02b5 }
            java.lang.Class r9 = r20.getClass()     // Catch:{ all -> 0x02b5 }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x02b5 }
            defpackage.ygu.a((android.content.Context) r0, (java.lang.String) r9, (android.database.sqlite.SQLiteException) r7)     // Catch:{ all -> 0x02b5 }
            throw r7     // Catch:{ all -> 0x0289 }
        L_0x02b5:
            r0 = move-exception
        L_0x02b6:
            r7 = 0
            r9 = 0
        L_0x02b8:
            r3.close()     // Catch:{ yfx -> 0x03f1 }
            android.content.Context r3 = r20.getContext()     // Catch:{ yfx -> 0x03f1 }
            aucd r3 = defpackage.yfd.a(r3)     // Catch:{ yfx -> 0x03f1 }
            avst r10 = defpackage.avst.m     // Catch:{ yfx -> 0x03f1 }
            aucd r10 = r10.o()     // Catch:{ yfx -> 0x03f1 }
            avss r10 = (defpackage.avss) r10     // Catch:{ yfx -> 0x03f1 }
            boolean r11 = r10.c     // Catch:{ yfx -> 0x03f1 }
            if (r11 != 0) goto L_0x02d0
            goto L_0x02d5
        L_0x02d0:
            r10.c()     // Catch:{ yfx -> 0x03f1 }
            r10.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x02d5:
            aucj r11 = r10.b     // Catch:{ yfx -> 0x03f1 }
            avst r11 = (defpackage.avst) r11     // Catch:{ yfx -> 0x03f1 }
            r2.getClass()     // Catch:{ yfx -> 0x03f1 }
            int r12 = r11.a     // Catch:{ yfx -> 0x03f1 }
            r12 = r12 | 1
            r11.a = r12     // Catch:{ yfx -> 0x03f1 }
            r11.b = r2     // Catch:{ yfx -> 0x03f1 }
            r1.getClass()     // Catch:{ yfx -> 0x03f1 }
            r2 = r12 | 4
            r11.a = r2     // Catch:{ yfx -> 0x03f1 }
            r11.f = r1     // Catch:{ yfx -> 0x03f1 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ yfx -> 0x03f1 }
            long r1 = r1 - r17
            int r2 = (int) r1     // Catch:{ yfx -> 0x03f1 }
            boolean r1 = r10.c     // Catch:{ yfx -> 0x03f1 }
            if (r1 != 0) goto L_0x02f9
            goto L_0x02fe
        L_0x02f9:
            r10.c()     // Catch:{ yfx -> 0x03f1 }
            r10.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x02fe:
            aucj r1 = r10.b     // Catch:{ yfx -> 0x03f1 }
            avst r1 = (defpackage.avst) r1     // Catch:{ yfx -> 0x03f1 }
            int r11 = r1.a     // Catch:{ yfx -> 0x03f1 }
            r11 = r11 | 256(0x100, float:3.59E-43)
            r1.a = r11     // Catch:{ yfx -> 0x03f1 }
            r1.l = r2     // Catch:{ yfx -> 0x03f1 }
            aucj r1 = r10.i()     // Catch:{ yfx -> 0x03f1 }
            avst r1 = (defpackage.avst) r1     // Catch:{ yfx -> 0x03f1 }
            boolean r2 = r3.c     // Catch:{ yfx -> 0x03f1 }
            if (r2 != 0) goto L_0x0315
            goto L_0x031a
        L_0x0315:
            r3.c()     // Catch:{ yfx -> 0x03f1 }
            r3.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x031a:
            aucj r2 = r3.b     // Catch:{ yfx -> 0x03f1 }
            avtk r2 = (defpackage.avtk) r2     // Catch:{ yfx -> 0x03f1 }
            avtk r10 = defpackage.avtk.k     // Catch:{ yfx -> 0x03f1 }
            r1.getClass()     // Catch:{ yfx -> 0x03f1 }
            r2.c = r1     // Catch:{ yfx -> 0x03f1 }
            int r1 = r2.a     // Catch:{ yfx -> 0x03f1 }
            r1 = r1 | r15
            r2.a = r1     // Catch:{ yfx -> 0x03f1 }
            if (r7 == 0) goto L_0x038d
            avti r1 = defpackage.avti.d     // Catch:{ yfx -> 0x03f1 }
            aucd r1 = r1.o()     // Catch:{ yfx -> 0x03f1 }
            java.lang.Class r2 = r7.getClass()     // Catch:{ yfx -> 0x03f1 }
            java.lang.String r2 = r2.getName()     // Catch:{ yfx -> 0x03f1 }
            boolean r7 = r1.c     // Catch:{ yfx -> 0x03f1 }
            if (r7 != 0) goto L_0x033f
            goto L_0x0344
        L_0x033f:
            r1.c()     // Catch:{ yfx -> 0x03f1 }
            r1.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x0344:
            aucj r7 = r1.b     // Catch:{ yfx -> 0x03f1 }
            avti r7 = (defpackage.avti) r7     // Catch:{ yfx -> 0x03f1 }
            r2.getClass()     // Catch:{ yfx -> 0x03f1 }
            int r10 = r7.a     // Catch:{ yfx -> 0x03f1 }
            r10 = r10 | 1
            r7.a = r10     // Catch:{ yfx -> 0x03f1 }
            r7.b = r2     // Catch:{ yfx -> 0x03f1 }
            if (r9 == 0) goto L_0x036e
            int r2 = r9.intValue()     // Catch:{ yfx -> 0x03f1 }
            boolean r7 = r1.c     // Catch:{ yfx -> 0x03f1 }
            if (r7 != 0) goto L_0x035e
            goto L_0x0363
        L_0x035e:
            r1.c()     // Catch:{ yfx -> 0x03f1 }
            r1.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x0363:
            aucj r7 = r1.b     // Catch:{ yfx -> 0x03f1 }
            avti r7 = (defpackage.avti) r7     // Catch:{ yfx -> 0x03f1 }
            int r9 = r7.a     // Catch:{ yfx -> 0x03f1 }
            r9 = r9 | r15
            r7.a = r9     // Catch:{ yfx -> 0x03f1 }
            r7.c = r2     // Catch:{ yfx -> 0x03f1 }
        L_0x036e:
            boolean r2 = r3.c     // Catch:{ yfx -> 0x03f1 }
            if (r2 != 0) goto L_0x0373
            goto L_0x0378
        L_0x0373:
            r3.c()     // Catch:{ yfx -> 0x03f1 }
            r3.c = r8     // Catch:{ yfx -> 0x03f1 }
        L_0x0378:
            aucj r2 = r3.b     // Catch:{ yfx -> 0x03f1 }
            avtk r2 = (defpackage.avtk) r2     // Catch:{ yfx -> 0x03f1 }
            aucj r1 = r1.i()     // Catch:{ yfx -> 0x03f1 }
            avti r1 = (defpackage.avti) r1     // Catch:{ yfx -> 0x03f1 }
            r1.getClass()     // Catch:{ yfx -> 0x03f1 }
            r2.e = r1     // Catch:{ yfx -> 0x03f1 }
            int r1 = r2.a     // Catch:{ yfx -> 0x03f1 }
            r1 = r1 | 8
            r2.a = r1     // Catch:{ yfx -> 0x03f1 }
        L_0x038d:
            hol r1 = defpackage.yfd.a()     // Catch:{ yfx -> 0x03f1 }
            aucj r2 = r3.i()     // Catch:{ yfx -> 0x03f1 }
            avtk r2 = (defpackage.avtk) r2     // Catch:{ yfx -> 0x03f1 }
            byte[] r2 = r2.k()     // Catch:{ yfx -> 0x03f1 }
            hoi r1 = r1.a((byte[]) r2)     // Catch:{ yfx -> 0x03f1 }
            r2 = 37
            r1.b((int) r2)     // Catch:{ yfx -> 0x03f1 }
            r1.b()     // Catch:{ yfx -> 0x03f1 }
            throw r0     // Catch:{ yfx -> 0x03f1 }
        L_0x03a8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ yfx -> 0x03f1 }
            java.lang.String r1 = "Phenotype commitOnQuery cannot be used in direct boot mode"
            r0.<init>(r1)     // Catch:{ yfx -> 0x03f1 }
            throw r0     // Catch:{ yfx -> 0x03f1 }
        L_0x03b0:
            android.content.Context r0 = r20.getContext()     // Catch:{ yfx -> 0x03f1 }
            yfg r1 = defpackage.yfg.a(r0)     // Catch:{ yfx -> 0x03f1 }
            android.database.sqlite.SQLiteDatabase r3 = r1.getWritableDatabase()     // Catch:{ SQLiteException -> 0x03dc }
            defpackage.yfw.a((android.database.sqlite.SQLiteDatabase) r3)     // Catch:{ SQLiteException -> 0x03dc }
            boolean r0 = defpackage.yhb.a(r3, r2)     // Catch:{ all -> 0x03d5 }
            if (r0 == 0) goto L_0x03ca
            com.google.android.gms.phenotype.Configurations r0 = defpackage.yhb.b(r3, r2)     // Catch:{ all -> 0x03d5 }
            goto L_0x03cb
        L_0x03ca:
            r0 = 0
        L_0x03cb:
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x03d5 }
            r3.endTransaction()     // Catch:{ SQLiteException -> 0x03dc }
            r1.close()     // Catch:{ yfx -> 0x03f1 }
            goto L_0x0412
        L_0x03d5:
            r0 = move-exception
            r3.endTransaction()     // Catch:{ SQLiteException -> 0x03dc }
            throw r0     // Catch:{ SQLiteException -> 0x03dc }
        L_0x03da:
            r0 = move-exception
            goto L_0x03ed
        L_0x03dc:
            r0 = move-exception
            android.content.Context r2 = r20.getContext()     // Catch:{ all -> 0x03da }
            java.lang.Class r3 = r20.getClass()     // Catch:{ all -> 0x03da }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x03da }
            defpackage.ygu.a((android.content.Context) r2, (java.lang.String) r3, (android.database.sqlite.SQLiteException) r0)     // Catch:{ all -> 0x03da }
            throw r0     // Catch:{ all -> 0x03da }
        L_0x03ed:
            r1.close()     // Catch:{ yfx -> 0x03f1 }
            throw r0     // Catch:{ yfx -> 0x03f1 }
        L_0x03f1:
            r0 = move-exception
            int r1 = r0.a
            r2 = 29512(0x7348, float:4.1355E-41)
            if (r1 != r2) goto L_0x0411
            jjg r1 = a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r2 = 146(0x92, float:2.05E-43)
            anie r1 = r1.a((java.lang.String) r6, (java.lang.String) r5, (int) r2, (java.lang.String) r4)
            anih r1 = (defpackage.anih) r1
            java.lang.String r0 = r0.b
            java.lang.String r2 = "%s"
            r1.a((java.lang.String) r2, (java.lang.Object) r0)
            r0 = 0
            goto L_0x0412
        L_0x0411:
            r0 = 0
        L_0x0412:
            if (r0 == 0) goto L_0x0470
            com.google.android.gms.phenotype.Configuration[] r1 = r0.d
            if (r1 == 0) goto L_0x0470
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String[] r2 = defpackage.aguy.c
            r1.<init>(r2)
            com.google.android.gms.phenotype.Configuration[] r2 = r0.d
            int r3 = r2.length
            r4 = 0
        L_0x0423:
            if (r4 >= r3) goto L_0x0444
            r5 = r2[r4]
            com.google.android.gms.phenotype.Flag[] r5 = r5.b
            int r6 = r5.length
            r7 = 0
        L_0x042b:
            if (r7 >= r6) goto L_0x0441
            r9 = r5[r7]
            java.lang.String[] r10 = new java.lang.String[r15]
            java.lang.String r11 = r9.a
            r10[r8] = r11
            java.lang.String r9 = r9.f()
            r10[r16] = r9
            r1.addRow(r10)
            int r7 = r7 + 1
            goto L_0x042b
        L_0x0441:
            int r4 = r4 + 1
            goto L_0x0423
        L_0x0444:
            java.lang.String[] r2 = new java.lang.String[r15]
            java.lang.String r3 = "__phenotype_server_token"
            r2[r8] = r3
            java.lang.String r3 = r0.c
            r2[r16] = r3
            r1.addRow(r2)
            java.lang.String[] r2 = new java.lang.String[r15]
            java.lang.String r3 = "__phenotype_snapshot_token"
            r2[r8] = r3
            java.lang.String r3 = r0.a
            r2[r16] = r3
            r1.addRow(r2)
            java.lang.String[] r2 = new java.lang.String[r15]
            java.lang.String r3 = "__phenotype_configuration_version"
            r2[r8] = r3
            long r3 = r0.g
            java.lang.String r0 = java.lang.Long.toString(r3)
            r2[r16] = r0
            r1.addRow(r2)
            return r1
        L_0x0470:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.provider.ConfigurationChimeraProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
