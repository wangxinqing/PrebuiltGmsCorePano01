package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: wva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wva implements wuk {
    private static final anax b = anax.a((Object) "android_metadata");
    final Set a;
    private final String c;
    private final String d;

    public wva(String str, String str2, Collection collection) {
        anax anax;
        this.d = str;
        this.c = str2;
        if (collection != null) {
            anav j = anax.j();
            j.b((Iterable) collection);
            j.b((Iterable) b);
            anax = j.a();
        } else {
            anax = null;
        }
        this.a = anax;
    }

    private static final void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, Collection collection) {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, new String[0]);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(0));
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str4 = (String) arrayList.get(i);
            if (!collection.contains(str4)) {
                try {
                    xdt.a("RawDatabaseDebugDataSource", "Dropping %s '%s'", (Object) str3, (Object) str4);
                    sQLiteDatabase.execSQL(String.format(str2, new Object[]{str4}));
                } catch (SQLException e) {
                    Log.e("RawDatabaseDebugDataSource", String.format("Could not drop %s '%s'", new Object[]{str3, str4}), e);
                }
            }
        }
        return;
        throw th;
    }

    public final String a() {
        return this.c;
    }

    public final void b() {
    }

    public final wuj a(icc icc) {
        BufferedOutputStream bufferedOutputStream;
        SQLiteDatabase openDatabase;
        ByteArrayOutputStream byteArrayOutputStream;
        int read;
        try {
            Context context = ((iey) icc).d;
            String str = this.d;
            String str2 = str.length() == 0 ? new String("temp_") : "temp_".concat(str);
            File databasePath = context.getDatabasePath(str);
            File databasePath2 = context.getDatabasePath(str2);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(databasePath));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(databasePath2));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read2 = bufferedInputStream.read(bArr);
                    if (read2 <= 0) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read2);
                    bufferedOutputStream.flush();
                }
                bufferedOutputStream.close();
                bufferedInputStream.close();
                try {
                    openDatabase = SQLiteDatabase.openDatabase(databasePath2.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 0);
                    a(openDatabase, "SELECT name FROM sqlite_master WHERE type = 'index'", "DROP INDEX %s", "index", amzy.h());
                    a(openDatabase, "SELECT name FROM sqlite_temp_master WHERE type = 'table'", "DROP TABLE %s", "temp table", amzy.h());
                    Set set = this.a;
                    if (set != null) {
                        a(openDatabase, "SELECT name FROM sqlite_master WHERE type = 'table'", "DROP TABLE %s", "table", set);
                    }
                    openDatabase.execSQL("VACUUM");
                    if (openDatabase != null) {
                        openDatabase.close();
                    }
                    try {
                        FileInputStream fileInputStream = new FileInputStream(databasePath2);
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr2 = new byte[1024];
                            do {
                                read = fileInputStream.read(bArr2, 0, 1024);
                                if (read > 0) {
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            } while (read != -1);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            fileInputStream.close();
                            wuf wuf = new wuf(this.c, byteArray);
                            if (databasePath2 != null) {
                                databasePath2.delete();
                            }
                            return wuf;
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (Throwable th2) {
                        apev.a(th, th2);
                    }
                } catch (Throwable th3) {
                    if (databasePath2 != null) {
                        databasePath2.delete();
                    }
                    throw th3;
                }
                throw th;
                throw th;
                throw th;
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th5) {
            apev.a(th4, th5);
        }
    }
}
