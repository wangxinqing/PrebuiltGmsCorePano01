package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.lang.ref.WeakReference;

/* renamed from: oeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oeq implements Runnable {
    private final WeakReference a;
    private final HelpConfig b;

    public oeq(HelpConfig helpConfig, Context context) {
        this.a = new WeakReference(context);
        this.b = helpConfig;
    }

    public final void run() {
        Context context = (Context) this.a.get();
        if (context != null) {
            ChatRequestAndConversationChimeraService.d(context, this.b);
        }
    }
}
