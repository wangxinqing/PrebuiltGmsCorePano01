package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.measurement.module.Analytics;

/* renamed from: dxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxa extends jba {
    private final ClientContext a;
    private final dwm d;

    public dxa(ClientContext clientContext, dwm dwm) {
        super(77, "AppInviteGetInvitation");
        this.a = clientContext;
        this.d = dwm;
    }

    private static final void a(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public final void a(Context context) {
        Intent intent;
        Status status;
        Context context2 = context;
        String str = this.a.e;
        if (eau.c(context2, str)) {
            ivk a2 = eau.a(context2, str);
            String string = a2.getString("deepLink", (String) null);
            intent = new Intent("android.intent.action.VIEW").putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", dwa.a(a2.getString("invitationId", (String) null), string, a2.getBoolean("isNewInstall", false))).setPackage(str);
            if (string != null) {
                try {
                    intent.setData(Uri.parse(string));
                } catch (Exception e) {
                }
            }
        } else {
            intent = null;
        }
        if (intent != null && !eau.a("hasReturnedInvitation", true, context2, str)) {
            status = Status.a;
        } else {
            status = Status.e;
        }
        dwm dwm = this.d;
        if (dwm != null) {
            Parcel aQ = dwm.aQ();
            bhx.a(aQ, (Parcelable) status);
            bhx.a(aQ, (Parcelable) intent);
            dwm.b(2, aQ);
        }
        eau.b("hasReturnedInvitation", context2, str);
        if (!Status.e.equals(status)) {
            if (str != null && eau.c(context2, str) && !eau.a("scionInstallEvent", true, context2, str) && eau.g(context2, str) != null) {
                eau.b("scionInstallEvent", context2, str);
                Bundle bundle = new Bundle();
                a("source", eau.a("scionSource", context2, str), bundle);
                a("medium", eau.a("scionMedium", context2, str), bundle);
                a("campaign", eau.g(context2, str), bundle);
                Analytics.getInstance(context).a("fdl", "_cmp", bundle, str);
                a("dynamic_link_link_id", eau.a("scionLinkId", context2, str), bundle);
                a("dynamic_link_link_name", eau.a("scionLinkName", context2, str), bundle);
                bundle.putLong("dynamic_link_accept_time", eau.d(context2, str).longValue());
                if (eau.e(context2, str)) {
                    Analytics.getInstance(context).a("fdl", "dynamic_link_first_open", bundle, str);
                } else {
                    Analytics.getInstance(context).a("fdl", "dynamic_link_app_open", bundle, str);
                    if (eau.f(context2, str)) {
                        Analytics.getInstance(context).a("fdl", "dynamic_link_app_update", bundle, str);
                    }
                }
            }
            dwe dwe = new dwe(context.getApplicationContext(), (String) null);
            int m = eau.m(context2, str);
            boolean e2 = eau.e(context2, str);
            boolean f = eau.f(context2, str);
            String h = eau.h(context2, str);
            int a3 = avgz.a(eau.i(context2, str));
            String j = eau.j(context2, str);
            String k = eau.k(context2, str);
            String l = eau.l(context2, str);
            aucd o = anrh.f.o();
            if (!TextUtils.isEmpty(str)) {
                aucd o2 = anrr.c.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anrr anrr = (anrr) o2.b;
                str.getClass();
                anrr.a |= 2;
                anrr.b = str;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anrh anrh = (anrh) o.b;
                anrr anrr2 = (anrr) o2.i();
                anrr2.getClass();
                anrh.b = anrr2;
                anrh.a |= 1;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            anrh anrh2 = (anrh) o.b;
            int i = m - 1;
            if (m != 0) {
                anrh2.c = i;
                anrh2.a |= 2;
                if (!TextUtils.isEmpty(j) || !TextUtils.isEmpty(k)) {
                    anrm a4 = dwe.a(j, k, h, a3, "");
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    anrh anrh3 = (anrh) o.b;
                    a4.getClass();
                    anrh3.d = a4;
                    anrh3.a |= 4;
                }
                int a5 = dwe.a(e2, f);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anrh anrh4 = (anrh) o.b;
                anrh4.e = a5 - 1;
                anrh4.a |= 8;
                dwe.a((anrh) o.i(), 12, l);
                eau.b(context2, this.a.e);
                return;
            }
            throw null;
        }
    }
}
