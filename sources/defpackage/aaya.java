package defpackage;

import android.content.ContentValues;
import android.content.Context;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aaya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaya {
    private static final Set a = new HashSet(Arrays.asList(new String[]{"/dev", "/proc", "/sys", "/system"}));
    private List b;
    private ArrayDeque c;
    private final aayh d;
    private final long e;
    private final aayw f;
    private final aayx g;

    public aaya(Context context, aayh aayh, long j, aayx aayx) {
        this.d = aayh;
        this.e = j;
        this.f = new aayw(context);
        this.g = aayx;
    }

    private final void a(File file) {
        try {
            if (!this.d.b(file) && !a.contains(file.getAbsolutePath())) {
                if (file.isFile()) {
                    aayh aayh = this.d;
                    aayf a2 = aayh.a(file);
                    if ((aayh.a & a2.c) != 0 && a2.b == 0) {
                        byte[] a3 = aaza.a(file);
                        aaxz aaxz = new aaxz();
                        aaxz.a = file.getAbsolutePath();
                        aaxz.c = true;
                        aaxz.g = a3;
                        aaxz.d = true;
                        aaxz.b = this.e;
                        try {
                            aaxz.i = this.d.a(file);
                        } catch (aayg e2) {
                        }
                        this.b.add(aaxz);
                        aayw aayw = this.f;
                        if (aaxz.a != null) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("full_path", aaxz.a);
                            byte[] bArr = aaxz.g;
                            if (bArr != null) {
                                contentValues.put("sha256_digest", bArr);
                            }
                            contentValues.put("is_setuid_root", Integer.valueOf(aaxz.d ? 1 : 0));
                            contentValues.put("time_ms", Long.valueOf(aaxz.b));
                            contentValues.put("is_symlink", Integer.valueOf(aaxz.e ? 1 : 0));
                            String str = aaxz.f;
                            if (str != null) {
                                contentValues.put("symlink_target", str);
                            }
                            aayf aayf = aaxz.i;
                            if (aayf != null) {
                                contentValues.put("file_permissions", Integer.valueOf(aayf.c));
                                contentValues.put("file_owner", Integer.valueOf(aaxz.i.b));
                                contentValues.put("file_group", Integer.valueOf(aaxz.i.a));
                                String str2 = aaxz.i.e;
                                if (str2 != null) {
                                    contentValues.put("se_linux_security_context", str2);
                                }
                            }
                            aayw.a.replace("files_info", (String) null, contentValues);
                            return;
                        }
                        return;
                    }
                }
                if (file.isDirectory()) {
                    this.c.push(file);
                }
            }
        } catch (aayg e3) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a() {
        /*
            r9 = this;
            java.lang.String r0 = "\n"
            java.lang.Class<aaya> r1 = defpackage.aaya.class
            aayh r2 = r9.d
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x0174
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.b = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r9.c = r2
            java.io.File[] r2 = java.io.File.listRoots()
            aayw r3 = r9.f     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            r3.a()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            aayw r3 = r9.f     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            android.database.sqlite.SQLiteDatabase r3 = r3.a     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            if (r3 != 0) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r3.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
        L_0x002b:
            r3 = 0
            r2 = r2[r3]     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            r9.a(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
        L_0x0032:
            java.util.ArrayDeque r2 = r9.c     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            boolean r2 = r2.isEmpty()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            if (r2 != 0) goto L_0x0054
            java.util.ArrayDeque r2 = r9.c     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            java.lang.Object r2 = r2.pop()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            java.io.File[] r2 = r2.listFiles()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            if (r2 == 0) goto L_0x0032
            int r4 = r2.length     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            r5 = 0
        L_0x004a:
            if (r5 >= r4) goto L_0x0032
            r6 = r2[r5]     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            r9.a(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            int r5 = r5 + 1
            goto L_0x004a
        L_0x0054:
            aayw r2 = r9.f     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            android.database.sqlite.SQLiteDatabase r2 = r2.a     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            if (r2 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            r2.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
        L_0x005e:
            aayw r2 = r9.f     // Catch:{ SQLiteException -> 0x0064 }
            r2.c()     // Catch:{ SQLiteException -> 0x0064 }
            goto L_0x009c
        L_0x0064:
            r2 = move-exception
            aayx r3 = r9.g
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 1
            int r5 = r5 + r6
            r7.<init>(r5)
            r7.append(r1)
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = r7.toString()
            r4.<init>(r0)
        L_0x0099:
            r3.a((java.lang.Throwable) r4)
        L_0x009c:
            aayw r0 = r9.f
            r0.b()
            goto L_0x0120
        L_0x00a3:
            r2 = move-exception
            goto L_0x0130
        L_0x00a6:
            r2 = move-exception
            aayx r3 = r9.g     // Catch:{ all -> 0x00a3 }
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ all -> 0x00a3 }
            java.lang.String r5 = r1.getSimpleName()     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00a3 }
            int r6 = r6.length()     // Catch:{ all -> 0x00a3 }
            int r6 = r6 + 1
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00a3 }
            int r7 = r7.length()     // Catch:{ all -> 0x00a3 }
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            r7.<init>(r6)     // Catch:{ all -> 0x00a3 }
            r7.append(r5)     // Catch:{ all -> 0x00a3 }
            r7.append(r0)     // Catch:{ all -> 0x00a3 }
            r7.append(r2)     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x00a3 }
            r4.<init>(r2)     // Catch:{ all -> 0x00a3 }
            r3.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00a3 }
            aayw r2 = r9.f     // Catch:{ all -> 0x00a3 }
            r2.e()     // Catch:{ all -> 0x00a3 }
            aayw r2 = r9.f     // Catch:{ SQLiteException -> 0x00e9 }
            r2.c()     // Catch:{ SQLiteException -> 0x00e9 }
            goto L_0x009c
        L_0x00e9:
            r2 = move-exception
            aayx r3 = r9.g
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 1
            int r5 = r5 + r6
            r7.<init>(r5)
            r7.append(r1)
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = r7.toString()
            r4.<init>(r0)
            goto L_0x0099
        L_0x0120:
            aayw r0 = r9.f
            java.util.List r0 = r0.d()
            if (r0 == 0) goto L_0x012d
            java.util.List r1 = r9.b
            r1.addAll(r0)
        L_0x012d:
            java.util.List r0 = r9.b
            return r0
        L_0x0130:
            aayw r3 = r9.f     // Catch:{ SQLiteException -> 0x0136 }
            r3.c()     // Catch:{ SQLiteException -> 0x0136 }
            goto L_0x016e
        L_0x0136:
            r3 = move-exception
            aayx r4 = r9.g
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = java.lang.String.valueOf(r1)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 1
            int r6 = r6 + r7
            r8.<init>(r6)
            r8.append(r1)
            r8.append(r0)
            r8.append(r3)
            java.lang.String r0 = r8.toString()
            r5.<init>(r0)
            r4.a((java.lang.Throwable) r5)
        L_0x016e:
            aayw r0 = r9.f
            r0.b()
            throw r2
        L_0x0174:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaya.a():java.util.List");
    }
}
