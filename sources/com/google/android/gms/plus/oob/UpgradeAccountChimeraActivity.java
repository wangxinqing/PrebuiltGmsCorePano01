package com.google.android.gms.plus.oob;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpgradeAccountChimeraActivity extends yyw implements yzf, yyy, yyu, yza, yxv {
    private yzg d;
    private DialogFragment e;
    private Fragment f;
    private String g;
    private String h;
    private String i;
    private PlusCommonExtras j;
    private View k;
    private Drawable l;
    private int m;

    private final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, UpgradeAccountEntity.DescriptionEntity descriptionEntity) {
        if (descriptionEntity == null || !descriptionEntity.a.contains(4)) {
            b(favaDiagnosticsEntity);
        } else if (TextUtils.isEmpty(descriptionEntity.e)) {
            b(favaDiagnosticsEntity);
        } else {
            boolean c = c();
            yzb yzb = new yzb();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_setup_wizard_theme", c);
            bundle.putParcelable("description", descriptionEntity);
            yzb.setArguments(bundle);
            a(favaDiagnosticsEntity, yzb);
        }
    }

    private final void b(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        a(favaDiagnosticsEntity, yzb.a(c(), (String) null, getString(R.string.plus_oob_failure_text), (String) null));
    }

    private final void g() {
        if (!i()) {
            this.m = 1;
            if (this.c == 0) {
                if (this.l == null) {
                    this.l = getWindow().getDecorView().getBackground();
                }
                getWindow().setBackgroundDrawableResource(17170445);
            }
            this.k.setVisibility(8);
            if (c()) {
                a(getString(R.string.plus_oob_interstitial_loading), getString(R.string.plus_oob_interstitial_loading_text));
            } else {
                a(getString(R.string.plus_oob_loading), (String) null);
            }
        }
    }

    private final void h() {
        if (!i()) {
            this.m = 2;
            if (c()) {
                a(getString(R.string.plus_oob_interstitial_sending), getString(R.string.plus_oob_interstitial_loading_text));
            } else {
                a(getString(R.string.plus_oob_sending), (String) null);
            }
        }
    }

    private final boolean i() {
        return ((DialogFragment) getSupportFragmentManager().findFragmentByTag("progress_dialog_fragment")) != null;
    }

    private final void j() {
        this.m = 0;
        k();
    }

    private final void k() {
        DialogFragment dialogFragment = this.e;
        if (dialogFragment == null) {
            DialogFragment dialogFragment2 = (DialogFragment) getSupportFragmentManager().findFragmentByTag("progress_dialog_fragment");
            if (dialogFragment2 != null) {
                dialogFragment2.dismissAllowingStateLoss();
            }
        } else {
            dialogFragment.dismissAllowingStateLoss();
            this.e = null;
        }
        if (this.l != null) {
            getWindow().setBackgroundDrawable(this.l);
            this.l = null;
        }
        this.k.setVisibility(0);
    }

    public final void f() {
        e();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.m = bundle.getInt("UpgradeAccountActivity.dialogStateKey");
        }
        Bundle extras = getIntent().getExtras();
        this.g = extras.getString("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE");
        this.h = extras.getString("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT");
        this.i = extras.getString("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME");
        PlusCommonExtras b = PlusCommonExtras.b(getIntent());
        this.j = b;
        ykr.a(this, b, "");
        this.k = getWindow().getDecorView().findViewById(16908290);
        getWindow().setSoftInputMode(3);
        setContentView((int) R.layout.plus_oob_upgrade_account_activity);
        if (!jkf.a(this) || getIntent().getExtras().getBoolean("debug_no_connection", false)) {
            a(yzb.a(c(), getString(R.string.plus_oob_no_connection_title), getString(R.string.plus_oob_no_connection_message), getString(17039370)));
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("content_fragment");
        this.f = findFragmentByTag;
        if (findFragmentByTag == null) {
            boolean c = c();
            String str = this.g;
            String str2 = this.h;
            String str3 = this.b;
            String str4 = this.i;
            yyz yyz = new yyz();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("is_setup_wizard_theme", c);
            bundle2.putString("promo_app_package", str);
            bundle2.putString("promo_app_text", str2);
            bundle2.putString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", str3);
            bundle2.putString("back_button_name", str4);
            bundle2.putParcelable("upgrade_account", (Parcelable) null);
            yyz.setArguments(bundle2);
            this.f = yyz;
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add(R.id.content_layout, this.f, "content_fragment");
            beginTransaction.commit();
            g();
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        yzh yzh = (yzh) supportFragmentManager2.findFragmentByTag("upgrade_account_fragment");
        if (yzh == null) {
            String str5 = this.a;
            String str6 = this.b;
            PlusCommonExtras plusCommonExtras = this.j;
            yzh yzh2 = new yzh();
            yzh2.setArguments(yzi.a(str5, str6, plusCommonExtras));
            supportFragmentManager2.beginTransaction().add((Fragment) yzh2, "upgrade_account_fragment").commit();
            yzh = yzh2;
        }
        if (this.d == null) {
            this.d = yzh.a;
        }
    }

    public final void onPause() {
        super.onPause();
        k();
    }

    public final void onResume() {
        super.onResume();
        int i2 = this.m;
        if (i2 == 1) {
            g();
        } else if (i2 == 2) {
            h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("UpgradeAccountActivity.dialogStateKey", this.m);
    }

    public final void b() {
        onBackPressed();
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("content_fragment");
        this.f = findFragmentByTag;
        if (findFragmentByTag instanceof yyz) {
            ((yyz) findFragmentByTag).c();
        }
    }

    public final void b(ConnectionResult connectionResult, UpgradeAccountEntity upgradeAccountEntity) {
        j();
        if (!connectionResult.b() || upgradeAccountEntity == null) {
            b(iaq.e);
        } else if (yze.a((zii) upgradeAccountEntity)) {
            a(iaq.j);
            d();
        } else if (yze.b(upgradeAccountEntity)) {
            a(iaq.e, upgradeAccountEntity.c);
        } else if (yze.d(upgradeAccountEntity) != null) {
            zea d2 = yze.d(upgradeAccountEntity);
            List b = d2.b();
            if (yze.a(d2)) {
                int size = b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zds zds = (zds) b.get(i2);
                    if (zds.c()) {
                        String b2 = zds.b();
                        if ("invalidNameHardFail".equals(b2)) {
                            a(iaq.h);
                        } else if ("invalidNameAppealable".equals(b2)) {
                            a(iaq.g);
                        } else {
                            a(iaq.e);
                        }
                        String b3 = zds.b();
                        b(iar.d, iar.d);
                        boolean c = c();
                        yyv yyv = new yyv();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_setup_wizard_theme", c);
                        bundle.putParcelable("upgrade_account", upgradeAccountEntity);
                        bundle.putString("error_id", b3);
                        yyv.setArguments(bundle);
                        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                        beginTransaction.replace(R.id.content_layout, yyv, "content_fragment");
                        beginTransaction.addToBackStack((String) null);
                        beginTransaction.commit();
                        this.f = yyv;
                        return;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            int size2 = b.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList.add((AccountField.ErrorsEntity) b.get(i3));
            }
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                zds zds2 = (zds) arrayList.get(i4);
                if (zds2.g() && !TextUtils.isEmpty(zds2.f())) {
                    FavaDiagnosticsEntity favaDiagnosticsEntity = iaq.e;
                    boolean c2 = c();
                    yzb yzb = new yzb();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("is_setup_wizard_theme", c2);
                    bundle2.putParcelableArrayList("errors", arrayList);
                    yzb.setArguments(bundle2);
                    a(favaDiagnosticsEntity, yzb);
                    return;
                }
            }
            b(iaq.e);
        } else {
            if (Log.isLoggable("UpgradeAccount", 5)) {
                Log.w("UpgradeAccount", "Unhandled error result");
            }
            b(iaq.e);
        }
    }

    private final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, yzb yzb) {
        a(favaDiagnosticsEntity);
        b(bd(), iar.e);
        a(yzb);
    }

    private final void a(String str, String str2) {
        if (!c()) {
            znf a = znf.a((CharSequence) str);
            this.e = a;
            a.setStyle(1, 2132019132);
        } else {
            irk.a(!TextUtils.isEmpty(str), (Object) "Title text must not be empty");
            irk.a(!TextUtils.isEmpty(str2), (Object) "Body text must not be empty");
            yyt yyt = new yyt();
            Bundle bundle = new Bundle();
            bundle.putString("title_text", str);
            bundle.putString("body_text", str2);
            yyt.setArguments(bundle);
            this.e = yyt;
        }
        this.e.show(getSupportFragmentManager(), "progress_dialog_fragment");
    }

    private final void a(yzb yzb) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentByTag("content_fragment") == null) {
            beginTransaction.add(R.id.content_layout, yzb, "content_fragment");
        } else {
            beginTransaction.replace(R.id.content_layout, yzb, "content_fragment");
        }
        beginTransaction.commitAllowingStateLoss();
        this.f = yzb;
    }

    public final void a() {
        Fragment fragment = this.f;
        if (fragment instanceof yyz) {
            ((yyz) fragment).c();
        }
    }

    public final void a(ConnectionResult connectionResult, UpgradeAccountEntity upgradeAccountEntity) {
        j();
        if (!connectionResult.b() || upgradeAccountEntity == null) {
            b(iaq.e);
        } else if (yze.b(upgradeAccountEntity)) {
            a(iaq.f, upgradeAccountEntity.c);
        } else if (yze.a((zii) upgradeAccountEntity)) {
            Log.w("UpgradeAccount", "Account is already upgraded to G+");
            a(iaq.a);
            d();
        } else {
            Fragment fragment = this.f;
            if (fragment instanceof yyz) {
                ((yyz) fragment).a(upgradeAccountEntity);
            }
        }
    }

    public final void a(UpgradeAccountEntity upgradeAccountEntity) {
        h();
        yzi yzi = (yzi) this.d;
        if (!yzi.h) {
            yzi.h = true;
            yzi.j = upgradeAccountEntity;
            if (yzi.e.l()) {
                yzi.g(Bundle.EMPTY);
            } else if (!yzi.e.m()) {
                yzi.e.t();
            }
        } else {
            throw new IllegalStateException("Upgrade account already in progress");
        }
    }
}
