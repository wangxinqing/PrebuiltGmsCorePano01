package defpackage;

import android.content.Context;

/* renamed from: admq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class admq {
    public static final adll a(Context context, boolean z) {
        String str;
        admy.b(context);
        int intValue = ((Integer) ((adrn) adrn.a.b()).b(adls.d)).intValue();
        if (((long) intValue) >= ayou.a.a().t()) {
            return new adll("finished-execution", adre.a(new adrc[0]));
        }
        if (!z) {
            str = "non-streaming-download";
        } else {
            str = "streaming-download";
        }
        adma f = admb.f();
        f.a(ayou.a.a().q(), ayou.a.a().r());
        f.a(ayou.a.a().s());
        f.a.a(adlz.g, true);
        f.a(intValue);
        f.a(str, adre.a(new adrc[0]));
        adll b = f.b();
        ((adrn) adrn.a.b()).a(adls.d.b(Integer.valueOf(intValue + 1)));
        return b;
    }
}
