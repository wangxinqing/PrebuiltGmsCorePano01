package defpackage;

import android.app.PendingIntent;
import android.support.v4.graphics.drawable.IconCompat;

/* renamed from: mtt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mtt extends mtx {
    private final String a;
    private final String b;
    private final IconCompat c;
    private final PendingIntent d;

    public mtt(String str, String str2, IconCompat iconCompat, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = iconCompat;
        this.d = pendingIntent;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final IconCompat c() {
        return this.c;
    }

    public final PendingIntent d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mtx) {
            mtx mtx = (mtx) obj;
            return this.a.equals(mtx.a()) && this.b.equals(mtx.b()) && this.c.equals(mtx.c()) && this.d.equals(mtx.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 58 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("DecodedListSlice{title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", pendingIntent=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
