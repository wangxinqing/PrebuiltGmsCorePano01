package com.google.android.gms.accountsettings.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsLoaderChimeraActivity extends dij {
    private static final anax h = anax.a((Object) "org.mozilla.firefox", (Object) "com.android.chrome");
    boolean g;

    private final int v() {
        Uri uri;
        String stringExtra = getIntent() != null ? getIntent().getStringExtra("extra.fallbackUrl") : null;
        if (stringExtra == null) {
            return 1;
        }
        Intent intent = getIntent();
        if (Pattern.matches(awgs.a.a().i(), stringExtra) && intent != null) {
            if (intent.getBooleanExtra("extra.fallbackAuth", false)) {
                String stringExtra2 = intent.getStringExtra("extra.accountName");
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("hl");
                Uri.Builder appendQueryParameter = Uri.parse(awgs.b()).buildUpon().appendQueryParameter("continue", stringExtra);
                if (!jlh.d(stringExtra2)) {
                    appendQueryParameter.appendQueryParameter("Email", stringExtra2);
                }
                if (queryParameter != null) {
                    appendQueryParameter.appendQueryParameter("hl", queryParameter);
                }
                uri = appendQueryParameter.build();
            } else {
                uri = Uri.parse(stringExtra);
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            intent2.addCategory("android.intent.category.BROWSABLE");
            String stringExtra3 = intent.getStringExtra("com.android.browser.application_id");
            if (h.contains(stringExtra3)) {
                intent2.setPackage(stringExtra3);
            }
            dis.a((Context) this, this.b).a(intent.getIntExtra("extra.screenId", 1), 2021, q());
            startActivity(intent2);
            p();
            return 2;
        }
        a(getString(R.string.accountsettings_error_retry_notice), getString(R.string.common_something_went_wrong), diw.a(8, "COMMON"));
        return 2;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        dis dis = this.a;
        if (dis == null) {
            return;
        }
        if (this.g) {
            dis.a(this.d, 2020, q());
        } else {
            dis.a(this.d, 2005, q());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean f() {
        Intent intent = getIntent();
        return (intent == null || intent.getAction() == null || intent.getAction().equals("com.google.android.gms.accountsettings.action.BROWSE_SETTINGS")) ? false : true;
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        Intent intent = getIntent();
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("com.google.android.gms.accountsettings.action.BROWSE_SETTINGS")) {
            try {
                jhg.c((Activity) this);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        } else {
            this.g = true;
            return Pattern.matches(jlh.a(awgs.a.a().c()), String.valueOf(intent.getIntExtra("extra.screenId", -1)));
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final Intent k() {
        Intent k = super.k();
        if (!awgy.i() && getIntent().hasExtra("com.android.browser.application_id")) {
            k.putExtra("com.android.browser.application_id", getIntent().getStringExtra("com.android.browser.application_id"));
        }
        return k;
    }

    public final String q() {
        Intent intent = getIntent();
        if (awgy.i()) {
            return jhg.a((Activity) this);
        }
        if (intent.hasExtra("extra.callingPackageName")) {
            return intent.getStringExtra("extra.callingPackageName");
        }
        String a = jhg.a((Activity) this);
        if (!jlh.d(a)) {
            return a;
        }
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("com.android.browser.application_id");
            if (h.contains(stringExtra)) {
                return stringExtra;
            }
        }
        return null;
    }

    public final int r() {
        return v();
    }

    public final int s() {
        return v();
    }

    public final int t() {
        if (this.g) {
            return v();
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int u() {
        return this.g ? 2 : 4;
    }
}
