package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: odz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class odz implements nzc {
    private final ChatRequestAndConversationChimeraService a;
    private final okr b;

    public odz(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, okr okr) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = okr;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        okr okr = this.b;
        okn okn = okr.a;
        if (okn == null) {
            okn = okn.a;
        }
        odu.a(okn, okr.b, okr.c, nze);
        if (ofq.b(axqn.b())) {
            chatRequestAndConversationChimeraService.s = true;
            nzx nzx = chatRequestAndConversationChimeraService.r;
            if (nzx != null) {
                nzx.a();
                chatRequestAndConversationChimeraService.r = null;
            }
        }
    }
}
