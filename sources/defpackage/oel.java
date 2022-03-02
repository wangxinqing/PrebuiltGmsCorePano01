package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.List;

/* renamed from: oel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oel implements nzc {
    private final ChatRequestAndConversationChimeraService a;

    public oel(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService) {
        this.a = chatRequestAndConversationChimeraService;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        List b = odu.b(nze);
        if (!b.isEmpty()) {
            oko oko = (oko) b.get(b.size() - 1);
            if (oko.d == odu.e(nze) && oko.b == 6) {
                chatRequestAndConversationChimeraService.h = false;
                chatRequestAndConversationChimeraService.stopSelf();
            }
        }
    }
}
