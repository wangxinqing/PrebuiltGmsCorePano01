package defpackage;

import android.content.Intent;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: oeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oeg implements nzc {
    private final ChatRequestAndConversationChimeraService a;
    private final Intent b;

    public oeg(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, Intent intent) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = intent;
    }

    public final void a(nze nze) {
        this.a.a(this.b.getBooleanExtra("EXTRA_IGNORE_CHAT_QUEUE_STATUS", false));
    }
}
