package defpackage;

import android.os.Message;
import com.google.android.gms.R;
import com.google.android.gms.plus.sharebox.ShareBoxChimeraActivity;

/* renamed from: zmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zmb extends qvr {
    final /* synthetic */ ShareBoxChimeraActivity a;

    public zmb(ShareBoxChimeraActivity shareBoxChimeraActivity) {
        this.a = shareBoxChimeraActivity;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1 && ((zla) this.a.getSupportFragmentManager().findFragmentByTag("confirm_action_dialog")) == null) {
            zla a2 = zla.a(this.a.getString(R.string.plus_sharebox_confirm_cancel_dialog_message));
            ShareBoxChimeraActivity shareBoxChimeraActivity = this.a;
            a2.a = shareBoxChimeraActivity;
            a2.show(shareBoxChimeraActivity.getSupportFragmentManager(), "confirm_action_dialog");
        }
    }
}
