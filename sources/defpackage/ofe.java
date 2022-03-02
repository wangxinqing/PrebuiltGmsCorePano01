package defpackage;

import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: ofe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofe extends nzj {
    private final nze e;
    private final ChatRequestAndConversationChimeraService f;
    private final HelpConfig g;
    private final okc h;

    public ofe(nze nze, ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, HelpConfig helpConfig, okc okc) {
        super(chatRequestAndConversationChimeraService);
        this.e = nze;
        this.f = chatRequestAndConversationChimeraService;
        this.g = helpConfig;
        this.h = okc;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        okx okx = (okx) obj;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f;
        if (okx == null) {
            Log.w("gH_ChatReq&ConvoSvc", "Got empty MobileListConversationEventsResponse");
        } else if (chatRequestAndConversationChimeraService.e == null) {
            Log.w("gH_ChatReq&ConvoSvc", "onChatConversationUpdated but config is null");
        } else {
            chatRequestAndConversationChimeraService.a(chatRequestAndConversationChimeraService.a(okx));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        okx a;
        Void[] voidArr = (Void[]) objArr;
        if (!jkf.a(this.f) || (a = ofd.a(this.e, this.f.getApplicationContext(), this.g, this.f.a(), this.h)) == null) {
            return null;
        }
        return a;
    }
}
