package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: odn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class odn implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ Context c;
    final /* synthetic */ ods d;

    public odn(ods ods, String str, long j, Context context) {
        this.d = ods;
        this.a = str;
        this.b = j;
        this.c = context;
    }

    public void onClick(View view) {
        ChatRequestAndConversationChimeraService.a(this.a, this.b, this.c, this.d.o.p);
        view.setEnabled(false);
        int a2 = this.d.a(this.b);
        okz okz = (okz) this.d.f.get(a2);
        aucd aucd = (aucd) okz.c(5);
        aucd.a((aucj) okz);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        okz okz2 = (okz) aucd.b;
        okz okz3 = okz.e;
        okz2.a |= 4;
        okz2.d = true;
        this.d.f.set(a2, (okz) aucd.i());
        ods ods = this.d;
        ods.K(ods.g(a2));
        oay.a(view, (int) R.string.gh_sending_message_announcement);
    }
}
