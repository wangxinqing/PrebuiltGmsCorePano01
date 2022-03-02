package defpackage;

import com.google.android.gms.appinvite.model.ContactPerson;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: ean  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ean implements Comparator {
    final /* synthetic */ Collator a;

    public ean(Collator collator) {
        this.a = collator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.a.compare(eap.a((ContactPerson) obj), eap.a((ContactPerson) obj2));
    }
}
