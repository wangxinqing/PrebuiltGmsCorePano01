package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: ajqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqr {
    private final Context a;

    public ajqr(Context context) {
        this.a = context;
    }

    public final int a(String str) {
        if ("com.google.android.gms".equals(str)) {
            return hxj.b;
        }
        try {
            Bundle bundle = jni.b(this.a).a(str, 128).metaData;
            if (bundle != null) {
                return bundle.getInt("com.google.android.gms.version", -1);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }
}
