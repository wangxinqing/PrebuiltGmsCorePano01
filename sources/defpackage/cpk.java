package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: cpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cpk extends SQLiteOpenHelper {
    static final int a = 3;
    public static final /* synthetic */ int b = 0;
    private static final cpj e = cpg.a;
    private static final cpj f = cph.a;
    private static final cpj g;
    private static final List h;
    private final int c;
    private boolean d = false;

    static {
        cpj cpj = cpi.a;
        g = cpj;
        h = Arrays.asList(new cpj[]{e, f, cpj});
    }

    public cpk(Context context, int i) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i);
        this.c = i;
    }

    private final void a(SQLiteDatabase sQLiteDatabase) {
        if (!this.d) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.d = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        int i = Build.VERSION.SDK_INT;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        a(sQLiteDatabase, 0, this.c);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a(sQLiteDatabase);
        a(sQLiteDatabase, i, i2);
    }

    private static final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= h.size()) {
            while (i < i2) {
                ((cpj) h.get(i)).a(sQLiteDatabase);
                i++;
            }
            return;
        }
        int size = h.size();
        StringBuilder sb = new StringBuilder(122);
        sb.append("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(size);
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }
}
