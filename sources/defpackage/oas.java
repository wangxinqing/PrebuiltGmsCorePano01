package defpackage;

import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: oas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oas {
    public final HelpChimeraActivity a;
    public final HelpConfig b;
    public final nze c;
    public boolean d = true;

    public oas(HelpChimeraActivity helpChimeraActivity, nze nze) {
        this.a = helpChimeraActivity;
        this.b = helpChimeraActivity.x;
        this.c = nze;
    }

    public static boolean a(HelpConfig helpConfig, nze nze) {
        if (helpConfig.N || !TextUtils.isEmpty(nze.a("ongoing_chat_request_pool_id", ""))) {
            return true;
        }
        if (nze.a("ongoing_session_last_stopped_ms", 0) + TimeUnit.MINUTES.toMillis(axmj.a.a().am()) >= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public static void b(HelpConfig helpConfig, nze nze) {
        helpConfig.N = true;
        String a2 = nze.a("ongoing_session_id", "");
        if (!TextUtils.isEmpty(a2)) {
            helpConfig.e = a2;
        }
        if (nze.b("ongoing_session_browse_url")) {
            nze.a("ongoing_session_context", "");
            helpConfig.O = nze.a("ongoing_session_browse_url", "");
            helpConfig.P = nze.a("ongoing_session_click_rank", -1);
            helpConfig.Q = nze.a("ongoing_session_query", "");
            helpConfig.R = nze.b.getFloat(nze.a("ongoing_session_scroll_pos_y"), 0.0f);
            int a3 = avne.a(nze.a("ongoing_session_user_action_type", 0));
            if (a3 != 0) {
                helpConfig.Y = a3;
            }
        }
    }

    public final void a() {
        nzp a2 = this.c.a();
        a2.a("ongoing_session_last_stopped_ms");
        a2.a("ongoing_session_id");
        a2.a("ongoing_session_context");
        a2.a("ongoing_session_browse_url");
        a2.a("ongoing_session_user_action_type");
        a2.a("ongoing_session_click_rank");
        a2.a("ongoing_session_query");
        a2.a("ongoing_session_scroll_pos_y");
        a2.a();
    }
}
