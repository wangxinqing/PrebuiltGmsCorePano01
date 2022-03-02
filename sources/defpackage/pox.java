package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.icing.proxy.InternalIcingCorporaChimeraProvider;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;
import java.util.concurrent.Callable;

/* renamed from: pox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pox implements Callable {
    private final pni a;
    private final SharedPreferences b;
    private final String c;
    private final String[] d;

    public pox(pni pni, SharedPreferences sharedPreferences, String str, String[] strArr) {
        this.a = pni;
        this.b = sharedPreferences;
        this.c = str;
        this.d = strArr;
    }

    private final void b() {
        pnz.a("Starting full update.");
        if (this.a.a(InternalIcingCorporaChimeraProvider.b, UpdateIcingCorporaIntentOperation.a, (String) null, (String[]) null) >= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder(56);
            sb.append("Full contacts update done at time = ");
            sb.append(currentTimeMillis);
            pnz.a(sb.toString());
            this.b.edit().putLong("KEY_LAST_CONTACTS_UPDATE", currentTimeMillis).apply();
            return;
        }
        pnz.b("Full contacts update failed.");
    }

    /* renamed from: a */
    public final Boolean call() {
        int i = pmr.a;
        long longValue = ((Long) ozx.al.c()).longValue();
        long currentTimeMillis = System.currentTimeMillis() - this.b.getLong("KEY_LAST_CONTACTS_UPDATE", 0);
        pnz.b("UpdateContactsTask: mode: %s, have_delta: %b, intervalMs: %d, timeSinceFullUpdateMs: %d", this.c, true, Long.valueOf(longValue), Long.valueOf(currentTimeMillis));
        if ("NONE".equals(this.c)) {
            pnz.a("Contacts update none mode.");
            return false;
        } else if ("FORCE_ALL".equals(this.c)) {
            b();
            return true;
        } else if (!"MAYBE".equals(this.c)) {
            if ("DELTA".equals(this.c)) {
                if (this.a.a(InternalIcingCorporaChimeraProvider.b, UpdateIcingCorporaIntentOperation.a, "delta", (String[]) null) < 0) {
                    pnz.b("Contacts delta update failed.");
                }
                return true;
            } else if ("SPECIFIC".equals(this.c)) {
                if (this.a.a(InternalIcingCorporaChimeraProvider.b, UpdateIcingCorporaIntentOperation.a, "ids", this.d) < 0) {
                    pnz.b("Contacts ids update failed.");
                }
                return true;
            } else {
                String valueOf = String.valueOf(this.c);
                pnz.b(valueOf.length() == 0 ? new String("Unknown Contacts update mode: ") : "Unknown Contacts update mode: ".concat(valueOf));
                return false;
            }
        } else if (currentTimeMillis <= longValue) {
            pnz.a("Did full update recently, won't do it now.");
            return false;
        } else {
            b();
            return true;
        }
    }
}
