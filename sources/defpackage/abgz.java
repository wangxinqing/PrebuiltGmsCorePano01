package defpackage;

import com.google.android.gms.people.identity.models.Person;
import java.util.Comparator;

/* renamed from: abgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgz implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Person.Emails) obj2).k() - ((Person.Emails) obj).k();
    }
}
