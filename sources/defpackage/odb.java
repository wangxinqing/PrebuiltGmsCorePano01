package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: odb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class odb implements View.OnClickListener {
    private final ChatConversationChimeraActivity a;

    public odb(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.a = chatConversationChimeraActivity;
    }

    public void onClick(View view) {
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.a;
        chatConversationChimeraActivity.e();
        ChatRequestAndConversationChimeraService.a((Context) chatConversationChimeraActivity, chatConversationChimeraActivity.p);
        ChatRequestAndConversationChimeraService.a(true, (Context) chatConversationChimeraActivity, chatConversationChimeraActivity.p);
    }
}
