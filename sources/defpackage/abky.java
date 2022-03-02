package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: abky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abky implements View.OnClickListener {
    private final abkz a;
    private final Intent b;

    public abky(abkz abkz, Intent intent) {
        this.a = abkz;
        this.b = intent;
    }

    public void onClick(View view) {
        DialogFragment dialogFragment;
        abkz abkz = this.a;
        if (this.b.resolveActivity(abkz.a.getPackageManager()) != null) {
            abkz.b.a(jth.CALL_BUTTON, jth.SMART_PROFILE_HEADER);
            if (abkz.f.size() == 1) {
                abkz.a.startActivity(abfz.a(((Bundle) abkz.f.get(0)).getString("extraValue")));
                return;
            }
            if (azim.b()) {
                dialogFragment = jrz.a((int) R.string.phone_number_picker_title, 0, abkz.c, abkz.f);
            } else {
                dialogFragment = abks.a(R.string.phone_number_picker_title, R.id.quick_actions_call, abkz.c, abkz.f);
            }
            dialogFragment.show(abkz.a.getFragmentManager(), "contactInfoOptionsDialog");
        }
    }
}
