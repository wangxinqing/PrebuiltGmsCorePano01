package defpackage;

import android.content.ContentValues;

/* renamed from: kon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kon extends kqq {
    public static final /* synthetic */ int b = 0;
    public final String a;
    private final knc c;
    private final long d;

    public kon(kqg kqg, long j, String str, knc knc, long j2) {
        super(kqg, koq.a, j);
        this.a = lru.a(str);
        iva.a((Object) knc);
        this.c = knc;
        this.d = j2;
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kop.CONTENT_HASH.d.a(), this.a);
        contentValues.put(kop.ENTRY_ID.d.a(), Long.valueOf(this.c.a));
        contentValues.put(kop.ACTION_ID.d.a(), Long.valueOf(this.d));
    }

    public final String toString() {
        return String.format("PendingThumbnailUpload [contentHash=%s, entrySpec=%s, actionId=%d]", new Object[]{this.a, this.c, Long.valueOf(this.d)});
    }
}
