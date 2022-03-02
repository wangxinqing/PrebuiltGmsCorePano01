package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: oek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oek implements nzc {
    private final ChatRequestAndConversationChimeraService a;

    public oek(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService) {
        this.a = chatRequestAndConversationChimeraService;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        new ofe(nze, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.e, chatRequestAndConversationChimeraService.f).executeOnExecutor(chatRequestAndConversationChimeraService.a(), new Void[0]);
    }
}
