package defpackage;

import android.graphics.Bitmap;

/* renamed from: pzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pzh {
    public final int a;
    public final String b;
    public final String c;
    public String d;
    public Bitmap e;

    public pzh(String str, String str2, int i, String str3) {
        this.d = str;
        this.c = str2;
        this.a = i;
        this.b = str3;
    }

    public static pzh a() {
        return new pzh((String) null, (String) null, 2, (String) null);
    }

    public static pzh a(String str) {
        return new pzh((String) null, str, 1, (String) null);
    }

    public static pzh a(String str, String str2) {
        return new pzh((String) null, str, 0, str2);
    }
}
