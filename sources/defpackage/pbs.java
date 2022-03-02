package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: pbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class pbs implements Runnable {
    private final int a;

    public pbs(int i) {
        this.a = i;
    }

    public final void run() {
        int i = this.a;
        pbx a2 = pbx.a();
        afgx afgx = new afgx((Context) a2.a.a(), awds.b(a2.d), awds.b(a2.e), awds.b(a2.c));
        SharedPreferences sharedPreferences = afgx.a.getSharedPreferences("MDH_shared_preferences", 0);
        if (i - sharedPreferences.getInt("wipeout_event_id", 0) > 0) {
            sharedPreferences.edit().putInt("wipeout_event_id", i).commit();
            try {
                aeqn aeqn = (aeqn) afgx.c.a();
                synchronized (aeqn.e) {
                    aeqn.a(0);
                }
            } catch (IOException e) {
                ((pdg) afgx.d.a()).a("Error during file wipeout", e);
            }
            ((afca) afgx.b.a()).a();
        }
    }
}
