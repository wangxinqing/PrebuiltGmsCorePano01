package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ahjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjp {
    public final List a = new ArrayList(7);

    public final void a(aiah aiah) {
        if (!this.a.isEmpty()) {
            List list = this.a;
            if (aiah.e - ((aiah) list.get(list.size() - 1)).e < 55000) {
                return;
            }
        }
        int size = this.a.size();
        String valueOf = String.valueOf(aiah);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("Cell history(");
        sb.append(size);
        sb.append(") updated with: ");
        sb.append(valueOf);
        sb.toString();
        this.a.add(aiah);
        if (this.a.size() > 7) {
            this.a.remove(0);
        }
    }
}
