package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: oej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oej implements nzc {
    private final ChatRequestAndConversationChimeraService a;
    private final String b;
    private final long c;

    public oej(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, String str, long j) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = str;
        this.c = j;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        new ofg(this.b, this.c, nze, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.e, chatRequestAndConversationChimeraService.f).executeOnExecutor(chatRequestAndConversationChimeraService.a(), new Void[0]);
    }
}
