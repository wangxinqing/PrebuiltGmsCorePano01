package defpackage;

import android.content.ContentValues;
import java.util.Comparator;

/* renamed from: yrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrt implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ContentValues) obj).getAsString("display_name").compareTo(((ContentValues) obj2).getAsString("display_name"));
    }
}
