package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: kjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kjw implements lsb {
    final /* synthetic */ kkb a;
    private SQLiteDatabase b;

    public kjw(kkb kkb) {
        this.a = kkb;
    }

    /* renamed from: a */
    public final synchronized SQLiteDatabase b() {
        if (this.b == null) {
            this.b = this.a.b.getWritableDatabase();
        }
        return this.b;
    }
}
