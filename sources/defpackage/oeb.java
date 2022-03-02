package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: oeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oeb implements nzc {
    private final ChatRequestAndConversationChimeraService a;
    private final long b;

    public oeb(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, long j) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = j;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        odu.b(odu.d(chatRequestAndConversationChimeraService.g) + this.b, chatRequestAndConversationChimeraService.g);
    }
}
