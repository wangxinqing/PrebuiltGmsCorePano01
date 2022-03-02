package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ipa.appsindexer.IpaPackageBroadcastIntentOperation;
import java.util.HashSet;

/* renamed from: qnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class qnx implements Runnable {
    private final IpaPackageBroadcastIntentOperation a;
    private final String b;

    public qnx(IpaPackageBroadcastIntentOperation ipaPackageBroadcastIntentOperation, String str) {
        this.a = ipaPackageBroadcastIntentOperation;
        this.b = str;
    }

    public final void run() {
        IpaPackageBroadcastIntentOperation ipaPackageBroadcastIntentOperation = this.a;
        String str = this.b;
        qns a2 = qns.a((Context) ipaPackageBroadcastIntentOperation);
        if (a2 != null) {
            aucd o = ansz.k.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ansz) o.b).a = ansy.a(4);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (ComponentName componentName : a2.c.a()) {
                if (str.equals(componentName.getPackageName())) {
                    hashSet2.add(qnt.a(componentName));
                } else {
                    hashSet.add(componentName);
                }
            }
            int size = hashSet2.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ansz) o.b).d = size;
            acwa a3 = a2.b.a((String[]) hashSet2.toArray(new String[hashSet2.size()]));
            a3.a(qns.a(elapsedRealtime, (ansz) o.i(), 32));
            a3.a(qns.a(elapsedRealtime, (ansz) o.i()));
            a2.c.a(hashSet);
        }
    }
}
