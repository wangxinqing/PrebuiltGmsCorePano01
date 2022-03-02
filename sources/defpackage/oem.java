package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: oem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oem implements nzc {
    private final ChatRequestAndConversationChimeraService a;
    private final String b;

    public oem(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, String str) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = str;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        odu.a(chatRequestAndConversationChimeraService.e, chatRequestAndConversationChimeraService.g, Long.valueOf(this.b));
    }
}
