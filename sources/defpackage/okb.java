package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: okb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class okb extends jjj {
    private static okb a;
    private int b = -1;

    static String a(int i) {
        StringBuilder sb = new StringBuilder(22);
        sb.append("metrics.db.");
        sb.append(i);
        return sb.toString();
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(94);
        sb.append("Downgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data.");
        Log.w("gH_MetricsDatabase", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS metrics");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(92);
        sb.append("Upgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data.");
        Log.w("gH_MetricsDatabase", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS metrics");
        onCreate(sQLiteDatabase);
    }

    @Deprecated
    public okb(Context context) {
        super(context, a(22), "metrics.db", 22);
        context.deleteDatabase("metrics.db");
        for (int i = 15; i < 22; i++) {
            context.deleteDatabase(a(i));
        }
    }

    static synchronized okb a(Context context) {
        synchronized (okb.class) {
            if (a != null) {
                if (a.b != 22) {
                    nzi.a(a);
                } else {
                    okb okb = a;
                    return okb;
                }
            }
            okb okb2 = new okb(context, (byte[]) null);
            a = okb2;
            return okb2;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE metrics(_id INTEGER PRIMARY KEY AUTOINCREMENT,app_package_name TEXT,user_account_id TEXT,product_specific_context TEXT,session_id TEXT,user_action_type INTEGER,sub_user_action_type INTEGER,shown_content_list TEXT,query TEXT,url TEXT,click_rank INTEGER,contact_mode_type INTEGER,elapsed_millis LONG,content_unit_type_enum INTEGER,fragment_type INTEGER,network_type_enum INTEGER,timestamp_millis LONG,gcore_version INTEGER,client_version INTEGER,offline INTEGER,feedback_policy_set_version INTEGER,experiment_token TEXT,flow TEXT,feedback_psd_count INTEGER,feedback_psbd_count INTEGER,feedback_screenshot_present INTEGER,ocarina_elapsed_millis INTEGER,ocarina_num_bytes INTEGER);");
    }

    private okb(Context context, byte[] bArr) {
        super(context, a(22), "metrics.db", 22);
        context.deleteDatabase("metrics.db");
        for (int i = 15; i < 22; i++) {
            context.deleteDatabase(a(i));
        }
        this.b = 22;
    }
}
