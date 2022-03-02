package defpackage;

import android.database.Cursor;
import android.net.Uri;

/* renamed from: pog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pog extends amvu {
    private final String a;
    private final pni b;
    private final Uri c;
    private int d = 0;
    private Cursor e;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.e == null) {
            pni pni = this.b;
            Uri uri = this.c;
            String str = this.a;
            String[] strArr = {str};
            String concat = str.concat(" > ?");
            String[] strArr2 = {String.valueOf(this.d)};
            String str2 = this.a;
            StringBuilder sb = new StringBuilder(str2.length() + 15);
            sb.append(str2);
            sb.append(" ASC LIMIT 1000");
            this.e = pni.a(uri, strArr, concat, strArr2, sb.toString());
        }
        Cursor cursor = this.e;
        if (cursor != null) {
            if (cursor.moveToNext()) {
                Integer a2 = jit.a(this.e, 0);
                if (a2 != null) {
                    this.d = a2.intValue();
                }
                if (this.e.isLast()) {
                    this.e.close();
                    this.e = null;
                }
                return Integer.valueOf(this.d);
            }
            this.e.close();
        }
        return (Integer) d();
    }

    public pog(String str, pni pni, Uri uri) {
        this.a = str;
        this.b = pni;
        this.c = uri;
    }
}
