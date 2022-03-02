package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: odu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class odu {
    public static synchronized long a(long j, long j2, nze nze) {
        synchronized (odu.class) {
            if (j2 >= j) {
                return j;
            }
            b(j2, nze);
            return j2;
        }
    }

    public static synchronized List b(nze nze) {
        List arrayList;
        synchronized (odu.class) {
            okm i = i(nze);
            arrayList = i == null ? new ArrayList() : i.c;
        }
        return arrayList;
    }

    public static long c(nze nze) {
        okm i = i(nze);
        if (i == null || i.c.size() == 0) {
            return -1;
        }
        return ((oko) i.c.get(i.c.size() - 1)).d;
    }

    public static long d(nze nze) {
        if (nze != null) {
            return nze.a("device_server_time_difference_estimate", Long.MAX_VALUE);
        }
        return Long.MAX_VALUE;
    }

    public static long e(nze nze) {
        if (nze != null) {
            return nze.a("last_seen_chat_conversation_event_id", -1);
        }
        return -1;
    }

    public static synchronized void f(Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzq.c(context, helpConfig, "has_sent_gcm_token_to_server_on_gms_process");
        }
    }

    public static synchronized void g(Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzq.a(context, helpConfig, "has_sent_gcm_token_to_server_on_gms_process");
        }
    }

    public static synchronized void h(Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzq.c(context, helpConfig, "user_is_requesting_new_chat");
        }
    }

    private static okm i(nze nze) {
        if (nze != null) {
            return (okm) nze.a("cached_chat_conversation", (audx) okm.e);
        }
        return null;
    }

    public static synchronized void j(Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzq.c(context, helpConfig, "should_notify_of_chat_request_error");
        }
    }

    public static synchronized void k(Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzq.a(context, helpConfig, "should_notify_of_chat_request_error");
        }
    }

    public static synchronized void d(Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzq.a(context, helpConfig, "has_reported_chat_view_time_while_in_queue");
        }
    }

    public static boolean e(Context context, HelpConfig helpConfig) {
        return nzq.b(context, helpConfig, "has_sent_gcm_token_to_server_on_gms_process");
    }

    public static boolean f(nze nze) {
        return nze.a("hangout_was_opened", false);
    }

    public static synchronized void g(nze nze) {
        synchronized (odu.class) {
            nzp a = nze.a();
            a.a("should_contact_card_show_chat_available", true);
            a.a();
        }
    }

    public static synchronized void h(nze nze) {
        synchronized (odu.class) {
            nzp a = nze.a();
            a.a("should_contact_card_show_chat_available");
            a.a();
        }
    }

    public static long a(Context context, HelpConfig helpConfig) {
        return new nzr(context, helpConfig).a("chat_view_time_during_current_chat_status", 0);
    }

    public static synchronized void b(long j, nze nze) {
        synchronized (odu.class) {
            nzp a = nze.a();
            a.a("device_server_time_difference_estimate", j);
            a.a();
        }
    }

    public static synchronized void i(Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzq.a(context, helpConfig, "user_is_requesting_new_chat");
        }
    }

    public static String a(HelpConfig helpConfig, nze nze) {
        if (nze != null) {
            return nze.a(nzy.c(helpConfig), (String) null);
        }
        return null;
    }

    public static synchronized void c(Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzq.c(context, helpConfig, "has_reported_chat_view_time_while_in_queue");
        }
    }

    public static synchronized void b(Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzq.a(context, helpConfig, "chat_view_time_during_current_chat_status");
        }
    }

    public static String a(nze nze) {
        okm i = i(nze);
        if (i != null) {
            return i.d;
        }
        return null;
    }

    public static synchronized void b(nze nze, boolean z) {
        synchronized (odu.class) {
            nzp a = nze.a();
            a.a("time_has_changed", z);
            a.a();
        }
    }

    public static synchronized List a(long j, nze nze) {
        synchronized (odu.class) {
            okm i = i(nze);
            if (i != null) {
                aucx aucx = i.c;
                if (j < 0) {
                    return aucx;
                }
                aucd o = oko.i.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                oko oko = (oko) o.b;
                oko.a |= 1;
                oko.d = j;
                int binarySearch = Collections.binarySearch(aucx, (oko) o.i(), new odt());
                if (binarySearch < 0) {
                    Log.w("gH_ChatConvoCacheUtil", String.format("Did not find new events since ID %d in cached list, returning all events.", new Object[]{Long.valueOf(j)}));
                    return aucx;
                } else if (binarySearch < aucx.size() - 1) {
                    ArrayList arrayList = new ArrayList(aucx.subList(binarySearch + 1, aucx.size()));
                    return arrayList;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    return arrayList2;
                }
            } else {
                ArrayList arrayList3 = new ArrayList();
                return arrayList3;
            }
        }
    }

    public static synchronized void a(long j, Context context, HelpConfig helpConfig) {
        synchronized (odu.class) {
            nzp a = new nzr(context, helpConfig).a();
            a.a("chat_view_time_during_current_chat_status", j);
            a.a();
        }
    }

    public static synchronized void a(Context context, HelpConfig helpConfig, nze nze) {
        synchronized (odu.class) {
            String p = helpConfig.p();
            nzp a = nze.a();
            a.a("ongoing_chat_request_pool_id");
            String valueOf = String.valueOf(p);
            a.a(valueOf.length() == 0 ? new String("chat_version:") : "chat_version:".concat(valueOf));
            String valueOf2 = String.valueOf(p);
            a.a(valueOf2.length() == 0 ? new String("chat_convo_id:") : "chat_convo_id:".concat(valueOf2));
            String valueOf3 = String.valueOf(p);
            a.a(valueOf3.length() == 0 ? new String("chat_queue_pos:") : "chat_queue_pos:".concat(valueOf3));
            String valueOf4 = String.valueOf(p);
            a.a(valueOf4.length() == 0 ? new String("chat_failed_attempts:") : "chat_failed_attempts:".concat(valueOf4));
            a.a("hangout_was_opened");
            a.a("last_seen_chat_conversation_event_id");
            a.a("device_server_time_difference_estimate");
            a.a("time_difference_estimate_has_changed");
            a.a("time_has_changed");
            a.a();
            nze.a((audx) okm.e, "cached_chat_conversation");
            nze.d("cached_chat_conversation");
            b(context, helpConfig);
            d(context, helpConfig);
            g(context, helpConfig);
        }
    }

    public static void a(Context context, HelpConfig helpConfig, nzw nzw) {
        if (!e(context, helpConfig)) {
            String b = ohj.b(context);
            if (!TextUtils.isEmpty(b)) {
                nzw.f = b;
            }
        }
    }

    public static synchronized void a(HelpConfig helpConfig, nze nze, avnf avnf) {
        synchronized (odu.class) {
            String p = helpConfig.p();
            nzp a = nze.a();
            a.a("ongoing_chat_request_pool_id", p);
            String valueOf = String.valueOf(p);
            a.a(valueOf.length() == 0 ? new String("chat_version:") : "chat_version:".concat(valueOf), avnf.c);
            String valueOf2 = String.valueOf(p);
            a.a(valueOf2.length() == 0 ? new String("chat_convo_id:") : "chat_convo_id:".concat(valueOf2), avnf.b);
            String valueOf3 = String.valueOf(p);
            a.a(valueOf3.length() == 0 ? new String("chat_queue_pos:") : "chat_queue_pos:".concat(valueOf3), avnf.a);
            a.a();
        }
    }

    public static synchronized void a(HelpConfig helpConfig, nze nze, Long l) {
        synchronized (odu.class) {
            String p = helpConfig.p();
            nzp a = nze.a();
            String valueOf = String.valueOf(p);
            a.a(valueOf.length() == 0 ? new String("chat_version:") : "chat_version:".concat(valueOf), l.longValue());
            a.a();
        }
    }

    public static synchronized void a(List list, nze nze) {
        long j;
        synchronized (odu.class) {
            if (list.isEmpty()) {
                new ArrayList();
                return;
            }
            okm i = i(nze);
            if (i == null) {
                Log.w("gH_ChatConvoCacheUtil", "Attempting to save new messages, but there is no conversation");
                new ArrayList();
                return;
            }
            int size = i.c.size();
            if (size != 0) {
                j = ((oko) i.c.get(size - 1)).d;
            } else {
                j = -1;
            }
            ArrayList arrayList = new ArrayList();
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                oko oko = (oko) list.get(i2);
                long j2 = 1 + j;
                if (oko.d == j2) {
                    arrayList.add(oko);
                    j = j2;
                }
            }
            if (arrayList.size() <= 0) {
                new ArrayList();
                return;
            }
            aucd aucd = (aucd) i.c(5);
            aucd.a((aucj) i);
            aucd.H(arrayList);
            a((okm) aucd.i(), nze);
        }
    }

    public static synchronized void a(nze nze, long j) {
        synchronized (odu.class) {
            nzp a = nze.a();
            a.a("last_seen_chat_conversation_event_id", j);
            a.a();
        }
    }

    public static synchronized void a(nze nze, boolean z) {
        synchronized (odu.class) {
            nzp a = nze.a();
            a.a("time_difference_estimate_has_changed", z);
            a.a();
        }
    }

    private static synchronized void a(okm okm, nze nze) {
        synchronized (odu.class) {
            nze.a((audx) okm, "cached_chat_conversation");
        }
    }

    public static synchronized void a(okn okn, List list, String str, nze nze) {
        synchronized (odu.class) {
            aucd o = okm.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            okm okm = (okm) o.b;
            okn.getClass();
            okm.b = okn;
            okm.a |= 1;
            o.H(list);
            if (o.c) {
                o.c();
                o.c = false;
            }
            okm okm2 = (okm) o.b;
            str.getClass();
            okm2.a |= 2;
            okm2.d = str;
            a((okm) o.i(), nze);
        }
    }
}
