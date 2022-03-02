package com.google.android.gms.ads.identifier.settings;

import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class h implements amqy {
    static final amqy a = new h();

    private h() {
    }

    public final Object a(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalStateException("Signals is empty.");
    }
}
