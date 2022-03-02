package defpackage;

import android.content.Context;

/* renamed from: ikw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ikw extends ikz {
    public ikw(String str, Float f) {
        super(str, f);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        iky iky = ikz.d;
        String str = this.b;
        Float f = (Float) this.c;
        String a = aeeg.a(iky.a, str, (String) null);
        if (a == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(a));
        } catch (NumberFormatException e) {
            return f;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Context context, String str, Object obj) {
        Float f = (Float) obj;
        String string = b(context).getString(str, (String) null);
        if (string == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(string));
        } catch (NumberFormatException e) {
            return f;
        }
    }
}
