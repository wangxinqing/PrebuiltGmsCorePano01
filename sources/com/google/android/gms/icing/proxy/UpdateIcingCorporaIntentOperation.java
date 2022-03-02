package com.google.android.gms.icing.proxy;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.ContactsContract;
import com.google.android.chimera.IntentOperation;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateIcingCorporaIntentOperation extends IntentOperation {
    public static final ContentValues a = new ContentValues();

    public static Intent a(Context context, String str) {
        return IntentOperation.getStartIntent(context, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_UPDATE").putExtra("KEY_CONTACTS_UPDATE_MODE", str);
    }

    public static Intent b(Context context) {
        return a(context, "MAYBE");
    }

    public static Intent c(Context context) {
        return a(context, "DELTA");
    }

    /* JADX INFO: finally extract failed */
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            pnz.e("Received null intent.");
        } else if (!pnm.a()) {
            pnz.e("Contacts corpus disabled.");
        } else {
            String action = intent.getAction();
            if ("com.google.android.gms.icing.proxy.ACTION_UPDATE".equals(action)) {
                a(intent.getStringExtra("KEY_CONTACTS_UPDATE_MODE"), intent.getStringArrayExtra("KEY_CONTACTS_ARGS"));
            } else if ("com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS".equals(action)) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    pnz.a("maybeUpdateContacts extras is null.");
                    return;
                }
                int i = extras.getInt("EXTRA_LAST_RAW_CONTACT_COUNT", -1);
                int i2 = extras.getInt("EXTRA_ATTEMPT", 0);
                StringBuilder sb = new StringBuilder(39);
                sb.append("maybeUpdateContacts attempt ");
                sb.append(i2);
                pnz.a(sb.toString());
                Cursor a2 = a().a(ContactsContract.RawContacts.CONTENT_URI, (String[]) null, (String) null, (String[]) null, (String) null);
                if (a2 != null) {
                    try {
                        int count = a2.getCount();
                        a2.close();
                        int intValue = ((Integer) ozx.aj.c()).intValue();
                        pnz.a("Curr/Prev: %d/%d", (Object) Integer.valueOf(count), (Object) Integer.valueOf(i));
                        if (count == i || i2 >= intValue) {
                            if (count != i) {
                                StringBuilder sb2 = new StringBuilder(62);
                                sb2.append("Number of contacts did not stabilize after attempt ");
                                sb2.append(i2);
                                pnz.e(sb2.toString());
                            }
                            a("FORCE_ALL", (String[]) null);
                            return;
                        }
                        int i3 = i2 + 1;
                        long longValue = ((Long) ozx.ai.c()).longValue();
                        if (longValue < 0) {
                            pnz.c("Not rescheduling contacts sync");
                        } else {
                            a(this, i3, count, longValue);
                        }
                    } catch (Throwable th) {
                        a2.close();
                        throw th;
                    }
                } else {
                    pnz.e("Could not fetch contact count - no contacts provider present?");
                }
            } else {
                String action2 = intent.getAction();
                String valueOf = String.valueOf(intent);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 9);
                sb3.append("Received ");
                sb3.append(valueOf);
                pnz.d(sb3.toString());
                if ("android.intent.action.PACKAGE_CHANGED".equals(action2)) {
                    if (a(intent)) {
                        a("FORCE_ALL", (String[]) null);
                    }
                } else if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action2)) {
                    if (a(intent)) {
                        int i4 = Build.VERSION.SDK_INT;
                        a("FORCE_ALL", (String[]) null);
                    }
                } else if ("android.provider.Contacts.DATABASE_CREATED".equals(action2)) {
                    a((Context) this);
                } else if ("android.intent.action.LOCALE_CHANGED".equals(action2)) {
                    a("FORCE_ALL", (String[]) null);
                } else {
                    pnz.e("Received unrecognized action.");
                }
            }
        }
    }

    private final pni a() {
        return new pni(new oyq(this), getContentResolver());
    }

    static void a(Context context) {
        long longValue = ((Long) ozx.ah.c()).longValue();
        if (longValue < 0) {
            pnz.c("Not scheduling contacts sync");
        } else {
            a(context, 0, -1, longValue);
        }
    }

    private static void a(Context context, int i, int i2, long j) {
        Intent startIntent = IntentOperation.getStartIntent(context, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS");
        startIntent.putExtra("EXTRA_ATTEMPT", i);
        startIntent.putExtra("EXTRA_LAST_RAW_CONTACT_COUNT", i2);
        PendingIntent service = PendingIntent.getService(context, 0, startIntent, 134217728);
        pnz.a("Scheduling alarm in %d s: %s", (Object) Long.valueOf(j / 1000), (Object) startIntent);
        new jbs(context).a("Icing:CorporaIntent", 3, SystemClock.elapsedRealtime() + j, service, (String) null);
    }

    public static void a(Context context, String str, PrintWriter printWriter) {
        boolean z = false;
        pnk.a(printWriter, str, "Alarm status: ");
        Object[] objArr = new Object[3];
        objArr[0] = str.concat("  ");
        objArr[1] = "Contacts pending: ";
        if (PendingIntent.getService(context, 0, IntentOperation.getStartIntent(context, UpdateIcingCorporaIntentOperation.class, "com.google.android.gms.icing.proxy.ACTION_MAYBE_UPDATE_CONTACTS"), 536870912) != null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        pnk.a(printWriter, objArr);
    }

    private final void a(String str, String[] strArr) {
        pnz.a("Updating corpora: CONTACTS=%s", (Object) str);
        new poy(getSharedPreferences("icing_internal_corpora_prefs", 0), a(), str, strArr).a();
    }

    private static final boolean a(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return "com.android.providers.contacts".equals(data.getSchemeSpecificPart());
        }
        return false;
    }
}
