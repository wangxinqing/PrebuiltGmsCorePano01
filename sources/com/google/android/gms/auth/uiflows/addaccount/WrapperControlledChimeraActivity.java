package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.config.FeatureRequestExtras;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WrapperControlledChimeraActivity extends gnf {
    private static final iwd a = ehv.a("AddAccount", "WrapperControlledChimeraActivity");
    private static final fzk b = fzk.a("intent");

    public static Intent a(Context context, boolean z, ijn ijn, Intent intent) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.WrapperControlledActivity");
        fzl a2 = gnf.a(ijn, z, R.string.auth_gls_name_checking_info_title);
        a2.b(b, intent);
        return className.putExtras(a2.a);
    }

    /* access modifiers changed from: protected */
    public final void aI() {
        if (ekh.a.b(this)) {
            ekh.a.a(this, (Intent) f().a(b));
        } else {
            super.aI();
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "WrapperControlledActivity";
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        a(i2, intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = (Intent) f().a(b);
        alht.a(getIntent(), intent);
        if (ent.c() && ijk.a(intent)) {
            fzl fzl = new fzl();
            fzl.b(gnx.o, (Integer) f().a(gnx.o, 0));
            fzl.b(gnx.n, (String) f().a(gnx.n));
            Bundle bundle2 = fzl.a;
            if (gnx.k()) {
                FeatureRequestExtras.RequestBuilder requestBuilder = new FeatureRequestExtras.RequestBuilder();
                requestBuilder.setSessionId((String) f().a(gnx.n));
                requestBuilder.addToBundle(bundle2);
            }
            intent.putExtras(bundle2);
        }
        if (ekh.a.b(this)) {
            ekh.a.a((gmz) this);
        }
        if (getPackageManager().resolveActivity(intent, 0) == null) {
            iwd iwd = a;
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Could not resolve intent: ");
            sb.append(valueOf);
            iwd.d(sb.toString(), new Object[0]);
            a(0, (Intent) null);
        }
        startActivityForResult(intent, 0);
    }
}
