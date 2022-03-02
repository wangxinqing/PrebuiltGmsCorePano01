package defpackage;

import java.util.ArrayList;

/* renamed from: jkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkh {
    public final ArrayList a = new ArrayList(4);

    public final void a(Object obj) {
        synchronized (this.a) {
            int size = this.a.size();
            int i = 0;
            while (i < size) {
                if (this.a.get(i) != obj) {
                    i++;
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Object released already: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (size < 4) {
                this.a.add(obj);
            }
        }
    }
}
