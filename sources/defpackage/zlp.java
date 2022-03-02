package defpackage;

import android.os.Message;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.plus.sharebox.ReplyBoxChimeraActivity;

/* renamed from: zlp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zlp extends qvr {
    final /* synthetic */ ReplyBoxChimeraActivity a;

    public zlp(ReplyBoxChimeraActivity replyBoxChimeraActivity) {
        this.a = replyBoxChimeraActivity;
    }

    public final void handleMessage(Message message) {
        zla zla;
        if (message.what == 1) {
            ReplyBoxChimeraActivity replyBoxChimeraActivity = this.a;
            Fragment findFragmentByTag = replyBoxChimeraActivity.getSupportFragmentManager().findFragmentByTag("confirm_action_dialog");
            if (findFragmentByTag == null) {
                zla = zla.a(replyBoxChimeraActivity.getString(R.string.plus_replybox_confirm_cancel_dialog_message));
            } else {
                zla = (zla) findFragmentByTag;
            }
            ReplyBoxChimeraActivity replyBoxChimeraActivity2 = this.a;
            zla.a = replyBoxChimeraActivity2;
            zla.show(replyBoxChimeraActivity2.getSupportFragmentManager(), "confirm_action_dialog");
        }
    }
}
