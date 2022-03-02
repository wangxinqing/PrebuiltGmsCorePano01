package defpackage;

import android.content.Intent;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: oee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oee implements nzc {
    private final ChatRequestAndConversationChimeraService a;

    public oee(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService) {
        this.a = chatRequestAndConversationChimeraService;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        chatRequestAndConversationChimeraService.a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS").putExtra("EXTRA_SHOULD_UPDATE_TIMESTAMPS", true).putExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", odu.d(chatRequestAndConversationChimeraService.g)));
    }
}
