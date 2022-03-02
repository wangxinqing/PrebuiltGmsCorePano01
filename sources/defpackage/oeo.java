package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.Observable;
import java.util.Observer;

/* renamed from: oeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oeo implements Observer {
    private final ChatRequestAndConversationChimeraService a;
    private final nzc b;

    public oeo(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, nzc nzc) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = nzc;
    }

    public final void update(Observable observable, Object obj) {
        this.b.a(this.a.g);
    }
}
