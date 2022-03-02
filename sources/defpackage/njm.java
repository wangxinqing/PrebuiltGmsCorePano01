package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: njm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class njm {
    static String a(Intent intent) {
        ComponentName component;
        if (intent == null) {
            return null;
        }
        String str = intent.getPackage();
        if (str == null && (component = intent.getComponent()) != null) {
            str = component.getPackageName();
        }
        boolean equals = "com.google.android.gms".equals(str);
        if (str == null) {
            return "Implicit";
        }
        return !equals ? "External" : "Internal";
    }

    static String a(String str, Intent intent, String str2) {
        String valueOf = String.valueOf(str);
        String str3 = str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2);
        if (!axda.a.a().H()) {
            return str3;
        }
        String valueOf2 = String.valueOf(str3);
        int a = nkd.a(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 12);
        sb.append(valueOf2);
        sb.append(":");
        sb.append(a);
        return sb.toString();
    }

    public static nig a(String str, nig nig) {
        aucd aucd;
        if (str == null) {
            str = "unknown";
        }
        if (nig != null) {
            aucd = (aucd) nig.c(5);
            aucd.a((aucj) nig);
        } else {
            aucd = nig.g.o();
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        nig nig2 = (nig) aucd.b;
        nig2.f = 1;
        nig2.a |= 16;
        String str2 = str.length() == 0 ? new String("calling_module:") : "calling_module:".concat(str);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        nig nig3 = (nig) aucd.b;
        str2.getClass();
        nig3.a |= 1;
        nig3.b = str2;
        return (nig) aucd.i();
    }
}
