package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: xfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xfp {
    public static final anaf a = anaf.a("sgbe_update_contact", "contact_owner_id", "sgbe_update_group", "group_owner_id", "sgbe_update_profile", "user_id");
    private static final amzy b = amzy.a("sgbe_update_contact", "sgbe_update_group", "sgbe_update_profile");

    public static void a(String str) {
        if (amrk.a(str)) {
            xdt.a("People_TickleMessageUtil", "Trigger FSA2 sync for all accounts", new Object[0]);
            ContentResolver.requestSync((Account) null, "com.android.contacts", new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("feed", valueOf.length() == 0 ? new String("groups/") : "groups/".concat(valueOf));
        ContentResolver.requestSync(new Account(str, "com.google"), "com.android.contacts", bundle);
    }

    public static void b(String str) {
        if (amrk.a(str)) {
            xdt.a("People_TickleMessageUtil", "Trigger profile sync for all accounts since accout name is missing", new Object[0]);
            ContentResolver.requestSync((Account) null, "com.google.android.gms.people", new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("feed", valueOf.length() == 0 ? new String("profile/") : "profile/".concat(valueOf));
        ContentResolver.requestSync(new Account(str, "com.google"), "com.google.android.gms.people", bundle);
    }

    public static void c(String str) {
        if (amrk.a(str)) {
            xdt.a("People_TickleMessageUtil", "Trigger FSA2 sync for all accounts", new Object[0]);
            ContentResolver.requestSync((Account) null, "com.android.contacts", new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("feed", valueOf.length() == 0 ? new String("contacts/") : "contacts/".concat(valueOf));
        ContentResolver.requestSync(new Account(str, "com.google"), "com.android.contacts", bundle);
    }

    public static boolean a(Context context, Intent intent) {
        String a2 = nsp.a(context).a(intent);
        if ("send_error".equals(a2)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("GCM send error: ");
            sb.append(valueOf);
            Log.e("People_TickleMessageUtil", sb.toString());
            return false;
        } else if (!"deleted_messages".equals(a2)) {
            return "gcm".equals(a2);
        } else {
            String valueOf2 = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 66);
            sb2.append("GCM server deleted pending messages because they were collapsible.");
            sb2.append(valueOf2);
            Log.e("People_TickleMessageUtil", sb2.toString());
            return false;
        }
    }

    public static boolean a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("notification_type");
            if (string != null && b.contains(string)) {
                return true;
            }
            xdt.b("People_TickleMessageUtil", "Received msg does not contain valid type. Type we received is [%s]", string);
            return false;
        }
        Log.e("People_TickleMessageUtil", "Received msg with no bundle");
        return false;
    }
}
