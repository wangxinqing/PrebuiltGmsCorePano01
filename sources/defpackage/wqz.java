package defpackage;

import android.content.Context;

/* renamed from: wqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class wqz {
    protected final Context a;
    protected final xsc b;
    protected final ybz c;
    protected final amsv d;
    protected final yda e;

    public wqz(String str, Context context, xsc xsc, ybz ybz, amsv amsv) {
        xip.a();
        yda a2 = ((Boolean) xfv.a.a()).booleanValue() ? ydb.a(context, str) : new yda(context, str);
        this.a = context;
        this.b = xsc;
        this.c = ybz;
        this.d = amsv;
        this.e = a2;
    }

    protected static final void a(wrg wrg, byte[] bArr, String str, yda yda) {
        xip.a();
        int intValue = Integer.valueOf((int) aywy.a.a().k()).intValue();
        if (wrg.d) {
            intValue = Integer.valueOf((int) aywy.a.a().af()).intValue();
        }
        yda.a(str, bArr, intValue);
    }

    protected static final boolean a(byte[] bArr, String str, yda yda) {
        xip.a();
        yda.a(str, bArr, Integer.valueOf((int) aywy.a.a().bY()).intValue());
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean a(wrg wrg, byte[] bArr, String str) {
        a(wrg, bArr, str, this.e);
        return true;
    }
}
