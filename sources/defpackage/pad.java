package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: pad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pad {
    private static final String[] d = {"seqno", "action", "uri"};
    private static final String[] e = {"created_timestamp", "doc_score", "section_thing_proto"};
    private static final String[] f = {"seqno", "action", "uri", "tag"};
    private static final String[] g = new String[0];
    public final pac a = new pac();
    public final pac b = new pac();
    public String c;
    private ContentResolver h;
    private final Uri i;
    private final String[] j;

    public pad(ContentResolver contentResolver, Uri uri, String str, String[] strArr) {
        this.h = contentResolver;
        this.i = uri;
        this.c = str;
        int length = strArr.length;
        String[] strArr2 = d;
        String[] strArr3 = new String[(strArr2.length + length)];
        this.j = strArr3;
        System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
        System.arraycopy(strArr, 0, this.j, d.length, length);
    }

    private final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.c)) {
            this.c = str;
        } else if (!str.equals(this.c)) {
            throw new pal(this.c, str);
        }
    }

    private final void b(long j2) {
        a(this.a.a(this.h, this.i, "documents", this.j, e, j2, "20"));
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.h != null) {
                oso.b("Content cursor disposed without a closing");
            }
            a();
        } finally {
            super.finalize();
        }
    }

    public final void a() {
        this.a.e();
        this.b.e();
        this.h = null;
    }

    public final void a(long j2) {
        if (this.a.a()) {
            b(j2);
        }
        if (this.b.a()) {
            a(this.b.a(this.h, this.i, "tags", f, g, j2, "100"));
        }
        if (((Boolean) ozx.bn.c()).booleanValue() && this.a.a() && !this.b.a()) {
            b(j2);
            oso.e("In second refillDocumentCursor, last seen seqno: %d, docs seqno: %d, tags seqno: %d", Long.valueOf(j2), Long.valueOf(this.a.c()), Long.valueOf(this.b.c()));
        }
    }
}
