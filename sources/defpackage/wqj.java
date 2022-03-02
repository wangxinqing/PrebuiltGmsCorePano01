package defpackage;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: wqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wqj {
    public final ContentValues a;
    public final ContentValues b;
    public final Map c;
    public final Map d;
    public final Map e;

    public wqj(ContentValues contentValues, ContentValues contentValues2, Map map, Map map2, Map map3) {
        iva.a((Object) contentValues);
        this.a = contentValues;
        this.b = contentValues2;
        iva.a((Object) map);
        this.c = map;
        iva.a((Object) map2);
        this.d = map2;
        iva.a((Object) map3);
        this.e = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wqj) {
            wqj wqj = (wqj) obj;
            return this.a.equals(wqj.a) && this.c.equals(wqj.c) && this.d.equals(wqj.d) && this.e.equals(wqj.e);
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ContactData[contactValues=");
        sb.append(valueOf);
        sb.append(", interactionValues=");
        sb.append(valueOf2);
        sb.append(", emailValues=");
        sb.append(valueOf3);
        sb.append(", phoneValues=");
        sb.append(valueOf4);
        sb.append(", postalValues=");
        sb.append(valueOf5);
        sb.append("]");
        return sb.toString();
    }
}
