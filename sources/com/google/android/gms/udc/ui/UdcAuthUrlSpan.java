package com.google.android.gms.udc.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.chimera.FragmentTransaction;
import java.net.URISyntaxException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcAuthUrlSpan extends URLSpan {
    private static final jjg c = jjg.a();
    public final boolean a;
    public String b;
    private final String d;
    private final adgw e;

    public UdcAuthUrlSpan(String str, String str2, boolean z, adgw adgw) {
        super(str);
        this.d = str2;
        this.a = z;
        this.e = adgw;
    }

    private final Intent a(Context context) {
        if (TextUtils.isEmpty(this.d)) {
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(this.d, 0);
            if (jhg.a(context, parseUri)) {
                return parseUri;
            }
        } catch (URISyntaxException e2) {
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.d));
        if (!this.a || TextUtils.isEmpty(this.b)) {
            return intent;
        }
        intent.putExtra("com.google.android.gms.udc.ACCOUNT_NAME", this.b);
        return intent;
    }

    public final String getURL() {
        if (!this.a || jlh.d(this.b)) {
            return super.getURL();
        }
        return adhr.a(this.b, super.getURL()).toString();
    }

    public void onClick(View view) {
        adfx adfx;
        int i;
        Context context = view.getContext();
        Intent a2 = a(context);
        if (a2 != null && jhg.a(context, a2)) {
            try {
                context.startActivity(a2);
                return;
            } catch (SecurityException e2) {
                anih anih = (anih) c.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("com.google.android.gms.udc.ui.UdcAuthUrlSpan", "onClick", 70, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't launch activity");
            }
        }
        String url = super.getURL();
        adhv adhv = new adhv(context, this.b);
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof adfx)) {
                if (!(context2 instanceof ContextWrapper)) {
                    adfx = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            } else {
                adfx = (adfx) context2;
                break;
            }
        }
        if (adfx != null) {
            i = adfx.b();
        } else {
            i = 0;
        }
        adgw adgw = this.e;
        if (adgw == null) {
            adgw = new adgw(context, new adgs(context));
        }
        adgv a3 = adgw.a(url, this.b);
        aqmj aqmj = a3.b;
        boolean z = a3.a;
        aucd o = aqmf.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqmf aqmf = (aqmf) o.b;
        aqmf.c = aqmj.d;
        int i2 = aqmf.a | 2;
        aqmf.a = i2;
        int i3 = i2 | 4;
        aqmf.a = i3;
        aqmf.d = z;
        if (url != null) {
            url.getClass();
            aqmf.a = i3 | 1;
            aqmf.b = url;
        }
        aucd o2 = aqna.d.o();
        aucf aucf = (aucf) aqmz.l.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqmz.b = 39;
        int i4 = aqmz.a | 1;
        aqmz.a = i4;
        aqmz.c = 29021;
        int i5 = i4 | 2;
        aqmz.a = i5;
        aqmz.a = i5 | 16;
        aqmz.f = false;
        aucd o3 = aqms.m.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqms aqms = (aqms) o3.b;
        aqmf aqmf2 = (aqmf) o.i();
        aqmf2.getClass();
        aqms.l = aqmf2;
        aqms.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz2 = (aqmz) aucf.b;
        aqms aqms2 = (aqms) o3.i();
        aqms2.getClass();
        aqmz2.j = aqms2;
        aqmz2.a |= 1024;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqna aqna = (aqna) o2.b;
        aqmz aqmz3 = (aqmz) aucf.i();
        aqmz3.getClass();
        aqna.b = aqmz3;
        aqna.a |= 1;
        adhv.a((aqna) o2.i(), i);
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("main_url", super.getURL());
        a2.a("url", getURL());
        a2.a("dataAvRef", this.d);
        a2.a("needsAuth", Boolean.valueOf(this.a));
        a2.a("accountName", this.b);
        return a2.toString();
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
