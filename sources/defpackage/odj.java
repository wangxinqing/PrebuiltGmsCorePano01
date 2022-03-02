package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: odj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class odj extends acy {
    final /* synthetic */ abk a;
    final /* synthetic */ int b;
    final /* synthetic */ AppBarLayout c;
    final /* synthetic */ ChatConversationChimeraActivity d;

    public odj(ChatConversationChimeraActivity chatConversationChimeraActivity, abk abk, int i, AppBarLayout appBarLayout) {
        this.d = chatConversationChimeraActivity;
        this.a = abk;
        this.b = i;
        this.c = appBarLayout;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.a.m() == 0 && this.a.b(0).getTop() == this.b) {
            this.c.b(false);
            this.d.findViewById(R.id.gh_chat_activity_section_divider).setVisibility(0);
            return;
        }
        this.c.b(true);
        this.d.findViewById(R.id.gh_chat_activity_section_divider).setVisibility(4);
    }
}
