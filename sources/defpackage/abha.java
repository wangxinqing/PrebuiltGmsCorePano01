package defpackage;

import com.google.android.gms.people.identity.models.Person;
import java.util.Comparator;

/* renamed from: abha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abha implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Person.PhoneNumbers) obj2).m() - ((Person.PhoneNumbers) obj).m();
    }
}
