package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: ofm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ofm extends jjj {
    private static ofm a;
    private int b = -1;

    static int a() {
        ofn.e();
        return 23;
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(93);
        sb.append("Downgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data");
        Log.w("gH_HelpResponseDatabase", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS help_responses");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(91);
        sb.append("Upgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data");
        Log.w("gH_HelpResponseDatabase", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS help_responses");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ofm(android.content.Context r4) {
        /*
            r3 = this;
            a()
            r0 = 23
            java.lang.String r1 = a((int) r0)
            a()
            java.lang.String r2 = "help_responses.db"
            r3.<init>((android.content.Context) r4, (java.lang.String) r1, (java.lang.String) r2, (int) r0)
            r1 = -1
            r3.b = r1
            r4.deleteDatabase(r2)
            r1 = 18
        L_0x0019:
            a()
            if (r1 >= r0) goto L_0x0028
            java.lang.String r2 = a((int) r1)
            r4.deleteDatabase(r2)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofm.<init>(android.content.Context):void");
    }

    static String a(int i) {
        StringBuilder sb = new StringBuilder(29);
        sb.append("help_responses.db.");
        sb.append(i);
        return sb.toString();
    }

    static synchronized ofm a(Context context) {
        synchronized (ofm.class) {
            a();
            if (a != null) {
                int i = a.b;
                a();
                if (i != 23) {
                    nzi.a(a);
                } else {
                    ofm ofm = a;
                    return ofm;
                }
            }
            ofm ofm2 = new ofm(context, 23);
            a = ofm2;
            return ofm2;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        ofn.e();
        sQLiteDatabase.execSQL("CREATE TABLE help_responses(id TEXT,app_package_name TEXT,type INTEGER,title TEXT,snippet TEXT,url TEXT,api_url TEXT,intent_url TEXT,setting_action_definition BLOB,navigation_action_url TEXT,etag TEXT,visited_time INTEGER,child_ids TEXT,is_feeling_lucky INTEGER,is_in_dark_mode INTEGER,saved_timestamp INTEGER,PRIMARY KEY (id, app_package_name, is_in_dark_mode));");
    }

    private ofm(Context context, int i) {
        super(context, a(23), "help_responses.db", 23);
        context.deleteDatabase("help_responses.db");
        for (int i2 = 18; i2 < 23; i2++) {
            context.deleteDatabase(a(i2));
        }
        this.b = 23;
    }
}
