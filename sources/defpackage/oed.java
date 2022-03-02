package defpackage;

import android.content.Intent;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: oed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oed implements nzc {
    private final ChatRequestAndConversationChimeraService a;
    private final long b;

    public oed(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, long j) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = j;
    }

    public final void a(nze nze) {
        this.a.a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS").putExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", this.b));
    }
}
