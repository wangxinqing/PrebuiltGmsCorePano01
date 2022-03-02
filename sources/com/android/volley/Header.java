package com.android.volley;

import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Header {
    private final String a;
    private final String b;

    public Header(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Header header = (Header) obj;
            return TextUtils.equals(this.a, header.a) && TextUtils.equals(this.b, header.b);
        }
    }

    public final String getName() {
        return this.a;
    }

    public final String getValue() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
