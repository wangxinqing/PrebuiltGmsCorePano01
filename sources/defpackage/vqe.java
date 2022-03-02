package defpackage;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vqe implements View.OnClickListener {
    private final SetupChimeraActivity a;

    public vqe(SetupChimeraActivity setupChimeraActivity) {
        this.a = setupChimeraActivity;
    }

    public void onClick(View view) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        View inflate = View.inflate(setupChimeraActivity, R.layout.sharing_dialog_device_name, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(16908308);
        sr srVar = new sr(setupChimeraActivity);
        srVar.a((int) R.string.sharing_settings_button_device_name);
        srVar.b((int) R.string.common_ok, (DialogInterface.OnClickListener) new vqx(setupChimeraActivity, editText));
        srVar.a((int) R.string.common_cancel, vqf.a);
        srVar.b(inflate);
        ss b = srVar.b();
        editText.setFilters(new InputFilter[]{new arzl(setupChimeraActivity.getResources().getInteger(R.integer.sharing_max_name_length_bytes))});
        editText.setOnEditorActionListener(new vqg(setupChimeraActivity, b, editText));
        editText.addTextChangedListener(new vqy(b, editText));
        b.setOnShowListener(new vqh(setupChimeraActivity, editText, b));
        b.getWindow().setSoftInputMode(36);
        setupChimeraActivity.b.s().a((acvv) new vqi(setupChimeraActivity, editText, b));
    }
}
