package com.google.android.gms.ads.identifier;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class c {
    public final String a;
    public final boolean b;

    public c(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z);
        return sb.toString();
    }
}
