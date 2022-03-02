package defpackage;

import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.Arrays;

/* renamed from: dxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxl {
    public final ContactPerson a;
    public final ContactPerson.ContactMethod b;
    public final int c;

    public dxl(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod, int i) {
        this.a = contactPerson;
        this.b = contactMethod;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dxl dxl = (dxl) obj;
            return this.c == dxl.c && ius.a(this.a, dxl.a) && ius.a(this.b, dxl.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }
}
