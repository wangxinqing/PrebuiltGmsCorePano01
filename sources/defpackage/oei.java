package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: oei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oei implements nzc {
    private final ChatRequestAndConversationChimeraService a;
    private final olg b;

    public oei(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, olg olg) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = olg;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        chatRequestAndConversationChimeraService.a().execute(new ofl(this.b, nze, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.e, chatRequestAndConversationChimeraService.a(), chatRequestAndConversationChimeraService.f));
    }
}
