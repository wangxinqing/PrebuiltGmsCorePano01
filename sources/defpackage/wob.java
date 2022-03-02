package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.io.PrintWriter;

/* renamed from: wob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wob extends wnb {
    private final Bundle c;

    public wob(String str, int i, wzv wzv, Bundle bundle) {
        super(str, i, wzv, (String) null, "InternalCall");
        this.c = bundle;
    }

    public final Pair c(Context context) {
        xqy xqy = xqy.c;
        Bundle bundle = this.c;
        Bundle bundle2 = new Bundle();
        String string = bundle.getString("internal_call_method");
        if ("GET_SHOW_SYNC_NOTIFICATION_ERROR".equals(string)) {
            bundle2.putInt("internal_call_result", wss.a(context).c());
        } else if ("SET_SHOW_SYNC_NOTIFICATION_ERROR".equals(string)) {
            wss a = wss.a(context);
            int i = bundle.getInt("internal_call_arg_1", 0);
            iva.b((String) null);
            xdt.a("PeoplePreferences", "setShowSyncErrorNotification: %d", i);
            a.a.edit().putInt("show_sync_error_notification", i).commit();
        } else if ("LOAD_LOG".equals(string)) {
            woa woa = new woa();
            wua.a(context, new PrintWriter(woa), (String[]) null);
            bundle2.putString("log_text", woa.a.toString());
        } else if ("GET_FORCE_VERBOSE_LOG".equals(string)) {
            bundle2.putBoolean("internal_call_result", wss.a(context).a.getBoolean("force_verbose_log", false));
        } else if ("SET_FORCE_VERBOSE_LOG".equals(string)) {
            wss.a(context).c(bundle.getBoolean("internal_call_arg_1", false));
        }
        return new Pair(xqy, bundle2);
    }
}
