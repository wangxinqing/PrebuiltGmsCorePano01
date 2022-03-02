package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

/* renamed from: jnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jnz extends jjj {
    public boolean a = false;
    public boolean b = false;

    public jnz(Context context) {
        super(context, "config.db", "config.db", 7, axbh.b());
    }

    private static final void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS main (package TEXT, namespace TEXT, key TEXT, value BLOB, PRIMARY KEY (package, namespace, key))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS override (package TEXT, namespace TEXT, key TEXT, value BLOB, PRIMARY KEY (package, namespace, key))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS experiment (package TEXT, namespace TEXT, key TEXT, value BLOB, PRIMARY KEY (package, namespace, key))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS fetch_metadata (package TEXT, namespace_digest TEXT, recent_success_times TEXT, recent_failure_times TEXT, device_context_digest BLOB, app_context_digest BLOB, PRIMARY KEY (package))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS internal_metadata (key TEXT, value BLOB, PRIMARY KEY (key))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS experiment_payload (package TEXT, payload BLOB , PRIMARY KEY (package, payload))");
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        if (!sQLiteDatabase.isReadOnly()) {
            c(sQLiteDatabase);
        }
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM override");
        try {
            boolean z2 = true;
            if (compileStatement.simpleQueryForLong() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.a = z;
            compileStatement.close();
            SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM experiment");
            try {
                if (compileStatement2.simpleQueryForLong() <= 0) {
                    z2 = false;
                }
                this.b = z2;
            } finally {
                compileStatement2.close();
            }
        } catch (Throwable th) {
            compileStatement.close();
            throw th;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(63);
        sb.append("onDowngrade(): oldVersion: ");
        sb.append(i);
        sb.append(", newVersion: ");
        sb.append(i2);
        Log.w("ConfigChimeraService", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS main");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS override");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fetch_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS internal_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS experiment");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS experiment_payload");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS phenotype");
        c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(61);
        sb.append("onUpgrade(): oldVersion: ");
        sb.append(i);
        sb.append(", newVersion: ");
        sb.append(i2);
        Log.i("ConfigChimeraService", sb.toString());
        if (i >= 7 || i2 != 7) {
            throw new IllegalStateException("unexpected version upgrade of config.db");
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS main");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS override");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fetch_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS internal_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS experiment_payload");
        if (i == 4) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS experiment (package TEXT, namespace TEXT , key TEXT, value BLOB, PRIMARY KEY (package, namespace, key))");
            sQLiteDatabase.execSQL("INSERT INTO experiment (package, namespace, key, value) SELECT package, \"configns:p4\", key, value FROM phenotype");
            sQLiteDatabase.execSQL("DROP TABLE phenotype");
        }
        c(sQLiteDatabase);
    }
}
