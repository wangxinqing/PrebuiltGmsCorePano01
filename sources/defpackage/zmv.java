package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.plus.model.posts.PlusPage;

/* renamed from: zmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zmv extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    protected String[] a;
    protected int b;
    private zmu c;
    private zmt d;
    private Spinner e;
    private Button f;
    private TextView g;
    private View h;
    private View i;
    private View j;
    private int k = 0;

    private final void a() {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        CharSequence charSequence;
        boolean z3;
        String str;
        int i4;
        zms j2 = this.c.j();
        boolean a2 = zmf.a(getActivity(), j2.f);
        int i5 = this.k;
        if (i5 == 0) {
            charSequence = null;
            i3 = 0;
            i2 = 4;
            z2 = false;
            z = false;
        } else if (i5 == 2) {
            charSequence = getText(R.string.plus_sharebox_next);
            i3 = !jjy.a() ? R.drawable.plus_iconic_ic_next_black_32 : R.drawable.plus_iconic_ic_previous_black_32;
            i2 = 0;
            z2 = false;
            z = true;
        } else if (i5 != 3) {
            if (TextUtils.isEmpty(j2.e)) {
                charSequence = getText(R.string.plus_sharebox_share);
            } else {
                charSequence = j2.e;
            }
            i3 = R.drawable.plus_iconic_ic_send_32;
            i2 = 0;
            z2 = false;
            z = false;
        } else {
            charSequence = null;
            i3 = 0;
            i2 = 4;
            z2 = true;
            z = true;
        }
        this.f.setVisibility(i2);
        this.f.setText(charSequence);
        if (jjy.a()) {
            this.f.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3, 0);
        } else {
            this.f.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
        }
        if (!z2) {
            this.h.setClickable(false);
            this.i.setVisibility(4);
        } else {
            this.h.setOnClickListener(this);
            this.i.setVisibility(0);
        }
        if (z && a2) {
            str = getString(R.string.plus_sharebox_audience_selection_activity_title);
            z3 = false;
        } else {
            z3 = !j2.c();
            if (TextUtils.isEmpty(j2.c)) {
                str = getString(R.string.plus_app_label);
            } else {
                str = j2.c;
            }
        }
        Spinner spinner = this.e;
        if (!z3) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        spinner.setVisibility(i4);
        this.g.setText(str);
        String[] strArr = this.a;
        if (strArr == null || strArr.length == 1 || !z3) {
            this.j.setClickable(false);
            this.j.setBackgroundDrawable((Drawable) null);
            return;
        }
        this.j.setOnClickListener(this);
        this.j.setBackgroundResource(R.drawable.common_settings_spinner_bg);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof zmu)) {
            String valueOf = String.valueOf(zmu.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.c = (zmu) activity;
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.share_button) {
            int i2 = this.k;
            if (i2 == 2) {
                this.c.r();
            } else if (i2 != 3) {
                a(false);
                this.c.q();
            } else {
                this.c.s();
            }
        } else if (view.getId() == R.id.up_button) {
            this.c.s();
        }
        if (view.getId() == R.id.title_container) {
            this.e.performClick();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getStringArray("account_names");
            this.b = bundle.getInt("selected_position", 0);
            this.k = bundle.getInt("button_action", 0);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.plus_sharebox_title_fragment, viewGroup, false);
        this.e = (Spinner) inflate.findViewById(R.id.account_spinner);
        this.g = (TextView) inflate.findViewById(R.id.title_text);
        this.j = inflate.findViewById(R.id.title_container);
        this.h = inflate.findViewById(R.id.up_button);
        this.i = inflate.findViewById(R.id.up_button_icon);
        Button button = (Button) inflate.findViewById(R.id.share_button);
        this.f = button;
        button.setOnClickListener(this);
        Button button2 = this.f;
        if (bundle == null || !bundle.getBoolean("button_enabled")) {
            z = false;
        } else {
            z = true;
        }
        button2.setEnabled(z);
        if (this.c.j().d > 0) {
            try {
                Resources resourcesForApplication = getActivity().getPackageManager().getResourcesForApplication(this.c.getCallingPackage());
                if (resourcesForApplication != null) {
                    ((ImageView) inflate.findViewById(R.id.titlebar_icon_layout)).setImageDrawable(resourcesForApplication.getDrawable(this.c.j().d));
                }
            } catch (Resources.NotFoundException e2) {
                Log.e("ShareBox", "Unable to override the app icon.", e2);
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("ShareBox", "Unable to override the app icon.", e3);
            }
        }
        if (this.c.j().c()) {
            PlusPage plusPage = this.c.j().b;
            if (!TextUtils.isEmpty(plusPage.c)) {
                TextView textView = (TextView) inflate.findViewById(R.id.plus_page_name);
                textView.setText(plusPage.c);
                textView.setVisibility(0);
            }
        }
        a();
        return inflate;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        if (this.b != i2) {
            this.b = i2;
            this.c.b((String) this.d.getItem(i2));
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArray("account_names", this.a);
        bundle.putInt("selected_position", this.b);
        bundle.putInt("button_action", this.k);
        bundle.putBoolean("button_enabled", this.f.isEnabled());
    }

    public final void onStart() {
        int i2;
        super.onStart();
        String[] strArr = this.a;
        if (strArr != null && (i2 = this.b) >= 0) {
            a(strArr, i2);
        } else if (this.c.g().a()) {
            a(this.c.g().i, this.c.g().k);
        }
    }

    public final void a(int i2) {
        this.k = i2;
        a();
    }

    public final void a(boolean z) {
        this.f.setVisibility(!z ? 4 : 0);
        this.f.setEnabled(z);
    }

    public final void a(String[] strArr, int i2) {
        this.a = strArr;
        this.b = i2;
        zmt zmt = new zmt(getActivity(), this.a);
        this.d = zmt;
        this.e.setAdapter(zmt);
        if (!this.c.j().c()) {
            this.e.setSelection(this.b);
            this.e.setOnItemSelectedListener(this);
        }
        a();
    }
}
