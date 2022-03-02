package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yzb extends Fragment implements View.OnClickListener {
    protected yxv a;
    private yza b;

    public static yzb a(boolean z, String str, String str2, String str3) {
        yzb yzb = new yzb();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_setup_wizard_theme", z);
        bundle.putString("title", str);
        bundle.putString("text", str2);
        bundle.putString("button_text", str3);
        yzb.setArguments(bundle);
        return yzb;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof yza)) {
            String valueOf = String.valueOf(yza.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        this.b = (yza) activity;
        if (!(activity instanceof yxv)) {
            String valueOf2 = String.valueOf(yxv.class.getSimpleName());
            throw new IllegalStateException(valueOf2.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf2));
        } else {
            this.a = (yxv) activity;
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.back_button) {
            this.b.f();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        boolean z = getArguments().getBoolean("is_setup_wizard_theme");
        View inflate = layoutInflater.inflate(R.layout.plus_oob_upgrade_account_info_fragment, viewGroup, false);
        yzd.a(layoutInflater, inflate, z);
        String string = getArguments().getString("title");
        if (TextUtils.isEmpty(string)) {
            string = getResources().getString(R.string.plus_unified_setup_activity_title);
        }
        ((TextView) inflate.findViewById(R.id.title)).setText(Html.fromHtml(string));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.text_layout);
        ArrayList arrayList = new ArrayList();
        UpgradeAccountEntity.DescriptionEntity descriptionEntity = (UpgradeAccountEntity.DescriptionEntity) getArguments().getParcelable("description");
        if (descriptionEntity != null) {
            arrayList.add(yze.a(this.a, descriptionEntity.e, descriptionEntity.c, (List) null, (List) null, descriptionEntity.d));
        }
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("errors");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AccountField.ErrorsEntity errorsEntity = (AccountField.ErrorsEntity) parcelableArrayList.get(i2);
                arrayList.add(yze.a(this.a, errorsEntity.e, errorsEntity.c, errorsEntity.d));
            }
        }
        String string2 = getArguments().getString("text");
        if (!TextUtils.isEmpty(string2)) {
            arrayList.add(Html.fromHtml(string2));
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (!z) {
                i = R.layout.plus_oob_upgrade_account_info_view;
            } else {
                i = R.layout.plus_oob_upgrade_account_info_view_setup_wizard;
            }
            TextView textView = (TextView) ((LinearLayout) layoutInflater.inflate(i, linearLayout, true)).getChildAt(i3);
            textView.setText((CharSequence) arrayList.get(i3));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Button button = (Button) inflate.findViewById(R.id.back_button);
        button.setOnClickListener(this);
        String string3 = getArguments().getString("button_text");
        if (!TextUtils.isEmpty(string3)) {
            button.setText(string3);
        } else {
            button.setText(R.string.plus_oob_done_button_label);
        }
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.b = null;
    }
}
