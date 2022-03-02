package defpackage;

import com.google.android.gms.family.v2.model.ContactPerson;
import java.util.Comparator;

/* renamed from: mmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mmn implements Comparator {
    static final Comparator a = new mmn();

    private mmn() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((ContactPerson) obj).a.compareTo(((ContactPerson) obj2).a);
    }
}
