package defpackage;

import android.content.ContentValues;

/* renamed from: kpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kpu extends kqq {
    public static final /* synthetic */ int c = 0;
    public final String a;
    public final long b;
    private final knc d;

    public kpu(kqg kqg, long j, String str, knc knc, long j2) {
        super(kqg, kpx.a, j);
        this.a = lru.a(str);
        iva.a((Object) knc);
        this.d = knc;
        this.b = j2;
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kpw.CONTENT_HASH.d.a(), this.a);
        contentValues.put(kpw.ENTRY_ID.d.a(), Long.valueOf(this.d.a));
        contentValues.put(kpw.VERSION.d.a(), Long.valueOf(this.b));
    }

    public final String toString() {
        return String.format("Thumbnail [contentHash=%s, entrySpec=%s, version=%d]", new Object[]{this.a, this.d, Long.valueOf(this.b)});
    }
}
