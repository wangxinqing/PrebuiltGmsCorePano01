package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: htk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class htk implements amsv {
    final /* synthetic */ htl a;

    public htk(htl htl) {
        this.a = htl;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        NetworkInfo activeNetworkInfo;
        aucd o = avsb.d.o();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.a.a.getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
                int a2 = avsa.a(activeNetworkInfo.getType());
                if (a2 != 0) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avsb avsb = (avsb) o.b;
                    avsb.b = a2 - 2;
                    avsb.a |= 1;
                }
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype != -1) {
                    int a3 = avry.a(subtype);
                    if (a3 == 0) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        aubk a4 = aubk.a((OutputStream) byteArrayOutputStream);
                        a4.c(2, subtype);
                        a4.c();
                        o.b(byteArrayOutputStream.toByteArray());
                    } else {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avsb avsb2 = (avsb) o.b;
                        avsb2.c = a3 - 1;
                        avsb2.a |= 2;
                    }
                } else {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avsb avsb3 = (avsb) o.b;
                    avsb3.c = 100;
                    avsb3.a |= 2;
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        } catch (SecurityException e2) {
        }
        return (avsb) o.i();
    }
}
