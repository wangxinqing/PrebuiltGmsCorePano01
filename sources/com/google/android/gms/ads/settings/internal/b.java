package com.google.android.gms.ads.settings.internal;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b {
    public static Bundle a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("action", str);
        bundle.putString("lta", str2);
        bundle.putString("previous_gmscore_version", str3);
        return bundle;
    }
}
