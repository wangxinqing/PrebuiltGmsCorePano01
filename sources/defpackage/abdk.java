package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: abdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abdk extends iby implements icd {
    public abdk(Context context, abae abae) {
        super(context, abaf.d, (ibm) abae, ibx.a);
    }

    public final isc c() {
        isc c = super.c();
        String string = ((abae) this.f).a.getString("com.google.android.gms.signin.internal.realClientPackageName");
        if (!TextUtils.isEmpty(string)) {
            c.c = string;
        }
        return c;
    }
}
