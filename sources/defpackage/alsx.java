package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: alsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alsx {
    public static final alsx a = new alsx(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    public final List b;
    public final List c;
    public final List d;

    public alsx(List list, List list2, List list3) {
        this.b = Collections.unmodifiableList(new ArrayList(list));
        this.c = Collections.unmodifiableList(new ArrayList(list2));
        this.d = Collections.unmodifiableList(new ArrayList(list3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alsx)) {
            return false;
        }
        alsx alsx = (alsx) obj;
        return alyr.a(this.b, alsx.b, this.c, alsx.c, this.d, alsx.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("UndoManagerState [undoStack=");
        sb.append(valueOf);
        sb.append(", redoStack=");
        sb.append(valueOf2);
        sb.append(", pendingBatchStack=");
        sb.append(valueOf3);
        sb.append("]");
        return sb.toString();
    }
}
