package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Locale;

/* renamed from: dwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwi {
    public final dwg a;
    private final Context b;

    public dwi(Context context, dwg dwg) {
        this.b = context;
        this.a = dwg;
    }

    public final avfa a(ClientContext clientContext, String str) {
        String str2 = clientContext.e;
        aucd o = avez.e.o();
        avfe a2 = a(str2);
        if (a2 == null) {
            Log.e("AppInviteAgent", "Error creating ClientIdInfo");
            return null;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        avez avez = (avez) o.b;
        a2.getClass();
        avez.b = a2;
        avez.a |= 1;
        aucd o2 = avge.d.o();
        if (str == null) {
            str = "";
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avge avge = (avge) o2.b;
        str.getClass();
        int i = avge.a | 2;
        avge.a = i;
        avge.c = str;
        "".getClass();
        avge.a = i | 1;
        avge.b = "";
        avge avge2 = (avge) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avez avez2 = (avez) o.b;
        avge2.getClass();
        avez2.c = avge2;
        avez2.a |= 4;
        avgt a3 = a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avez avez3 = (avez) o.b;
        a3.getClass();
        avez3.d = a3;
        avez3.a |= 8;
        dwh dwh = new dwh(this.a, clientContext, avez.f, (avez) o.i());
        try {
            dwh.b();
            avfa avfa = (avfa) dwh.a(avfa.g);
            if (!dwh.c()) {
                return avfa;
            }
            int e = dwh.e();
            StringBuilder sb = new StringBuilder(55);
            sb.append("Accept invitation failed due to error code: ");
            sb.append(e);
            Log.e("AppInviteAgent", sb.toString());
            return null;
        } catch (eif e2) {
            Log.e("AppInviteAgent", "Authentication Failed ", e2);
            avfa avfa2 = (avfa) dwh.a(avfa.g);
            return null;
        } catch (VolleyError e3) {
            String valueOf = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb2.append("Error communicating with server ");
            sb2.append(valueOf);
            Log.e("AppInviteAgent", sb2.toString());
            avfa avfa22 = (avfa) dwh.a(avfa.g);
            return null;
        } catch (Throwable th) {
            avfa avfa3 = (avfa) dwh.a(avfa.g);
            throw th;
        }
    }

    public final avfe a(String str) {
        try {
            byte[] f = jhg.f(this.b, str);
            if (f == null) {
                return null;
            }
            aucd o = avfe.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfe avfe = (avfe) o.b;
            str.getClass();
            avfe.a |= 4;
            avfe.d = str;
            String encodeToString = Base64.encodeToString(f, 2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfe avfe2 = (avfe) o.b;
            encodeToString.getClass();
            int i = avfe2.a | 8;
            avfe2.a = i;
            avfe2.e = encodeToString;
            avfe2.b = 1;
            avfe2.a = 1 | i;
            String language = Locale.getDefault().getLanguage();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfe avfe3 = (avfe) o.b;
            language.getClass();
            avfe3.a |= 32;
            avfe3.f = language;
            return (avfe) o.i();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppInviteAgent", "Caller Package Name not found", e);
            return null;
        }
    }

    public final avgt a() {
        aucd o = avfc.c.o();
        hxj hxj = hxj.a;
        int j = hxz.j(this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avfc avfc = (avfc) o.b;
        avfc.a |= 1;
        avfc.b = j;
        avfc avfc2 = (avfc) o.i();
        aucd o2 = avgt.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avgt avgt = (avgt) o2.b;
        avfc2.getClass();
        avgt.b = avfc2;
        avgt.a |= 1;
        return (avgt) o2.i();
    }
}
