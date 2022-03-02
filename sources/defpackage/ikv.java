package defpackage;

import android.content.Context;

/* renamed from: ikv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ikv extends ikz {
    public ikv(String str, Integer num) {
        super(str, num);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        iky iky = ikz.d;
        return Integer.valueOf(aeeg.a(iky.a, this.b, ((Integer) this.c).intValue()));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Context context, String str, Object obj) {
        Integer num = (Integer) obj;
        String string = b(context).getString(str, (String) null);
        if (string == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(string));
        } catch (NumberFormatException e) {
            return num;
        }
    }
}
