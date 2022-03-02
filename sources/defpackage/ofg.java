package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: ofg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofg extends nzj {
    private final String e;
    private final long f;
    private final nze g;
    private final ChatRequestAndConversationChimeraService h;
    private final HelpConfig i;
    private final okc j;

    public ofg(String str, long j2, nze nze, ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, HelpConfig helpConfig, okc okc) {
        super(chatRequestAndConversationChimeraService);
        this.e = str;
        this.f = j2;
        this.g = nze;
        this.h = chatRequestAndConversationChimeraService;
        this.i = helpConfig;
        this.j = okc;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        olb olb = (olb) obj;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.h;
        long j2 = this.f;
        if (olb != null) {
            aucx aucx = olb.a;
            if (aucx.isEmpty()) {
                Log.w("gH_ChatReq&ConvoSvc", "The conversationEvents was empty.");
            } else {
                chatRequestAndConversationChimeraService.a((nzc) new ody(chatRequestAndConversationChimeraService, aucx));
            }
        } else {
            chatRequestAndConversationChimeraService.a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.MESSAGE_NOT_SENT").putExtra("EXTRA_MESSAGE_CLIENT_TIME", j2));
            if (!chatRequestAndConversationChimeraService.i) {
                chatRequestAndConversationChimeraService.l = true;
                chatRequestAndConversationChimeraService.a((nzc) new odx(chatRequestAndConversationChimeraService));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ole ole;
        Void[] voidArr = (Void[]) objArr;
        if (!jkf.a(this.h)) {
            return null;
        }
        if (ofq.a(axmx.b())) {
            String str = this.e;
            long j2 = this.f;
            nze nze = this.g;
            Context applicationContext = this.h.getApplicationContext();
            HelpConfig helpConfig = this.i;
            aoru a = this.h.a();
            okc okc = this.j;
            int i2 = ofh.a;
            aucd o = ola.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ola ola = (ola) o.b;
            str.getClass();
            ola.a |= 1;
            ola.b = str;
            ola ola2 = (ola) o.i();
            old a2 = ofh.a(nze, helpConfig);
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            old old = (old) aucd.b;
            old old2 = old.g;
            ola2.getClass();
            old.c = ola2;
            old.b = 3;
            aufd a3 = aufd.a(j2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            old old3 = (old) aucd.b;
            a3.getClass();
            old3.f = a3;
            old3.a |= 64;
            ole = ofh.a((old) aucd.i(), 51, applicationContext, helpConfig, a, okc);
        } else {
            String str2 = this.e;
            long j3 = this.f;
            nze nze2 = this.g;
            ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.h;
            HelpConfig helpConfig2 = this.i;
            okc okc2 = this.j;
            int i3 = ofj.j;
            aucd o2 = ola.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ola ola3 = (ola) o2.b;
            str2.getClass();
            ola3.a |= 1;
            ola3.b = str2;
            ola ola4 = (ola) o2.i();
            old a4 = ofj.a(nze2, helpConfig2);
            aucd aucd2 = (aucd) a4.c(5);
            aucd2.a((aucj) a4);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            old old4 = (old) aucd2.b;
            old old5 = old.g;
            ola4.getClass();
            old4.c = ola4;
            old4.b = 3;
            aufd a5 = aufd.a(j3);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            old old6 = (old) aucd2.b;
            a5.getClass();
            old6.f = a5;
            old6.a |= 64;
            ole = ofj.a((old) aucd2.i(), 51, chatRequestAndConversationChimeraService, helpConfig2, okc2);
        }
        if (ole == null) {
            return null;
        }
        if (ole.a == 1) {
            return (olb) ole.b;
        }
        return olb.b;
    }
}
