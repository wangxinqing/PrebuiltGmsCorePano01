package defpackage;

import android.content.Intent;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.List;

/* renamed from: ody  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ody implements nzc {
    private final ChatRequestAndConversationChimeraService a;
    private final List b;

    public ody(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, List list) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = list;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        odu.a(this.b, nze);
        if (!chatRequestAndConversationChimeraService.i) {
            chatRequestAndConversationChimeraService.a(nze, true);
        } else {
            chatRequestAndConversationChimeraService.a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT"));
        }
    }
}
