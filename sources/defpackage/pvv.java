package defpackage;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: pvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvv implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Collator.getInstance().compare(((pvu) obj).a, ((pvu) obj2).a);
    }
}
