package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: abkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abkw implements View.OnClickListener {
    private final abkz a;
    private final Intent b;

    public abkw(abkz abkz, Intent intent) {
        this.a = abkz;
        this.b = intent;
    }

    public void onClick(View view) {
        DialogFragment dialogFragment;
        abkz abkz = this.a;
        if (this.b.resolveActivity(abkz.a.getPackageManager()) != null) {
            abkz.b.a(jth.EMAIL_BUTTON, jth.SMART_PROFILE_HEADER);
            if (abkz.e.size() == 1) {
                abkz.a.startActivity(abfz.a(((Bundle) abkz.e.get(0)).getString("extraValue"), abkz.c));
                return;
            }
            if (azim.b()) {
                dialogFragment = jrz.a((int) R.string.email_address_picker_title, 1, abkz.c, abkz.e);
            } else {
                dialogFragment = abks.a(R.string.email_address_picker_title, R.id.quick_actions_email, abkz.c, abkz.e);
            }
            dialogFragment.show(abkz.a.getFragmentManager(), "contactInfoOptionsDialog");
        }
    }
}
