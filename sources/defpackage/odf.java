package defpackage;

import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: odf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class odf implements View.OnClickListener {
    final /* synthetic */ ChatConversationChimeraActivity a;

    public odf(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.a = chatConversationChimeraActivity;
    }

    public void onClick(View view) {
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.a;
        String trim = chatConversationChimeraActivity.f.getText().toString().trim();
        long currentTimeMillis = System.currentTimeMillis();
        ChatRequestAndConversationChimeraService.a(trim, currentTimeMillis, chatConversationChimeraActivity, chatConversationChimeraActivity.p);
        chatConversationChimeraActivity.c(51);
        chatConversationChimeraActivity.f.getText().clear();
        ods ods = chatConversationChimeraActivity.i;
        aucd o = oky.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oky oky = (oky) o.b;
        trim.getClass();
        oky.a |= 2;
        oky.c = trim;
        oky oky2 = (oky) o.i();
        aucd o2 = okz.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        okz okz = (okz) o2.b;
        oky2.getClass();
        okz.b = oky2;
        okz.a |= 1;
        aufd a2 = aufd.a(currentTimeMillis);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        okz okz2 = (okz) o2.b;
        a2.getClass();
        okz2.c = a2;
        int i = okz2.a | 2;
        okz2.a = i;
        okz2.a = i | 4;
        okz2.d = true;
        ods.f.add((okz) o2.i());
        ods.k++;
        ods.L((ods.d() + ods.c()) - 1);
        axnx.c();
        chatConversationChimeraActivity.q();
        chatConversationChimeraActivity.b((int) R.string.gh_sending_message_announcement);
    }
}
