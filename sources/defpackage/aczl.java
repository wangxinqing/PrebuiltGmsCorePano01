package defpackage;

import android.content.Context;
import com.android.volley.NetworkResponse;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Locale;

/* renamed from: aczl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aczl extends aczm {
    private static final jjg k = jjg.a();
    protected final aczg a;
    protected final byte[] b;

    public aczl(Context context, adbx adbx, ClientContext clientContext, String str, String str2, aczg aczg, byte[] bArr) {
        super(context, adbx, clientContext, str, str2);
        iva.a((Object) aczg);
        this.a = aczg;
        this.b = (byte[]) iva.a((Object) bArr);
    }

    static String a(String str) {
        if (jlh.d(str)) {
            str = "me";
        }
        if (str.equalsIgnoreCase("me") || azrh.a.a().k()) {
            return str;
        }
        throw new adab("User delegation is disabled.");
    }

    static boolean a(String str, String str2) {
        return !adhk.a(str, str2);
    }

    /* access modifiers changed from: protected */
    public final adao a() {
        return new adao(this.c, this.g);
    }

    /* access modifiers changed from: package-private */
    public final aucd a(atzv atzv) {
        aucd aucd = (aucd) atzv.c(5);
        aucd.a((aucj) atzv);
        String format = String.format(Locale.ENGLISH, "%d;%d", new Object[]{201216000, Integer.valueOf(ModuleManager.get(this.c).getCurrentModule().moduleVersion)});
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atzv atzv2 = (atzv) aucd.b;
        atzv atzv3 = atzv.i;
        format.getClass();
        atzv2.a |= 16;
        atzv2.e = format;
        aucd o = atzt.c.o();
        String str = this.h;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atzt atzt = (atzt) o.b;
        str.getClass();
        atzt.a = 1 | atzt.a;
        atzt.b = str;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atzv atzv4 = (atzv) aucd.b;
        atzt atzt2 = (atzt) o.i();
        atzt2.getClass();
        atzv4.f = atzt2;
        atzv4.a |= 32;
        return aucd;
    }

    /* access modifiers changed from: package-private */
    public final nja a(VolleyError volleyError) {
        if (volleyError instanceof TimeoutError) {
            return new nja(15, (String) null);
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null) {
            return new nja(4502, (String) null);
        }
        if (networkResponse.statusCode == 403) {
            ((anih) ((anih) k.b()).a("aczl", "a", 62, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("package '%s' doesn't have access to the API", (Object) this.h);
            if (hxz.f(this.c)) {
                jad.a(volleyError, this.m);
                ((anih) ((anih) k.b()).a("aczl", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("package '%s' needs to be white-listed for UDC API", (Object) this.h);
            }
        }
        return new nja(4505, (String) null);
    }
}
