package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: pwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwv {
    public static final long a = TimeUnit.MINUTES.toMillis(5);
    public final pwt b = new pwt();

    public final boolean a() {
        return this.b.size() == 0;
    }

    public final void b() {
        if (!a()) {
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            for (Map.Entry entry : this.b.entrySet()) {
                if (currentTimeMillis - ((pwu) entry.getValue()).a < a) {
                    break;
                }
                arrayList.add((String) entry.getKey());
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.b.remove((String) arrayList.get(i));
            }
        }
    }
}
