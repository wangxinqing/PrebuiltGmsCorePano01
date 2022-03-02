package com.google.android.gms.googlehelp.contact.chat;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChatConversationTranscriptLayoutAdapter$1$1 extends URLSpan {
    final /* synthetic */ odk a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatConversationTranscriptLayoutAdapter$1$1(odk odk, String str) {
        super(str);
        this.a = odk;
    }

    public void onClick(View view) {
        okg.b((nzu) this.a.d.o, 75, avmt.CHAT);
        super.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
    }
}
