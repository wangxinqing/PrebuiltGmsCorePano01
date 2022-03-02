package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: wpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpo extends wpe {
    private final String a;
    private final String b;
    private final int s;
    private final boolean t;

    public wpo(String str, int i, wmq wmq, String str2, String str3, int i2, int i3) {
        super(str, str2, i, wmq, "LoadOwnerAvatar");
        this.a = str2;
        this.b = str3;
        this.s = i2;
        this.t = ((i3 & 1) ^ 1) == 0 ? false : true;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        String str = this.a;
        String str2 = this.b;
        int i = this.s;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
        sb.append("[owner: account=");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(", size=");
        sb.append(i);
        sb.append("]");
        sb.toString();
    }

    /* access modifiers changed from: protected */
    public final yci d(Context context) {
        String str;
        xdv a2 = xdv.a(context);
        String str2 = this.a;
        String str3 = this.b;
        int i = this.s;
        boolean z = this.t;
        iva.a((Object) str2);
        wlv.a(i, "avatarSize");
        yci yci = null;
        xfb xfb = new xfb(a2.a, str2, (String) null);
        if (TextUtils.isEmpty(str3)) {
            str = ycc.b(xfb.c.c("SELECT avatar FROM owners WHERE account_name=? AND page_gaia_id IS NULL", new String[]{xfb.e}));
        } else {
            iva.a(xfb.f == null);
            iva.a((Object) str3);
            str = ycc.b(xfb.c.c("SELECT avatar FROM owners WHERE account_name=? AND page_gaia_id=?", new String[]{xfb.e, str3}));
        }
        if (!TextUtils.isEmpty(str)) {
            a2.a(str2, str3, str, false);
            yci = a2.b.a(str2, str3, ycc.a(str), i);
            if (yci == null && z) {
                return a2.a(i, !TextUtils.isEmpty(str3));
            }
        } else if (z) {
            return a2.a(i, !TextUtils.isEmpty(str3));
        }
        return yci;
    }
}
