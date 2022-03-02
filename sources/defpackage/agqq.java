package defpackage;

import android.content.ContentValues;
import android.database.SQLException;

/* renamed from: agqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agqq {
    public final amri a;
    public final amzy b;
    final /* synthetic */ agqr c;
    private final long d;

    public agqq(agqr agqr, amri amri, amzy amzy, long j) {
        this.c = agqr;
        this.a = amri;
        this.b = amzy;
        this.d = j;
    }

    public final void a(amri amri) {
        amrl.b(this.c.c.isOpen());
        try {
            this.c.c.beginTransaction();
            if (!this.b.isEmpty()) {
                this.c.a(this.d);
            }
            this.c.c.delete("continuation_token", (String) null, (String[]) null);
            if (amri.a()) {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("token", ((auay) amri.b()).k());
                this.c.c.insertOrThrow("continuation_token", (String) null, contentValues);
            }
            this.c.c.setTransactionSuccessful();
            this.c.c.endTransaction();
        } catch (SQLException e) {
            throw new agsx(e);
        } catch (Throwable th) {
            this.c.c.endTransaction();
            throw th;
        }
    }
}
