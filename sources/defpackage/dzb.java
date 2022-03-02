package defpackage;

import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: dzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzb {
    public final int[] a;
    private final boolean b;
    private final boolean c;
    private final Comparator d = new dza(this);

    public dzb(String[] strArr, boolean z, boolean z2) {
        String[] a2 = eap.a(strArr);
        this.a = new int[]{a("google", a2), a("email", a2), a("phone", a2)};
        this.b = z;
        this.c = z2;
    }

    private static int a(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void a(List list) {
        if (awhs.b() && this.c) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    list.clear();
                    break;
                }
                int i2 = i + 1;
                if (((ContactPerson.ContactMethod) list.get(i)).a == 0) {
                    break;
                }
                i = i2;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i3 = ((ContactPerson.ContactMethod) it.next()).a;
            int[] iArr = this.a;
            int length = iArr.length;
            if (i3 >= length || iArr[i3] >= length) {
                it.remove();
            }
        }
        if (this.b) {
            Collections.sort(list, this.d);
        }
    }
}
