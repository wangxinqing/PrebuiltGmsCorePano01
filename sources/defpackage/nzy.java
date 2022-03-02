package defpackage;

import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: nzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzy {
    public static ou a(HelpConfig helpConfig) {
        ou ouVar = new ou(23);
        ouVar.put("last_seen_account_change_index", 0);
        ouVar.put("ongoing_session_last_stopped_ms", 0L);
        ouVar.put("ongoing_session_id", "");
        ouVar.put("ongoing_session_context", "");
        ouVar.put("ongoing_session_browse_url", "");
        ouVar.put("ongoing_session_user_action_type", "");
        ouVar.put("ongoing_session_click_rank", -1);
        ouVar.put("ongoing_session_query", "");
        ouVar.put("ongoing_session_scroll_pos_y", Float.valueOf(0.0f));
        ouVar.put("ongoing_chat_request_pool_id", "");
        ouVar.put("hangout_was_opened", false);
        ouVar.put("last_seen_chat_conversation_event_id", -1L);
        ouVar.put(b(helpConfig), -1L);
        ouVar.put(c(helpConfig), "");
        ouVar.put(d(helpConfig), -1);
        ouVar.put(e(helpConfig), 0);
        ouVar.put("escalation_options", avnq.j);
        ouVar.put("cached_chat_conversation", okm.e);
        ouVar.put("should_contact_card_show_chat_available", false);
        return ouVar;
    }

    public static String b(HelpConfig helpConfig) {
        String valueOf = String.valueOf(helpConfig.p());
        return valueOf.length() == 0 ? new String("chat_version:") : "chat_version:".concat(valueOf);
    }

    public static String c(HelpConfig helpConfig) {
        String valueOf = String.valueOf(helpConfig.p());
        return valueOf.length() == 0 ? new String("chat_convo_id:") : "chat_convo_id:".concat(valueOf);
    }

    public static String d(HelpConfig helpConfig) {
        String valueOf = String.valueOf(helpConfig.p());
        return valueOf.length() == 0 ? new String("chat_queue_pos:") : "chat_queue_pos:".concat(valueOf);
    }

    public static String e(HelpConfig helpConfig) {
        String valueOf = String.valueOf(helpConfig.p());
        return valueOf.length() == 0 ? new String("chat_failed_attempts:") : "chat_failed_attempts:".concat(valueOf);
    }
}
