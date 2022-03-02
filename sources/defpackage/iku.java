package defpackage;

import android.content.Context;

/* renamed from: iku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iku extends ikz {
    public iku(String str, Long l) {
        super(str, l);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        iky iky = ikz.d;
        return Long.valueOf(aeeg.a(iky.a, this.b, ((Long) this.c).longValue()));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Context context, String str, Object obj) {
        Long l = (Long) obj;
        String string = b(context).getString(str, (String) null);
        if (string == null) {
            return l;
        }
        try {
            return Long.valueOf(Long.parseLong(string));
        } catch (NumberFormatException e) {
            return l;
        }
    }
}
