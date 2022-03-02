package defpackage;

import android.view.View;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: odc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class odc implements View.OnLayoutChangeListener {
    private final ChatConversationChimeraActivity a;

    public odc(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.a = chatConversationChimeraActivity;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.a;
        int i9 = i4 - i2;
        if (i9 != i8 - i6) {
            chatConversationChimeraActivity.a(i9);
        }
    }
}
