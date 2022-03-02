package defpackage;

import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import java.util.Observable;
import java.util.Observer;

/* renamed from: oda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oda implements Observer {
    private final ChatConversationChimeraActivity a;
    private final nzc b;

    public oda(ChatConversationChimeraActivity chatConversationChimeraActivity, nzc nzc) {
        this.a = chatConversationChimeraActivity;
        this.b = nzc;
    }

    public final void update(Observable observable, Object obj) {
        this.b.a(this.a.s);
    }
}
