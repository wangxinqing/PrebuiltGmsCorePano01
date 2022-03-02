package defpackage;

import android.text.TextUtils;

/* renamed from: xcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xcd implements xfl {
    private final String b;
    private final String c;
    private String d;

    public xcd(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    private final String b() {
        String str;
        if (this.d == null) {
            String str2 = this.c;
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str2.length(); i++) {
                    char charAt = str2.charAt(i);
                    if (Character.digit(charAt, 10) != -1 || charAt == '+' || charAt == ',' || charAt == ';' || ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                        sb.append(charAt);
                    }
                }
                str = sb.toString();
            } else {
                str = "";
            }
            this.d = str;
        }
        return this.d;
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xcd) {
            return ius.a(b(), ((xcd) obj).b());
        }
        return false;
    }

    public final String toString() {
        String str = this.c;
        String str2 = "null";
        if (str == null) {
            str = str2;
        }
        String str3 = this.b;
        if (str3 != null) {
            str2 = str3;
        }
        StringBuilder sb = new StringBuilder(str.length() + 26 + str2.length());
        sb.append("PhoneNumber:[Value=");
        sb.append(str);
        sb.append(" Type=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
