package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: ofb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofb extends nzj {
    private final nze e;
    private final ChatRequestAndConversationChimeraService f;
    private final HelpConfig g;
    private final okc h;

    public ofb(nze nze, ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, HelpConfig helpConfig, okc okc) {
        super(chatRequestAndConversationChimeraService);
        this.e = nze;
        this.f = chatRequestAndConversationChimeraService;
        this.g = helpConfig;
        this.h = okc;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        okr okr = (okr) obj;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f;
        if (okr == null) {
            Log.w("gH_ChatReq&ConvoSvc", "Got empty MobileJoinConversationResponse");
        } else if (chatRequestAndConversationChimeraService.e == null) {
            Log.w("gH_ChatReq&ConvoSvc", "onJoinChatConversationAccepted but config is null");
        } else {
            chatRequestAndConversationChimeraService.a((nzc) new odz(chatRequestAndConversationChimeraService, okr));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ole ole;
        Void[] voidArr = (Void[]) objArr;
        if (!jkf.a(this.f)) {
            return null;
        }
        if (ofq.a(axmx.b())) {
            nze nze = this.e;
            Context applicationContext = this.f.getApplicationContext();
            HelpConfig helpConfig = this.g;
            aoru a = this.f.a();
            okc okc = this.h;
            old a2 = ofh.a(nze, helpConfig);
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            okq okq = okq.a;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            old old = (old) aucd.b;
            old old2 = old.g;
            okq.getClass();
            old.c = okq;
            old.b = 4;
            ole = ofh.a((old) aucd.i(), 49, applicationContext, helpConfig, a, okc);
        } else {
            nze nze2 = this.e;
            ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f;
            HelpConfig helpConfig2 = this.g;
            okc okc2 = this.h;
            old a3 = ofj.a(nze2, helpConfig2);
            aucd aucd2 = (aucd) a3.c(5);
            aucd2.a((aucj) a3);
            okq okq2 = okq.a;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            old old3 = (old) aucd2.b;
            old old4 = old.g;
            okq2.getClass();
            old3.c = okq2;
            old3.b = 4;
            ole = ofj.a((old) aucd2.i(), 49, chatRequestAndConversationChimeraService, helpConfig2, okc2);
        }
        if (ole == null) {
            return null;
        }
        if (ole.a == 2) {
            return (okr) ole.b;
        }
        return okr.d;
    }
}
