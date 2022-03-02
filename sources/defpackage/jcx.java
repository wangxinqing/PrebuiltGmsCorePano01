package defpackage;

import android.util.Log;
import com.google.android.gms.common.stats.StatsEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: jcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jcx implements Runnable {
    final String a;
    final Object b;
    final /* synthetic */ jda c;

    public jcx(jda jda, String str, StatsEvent statsEvent, StatsEvent statsEvent2) {
        this.c = jda;
        this.a = str;
        this.b = statsEvent2.a(statsEvent);
    }

    public final void run() {
        jih jih;
        jda jda = this.c;
        String str = this.a;
        Object obj = this.b;
        synchronized (jda.g) {
            jih = (jih) jda.g.get(str);
            jkj jkj = new jkj(jda.d, str);
            if (jih == null || !jkj.exists()) {
                jih jih2 = new jih(jkj, jda.f.a, ((Long) jcg.f.c()).longValue(), TimeUnit.MILLISECONDS, ((Integer) jcg.g.c()).intValue());
                jih jih3 = (jih) jda.g.put(str, jih2);
                if (jih3 != null) {
                    try {
                        jih3.b();
                        jih3.close();
                    } catch (IOException e) {
                    }
                }
                jih = jih2;
            }
        }
        try {
            jih.append((CharSequence) obj.toString());
            jih.append((CharSequence) "\n");
        } catch (IOException e2) {
            Log.e("StatisticalEventTracker", "Failed to write event.", e2);
        }
    }

    public jcx(jda jda, String str, Object obj) {
        this.c = jda;
        this.a = str;
        this.b = obj;
    }
}
