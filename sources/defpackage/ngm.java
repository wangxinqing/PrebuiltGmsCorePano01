package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.StatFs;
import android.system.ErrnoException;
import com.google.android.gms.fonts.FontMatchSpec;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ngm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngm {
    public final File a;
    public final File b;
    public final Object c;
    public final ngh d;
    public final ExecutorService e;
    protected final long f;
    protected final long g;
    final boolean h;
    long i = 0;
    private final Object j = new Object();
    private final boolean k;
    private final File l;
    private final Object m;
    private final ngy n;

    static {
        TimeUnit.MINUTES.toMillis(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a7, code lost:
        if (defpackage.ngn.a(r4.a) != false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ngm(android.content.Context r5, defpackage.ngh r6, java.util.concurrent.ExecutorService r7, defpackage.ngy r8, long r9, long r11, boolean r13) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.j = r0
            r0 = 0
            r4.i = r0
            java.lang.String r0 = "context"
            defpackage.iva.a((java.lang.Object) r5, (java.lang.Object) r0)
            java.lang.String r0 = "databaseHelper"
            defpackage.iva.a((java.lang.Object) r6, (java.lang.Object) r0)
            r4.d = r6
            boolean r6 = defpackage.jkr.c()
            r0 = 1
            r6 = r6 ^ r0
            r4.k = r6
            java.io.File r6 = new java.io.File
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r1 = "fonts"
            r6.<init>(r5, r1)
            r4.l = r6
            java.io.File r5 = new java.io.File
            java.io.File r6 = r4.l
            java.lang.String r1 = "opentype"
            r5.<init>(r6, r1)
            r4.a = r5
            java.io.File r5 = new java.io.File
            java.io.File r6 = r4.l
            java.lang.String r1 = "directory"
            r5.<init>(r6, r1)
            r4.b = r5
            java.io.File r5 = r4.a
            boolean r5 = r5.isDirectory()
            java.lang.String r6 = "FontDisk"
            r1 = 0
            if (r5 != 0) goto L_0x0065
            java.io.File r5 = r4.a
            boolean r5 = r5.mkdirs()
            if (r5 == 0) goto L_0x0059
            goto L_0x0065
        L_0x0059:
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.io.File r2 = r4.a
            r5[r1] = r2
            java.lang.String r1 = "can't create directory %s"
            defpackage.ngz.a(r6, r1, r5)
            goto L_0x00aa
        L_0x0065:
            java.io.File r5 = r4.b
            boolean r5 = r5.isDirectory()
            if (r5 != 0) goto L_0x0081
            java.io.File r5 = r4.b
            boolean r5 = r5.mkdirs()
            if (r5 != 0) goto L_0x0081
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.io.File r2 = r4.b
            r5[r1] = r2
            java.lang.String r1 = "can't create directory for directory.pb: %s"
            defpackage.ngz.a(r6, r1, r5)
            goto L_0x00aa
        L_0x0081:
            boolean r5 = r4.k
            if (r5 == 0) goto L_0x00b1
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.io.File r2 = r4.l
            r5[r1] = r2
            java.lang.String r2 = "Making %s executable"
            defpackage.ngz.c(r6, r2, r5)
            java.io.File r5 = r4.l
            boolean r5 = defpackage.ngn.a(r5)
            if (r5 == 0) goto L_0x00aa
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.io.File r3 = r4.a
            r5[r1] = r3
            defpackage.ngz.c(r6, r2, r5)
            java.io.File r5 = r4.a
            boolean r5 = defpackage.ngn.a(r5)
            if (r5 == 0) goto L_0x00aa
            goto L_0x00b1
        L_0x00aa:
            r5 = 23506(0x5bd2, float:3.2939E-41)
            java.lang.String r6 = "com.google.android.gms.fonts.disk"
            r8.a(r0, r5, r6)
        L_0x00b1:
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
            r4.c = r5
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
            r4.m = r5
            r4.e = r7
            r4.n = r8
            r4.f = r9
            r4.g = r11
            r4.h = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngm.<init>(android.content.Context, ngh, java.util.concurrent.ExecutorService, ngy, long, long, boolean):void");
    }

    private static String a(float f2) {
        return String.format(Locale.ENGLISH, "%d_%d", new Object[]{Integer.valueOf((int) Math.floor((double) f2)), Integer.valueOf((int) Math.floor((double) ((f2 * 10.0f) % 10.0f)))});
    }

    public final boolean b(long j2) {
        boolean z = true;
        try {
            StatFs statFs = new StatFs(this.l.getPath());
            synchronized (this.m) {
                int i2 = Build.VERSION.SDK_INT;
                if (statFs.getAvailableBytes() <= this.f + j2) {
                    z = false;
                }
            }
            return z;
        } catch (IllegalArgumentException e2) {
            int i3 = Build.VERSION.SDK_INT;
            String str = "com.google.android.gms.fonts.disk.statfs";
            if (e2.getCause() instanceof ErrnoException) {
                str = String.format(Locale.ENGLISH, "%s.errno.%d", new Object[]{str, Integer.valueOf(((ErrnoException) e2.getCause()).errno)});
            }
            this.n.a(1, 23517, str);
            return false;
        }
    }

    public final boolean c(long j2) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.m) {
            if (!this.h) {
                return false;
            }
            if (System.currentTimeMillis() - this.i < this.g) {
                return false;
            }
            this.i = System.currentTimeMillis();
            ngh ngh = this.d;
            SQLiteDatabase readableDatabase = ngh.getReadableDatabase();
            SQLiteDatabase sQLiteDatabase2 = null;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT family, width, weight, italic FROM metadata WHERE NOT EXISTS (SELECT * FROM manifest_deps WHERE metadata.id = manifest_deps.font_id) AND NOT EXISTS (SELECT * FROM pinned_deps WHERE metadata.id = pinned_deps.font_id) AND DATETIME('now','-5 MINUTES') > last_accessed ORDER BY last_accessed", (String[]) null);
            ArrayList arrayList = new ArrayList();
            if (rawQuery.moveToFirst()) {
                while (!rawQuery.isAfterLast()) {
                    arrayList.add(new FontMatchSpec(rawQuery.getString(0), rawQuery.getFloat(1), rawQuery.getInt(2), rawQuery.getFloat(3), false));
                    rawQuery.moveToNext();
                }
            }
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Exception e2) {
                    ngz.a("FontsDBHelper", "Error closing Cursor ", e2);
                }
            }
            ngh.c(readableDatabase);
            long j3 = 0;
            while (!arrayList.isEmpty() && !b(j2)) {
                FontMatchSpec fontMatchSpec = (FontMatchSpec) arrayList.get(0);
                ngz.c("FontDisk", "Evicting %s", fontMatchSpec);
                iva.a((Object) fontMatchSpec, (Object) "fontMatchSpec");
                File file = new File(this.a, a(fontMatchSpec));
                if (file.exists() && !file.isDirectory()) {
                    j3 += file.length();
                    file.delete();
                }
                ngh ngh2 = this.d;
                try {
                    sQLiteDatabase = ngh2.getWritableDatabase();
                    try {
                        sQLiteDatabase.delete("metadata", "family = ? AND width = ? AND weight = ? AND italic = ?", new String[]{fontMatchSpec.b, String.valueOf(fontMatchSpec.c), String.valueOf(fontMatchSpec.d), String.valueOf(fontMatchSpec.e)});
                    } catch (SQLiteException e3) {
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase2 = sQLiteDatabase;
                        ngh2.c(sQLiteDatabase2);
                        throw th;
                    }
                } catch (SQLiteException e4) {
                    sQLiteDatabase = null;
                } catch (Throwable th2) {
                    th = th2;
                    ngh2.c(sQLiteDatabase2);
                    throw th;
                }
                ngh2.c(sQLiteDatabase);
                arrayList.remove(0);
            }
            boolean b2 = b(j2);
            ngz.c("FontDisk", "Evicting fonts took %d ms, reclaimed %d bytes, and returns %b", Long.valueOf(System.currentTimeMillis() - this.i), Long.valueOf(j3), Boolean.valueOf(b2));
            return b2;
        }
    }

    public static String a(FontMatchSpec fontMatchSpec) {
        return String.format(Locale.ENGLISH, "%s-%d-%s-%s.ttf", new Object[]{fontMatchSpec.b.replace(' ', '_'), Integer.valueOf(fontMatchSpec.d), a(fontMatchSpec.c), a(fontMatchSpec.e)});
    }

    public static String a(String str, nfy nfy) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[4];
        objArr[0] = str.replace(' ', '_');
        nga nga = nfy.b;
        if (nga == null) {
            nga = nga.c;
        }
        objArr[1] = Integer.valueOf(nga.a);
        nfx nfx = nfy.c;
        if (nfx == null) {
            nfx = nfx.c;
        }
        objArr[2] = a(nfx.a);
        nfx nfx2 = nfy.d;
        if (nfx2 == null) {
            nfx2 = nfx.c;
        }
        objArr[3] = a(nfx2.a);
        return String.format(locale, "%s-%d-%s-%s.ttf", objArr);
    }

    public final File a(File file, nfz nfz, nfy nfy) {
        long j2;
        String str;
        iva.a((Object) nfz, (Object) "family");
        iva.a((Object) nfy, (Object) "font");
        File a2 = a(nfz, nfy);
        ngz.c("FontDisk", "takeFont(%s); may put in %s", file, a2);
        synchronized (this.c) {
            nfw nfw = nfy.a;
            if (nfw == null) {
                nfw = nfw.e;
            }
            if (!a(nfw.c, file, a2)) {
                boolean exists = a2.exists();
                if (exists) {
                    j2 = a2.length();
                } else {
                    j2 = -1;
                }
                String str2 = nfz.b;
                nga nga = nfy.b;
                if (nga == null) {
                    nga = nga.c;
                }
                int i2 = nga.a;
                nfx nfx = nfy.c;
                if (nfx == null) {
                    nfx = nfx.c;
                }
                float f2 = nfx.a;
                nfx nfx2 = nfy.d;
                if (nfx2 == null) {
                    nfx2 = nfx.c;
                }
                float f3 = nfx2.a;
                if (exists) {
                    nfw nfw2 = nfy.a;
                    if (nfw2 == null) {
                        nfw2 = nfw.e;
                    }
                    long j3 = nfw2.c;
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("wrong size, actual ");
                    sb.append(j2);
                    sb.append(" != expected ");
                    sb.append(j3);
                    str = sb.toString();
                } else {
                    str = "missing";
                }
                String valueOf = String.valueOf(a2);
                int length = String.valueOf(str2).length();
                StringBuilder sb2 = new StringBuilder(length + 75 + String.valueOf(str).length() + String.valueOf(valueOf).length());
                sb2.append("FontDisk - ");
                sb2.append(str2);
                sb2.append(":wght");
                sb2.append(i2);
                sb2.append(":wdth");
                sb2.append(f2);
                sb2.append(":ital");
                sb2.append(f3);
                sb2.append(" is ");
                sb2.append(str);
                sb2.append(" at ");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
        }
        this.e.execute(new ngj(this, nfz, nfy));
        return a2;
    }

    public final File a(nfz nfz, nfy nfy) {
        iva.a((Object) nfz, (Object) "family");
        iva.a((Object) nfy, (Object) "font");
        nfw nfw = nfy.a;
        if (nfw == null) {
            nfw = nfw.e;
        }
        if (nfw.b.isEmpty()) {
            return new File(this.a, a(nfz.b, nfy));
        }
        nfw nfw2 = nfy.a;
        if (nfw2 == null) {
            nfw2 = nfw.e;
        }
        return new File(nfw2.b);
    }

    public final File a(nfz nfz, nfy nfy, boolean z) {
        File a2 = a(nfz, nfy);
        if (!a2.exists()) {
            return null;
        }
        if (!a2.isDirectory()) {
            if (z) {
                long length = a2.length();
                nfw nfw = nfy.a;
                if (nfw == null) {
                    nfw = nfw.e;
                }
                if (length != nfw.c) {
                    ngz.c("FontDisk", "Not accepting existing file %s; wrong size", a2);
                    return null;
                }
            }
            return a2;
        } else if (axiu.a.a().d()) {
            jjc.a(a2);
            return null;
        } else {
            String valueOf = String.valueOf(a2.getPath());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Not a file but directory:") : "Not a file but directory:".concat(valueOf));
        }
    }

    public final void a(long j2) {
        if (!b(j2) && !c(j2)) {
            throw new IllegalStateException("FontDisk - insufficient space on disk for font.");
        }
    }

    public final void a(nfv nfv) {
        iva.a((Object) nfv, (Object) "directory");
        File file = new File(this.b, String.valueOf(nfv.b));
        int i2 = nfv.b;
        StringBuilder sb = new StringBuilder(68);
        sb.append("New directory for directory.pb files created for version ");
        sb.append(i2);
        String sb2 = sb.toString();
        ngz.c("FontDisk", sb2, new Object[0]);
        File file2 = new File(file, "directory.pb");
        if (file2.exists()) {
            file2.delete();
        }
        file.mkdir();
        try {
            synchronized (this.j) {
                anne.a(nfv.k(), file2);
            }
        } catch (IOException e2) {
            if (file.exists()) {
                for (File delete : file.listFiles()) {
                    delete.delete();
                }
                file.delete();
            }
            String valueOf = String.valueOf(file2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb3.append("Unable to write ");
            sb3.append(valueOf);
            throw new IOException(sb3.toString(), e2);
        }
    }

    public final boolean a(long j2, File file, File file2) {
        long j3;
        if (!file.exists()) {
            ngz.a("FontDisk", "takeFontInternal temp file does not exist: %s", file);
            return false;
        }
        long length = file.length();
        if (length != j2) {
            ngz.a("FontDisk", "takeFontInternal %s wrong temp length, expected %d got %d", file2, Long.valueOf(j2), Long.valueOf(length));
            return false;
        }
        a(j2);
        if (!file.renameTo(file2)) {
            ngz.a("FontDisk", "takeFontInternal(%s) failed to renameTo %s", file, file2);
            return false;
        }
        if (file2.exists()) {
            j3 = file2.length();
        } else {
            j3 = -1;
        }
        if (j3 != j2) {
            ngz.a("FontDisk", "takeFontInternal %s wrong dest length, expected %d got %d", Long.valueOf(j2), Long.valueOf(j3));
            return false;
        }
        ngz.c("FontDisk", "takeFontInternal(%s); successfully put in %s", file, file2);
        if (this.k && !file2.setReadable(true, false)) {
            ngz.a("FontFileUtils", "Unable to make %s world readable", file2);
        }
        return true;
    }
}
