package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: kpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kpf extends kqq {
    public final knc a;
    public final long b;
    public final String c;
    public String d;
    public boolean e;
    public boolean f;
    public int g;
    private final String h;
    private final long i;
    private final int j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kpf(kqg kqg, long j2, knc knc, String str, String str2, long j3, long j4, String str3, int i2, boolean z, boolean z2, int i3) {
        super(kqg, kpi.a, j2);
        kqg kqg2 = kqg;
        long j5 = j2;
        this.a = knc;
        this.d = str;
        this.h = str2;
        this.b = j3;
        this.i = j4;
        iva.a((Object) str3);
        this.c = str3;
        this.j = i2;
        this.e = z;
        this.f = z2;
        this.g = i3;
    }

    public static kpf a(kqg kqg, Cursor cursor) {
        knc knc;
        Cursor cursor2 = cursor;
        long longValue = kph.DRIVE_APP_ID.n.b(cursor2).longValue();
        String a2 = kph.RESOURCE_ID.n.a(cursor2);
        String a3 = kph.LOCAL_ID.n.a(cursor2);
        Long b2 = kph.ENTRY_ID.n.b(cursor2);
        if (b2 != null) {
            knc = knc.a(b2.longValue());
        } else {
            knc = null;
        }
        return new kpf(kqg, kpi.a.a.b(cursor2).longValue(), knc, a2, a3, longValue, kph.LAST_ACCESSED.n.b(cursor2).longValue(), kph.DATABASE_NAME.n.a(cursor2), kph.SIZE_BYTES.n.b(cursor2).intValue(), kph.HAS_PENDING_CHANGES.n.e(cursor2), kph.REQUIRES_SYNC.n.e(cursor2), kph.HISTORY_LENGTH.n.b(cursor2).intValue());
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kph.DRIVE_APP_ID.n.a(), Long.valueOf(this.b));
        if (this.a != null) {
            contentValues.put(kph.ENTRY_ID.n.a(), Long.valueOf(this.a.a));
        } else {
            contentValues.putNull(kph.ENTRY_ID.n.a());
        }
        contentValues.put(kph.RESOURCE_ID.n.a(), this.d);
        contentValues.put(kph.LOCAL_ID.n.a(), this.h);
        contentValues.put(kph.LAST_ACCESSED.n.a(), Long.valueOf(this.i));
        contentValues.put(kph.SIZE_BYTES.n.a(), Integer.valueOf(this.j));
        contentValues.put(kph.DATABASE_NAME.n.a(), this.c);
        contentValues.put(kph.HAS_PENDING_CHANGES.n.a(), Integer.valueOf(this.e ? 1 : 0));
        contentValues.put(kph.REQUIRES_SYNC.n.a(), Integer.valueOf(this.f ? 1 : 0));
        contentValues.put(kph.HISTORY_LENGTH.n.a(), Integer.valueOf(this.g));
    }
}
