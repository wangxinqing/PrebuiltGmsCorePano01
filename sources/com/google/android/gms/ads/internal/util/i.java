package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class i extends p {
    public final String a(Context context) {
        String str;
        if (u.a == null) {
            u.a = new u();
        }
        u uVar = u.a;
        if (TextUtils.isEmpty(uVar.b)) {
            if (jim.a()) {
                str = (String) r.a(context, new s(context));
            } else {
                str = (String) r.a(context, new t(hxz.i(context), context));
            }
            uVar.b = str;
        }
        return uVar.b;
    }
}
