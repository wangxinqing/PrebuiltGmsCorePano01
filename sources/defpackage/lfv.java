package defpackage;

import android.content.Context;
import com.google.android.gms.drive.auth.CallingAppInfo;

/* renamed from: lfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lfv extends lgl {
    private final String c;
    private final CallingAppInfo d;
    private final int e;

    public lfv(CallingAppInfo callingAppInfo, String str, int i, lgm lgm, Context context) {
        super(new agyh().a(lgm.a(str), lge.a(4)), context);
        iva.a((Object) callingAppInfo);
        this.d = callingAppInfo;
        iva.a((Object) str);
        this.c = str;
        this.e = i;
    }

    public final lgc d() {
        lgc d2 = super.d();
        d2.a(this.c);
        d2.a(this.d);
        d2.a(this.e);
        return d2;
    }
}
