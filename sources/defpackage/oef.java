package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.Observable;
import java.util.Observer;

/* renamed from: oef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class oef implements Observer {
    private final ChatRequestAndConversationChimeraService a;
    private final okx b;

    public oef(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, okx okx) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = okx;
    }

    public final void update(Observable observable, Object obj) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        chatRequestAndConversationChimeraService.a(chatRequestAndConversationChimeraService.a(this.b));
    }
}
