package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: omu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omu extends oga {
    private final oab a;
    private final String l;

    public omu(Context context, HelpConfig helpConfig, oab oab, String str, aoru aoru) {
        super(context, helpConfig, aoru);
        this.a = oab;
        this.l = str;
    }

    static avmk a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        aucd o = avmk.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avmk avmk = (avmk) o.b;
        str.getClass();
        int i = avmk.a | 1;
        avmk.a = i;
        avmk.b = str;
        str2.getClass();
        avmk.a = i | 2;
        avmk.c = str2;
        return (avmk) o.i();
    }

    /* access modifiers changed from: protected */
    public final String b() {
        String valueOf = String.valueOf(axmj.z());
        String valueOf2 = String.valueOf(String.format(axmj.A(), new Object[]{this.d.e()}));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return (int) axnz.a.a().e();
    }

    /* access modifiers changed from: protected */
    public final byte[] d() {
        aucd o = avml.n.o();
        String a2 = omt.a(this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avml avml = (avml) o.b;
        a2.getClass();
        int i = 2;
        int i2 = avml.a | 2;
        avml.a = i2;
        avml.c = a2;
        String str = this.d.c;
        if (str != null) {
            str.getClass();
            avml.a = i2 | 32;
            avml.h = str;
        }
        boolean z = ofy.b() && ofy.b(this.c, R.attr.gh_isInDarkMode);
        oab oab = this.a;
        oab.k = z;
        String uri = z ? Uri.parse(oab.e).buildUpon().appendQueryParameter("dark", "1").build().toString() : oab.e;
        String a3 = oal.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avml avml2 = (avml) o.b;
        a3.getClass();
        int i3 = avml2.a | 16;
        avml2.a = i3;
        avml2.g = a3;
        avml2.d = 1;
        int i4 = i3 | 4;
        avml2.a = i4;
        uri.getClass();
        avml2.a = i4 | 1;
        avml2.b = uri;
        if (axmj.a.a().aP()) {
            Uri parse = Uri.parse(uri);
            if (oab.a().contains(parse.getHost())) {
                String uri2 = parse.buildUpon().scheme((String) null).authority((String) null).build().toString();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avml avml3 = (avml) o.b;
                uri2.getClass();
                avml3.a |= 1;
                avml3.b = uri2;
            }
        }
        olv j = super.j();
        olw olw = j.b;
        if (olw == null) {
            olw = olw.d;
        }
        String str2 = olw.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avml avml4 = (avml) o.b;
        str2.getClass();
        avml4.a |= 64;
        avml4.i = str2;
        if (ofq.a(axps.b()) && this.d.D() && !TextUtils.isEmpty(this.d.W)) {
            String str3 = this.d.W;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avml avml5 = (avml) o.b;
            str3.getClass();
            avml5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            avml5.k = str3;
            if (ofq.b(axqh.b())) {
                int i5 = this.d.X;
                if (i5 != 1) {
                    i = i5 != 2 ? i5 != 3 ? i5 != 4 ? 1 : 3 : 4 : 6;
                }
                if (i != 1) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avml avml6 = (avml) o.b;
                    avml6.l = i - 1;
                    avml6.a |= 1024;
                }
            }
        }
        if (ofq.b(axqe.a.a().a())) {
            int i6 = hxk.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avml avml7 = (avml) o.b;
            avml7.a |= 128;
            avml7.j = i6;
        }
        oma oma = j.d;
        if (oma == null) {
            oma = oma.q;
        }
        aucx aucx = oma.e;
        for (int i7 = 0; i7 < aucx.size(); i7++) {
            olz olz = (olz) aucx.get(i7);
            avmk a4 = a(olz.b, olz.c);
            if (a4 != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avml avml8 = (avml) o.b;
                a4.getClass();
                if (!avml8.f.a()) {
                    avml8.f = aucj.a(avml8.f);
                }
                avml8.f.add(a4);
            }
            if (TextUtils.equals("genie-eng:app_pkg_name", olz.b) && !olz.c.isEmpty()) {
                String str4 = olz.c;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avml avml9 = (avml) o.b;
                str4.getClass();
                avml9.a |= 64;
                avml9.i = str4;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (this.l != null) {
            aucd aucd = (aucd) j.c(5);
            aucd.a((aucj) j);
            oma oma2 = j.d;
            if (oma2 == null) {
                oma2 = oma.q;
            }
            aucd aucd2 = (aucd) oma2.c(5);
            aucd2.a((aucj) oma2);
            String str5 = this.l;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            oma oma3 = (oma) aucd2.b;
            str5.getClass();
            oma3.a |= 16384;
            oma3.n = str5;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olv olv = (olv) aucd.b;
            oma oma4 = (oma) aucd2.i();
            olv olv2 = olv.h;
            oma4.getClass();
            olv.d = oma4;
            olv.a = 4 | olv.a;
            j = (olv) aucd.i();
            a("gcmToken", this.l, arrayList);
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        avml avml10 = (avml) o.b;
        j.getClass();
        avml10.m = j;
        avml10.a |= 2048;
        olw olw2 = j.b;
        if (olw2 == null) {
            olw2 = olw.d;
        }
        a("app_package_name", olw2.b, arrayList);
        olw olw3 = j.b;
        if (olw3 == null) {
            olw3 = olw.d;
        }
        a("app_version", olw3.c, arrayList);
        olx olx = j.c;
        if (olx == null) {
            olx = olx.g;
        }
        a("device_carrier_name", olx.e, arrayList);
        olx olx2 = j.c;
        if (olx2 == null) {
            olx2 = olx.g;
        }
        a("device_model_name", olx2.c, arrayList);
        olx olx3 = j.c;
        if (olx3 == null) {
            olx3 = olx.g;
        }
        a("device_locale", olx3.b, arrayList);
        olx olx4 = j.c;
        if (olx4 == null) {
            olx4 = olx.g;
        }
        a("device_release_version", olx4.d, arrayList);
        olx olx5 = j.c;
        if (olx5 == null) {
            olx5 = olx.g;
        }
        a("device_name", olx5.f, arrayList);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avml avml11 = (avml) o.b;
        if (!avml11.e.a()) {
            avml11.e = aucj.a(avml11.e);
        }
        auab.a((Iterable) arrayList, (List) avml11.e);
        return ((avml) o.i()).k();
    }

    public static oab a(nzu nzu, oab oab, boolean z, aoru aoru) {
        String str;
        iva.b("Must be called from a worker thread.");
        HelpConfig f = nzu.f();
        oab oab2 = null;
        if (f != null && !TextUtils.isEmpty(f.e())) {
            if (z) {
                nzu.k();
                str = ohj.b((Context) nzu);
            } else {
                str = null;
            }
            nzu.k();
            try {
                ogi k = new omu((Context) nzu, f, oab, str, aoru).k();
                if (k.a == 304) {
                    oab2 = oab.a;
                } else if (!k.a()) {
                    int i = k.a;
                    StringBuilder sb = new StringBuilder(81);
                    sb.append("Received non-success status code when fetching Rendering API response ");
                    sb.append(i);
                    Log.e("gH_RenderingApiUtils", sb.toString());
                } else {
                    byte[] bArr = k.c;
                    if (bArr != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr, oap.a(k.b)));
                            if (!jSONObject.has("validation_error") || jSONObject.getJSONArray("validation_error").length() <= 0) {
                                oab2 = oab.a(jSONObject, oab);
                            }
                        } catch (UnsupportedEncodingException | JSONException e) {
                            Log.e("gH_RenderingApiUtils", "Parsing leaf content response data failed.", e);
                        }
                    }
                }
                if (oab2 != null) {
                    oab2.k = oab.k;
                }
                return oab2;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            }
        }
        return null;
    }

    private static void a(String str, String str2, List list) {
        avmk a2 = a(str, str2);
        if (a2 != null) {
            list.add(a2);
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axmx.a.a().q());
    }

    /* access modifiers changed from: protected */
    public final void a(Map map) {
        super.a(map);
        map.put("If-None-Match", this.a.l);
    }
}
