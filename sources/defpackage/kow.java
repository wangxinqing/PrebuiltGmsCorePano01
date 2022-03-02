package defpackage;

import android.content.ContentValues;

/* renamed from: kow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kow extends kqq {
    private final long a;
    private final String b;

    public kow(kqg kqg, long j, String str) {
        super(kqg, koz.a, -1);
        this.a = j;
        iva.a((Object) str);
        this.b = lru.a(str);
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(koy.PERSISTED_EVENT_ID.c.a(), Long.valueOf(this.a));
        contentValues.put(koy.CONTENT_HASH.c.a(), this.b);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 75);
        sb.append("PersistedEventContent [persistedEventId=");
        sb.append(j);
        sb.append(", contentHash=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
