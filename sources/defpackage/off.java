package defpackage;

import android.content.Context;
import android.util.Log;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: off  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class off extends ons {
    private final HelpConfig f;
    private final String g;

    public off(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, HelpConfig helpConfig, String str2) {
        super("RequestChatSupportOperation", googleHelpChimeraService, str, ojq);
        this.f = helpConfig;
        this.g = str2;
    }

    public final void a(Context context) {
        if (!this.f.o()) {
            Log.w("gH_RequestChatSupportOp", "Pool ID is required for Chat support.");
            this.e.c();
            return;
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        GoogleHelpChimeraService googleHelpChimeraService = this.a;
        oez.a((Context) googleHelpChimeraService, this.f, googleHelpChimeraService.a(), -1, this.g, (Response.Listener) newFuture, (Response.ErrorListener) newFuture);
        try {
            int i = ((avnf) newFuture.get(axmj.q(), TimeUnit.SECONDS)).a;
            if (i >= 0) {
                this.e.a(i);
                ChatRequestAndConversationChimeraService.a((Context) this.a, this.f);
                return;
            }
            Log.w("gH_RequestChatSupportOp", "Chat queue position is invalid.");
            this.e.c();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gH_RequestChatSupportOp", "Chat support request failed.", e);
            this.e.c();
        }
    }
}
