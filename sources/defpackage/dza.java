package defpackage;

import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.Comparator;

/* renamed from: dza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dza implements Comparator {
    final /* synthetic */ dzb a;

    public dza(dzb dzb) {
        this.a = dzb;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = this.a.a;
        return iArr[((ContactPerson.ContactMethod) obj).a] - iArr[((ContactPerson.ContactMethod) obj2).a];
    }
}
