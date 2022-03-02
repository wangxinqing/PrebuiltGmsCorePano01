package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.Iterator;
import java.util.List;

/* renamed from: heq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class heq {
    private final heu a;

    public heq(heu heu) {
        this.a = heu;
    }

    public final void a(List list) {
        boolean z;
        heu heu = this.a;
        synchronized (heu.a) {
            Iterator it = list.iterator();
            z = false;
            while (it.hasNext()) {
                z |= heu.b.d((String) it.next());
            }
        }
        if (z) {
            hey.a(false);
            synchronized (heu.a) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    List<ResultReceiver> b = heu.b.b(str);
                    if (!b.isEmpty()) {
                        int size = b.size();
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                        sb.append("Staging ");
                        sb.append(str);
                        sb.append(" completed, notifying ");
                        sb.append(size);
                        sb.append(" receiver(s).");
                        sb.toString();
                        for (ResultReceiver send : b) {
                            send.send(0, (Bundle) null);
                        }
                    }
                }
                heu.a(false);
            }
        }
    }
}
