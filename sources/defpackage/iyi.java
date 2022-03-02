package defpackage;

import android.content.ContentUris;
import android.net.Uri;

/* renamed from: iyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iyi {
    public String[] a;
    private final Uri b;
    private StringBuilder c;

    public iyi(Uri uri, String str, String[] strArr) {
        this.b = uri;
        this.a = strArr;
        if (str != null) {
            this.c = new StringBuilder(str);
        }
    }

    public final String a() {
        StringBuilder sb = this.c;
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }

    public final void b(String str) {
        b(str, this.b.getLastPathSegment());
    }

    public final void a(String str) {
        irk.a(ContentUris.parseId(this.b) >= 0);
        b(str);
    }

    public final void b(String str, String str2) {
        String[] strArr;
        StringBuilder sb = this.c;
        if (sb == null) {
            this.c = new StringBuilder("(");
        } else {
            sb.append(" AND (");
        }
        this.c.append(str);
        this.c.append("=?");
        this.c.append(")");
        String[] strArr2 = this.a;
        if (strArr2 != null) {
            int length = strArr2.length;
            strArr = new String[(length + 1)];
            System.arraycopy(strArr2, 0, strArr, 0, length);
            strArr[length] = str2;
        } else {
            strArr = new String[]{str2};
        }
        this.a = strArr;
    }

    public final void a(String str, long j) {
        b(str, String.valueOf(j));
    }

    public final void a(String str, String str2) {
        String queryParameter = this.b.getQueryParameter(str);
        if (queryParameter != null) {
            b(str2, queryParameter);
        }
    }
}
