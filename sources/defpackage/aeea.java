package defpackage;

import android.content.Intent;

/* renamed from: aeea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeea {
    static {
        new Intent().setPackage("com.google.android.gsf.login").setAction("com.google.android.gsf.action.GET_GLS").addCategory("android.intent.category.DEFAULT");
    }

    public static String a(String str) {
        return "service_" + str;
    }
}
