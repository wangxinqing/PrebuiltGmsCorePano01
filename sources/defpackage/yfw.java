package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: yfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yfw extends SQLiteOpenHelper implements Closeable {
    public static final jjg a = jjg.a(iyc.PHENOTYPE);
    static final amsv b = amta.a(yfk.a);
    static final Object c = new Object();
    protected static volatile yfw d;
    protected static volatile yfw e;
    private static final Method h;
    private static final Method i;
    int f = 0;
    ScheduledFuture g;
    private final ScheduledExecutorService j;

    static {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        Method method2 = null;
        try {
            method = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
            method.setAccessible(true);
        } catch (Throwable th) {
            anih anih = (anih) a.b();
            anih.a(th);
            ((anih) anih.a("yfw", "b", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to reflect getThreadSession");
            method = null;
        }
        h = method;
        if (method != null) {
            try {
                method2 = method.getReturnType().getDeclaredMethod("beginTransaction", new Class[]{Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class});
            } catch (Throwable th2) {
                anih anih2 = (anih) a.b();
                anih2.a(th2);
                ((anih) anih2.a("yfw", "c", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to reflect beginTransaction");
            }
        }
        i = method2;
        Charset.forName("UTF-8");
    }

    public yfw(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, ((Integer) b.a()).intValue());
        this.j = scheduledExecutorService;
    }

    public static ContentValues a(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        ContentValues contentValues = new ContentValues();
        for (int i2 = 0; i2 < columnNames.length; i2++) {
            int type = cursor.getType(i2);
            if (type == 1) {
                contentValues.put(columnNames[i2], Integer.valueOf(cursor.getInt(i2)));
            } else if (type == 2) {
                contentValues.put(columnNames[i2], Float.valueOf(cursor.getFloat(i2)));
            } else if (type != 4) {
                contentValues.put(columnNames[i2], cursor.getString(i2));
            } else {
                contentValues.put(columnNames[i2], cursor.getBlob(i2));
            }
        }
        return contentValues;
    }

    public static String b(SQLiteDatabase sQLiteDatabase) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("PRAGMA integrity_check;");
        try {
            String simpleQueryForString = compileStatement.simpleQueryForString();
            if (compileStatement != null) {
                compileStatement.close();
            }
            return simpleQueryForString;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static Method c() {
        Method method = h;
        if (method == null) {
            return null;
        }
        try {
            return method.getReturnType().getDeclaredMethod("beginTransaction", new Class[]{Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class});
        } catch (Throwable th) {
            anih anih = (anih) a.b();
            anih.a(th);
            ((anih) anih.a("yfw", "c", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to reflect beginTransaction");
            return null;
        }
    }

    public final synchronized void close() {
        synchronized (c) {
            int i2 = this.f - 1;
            this.f = i2;
            if (i2 == 0) {
                this.g = this.j.schedule(new yfj(this), ayxs.a.a().b(), TimeUnit.SECONDS);
            }
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        boolean enableWriteAheadLogging = sQLiteDatabase.enableWriteAheadLogging();
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        yfu.a(sQLiteDatabase);
        sQLiteDatabase2.execSQL(a("ApplicationStates", "packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", "version INTEGER NOT NULL", "patchable INTEGER"));
        String[] strArr = new String[3];
        strArr[0] = "packageName TEXT NOT NULL";
        strArr[1] = "user TEXT NOT NULL";
        String valueOf = String.valueOf(a("packageName", "user"));
        strArr[2] = valueOf.length() == 0 ? new String("version INTEGER NOT NULL") : "version INTEGER NOT NULL".concat(valueOf);
        sQLiteDatabase2.execSQL(a("MultiCommitApplicationStates", strArr));
        String[] strArr2 = yfr.a;
        String[] strArr3 = new String[2];
        strArr3[0] = "logSourceName TEXT NOT NULL";
        String valueOf2 = String.valueOf(a("logSourceName", "packageName"));
        strArr3[1] = valueOf2.length() == 0 ? new String("packageName TEXT NOT NULL") : "packageName TEXT NOT NULL".concat(valueOf2);
        sQLiteDatabase2.execSQL(a("LogSources", strArr3));
        sQLiteDatabase2.execSQL(a("LogSources", "packageName", "packageName"));
        sQLiteDatabase2.execSQL(a("WeakExperimentIds", "packageName TEXT NOT NULL", "experimentId INTEGER NOT NULL"));
        sQLiteDatabase2.execSQL(a("WeakExperimentIds", "packageName", "packageName"));
        yfo.a(sQLiteDatabase);
        String[] strArr4 = yfq.a;
        String[] strArr5 = new String[12];
        strArr5[0] = "packageName TEXT NOT NULL";
        strArr5[1] = "version INTEGER NOT NULL";
        strArr5[2] = "flagType INTEGER NOT NULL";
        strArr5[3] = "partitionId INTEGER NOT NULL";
        strArr5[4] = "user TEXT NOT NULL";
        strArr5[5] = "name TEXT NOT NULL";
        strArr5[6] = "intVal INTEGER";
        strArr5[7] = "boolVal INTEGER";
        strArr5[8] = "floatVal REAL";
        strArr5[9] = "stringVal TEXT";
        strArr5[10] = "extensionVal BLOB";
        String valueOf3 = String.valueOf(a("packageName", "version", "flagType", "partitionId", "user", "name", "committed"));
        strArr5[11] = valueOf3.length() == 0 ? new String("committed INTEGER NOT NULL") : "committed INTEGER NOT NULL".concat(valueOf3);
        sQLiteDatabase2.execSQL(a("Flags", strArr5));
        sQLiteDatabase2.execSQL(a("Flags", "committed", "packageName", "version", "user", "committed"));
        sQLiteDatabase2.execSQL(a("RequestTags", "user TEXT NOT NULL PRIMARY KEY", "bytesTag BLOB NOT NULL"));
        String[] strArr6 = new String[5];
        strArr6[0] = "packageName TEXT NOT NULL";
        strArr6[1] = "version INTEGER NOT NULL";
        strArr6[2] = "partitionId INTEGER NOT NULL";
        strArr6[3] = "user TEXT NOT NULL";
        String valueOf4 = String.valueOf(a("packageName", "version", "partitionId", "user"));
        strArr6[4] = valueOf4.length() == 0 ? new String("tag BLOB NOT NULL") : "tag BLOB NOT NULL".concat(valueOf4);
        sQLiteDatabase2.execSQL(a("ApplicationTags", strArr6));
        String[] strArr7 = yfn.a;
        sQLiteDatabase2.execSQL(a("CrossLoggedExperimentTokens", "fromPackageName TEXT NOT NULL", "fromVersion INTEGER NOT NULL", "fromUser TEXT NOT NULL", "toPackageName TEXT NOT NULL", "toVersion INTEGER NOT NULL", "isCommitted INTEGER NOT NULL", "token BLOB NOT NULL", "provenance INTEGER NOT NULL"));
        sQLiteDatabase2.execSQL(a("CrossLoggedExperimentTokens", "apply", "fromPackageName", "fromVersion", "fromUser", "toPackageName", "toVersion", "isCommitted"));
        sQLiteDatabase2.execSQL(a("CrossLoggedExperimentTokens", "remove", "toPackageName"));
        sQLiteDatabase2.execSQL(a("ChangeCounts", "packageName TEXT NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"));
        sQLiteDatabase2.execSQL(a("DogfoodsToken", "key INTEGER NOT NULL PRIMARY KEY", "token BLOB"));
        sQLiteDatabase2.execSQL(a("LastFetch", "key INTEGER NOT NULL PRIMARY KEY", "servertimestamp INTEGER NOT NULL"));
        String[] strArr8 = yfp.a;
        String[] strArr9 = new String[10];
        strArr9[0] = "packageName TEXT NOT NULL";
        strArr9[1] = "user TEXT NOT NULL";
        strArr9[2] = "name TEXT NOT NULL";
        strArr9[3] = "flagType INTEGER NOT NULL";
        strArr9[4] = "intVal INTEGER";
        strArr9[5] = "boolVal INTEGER";
        strArr9[6] = "floatVal REAL";
        strArr9[7] = "stringVal TEXT";
        strArr9[8] = "extensionVal BLOB";
        String valueOf5 = String.valueOf(a("packageName", "user", "name", "committed"));
        strArr9[9] = valueOf5.length() == 0 ? new String("committed") : "committed".concat(valueOf5);
        sQLiteDatabase2.execSQL(a("FlagOverrides", strArr9));
        sQLiteDatabase2.execSQL(a("GenericDimensions", "packageName TEXT NOT NULL", "isolationkey TEXT NOT NULL DEFAULT ''", "namespace INTEGER NOT NULL", "instance INTEGER NOT NULL"));
        sQLiteDatabase2.execSQL(a("GenericDimensions", "configPackageIsolationKey", "packageName", "isolationkey"));
        if (((Integer) b.a()).intValue() >= 22) {
            sQLiteDatabase2.execSQL(a("LastSyncAfterRequest", "packageName TEXT NOT NULL PRIMARY KEY", "servingVersion INTEGER NOT NULL DEFAULT 0"));
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i3 != 22 || i2 < 23) {
            ((anih) ((anih) a.d()).a("yfw", "onDowngrade", 1736, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("onDowngrade %d to %d", i2, i3);
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type ='table'", (String[]) null);
            while (rawQuery.moveToNext()) {
                try {
                    if (!"android_metadata".equals(rawQuery.getString(0))) {
                        String valueOf = String.valueOf(rawQuery.getString(0));
                        sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                    }
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            onCreate(sQLiteDatabase);
            return;
        }
        return;
        throw th;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        String str;
        String str2;
        String str3;
        int i4;
        String str4;
        String str5;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i5 = i2;
        int i6 = i3;
        ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1207, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("onUpgrade %d to %d", i5, i6);
        if (i5 >= 3 || i6 < 3) {
            str = "version INTEGER NOT NULL";
            str3 = "androidPackageName";
            str2 = "Packages";
        } else {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1210, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wiping Phenotype Database.");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS Packages");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ApplicationStates");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS LogSources");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS WeakExperimentIds");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ExperimentTokens");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS Flags");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS RequestTags");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ApplicationTags");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS CrossLoggedExperimentTokens");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ChangeCounts");
            sQLiteDatabase2.execSQL(a("Packages", "packageName TEXT NOT NULL PRIMARY KEY", "version INTEGER NOT NULL", "params BLOB", "weak INTEGER NOT NULL", "androidPackageName TEXT NOT NULL"));
            sQLiteDatabase2.execSQL(a("Packages", "androidPackageName", "androidPackageName"));
            str3 = "androidPackageName";
            sQLiteDatabase2.execSQL(a("ApplicationStates", "packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", "version INTEGER NOT NULL", "patchable INTEGER"));
            String[] strArr = new String[2];
            strArr[0] = "logSourceName TEXT NOT NULL";
            String valueOf = String.valueOf(a("logSourceName", "packageName"));
            strArr[1] = valueOf.length() == 0 ? new String("packageName TEXT NOT NULL") : "packageName TEXT NOT NULL".concat(valueOf);
            sQLiteDatabase2.execSQL(a("LogSources", strArr));
            sQLiteDatabase2.execSQL(a("LogSources", "packageName", "packageName"));
            sQLiteDatabase2.execSQL(a("WeakExperimentIds", "packageName TEXT NOT NULL", "experimentId INTEGER NOT NULL"));
            sQLiteDatabase2.execSQL(a("WeakExperimentIds", "packageName", "packageName"));
            String[] strArr2 = new String[6];
            strArr2[0] = "packageName TEXT NOT NULL";
            strArr2[1] = "version INTEGER NOT NULL";
            strArr2[2] = "user TEXT NOT NULL";
            strArr2[3] = "isCommitted INTEGER NOT NULL";
            strArr2[4] = "experimentToken BLOB NOT NULL";
            String valueOf2 = String.valueOf(a("packageName", "version", "user", "isCommitted"));
            str2 = "Packages";
            strArr2[5] = valueOf2.length() == 0 ? new String("serverToken TEXT NOT NULL") : "serverToken TEXT NOT NULL".concat(valueOf2);
            sQLiteDatabase2.execSQL(a("ExperimentTokens", strArr2));
            sQLiteDatabase2.execSQL(a("ExperimentTokens", "committed", "packageName", "version", "user", "isCommitted"));
            String[] strArr3 = new String[12];
            strArr3[0] = "packageName TEXT NOT NULL";
            strArr3[1] = "version INTEGER NOT NULL";
            strArr3[2] = "flagType INTEGER NOT NULL";
            strArr3[3] = "partitionId INTEGER NOT NULL";
            strArr3[4] = "user TEXT NOT NULL";
            strArr3[5] = "name TEXT NOT NULL";
            strArr3[6] = "intVal INTEGER";
            strArr3[7] = "boolVal INTEGER";
            strArr3[8] = "floatVal REAL";
            strArr3[9] = "stringVal TEXT";
            strArr3[10] = "extensionVal BLOB";
            String valueOf3 = String.valueOf(a("packageName", "version", "flagType", "partitionId", "user", "name", "committed"));
            strArr3[11] = valueOf3.length() == 0 ? new String("committed INTEGER NOT NULL") : "committed INTEGER NOT NULL".concat(valueOf3);
            sQLiteDatabase2.execSQL(a("Flags", strArr3));
            sQLiteDatabase2.execSQL(a("Flags", "committed", "packageName", "version", "user", "committed"));
            sQLiteDatabase2.execSQL(a("RequestTags", "user TEXT NOT NULL PRIMARY KEY", "bytesTag BLOB NOT NULL"));
            String[] strArr4 = new String[5];
            strArr4[0] = "packageName TEXT NOT NULL";
            strArr4[1] = "version INTEGER NOT NULL";
            strArr4[2] = "partitionId INTEGER NOT NULL";
            strArr4[3] = "user TEXT NOT NULL";
            str = "version INTEGER NOT NULL";
            String valueOf4 = String.valueOf(a("packageName", "version", "partitionId", "user"));
            strArr4[4] = valueOf4.length() == 0 ? new String("tag BLOB NOT NULL") : "tag BLOB NOT NULL".concat(valueOf4);
            sQLiteDatabase2.execSQL(a("ApplicationTags", strArr4));
            sQLiteDatabase2.execSQL(a("CrossLoggedExperimentTokens", "fromPackageName TEXT NOT NULL", "fromVersion INTEGER NOT NULL", "fromUser TEXT NOT NULL", "toPackageName TEXT NOT NULL", "toVersion INTEGER NOT NULL", "isCommitted INTEGER NOT NULL", "token BLOB NOT NULL", "provenance INTEGER NOT NULL"));
            sQLiteDatabase2.execSQL(a("CrossLoggedExperimentTokens", "apply", "fromPackageName", "fromVersion", "fromUser", "toPackageName", "toVersion", "isCommitted"));
            sQLiteDatabase2.execSQL(a("CrossLoggedExperimentTokens", "remove", "toPackageName"));
            sQLiteDatabase2.execSQL(a("ChangeCounts", "key INTEGER NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"));
        }
        if (i5 < 4) {
            i4 = i3;
            if (i4 >= 4) {
                ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1393, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Adding DogfoodsToken table");
                sQLiteDatabase2.execSQL(a("DogfoodsToken", "key INTEGER NOT NULL PRIMARY KEY", "token BLOB"));
            }
        } else {
            i4 = i3;
        }
        if (i5 < 5 && i4 >= 5) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1403, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Adding configHash to ExperimentTokens table");
            sQLiteDatabase2.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN configHash TEXT NOT NULL DEFAULT ''");
        }
        if (i5 < 6 && i4 >= 6) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1413, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Adding LastFetch table");
            sQLiteDatabase2.execSQL(a("LastFetch", "key INTEGER NOT NULL PRIMARY KEY", "servertimestamp INTEGER NOT NULL"));
        }
        if (i5 < 7 && i4 >= 7) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1423, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Relaxing LogSources Table restrictions");
            String[] strArr5 = new String[2];
            strArr5[0] = "logSourceName TEXT NOT NULL";
            String valueOf5 = String.valueOf(a("logSourceName", "packageName"));
            strArr5[1] = valueOf5.length() == 0 ? new String("packageName TEXT NOT NULL") : "packageName TEXT NOT NULL".concat(valueOf5);
            sQLiteDatabase2.execSQL(a("LogSources_copy", strArr5));
            sQLiteDatabase2.execSQL("INSERT INTO LogSources_copy (logSourceName, packageName) SELECT logSourceName, packageName FROM LogSources");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS LogSources");
            sQLiteDatabase2.execSQL("ALTER TABLE LogSources_copy RENAME TO LogSources");
        }
        if (i5 < 8 && i4 >= 8) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1452, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Add isSynced to Packages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages ADD COLUMN isSynced DEFAULT 0");
        }
        if (i5 < 9 && i4 >= 9) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1457, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Add subscribedGcm to Packages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages ADD COLUMN subscribedGcm INTEGER NOT NULL DEFAULT 0");
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1466, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Add UnsubscribeGcmPackages table");
            sQLiteDatabase2.execSQL(a("UnsubscribeGcmPackages", "packageName TEXT NOT NULL PRIMARY KEY"));
        }
        if (i5 < 10 && i4 >= 10) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1472, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Adding FlagOverrides table");
            String[] strArr6 = new String[10];
            strArr6[0] = "packageName TEXT NOT NULL";
            strArr6[1] = "user TEXT NOT NULL";
            strArr6[2] = "name TEXT NOT NULL";
            strArr6[3] = "flagType INTEGER NOT NULL";
            strArr6[4] = "intVal INTEGER";
            strArr6[5] = "boolVal INTEGER";
            strArr6[6] = "floatVal REAL";
            strArr6[7] = "stringVal TEXT";
            strArr6[8] = "extensionVal BLOB";
            String valueOf6 = String.valueOf(a("packageName", "user", "name", "committed"));
            strArr6[9] = valueOf6.length() == 0 ? new String("committed") : "committed".concat(valueOf6);
            sQLiteDatabase2.execSQL(a("FlagOverrides", strArr6));
        }
        if (i5 < 11 && i4 >= 11) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1495, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Update patchable to nullable in ApplicationStates");
            sQLiteDatabase2.execSQL("ALTER TABLE ApplicationStates RENAME TO OldApplicationStates");
            sQLiteDatabase2.execSQL(a("ApplicationStates", "packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", str, "patchable INTEGER"));
            StringBuilder sb = new StringBuilder(134);
            sb.append("INSERT INTO ApplicationStates(packageName,user,version,patchable) SELECT packageName,user,version,patchable FROM OldApplicationStates;");
            sQLiteDatabase2.execSQL(sb.toString());
            sQLiteDatabase2.execSQL("DROP TABLE OldApplicationStates;");
        }
        if (i5 < 12 && i4 >= 12) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1526, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fix Phenotype registration to be weak");
            sQLiteDatabase2.execSQL("UPDATE Packages SET weak = 1 WHERE packageName = 'com.google.android.gms.phenotype'");
        }
        if (i5 < 13 && i4 >= 13) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1532, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Update ChangeCounts schema");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ChangeCounts");
            sQLiteDatabase2.execSQL(a("ChangeCounts", "packageName TEXT NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"));
        }
        if (i5 < 14 && i4 >= 14) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1543, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Add servingVersion to ExperimentTokens");
            sQLiteDatabase2.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN servingVersion INTEGER NOT NULL DEFAULT 0");
        }
        if (i5 < 15 && i4 >= 15) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1555, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Add dynamicParams to Packages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages ADD COLUMN dynamicParams BLOB DEFAULT NULL");
        }
        if (i5 >= 16) {
            str5 = str3;
            str4 = str2;
        } else if (i4 >= 16) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1566, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Restructuring GCM data");
            sQLiteDatabase2.execSQL(a("GcmState", "packageName TEXT NOT NULL PRIMARY KEY", "isSubscribed INTEGER NOT NULL", "subscribeAfterTime INTEGER NOT NULL DEFAULT 0"));
            sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO GcmState(packageName, isSubscribed) SELECT packageName, 1 FROM Packages WHERE subscribedGcm = 1");
            sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO GcmState(packageName, isSubscribed) SELECT packageName, 1 FROM UnsubscribeGcmPackages");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS UnsubscribeGcmPackages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages RENAME TO OldPackages");
            str4 = str2;
            sQLiteDatabase2.execSQL(a(str4, "packageName TEXT NOT NULL PRIMARY KEY", str, "params BLOB", "dynamicParams BLOB", "weak INTEGER NOT NULL", "androidPackageName TEXT NOT NULL", "isSynced INTEGER"));
            str5 = str3;
            sQLiteDatabase2.execSQL(a(str4, str5, str3));
            StringBuilder sb2 = new StringBuilder(194);
            sb2.append("INSERT INTO Packages(packageName,version,params,dynamicParams,weak,androidPackageName,isSynced) SELECT packageName,version,params,dynamicParams,weak,androidPackageName,isSynced FROM OldPackages;");
            sQLiteDatabase2.execSQL(sb2.toString());
            sQLiteDatabase2.execSQL("DROP TABLE OldPackages;");
        } else {
            str5 = str3;
            str4 = str2;
        }
        if (i5 < 17 && i4 >= 17) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1608, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Add serializedDeclarativeRegInfo to Packages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages ADD COLUMN serializedDeclarativeRegInfo BLOB DEFAULT NULL");
        }
        if (i5 < 18 && i4 >= 18) {
            sQLiteDatabase2.execSQL(a("GenericDimensions", "packageName TEXT NOT NULL", "isolationkey TEXT NOT NULL DEFAULT ''", "namespace INTEGER NOT NULL", "instance INTEGER NOT NULL"));
            sQLiteDatabase2.execSQL(a("GenericDimensions", "configPackageIsolationKey", "packageName", "isolationkey"));
            sQLiteDatabase2.execSQL(a("LogSources", "packageName", "packageName"));
            sQLiteDatabase2.execSQL(a(str4, str5, str5));
        }
        if (i5 < 19 && i4 >= 19) {
            sQLiteDatabase2.execSQL("DROP TABLE GcmState;");
        }
        if (i5 < 20 && i4 >= 20) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1638, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Add tokensTag to ExperimentTokens");
            sQLiteDatabase2.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN tokensTag BLOB DEFAULT NULL");
        }
        if (i5 < 21 && i4 >= 21) {
            String[] strArr7 = new String[3];
            strArr7[0] = "packageName TEXT NOT NULL";
            strArr7[1] = "user TEXT NOT NULL";
            String valueOf7 = String.valueOf(a("packageName", "user"));
            strArr7[2] = valueOf7.length() == 0 ? new String(str) : str.concat(valueOf7);
            sQLiteDatabase2.execSQL(a("MultiCommitApplicationStates", strArr7));
        }
        if (i5 < 22 && i4 >= 22) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1657, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Create LastSyncAfterRequest table");
            sQLiteDatabase2.execSQL(a("LastSyncAfterRequest", "packageName TEXT NOT NULL PRIMARY KEY", "servingVersion INTEGER NOT NULL DEFAULT 0"));
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1663, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Add flagsHash to ExperimentTokens");
            a(sQLiteDatabase2, "ExperimentTokens", "flagsHash", " INTEGER DEFAULT NULL");
        }
        if (i5 < 23 && i4 >= 23) {
            ((anih) ((anih) a.d()).a("yfw", "onUpgrade", 1669, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Add configTier to Packages");
            a(sQLiteDatabase2, str4, "configTier", " INTEGER DEFAULT NULL");
        }
    }

    public static String b(String[] strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("?");
        for (int i2 = 1; i2 < strArr.length; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    private static Method b() {
        int i2 = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            anih anih = (anih) a.b();
            anih.a(th);
            ((anih) anih.a("yfw", "b", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to reflect getThreadSession");
            return null;
        }
    }

    public static Pair a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        if (!agvj.b(str)) {
            return yfl.a(sQLiteDatabase, str);
        }
        Integer a2 = yfs.a(sQLiteDatabase, str, str2);
        if (a2 != null) {
            return Pair.create(str2, a2);
        }
        return null;
    }

    public static String a(String str, String str2, String... strArr) {
        StringBuilder sb = new StringBuilder("CREATE INDEX IF NOT EXISTS ");
        sb.append(str2);
        sb.append(" ON ");
        sb.append(str);
        sb.append(" (");
        a(sb, strArr);
        sb.append(")");
        return sb.toString();
    }

    public static String a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(str);
        sb.append(" (");
        a(sb, strArr);
        sb.append(")");
        return sb.toString();
    }

    public static String a(String... strArr) {
        StringBuilder sb = new StringBuilder(", PRIMARY KEY(");
        a(sb, strArr);
        sb.append(")");
        return sb.toString();
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        Method method;
        Method method2 = h;
        if (method2 == null || (method = i) == null) {
            sQLiteDatabase.beginTransaction();
            return;
        }
        try {
            method.invoke(method2.invoke(sQLiteDatabase, new Object[0]), new Object[]{0, null, 0, null});
        } catch (Exception e2) {
            anih anih = (anih) a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("yfw", "a", 1761, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to use reflective deferred transaction");
            sQLiteDatabase.beginTransaction();
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", new byte[0]);
        sQLiteDatabase.update("ApplicationTags", contentValues, "packageName = ? AND user = ? AND version = ? ", new String[]{str, str2, Integer.toString(i2)});
        yfo.a(sQLiteDatabase, str, str2, i2);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("bytesTag", yfv.a);
        sQLiteDatabase.update("RequestTags", contentValues2, "user = ?", new String[]{str2});
        sQLiteDatabase.update("RequestTags", contentValues2, "user = ?", new String[]{"ALL_USERS"});
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s FROM %s", new Object[]{str2, str}), (String[]) null);
            if (rawQuery != null) {
                rawQuery.close();
            }
            if (rawQuery != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(str2, (String) null);
                sQLiteDatabase.update(str, contentValues, (String) null, (String[]) null);
                return;
            }
        } catch (SQLiteException e2) {
        }
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s%s;", new Object[]{str, str2, str3}));
    }

    private static void a(StringBuilder sb, String... strArr) {
        int length = strArr.length;
        boolean z = true;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            i2++;
            z = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        synchronized (c) {
            if (this.f == 0) {
                if (this == e) {
                    super.close();
                    e = null;
                }
                if (this == d) {
                    super.close();
                    d = null;
                }
            }
        }
    }
}
