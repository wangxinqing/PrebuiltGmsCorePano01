package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhoneskyDpcInstallChimeraActivity extends ijd implements LoaderManager.LoaderCallbacks {
    private static final iwd a = ehv.a("AuthManaged", "PhoneskyDpcInstallChimeraActivity");
    private String b;
    private ijo c;
    private ProgressBar d;

    public static Intent a(Context context, String str, boolean z, Bundle bundle) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallActivity").putExtra("dpc_package_name", str).putExtra("hide_back_button", z).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.b = getIntent().getStringExtra("dpc_package_name");
        int i2 = Build.VERSION.SDK_INT;
        if (!a((Context) this) || TextUtils.isEmpty(this.b)) {
            a(2);
            return;
        }
        if (!ijm.a(i())) {
            i = R.layout.phonesky_dpc_install_activity;
        } else {
            i = R.layout.phonesky_dpc_install_activity_glif;
        }
        ijo a2 = ijo.a(this, i);
        this.c = a2;
        ijm.a(a2.a());
        this.c.b();
        this.c.b(false);
        if (getIntent().getBooleanExtra("hide_back_button", false)) {
            this.c.c(false);
            alhs.a(getWindow(), false);
        }
        setContentView((View) this.c.a());
        this.c.a(getText(R.string.auth_device_management_download_progress));
        this.c.a(true);
        this.d = ((aliz) ((TemplateLayout) this.c.a()).a(aliz.class)).a();
        String str = this.b;
        for (PackageInfo packageInfo : getPackageManager().getInstalledPackages(0)) {
            if (str.equals(packageInfo.packageName)) {
                a(-1);
                return;
            }
        }
        getSupportLoaderManager().initLoader(0, (Bundle) null, this);
        setResult(0, new Intent().putExtra("intentionally_canceled", true));
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new gix(this, this.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() < 0) {
            switch (num.intValue()) {
                case -6:
                case -5:
                case -4:
                    this.d.setIndeterminate(false);
                    this.d.setMax(100);
                    return;
                case -3:
                    a(2);
                    return;
                case -2:
                    a(3);
                    return;
                case -1:
                    a(-1);
                    return;
                default:
                    iwd iwd = a;
                    String valueOf = String.valueOf(num);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                    sb.append("Unknown result ");
                    sb.append(valueOf);
                    sb.append(" received from the loader!");
                    iwd.e(sb.toString(), new Object[0]);
                    return;
            }
        } else {
            this.d.setProgress(num.intValue());
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    private final void a(int i) {
        setResult(i);
        finish();
    }

    public static boolean a(Context context) {
        try {
            return new jnh(context).b("com.android.vending", 0).versionCode >= 80770000;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
