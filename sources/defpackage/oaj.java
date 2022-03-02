package defpackage;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: oaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oaj implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Collator.getInstance().compare(((Locale) obj).getDisplayCountry(), ((Locale) obj2).getDisplayCountry());
    }
}
