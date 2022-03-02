package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: odw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class odw implements nzc {
    private final ChatRequestAndConversationChimeraService a;

    public odw(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService) {
        this.a = chatRequestAndConversationChimeraService;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        if (chatRequestAndConversationChimeraService.m == null) {
            chatRequestAndConversationChimeraService.m = new oeq(chatRequestAndConversationChimeraService.e, chatRequestAndConversationChimeraService);
        }
        chatRequestAndConversationChimeraService.m.run();
    }
}
