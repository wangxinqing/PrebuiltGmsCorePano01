package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.auth.api.credentials.yolo.ui.AccountChipView;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;

/* renamed from: fqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fqu implements aora {
    final /* synthetic */ CredentialPickerChimeraActivity a;

    public fqu(CredentialPickerChimeraActivity credentialPickerChimeraActivity) {
        this.a = credentialPickerChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TextView textView;
        amzy amzy = (amzy) obj;
        if (amzy.isEmpty()) {
            this.a.a(1002, 102);
            return;
        }
        CredentialPickerChimeraActivity credentialPickerChimeraActivity = this.a;
        credentialPickerChimeraActivity.e = amri.b(amzy);
        credentialPickerChimeraActivity.f.clear();
        credentialPickerChimeraActivity.f.addAll(amzy.a(anbs.a((Iterable) amzy, fqr.a)));
        credentialPickerChimeraActivity.f.notifyDataSetChanged();
        if (credentialPickerChimeraActivity.c.a()) {
            textView = (TextView) credentialPickerChimeraActivity.findViewById(R.id.credentials_picker_title);
            String a2 = fbx.a(credentialPickerChimeraActivity, fbx.a(credentialPickerChimeraActivity.a));
            textView.setText(String.format(credentialPickerChimeraActivity.getResources().getString(R.string.credentials_picker_title), new Object[]{a2}));
        } else {
            textView = (TextView) credentialPickerChimeraActivity.findViewById(R.id.credentials_hint_picker_title);
        }
        textView.setVisibility(0);
        AccountChipView accountChipView = (AccountChipView) credentialPickerChimeraActivity.findViewById(R.id.add_account);
        if (credentialPickerChimeraActivity.f().b) {
            fqf fqf = new fqf();
            fqf.a(R.drawable.ic_add_circle_grey600_40dp, true);
            fqf.d = credentialPickerChimeraActivity.getString(R.string.common_add_account);
            accountChipView.a(fqf.a());
            accountChipView.setOnClickListener(credentialPickerChimeraActivity);
            accountChipView.setVisibility(0);
        } else {
            accountChipView.setVisibility(8);
        }
        View findViewById = credentialPickerChimeraActivity.findViewById(R.id.cancel);
        View findViewById2 = credentialPickerChimeraActivity.findViewById(R.id.button_area);
        if (credentialPickerChimeraActivity.f().c) {
            findViewById2.setVisibility(0);
            findViewById.setOnClickListener(credentialPickerChimeraActivity);
        } else {
            findViewById2.setVisibility(8);
        }
        if (credentialPickerChimeraActivity.d.a()) {
            credentialPickerChimeraActivity.a((InternalCredentialWrapper) credentialPickerChimeraActivity.d.b());
            return;
        }
        credentialPickerChimeraActivity.g.setEnabled(true);
        credentialPickerChimeraActivity.h.stop();
        credentialPickerChimeraActivity.findViewById(R.id.progress_indicator_container).setVisibility(8);
    }

    public final void a(Throwable th) {
        this.a.a(0, 2);
    }
}
