package defpackage;

import android.net.Uri;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: fkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fkn {
    public static Credential a(hmj hmj) {
        eug eug = new eug(hmj.e);
        if (!amrk.a(hmj.j)) {
            eug.a = hmj.j;
        }
        if (!amrk.a(hmj.l)) {
            eug.e = hmj.l;
        } else if (!amrk.a(hmj.g)) {
            eug.d = hmj.g;
        }
        if (!amrk.a(hmj.k)) {
            eug.b = Uri.parse(hmj.k);
        }
        return eug.a();
    }

    public static hmj a(Credential credential, String str) {
        aucd o = hmj.m.o();
        String str2 = credential.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmj hmj = (hmj) o.b;
        str2.getClass();
        int i = hmj.a | 32;
        hmj.a = i;
        hmj.e = str2;
        str.getClass();
        int i2 = i | 4;
        hmj.a = i2;
        hmj.c = str;
        str.getClass();
        hmj.a = i2 | 2;
        hmj.b = str;
        String b = amrk.b(credential.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmj hmj2 = (hmj) o.b;
        b.getClass();
        hmj2.a |= 16384;
        hmj2.j = b;
        String b2 = amrk.b(credential.e);
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmj hmj3 = (hmj) o.b;
        b2.getClass();
        hmj3.a |= 128;
        hmj3.g = b2;
        String b3 = amrk.b(credential.f);
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmj hmj4 = (hmj) o.b;
        b3.getClass();
        int i3 = hmj4.a | 65536;
        hmj4.a = i3;
        hmj4.l = b3;
        int i4 = i3 | 2048;
        hmj4.a = i4;
        hmj4.i = false;
        Uri uri = credential.c;
        if (uri == null) {
            "".getClass();
            hmj4.a = i4 | 32768;
            hmj4.k = "";
        } else {
            String uri2 = uri.toString();
            if (o.c) {
                o.c();
                o.c = false;
            }
            hmj hmj5 = (hmj) o.b;
            uri2.getClass();
            hmj5.a |= 32768;
            hmj5.k = uri2;
        }
        return (hmj) o.i();
    }

    public static hmj a(String str) {
        aucd o = hmj.m.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmj hmj = (hmj) o.b;
        str.getClass();
        int i = hmj.a | 2;
        hmj.a = i;
        hmj.b = str;
        str.getClass();
        int i2 = i | 4;
        hmj.a = i2;
        hmj.c = str;
        hmj.a = i2 | 2048;
        hmj.i = true;
        return (hmj) o.i();
    }
}
