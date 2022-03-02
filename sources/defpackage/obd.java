package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.googlehelp.contact.ContactOptionsContainer;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;

/* renamed from: obd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class obd implements View.OnClickListener {
    private final ContactOptionsContainer a;
    private final avmt b;
    private final int c;

    public obd(ContactOptionsContainer contactOptionsContainer, avmt avmt, int i) {
        this.a = contactOptionsContainer;
        this.b = avmt;
        this.c = i;
    }

    public void onClick(View view) {
        ContactOptionsContainer contactOptionsContainer = this.a;
        avmt avmt = this.b;
        int i = this.c;
        HelpChimeraActivity helpChimeraActivity = contactOptionsContainer.e;
        okg.a((nzu) helpChimeraActivity, 47, avmt, i);
        avmt avmt2 = avmt.UNKNOWN_CONTACT_MODE;
        avmw avmw = avmw.HELP_CONSOLE;
        int ordinal = avmt.ordinal();
        if (ordinal == 1) {
            helpChimeraActivity.C();
        } else if (ordinal == 2) {
            List r = helpChimeraActivity.x.r();
            if (r.size() > 1) {
                List r2 = helpChimeraActivity.x.r();
                oix oix = new oix();
                Bundle bundle = new Bundle();
                bundle.putStringArray("phone_numbers", (String[]) r2.toArray(new String[r2.size()]));
                oix.setArguments(bundle);
                oix.show(helpChimeraActivity.getSupportFragmentManager(), "pick_support_phone_number_dialog");
                return;
            }
            helpChimeraActivity.d((String) r.iterator().next());
        } else if (ordinal == 3) {
            helpChimeraActivity.E();
        } else if (ordinal == 6) {
            helpChimeraActivity.D();
        }
    }
}
