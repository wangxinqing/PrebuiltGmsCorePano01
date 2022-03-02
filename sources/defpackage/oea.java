package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oea implements nzc {
    private final ChatRequestAndConversationChimeraService a;
    private final okx b;

    public oea(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, okx okx) {
        this.a = chatRequestAndConversationChimeraService;
        this.b = okx;
    }

    public final void a(nze nze) {
        oky oky;
        nzx nzx;
        nze nze2 = nze;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.a;
        okx okx = this.b;
        if (ofq.b(axqn.b()) && !chatRequestAndConversationChimeraService.s && (nzx = chatRequestAndConversationChimeraService.r) != null) {
            nzx.addObserver(new oef(chatRequestAndConversationChimeraService, okx));
            return;
        }
        odu.a((List) okx.a, nze2);
        long e = odu.e(nze);
        if (e == -1 || chatRequestAndConversationChimeraService.p != e || chatRequestAndConversationChimeraService.n != odu.c(chatRequestAndConversationChimeraService.g)) {
            List a2 = odu.a(e, nze2);
            if (!a2.isEmpty()) {
                if (!chatRequestAndConversationChimeraService.k) {
                    chatRequestAndConversationChimeraService.a(ChatRequestAndConversationChimeraService.e());
                    chatRequestAndConversationChimeraService.k = true;
                }
                String a3 = odu.a(nze);
                long j = chatRequestAndConversationChimeraService.o;
                ArrayList arrayList = new ArrayList();
                int size = a2.size();
                int i = 0;
                while (i < size) {
                    aufd aufd = ((oko) a2.get(i)).e;
                    if (aufd == null) {
                        aufd = aufd.b;
                    }
                    long j2 = aufd.a;
                    int i2 = i;
                    long d = odu.d(nze);
                    long a4 = odu.a(d, System.currentTimeMillis() - j2, nze2);
                    if (a4 != d) {
                        if (!chatRequestAndConversationChimeraService.i) {
                            odu.a(chatRequestAndConversationChimeraService.g, true);
                        } else if (chatRequestAndConversationChimeraService.k) {
                            chatRequestAndConversationChimeraService.a(a4);
                        } else {
                            chatRequestAndConversationChimeraService.u();
                        }
                    }
                    int i3 = i2;
                    if (((oko) a2.get(i3)).b == 3) {
                        arrayList.add((oko) a2.get(i3));
                        oko oko = (oko) a2.get(i3);
                        if (oko.b == 3) {
                            oky = (oky) oko.c;
                        } else {
                            oky = oky.g;
                        }
                        if (!TextUtils.equals(a3, oky.b)) {
                            chatRequestAndConversationChimeraService.o = ((oko) a2.get(i3)).d;
                        }
                    } else if (((oko) a2.get(i3)).b == 6) {
                        chatRequestAndConversationChimeraService.stopForeground(false);
                        chatRequestAndConversationChimeraService.j = false;
                    }
                    i = i3 + 1;
                }
                if (!chatRequestAndConversationChimeraService.i) {
                    if (chatRequestAndConversationChimeraService.o != j) {
                        chatRequestAndConversationChimeraService.a(4102, arrayList.isEmpty() ? chatRequestAndConversationChimeraService.o() : chatRequestAndConversationChimeraService.a((List) arrayList, false));
                    }
                } else if (!chatRequestAndConversationChimeraService.d) {
                    chatRequestAndConversationChimeraService.a(4102, chatRequestAndConversationChimeraService.o());
                }
                chatRequestAndConversationChimeraService.d = true;
                chatRequestAndConversationChimeraService.p = e;
                chatRequestAndConversationChimeraService.n = ((oko) a2.get(a2.size() - 1)).d;
                if (!odu.a(odu.e(chatRequestAndConversationChimeraService.g), chatRequestAndConversationChimeraService.g).isEmpty()) {
                    chatRequestAndConversationChimeraService.a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT"));
                }
            }
        }
    }
}
