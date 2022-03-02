package defpackage;

import android.os.SystemClock;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: odd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class odd implements Runnable {
    final /* synthetic */ ChatConversationChimeraActivity a;

    public odd(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.a = chatConversationChimeraActivity;
    }

    public final void run() {
        long g = ((long) ((int) axmj.g())) - (SystemClock.uptimeMillis() - this.a.w);
        if (g <= 0) {
            ChatConversationChimeraActivity chatConversationChimeraActivity = this.a;
            chatConversationChimeraActivity.v = chatConversationChimeraActivity.B() ? olg.NO_TEXT_ENTERED : olg.TEXT_ENTERED;
            this.a.p();
            return;
        }
        ChatConversationChimeraActivity chatConversationChimeraActivity2 = this.a;
        chatConversationChimeraActivity2.x.postDelayed(chatConversationChimeraActivity2.y, g);
    }
}
