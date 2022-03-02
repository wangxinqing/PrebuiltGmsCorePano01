package defpackage;

import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import java.util.Comparator;

/* renamed from: aafl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aafl implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.valueOf(((AppIndexingErrorInfo) obj2).e).compareTo(Long.valueOf(((AppIndexingErrorInfo) obj).e));
    }
}
