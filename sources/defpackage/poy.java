package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: poy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class poy implements Callable {
    private final pox a;

    public poy(SharedPreferences sharedPreferences, pni pni, String str, String[] strArr) {
        this.a = new pox(pni, sharedPreferences, str, strArr);
    }

    public final void a() {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean booleanValue = this.a.call().booleanValue();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (booleanValue) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("updated contacts [took ");
            sb.append(elapsedRealtime2);
            sb.append(" ms]");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 54);
        sb2.append("UpdateCorporaTask done [took ");
        sb2.append(elapsedRealtime2);
        sb2.append(" ms] ");
        sb2.append(str);
        pnz.a(sb2.toString());
    }

    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return null;
    }
}
