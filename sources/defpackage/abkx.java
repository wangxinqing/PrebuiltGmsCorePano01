package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: abkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abkx implements View.OnClickListener {
    private final abkz a;
    private final Intent b;

    public abkx(abkz abkz, Intent intent) {
        this.a = abkz;
        this.b = intent;
    }

    public void onClick(View view) {
        DialogFragment dialogFragment;
        abkz abkz = this.a;
        if (this.b.resolveActivity(abkz.a.getPackageManager()) != null) {
            abkz.b.a(jth.CALENDAR_BUTTON, jth.SMART_PROFILE_HEADER);
            if (abkz.e.size() == 1) {
                abkz.a.startActivity(new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("android.intent.extra.EMAIL", ((Bundle) abkz.e.get(0)).getString("extraValue")));
                return;
            }
            if (azim.b()) {
                dialogFragment = jrz.a((int) R.string.email_address_picker_title, 2, abkz.c, abkz.e);
            } else {
                dialogFragment = abks.a(R.string.email_address_picker_title, R.id.quick_actions_schedule, abkz.c, abkz.e);
            }
            dialogFragment.show(abkz.a.getFragmentManager(), "contactInfoOptionsDialog");
        }
    }
}
