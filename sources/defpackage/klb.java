package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: klb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class klb extends kqq {
    public long a = 0;
    public long b = 0;
    public long c = 5242880000000L;
    public long d;
    public long e = 0;
    public final String f;
    public boolean g;

    public klb(kqg kqg, long j, String str) {
        super(kqg, kle.a, j);
        this.f = str.intern();
    }

    public static klb a(kqg kqg, Cursor cursor) {
        klb klb = new klb(kqg, kle.a.a.b(cursor).longValue(), kld.ACCOUNT_HOLDER_NAME.l.a(cursor));
        klb.g = kld.FORCE_FULL_SYNC.l.e(cursor);
        klb.a(kld.LAST_SYNC_SEQUENCE_NUMBER.l.b(cursor).longValue());
        klb.b(kld.MINIMUM_CHANGE_SEQUENCE_NUMBER.l.b(cursor).longValue());
        klb.e = kld.LAST_SYNC_CHANGE_STAMP.l.b(cursor).longValue();
        klb.c = kld.MAX_UPLOAD_SIZE.l.b(cursor).longValue();
        klb.d = kld.FORCE_FULL_SYNC_LEVEL.l.b(cursor).longValue();
        return klb;
    }

    public final void b(long j) {
        iva.b(j >= 0);
        this.b = j;
    }

    public final String toString() {
        return String.format(Locale.US, "Account[%s, sqlId=%d, forceFullSyncLevel=%d]", new Object[]{this.f, Long.valueOf(this.m), Long.valueOf(this.d)});
    }

    public final void a(long j) {
        iva.b(j >= 0);
        this.a = j;
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kld.ACCOUNT_HOLDER_NAME.l.a(), this.f);
        contentValues.put(kld.FORCE_FULL_SYNC.l.a(), Boolean.valueOf(this.g));
        contentValues.put(kld.LAST_SYNC_SEQUENCE_NUMBER.l.a(), Long.valueOf(this.a));
        contentValues.put(kld.MINIMUM_CHANGE_SEQUENCE_NUMBER.l.a(), Long.valueOf(this.b));
        contentValues.put(kld.LAST_SYNC_CHANGE_STAMP.l.a(), Long.valueOf(this.e));
        contentValues.put(kld.MAX_UPLOAD_SIZE.l.a(), Long.valueOf(this.c));
        contentValues.put(kld.FORCE_FULL_SYNC_LEVEL.l.a(), Long.valueOf(this.d));
    }
}
