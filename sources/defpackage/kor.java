package defpackage;

import android.content.ContentValues;

/* renamed from: kor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kor extends kqq {
    public static final /* synthetic */ int d = 0;
    public final String a;
    public final Long b;
    public String c;
    private final String e;
    private final knc f;

    public kor(kqg kqg, long j, String str, String str2, Long l, knc knc, String str3) {
        super(kqg, kou.a, j);
        String str4;
        this.a = lru.a(str);
        if (str2 != null) {
            str4 = lru.a(str2);
        } else {
            str4 = null;
        }
        this.e = str4;
        this.b = l;
        iva.a((Object) knc);
        this.f = knc;
        this.c = str3;
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kot.CONTENT_HASH.k.a(), this.a);
        contentValues.put(kot.BASE_CONTENT_HASH.k.a(), this.e);
        if (this.b != null) {
            contentValues.put(kot.ACTION_ID.k.a(), this.b);
        } else {
            contentValues.putNull(kot.ACTION_ID.k.a());
        }
        contentValues.put(kot.ENTRY_ID.k.a(), Long.valueOf(this.f.a));
        if (this.c != null) {
            contentValues.put(kot.UPLOAD_URI.k.a(), this.c);
        } else {
            contentValues.putNull(kot.UPLOAD_URI.k.a());
        }
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.e;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.f);
        String str3 = this.c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 85 + length2 + length3 + String.valueOf(valueOf2).length() + String.valueOf(str3).length());
        sb.append("PendingUpload [contentHash='");
        sb.append(str);
        sb.append("', baseContentHash='");
        sb.append(str2);
        sb.append("', actionId=");
        sb.append(valueOf);
        sb.append(", entrySpec=");
        sb.append(valueOf2);
        sb.append(", uploadUri=");
        sb.append(str3);
        sb.append(']');
        return sb.toString();
    }
}
