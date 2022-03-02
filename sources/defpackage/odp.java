package defpackage;

import android.view.View;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: odp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class odp implements View.OnClickListener {
    final /* synthetic */ oab a;
    final /* synthetic */ ods b;

    public odp(ods ods, oab oab) {
        this.b = ods;
        this.a = oab;
    }

    public void onClick(View view) {
        okg.a((nzu) this.b.o, 161, this.a.e);
        oho oho = new oho();
        oab oab = this.a;
        oho.a = oab.d;
        if (oab.s()) {
            oho.b = this.a.r();
        }
        oab oab2 = this.a;
        oho.c = oab2.e;
        oho.d = oab2.v();
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.b.o;
        oho.g = chatConversationChimeraActivity.p;
        oho.show(chatConversationChimeraActivity.getSupportFragmentManager(), "setting_action_dialog");
    }
}
