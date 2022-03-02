package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: zwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwg extends zwk {
    private final String a;
    private final Drawable b;

    public zwg(String str, Drawable drawable) {
        if (str != null) {
            this.a = str;
            this.b = drawable;
            return;
        }
        throw new NullPointerException("Null displayName");
    }

    public final String a() {
        return this.a;
    }

    public final Drawable b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zwk) {
            zwk zwk = (zwk) obj;
            return this.a.equals(zwk.a()) && this.b.equals(zwk.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 36 + String.valueOf(valueOf).length());
        sb.append("ContactRowData{displayName=");
        sb.append(str);
        sb.append(", photo=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
