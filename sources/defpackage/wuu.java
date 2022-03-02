package defpackage;

import java.util.Arrays;

/* renamed from: wuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wuu {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public wuu(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    /* access modifiers changed from: package-private */
    public final String a(int i) {
        String str;
        String str2 = this.d;
        if (str2 == null) {
            return null;
        }
        if (i >= 2) {
            StringBuilder sb = new StringBuilder(13);
            sb.append(" x");
            sb.append(i);
            str = sb.toString();
        } else {
            str = "";
        }
        if (str2.length() + str.length() > 50000) {
            String substring = str2.substring(0, 50000 - (str.length() + 1));
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(str).length());
            sb2.append(substring);
            sb2.append(8230);
            sb2.append(str);
            return sb2.toString();
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wuu) {
            wuu wuu = (wuu) obj;
            if (!ius.a(this.a, wuu.a) || !ius.a(this.b, wuu.b) || !ius.a(Integer.valueOf(this.c), Integer.valueOf(wuu.c)) || !ius.a(this.d, wuu.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d});
    }
}
