package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class com implements cpb {
    private final long a;

    public com(long j) {
        this.a = j;
    }

    public final Object a(Object obj) {
        long j = this.a;
        clo clo = cpe.a;
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(j)}));
    }
}
