package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: nzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzv {
    public oab a;
    public int b;
    public String c;
    public float d;
    public String e;
    public boolean f;
    public myp g;
    public int h = 1;
    public int i;
    private int j;

    private nzv() {
    }

    public static nzv a(int i2, int i3, String str, float f2, int i4, myp myp, int i5) {
        nzv nzv = new nzv();
        nzv.a = null;
        nzv.e = null;
        nzv.h = i2;
        nzv.b = i3;
        nzv.c = str;
        nzv.d = f2;
        nzv.f = false;
        nzv.i = i4;
        nzv.g = myp;
        nzv.j = i5;
        return nzv;
    }

    public final boolean a() {
        return this.j == 2;
    }

    public final boolean b() {
        return this.j == 3;
    }

    public final boolean c() {
        oab oab = this.a;
        return oab != null && oab.w == 34;
    }

    public final String d() {
        oab oab = this.a;
        if (oab != null && oab.t()) {
            String queryParameter = Uri.parse(this.a.e).getQueryParameter("hl");
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter;
            }
        }
        return oal.a();
    }

    public static nzv a(int i2, int i3, String str, float f2, boolean z, int i4, myp myp) {
        return a(i2, i3, str, f2, i4, myp, !z ? 1 : 2);
    }

    public static nzv a(oab oab, int i2, int i3, String str, float f2) {
        nzv nzv = new nzv();
        nzv.a(oab);
        nzv.h = i2;
        nzv.b = i3;
        nzv.c = str;
        nzv.d = f2;
        nzv.f = false;
        nzv.i = 1;
        nzv.g = null;
        nzv.j = 1;
        return nzv;
    }

    public final void a(oab oab) {
        this.a = oab;
        String b2 = oab != null ? oab.b() : null;
        if (TextUtils.isEmpty(b2) || "http".equals(b2)) {
            b2 = "https://www.google.com";
        }
        this.e = b2;
    }
}
