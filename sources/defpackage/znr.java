package defpackage;

/* renamed from: znr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class znr extends zoa {
    public final String a;
    public final String b;

    public znr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zoa)) {
            return false;
        }
        zoa zoa = (zoa) obj;
        String str = this.a;
        if (str == null ? zoa.a() == null : str.equals(zoa.a())) {
            String str2 = this.b;
            if (str2 == null ? zoa.b() == null : str2.equals(zoa.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49 + String.valueOf(str2).length());
        sb.append("PseudonymousIdTokenMutation{newToken=");
        sb.append(str);
        sb.append(", oldToken=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
