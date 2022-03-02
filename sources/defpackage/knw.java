package defpackage;

import android.content.ContentValues;

/* renamed from: knw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class knw extends kqq {
    private final long a;
    private final long b;

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kny.CHILD_ENTRY_ID.c.a(), Long.valueOf(this.a));
        contentValues.put(kny.PARENT_ENTRY_ID.c.a(), Long.valueOf(this.b));
    }

    public knw(kqg kqg, long j, long j2) {
        super(kqg, knz.a, -1);
        this.a = j;
        this.b = j2;
    }
}
