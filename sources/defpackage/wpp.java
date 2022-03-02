package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: wpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpp extends wpe {
    private final String a;
    private final String b;

    public wpp(String str, int i, wmq wmq, String str2, String str3) {
        super(str, str2, i, wmq, "LoadOwnerCoverPhoto");
        this.a = str2;
        this.b = str3;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(str2).length());
        sb.append("[cover: account=");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("]");
        sb.toString();
    }

    /* access modifiers changed from: protected */
    public final yci d(Context context) {
        String str;
        byte[] a2;
        xdw a3 = xdw.a(context);
        String str2 = this.a;
        String str3 = this.b;
        iva.a((Object) str2);
        a3.a();
        int a4 = wsq.a(a3.a);
        xfb xfb = new xfb(a3.a, str2, (String) null);
        if (TextUtils.isEmpty(str3)) {
            str = ycc.b(xfb.c());
        } else {
            str = ycc.b(xfb.c(str3));
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!(a3.b.a(str2, str3, xdw.a(str), a4) || (a2 = wmz.a(a3.a).a(ycc.a(str, a4), true)) == null || a2 == wpc.c || a2 == wpc.d)) {
            a3.b.a(str2, str3, xdw.a(str), a2, a4);
        }
        return a3.b.a(str2, str3, xdw.a(str));
    }
}
