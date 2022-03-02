package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;

/* renamed from: gio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gio extends Fragment implements LoaderManager.LoaderCallbacks, aljq {
    private alhe a;

    /* access modifiers changed from: package-private */
    public final CharSequence a(int i, CharSequence... charSequenceArr) {
        return TextUtils.expandTemplate(getResources().getTextArray(i)[getArguments().getInt("variant_index")], charSequenceArr);
    }

    public final void aL() {
        gin gin = (gin) getActivity();
        if (gin != null) {
            gin.a();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getLoaderManager().initLoader(0, (Bundle) null, this);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new git(getActivity(), getArguments().getString("package_icon_url"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CharSequence charSequence;
        String str;
        ijo a2 = ijo.a(getActivity(), !ijm.a(getArguments().getString("theme")) ? R.layout.auth_device_management_download : R.layout.auth_device_management_download_glif);
        ijm.a(a2.a());
        a2.c(true);
        alhs.a(getActivity().getWindow(), true);
        a2.b(true);
        getActivity().setTitle((CharSequence) getArguments().getString("account_name"));
        a2.a(getActivity().getTitle());
        if (a2.a() instanceof SetupWizardLayout) {
            NavigationBar c = ((SetupWizardLayout) a2.a()).c();
            c.a((aljq) this);
            c.b.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.a = (alhe) ((GlifLayout) a2.a().findViewById(R.id.setup_wizard_layout)).a(alhe.class);
            int i = getArguments().getInt("package_install_state");
            if (i == 1) {
                str = getString(R.string.common_install);
            } else if (i != 2) {
                str = getString(R.string.common_next);
            } else {
                str = getString(R.string.common_update);
            }
            alhf alhf = new alhf(getActivity());
            alhf.b = new gil(this);
            alhf.c = 5;
            alhf.d = 2132018060;
            alhg a3 = alhf.a();
            this.a.a(a3);
            a3.a((CharSequence) str);
            alhf alhf2 = new alhf(getActivity());
            alhf2.a(R.string.common_skip);
            alhf2.b = new gim(this);
            alhf2.c = 7;
            alhf2.d = 2132018061;
            this.a.b(alhf2.a());
        }
        ((TextView) a2.a().findViewById(R.id.auth_device_management_download_app_name)).setText(getArguments().getString("package_display_name"));
        TextView textView = (TextView) a2.a().findViewById(R.id.auth_device_management_download_description);
        int i2 = getArguments().getInt("package_install_state");
        if (i2 == 1) {
            charSequence = a(R.array.auth_device_management_download_description, getArguments().getString("package_display_name"));
        } else if (i2 != 2) {
            charSequence = a(R.array.auth_device_management_start_description, getArguments().getString("package_display_name"));
        } else {
            charSequence = a(R.array.auth_device_management_update_description, getArguments().getString("package_display_name"));
        }
        textView.setText(charSequence);
        return a2.a();
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) getActivity().findViewById(R.id.auth_device_management_download_app_icon);
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void a() {
        gin gin = (gin) getActivity();
        if (gin != null) {
            gin.b();
        }
    }
}
