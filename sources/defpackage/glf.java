package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;

/* renamed from: glf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class glf extends gnb implements LoaderManager.LoaderCallbacks {
    public static final fzk a = fzk.a("frp_dialog_shown");
    private static final fzk d = fzk.a("show_frp_dialog");
    private static final fzk e = fzk.a("resolve_frp_only");
    private static final fzk f = fzk.a("account_type");
    private static final fzk g = fzk.a("auth_code");
    private static final fzk h = fzk.a("obfuscated_gaia_id");
    private static final fzk i = fzk.a("account_name");
    private static final fzk j = fzk.a("terms_of_service_accepted");
    private static final fzk k = fzk.a("check_offers");
    private static final fzk l = fzk.a("fixed_window_size");
    private static final fzk m = fzk.a("was_frp_unlocked");
    public glg b;
    AlertDialog c;
    private gle n;

    public static void a(FragmentActivity fragmentActivity, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5) {
        if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("AddAccountFragment") == null) {
            fzl fzl = new fzl();
            fzl.b(d, Boolean.valueOf(z));
            fzl.b(e, Boolean.valueOf(z2));
            fzl.b(f, str);
            fzl.b(g, str2);
            fzl.b(h, str3);
            fzl.b(i, str4);
            fzl.b(j, Boolean.valueOf(z3));
            fzl.b(k, Boolean.valueOf(z4));
            fzl.b(l, Boolean.valueOf(z5));
            glf glf = new glf();
            glf.setArguments(fzl.a);
            fragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment) glf, "AddAccountFragment").commit();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.n = (gle) activity;
    }

    public final Loader onCreateLoader(int i2, Bundle bundle) {
        Context applicationContext = getActivity().getApplicationContext();
        boolean booleanValue = ((Boolean) b().a(j, false)).booleanValue();
        boolean booleanValue2 = ((Boolean) b().a(k, false)).booleanValue();
        boolean booleanValue3 = ((Boolean) b().a(l, false)).booleanValue();
        return new glg(applicationContext, new gck(applicationContext), (String) b().a(f), (String) b().a(g), (String) b().a(h), (String) b().a(i), booleanValue, booleanValue2, booleanValue3);
    }

    public final void onDestroyView() {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        super.onDestroyView();
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        gli gli = (gli) obj;
        int i2 = gli.a;
        if (i2 == 0) {
            this.n.a(gli.b, gli.d, gli.e, gli.c, ((Boolean) b().a(m, false)).booleanValue(), gli.f);
        } else if (i2 == 2) {
            this.n.a(gli.g);
        } else if (i2 == 3) {
            b().b(m, true);
            if (((Boolean) b().a(e, false)).booleanValue()) {
                a();
            } else if (!((Boolean) b().a(d, false)).booleanValue()) {
                this.b.a();
            } else if (this.c == null && !((Boolean) b().a(a, false)).booleanValue()) {
                AlertDialog create = new AlertDialog.Builder(getActivity()).setMessage(TextUtils.expandTemplate(getText(R.string.auth_frp_add_account_prompt), new CharSequence[]{(CharSequence) b().a(i)})).setPositiveButton(R.string.auth_frp_add_account_yes, new gld(this)).setNegativeButton(R.string.auth_frp_add_account_no, new glc(this)).create();
                this.c = create;
                create.setCancelable(false);
                this.c.setCanceledOnTouchOutside(false);
                this.c.show();
            }
        } else {
            this.n.e();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onResume() {
        super.onResume();
        this.b = (glg) getLoaderManager().initLoader(0, (Bundle) null, this);
    }

    public final void a() {
        this.n.c();
        b().b(a, true);
    }
}
