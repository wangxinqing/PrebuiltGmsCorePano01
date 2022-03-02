package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: ofc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofc implements Runnable {
    private final nze a;
    private final Context b;
    private final HelpConfig c;
    private final aoru d;
    private final okc e;

    public ofc(nze nze, ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, HelpConfig helpConfig, okc okc) {
        this.a = nze;
        this.b = chatRequestAndConversationChimeraService.getApplicationContext();
        this.c = helpConfig;
        this.d = chatRequestAndConversationChimeraService.a();
        this.e = okc;
    }

    public final void run() {
        if (jkf.a(this.b)) {
            nze nze = this.a;
            Context context = this.b;
            HelpConfig helpConfig = this.c;
            aoru aoru = this.d;
            okc okc = this.e;
            old a2 = ofh.a(nze, helpConfig);
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            okt okt = okt.a;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            old old = (old) aucd.b;
            old old2 = old.g;
            okt.getClass();
            old.c = okt;
            old.b = 5;
            ofh.a((old) aucd.i(), 50, context, helpConfig, aoru, okc);
        }
    }
}
