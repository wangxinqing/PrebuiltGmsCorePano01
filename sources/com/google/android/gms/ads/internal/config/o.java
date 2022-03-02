package com.google.android.gms.ads.internal.config;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.flag.a;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class o {
    public static void a(List list, a aVar) {
        String str = (String) aVar.a();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
