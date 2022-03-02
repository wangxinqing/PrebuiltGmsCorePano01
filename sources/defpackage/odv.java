package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: odv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class odv implements nzc {
    private final ChatRequestAndConversationChimeraService a;

    public odv(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService) {
        this.a = chatRequestAndConversationChimeraService;
    }

    public final void a(nze nze) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        if (chatRequestAndConversationChimeraService.e == null) {
            return;
        }
        if (ofq.a(axmx.b())) {
            chatRequestAndConversationChimeraService.a().execute(new ofc(nze, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.e, chatRequestAndConversationChimeraService.f));
            return;
        }
        Context applicationContext = chatRequestAndConversationChimeraService.getApplicationContext();
        HelpConfig helpConfig = chatRequestAndConversationChimeraService.e;
        okc okc = chatRequestAndConversationChimeraService.f;
        old a2 = ofj.a(nze, helpConfig);
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
        new ofi((old) aucd.i(), applicationContext, helpConfig, okc).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
