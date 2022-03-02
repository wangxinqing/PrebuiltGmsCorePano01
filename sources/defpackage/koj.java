package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: koj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class koj extends kqq {
    public final kaj a;
    public final long b;
    public final long c;
    public final long d;

    public koj(kqg kqg, long j, long j2, kaj kaj, long j3, long j4) {
        super(kqg, kom.a, j);
        this.d = j2;
        iva.a((Object) kaj);
        this.a = kaj;
        this.b = j3;
        this.c = j4;
    }

    public static koj a(kqg kqg, Cursor cursor) {
        long longValue = kol.ACCOUNT_ID.e.b(cursor).longValue();
        String a2 = kol.ACTION_TYPE.e.a(cursor);
        return new koj(kqg, kom.a.a.b(cursor).longValue(), longValue, kaj.a(a2), kol.ACTION_ID.e.b(cursor).longValue(), kol.APPLY_ON_SERVER_TIME.e.b(cursor).longValue());
    }

    public final String toString() {
        return String.format(Locale.US, "PendingCleanupAction [accountId=%s, actionType=%s, actionId=%s, applyOnServerTime=%s]", new Object[]{Long.valueOf(this.d), this.a, Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kol.ACCOUNT_ID.e.a(), Long.valueOf(this.d));
        contentValues.put(kol.ACTION_TYPE.e.a(), this.a.y);
        contentValues.put(kol.ACTION_ID.e.a(), Long.valueOf(this.b));
        contentValues.put(kol.APPLY_ON_SERVER_TIME.e.a(), Long.valueOf(this.c));
    }
}
