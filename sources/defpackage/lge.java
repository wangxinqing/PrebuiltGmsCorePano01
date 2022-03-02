package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.drive.auth.CallingAppInfo;

/* renamed from: lge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lge {
    public final lgm a;
    public final Context b;

    public lge(lgm lgm, Context context) {
        iva.a((Object) lgm);
        this.a = lgm;
        iva.a((Object) context);
        this.b = context;
    }

    static agyk a(int i) {
        agyk agyk = new agyk();
        agyk.a = i;
        return agyk;
    }

    public final lfs a(Bundle bundle) {
        return new lgn(bundle, this.a, this.b);
    }

    public final lfs a(CallingAppInfo callingAppInfo, String str) {
        iva.a((Object) str);
        return new lgn(callingAppInfo, str, this.a, this.b);
    }
}
