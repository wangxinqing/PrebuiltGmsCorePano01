package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Map;

/* renamed from: prt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prt {
    public final Context a;
    public final prs b;
    public final SharedPreferences c;
    public final int d;
    public Map e;
    private final String f;

    public prt(Context context, prs prs, SharedPreferences sharedPreferences, int i, String str) {
        this.a = context;
        this.b = prs;
        this.c = sharedPreferences;
        this.d = i;
        this.f = str;
    }

    public static final boolean a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getAll().isEmpty();
    }

    public final void b(String str) {
        String valueOf = String.valueOf(this.f);
        String str2 = str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
        File file = new File(new File(this.a.getApplicationInfo().dataDir, "shared_prefs"), String.valueOf(str2).concat(".xml"));
        if (file.exists()) {
            String valueOf2 = String.valueOf(str2);
            oso.a(valueOf2.length() == 0 ? new String("deleting old settings: ") : "deleting old settings: ".concat(valueOf2));
            file.delete();
            return;
        }
        String valueOf3 = String.valueOf(str2);
        oso.a(valueOf3.length() == 0 ? new String("Does not exist: ") : "Does not exist: ".concat(valueOf3));
    }

    public final out a(String str) {
        out out = (out) this.e.get(str);
        if (out != null) {
            return out;
        }
        out out2 = out.n;
        this.e.put(str, out2);
        return out2;
    }

    public final void a(String str, out out) {
        this.e.put(str, out);
    }
}
