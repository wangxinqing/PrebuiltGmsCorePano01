package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubManager;
import android.hardware.location.NanoAppMessage;
import android.util.Log;
import com.google.android.location.contexthub.NanoAppClearcutLoggingP$1;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ahzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahzc extends ahyz implements ahzp {
    public static final /* synthetic */ int f = 0;
    private static final byte[] g = "WELCOME_NANO".getBytes();
    public final jfo a;
    public final ahzr b;
    public final hol c;
    public final Set d = new HashSet();
    public boolean e = false;
    private final Context h;
    private final BroadcastReceiver i = new NanoAppClearcutLoggingP$1(this, "location");

    public ahzc(Context context, jfo jfo) {
        ahzr ahzr = new ahzr((ContextHubManager) context.getSystemService("contexthub"), jfo.d);
        hol hol = new hol(context, "LE", (String) null);
        this.h = context;
        this.a = jfo;
        this.b = ahzr;
        this.c = hol;
    }

    private final void b(long j) {
        NanoAppMessage createMessageToNanoApp = NanoAppMessage.createMessageToNanoApp(j, 2147478647, g);
        ContextHubClient contextHubClient = this.b.e;
        if (contextHubClient != null) {
            contextHubClient.sendMessageToNanoApp(createMessageToNanoApp);
        }
    }

    static Set d() {
        if (aydo.b() == null) {
            return new HashSet();
        }
        HashSet<String> a2 = angm.a((Object[]) aydo.b().trim().split("\\s*,\\s*"));
        a2.remove("");
        HashSet hashSet = new HashSet();
        for (String decode : a2) {
            try {
                hashSet.add(Long.valueOf(Long.decode(decode).longValue()));
            } catch (NumberFormatException e2) {
                if (Log.isLoggable("NanoAppLogging", 6)) {
                    Log.e("NanoAppLogging", "Failed to decode nanoapp ID!", e2);
                }
            }
        }
        return hashSet;
    }

    public final void a() {
        this.h.registerReceiver(this.i, new IntentFilter("com.google.android.gms.phenotype.COMMITTED"));
        if (aydo.c()) {
            this.b.a(this, d());
        }
        this.e = true;
    }

    public final void c() {
        Set d2 = d();
        if (!this.d.containsAll(d2)) {
            this.d.clear();
            this.d.addAll(d2);
            for (Long longValue : this.d) {
                b(longValue.longValue());
            }
        }
    }

    public final void a(long j) {
        if (this.d.contains(Long.valueOf(j))) {
            b(j);
        }
    }

    public final void b() {
        if (this.e) {
            this.h.unregisterReceiver(this.i);
            this.b.a();
            this.e = false;
        }
    }

    public final void a(PrintWriter printWriter) {
        printWriter.print("Current list of nanoapp logging IDs ");
        for (Long longValue : this.d) {
            String valueOf = String.valueOf(Long.toHexString(longValue.longValue()));
            printWriter.print(valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf));
        }
        printWriter.println();
    }

    public final void a(boolean z) {
        if (z) {
            c();
        } else if (Log.isLoggable("NanoAppLogging", 6)) {
            Log.e("NanoAppLogging", "Failed to begin contexthub communication");
        }
    }
}
