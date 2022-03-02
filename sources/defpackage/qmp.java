package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: qmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qmp extends qnh {
    public String a;
    public ArrayList b;
    public iby c;
    private TextView g;
    private View h;
    /* access modifiers changed from: private */
    public boolean i = false;

    private final void a() {
        Resources resources = getResources();
        String str = this.a;
        if (str == null) {
            this.g.setText(resources.getString(R.string.opt_in_account_null_state));
            return;
        }
        this.g.setText(str);
        this.g.setContentDescription(resources.getString(R.string.opt_in_account_content_description, new Object[]{this.a}));
    }

    public final void onActivityCreated(Bundle bundle) {
        int i2;
        super.onActivityCreated(bundle);
        this.b = getArguments().getParcelableArrayList("eligibleAccounts");
        if (bundle != null) {
            this.a = bundle.getString("authAccount");
        } else if (this.a == null) {
            String string = getArguments().getString("defaultAccount");
            this.a = ((Account) this.b.get(0)).name;
            if (!TextUtils.isEmpty(string)) {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    int i4 = i3 + 1;
                    if (TextUtils.equals(((Account) arrayList.get(i3)).name, string)) {
                        this.a = string;
                        break;
                    }
                    i3 = i4;
                }
            }
        }
        this.c = qdy.b(getActivity());
        TextView textView = (TextView) this.h.findViewById(R.id.account_picker);
        this.g = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        this.g.setOnClickListener(new qmi(this));
        a();
        boolean z = getArguments().getBoolean("lastChance", false);
        this.d.a(R.string.opt_in_confirm, new qmj(this));
        if (!z) {
            i2 = R.string.common_not_now;
        } else {
            i2 = R.string.common_no_thanks;
        }
        this.d.b(i2, new qmm(this, z));
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && i3 == -1) {
            this.f.a("OptInFragment.accountChosen");
            this.a = intent.getStringExtra("authAccount");
            a();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        this.h = layoutInflater.inflate(R.layout.setup_opt_in_fragment, viewGroup, false);
        if (Build.VERSION.SDK_INT < 23) {
            i2 = R.string.opt_in_description;
        } else {
            i2 = R.string.opt_in_description_m_plus;
        }
        ((TextView) this.h.findViewById(R.id.description)).setText(i2);
        TextView textView = (TextView) this.h.findViewById(R.id.agreement);
        String a2 = qmc.a("https://play.google.com/about/play-terms.html", getResources().getString(R.string.play_terms_of_service));
        String a3 = qmc.a("https://support.google.com/googleplay/?p=instant_apps", getResources().getString(R.string.common_learn_more));
        textView.setText(Html.fromHtml(getResources().getString(R.string.opt_in_agreement, new Object[]{a2, a3})));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return this.h;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (!this.i) {
            this.f.a("OptInFragment.noSelection");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.i = true;
        String str = this.a;
        if (str != null) {
            bundle.putString("authAccount", str);
        }
    }
}
