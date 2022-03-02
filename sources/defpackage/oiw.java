package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oiw implements DialogInterface.OnClickListener {
    final /* synthetic */ HelpChimeraActivity a;
    final /* synthetic */ oix b;

    public oiw(oix oix, HelpChimeraActivity helpChimeraActivity) {
        this.b = oix;
        this.a = helpChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.a.d(this.b.a[i]);
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(this.a.toString()).concat(" must implement PickSupportPhoneNumberListener"));
        }
    }
}
