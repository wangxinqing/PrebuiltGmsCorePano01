package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: odm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class odm implements View.OnClickListener {
    final /* synthetic */ long a;
    final /* synthetic */ ods b;

    public odm(ods ods, long j) {
        this.b = ods;
        this.a = j;
    }

    public void onClick(View view) {
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.b.o;
        long j = this.a;
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_MESSAGE_CLIENT_TIME", j);
        ohu a2 = ohw.a();
        a2.b = R.string.gh_chat_delete_message_confirmation_text;
        a2.c = R.string.common_ui_confirm_deleting_button;
        a2.d = R.string.common_cancel;
        a2.e = bundle;
        a2.a().show(chatConversationChimeraActivity.getSupportFragmentManager(), "delete_message_dialog");
    }
}
