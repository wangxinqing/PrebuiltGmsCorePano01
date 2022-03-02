package defpackage;

import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import java.util.Comparator;

/* renamed from: aafn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aafn implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.valueOf(((AppIndexingUserActionInfo) obj2).b).compareTo(Long.valueOf(((AppIndexingUserActionInfo) obj).b));
    }
}
