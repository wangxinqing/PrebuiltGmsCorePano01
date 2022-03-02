package defpackage;

import android.content.Intent;
import android.util.Pair;
import com.google.android.contextmanager.controller.EventHandler$AlarmSetter;

/* renamed from: bwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwk implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Intent b;
    final /* synthetic */ EventHandler$AlarmSetter c;

    public bwk(EventHandler$AlarmSetter eventHandler$AlarmSetter, int i, Intent intent) {
        this.c = eventHandler$AlarmSetter;
        this.a = i;
        this.b = intent;
    }

    public final void run() {
        Pair pair = (Pair) this.c.a.get(this.a);
        if (pair == null) {
            ((anih) ((anih) bxk.a.c()).a("bwk", "run", 603, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[EventHandler] Didn't find runnable for alarm id=%s, intent=%s", this.a, (Object) this.b);
            return;
        }
        Runnable runnable = (Runnable) pair.first;
        bvp bvp = (bvp) pair.second;
        if (!bvp.a.endsWith("-delayed")) {
            bvp.a = String.valueOf(bvp.a).concat("-delayed");
        }
        new Object[1][0] = bvp;
        long longExtra = this.b.getLongExtra("sessionId", -2147483648L);
        if (longExtra == this.c.c) {
            Object[] objArr = {Integer.valueOf(this.a), runnable};
            this.c.b.remove(runnable);
            cbi.C().c(bvp);
            this.c.a.remove(this.a);
            runnable.run();
        } else if (bxk.a(3)) {
            int intExtra = this.b.getIntExtra("alarmId", -1);
            long j = this.c.c;
            String valueOf = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 140);
            sb.append("Skipping alarm from previous session: alarmId=");
            sb.append(intExtra);
            sb.append(" intentSessionId=");
            sb.append(longExtra);
            sb.append(" currentSessionId=");
            sb.append(j);
            sb.append(" intent=");
            sb.append(valueOf);
            sb.toString();
        }
    }
}
