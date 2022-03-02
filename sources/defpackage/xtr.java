package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: xtr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xtr extends qcg {
    protected xuk g;

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        GoogleHelp a = GoogleHelp.a(str);
        ThemeSettings themeSettings = new ThemeSettings();
        int i = 3;
        if (Build.VERSION.SDK_INT < 29 && ayqr.a.a().c()) {
            i = 0;
        }
        themeSettings.a = i;
        a.s = themeSettings;
        mwc mwc = new mwc((Context) getActivity());
        mwc.c = "com.google.android.gms.contacts_sync_core.USER_INITIATED_FEEDBACK_REPORT";
        mwc.b(iby.a(getActivity().getContainerActivity()));
        if (ayqy.a.a().a()) {
            wlr a2 = wls.a();
            a2.a = 80;
            mwc.a((mum) new xul(b(), wst.a(getActivity(), a2.a())), true);
        }
        a.a(mwc.a(), getActivity().getCacheDir());
        nyw nyw = new nyw(getActivity());
        this.g.a(8, b(), (String) null);
        nyw.a(a.a());
    }

    public abstract int b();

    /* access modifiers changed from: package-private */
    public final void d() {
        a("contacts_sync");
    }

    /* access modifiers changed from: protected */
    public final xut e() {
        return xut.a((qcd) getActivity());
    }

    /* access modifiers changed from: protected */
    public final void f() {
        String str;
        int i;
        xuk xuk = this.g;
        int b = b();
        Activity containerActivity = getActivity().getContainerActivity();
        if (Build.VERSION.SDK_INT < 22 || containerActivity.getReferrer() == null) {
            str = null;
        } else {
            String valueOf = String.valueOf(containerActivity.getReferrer());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("getting referrer from getReferrer: ");
            sb.append(valueOf);
            sb.toString();
            str = containerActivity.getReferrer().getAuthority();
        }
        if (str == null) {
            str = containerActivity.getCallingPackage();
        }
        if (!TextUtils.isEmpty(str)) {
            i = !str.contains("com.google.android.contacts") ? !str.contains("com.google.android.gms.settings") ? !str.contains("com.google.android.gms.people.notification") ? 1 : 3 : 2 : 4;
        } else {
            i = 1;
        }
        wml wml = xuk.a;
        aucd o = xmt.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xmt xmt = (xmt) o.b;
        xmt.b = 13;
        int i2 = 1 | xmt.a;
        xmt.a = i2;
        int i3 = b - 1;
        if (b != 0) {
            xmt.d = i3;
            int i4 = i2 | 4;
            xmt.a = i4;
            xmt.f = i - 1;
            xmt.a = i4 | 16;
            wml.a((xmt) o.i(), (String) null);
            return;
        }
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = new xuk();
    }
}
